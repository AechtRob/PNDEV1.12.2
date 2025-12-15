package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEotyrannus;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEotyrannus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer feather10;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer feather;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer feather2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer feather3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer feather4;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer feather5;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer feather6;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer feather7;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer feather8;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer feather9;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer feather11;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private ModelAnimator animator;

    public ModelEotyrannus() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 2.5F, 1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -1.425F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 32, -3.0F, -2.0F, -1.0F, 6, 9, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -1.5F);
        this.hips.addChild(body);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 7.525F, -10.65F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -3.5F, -4.0F, -1.0F, 7, 4, 11, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.175F, -10.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -3.5F, -2.0F, -1.0F, 7, 6, 11, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.8695F, -10.8684F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 3.5F, -6.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 58, -3.0F, -3.0F, 0.0F, 5, 3, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.3805F, -5.4816F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1571F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 13, -3.0F, -2.0F, -1.0F, 6, 5, 7, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.6445F, -4.6816F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, 0.1745F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.9346F, -2.6478F);
        this.neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 59, -2.0F, -4.0F, -3.0F, 4, 4, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.3404F, -4.3228F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.8677F, -2.5685F);
        this.neck2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 41, -1.0F, -1.751F, -0.7911F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.325F, -2.575F);
        this.neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 7, -1.5F, -2.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.5F, -2.325F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1309F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.4589F, -2.1338F);
        this.neck3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 21, -1.0F, -1.0F, -1.0F, 2, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.3839F, -1.2338F);
        this.neck3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 75, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.8339F, -2.1338F);
        this.neck3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 25, -1.5F, -3.0F, -1.0F, 3, 3, 3, -0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0094F, -3.0447F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 71, 64, -1.5F, -0.2571F, -0.8665F, 3, 2, 1, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 68, 37, 0.4F, 1.8169F, -6.6253F, 0, 1, 2, -0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 68, 37, -0.4F, 1.8169F, -6.6253F, 0, 1, 2, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.905F, 0.9935F, -1.1313F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, -0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 78, -0.51F, -1.0F, -1.0F, 1, 1, 2, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.45F, 1.6695F, -3.3225F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2487F, -0.096F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 76, -0.286F, -1.7495F, -1.5666F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.455F, 1.85F, -1.275F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1047F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 77, 55, -0.545F, -2.0F, -1.0F, 2, 2, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.905F, 0.9935F, -1.1313F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0873F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 78, -0.49F, -1.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.545F, 2.3435F, -3.9313F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1658F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 68, -1.045F, -2.0F, -1.0F, 1, 2, 4, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.855F, 4.1685F, -2.0063F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 57, -1.257F, -2.8284F, -2.4705F, 0, 1, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 78, 57, -0.453F, -2.8284F, -2.4705F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.3F, 2.8444F, 0.5775F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, -0.2618F, -0.0873F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 78, -1.2913F, -3.7455F, -2.5619F, 1, 2, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.3F, 2.8444F, 0.5775F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.2618F, 0.0873F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 78, 0.2913F, -3.7455F, -2.5619F, 1, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.8014F, -2.8713F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 78, 24, -0.5F, -2.3928F, -3.9182F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.45F, 1.6695F, -3.3225F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2487F, 0.096F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 76, -0.714F, -1.7495F, -1.5666F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.475F, 3.1444F, 1.3025F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2007F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 78, -0.525F, -3.7326F, -3.4333F, 2, 2, 1, 0.001F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 2.9694F, -4.8725F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.672F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 78, -0.5F, -2.2627F, -0.6717F, 1, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.6771F, 0.2504F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.096F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.0674F, -4.0229F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 75, -0.5F, -1.0F, -1.0F, 1, 1, 4, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.7025F, 1.5325F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1396F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 77, 19, -1.5F, -1.4194F, -2.8859F, 3, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 2.3275F, 1.3825F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1833F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 77, 16, -1.5F, -1.4194F, -2.8859F, 3, 1, 1, -0.001F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.475F, 1.5525F, -3.3925F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 76, 67, -0.975F, -1.6402F, -1.6802F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.1F, 2.0275F, -4.0925F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 6, -0.5F, -2.5003F, -2.8222F, 0, 1, 4, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 77, 6, 0.3F, -2.5003F, -2.8222F, 0, 1, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 1.8525F, 0.6075F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 49, -1.0F, -2.6887F, -3.2576F, 2, 2, 2, -0.003F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 2.5275F, -4.3425F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 78, 27, -0.5F, -2.5003F, -2.8222F, 1, 1, 2, -0.001F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 2.4275F, 0.0575F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0262F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 53, -1.0F, -2.5003F, -2.8222F, 2, 1, 2, 0.0F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.3409F, -0.6957F);
        this.jaw.addChild(throat);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.3265F, 0.6978F);
        this.throat.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 26, 74, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.feather10 = new AdvancedModelRenderer(this);
        this.feather10.setRotationPoint(0.0F, 1.0331F, -2.0264F);
        this.jaw.addChild(feather10);
        this.setRotateAngle(feather10, 0.1876F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.545F, 0.2898F, -1.074F);
        this.feather10.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -0.955F, 0.0981F, 1.1207F, 3, 2, 0, 0.0F, true));

        this.feather = new AdvancedModelRenderer(this);
        this.feather.setRotationPoint(0.0F, -0.4096F, 0.3864F);
        this.head.addChild(feather);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.045F, 0.0846F, -0.3114F);
        this.feather.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6545F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 3, -1.455F, -2.1468F, 0.2057F, 3, 2, 0, 0.0F, false));

        this.feather2 = new AdvancedModelRenderer(this);
        this.feather2.setRotationPoint(0.6892F, -0.3024F, -0.2263F);
        this.head.addChild(feather2);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.0842F, 0.4024F, -0.1487F);
        this.feather2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.3491F, -0.3927F, 0.2618F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 0, 0.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, true));

        this.feather3 = new AdvancedModelRenderer(this);
        this.feather3.setRotationPoint(-0.6892F, -0.3024F, -0.2263F);
        this.head.addChild(feather3);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0842F, 0.4024F, -0.1487F);
        this.feather3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3491F, 0.3927F, -0.2618F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 7, 0, -2.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.feather4 = new AdvancedModelRenderer(this);
        this.feather4.setRotationPoint(1.4514F, 1.2479F, 0.3134F);
        this.head.addChild(feather4);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.3435F, -0.2479F, 0.3616F);
        this.feather4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1309F, -0.829F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 2, -0.545F, -1.25F, 0.0F, 2, 3, 0, 0.0F, false));

        this.feather5 = new AdvancedModelRenderer(this);
        this.feather5.setRotationPoint(-1.4514F, 1.2479F, 0.3134F);
        this.head.addChild(feather5);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.3435F, -0.2479F, 0.3616F);
        this.feather5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1309F, 0.829F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 2, -1.455F, -1.25F, 0.0F, 2, 3, 0, 0.0F, true));

        this.feather6 = new AdvancedModelRenderer(this);
        this.feather6.setRotationPoint(1.4831F, 2.6636F, 1.6547F);
        this.head.addChild(feather6);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.2369F, -0.3886F, 0.0203F);
        this.feather6.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.7856F, -0.049F, -0.9216F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -2.045F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.feather7 = new AdvancedModelRenderer(this);
        this.feather7.setRotationPoint(-1.4831F, 2.6636F, 1.6547F);
        this.head.addChild(feather7);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.2369F, -0.3886F, 0.0203F);
        this.feather7.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.7856F, 0.049F, 0.9216F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 0, -0.955F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.feather8 = new AdvancedModelRenderer(this);
        this.feather8.setRotationPoint(1.1591F, 3.0402F, -0.1362F);
        this.head.addChild(feather8);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.6041F, 0.8348F, 0.1362F);
        this.feather8.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.3491F, 0.0436F, -0.6109F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -0.555F, -0.4F, 0.0F, 3, 2, 0, 0.0F, true));

        this.feather9 = new AdvancedModelRenderer(this);
        this.feather9.setRotationPoint(-1.1591F, 3.0402F, -0.1362F);
        this.head.addChild(feather9);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.6041F, 0.8348F, 0.1362F);
        this.feather9.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3491F, -0.0436F, 0.6109F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -2.445F, -0.4F, 0.0F, 3, 2, 0, 0.0F, false));

        this.feather11 = new AdvancedModelRenderer(this);
        this.feather11.setRotationPoint(0.0F, 3.637F, 1.7867F);
        this.head.addChild(feather11);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.545F, -0.487F, -0.2117F);
        this.feather11.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.48F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 0, -0.955F, 0.0F, 0.0F, 3, 2, 0, 0.0F, true));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.0F, 2.6305F, -5.3816F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 1.1345F, -0.1745F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 73, -1.0F, 0.0F, -0.25F, 2, 5, 2, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 4.75F, 1.25F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.4835F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 8, 73, -0.925F, 0.25F, -1.5F, 2, 4, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.4272F, 2.2231F, 2.4274F);
        this.rightarm2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0851F, 0.1609F, -0.0261F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 68, 0.0F, -2.5F, -2.5F, 0, 5, 5, 0.0F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.5F, 4.25F, -1.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0873F, 0.0F, -0.2182F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 68, 67, -0.425F, -0.15F, -0.65F, 2, 6, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.425F, 2.0F, 1.175F);
        this.rightarm3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.2182F, 0.2182F, 0.0436F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 35, 59, -1.0F, -2.0F, -1.0F, 1, 4, 5, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.65F, 1.875F, 2.0F);
        this.rightarm3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2182F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 44, 68, -1.0F, -2.0F, -1.0F, 1, 6, 1, 0.0F, true));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.0F, 2.6305F, -5.3816F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 1.1345F, 0.1745F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 73, -1.0F, 0.0F, -0.25F, 2, 5, 2, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 4.75F, 1.25F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.4835F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 8, 73, -1.075F, 0.25F, -1.5F, 2, 4, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.4272F, 2.2231F, 2.4274F);
        this.leftarm2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0851F, -0.1609F, 0.0261F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 16, 68, 0.0F, -2.5F, -2.5F, 0, 5, 5, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.5F, 4.25F, -1.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0873F, 0.0F, 0.2182F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 68, 67, -1.575F, -0.15F, -0.65F, 2, 6, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.425F, 2.0F, 1.175F);
        this.leftarm3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.2182F, -0.2182F, -0.0436F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 35, 59, 0.0F, -2.0F, -1.0F, 1, 4, 5, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.65F, 1.875F, 2.0F);
        this.leftarm3.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2182F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 44, 68, 0.0F, -2.0F, -1.0F, 1, 6, 1, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 3.5F);
        this.hips.addChild(tail1);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.tail1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0873F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 48, 47, -2.5F, -2.0F, -1.0F, 5, 6, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.5F, 0.375F);
        this.tail2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.0436F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 46, -2.0F, -1.0F, -1.0F, 4, 4, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.225F, 7.325F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 0, -1.5F, -0.7771F, -0.3576F, 3, 3, 10, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.2479F, 9.7174F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 32, -1.0F, -0.775F, -1.075F, 2, 2, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 10.975F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(2.0F, 0.2687F, 0.5476F);
        this.tail5.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0873F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 44, 26, -4.0F, 0.0F, -1.0F, 4, 0, 11, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.5F, 2.2687F, 0.5476F);
        this.tail5.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0873F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 64, 70, -0.5F, -4.0F, -1.0F, 0, 4, 11, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.7687F, 0.5476F);
        this.tail5.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0873F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 24, 47, -0.5F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.475F, 0.25F, 0.5F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3054F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 58, -1.0F, -1.7153F, -2.7255F, 3, 10, 5, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.775F, 7.7847F, -1.7255F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6545F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 48, 67, -1.0F, -0.0054F, -0.789F, 2, 10, 3, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 9.9946F, 1.511F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6109F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 36, 68, -1.05F, -1.175F, -2.0F, 2, 7, 2, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.1F, 4.5F, 0.0F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.2618F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 53, 40, -1.4F, 0.125F, -6.0F, 3, 1, 6, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.475F, 0.25F, 0.5F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3054F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 58, -2.0F, -1.7153F, -2.7255F, 3, 10, 5, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.775F, 7.7847F, -1.7255F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6545F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 48, 67, -1.0F, -0.0054F, -0.789F, 2, 10, 3, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 9.9946F, 1.511F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6109F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 36, 68, -0.95F, -1.175F, -2.0F, 2, 7, 2, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.1F, 4.5F, 0.0F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.2618F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 53, 40, -1.6F, 0.125F, -6.0F, 3, 1, 6, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck3, 0.1963F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1572F, -0.0431F, 0.0068F);
        this.setRotateAngle(neck1, -0.1747F, 0.0473F, -0.0083F);
        this.setRotateAngle(jaw, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2138F, 0.0F, 0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = 0.01F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.11F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.6F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.45F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraEotyrannus EntityMegalosaurus = (EntityPrehistoricFloraEotyrannus) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);

                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraEotyrannus ee = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;

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
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisp(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }
    public void animDisp(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrovenator entity = (EntityPrehistoricFloraMicrovenator) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 25.25 + (((tickAnim - 60) / 20) * (-38.35434-(25.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (13.14541-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (3.19393-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -38.35434 + (((tickAnim - 80) / 20) * (-38.35434-(-38.35434)));
            yy = 13.14541 + (((tickAnim - 80) / 20) * (13.14541-(13.14541)));
            zz = 3.19393 + (((tickAnim - 80) / 20) * (3.19393-(3.19393)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -38.35434 + (((tickAnim - 100) / 20) * (-38.35434-(-38.35434)));
            yy = 13.14541 + (((tickAnim - 100) / 20) * (-13.14541-(13.14541)));
            zz = 3.19393 + (((tickAnim - 100) / 20) * (-3.19393-(3.19393)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -38.35434 + (((tickAnim - 120) / 20) * (-38.35434-(-38.35434)));
            yy = -13.14541 + (((tickAnim - 120) / 20) * (-13.14541-(-13.14541)));
            zz = -3.19393 + (((tickAnim - 120) / 20) * (-3.19393-(-3.19393)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -38.35434 + (((tickAnim - 140) / 30) * (0-(-38.35434)));
            yy = -13.14541 + (((tickAnim - 140) / 30) * (0-(-13.14541)));
            zz = -3.19393 + (((tickAnim - 140) / 30) * (0-(-3.19393)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.925-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0.95-(0)));
            yy = -1.4 + (((tickAnim - 60) / 20) * (0-(-1.4)));
            zz = -2.925 + (((tickAnim - 60) / 20) * (0-(-2.925)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.95 + (((tickAnim - 80) / 20) * (0.95-(0.95)));
            yy = 0 + (((tickAnim - 80) / 20) * (1.075-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0.95 + (((tickAnim - 100) / 20) * (0-(0.95)));
            yy = 1.075 + (((tickAnim - 100) / 20) * (0-(1.075)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (1.075-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 1.075 + (((tickAnim - 140) / 30) * (0-(1.075)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-1 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-1)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -1.25 + (((tickAnim - 60) / 20) * (-2.75442-(-1.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (3.24625-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-1 + (((tickAnim - 60) / 20) * (-0.1561-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-1)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -2.75442 + (((tickAnim - 80) / 20) * (-5.50442-(-2.75442)));
            yy = 3.24625 + (((tickAnim - 80) / 20) * (3.24625-(3.24625)));
            zz = -0.1561 + (((tickAnim - 80) / 20) * (-0.1561-(-0.1561)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -5.50442 + (((tickAnim - 100) / 10) * (12.5-(-5.50442)));
            yy = 3.24625 + (((tickAnim - 100) / 10) * (0-(3.24625)));
            zz = -0.1561 + (((tickAnim - 100) / 10) * (0-(-0.1561)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 110) / 10) * (-5.50442-(12.5)));
            yy = 0 + (((tickAnim - 110) / 10) * (-3.24625-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (0.1561-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -5.50442 + (((tickAnim - 120) / 20) * (-3.00442-(-5.50442)));
            yy = -3.24625 + (((tickAnim - 120) / 20) * (-3.24625-(-3.24625)));
            zz = 0.1561 + (((tickAnim - 120) / 20) * (0.1561-(0.1561)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -3.00442 + (((tickAnim - 140) / 17) * (16.9147-(-3.00442)));
            yy = -3.24625 + (((tickAnim - 140) / 17) * (-1.44278-(-3.24625)));
            zz = 0.1561 + (((tickAnim - 140) / 17) * (0.06938-(0.1561)));
        }
        else if (tickAnim >= 157 && tickAnim < 170) {
            xx = 16.9147 + (((tickAnim - 157) / 13) * (0-(16.9147)));
            yy = -1.44278 + (((tickAnim - 157) / 13) * (0-(-1.44278)));
            zz = 0.06938 + (((tickAnim - 157) / 13) * (0-(0.06938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0.25-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0.25 + (((tickAnim - 100) / 70) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -3.75 + (((tickAnim - 60) / 20) * (0.19936-(-3.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (6.49696-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (1.76131-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.19936 + (((tickAnim - 80) / 20) * (0.19936-(0.19936)));
            yy = 6.49696 + (((tickAnim - 80) / 20) * (6.49696-(6.49696)));
            zz = 1.76131 + (((tickAnim - 80) / 20) * (1.76131-(1.76131)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0.19936 + (((tickAnim - 100) / 10) * (16.69936-(0.19936)));
            yy = 6.49696 + (((tickAnim - 100) / 10) * (6.49696-(6.49696)));
            zz = 1.76131 + (((tickAnim - 100) / 10) * (1.76131-(1.76131)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 16.69936 + (((tickAnim - 110) / 10) * (0.19936-(16.69936)));
            yy = 6.49696 + (((tickAnim - 110) / 10) * (-6.49696-(6.49696)));
            zz = 1.76131 + (((tickAnim - 110) / 10) * (-1.76131-(1.76131)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0.19936 + (((tickAnim - 120) / 20) * (4.69936-(0.19936)));
            yy = -6.49696 + (((tickAnim - 120) / 20) * (-6.49696-(-6.49696)));
            zz = -1.76131 + (((tickAnim - 120) / 20) * (-1.76131-(-1.76131)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 4.69936 + (((tickAnim - 140) / 30) * (0-(4.69936)));
            yy = -6.49696 + (((tickAnim - 140) / 30) * (0-(-6.49696)));
            zz = -1.76131 + (((tickAnim - 140) / 30) * (0-(-1.76131)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 60) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 1) / 59) * (10.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 1) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
            zz = 0 + (((tickAnim - 1) / 59) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10.25 + (((tickAnim - 60) / 20) * (-15.89463-(10.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1 + (((tickAnim - 60) / 20) * (3.74279-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*1)));
            zz = 0 + (((tickAnim - 60) / 20) * (17.01731-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -15.89463 + (((tickAnim - 80) / 20) * (-18.39463-(-15.89463)));
            yy = 3.74279 + (((tickAnim - 80) / 20) * (3.74279-(3.74279)));
            zz = 17.01731 + (((tickAnim - 80) / 20) * (17.01731-(17.01731)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -18.39463 + (((tickAnim - 100) / 10) * (-18.14-(-18.39463)));
            yy = 3.74279 + (((tickAnim - 100) / 10) * (0-(3.74279)));
            zz = 17.01731 + (((tickAnim - 100) / 10) * (0-(17.01731)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -18.14 + (((tickAnim - 110) / 10) * (-18.39463-(-18.14)));
            yy = 0 + (((tickAnim - 110) / 10) * (-3.74279-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (-17.01731-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -18.39463 + (((tickAnim - 120) / 20) * (-18.39463-(-18.39463)));
            yy = -3.74279 + (((tickAnim - 120) / 20) * (-3.74279-(-3.74279)));
            zz = -17.01731 + (((tickAnim - 120) / 20) * (-17.01731-(-17.01731)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -18.39463 + (((tickAnim - 140) / 17) * (9.25-(-18.39463)));
            yy = -3.74279 + (((tickAnim - 140) / 17) * (0-(-3.74279)));
            zz = -17.01731 + (((tickAnim - 140) / 17) * (0-(-17.01731)));
        }
        else if (tickAnim >= 157 && tickAnim < 170) {
            xx = 9.25 + (((tickAnim - 157) / 13) * (0-(9.25)));
            yy = 0 + (((tickAnim - 157) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0.7-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.7 + (((tickAnim - 80) / 20) * (0.7-(0.7)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0.7 + (((tickAnim - 100) / 20) * (-0.7-(0.7)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -0.7 + (((tickAnim - 120) / 20) * (-0.7-(-0.7)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -0.7 + (((tickAnim - 140) / 17) * (0-(-0.7)));
            yy = 0 + (((tickAnim - 140) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 17) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 157) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 157) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 0) / 1) * (38.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 60) {
            xx = 38.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50 + (((tickAnim - 1) / 59) * (-3.75-(38.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*-50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1 + (((tickAnim - 1) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1)));
            zz = 0 + (((tickAnim - 1) / 59) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -3.75 + (((tickAnim - 60) / 20) * (-0.31075-(-3.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1 + (((tickAnim - 60) / 20) * (14.02904-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-90))*1)));
            zz = 0 + (((tickAnim - 60) / 20) * (11.72483-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.31075 + (((tickAnim - 80) / 20) * (10.43925-(-0.31075)));
            yy = 14.02904 + (((tickAnim - 80) / 20) * (14.02904-(14.02904)));
            zz = 11.72483 + (((tickAnim - 80) / 20) * (11.72483-(11.72483)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 10.43925 + (((tickAnim - 100) / 10) * (-23.81-(10.43925)));
            yy = 14.02904 + (((tickAnim - 100) / 10) * (0-(14.02904)));
            zz = 11.72483 + (((tickAnim - 100) / 10) * (0-(11.72483)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = -23.81 + (((tickAnim - 110) / 10) * (10.43925-(-23.81)));
            yy = 0 + (((tickAnim - 110) / 10) * (-14.02904-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (-11.72483-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 10.43925 + (((tickAnim - 120) / 20) * (4.18925-(10.43925)));
            yy = -14.02904 + (((tickAnim - 120) / 20) * (-14.02904-(-14.02904)));
            zz = -11.72483 + (((tickAnim - 120) / 20) * (-11.72483-(-11.72483)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = 4.18925 + (((tickAnim - 140) / 17) * (-17.25-(4.18925)));
            yy = -14.02904 + (((tickAnim - 140) / 17) * (0-(-14.02904)));
            zz = -11.72483 + (((tickAnim - 140) / 17) * (0-(-11.72483)));
        }
        else if (tickAnim >= 157 && tickAnim < 170) {
            xx = -17.25 + (((tickAnim - 157) / 13) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 157) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (47.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 60) {
            xx = 47.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*-50 + (((tickAnim - 1) / 59) * (-31-(47.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*-50)));
            yy = 0 + (((tickAnim - 1) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 59) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -31 + (((tickAnim - 60) / 20) * (-18.75-(-31)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (10.5-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -18.75 + (((tickAnim - 80) / 20) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 10.5 + (((tickAnim - 80) / 20) * (10.5-(10.5)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -18.75 + (((tickAnim - 100) / 10) * (24-(-18.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 10.5 + (((tickAnim - 100) / 10) * (0-(10.5)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 24 + (((tickAnim - 110) / 10) * (-18.75-(24)));
            yy = 0 + (((tickAnim - 110) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 10) * (-10.5-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -18.75 + (((tickAnim - 120) / 20) * (-18.75-(-18.75)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = -10.5 + (((tickAnim - 120) / 20) * (-10.5-(-10.5)));
        }
        else if (tickAnim >= 140 && tickAnim < 157) {
            xx = -18.75 + (((tickAnim - 140) / 17) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 140) / 17) * (12.25-(0)));
            zz = -10.5 + (((tickAnim - 140) / 17) * (0-(-10.5)));
        }
        else if (tickAnim >= 157 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 157) / 13) * (0-(0)));
            yy = 12.25 + (((tickAnim - 157) / 13) * (0-(12.25)));
            zz = 0 + (((tickAnim - 157) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (47.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 60) {
            xx = 47.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*50 + (((tickAnim - 1) / 59) * (-13.25-(47.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+250))*50)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5 + (((tickAnim - 1) / 59) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5)));
            zz = 0 + (((tickAnim - 1) / 59) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -13.25 + (((tickAnim - 60) / 20) * (0-(-13.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5 + (((tickAnim - 60) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000+250))*5)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 90) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            zz = 0.5 + (((tickAnim - 60) / 110) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 170) {
            xx = 26 + (((tickAnim - 60) / 110) * (0-(26)));
            yy = 0 + (((tickAnim - 60) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 110) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -1.5 + (((tickAnim - 59) / 1) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 59) / 1) * (-28.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -1.5 + (((tickAnim - 60) / 20) * (5.73286-(-1.5)));
            yy = -28.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55 + (((tickAnim - 60) / 20) * (9.21004-(-28.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*55)));
            zz = 0 + (((tickAnim - 60) / 20) * (6.3675-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 5.73286 + (((tickAnim - 80) / 20) * (4.23286-(5.73286)));
            yy = 9.21004 + (((tickAnim - 80) / 20) * (9.21004-(9.21004)));
            zz = 6.3675 + (((tickAnim - 80) / 20) * (6.3675-(6.3675)));
        }
        else if (tickAnim >= 100 && tickAnim < 101) {
            xx = 4.23286 + (((tickAnim - 100) / 1) * (4.23286-(4.23286)));
            yy = 9.21004 + (((tickAnim - 100) / 1) * (-71.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85-(9.21004)));
            zz = 6.3675 + (((tickAnim - 100) / 1) * (6.3675-(6.3675)));
        }
        else if (tickAnim >= 101 && tickAnim < 120) {
            xx = 4.23286 + (((tickAnim - 101) / 19) * (13.25-(4.23286)));
            yy = -71.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85 + (((tickAnim - 101) / 19) * (-12-(-71.665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-85)));
            zz = 6.3675 + (((tickAnim - 101) / 19) * (0-(6.3675)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 13.25 + (((tickAnim - 120) / 20) * (13.25-(13.25)));
            yy = -12 + (((tickAnim - 120) / 20) * (-12-(-12)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 13.25 + (((tickAnim - 140) / 30) * (0-(13.25)));
            yy = -12 + (((tickAnim - 140) / 30) * (0-(-12)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (-0.775-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = -0.775 + (((tickAnim - 120) / 20) * (-0.775-(-0.775)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = -0.775 + (((tickAnim - 140) / 30) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -13 + (((tickAnim - 59) / 1) * (-13-(-13)));
            yy = 0 + (((tickAnim - 59) / 1) * (-54.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*55-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -13 + (((tickAnim - 60) / 20) * (24.84433-(-13)));
            yy = -54.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*55 + (((tickAnim - 60) / 20) * (11.24649-(-54.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*55)));
            zz = 0 + (((tickAnim - 60) / 20) * (6.47344-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 24.84433 + (((tickAnim - 80) / 20) * (20.34433-(24.84433)));
            yy = 11.24649 + (((tickAnim - 80) / 20) * (11.24649-(11.24649)));
            zz = 6.47344 + (((tickAnim - 80) / 20) * (6.47344-(6.47344)));
        }
        else if (tickAnim >= 100 && tickAnim < 101) {
            xx = 20.34433 + (((tickAnim - 100) / 1) * (20.34433-(20.34433)));
            yy = 11.24649 + (((tickAnim - 100) / 1) * (44.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*95-(11.24649)));
            zz = 6.47344 + (((tickAnim - 100) / 1) * (6.47344-(6.47344)));
        }
        else if (tickAnim >= 101 && tickAnim < 120) {
            xx = 20.34433 + (((tickAnim - 101) / 19) * (12.75-(20.34433)));
            yy = 44.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*95 + (((tickAnim - 101) / 19) * (-11-(44.1465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*95)));
            zz = 6.47344 + (((tickAnim - 101) / 19) * (0-(6.47344)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 12.75 + (((tickAnim - 120) / 20) * (12.75-(12.75)));
            yy = -11 + (((tickAnim - 120) / 20) * (-11-(-11)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 12.75 + (((tickAnim - 140) / 30) * (0-(12.75)));
            yy = -11 + (((tickAnim - 140) / 30) * (0-(-11)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-0.55-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            zz = -0.55 + (((tickAnim - 80) / 90) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -20.25 + (((tickAnim - 59) / 1) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 59) / 1) * (40.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-55-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -20.25 + (((tickAnim - 60) / 20) * (15.75-(-20.25)));
            yy = 40.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-55 + (((tickAnim - 60) / 20) * (-53.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55-(40.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*-55)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 15.75 + (((tickAnim - 80) / 20) * (20.5-(15.75)));
            yy = -53.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55 + (((tickAnim - 80) / 20) * (12.5-(-53.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 101) {
            xx = 20.5 + (((tickAnim - 100) / 1) * (20.5-(20.5)));
            yy = 12.5 + (((tickAnim - 100) / 1) * (-11.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55-(12.5)));
            zz = 0 + (((tickAnim - 100) / 1) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 120) {
            xx = 20.5 + (((tickAnim - 101) / 19) * (11.5-(20.5)));
            yy = -11.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55 + (((tickAnim - 101) / 19) * (-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55-(-11.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55)));
            zz = 0 + (((tickAnim - 101) / 19) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 11.5 + (((tickAnim - 120) / 20) * (11.5-(11.5)));
            yy = -1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55 + (((tickAnim - 120) / 20) * (-17.75-(-1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-100))*55)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 11.5 + (((tickAnim - 140) / 30) * (0-(11.5)));
            yy = -17.75 + (((tickAnim - 140) / 30) * (0-(-17.75)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.075-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 90) * (0-(0)));
            zz = -1.075 + (((tickAnim - 80) / 90) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 0) / 59) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 59) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 60) {
            xx = -8.25 + (((tickAnim - 59) / 1) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 59) / 1) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-55-(0)));
            zz = 0 + (((tickAnim - 59) / 1) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -8.25 + (((tickAnim - 60) / 20) * (-3.5-(-8.25)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-55 + (((tickAnim - 60) / 20) * (-42.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-55)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -3.5 + (((tickAnim - 80) / 20) * (4-(-3.5)));
            yy = -42.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55 + (((tickAnim - 80) / 20) * (0-(-42.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 101) {
            xx = 4 + (((tickAnim - 100) / 1) * (4-(4)));
            yy = 0 + (((tickAnim - 100) / 1) * (82.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-85-(0)));
            zz = 0 + (((tickAnim - 100) / 1) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 120) {
            xx = 4 + (((tickAnim - 101) / 19) * (13.75-(4)));
            yy = 82.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-85 + (((tickAnim - 101) / 19) * (-27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55-(82.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*-85)));
            zz = 0 + (((tickAnim - 101) / 19) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 13.75 + (((tickAnim - 120) / 20) * (13.75-(13.75)));
            yy = -27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55 + (((tickAnim - 120) / 20) * (-19-(-27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*55)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 13.75 + (((tickAnim - 140) / 30) * (0-(13.75)));
            yy = -19 + (((tickAnim - 140) / 30) * (0-(-19)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-23.56626-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-6.7814-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (3.25626-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -23.56626 + (((tickAnim - 60) / 20) * (42.12205-(-23.56626)));
            yy = -6.7814 + (((tickAnim - 60) / 20) * (-13.22124-(-6.7814)));
            zz = 3.25626 + (((tickAnim - 60) / 20) * (-12.80025-(3.25626)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 42.12205 + (((tickAnim - 80) / 20) * (42.12205-(42.12205)));
            yy = -13.22124 + (((tickAnim - 80) / 20) * (-13.22124-(-13.22124)));
            zz = -12.80025 + (((tickAnim - 80) / 20) * (-12.80025-(-12.80025)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 42.12205 + (((tickAnim - 100) / 13) * (5.32702-(42.12205)));
            yy = -13.22124 + (((tickAnim - 100) / 13) * (-4.95796-(-13.22124)));
            zz = -12.80025 + (((tickAnim - 100) / 13) * (-4.80009-(-12.80025)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 5.32702 + (((tickAnim - 113) / 7) * (21.25-(5.32702)));
            yy = -4.95796 + (((tickAnim - 113) / 7) * (0-(-4.95796)));
            zz = -4.80009 + (((tickAnim - 113) / 7) * (0-(-4.80009)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 21.25 + (((tickAnim - 120) / 20) * (25-(21.25)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 25 + (((tickAnim - 140) / 10) * (25.25025-(25)));
            yy = 0 + (((tickAnim - 140) / 10) * (7.58503-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (7.66682-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 25.25025 + (((tickAnim - 150) / 20) * (0-(25.25025)));
            yy = 7.58503 + (((tickAnim - 150) / 20) * (0-(7.58503)));
            zz = 7.66682 + (((tickAnim - 150) / 20) * (0-(7.66682)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 14 + (((tickAnim - 60) / 20) * (0-(14)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (-1.84209-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.58881-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.33716-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -1.84209 + (((tickAnim - 100) / 13) * (28.40791-(-1.84209)));
            yy = -0.58881 + (((tickAnim - 100) / 13) * (-0.58881-(-0.58881)));
            zz = -0.33716 + (((tickAnim - 100) / 13) * (-0.33716-(-0.33716)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 28.40791 + (((tickAnim - 113) / 7) * (-2.49203-(28.40791)));
            yy = -0.58881 + (((tickAnim - 113) / 7) * (-0.19783-(-0.58881)));
            zz = -0.33716 + (((tickAnim - 113) / 7) * (0.03069-(-0.33716)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -2.49203 + (((tickAnim - 120) / 20) * (-3.99203-(-2.49203)));
            yy = -0.19783 + (((tickAnim - 120) / 20) * (-0.19783-(-0.19783)));
            zz = 0.03069 + (((tickAnim - 120) / 20) * (0.03069-(0.03069)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -3.99203 + (((tickAnim - 140) / 5) * (34.00399-(-3.99203)));
            yy = -0.19783 + (((tickAnim - 140) / 5) * (-0.09891-(-0.19783)));
            zz = 0.03069 + (((tickAnim - 140) / 5) * (0.01534-(0.03069)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 34.00399 + (((tickAnim - 145) / 5) * (0-(34.00399)));
            yy = -0.09891 + (((tickAnim - 145) / 5) * (0-(-0.09891)));
            zz = 0.01534 + (((tickAnim - 145) / 5) * (0-(0.01534)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = -0.35 + (((tickAnim - 120) / 20) * (-0.35-(-0.35)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 140) / 5) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 4 + (((tickAnim - 100) / 13) * (-47.72-(4)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -47.72 + (((tickAnim - 113) / 7) * (15.25-(-47.72)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 15.25 + (((tickAnim - 120) / 20) * (17.75-(15.25)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 17.75 + (((tickAnim - 140) / 5) * (-42.12-(17.75)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -42.12 + (((tickAnim - 145) / 5) * (0-(-42.12)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -0.4 + (((tickAnim - 60) / 20) * (0-(-0.4)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            yy = -0.2 + (((tickAnim - 100) / 13) * (-0.425-(-0.2)));
            zz = 0 + (((tickAnim - 100) / 13) * (-0.725-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 113) / 7) * (-0.42-(-0.425)));
            zz = -0.725 + (((tickAnim - 113) / 7) * (-0.22-(-0.725)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = -0.42 + (((tickAnim - 120) / 20) * (-0.87-(-0.42)));
            zz = -0.22 + (((tickAnim - 120) / 20) * (-0.22-(-0.22)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            yy = -0.87 + (((tickAnim - 140) / 5) * (0-(-0.87)));
            zz = -0.22 + (((tickAnim - 140) / 5) * (-0.475-(-0.22)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = -0.475 + (((tickAnim - 145) / 5) * (0-(-0.475)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -15.5 + (((tickAnim - 60) / 20) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -5.5 + (((tickAnim - 100) / 13) * (80.38-(-5.5)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 80.38 + (((tickAnim - 113) / 7) * (5.5-(80.38)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 5.5 + (((tickAnim - 120) / 20) * (0.25-(5.5)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0.25 + (((tickAnim - 140) / 5) * (71.63-(0.25)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 71.63 + (((tickAnim - 145) / 5) * (0-(71.63)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0.375 + (((tickAnim - 80) / 20) * (-0.4-(0.375)));
            zz = 0 + (((tickAnim - 80) / 20) * (0.175-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            yy = -0.4 + (((tickAnim - 100) / 13) * (0.65-(-0.4)));
            zz = 0.175 + (((tickAnim - 100) / 13) * (-1.125-(0.175)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 113) / 7) * (0-(0.65)));
            zz = -1.125 + (((tickAnim - 113) / 7) * (0-(-1.125)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (-0.3-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 140) / 5) * (0.915-(-0.225)));
            zz = -0.3 + (((tickAnim - 140) / 5) * (-1.225-(-0.3)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            yy = 0.915 + (((tickAnim - 145) / 5) * (-0.675-(0.915)));
            zz = -1.225 + (((tickAnim - 145) / 5) * (0-(-1.225)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = -0.675 + (((tickAnim - 150) / 20) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-23.56626-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (6.7814-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-3.25626-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -23.56626 + (((tickAnim - 60) / 13) * (-15.29504-(-23.56626)));
            yy = 6.7814 + (((tickAnim - 60) / 13) * (5.94878-(6.7814)));
            zz = -3.25626 + (((tickAnim - 60) / 13) * (2.74672-(-3.25626)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -15.29504 + (((tickAnim - 73) / 7) * (18.46557-(-15.29504)));
            yy = 5.94878 + (((tickAnim - 73) / 7) * (5.53247-(5.94878)));
            zz = 2.74672 + (((tickAnim - 73) / 7) * (5.74822-(2.74672)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 18.46557 + (((tickAnim - 80) / 20) * (21.71557-(18.46557)));
            yy = 5.53247 + (((tickAnim - 80) / 20) * (5.53247-(5.53247)));
            zz = 5.74822 + (((tickAnim - 80) / 20) * (5.74822-(5.74822)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 21.71557 + (((tickAnim - 100) / 20) * (41.50689-(21.71557)));
            yy = 5.53247 + (((tickAnim - 100) / 20) * (2.86098-(5.53247)));
            zz = 5.74822 + (((tickAnim - 100) / 20) * (15.52727-(5.74822)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 41.50689 + (((tickAnim - 120) / 20) * (41.50689-(41.50689)));
            yy = 2.86098 + (((tickAnim - 120) / 20) * (2.86098-(2.86098)));
            zz = 15.52727 + (((tickAnim - 120) / 20) * (15.52727-(15.52727)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 41.50689 + (((tickAnim - 140) / 10) * (20.17766-(41.50689)));
            yy = 2.86098 + (((tickAnim - 140) / 10) * (3.17121-(2.86098)));
            zz = 15.52727 + (((tickAnim - 140) / 10) * (9.2763-(15.52727)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 20.17766 + (((tickAnim - 150) / 11) * (0.49809-(20.17766)));
            yy = 3.17121 + (((tickAnim - 150) / 11) * (1.45347-(3.17121)));
            zz = 9.2763 + (((tickAnim - 150) / 11) * (4.25164-(9.2763)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = 0.49809 + (((tickAnim - 161) / 9) * (0-(0.49809)));
            yy = 1.45347 + (((tickAnim - 161) / 9) * (0-(1.45347)));
            zz = 4.25164 + (((tickAnim - 161) / 9) * (0-(4.25164)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 14 + (((tickAnim - 60) / 13) * (45.12787-(14)));
            yy = 0 + (((tickAnim - 60) / 13) * (-0.14365-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (-0.85688-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 45.12787 + (((tickAnim - 73) / 7) * (0.40441-(45.12787)));
            yy = -0.14365 + (((tickAnim - 73) / 7) * (2.92231-(-0.14365)));
            zz = -0.85688 + (((tickAnim - 73) / 7) * (-3.7463-(-0.85688)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0.40441 + (((tickAnim - 80) / 20) * (-5.09559-(0.40441)));
            yy = 2.92231 + (((tickAnim - 80) / 20) * (2.92231-(2.92231)));
            zz = -3.7463 + (((tickAnim - 80) / 20) * (-3.7463-(-3.7463)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -5.09559 + (((tickAnim - 100) / 20) * (-5.09559-(-5.09559)));
            yy = 2.92231 + (((tickAnim - 100) / 20) * (0-(2.92231)));
            zz = -3.7463 + (((tickAnim - 100) / 20) * (0-(-3.7463)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -5.09559 + (((tickAnim - 120) / 20) * (-11.84559-(-5.09559)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -11.84559 + (((tickAnim - 140) / 10) * (-11.84559-(-11.84559)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = -11.84559 + (((tickAnim - 150) / 11) * (43.63-(-11.84559)));
            yy = 0 + (((tickAnim - 150) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = 43.63 + (((tickAnim - 161) / 9) * (0-(43.63)));
            yy = 0 + (((tickAnim - 161) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 100) / 20) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (-52.5-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -52.5 + (((tickAnim - 73) / 7) * (6-(-52.5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 6 + (((tickAnim - 80) / 20) * (13.75-(6)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 13.75 + (((tickAnim - 100) / 20) * (-11.5-(13.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -11.5 + (((tickAnim - 120) / 20) * (11.25-(-11.5)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 11.25 + (((tickAnim - 140) / 10) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 11.25 + (((tickAnim - 150) / 11) * (-51.31-(11.25)));
            yy = 0 + (((tickAnim - 150) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = -51.31 + (((tickAnim - 161) / 9) * (0-(-51.31)));
            yy = 0 + (((tickAnim - 161) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (-0.13-(0)));
            zz = -0.4 + (((tickAnim - 60) / 13) * (-0.57-(-0.4)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -0.13 + (((tickAnim - 73) / 7) * (-0.95-(-0.13)));
            zz = -0.57 + (((tickAnim - 73) / 7) * (-0.65-(-0.57)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -0.95 + (((tickAnim - 80) / 20) * (-1.175-(-0.95)));
            zz = -0.65 + (((tickAnim - 80) / 20) * (-0.275-(-0.65)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -1.175 + (((tickAnim - 100) / 20) * (0-(-1.175)));
            zz = -0.275 + (((tickAnim - 100) / 20) * (0-(-0.275)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 150) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 150) / 11) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 150) / 11) * (-0.675-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 161) / 9) * (0-(0)));
            yy = -0.125 + (((tickAnim - 161) / 9) * (0-(-0.125)));
            zz = -0.675 + (((tickAnim - 161) / 9) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -15.5 + (((tickAnim - 60) / 13) * (81.75-(-15.5)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 81.75 + (((tickAnim - 73) / 7) * (17.25-(81.75)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 17.25 + (((tickAnim - 80) / 20) * (9.5-(17.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 9.5 + (((tickAnim - 100) / 20) * (13.81859-(9.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (3.3872-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (-6.12949-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 13.81859 + (((tickAnim - 120) / 20) * (-0.93141-(13.81859)));
            yy = 3.3872 + (((tickAnim - 120) / 20) * (3.3872-(3.3872)));
            zz = -6.12949 + (((tickAnim - 120) / 20) * (-6.12949-(-6.12949)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = -0.93141 + (((tickAnim - 140) / 10) * (5.62906-(-0.93141)));
            yy = 3.3872 + (((tickAnim - 140) / 10) * (2.25814-(3.3872)));
            zz = -6.12949 + (((tickAnim - 140) / 10) * (-4.08633-(-6.12949)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 5.62906 + (((tickAnim - 150) / 11) * (83.82999-(5.62906)));
            yy = 2.25814 + (((tickAnim - 150) / 11) * (1.03498-(2.25814)));
            zz = -4.08633 + (((tickAnim - 150) / 11) * (-1.8729-(-4.08633)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = 83.82999 + (((tickAnim - 161) / 9) * (0-(83.82999)));
            yy = 1.03498 + (((tickAnim - 161) / 9) * (0-(1.03498)));
            zz = -1.8729 + (((tickAnim - 161) / 9) * (0-(-1.8729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 13) * (-1.425-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = -1.425 + (((tickAnim - 73) / 7) * (0-(-1.425)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 100) / 20) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 150) {
            xx = 0 + (((tickAnim - 140) / 10) * (0-(0)));
            yy = -0.125 + (((tickAnim - 140) / 10) * (-0.55-(-0.125)));
            zz = 0 + (((tickAnim - 140) / 10) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 150) / 11) * (0-(0)));
            yy = -0.55 + (((tickAnim - 150) / 11) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 150) / 11) * (-1.5-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 161) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 161) / 9) * (0-(0)));
            zz = -1.5 + (((tickAnim - 161) / 9) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-41.87536-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (66.18953-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -41.87536 + (((tickAnim - 60) / 13) * (21.32266-(-41.87536)));
            yy = -19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 60) / 13) * (3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = 66.18953 + (((tickAnim - 60) / 13) * (6.58543-(66.18953)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 21.32266 + (((tickAnim - 73) / 7) * (-41.87536-(21.32266)));
            yy = 3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 73) / 7) * (-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 6.58543 + (((tickAnim - 73) / 7) * (66.18953-(6.58543)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -41.87536 + (((tickAnim - 80) / 20) * (-41.87536-(-41.87536)));
            yy = -19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 80) / 20) * (-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = 66.18953 + (((tickAnim - 80) / 20) * (66.18953-(66.18953)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -41.87536 + (((tickAnim - 100) / 10) * (90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450-(-41.87536)));
            yy = -19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 100) / 10) * (-3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 66.18953 + (((tickAnim - 100) / 10) * (-6.58543-(66.18953)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450 + (((tickAnim - 110) / 10) * (-41.87536-(90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450)));
            yy = -3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 110) / 10) * (-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -6.58543 + (((tickAnim - 110) / 10) * (66.18953-(-6.58543)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -41.87536 + (((tickAnim - 120) / 20) * (-41.87536-(-41.87536)));
            yy = -19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 120) / 20) * (-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 66.18953 + (((tickAnim - 120) / 20) * (66.18953-(66.18953)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -41.87536 + (((tickAnim - 140) / 30) * (0-(-41.87536)));
            yy = -19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 140) / 30) * (0-(-19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 66.18953 + (((tickAnim - 140) / 30) * (0-(66.18953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 35 + (((tickAnim - 60) / 20) * (35-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 35 + (((tickAnim - 80) / 60) * (35-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 35 + (((tickAnim - 140) / 30) * (0-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*-5)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 16.75 + (((tickAnim - 60) / 4) * (13.95992-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5 + (((tickAnim - 60) / 4) * (6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5)));
            zz = 0 + (((tickAnim - 60) / 4) * (21.53301-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = 13.95992 + (((tickAnim - 64) / 7) * (16.90125-(13.95992)));
            yy = 6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 64) / 7) * (-0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = 21.53301 + (((tickAnim - 64) / 7) * (-20.2846-(21.53301)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 16.90125 + (((tickAnim - 71) / 9) * (16.75-(16.90125)));
            yy = -0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 71) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5-(-0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = -20.2846 + (((tickAnim - 71) / 9) * (0-(-20.2846)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 16.75 + (((tickAnim - 80) / 60) * (16.75-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 16.75 + (((tickAnim - 140) / 30) * (0-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*-5)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightarm3.rotationPointX = this.rightarm3.rotationPointX + (float)(0);
        this.rightarm3.rotationPointY = this.rightarm3.rotationPointY - (float)(0);
        this.rightarm3.rotationPointZ = this.rightarm3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-41.87536-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-66.18953-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -41.87536 + (((tickAnim - 60) / 13) * (-437.6273+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450-(-41.87536)));
            yy = 19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 60) / 13) * (-3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -66.18953 + (((tickAnim - 60) / 13) * (-6.58543-(-66.18953)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -437.6273+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450 + (((tickAnim - 73) / 7) * (-41.87536-(-437.6273+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450)));
            yy = -3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 73) / 7) * (19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(-3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -6.58543 + (((tickAnim - 73) / 7) * (-66.18953-(-6.58543)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -41.87536 + (((tickAnim - 80) / 20) * (-41.87536-(-41.87536)));
            yy = 19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 80) / 20) * (19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -66.18953 + (((tickAnim - 80) / 20) * (-66.18953-(-66.18953)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -41.87536 + (((tickAnim - 100) / 10) * (90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450-(-41.87536)));
            yy = 19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 100) / 10) * (3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -66.18953 + (((tickAnim - 100) / 10) * (6.58543-(-66.18953)));
        }
        else if (tickAnim >= 110 && tickAnim < 120) {
            xx = 90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450 + (((tickAnim - 110) / 10) * (-41.87536-(90.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-85))*450)));
            yy = 3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 110) / 10) * (19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(3.0739+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = 6.58543 + (((tickAnim - 110) / 10) * (-66.18953-(6.58543)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = -41.87536 + (((tickAnim - 120) / 20) * (-41.87536-(-41.87536)));
            yy = 19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 120) / 20) * (19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -66.18953 + (((tickAnim - 120) / 20) * (-66.18953-(-66.18953)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = -41.87536 + (((tickAnim - 140) / 30) * (0-(-41.87536)));
            yy = 19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 140) / 30) * (0-(19.7826905912+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -66.18953 + (((tickAnim - 140) / 30) * (0-(-66.18953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 35 + (((tickAnim - 60) / 20) * (35-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 35 + (((tickAnim - 80) / 60) * (35-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 35 + (((tickAnim - 140) / 30) * (0-(35)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-150))*5)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 16.75 + (((tickAnim - 60) / 4) * (13.95992-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 60) / 4) * (-6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = 0 + (((tickAnim - 60) / 4) * (-21.53301-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 71) {
            xx = 13.95992 + (((tickAnim - 64) / 7) * (16.90125-(13.95992)));
            yy = -6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 64) / 7) * (0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(-6.6322+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = -21.53301 + (((tickAnim - 64) / 7) * (20.2846-(-21.53301)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 16.90125 + (((tickAnim - 71) / 9) * (16.75-(16.90125)));
            yy = 0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 71) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(0.1717+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = 20.2846 + (((tickAnim - 71) / 9) * (0-(20.2846)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 16.75 + (((tickAnim - 80) / 60) * (16.75-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 16.75 + (((tickAnim - 140) / 30) * (0-(16.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-250))*5)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 13) / 17) * (0-(17.75)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = -28.25 + (((tickAnim - 15) / 40) * (29-(-28.25)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 29 + (((tickAnim - 55) / 25) * (0-(29)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather10, feather10.rotateAngleX + (float) Math.toRadians(xx), feather10.rotateAngleY + (float) Math.toRadians(yy), feather10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 30.75 + (((tickAnim - 15) / 40) * (-20-(30.75)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15 + (((tickAnim - 15) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 55) / 5) * (-25.25-(-20)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -25.25 + (((tickAnim - 60) / 20) * (30.75-(-25.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 30.75 + (((tickAnim - 80) / 60) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 30.75 + (((tickAnim - 140) / 30) * (0-(30.75)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(xx), feather.rotateAngleY + (float) Math.toRadians(yy), feather.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (-0.75-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 60) / 20) * (0-(-0.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather.rotationPointX = this.feather.rotationPointX + (float)(xx);
        this.feather.rotationPointY = this.feather.rotationPointY - (float)(yy);
        this.feather.rotationPointZ = this.feather.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.58437-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (22.81727-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 12.58437 + (((tickAnim - 15) / 40) * (-46.54829-(12.58437)));
            yy = 22.81727 + (((tickAnim - 15) / 40) * (-31.91917-(22.81727)));
            zz = 1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 15) / 40) * (42.82696-(1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -46.54829 + (((tickAnim - 55) / 5) * (-46.54829-(-46.54829)));
            yy = -31.91917 + (((tickAnim - 55) / 5) * (-31.91917-(-31.91917)));
            zz = 42.82696 + (((tickAnim - 55) / 5) * (42.82696-(42.82696)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -46.54829 + (((tickAnim - 60) / 20) * (12.58437-(-46.54829)));
            yy = -31.91917 + (((tickAnim - 60) / 20) * (22.81727-(-31.91917)));
            zz = 42.82696 + (((tickAnim - 60) / 20) * (1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(42.82696)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 12.58437 + (((tickAnim - 80) / 60) * (12.58437-(12.58437)));
            yy = 22.81727 + (((tickAnim - 80) / 60) * (22.81727-(22.81727)));
            zz = 1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 80) / 60) * (1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 12.58437 + (((tickAnim - 140) / 30) * (0-(12.58437)));
            yy = 22.81727 + (((tickAnim - 140) / 30) * (0-(22.81727)));
            zz = 1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 140) / 30) * (0-(1.7989405404+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(xx), feather2.rotateAngleY + (float) Math.toRadians(yy), feather2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0.7 + (((tickAnim - 55) / 5) * (0.7-(0.7)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0.7 + (((tickAnim - 60) / 20) * (0-(0.7)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather2.rotationPointX = this.feather2.rotationPointX + (float)(xx);
        this.feather2.rotationPointY = this.feather2.rotationPointY - (float)(yy);
        this.feather2.rotationPointZ = this.feather2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-20.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 24 + (((tickAnim - 15) / 40) * (-46.54829-(24)));
            yy = -20.75 + (((tickAnim - 15) / 40) * (31.91917-(-20.75)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 15) / 40) * (-42.82696-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -46.54829 + (((tickAnim - 55) / 5) * (-46.54829-(-46.54829)));
            yy = 31.91917 + (((tickAnim - 55) / 5) * (31.91917-(31.91917)));
            zz = -42.82696 + (((tickAnim - 55) / 5) * (-42.82696-(-42.82696)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -46.54829 + (((tickAnim - 60) / 20) * (24-(-46.54829)));
            yy = 31.91917 + (((tickAnim - 60) / 20) * (-20.75-(31.91917)));
            zz = -42.82696 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(-42.82696)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 24 + (((tickAnim - 80) / 60) * (24-(24)));
            yy = -20.75 + (((tickAnim - 80) / 60) * (-20.75-(-20.75)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 24 + (((tickAnim - 140) / 30) * (0-(24)));
            yy = -20.75 + (((tickAnim - 140) / 30) * (0-(-20.75)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-50))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(xx), feather3.rotateAngleY + (float) Math.toRadians(yy), feather3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (-0.7-(0)));
            yy = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 40) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -0.7 + (((tickAnim - 55) / 5) * (-0.7-(-0.7)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -0.7 + (((tickAnim - 60) / 20) * (0-(-0.7)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feather3.rotationPointX = this.feather3.rotationPointX + (float)(xx);
        this.feather3.rotationPointY = this.feather3.rotationPointY - (float)(yy);
        this.feather3.rotationPointZ = this.feather3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (39.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (-6.13631-(0)));
            yy = 39.25 + (((tickAnim - 15) / 40) * (-34.78008-(39.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 15) / 40) * (10.67349-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -6.13631 + (((tickAnim - 55) / 5) * (-6.13631-(-6.13631)));
            yy = -34.78008 + (((tickAnim - 55) / 5) * (-34.78008-(-34.78008)));
            zz = 10.67349 + (((tickAnim - 55) / 5) * (10.67349-(10.67349)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -6.13631 + (((tickAnim - 60) / 20) * (0-(-6.13631)));
            yy = -34.78008 + (((tickAnim - 60) / 20) * (39.25-(-34.78008)));
            zz = 10.67349 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(10.67349)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = 39.25 + (((tickAnim - 80) / 60) * (39.25-(39.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = 39.25 + (((tickAnim - 140) / 30) * (0-(39.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather4, feather4.rotateAngleX + (float) Math.toRadians(xx), feather4.rotateAngleY + (float) Math.toRadians(yy), feather4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-35.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 15) / 40) * (0-(0)));
            yy = -35.25 + (((tickAnim - 15) / 40) * (28.25-(-35.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 15) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 28.25 + (((tickAnim - 55) / 5) * (28.25-(28.25)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 28.25 + (((tickAnim - 60) / 20) * (-35.25-(28.25)));
            zz = 0 + (((tickAnim - 60) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = -35.25 + (((tickAnim - 80) / 60) * (-35.25-(-35.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 80) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            yy = -35.25 + (((tickAnim - 140) / 30) * (0-(-35.25)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15 + (((tickAnim - 140) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feather5, feather5.rotateAngleX + (float) Math.toRadians(xx), feather5.rotateAngleY + (float) Math.toRadians(yy), feather5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
    if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 13.25 + (((tickAnim - 3) / 5) * (15.75-(13.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 15.75 + (((tickAnim - 8) / 5) * (0-(15.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-1.075-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 8) / 5) * (0-(-0.05)));
            zz = -1.075 + (((tickAnim - 8) / 5) * (0-(-1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -18.75 + (((tickAnim - 3) / 5) * (10.18347-(-18.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-0.68268-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.88821-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 10.18347 + (((tickAnim - 8) / 5) * (0-(10.18347)));
            yy = -0.68268 + (((tickAnim - 8) / 5) * (0-(-0.68268)));
            zz = 0.88821 + (((tickAnim - 8) / 5) * (0-(0.88821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.425-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-0.65-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 5) * (0-(0.425)));
            zz = -0.65 + (((tickAnim - 8) / 5) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 3) / 5) * (-27.5-(4.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.5 + (((tickAnim - 8) / 5) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -5.75 + (((tickAnim - 3) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7 + (((tickAnim - 5) / 3) * (41-(7)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 41 + (((tickAnim - 8) / 2) * (0-(41)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.75 + (((tickAnim - 10) / 10) * (0-(9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.5 + (((tickAnim - 10) / 10) * (0-(32.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 5) / 5) * (21.5-(0.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.5 + (((tickAnim - 10) / 10) * (0-(21.5)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 17.25 + (((tickAnim - 5) / 5) * (-18.5-(17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.5 + (((tickAnim - 10) / 10) * (0-(-18.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = -0.1 + (((tickAnim - 5) / 15) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12.75 + (((tickAnim - 5) / 3) * (-4.5-(12.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 8) / 2) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (40-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (0-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.25 + (((tickAnim - 10) / 10) * (0-(1.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6 + (((tickAnim - 10) / 10) * (0-(6)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13.25 + (((tickAnim - 10) / 10) * (0-(13.25)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 37 + (((tickAnim - 20) / 15) * (-16.5-(37)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 35) / 15) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23 + (((tickAnim - 20) / 3) * (36-(23)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 36 + (((tickAnim - 23) / 12) * (-4-(36)));
            yy = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 35) / 15) * (0-(-4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-24.8676-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.48141-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.82288-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -24.8676 + (((tickAnim - 20) / 8) * (-52.1838-(-24.8676)));
            yy = -1.48141 + (((tickAnim - 20) / 8) * (-0.74071-(-1.48141)));
            zz = -1.82288 + (((tickAnim - 20) / 8) * (-0.91144-(-1.82288)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -52.1838 + (((tickAnim - 28) / 3) * (-52.1838-(-52.1838)));
            yy = -0.74071 + (((tickAnim - 28) / 3) * (-0.74071-(-0.74071)));
            zz = -0.91144 + (((tickAnim - 28) / 3) * (-0.91144-(-0.91144)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -52.1838 + (((tickAnim - 31) / 4) * (0-(-52.1838)));
            yy = -0.74071 + (((tickAnim - 31) / 4) * (0-(-0.74071)));
            zz = -0.91144 + (((tickAnim - 31) / 4) * (0-(-0.91144)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -0.45 + (((tickAnim - 20) / 8) * (0-(-0.45)));
            zz = -0.3 + (((tickAnim - 20) / 8) * (-0.65-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = -0.65 + (((tickAnim - 28) / 3) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (-1.025-(0)));
            zz = -0.65 + (((tickAnim - 31) / 4) * (-0.3-(-0.65)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.025 + (((tickAnim - 35) / 15) * (0-(-1.025)));
            zz = -0.3 + (((tickAnim - 35) / 15) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8.15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 8.15 + (((tickAnim - 8) / 12) * (68.5-(8.15)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 20) / 8) * (79.5-(68.5)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 79.5 + (((tickAnim - 28) / 3) * (79.5-(79.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 79.5 + (((tickAnim - 31) / 4) * (20.5-(79.5)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 35) / 15) * (0-(20.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.45-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (2.2-(0)));
            zz = -1.45 + (((tickAnim - 20) / 8) * (-1.57-(-1.45)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 2.2 + (((tickAnim - 28) / 3) * (2.2-(2.2)));
            zz = -1.57 + (((tickAnim - 28) / 3) * (-1.57-(-1.57)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 2.2 + (((tickAnim - 31) / 4) * (0-(2.2)));
            zz = -1.57 + (((tickAnim - 31) / 4) * (0-(-1.57)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17.25 + (((tickAnim - 18) / 15) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17.25 + (((tickAnim - 33) / 17) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-10.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (3.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -10.7 + (((tickAnim - 18) / 15) * (-10.7-(-10.7)));
            zz = 3.15 + (((tickAnim - 18) / 15) * (3.15-(3.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10.7 + (((tickAnim - 33) / 17) * (0-(-10.7)));
            zz = 3.15 + (((tickAnim - 33) / 17) * (0-(3.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 18) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 33) / 17) * (0-(6)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.75 + (((tickAnim - 18) / 15) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 33) / 17) * (0-(11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10.25 + (((tickAnim - 18) / 15) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 33) / 17) * (0-(10.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -17 + (((tickAnim - 18) / 15) * (-17-(-17)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -17 + (((tickAnim - 33) / 17) * (0-(-17)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -14.5 + (((tickAnim - 18) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = -14.5 + (((tickAnim - 33) / 8) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 18) / 15) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 4.5 + (((tickAnim - 33) / 8) * (-7.64-(4.5)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -7.64 + (((tickAnim - 41) / 9) * (0-(-7.64)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -7.25 + (((tickAnim - 8) / 10) * (14-(-7.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 18) / 15) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 14 + (((tickAnim - 33) / 8) * (-10.67-(14)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -10.67 + (((tickAnim - 41) / 9) * (0-(-10.67)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.65-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -0.65 + (((tickAnim - 18) / 15) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -0.65 + (((tickAnim - 33) / 17) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.96-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2.96 + (((tickAnim - 8) / 10) * (11.75-(-2.96)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 11.75 + (((tickAnim - 18) / 15) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 11.75 + (((tickAnim - 33) / 8) * (-5.35-(11.75)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -5.35 + (((tickAnim - 41) / 9) * (0-(-5.35)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 18) / 15) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 8.25 + (((tickAnim - 33) / 8) * (40.07-(8.25)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 40.07 + (((tickAnim - 41) / 3) * (-7.75-(40.07)));
            yy = 0 + (((tickAnim - 41) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 3) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 44) / 6) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -30 + (((tickAnim - 18) / 15) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 33) / 17) * (0-(-30)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 54.25 + (((tickAnim - 18) / 15) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 54.25 + (((tickAnim - 33) / 17) * (0-(54.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-82.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -82.75 + (((tickAnim - 18) / 15) * (-82.75-(-82.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -82.75 + (((tickAnim - 33) / 17) * (0-(-82.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 15) * (0.025-(0.025)));
            zz = -1.325 + (((tickAnim - 18) / 15) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.025 + (((tickAnim - 33) / 17) * (0-(0.025)));
            zz = -1.325 + (((tickAnim - 33) / 17) * (0-(-1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (77.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 77.5 + (((tickAnim - 18) / 15) * (77.5-(77.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 77.5 + (((tickAnim - 33) / 17) * (0-(77.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.52-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.15 + (((tickAnim - 8) / 10) * (0-(1.15)));
            zz = -0.52 + (((tickAnim - 8) / 10) * (-1.225-(-0.52)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -1.225 + (((tickAnim - 18) / 15) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (1.4-(0)));
            zz = -1.225 + (((tickAnim - 33) / 9) * (-0.58-(-1.225)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 1.4 + (((tickAnim - 42) / 8) * (0-(1.4)));
            zz = -0.58 + (((tickAnim - 42) / 8) * (0-(-0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -30 + (((tickAnim - 18) / 15) * (-30-(-30)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 33) / 17) * (0-(-30)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (54.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 54.25 + (((tickAnim - 18) / 15) * (54.25-(54.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 54.25 + (((tickAnim - 33) / 17) * (0-(54.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-82.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -82.75 + (((tickAnim - 18) / 15) * (-82.75-(-82.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -82.75 + (((tickAnim - 33) / 17) * (0-(-82.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.025 + (((tickAnim - 18) / 15) * (0.025-(0.025)));
            zz = -1.325 + (((tickAnim - 18) / 15) * (-1.325-(-1.325)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.025 + (((tickAnim - 33) / 17) * (0-(0.025)));
            zz = -1.325 + (((tickAnim - 33) / 17) * (0-(-1.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (77.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 77.5 + (((tickAnim - 18) / 15) * (77.5-(77.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 77.5 + (((tickAnim - 33) / 17) * (0-(77.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.52-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 1.15 + (((tickAnim - 8) / 10) * (0-(1.15)));
            zz = -0.52 + (((tickAnim - 8) / 10) * (-1.225-(-0.52)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -1.225 + (((tickAnim - 18) / 15) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (1.4-(0)));
            zz = -1.225 + (((tickAnim - 33) / 9) * (-0.58-(-1.225)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 1.4 + (((tickAnim - 42) / 8) * (0-(1.4)));
            zz = -0.58 + (((tickAnim - 42) / 8) * (0-(-0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-12), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-15), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*12), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(9.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather.rotateAngleY + (float) Math.toRadians(0), feather.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather2.rotateAngleY + (float) Math.toRadians(0), feather2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather3.rotateAngleY + (float) Math.toRadians(0), feather3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather4, feather4.rotateAngleX + (float) Math.toRadians(0), feather4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather5, feather5.rotateAngleX + (float) Math.toRadians(0), feather5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-15), feather5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather6, feather6.rotateAngleX + (float) Math.toRadians(0), feather6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather7, feather7.rotateAngleX + (float) Math.toRadians(0), feather7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-15), feather7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather8, feather8.rotateAngleX + (float) Math.toRadians(0), feather8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather9, feather9.rotateAngleX + (float) Math.toRadians(0), feather9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*-15), feather9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather10, feather10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), feather10.rotateAngleY + (float) Math.toRadians(0), feather10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*7), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*7), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*7), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*1.3);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-75))*-7), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*6), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(16+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*-4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-450))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-650))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.2);


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(23.75), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather10, feather10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*15), feather10.rotateAngleY + (float) Math.toRadians(0), feather10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-10), feather.rotateAngleY + (float) Math.toRadians(0), feather.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-10), feather2.rotateAngleY + (float) Math.toRadians(0), feather2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-10), feather3.rotateAngleY + (float) Math.toRadians(0), feather3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather4, feather4.rotateAngleX + (float) Math.toRadians(0), feather4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-10), feather4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather5, feather5.rotateAngleX + (float) Math.toRadians(0), feather5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-10), feather5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather6, feather6.rotateAngleX + (float) Math.toRadians(0), feather6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-15), feather6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather7, feather7.rotateAngleX + (float) Math.toRadians(0), feather7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-15), feather7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather8, feather8.rotateAngleX + (float) Math.toRadians(0), feather8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-15), feather8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather9, feather9.rotateAngleX + (float) Math.toRadians(0), feather9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-15), feather9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather11, feather11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*15), feather11.rotateAngleY + (float) Math.toRadians(0), feather11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-180))*-8), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*-4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*8), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-8), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-180))*-8), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*-4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-250))*8), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-300))*-8), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*-5), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*-7), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-100))*-8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*-7), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-200))*-10), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -14.70175 + (((tickAnim - 0) / 7) * (30.50476-(-14.70175)));
            yy = 1.86682 + (((tickAnim - 0) / 7) * (-8.7728-(1.86682)));
            zz = 2.9611 + (((tickAnim - 0) / 7) * (2.01739-(2.9611)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 30.50476 + (((tickAnim - 7) / 6) * (-14.70175-(30.50476)));
            yy = -8.7728 + (((tickAnim - 7) / 6) * (1.86682-(-8.7728)));
            zz = 2.01739 + (((tickAnim - 7) / 6) * (2.9611-(2.01739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -4.75 + (((tickAnim - 0) / 7) * (34.25-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 34.25 + (((tickAnim - 7) / 2) * (177.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(34.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 177.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 9) / 4) * (-4.75-(177.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 7) * (0.15-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.15 + (((tickAnim - 7) / 6) * (-0.225-(0.15)));
            zz = -0.25 + (((tickAnim - 7) / 6) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (-1.5-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 7) / 3) * (-54.37-(-1.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -54.37 + (((tickAnim - 10) / 2) * (-54.37-(-54.37)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -54.37 + (((tickAnim - 12) / 1) * (6.75-(-54.37)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 7) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.6-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = -0.6 + (((tickAnim - 10) / 2) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.35-(0)));
            zz = -0.6 + (((tickAnim - 12) / 1) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 16.89409 + (((tickAnim - 0) / 2) * (-9-(16.89409)));
            yy = 2.0685 + (((tickAnim - 0) / 2) * (0-(2.0685)));
            zz = -4.57468 + (((tickAnim - 0) / 2) * (0-(-4.57468)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -9 + (((tickAnim - 2) / 5) * (55.5-(-9)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 55.5 + (((tickAnim - 7) / 3) * (88.88-(55.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 88.88 + (((tickAnim - 10) / 2) * (88.88-(88.88)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 88.88 + (((tickAnim - 12) / 1) * (16.89409-(88.88)));
            yy = 0 + (((tickAnim - 12) / 1) * (2.0685-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-4.57468-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 3) * (1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(1.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 3) / 2) * (-0.225-(1.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.79-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 2) * (1.175-(-0.225)));
            zz = -0.79 + (((tickAnim - 5) / 2) * (-1.325-(-0.79)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 7) / 3) * (0.59-(1.175)));
            zz = -1.325 + (((tickAnim - 7) / 3) * (-1.835-(-1.325)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 10) / 2) * (0.59-(0.59)));
            zz = -1.835 + (((tickAnim - 10) / 2) * (-1.835-(-1.835)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.59 + (((tickAnim - 12) / 1) * (0-(0.59)));
            zz = -1.835 + (((tickAnim - 12) / 1) * (0-(-1.835)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 30.50476 + (((tickAnim - 0) / 7) * (-14.70175-(30.50476)));
            yy = 8.7728 + (((tickAnim - 0) / 7) * (-1.86682-(8.7728)));
            zz = 2.01739 + (((tickAnim - 0) / 7) * (-2.9611-(2.01739)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -14.70175 + (((tickAnim - 7) / 6) * (30.50476-(-14.70175)));
            yy = -1.86682 + (((tickAnim - 7) / 6) * (8.7728-(-1.86682)));
            zz = -2.9611 + (((tickAnim - 7) / 6) * (2.01739-(-2.9611)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 34.25 + (((tickAnim - 0) / 3) * (89.305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(34.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 89.305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 3) / 4) * (-4.75-(89.305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -4.75 + (((tickAnim - 7) / 6) * (34.25-(-4.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 7) * (-0.225-(0.15)));
            zz = -0.25 + (((tickAnim - 0) / 7) * (0-(-0.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 6) * (0.15-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -1.5 + (((tickAnim - 0) / 3) * (-54.37-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -54.37 + (((tickAnim - 3) / 2) * (-54.37-(-54.37)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -54.37 + (((tickAnim - 5) / 2) * (6.75-(-54.37)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 7) / 6) * (-1.5-(6.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.6 + (((tickAnim - 3) / 2) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.35-(0)));
            zz = -0.6 + (((tickAnim - 5) / 2) * (0-(-0.6)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 55.5 + (((tickAnim - 0) / 5) * (88.88-(55.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 88.88 + (((tickAnim - 5) / 2) * (15.38488-(88.88)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.35113-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (5.50631-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 15.38488 + (((tickAnim - 7) / 1) * (-9.5-(15.38488)));
            yy = -0.35113 + (((tickAnim - 7) / 1) * (0-(-0.35113)));
            zz = 5.50631 + (((tickAnim - 7) / 1) * (0-(5.50631)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -9.5 + (((tickAnim - 8) / 5) * (55.5-(-9.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 5) * (0.59-(1.175)));
            zz = -1.325 + (((tickAnim - 0) / 5) * (-1.835-(-1.325)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.59 + (((tickAnim - 5) / 2) * (0.85-(0.59)));
            zz = -1.835 + (((tickAnim - 5) / 2) * (0-(-1.835)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 7) / 2) * (7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0.85)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 9) / 3) * (-0.225-(7.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            zz = 0 + (((tickAnim - 9) / 3) * (-0.79-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.225 + (((tickAnim - 12) / 1) * (1.175-(-0.225)));
            zz = -0.79 + (((tickAnim - 12) / 1) * (-1.325-(-0.79)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEotyrannus entity = (EntityPrehistoricFloraEotyrannus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -14.75 + (((tickAnim - 0) / 15) * (23.25-(-14.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 23.25 + (((tickAnim - 15) / 10) * (199.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(23.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 199.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 25) / 5) * (-14.75-(199.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -4.75 + (((tickAnim - 0) / 15) * (38.85-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 38.85 + (((tickAnim - 15) / 4) * (134.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120-(38.85)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 134.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120 + (((tickAnim - 19) / 7) * (18.46-(134.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-120)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 18.46 + (((tickAnim - 26) / 4) * (-4.75-(18.46)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 15) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (-0.825-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            yy = -0.11 + (((tickAnim - 19) / 7) * (0.035-(-0.11)));
            zz = -0.825 + (((tickAnim - 19) / 7) * (-0.25-(-0.825)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.035 + (((tickAnim - 26) / 4) * (-0.225-(0.035)));
            zz = -0.25 + (((tickAnim - 26) / 4) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 6.75 + (((tickAnim - 0) / 14) * (-1.5-(6.75)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -1.5 + (((tickAnim - 14) / 7) * (72.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-1.5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 72.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 21) / 4) * (-53.12-(72.93+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -53.12 + (((tickAnim - 25) / 5) * (6.75-(-53.12)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 8) * (-0.67-(-0.35)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.67 + (((tickAnim - 8) / 5) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (-0.725-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.17 + (((tickAnim - 23) / 2) * (-0.17-(-0.17)));
            zz = -0.725 + (((tickAnim - 23) / 2) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = -0.17 + (((tickAnim - 25) / 5) * (-0.35-(-0.17)));
            zz = -0.725 + (((tickAnim - 25) / 5) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.75 + (((tickAnim - 0) / 3) * (-6.75-(12.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -6.75 + (((tickAnim - 3) / 5) * (-13.12-(-6.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.12 + (((tickAnim - 8) / 2) * (-0.75-(-13.12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.75 + (((tickAnim - 10) / 3) * (55.5-(-0.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 55.5 + (((tickAnim - 13) / 4) * (80.97-(55.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 80.97 + (((tickAnim - 17) / 6) * (91.38-(80.97)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 91.38 + (((tickAnim - 23) / 2) * (91.38-(91.38)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 91.38 + (((tickAnim - 25) / 5) * (12.75-(91.38)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (-0.55-(0.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.55 + (((tickAnim - 3) / 5) * (-1.15-(-0.55)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.15 + (((tickAnim - 8) / 5) * (1.175-(-1.15)));
            zz = 0 + (((tickAnim - 8) / 5) * (-1.325-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.175 + (((tickAnim - 13) / 4) * (-0.145-(1.175)));
            zz = -1.325 + (((tickAnim - 13) / 4) * (-1.57-(-1.325)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.145 + (((tickAnim - 17) / 6) * (0.19-(-0.145)));
            zz = -1.57 + (((tickAnim - 17) / 6) * (-1.735-(-1.57)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 23) / 2) * (0.19-(0.19)));
            zz = -1.735 + (((tickAnim - 23) / 2) * (-1.735-(-1.735)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.19 + (((tickAnim - 25) / 5) * (0.125-(0.19)));
            zz = -1.735 + (((tickAnim - 25) / 5) * (0-(-1.735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30.35 + (((tickAnim - 0) / 10) * (277.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-330-(30.35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 277.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-330 + (((tickAnim - 10) / 5) * (-14.75-(277.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+40))*-330)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -14.75 + (((tickAnim - 15) / 15) * (30.35-(-14.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 23.75 + (((tickAnim - 0) / 4) * (24.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120-(23.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 24.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120 + (((tickAnim - 4) / 7) * (21.775-(24.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*120)));
            yy = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 7) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 21.775 + (((tickAnim - 11) / 4) * (-4.75-(21.775)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 15) / 15) * (23.75-(-4.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.285-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.75-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 4) / 7) * (0-(0)));
            yy = -0.285 + (((tickAnim - 4) / 7) * (0.385-(-0.285)));
            zz = -0.75 + (((tickAnim - 4) / 7) * (-0.25-(-0.75)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.385 + (((tickAnim - 11) / 4) * (-0.225-(0.385)));
            zz = -0.25 + (((tickAnim - 11) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.225 + (((tickAnim - 15) / 15) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.5 + (((tickAnim - 0) / 4) * (-0.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150 + (((tickAnim - 4) / 6) * (-53.12-(-0.07+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-150)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -53.12 + (((tickAnim - 10) / 5) * (6.75-(-53.12)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 15) / 15) * (-1.5-(6.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.725-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.17 + (((tickAnim - 8) / 2) * (-0.17-(-0.17)));
            zz = -0.725 + (((tickAnim - 8) / 2) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.17 + (((tickAnim - 10) / 5) * (-0.35-(-0.17)));
            zz = -0.725 + (((tickAnim - 10) / 5) * (0-(-0.725)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 15) / 8) * (-0.67-(-0.35)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -0.67 + (((tickAnim - 23) / 5) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.5 + (((tickAnim - 0) / 3) * (80.97-(55.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 80.97 + (((tickAnim - 3) / 5) * (89.38-(80.97)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 89.38 + (((tickAnim - 8) / 2) * (91.38-(89.38)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 91.38 + (((tickAnim - 10) / 5) * (12.75-(91.38)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 12.75 + (((tickAnim - 15) / 4) * (-8.18-(12.75)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -8.18 + (((tickAnim - 19) / 3) * (-12.84-(-8.18)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -12.84 + (((tickAnim - 22) / 1) * (-13.12-(-12.84)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -13.12 + (((tickAnim - 23) / 4) * (-0.75-(-13.12)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 27) / 3) * (55.5-(-0.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 3) * (-0.145-(1.175)));
            zz = -1.325 + (((tickAnim - 0) / 3) * (-1.57-(-1.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.145 + (((tickAnim - 3) / 5) * (1.49-(-0.145)));
            zz = -1.57 + (((tickAnim - 3) / 5) * (-1.735-(-1.57)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 8) / 2) * (0.19-(1.49)));
            zz = -1.735 + (((tickAnim - 8) / 2) * (-1.735-(-1.735)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 5) * (0.5-(0.19)));
            zz = -1.735 + (((tickAnim - 10) / 5) * (0-(-1.735)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 15) / 2) * (0.335-(0.5)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.335 + (((tickAnim - 17) / 2) * (-0.275-(0.335)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 19) / 3) * (-0.61-(-0.275)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.61 + (((tickAnim - 22) / 1) * (-0.7-(-0.61)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = -0.7 + (((tickAnim - 23) / 4) * (-0.105-(-0.7)));
            zz = 0 + (((tickAnim - 23) / 4) * (-0.66-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.105 + (((tickAnim - 27) / 3) * (1.175-(-0.105)));
            zz = -0.66 + (((tickAnim - 27) / 3) * (-1.325-(-0.66)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+90))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+90))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-10))*0.75);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-2.7), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+90))*-4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*3.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*2.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+130))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*2.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+130))*4));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*3.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+100))*-4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-400))*3.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather, feather.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-9), feather.rotateAngleY + (float) Math.toRadians(0), feather.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather2, feather2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-9), feather2.rotateAngleY + (float) Math.toRadians(0), feather2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather3, feather3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-9), feather3.rotateAngleY + (float) Math.toRadians(0), feather3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather4, feather4.rotateAngleX + (float) Math.toRadians(0), feather4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-7), feather4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather5, feather5.rotateAngleX + (float) Math.toRadians(0), feather5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*7), feather5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather6, feather6.rotateAngleX + (float) Math.toRadians(0), feather6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-7), feather6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather7, feather7.rotateAngleX + (float) Math.toRadians(0), feather7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*7), feather7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather8, feather8.rotateAngleX + (float) Math.toRadians(0), feather8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*-7), feather8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather9, feather9.rotateAngleX + (float) Math.toRadians(0), feather9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*7), feather9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather10, feather10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*7), feather10.rotateAngleY + (float) Math.toRadians(0), feather10.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(feather11, feather11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-450))*7), feather11.rotateAngleY + (float) Math.toRadians(0), feather11.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*-5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-220))*8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-260))*12), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*19), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-4));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*-3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*-3.5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-170))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-1), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*-3.5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*-2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-170))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-1), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEotyrannus e = (EntityPrehistoricFloraEotyrannus) entity;
        animator.update(entity);

    }
}
