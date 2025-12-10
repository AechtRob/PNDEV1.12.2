package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSapeornis;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelSapeornis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer legRight;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer legRight2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer legRight3;
    private final AdvancedModelRenderer legRight4;
    private final AdvancedModelRenderer legLeft;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer legLeft2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer legLeft3;
    private final AdvancedModelRenderer legLeft4;
    private final AdvancedModelRenderer armLeft1;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tertialsLeftToHide;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer secondaryLeft;
    private final AdvancedModelRenderer secondaryLeftToHide1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer secondaryLeftToHide2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer secondaryLeft2;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer primaryLeft1;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer primaryLeft2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer primaryLeft3;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer PrimaryLeft4;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer PrimaryLeft5;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer PrimaryLeft6;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer PrimaryLeft7;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer armRight1;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tertialsRightToHide;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer secondaryRight;
    private final AdvancedModelRenderer secondaryRightToHide1;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer secondaryRightToHide2;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer secondaryRight2;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer primaryRight1;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer primaryRight2;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer primaryRight3;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer PrimaryRight4;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer PrimaryRight5;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer PrimaryRight6;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer PrimaryRight7;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer tailFanCenter;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer tailFanRight;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer tailFanLeft;
    private final AdvancedModelRenderer cube_r70;

    private ModelAnimator animator;

    public ModelSapeornis() {
        this.textureWidth = 112;
        this.textureHeight = 89;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 12.9223F, 0.9512F);
        this.setRotateAngle(hips, -0.2618F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -0.5847F, -2.6922F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 15, -5.0F, -2.0F, -1.4F, 6, 6, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.2883F, 3.5758F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9512F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 98, 80, -1.5F, -3.4F, -1.0F, 3, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 70, -1.5F, -2.4F, -3.0F, 3, 3, 6, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0F, -3.4F);
        this.hips.addChild(chest);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0436F, -4.6932F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 74, -2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.7436F, -1.2932F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 100, 77, -2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 1.4153F, 0.7078F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 62, -4.0F, 4.0F, -6.0F, 5, 1, 6, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 1.4153F, 0.7078F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 1, -4.0F, -2.0F, -6.5F, 5, 6, 7, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(1.0F, -0.3647F, -5.6257F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.2F, -1.0F);
        this.neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4974F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 57, 70, -3.0F, -3.1F, -1.5F, 4, 4, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 2.2F, -1.1F);
        this.neck1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.1956F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 74, -2.0F, -0.4F, -0.9F, 3, 2, 4, 0.02F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-1.0F, 0.1793F, -1.4645F);
        this.neck1.addChild(neck2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.9571F, -1.6928F);
        this.neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9861F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 78, -1.0F, -1.0F, -1.4F, 2, 2, 2, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.4043F, -0.5906F);
        this.neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8988F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 103, 30, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.2854F, -1.4873F);
        this.neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.1345F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 87, 74, -1.0F, -0.2F, -1.3F, 2, 1, 4, 0.011F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9503F, 0.4526F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9599F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 75, -1.5F, 0.4F, -0.6F, 3, 2, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.333F, -4.741F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0036F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 78, -1.0F, -3.3F, 3.3F, 2, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.9503F, 0.4526F);
        this.neck2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 87, 80, -1.5F, -0.6F, -1.6F, 3, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.7956F, -3.1727F);
        this.neck2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.829F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 85, 84, -1.0F, -0.2F, 0.5F, 2, 1, 1, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.0546F, -2.763F, -2.4277F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 51, 75, -1.1454F, -1.1133F, -1.6176F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 51, 75, 0.2545F, -1.1133F, -1.6176F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0546F, -1.3412F, 0.3372F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.8988F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 81, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0546F, -1.9412F, -0.3628F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0698F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 103, 11, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.3455F, -2.1412F, -1.6628F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9338F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 83, -1.0F, -1.0F, -1.0F, 1, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 103, 38, 0.8F, -1.0F, -1.0F, 1, 1, 0, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0546F, -0.7412F, -1.6628F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3665F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 103, 6, -1.0F, -2.0486F, -0.3833F, 2, 2, 2, 0.004F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0546F, 5.925F, -3.7894F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0175F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 103, 16, -1.0F, -7.5176F, 1.8407F, 2, 2, 2, 0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(-0.4455F, 5.925F, -3.7894F);
        this.head.addChild(upperjaw);
        this.setRotateAngle(upperjaw, 0.3491F, 0.0F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.9431F, -1.9964F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1484F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 106, 65, 0.0F, -4.91F, 4.303F, 1, 1, 1, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -2.1148F, -0.1862F);
        this.upperjaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1658F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 44, 81, 0.0F, -4.854F, 1.9341F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -0.7134F, -1.622F);
        this.upperjaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 80, -0.5F, -6.2591F, 1.8523F, 1, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0546F, 0.2832F, -0.4576F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 7.372F, -1.117F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3142F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 103, 21, 0.0F, -7.3743F, -0.5362F, 1, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 7.372F, -1.117F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 78, 81, 0.0F, -7.5578F, 0.8615F, 1, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.6F, -0.7646F, -1.1947F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.4625F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 80, 0.0F, -0.2F, -0.1F, 0, 1, 1, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 35, 78, -1.2F, -0.2F, -0.1F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.5626F, -0.4342F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3229F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 103, 34, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.007F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 0.6753F, -1.0703F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, 0.0873F, 0.0F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.7F, 0.1F);
        this.throat.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.7592F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 103, 26, -1.0F, 1.5732F, -0.667F, 2, 1, 2, -0.02F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 103, 1, -1.0F, 0.0732F, -0.667F, 2, 2, 2, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, -0.2997F, 0.1651F);
        this.throat.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3229F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 71, 81, 0.0F, 0.0515F, -0.6857F, 1, 1, 2, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -0.2997F, 0.1651F);
        this.throat.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.4102F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 29, 57, 1.0F, 0.9515F, -0.5857F, 0, 1, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(1.0F, -1.5793F, -1.6355F);
        this.neck2.addChild(neck3);


        this.legRight = new AdvancedModelRenderer(this);
        this.legRight.setRotationPoint(-1.9F, 0.3449F, -0.7742F);
        this.hips.addChild(legRight);
        this.setRotateAngle(legRight, 1.1345F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.4F, 1.2288F, -3.6537F);
        this.legRight.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.9599F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 93, 65, -1.1F, -2.8F, -1.1F, 2, 4, 4, 0.1F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 4.3749F, -10.6714F);
        this.legRight.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3491F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 62, -0.1F, -1.3602F, 7.2686F, 1, 2, 5, 0.0F, true));

        this.legRight2 = new AdvancedModelRenderer(this);
        this.legRight2.setRotationPoint(0.1F, 1.2903F, -4.3492F);
        this.legRight.addChild(legRight2);
        this.setRotateAngle(legRight2, 0.3054F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.1F, 4.4298F, -6.8671F);
        this.legRight2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4363F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 78, -0.3F, -8.2667F, 5.956F, 0, 7, 3, 0.0F, true));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 19, 78, -0.7F, -7.2667F, 3.956F, 2, 6, 2, 0.0F, true));

        this.legRight3 = new AdvancedModelRenderer(this);
        this.legRight3.setRotationPoint(0.0F, 4.9731F, -1.5224F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -1.789F, 0.0F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 62, 83, -0.3F, -0.0057F, -0.4636F, 1, 4, 1, 0.0F, true));
        this.legRight3.cubeList.add(new ModelBox(legRight3, 11, 80, -0.2F, -2.5057F, 0.2364F, 0, 4, 2, 0.0F, true));

        this.legRight4 = new AdvancedModelRenderer(this);
        this.legRight4.setRotationPoint(0.0F, 3.5231F, -0.0464F);
        this.legRight3.addChild(legRight4);
        this.setRotateAngle(legRight4, 0.6109F, 0.0F, 0.0F);
        this.legRight4.cubeList.add(new ModelBox(legRight4, 19, 70, -1.4F, 0.05F, -3.15F, 3, 1, 6, 0.0F, true));

        this.legLeft = new AdvancedModelRenderer(this);
        this.legLeft.setRotationPoint(1.9F, 0.3449F, -0.7742F);
        this.hips.addChild(legLeft);
        this.setRotateAngle(legLeft, 1.1345F, 0.0F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.4F, 1.2288F, -3.6537F);
        this.legLeft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.9599F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 93, 65, -0.9F, -2.8F, -1.1F, 2, 4, 4, 0.1F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 4.3749F, -10.6714F);
        this.legLeft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3491F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 23, 62, -0.9F, -1.3602F, 7.2686F, 1, 2, 5, 0.0F, false));

        this.legLeft2 = new AdvancedModelRenderer(this);
        this.legLeft2.setRotationPoint(-0.1F, 1.2903F, -4.3492F);
        this.legLeft.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.3054F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.1F, 4.4298F, -6.8671F);
        this.legLeft2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.4363F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 28, 78, 0.3F, -8.2667F, 5.956F, 0, 7, 3, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 19, 78, -1.3F, -7.2667F, 3.956F, 2, 6, 2, 0.0F, false));

        this.legLeft3 = new AdvancedModelRenderer(this);
        this.legLeft3.setRotationPoint(0.0F, 4.9731F, -1.5224F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -1.789F, 0.0F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 62, 83, -0.7F, -0.0057F, -0.4636F, 1, 4, 1, 0.0F, false));
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 11, 80, 0.2F, -2.5057F, 0.2364F, 0, 4, 2, 0.0F, false));

        this.legLeft4 = new AdvancedModelRenderer(this);
        this.legLeft4.setRotationPoint(0.0F, 3.5231F, -0.0464F);
        this.legLeft3.addChild(legLeft4);
        this.setRotateAngle(legLeft4, 0.6109F, 0.0F, 0.0F);
        this.legLeft4.cubeList.add(new ModelBox(legLeft4, 19, 70, -1.6F, 0.05F, -3.15F, 3, 1, 6, 0.0F, false));

        this.armLeft1 = new AdvancedModelRenderer(this);
        this.armLeft1.setRotationPoint(2.5927F, -1.6223F, -6.9705F);
        this.hips.addChild(armLeft1);
        this.setRotateAngle(armLeft1, 0.0956F, -0.7156F, 1.4095F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.8371F, -0.9F, -0.8553F);
        this.armLeft1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.8029F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 78, 28, -3.8F, -0.1F, -1.0F, 4, 2, 8, 0.0F, false));

        this.tertialsLeftToHide = new AdvancedModelRenderer(this);
        this.tertialsLeftToHide.setRotationPoint(0.8371F, -0.9F, -0.8553F);
        this.armLeft1.addChild(tertialsLeftToHide);



        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tertialsLeftToHide.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.8029F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 72, 55, -12.8F, 0.42F, -1.0F, 9, 1, 8, 0.0F, false));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(4.7942F, -0.7F, 4.7341F);
        this.armLeft1.addChild(armLeft2);
        this.setRotateAngle(armLeft2, 0.0F, 1.0036F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.1626F, -0.2F, -0.442F);
        this.armLeft2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.8465F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 57, -1.6974F, 0.5F, -1.1547F, 11, 1, 3, 0.0F, false));

        this.secondaryLeft = new AdvancedModelRenderer(this);
        this.secondaryLeft.setRotationPoint(0.1626F, -0.2F, -0.442F);
        this.armLeft2.addChild(secondaryLeft);


        this.secondaryLeftToHide1 = new AdvancedModelRenderer(this);
        this.secondaryLeftToHide1.setRotationPoint(0.2711F, 0.729F, 2.5482F);
        this.secondaryLeft.addChild(secondaryLeftToHide1);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.7F, 0.0F, 4.8F);
        this.secondaryLeftToHide1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.8465F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 10, 12, -2.5F, 0.011F, -4.5F, 5, 1, 10, 0.0F, false));

        this.secondaryLeftToHide2 = new AdvancedModelRenderer(this);
        this.secondaryLeftToHide2.setRotationPoint(7.3552F, 0.73F, -5.6572F);
        this.secondaryLeft.addChild(secondaryLeftToHide2);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-7.3552F, -0.73F, 5.6572F);
        this.secondaryLeftToHide2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.8465F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 42, 4.3026F, 0.73F, 1.8453F, 5, 1, 13, 0.0F, false));

        this.secondaryLeft2 = new AdvancedModelRenderer(this);
        this.secondaryLeft2.setRotationPoint(3.5681F, 0.0F, -1.0993F);
        this.secondaryLeft.addChild(secondaryLeft2);
        this.setRotateAngle(secondaryLeft2, 0.0F, -1.0036F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-3.5681F, 0.0F, 1.0993F);
        this.secondaryLeft2.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.8465F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 39, 26, -1.6974F, 0.72F, 1.8453F, 6, 0, 13, 0.0F, false));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(5.6809F, 0.8F, -6.2774F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 0.0F, -0.9163F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.7432F, 0.0F, -0.6978F);
        this.armLeft3.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.8029F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 24, -0.2462F, 0.1066F, 0.1934F, 2, 0, 10, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(4.6432F, 0.0F, 4.1022F);
        this.armLeft3.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.8639F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 17, 24, -1.4035F, 0.0259F, -5.4966F, 3, 0, 11, 0.0F, false));

        this.primaryLeft1 = new AdvancedModelRenderer(this);
        this.primaryLeft1.setRotationPoint(2.3432F, 0.0518F, 3.0998F);
        this.armLeft3.addChild(primaryLeft1);
        this.setRotateAngle(primaryLeft1, 0.0F, 0.2182F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.7646F, 0.0F, 8.592F);
        this.primaryLeft1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.4974F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, -14, 24, 0.7F, -0.1218F, -7.2F, 4, 0, 15, 0.0F, false));

        this.primaryLeft2 = new AdvancedModelRenderer(this);
        this.primaryLeft2.setRotationPoint(5.1618F, 0.0F, 5.9446F);
        this.armLeft3.addChild(primaryLeft2);
        this.setRotateAngle(primaryLeft2, 0.0F, 0.2618F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.7646F, 0.0F, 8.592F);
        this.primaryLeft2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.4974F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, -5, 24, 0.7F, -0.06F, -7.2F, 4, 0, 15, 0.0F, false));

        this.primaryLeft3 = new AdvancedModelRenderer(this);
        this.primaryLeft3.setRotationPoint(6.2966F, 0.0F, 6.5812F);
        this.armLeft3.addChild(primaryLeft3);
        this.setRotateAngle(primaryLeft3, 0.0F, 0.2094F, 0.0F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0969F, 0.0F, 7.5806F);
        this.primaryLeft3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.4974F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 13, 39, -1.3F, -0.05F, -7.2F, 4, 0, 15, 0.0F, false));

        this.PrimaryLeft4 = new AdvancedModelRenderer(this);
        this.PrimaryLeft4.setRotationPoint(7.6992F, 0.0F, 7.0861F);
        this.armLeft3.addChild(PrimaryLeft4);
        this.setRotateAngle(PrimaryLeft4, 0.0F, 0.1658F, 0.0F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.3301F, 0.0F, 8.256F);
        this.PrimaryLeft4.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.4974F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -14, 40, 0.3F, -0.04F, -7.2F, 4, 0, 15, 0.0F, false));

        this.PrimaryLeft5 = new AdvancedModelRenderer(this);
        this.PrimaryLeft5.setRotationPoint(8.7995F, 0.0F, 7.005F);
        this.armLeft3.addChild(PrimaryLeft5);
        this.setRotateAngle(PrimaryLeft5, 0.0F, 0.1222F, 0.0F);


        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.2816F, 0.0F, 8.2861F);
        this.PrimaryLeft5.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.4974F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 39, 10, 0.3F, -0.03F, -7.2F, 4, 0, 15, 0.0F, false));

        this.PrimaryLeft6 = new AdvancedModelRenderer(this);
        this.PrimaryLeft6.setRotationPoint(8.6458F, 0.0F, 6.8901F);
        this.armLeft3.addChild(PrimaryLeft6);
        this.setRotateAngle(PrimaryLeft6, 0.0F, 0.1222F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0849F, 0.0F, 7.5168F);
        this.PrimaryLeft6.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.4974F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 4, 24, -1.3F, -0.02F, -7.2F, 4, 0, 15, 0.0F, false));

        this.PrimaryLeft7 = new AdvancedModelRenderer(this);
        this.PrimaryLeft7.setRotationPoint(8.7629F, 0.0F, 6.8852F);
        this.armLeft3.addChild(PrimaryLeft7);
        this.setRotateAngle(PrimaryLeft7, 0.0F, 0.1309F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(2.1221F, 0.0F, 7.8103F);
        this.PrimaryLeft7.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.4974F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, -14, 8, -2.1F, -0.01F, -8.0F, 4, 0, 15, 0.0F, false));

        this.armRight1 = new AdvancedModelRenderer(this);
        this.armRight1.setRotationPoint(-2.5927F, -1.6223F, -6.9705F);
        this.hips.addChild(armRight1);
        this.setRotateAngle(armRight1, 0.0956F, 0.7156F, -1.4095F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.8371F, -0.9F, -0.8553F);
        this.armRight1.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.8029F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 78, 28, -0.2F, -0.1F, -1.0F, 4, 2, 8, 0.0F, true));

        this.tertialsRightToHide = new AdvancedModelRenderer(this);
        this.tertialsRightToHide.setRotationPoint(-0.8371F, -0.9F, -0.8553F);
        this.armRight1.addChild(tertialsRightToHide);


        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tertialsRightToHide.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, -0.8029F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 72, 55, 3.8F, 0.42F, -1.0F, 9, 1, 8, 0.0F, true));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-4.7942F, -0.7F, 4.7341F);
        this.armRight1.addChild(armRight2);
        this.setRotateAngle(armRight2, 0.0F, -1.0036F, 0.0F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.1626F, -0.2F, -0.442F);
        this.armRight2.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.8465F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 57, -9.3026F, 0.5F, -1.1547F, 11, 1, 3, 0.0F, true));

        this.secondaryRight = new AdvancedModelRenderer(this);
        this.secondaryRight.setRotationPoint(-0.1626F, -0.2F, -0.442F);
        this.armRight2.addChild(secondaryRight);


        this.secondaryRightToHide1 = new AdvancedModelRenderer(this);
        this.secondaryRightToHide1.setRotationPoint(-0.2711F, 0.729F, 2.5482F);
        this.secondaryRight.addChild(secondaryRightToHide1);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.7F, 0.0F, 4.8F);
        this.secondaryRightToHide1.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.8465F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 10, 12, -2.5F, 0.011F, -4.5F, 5, 1, 10, 0.0F, true));

        this.secondaryRightToHide2 = new AdvancedModelRenderer(this);
        this.secondaryRightToHide2.setRotationPoint(-7.3552F, 0.73F, -5.6572F);
        this.secondaryRight.addChild(secondaryRightToHide2);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(7.3552F, -0.73F, 5.6572F);
        this.secondaryRightToHide2.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.8465F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 42, -9.3026F, 0.73F, 1.8453F, 5, 1, 13, 0.0F, true));

        this.secondaryRight2 = new AdvancedModelRenderer(this);
        this.secondaryRight2.setRotationPoint(-3.5681F, 0.0F, -1.0993F);
        this.secondaryRight.addChild(secondaryRight2);
        this.setRotateAngle(secondaryRight2, 0.0F, 1.0036F, 0.0F);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(3.5681F, 0.0F, 1.0993F);
        this.secondaryRight2.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.8465F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 39, 26, -4.3026F, 0.72F, 1.8453F, 6, 0, 13, 0.0F, true));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-5.6809F, 0.8F, -6.2774F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 0.0F, 0.9163F, 0.0F);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.7432F, 0.0F, -0.6978F);
        this.armRight3.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.8029F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 25, 24, -1.7538F, 0.1066F, 0.1934F, 2, 0, 10, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-4.6432F, 0.0F, 4.1022F);
        this.armRight3.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.8639F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 17, 24, -1.5965F, 0.0259F, -5.4966F, 3, 0, 11, 0.0F, true));

        this.primaryRight1 = new AdvancedModelRenderer(this);
        this.primaryRight1.setRotationPoint(-2.3432F, 0.0518F, 3.0998F);
        this.armRight3.addChild(primaryRight1);
        this.setRotateAngle(primaryRight1, 0.0F, -0.2182F, 0.0F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.7646F, 0.0F, 8.592F);
        this.primaryRight1.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.4974F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, -14, 24, -4.7F, -0.1218F, -7.2F, 4, 0, 15, 0.0F, true));

        this.primaryRight2 = new AdvancedModelRenderer(this);
        this.primaryRight2.setRotationPoint(-5.1618F, 0.0F, 5.9446F);
        this.armRight3.addChild(primaryRight2);
        this.setRotateAngle(primaryRight2, 0.0F, -0.2618F, 0.0F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.7646F, 0.0F, 8.592F);
        this.primaryRight2.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.4974F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, -5, 24, -4.7F, -0.06F, -7.2F, 4, 0, 15, 0.0F, true));

        this.primaryRight3 = new AdvancedModelRenderer(this);
        this.primaryRight3.setRotationPoint(-6.2966F, 0.0F, 6.5812F);
        this.armRight3.addChild(primaryRight3);
        this.setRotateAngle(primaryRight3, 0.0F, -0.2094F, 0.0F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.0969F, 0.0F, 7.5806F);
        this.primaryRight3.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, -0.4974F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 13, 39, -2.7F, -0.05F, -7.2F, 4, 0, 15, 0.0F, true));

        this.PrimaryRight4 = new AdvancedModelRenderer(this);
        this.PrimaryRight4.setRotationPoint(-7.6992F, 0.0F, 7.0861F);
        this.armRight3.addChild(PrimaryRight4);
        this.setRotateAngle(PrimaryRight4, 0.0F, -0.1658F, 0.0F);


        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.3301F, 0.0F, 8.256F);
        this.PrimaryRight4.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.4974F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, -14, 40, -4.3F, -0.04F, -7.2F, 4, 0, 15, 0.0F, true));

        this.PrimaryRight5 = new AdvancedModelRenderer(this);
        this.PrimaryRight5.setRotationPoint(-8.7995F, 0.0F, 7.005F);
        this.armRight3.addChild(PrimaryRight5);
        this.setRotateAngle(PrimaryRight5, 0.0F, -0.1222F, 0.0F);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.2816F, 0.0F, 8.2861F);
        this.PrimaryRight5.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, -0.4974F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 39, 10, -4.3F, -0.03F, -7.2F, 4, 0, 15, 0.0F, true));

        this.PrimaryRight6 = new AdvancedModelRenderer(this);
        this.PrimaryRight6.setRotationPoint(-8.6458F, 0.0F, 6.8901F);
        this.armRight3.addChild(PrimaryRight6);
        this.setRotateAngle(PrimaryRight6, 0.0F, -0.1222F, 0.0F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.0849F, 0.0F, 7.5168F);
        this.PrimaryRight6.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, -0.4974F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 4, 24, -2.7F, -0.02F, -7.2F, 4, 0, 15, 0.0F, true));

        this.PrimaryRight7 = new AdvancedModelRenderer(this);
        this.PrimaryRight7.setRotationPoint(-8.7629F, 0.0F, 6.8852F);
        this.armRight3.addChild(PrimaryRight7);
        this.setRotateAngle(PrimaryRight7, 0.0F, -0.1309F, 0.0F);


        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-2.1221F, 0.0F, 7.8103F);
        this.PrimaryRight7.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, -0.4974F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, -14, 8, -1.9F, -0.01F, -8.0F, 4, 0, 15, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.409F, 1.8563F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);


        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, -0.661F, 1.569F);
        this.tail.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0873F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 38, 70, -2.0F, -0.5419F, 1.4205F, 5, 0, 4, 0.0F, false));
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 72, 65, -1.5F, -0.7F, -2.5F, 4, 2, 6, 0.0F, false));

        this.tailFanCenter = new AdvancedModelRenderer(this);
        this.tailFanCenter.setRotationPoint(0.0F, -0.0061F, 3.6137F);
        this.tail.addChild(tailFanCenter);


        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.0F, -0.3F, 1.3F);
        this.tailFanCenter.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0436F, 0.0F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 39, 40, -2.0F, -0.0581F, -0.1857F, 4, 0, 14, 0.0F, false));

        this.tailFanRight = new AdvancedModelRenderer(this);
        this.tailFanRight.setRotationPoint(-1.1F, -1.0313F, 4.2339F);
        this.tail.addChild(tailFanRight);


        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.6F, -1.2F, -0.6F);
        this.tailFanRight.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0118F, -0.0669F, -0.277F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 37, 55, -2.2786F, 0.9745F, 0.6348F, 3, 0, 14, 0.0F, false));

        this.tailFanLeft = new AdvancedModelRenderer(this);
        this.tailFanLeft.setRotationPoint(1.1F, -1.0313F, 4.2339F);
        this.tail.addChild(tailFanLeft);


        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.6F, -1.2F, -0.6F);
        this.tailFanLeft.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0118F, 0.0669F, 0.277F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 76, 40, -0.7215F, 0.9745F, 0.6348F, 3, 0, 14, 0.0F, false));

        this.tertialsLeftToHide.scaleChildren = true;
        this.tertialsRightToHide.scaleChildren = true;
        this.secondaryRightToHide1.scaleChildren = true;
        this.secondaryRightToHide2.scaleChildren = true;
        this.secondaryLeftToHide1.scaleChildren = true;
        this.secondaryLeftToHide2.scaleChildren = true;

        this.tertialsRightToHide.setScale((float)1,(float)0,(float)0);
        this.tertialsLeftToHide.setScale((float)1,(float)0,(float)0);
        this.secondaryRightToHide1.setScale((float)1,(float)0,(float)0);
        this.secondaryRightToHide2.setScale((float)1,(float)0,(float)0);
        this.secondaryLeftToHide1.setScale((float)1,(float)0,(float)0);
        this.secondaryLeftToHide2.setScale((float)1,(float)0,(float)0);


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.hips.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.hips.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.5F;
        this.hips.offsetX = 0.2F;
        this.hips.rotateAngleY = (float)Math.toRadians(125);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 1.5F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 8, neck1);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 8, neck3);
            this.faceTarget(f3, f4, 4, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck1);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 12, neck3);
            this.faceTarget(f3, f4, 8, head);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSapeornis ee = (EntityPrehistoricFloraSapeornis) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.tertialsLeftToHide.setScale((float)1,(float)1,(float)1);
            this.tertialsRightToHide.setScale((float)1,(float)1,(float)1);
            this.secondaryRightToHide1.setScale((float)1,(float)1,(float)1);
            this.secondaryRightToHide2.setScale((float)1,(float)1,(float)1);
            this.secondaryLeftToHide1.setScale((float)1,(float)1,(float)1);
            this.secondaryLeftToHide2.setScale((float)1,(float)1,(float)1);

            //And now the pose:

            this.setRotateAngle(armLeft1, 0.0F, 0.5672F, 0.0F);
            this.setRotateAngle(armLeft2, 0.0F, -1.2217F, 0.0F);
            this.setRotateAngle(armLeft3, 0.0F, 1.3963F, 0.0F);
            this.setRotateAngle(armRight1, 0.0F, -0.5672F, 0.0F);
            this.setRotateAngle(armRight2, 0.0F, 1.2217F, 0.0F);
            this.setRotateAngle(armRight3, 0.0F, -1.3963F, 0.0F);
            this.setRotateAngle(secondaryLeft2, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(secondaryRight2, -0.0F, 0.0F, 0.0F);
            this.setRotateAngle(head, -0.7374F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(legLeft, 1.7453F, 0.0F, 0.0F);
            this.setRotateAngle(legLeft2, 0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(legLeft3, -1.2654F, 0.0052F, -0.0166F);
            this.setRotateAngle(legLeft4, 1.6144F, 0.0F, 0.0F);
            this.setRotateAngle(legRight, 1.7453F, 0.0F, 0.0F);
            this.setRotateAngle(legRight2, 0.6109F, 0.0F, 0.0F);
            this.setRotateAngle(legRight3, -1.2654F, -0.0052F, 0.0166F);
            this.setRotateAngle(legRight4, 1.6144F, 0.0F, 0.0F);
            this.setRotateAngle(neck1, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, 0.3883F, 0.0F, 0.0F);
            this.setRotateAngle(hips, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(primaryLeft1, 0.0F, -1.2654F, 0.0F);
            this.setRotateAngle(primaryLeft2, 0.0F, -1.2654F, 0.0F);
            this.setRotateAngle(primaryLeft3, 0.0F, -1.0559F, 0.0F);
            this.setRotateAngle(PrimaryLeft4, 0.0F, -0.8378F, 0.0F);
            this.setRotateAngle(PrimaryLeft5, 0.0F, -0.576F, 0.0F);
            this.setRotateAngle(PrimaryLeft6, 0.0F, -0.2269F, 0.0F);
            this.setRotateAngle(PrimaryLeft7, 0.0F, 0.1309F, 0.0F);
            this.setRotateAngle(primaryRight1, 0.0F, 1.2654F, 0.0F);
            this.setRotateAngle(primaryRight2, 0.0F, 1.2654F, 0.0F);
            this.setRotateAngle(primaryRight3, 0.0F, 1.0559F, 0.0F);
            this.setRotateAngle(PrimaryRight4, 0.0F, 0.8378F, 0.0F);
            this.setRotateAngle(PrimaryRight5, 0.0F, 0.576F, 0.0F);
            this.setRotateAngle(PrimaryRight6, 0.0F, 0.2269F, 0.0F);
            this.setRotateAngle(PrimaryRight7, 0.0F, -0.1309F, 0.0F);
            this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(throat, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(upperjaw, 0.3491F, 0.0F, 0.0F);



        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that

                this.tertialsRightToHide.setScale((float)1,(float)0,(float)0);
                this.tertialsLeftToHide.setScale((float)1,(float)0,(float)0);
                this.secondaryRightToHide1.setScale((float)1,(float)0,(float)0);
                this.secondaryRightToHide2.setScale((float)1,(float)0,(float)0);
                this.secondaryLeftToHide1.setScale((float)1,(float)0,(float)0);
                this.secondaryLeftToHide2.setScale((float)1,(float)0,(float)0);

            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) {

        } else {

        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSapeornis entity = (EntityPrehistoricFloraSapeornis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 18.5 + (((tickAnim - 10) / 10) * (0-(18.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 5) / 3) * (19-(13.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19 + (((tickAnim - 8) / 2) * (3.25-(19)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 10) / 10) * (0-(3.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (23.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 23.75 + (((tickAnim - 8) / 2) * (0-(23.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSapeornis entity = (EntityPrehistoricFloraSapeornis) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 13.5 + (((tickAnim - 8) / 8) * (19.25-(13.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 19.25 + (((tickAnim - 16) / 9) * (0-(19.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 8) / 8) * (-15.25-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -15.25 + (((tickAnim - 16) / 9) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -1.25 + (((tickAnim - 8) / 8) * (-5.75-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -5.75 + (((tickAnim - 16) / 9) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 25 + (((tickAnim - 8) / 8) * (43-(25)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 43 + (((tickAnim - 16) / 9) * (0-(43)));
            yy = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSapeornis entity = (EntityPrehistoricFloraSapeornis) entitylivingbaseIn;
        int animCycle = 150;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.tertialsLeftToHide.setScale((float)1,(float)1,(float)1);
        this.tertialsRightToHide.setScale((float)1,(float)1,(float)1);
        this.secondaryRightToHide1.setScale((float)1,(float)1,(float)1);
        this.secondaryRightToHide2.setScale((float)1,(float)1,(float)1);
        this.secondaryLeftToHide1.setScale((float)1,(float)1,(float)1);
        this.secondaryLeftToHide2.setScale((float)1,(float)1,(float)1);

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1)));
            yy = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1)));
        }
        else if (tickAnim >= 120 && tickAnim < 150) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1 + (((tickAnim - 120) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-1)));
            yy = 0 + (((tickAnim - 120) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-0.5)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-120))*0.7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4 + (((tickAnim - 0) / 25) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4 + (((tickAnim - 25) / 31) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4)));
            yy = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 31) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4 + (((tickAnim - 120) / 25) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-4)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4 + (((tickAnim - 0) / 25) * (7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4-(7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4 + (((tickAnim - 25) / 31) * (0-(7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4)));
            yy = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 31) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4 + (((tickAnim - 120) / 25) * (7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4-(7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-230))*4)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0.075 + (((tickAnim - 0) / 25) * (-0.075-(-0.075)));
            yy = 0.275 + (((tickAnim - 0) / 25) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 120) {
            xx = -0.075 + (((tickAnim - 25) / 95) * (-0.075-(-0.075)));
            yy = 0.275 + (((tickAnim - 25) / 95) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 25) / 95) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = -0.075 + (((tickAnim - 120) / 25) * (-0.075-(-0.075)));
            yy = 0.275 + (((tickAnim - 120) / 25) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4 + (((tickAnim - 0) / 25) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4 + (((tickAnim - 25) / 31) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4)));
            yy = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 31) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4 + (((tickAnim - 120) / 25) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-4)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 11 + (((tickAnim - 0) / 25) * (11-(11)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 120) {
            xx = 11 + (((tickAnim - 25) / 95) * (11-(11)));
            yy = 0 + (((tickAnim - 25) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 95) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 11 + (((tickAnim - 120) / 25) * (11-(11)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 25) * (-0.125-(-0.125)));
            zz = 0.6 + (((tickAnim - 0) / 25) * (0.6-(0.6)));
        }
        else if (tickAnim >= 25 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 25) / 95) * (0-(0)));
            yy = -0.125 + (((tickAnim - 25) / 95) * (-0.125-(-0.125)));
            zz = 0.6 + (((tickAnim - 25) / 95) * (0.6-(0.6)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            yy = -0.125 + (((tickAnim - 120) / 25) * (-0.125-(-0.125)));
            zz = 0.6 + (((tickAnim - 120) / 25) * (0.6-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35 + (((tickAnim - 25) / 31) * (1.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 1.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1-(1.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(xx), armRight1.rotateAngleY + (float) Math.toRadians(yy), armRight1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 25) / 31) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armRight1.rotationPointX = this.armRight1.rotationPointX + (float)(xx);
        this.armRight1.rotationPointY = this.armRight1.rotationPointY - (float)(yy);
        this.armRight1.rotationPointZ = this.armRight1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(xx), armRight3.rotateAngleY + (float) Math.toRadians(yy), armRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight1, primaryRight1.rotateAngleX + (float) Math.toRadians(xx), primaryRight1.rotateAngleY + (float) Math.toRadians(yy), primaryRight1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight2, primaryRight2.rotateAngleX + (float) Math.toRadians(xx), primaryRight2.rotateAngleY + (float) Math.toRadians(yy), primaryRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryRight3, primaryRight3.rotateAngleX + (float) Math.toRadians(xx), primaryRight3.rotateAngleY + (float) Math.toRadians(yy), primaryRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryRight4, PrimaryRight4.rotateAngleX + (float) Math.toRadians(xx), PrimaryRight4.rotateAngleY + (float) Math.toRadians(yy), PrimaryRight4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryRight5, PrimaryRight5.rotateAngleX + (float) Math.toRadians(xx), PrimaryRight5.rotateAngleY + (float) Math.toRadians(yy), PrimaryRight5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryRight6, PrimaryRight6.rotateAngleX + (float) Math.toRadians(xx), PrimaryRight6.rotateAngleY + (float) Math.toRadians(yy), PrimaryRight6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryRight7, PrimaryRight7.rotateAngleX + (float) Math.toRadians(xx), PrimaryRight7.rotateAngleY + (float) Math.toRadians(yy), PrimaryRight7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35 + (((tickAnim - 25) / 31) * (0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1-(0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*-1)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*30)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(xx), armLeft1.rotateAngleY + (float) Math.toRadians(yy), armLeft1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 25) / 31) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-0.5)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armLeft1.rotationPointX = this.armLeft1.rotationPointX + (float)(xx);
        this.armLeft1.rotationPointY = this.armLeft1.rotationPointY - (float)(yy);
        this.armLeft1.rotationPointZ = this.armLeft1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(xx), armLeft3.rotateAngleY + (float) Math.toRadians(yy), armLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft1, primaryLeft1.rotateAngleX + (float) Math.toRadians(xx), primaryLeft1.rotateAngleY + (float) Math.toRadians(yy), primaryLeft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-450))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-160))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft2, primaryLeft2.rotateAngleX + (float) Math.toRadians(xx), primaryLeft2.rotateAngleY + (float) Math.toRadians(yy), primaryLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-400))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*-10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(primaryLeft3, primaryLeft3.rotateAngleX + (float) Math.toRadians(xx), primaryLeft3.rotateAngleY + (float) Math.toRadians(yy), primaryLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-350))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-320))*-5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-280))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryLeft4, PrimaryLeft4.rotateAngleX + (float) Math.toRadians(xx), PrimaryLeft4.rotateAngleY + (float) Math.toRadians(yy), PrimaryLeft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-300))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*10)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-220))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-180))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryLeft5, PrimaryLeft5.rotateAngleX + (float) Math.toRadians(xx), PrimaryLeft5.rotateAngleY + (float) Math.toRadians(yy), PrimaryLeft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-250))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*15)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-200))*-20)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-30))*-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryLeft6, PrimaryLeft6.rotateAngleX + (float) Math.toRadians(xx), PrimaryLeft6.rotateAngleY + (float) Math.toRadians(yy), PrimaryLeft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 34) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*380-150))*-1)));
            yy = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-350))*20)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-190))*-25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-300))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(PrimaryLeft7, PrimaryLeft7.rotateAngleX + (float) Math.toRadians(xx), PrimaryLeft7.rotateAngleY + (float) Math.toRadians(yy), PrimaryLeft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4 + (((tickAnim - 0) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 56) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4 + (((tickAnim - 25) / 31) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4)));
            yy = 0 + (((tickAnim - 25) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 31) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 34) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1 + (((tickAnim - 56) / 34) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1 + (((tickAnim - 90) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200-150))*1)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4 + (((tickAnim - 120) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-150))*-4)));
            yy = 0 + (((tickAnim - 120) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSapeornis entity = (EntityPrehistoricFloraSapeornis) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75))*1), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-10))*-0.1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-90))*-0.45);


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-250))*1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-90))*-0.1);


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-300))*-3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-350))*3), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-400))*-1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13.75 + (((tickAnim - 0) / 13) * (-6.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -6.75 + (((tickAnim - 13) / 12) * (13.75-(-6.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 0) / 13) * (-30.75-(21)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -30.75 + (((tickAnim - 13) / 12) * (21-(-30.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.75 + (((tickAnim - 0) / 5) * (-49.33-(2.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -49.33 + (((tickAnim - 5) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -43.83 + (((tickAnim - 8) / 5) * (9.75-(-43.83)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 9.75 + (((tickAnim - 13) / 12) * (2.75-(9.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 24.25 + (((tickAnim - 0) / 5) * (63.19-(24.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 63.19 + (((tickAnim - 5) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 76.69 + (((tickAnim - 8) / 5) * (29.5-(76.69)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 29.5 + (((tickAnim - 13) / 4) * (5.5-(29.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 5.5 + (((tickAnim - 17) / 4) * (-5.87-(5.5)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -5.87 + (((tickAnim - 21) / 4) * (24.25-(-5.87)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight4, legRight4.rotateAngleX + (float) Math.toRadians(xx), legRight4.rotateAngleY + (float) Math.toRadians(yy), legRight4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 3) * (1.64-(0.6)));
            zz = 0.275 + (((tickAnim - 0) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.64 + (((tickAnim - 3) / 2) * (1.075-(1.64)));
            zz = 0.11 + (((tickAnim - 3) / 2) * (0-(0.11)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 5) / 3) * (0-(1.075)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.475-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (1.05-(0)));
            zz = -0.475 + (((tickAnim - 13) / 1) * (-0.25-(-0.475)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 14) / 3) * (1.25-(1.05)));
            zz = -0.25 + (((tickAnim - 14) / 3) * (-0.135-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 17) / 4) * (0.475-(1.25)));
            zz = -0.135 + (((tickAnim - 17) / 4) * (0-(-0.135)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 21) / 4) * (0.6-(0.475)));
            zz = 0 + (((tickAnim - 21) / 4) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight4.rotationPointX = this.legRight4.rotationPointX + (float)(xx);
        this.legRight4.rotationPointY = this.legRight4.rotationPointY - (float)(yy);
        this.legRight4.rotationPointZ = this.legRight4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -6.75 + (((tickAnim - 0) / 13) * (13.75-(-6.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 13.75 + (((tickAnim - 13) / 12) * (-6.75-(13.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30.75 + (((tickAnim - 0) / 13) * (21-(-30.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 21 + (((tickAnim - 13) / 12) * (-30.75-(21)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 0) / 13) * (2.75-(9.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.75 + (((tickAnim - 13) / 5) * (-49.33-(2.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -49.33 + (((tickAnim - 18) / 3) * (-43.83-(-49.33)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -43.83 + (((tickAnim - 21) / 4) * (9.75-(-43.83)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 29.5 + (((tickAnim - 0) / 4) * (5.5-(29.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 4) / 4) * (-5.87-(5.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5.87 + (((tickAnim - 8) / 5) * (24.25-(-5.87)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 24.25 + (((tickAnim - 13) / 5) * (63.19-(24.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 63.19 + (((tickAnim - 18) / 3) * (76.69-(63.19)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 76.69 + (((tickAnim - 21) / 4) * (29.5-(76.69)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft4, legLeft4.rotateAngleX + (float) Math.toRadians(xx), legLeft4.rotateAngleY + (float) Math.toRadians(yy), legLeft4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.05-(0)));
            zz = -0.475 + (((tickAnim - 0) / 2) * (-0.25-(-0.475)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 2) / 2) * (1.25-(1.05)));
            zz = -0.25 + (((tickAnim - 2) / 2) * (-0.135-(-0.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 4) / 4) * (0.475-(1.25)));
            zz = -0.135 + (((tickAnim - 4) / 4) * (0-(-0.135)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 5) * (0.6-(0.475)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 3) * (1.64-(0.6)));
            zz = 0.275 + (((tickAnim - 13) / 3) * (0.11-(0.275)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.64 + (((tickAnim - 16) / 2) * (1.075-(1.64)));
            zz = 0.11 + (((tickAnim - 16) / 2) * (0-(0.11)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 18) / 3) * (0-(1.075)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (-0.475-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft4.rotationPointX = this.legLeft4.rotationPointX + (float)(xx);
        this.legLeft4.rotationPointY = this.legLeft4.rotationPointY - (float)(yy);
        this.legLeft4.rotationPointZ = this.legLeft4.rotationPointZ + (float)(zz);



        this.setRotateAngle(armLeft1, armLeft1.rotateAngleX + (float) Math.toRadians(0), armLeft1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-350))*-0.5), armLeft1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armRight1, armRight1.rotateAngleX + (float) Math.toRadians(0), armRight1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-350))*0.5), armRight1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/0.75-250))*2), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSapeornis e = (EntityPrehistoricFloraSapeornis) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(armLeft1, ((0.0F)-(0.0956F)), ((0.5672F)-(-0.7156F)),((0.0F)-(1.4095F)));
        animator.rotate(armLeft2, ((0.0F)-(0.0F)), ((-1.2217F)-(1.0036F)),((0.0F)-(0.0F)));
        animator.rotate(armLeft3, ((0.0F)-(0.0F)), ((1.3963F)-(-0.9163F)),((0.0F)-(0.0F)));
        animator.rotate(armRight1, ((0.0F)-(0.0956F)), ((-0.5672F)-(0.7156F)),((0.0F)-(-1.4095F)));
        animator.rotate(armRight2, ((0.0F)-(0.0F)), ((1.2217F)-(-1.0036F)),((0.0F)-(0.0F)));
        animator.rotate(armRight3, ((0.0F)-(0.0F)), ((-1.3963F)-(0.9163F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r1, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r10, ((-0.8988F)-(-0.8988F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r11, ((-1.1345F)-(-1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r12, ((-0.9599F)-(-0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r13, ((-1.0036F)-(-1.0036F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r14, ((-0.7854F)-(-0.7854F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r15, ((-0.829F)-(-0.829F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r16, ((-0.8988F)-(-0.8988F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r17, ((-0.0698F)-(-0.0698F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r18, ((0.9338F)-(0.9338F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r19, ((0.3665F)-(0.3665F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r2, ((0.9512F)-(0.9512F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r20, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r21, ((0.1484F)-(0.1484F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r22, ((-0.1658F)-(-0.1658F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r23, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r24, ((0.3142F)-(0.3142F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r25, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r26, ((-0.4625F)-(-0.4625F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r27, ((0.3229F)-(0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r28, ((0.7592F)-(0.7592F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r29, ((-0.3229F)-(-0.3229F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r3, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r30, ((-0.4102F)-(-0.4102F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r31, ((-0.9599F)-(-0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r32, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r33, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r34, ((-0.9599F)-(-0.9599F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r35, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r36, ((-0.4363F)-(-0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r37, ((0.0F)-(0.0F)), ((-0.8029F)-(0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r38, ((0.0F)-(0.0F)), ((-0.8029F)-(0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r39, ((0.0F)-(0.0F)), ((-0.8465F)-(0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r4, ((0.1309F)-(0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r40, ((0.0F)-(0.0F)), ((-0.8465F)-(0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r41, ((0.0F)-(0.0F)), ((-0.8465F)-(0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r42, ((0.0F)-(0.0F)), ((-0.8465F)-(0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r43, ((0.0F)-(0.0F)), ((-0.8029F)-(0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r44, ((0.0F)-(0.0F)), ((-0.8639F)-(0.8639F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r45, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r46, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r47, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r48, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r49, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r5, ((-0.2182F)-(-0.2182F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r50, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r51, ((0.0F)-(0.0F)), ((-0.4974F)-(0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r52, ((0.0F)-(0.0F)), ((0.8029F)-(-0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r53, ((0.0F)-(0.0F)), ((0.8029F)-(-0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r54, ((0.0F)-(0.0F)), ((0.8465F)-(-0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r55, ((0.0F)-(0.0F)), ((0.8465F)-(-0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r56, ((0.0F)-(0.0F)), ((0.8465F)-(-0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r57, ((0.0F)-(0.0F)), ((0.8465F)-(-0.8465F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r58, ((0.0F)-(0.0F)), ((0.8029F)-(-0.8029F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r59, ((0.0F)-(0.0F)), ((0.8639F)-(-0.8639F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r6, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r60, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r61, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r62, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r63, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r64, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r65, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r66, ((0.0F)-(0.0F)), ((0.4974F)-(-0.4974F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r67, ((0.0873F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r68, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r69, ((0.0118F)-(0.0118F)), ((-0.0669F)-(-0.0669F)),((-0.277F)-(-0.277F)));
//        animator.rotate(cube_r7, ((-0.4974F)-(-0.4974F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r70, ((0.0118F)-(0.0118F)), ((0.0669F)-(0.0669F)),((0.277F)-(0.277F)));
//        animator.rotate(cube_r8, ((-1.1956F)-(-1.1956F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
//        animator.rotate(cube_r9, ((-0.9861F)-(-0.9861F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((-0.7374F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(hips, ((-0.0F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((-0.2618F)-(-0.2618F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legLeft, ((1.7453F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legLeft2, ((0.6109F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legLeft3, ((-1.2654F)-(-1.789F)), ((0.0052F)-(0.0F)),((-0.0166F)-(0.0F)));
        animator.rotate(legLeft4, ((1.6144F)-(0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legRight, ((1.7453F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legRight2, ((0.6109F)-(0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(legRight3, ((-1.2654F)-(-1.789F)), ((-0.0052F)-(0.0F)),((0.0166F)-(0.0F)));
        animator.rotate(legRight4, ((1.6144F)-(0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck1, ((0.48F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((0.3883F)-(0.0F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(primaryLeft1, ((0.0F)-(0.0F)), ((-1.2654F)-(0.2182F)),((0.0F)-(0.0F)));
        animator.rotate(primaryLeft2, ((0.0F)-(0.0F)), ((-1.2654F)-(0.2618F)),((0.0F)-(0.0F)));
        animator.rotate(primaryLeft3, ((0.0F)-(0.0F)), ((-1.0559F)-(0.2094F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft4, ((0.0F)-(0.0F)), ((-0.8378F)-(0.1658F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft5, ((0.0F)-(0.0F)), ((-0.576F)-(0.1222F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft6, ((0.0F)-(0.0F)), ((-0.2269F)-(0.1222F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft7, ((0.0F)-(0.0F)), ((0.1309F)-(0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(primaryRight1, ((0.0F)-(0.0F)), ((1.2654F)-(-0.2182F)),((0.0F)-(0.0F)));
        animator.rotate(primaryRight2, ((0.0F)-(0.0F)), ((1.2654F)-(-0.2618F)),((0.0F)-(0.0F)));
        animator.rotate(primaryRight3, ((0.0F)-(0.0F)), ((1.0559F)-(-0.2094F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight4, ((0.0F)-(0.0F)), ((0.8378F)-(-0.1658F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight5, ((0.0F)-(0.0F)), ((0.576F)-(-0.1222F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight6, ((0.0F)-(0.0F)), ((0.2269F)-(-0.1222F)),((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight7, ((0.0F)-(0.0F)), ((-0.1309F)-(-0.1309F)),((0.0F)-(0.0F)));
        animator.rotate(secondaryLeft2, ((0.0F)-(0.0F)), ((-0.0F)-(-1.0036F)),((0.0F)-(0.0F)));
        animator.rotate(secondaryRight2, ((0.0F)-(0.0F)), ((0.00F)-(1.0036F)),((0.0F)-(0.0F)));
        animator.rotate(tail, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(throat, ((0.3491F)-(0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperjaw, ((0.3491F)-(0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length

        animator.rotate(armLeft1, -((0.0F)-(0.0956F)), -((0.5672F)-(-0.7156F)),-((0.0F)-(1.4095F)));
        animator.rotate(armLeft2, -((0.0F)-(0.0F)), -((-1.2217F)-(1.0036F)),-((0.0F)-(0.0F)));
        animator.rotate(armLeft3, -((0.0F)-(0.0F)), -((1.3963F)-(-0.9163F)),-((0.0F)-(0.0F)));
        animator.rotate(armRight1, -((0.0F)-(0.0956F)), -((-0.5672F)-(0.7156F)),-((0.0F)-(-1.4095F)));
        animator.rotate(armRight2, -((0.0F)-(0.0F)), -((1.2217F)-(-1.0036F)),-((0.0F)-(0.0F)));
        animator.rotate(armRight3, -((0.0F)-(0.0F)), -((-1.3963F)-(0.9163F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r1, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r10, -((-0.8988F)-(-0.8988F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r11, -((-1.1345F)-(-1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r12, -((-0.9599F)-(-0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r13, -((-1.0036F)-(-1.0036F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r14, -((-0.7854F)-(-0.7854F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r15, -((-0.829F)-(-0.829F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r16, -((-0.8988F)-(-0.8988F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r17, -((-0.0698F)-(-0.0698F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r18, -((0.9338F)-(0.9338F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r19, -((0.3665F)-(0.3665F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r2, -((0.9512F)-(0.9512F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r20, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r21, -((0.1484F)-(0.1484F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r22, -((-0.1658F)-(-0.1658F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r23, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r24, -((0.3142F)-(0.3142F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r25, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r26, -((-0.4625F)-(-0.4625F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r27, -((0.3229F)-(0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r28, -((0.7592F)-(0.7592F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r29, -((-0.3229F)-(-0.3229F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r3, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r30, -((-0.4102F)-(-0.4102F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r31, -((-0.9599F)-(-0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r32, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r33, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r34, -((-0.9599F)-(-0.9599F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r35, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r36, -((-0.4363F)-(-0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r37, -((0.0F)-(0.0F)), -((-0.8029F)-(0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r38, -((0.0F)-(0.0F)), -((-0.8029F)-(0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r39, -((0.0F)-(0.0F)), -((-0.8465F)-(0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r4, -((0.1309F)-(0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r40, -((0.0F)-(0.0F)), -((-0.8465F)-(0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r41, -((0.0F)-(0.0F)), -((-0.8465F)-(0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r42, -((0.0F)-(0.0F)), -((-0.8465F)-(0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r43, -((0.0F)-(0.0F)), -((-0.8029F)-(0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r44, -((0.0F)-(0.0F)), -((-0.8639F)-(0.8639F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r45, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r46, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r47, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r48, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r49, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r5, -((-0.2182F)-(-0.2182F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r50, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r51, -((0.0F)-(0.0F)), -((-0.4974F)-(0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r52, -((0.0F)-(0.0F)), -((0.8029F)-(-0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r53, -((0.0F)-(0.0F)), -((0.8029F)-(-0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r54, -((0.0F)-(0.0F)), -((0.8465F)-(-0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r55, -((0.0F)-(0.0F)), -((0.8465F)-(-0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r56, -((0.0F)-(0.0F)), -((0.8465F)-(-0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r57, -((0.0F)-(0.0F)), -((0.8465F)-(-0.8465F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r58, -((0.0F)-(0.0F)), -((0.8029F)-(-0.8029F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r59, -((0.0F)-(0.0F)), -((0.8639F)-(-0.8639F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r6, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r60, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r61, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r62, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r63, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r64, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r65, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r66, -((0.0F)-(0.0F)), -((0.4974F)-(-0.4974F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r67, -((0.0873F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r68, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r69, -((0.0118F)-(0.0118F)), -((-0.0669F)-(-0.0669F)),-((-0.277F)-(-0.277F)));
//        animator.rotate(cube_r7, -((-0.4974F)-(-0.4974F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r70, -((0.0118F)-(0.0118F)), -((0.0669F)-(0.0669F)),-((0.277F)-(0.277F)));
//        animator.rotate(cube_r8, -((-1.1956F)-(-1.1956F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
//        animator.rotate(cube_r9, -((-0.9861F)-(-0.9861F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((-0.7374F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(hips, -((-0.0F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((-0.2618F)-(-0.2618F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legLeft, -((1.7453F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legLeft2, -((0.6109F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legLeft3, -((-1.2654F)-(-1.789F)), -((0.0052F)-(0.0F)),-((-0.0166F)-(0.0F)));
        animator.rotate(legLeft4, -((1.6144F)-(0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legRight, -((1.7453F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legRight2, -((0.6109F)-(0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(legRight3, -((-1.2654F)-(-1.789F)), -((-0.0052F)-(0.0F)),-((0.0166F)-(0.0F)));
        animator.rotate(legRight4, -((1.6144F)-(0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck1, -((0.48F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((0.3883F)-(0.0F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryLeft1, -((0.0F)-(0.0F)), -((-1.2654F)-(0.2182F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryLeft2, -((0.0F)-(0.0F)), -((-1.2654F)-(0.2618F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryLeft3, -((0.0F)-(0.0F)), -((-1.0559F)-(0.2094F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft4, -((0.0F)-(0.0F)), -((-0.8378F)-(0.1658F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft5, -((0.0F)-(0.0F)), -((-0.576F)-(0.1222F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft6, -((0.0F)-(0.0F)), -((-0.2269F)-(0.1222F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryLeft7, -((0.0F)-(0.0F)), -((0.1309F)-(0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryRight1, -((0.0F)-(0.0F)), -((1.2654F)-(-0.2182F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryRight2, -((0.0F)-(0.0F)), -((1.2654F)-(-0.2618F)),-((0.0F)-(0.0F)));
        animator.rotate(primaryRight3, -((0.0F)-(0.0F)), -((1.0559F)-(-0.2094F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight4, -((0.0F)-(0.0F)), -((0.8378F)-(-0.1658F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight5, -((0.0F)-(0.0F)), -((0.576F)-(-0.1222F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight6, -((0.0F)-(0.0F)), -((0.2269F)-(-0.1222F)),-((0.0F)-(0.0F)));
        animator.rotate(PrimaryRight7, -((0.0F)-(0.0F)), -((-0.1309F)-(-0.1309F)),-((0.0F)-(0.0F)));
        animator.rotate(secondaryLeft2, -((0.0F)-(0.0F)), -((-0.0F)-(-1.0036F)),-((0.0F)-(0.0F)));
        animator.rotate(secondaryRight2, -((0.0F)-(0.0F)), -((0.00F)-(1.0036F)),-((0.0F)-(0.0F)));
        animator.rotate(tail, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(throat, -((0.3491F)-(0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperjaw, -((0.3491F)-(0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));


        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
