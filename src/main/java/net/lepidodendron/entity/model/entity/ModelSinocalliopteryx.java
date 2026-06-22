package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSinocalliopteryx;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSinocalliopteryx extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private ModelAnimator animator;

    public ModelSinocalliopteryx() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 9.575F, 1.0F);
        this.setRotateAngle(hips, -0.0436F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.9009F, -2.4314F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 59, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.7509F, -0.3314F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 8, -2.0F, -1.0F, -2.0F, 4, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.4759F, -0.0314F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 58, 20, -1.5F, -2.0F, -2.0F, 2, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0009F, -1.3814F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 23, -2.5F, -1.0F, -1.0F, 5, 7, 4, 0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5759F, -2.2564F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.025F, -0.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0785F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 0, -1.5F, -1.0F, -6.0F, 3, 1, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.85F, -0.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 43, -0.5F, -2.0F, -6.0F, 1, 2, 7, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.175F, -10.5F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.5F, -2.0F, 4.0F, 5, 6, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.6195F, -6.3684F);
        this.body.addChild(chest);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -2.225F, -1.0F);
        this.chest.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 15, -2.0F, -1.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.125F, -2.275F);
        this.chest.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 59, -0.5F, -1.0F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.4305F, -5.5566F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 8, -2.0F, -2.0F, 2.0F, 4, 5, 4, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 2.4055F, -2.9066F);
        this.chest.addChild(neck1);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3589F, -0.865F);
        this.neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 53, -1.5F, -4.0F, -2.0F, 3, 4, 3, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.7339F, -2.39F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.81F, -2.4594F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 32, -1.0F, -2.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.95F, -2.9F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.3926F, -1.8719F);
        this.neck3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 58, 26, -1.0F, -1.9754F, -0.0184F, 2, 3, 3, -0.001F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -4.0426F, -0.8219F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.0873F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.9328F, -1.1088F);
        this.neck4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 61, -1.0F, -2.9978F, -1.0249F, 2, 3, 2, -0.003F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.0605F, -1.9698F);
        this.neck4.addChild(Head);
        this.setRotateAngle(Head, 0.2443F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.455F, 2.2624F, -5.2467F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3229F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 32, -0.045F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.455F, 1.1624F, 0.2283F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2356F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 64, -0.545F, -1.2426F, -1.9395F, 2, 2, 2, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.455F, 2.3939F, -1.4463F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 60, -0.545F, -1.0022F, -1.0249F, 2, 1, 3, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.455F, 1.1624F, 0.2283F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 32, -0.545F, -1.2418F, -2.6933F, 2, 1, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.605F, 1.7874F, -1.0526F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0044F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 32, -1.605F, -1.0022F, -1.0249F, 2, 1, 1, 0.03F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.545F, 2.2124F, -1.5526F);
        this.Head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1178F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 64, -1.045F, -0.8416F, -3.0797F, 1, 1, 3, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.555F, 2.4374F, -6.6275F);
        this.Head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 68, -0.955F, -0.6322F, 0.1637F, 0, 1, 2, -0.001F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 68, 63, -0.155F, -0.6322F, 0.1637F, 0, 1, 2, -0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.855F, 4.5124F, -1.9776F);
        this.Head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 68, -1.257F, -2.8348F, -2.4946F, 0, 1, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 68, -0.453F, -2.8348F, -2.4946F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.555F, 2.5374F, -6.5275F);
        this.Head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0654F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 66, 0.055F, -0.9263F, -0.0516F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.455F, 1.1874F, 0.2283F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.24F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 64, 39, -0.045F, -1.2504F, -5.6864F, 1, 1, 3, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.196F, 0.0791F);
        this.Head.addChild(jaw);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.475F, 1.5025F, -3.0175F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 26, 64, -0.975F, -1.6611F, -1.694F, 1, 1, 3, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1F, 2.1525F, -3.7425F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0436F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 62, 43, -0.5F, -2.5198F, -2.8378F, 0, 1, 4, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 61, 0.3F, -2.5198F, -2.8378F, 0, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.8525F, 0.6075F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 62, 48, -1.0F, -2.7027F, -3.2784F, 2, 2, 2, -0.001F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 2.4525F, -3.8675F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 60, -0.5F, -2.5198F, -2.8378F, 1, 1, 2, -0.003F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 2.4275F, 0.2325F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0262F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 54, 39, -1.0F, -2.5201F, -2.8374F, 2, 1, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.925F, 2.2805F, -2.7066F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 1.1345F, -0.1745F, 0.0F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 12, 68, -0.8277F, -0.0275F, -0.2628F, 1, 3, 1, 0.001F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.1723F, 3.9975F, 1.1372F);
        this.rightarm.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 68, -1.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.3027F, 2.9725F, 1.0622F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.4835F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 68, -0.45F, -0.0125F, -1.0909F, 1, 3, 1, 0.001F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.55F, 3.0125F, 0.2091F);
        this.rightarm2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 26, 68, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.325F, 2.9625F, -0.5909F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0873F, 0.0F, -0.2182F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 34, 66, -0.0834F, -0.0791F, -0.2115F, 1, 4, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.9666F, 1.9709F, 0.3385F);
        this.rightarm3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 30, 68, -1.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.925F, 2.2805F, -2.7066F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 1.1345F, 0.1745F, 0.0F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 12, 68, -0.1723F, -0.0275F, -0.2628F, 1, 3, 1, 0.001F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.1723F, 3.9975F, 1.1372F);
        this.leftarm.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0436F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 8, 68, 0.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.3027F, 2.9725F, 1.0622F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.4835F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 68, -0.55F, -0.0125F, -1.0909F, 1, 3, 1, 0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.55F, 3.0125F, 0.2091F);
        this.leftarm2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0436F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 26, 68, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.325F, 2.9625F, -0.5909F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0873F, 0.0F, 0.2182F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 34, 66, -0.9166F, -0.0791F, -0.2115F, 1, 4, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.9666F, 1.9709F, 0.3385F);
        this.leftarm3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0873F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 30, 68, 0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.0009F, 1.5436F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 28, 53, -1.5F, 2.35F, -0.25F, 3, 2, 4, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -1.35F, 0.15F);
        this.tail1.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1309F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 58, 10, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, -1.375F, -0.05F);
        this.tail1.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1745F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 59, 0.0F, -2.0F, 0.0F, 1, 2, 4, -0.001F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.tail1.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0873F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 24, -2.0F, -2.0F, -1.0F, 4, 4, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 36, 34, -1.0F, 1.6F, -0.625F, 2, 2, 7, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -0.8F, 1.05F);
        this.tail2.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1309F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 44, 0, -0.5F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.25F, 0.375F);
        this.tail2.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0436F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 22, 13, -1.5F, -1.0F, -1.0F, 3, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.275F, 6.325F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, -1.0F, -1.025F, -1.025F, 2, 2, 9, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.875F, 0.975F);
        this.tail3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0349F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 34, -0.5F, -1.0F, -1.0F, 1, 1, 8, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.9F, 0.9F);
        this.tail3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0436F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 40, 23, -0.5F, -1.0F, -1.0F, 1, 1, 8, -0.001F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.225F, 8.05F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 18, 34, -0.5F, -0.525F, -0.825F, 1, 1, 8, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 50, 0.0F, -1.0F, 0.0F, 0, 2, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 43, -1.0F, 0.0F, 0.0F, 2, 0, 7, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.075F, 7.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 14, 52, -0.5F, -0.45F, -0.05F, 1, 1, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 53, 0.0F, -0.95F, 0.0F, 0, 2, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 42, 17, -1.0F, 0.05F, 0.0F, 2, 0, 6, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-2.525F, -0.6009F, -0.2314F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.2618F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 34, 43, -1.2F, -0.1373F, -1.919F, 3, 6, 4, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.3F, 1.953F, 2.5565F);
        this.rightleg.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0436F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 16, 65, -1.0F, -2.0F, -1.0F, 0, 6, 2, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.025F, 5.7877F, -1.694F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.6458F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 59, -1.0F, 0.0091F, -0.0378F, 2, 7, 2, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.375F, 3.0F, 2.725F);
        this.rightleg2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0436F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 42, 66, -1.0F, -2.0F, -1.0F, 0, 6, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 6.9841F, 1.6872F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6109F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 20, 65, -0.95F, -0.1744F, -0.9856F, 2, 4, 1, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.1F, 3.9006F, -0.2856F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.2618F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 58, 5, -1.6F, -0.6591F, -3.7588F, 3, 1, 4, 0.0F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(2.525F, -0.6009F, -0.2314F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.2618F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 34, 43, -1.8F, -0.1373F, -1.919F, 3, 6, 4, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.3F, 1.953F, 2.5565F);
        this.leftleg.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 16, 65, 1.0F, -2.0F, -1.0F, 0, 6, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.025F, 5.7877F, -1.694F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.6458F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 59, -1.0F, 0.0091F, -0.0378F, 2, 7, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.375F, 3.0F, 2.725F);
        this.leftleg2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0436F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 66, 1.0F, -2.0F, -1.0F, 0, 6, 1, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 6.9841F, 1.6872F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6109F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 20, 65, -1.05F, -0.1744F, -0.9856F, 2, 4, 1, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.1F, 3.9006F, -0.2856F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.2618F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 58, 5, -1.4F, -0.6591F, -3.7588F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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
        this.hips.offsetY = -0.650F;
        this.hips.offsetX = 0.1F;
        this.hips.rotateAngleY = (float)Math.toRadians(225);
        this.hips.rotateAngleX = (float)Math.toRadians(-10);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 1.15F;
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

        EntityPrehistoricFloraSinocalliopteryx EntityMegalosaurus = (EntityPrehistoricFloraSinocalliopteryx) e;
        //this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.Head};
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
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, -0.05F, f2, 1F);

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
        EntityPrehistoricFloraSinocalliopteryx ee = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            //animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 6) * (49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-6.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 4) / 6) * (4.62302-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-1.16569-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 10) / 5) * (0-(49.4431+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 4.62302 + (((tickAnim - 10) / 5) * (0-(4.62302)));
            zz = -1.16569 + (((tickAnim - 10) / 5) * (0-(-1.16569)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 4) / 6) * (-15.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-12.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 4) / 6) * (-8.16366-(0)));
            zz = 1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 4) / 6) * (4.29254-(1.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 10) / 5) * (0-(-15.141+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = -8.16366 + (((tickAnim - 10) / 5) * (0-(-8.16366)));
            zz = 4.29254 + (((tickAnim - 10) / 5) * (0-(4.29254)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 4) / 4) * (1.54613-(5.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (-5.36501-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (4.63148-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.54613 + (((tickAnim - 8) / 2) * (-0.50841-(1.54613)));
            yy = -5.36501 + (((tickAnim - 8) / 2) * (0.58408-(-5.36501)));
            zz = 4.63148 + (((tickAnim - 8) / 2) * (-1.64968-(4.63148)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.50841 + (((tickAnim - 10) / 5) * (0-(-0.50841)));
            yy = 0.58408 + (((tickAnim - 10) / 5) * (0-(0.58408)));
            zz = -1.64968 + (((tickAnim - 10) / 5) * (0-(-1.64968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 4) / 4) * (-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 0 + (((tickAnim - 4) / 4) * (1.04783-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-3.00475-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 8) / 2) * (-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-4.4818+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 1.04783 + (((tickAnim - 8) / 2) * (1.64659-(1.04783)));
            zz = -3.00475 + (((tickAnim - 8) / 2) * (-4.72175-(-3.00475)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 10) / 5) * (0-(-108.3429+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 1.64659 + (((tickAnim - 10) / 5) * (0-(1.64659)));
            zz = -4.72175 + (((tickAnim - 10) / 5) * (0-(-4.72175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (-0.68-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.72-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.68 + (((tickAnim - 9) / 1) * (-0.575-(-0.68)));
            zz = 0.72 + (((tickAnim - 9) / 1) * (0.7-(0.72)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.575 + (((tickAnim - 10) / 5) * (0-(-0.575)));
            zz = 0.7 + (((tickAnim - 10) / 5) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 4) / 6) * (-14.73386-(-8.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (-4.48108-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-0.4126-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -14.73386 + (((tickAnim - 10) / 5) * (0-(-14.73386)));
            yy = -4.48108 + (((tickAnim - 10) / 5) * (0-(-4.48108)));
            zz = -0.4126 + (((tickAnim - 10) / 5) * (0-(-0.4126)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));

        this.Head.rotationPointX = this.Head.rotationPointX + (float)(0);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(0);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (38-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 38 + (((tickAnim - 8) / 2) * (0-(38)));
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
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.5 + (((tickAnim - 10) / 10) * (0-(34.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.25 + (((tickAnim - 10) / 10) * (0-(14.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.5 + (((tickAnim - 10) / 10) * (0-(8.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 17.5 + (((tickAnim - 10) / 10) * (0-(17.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 22.25 + (((tickAnim - 5) / 3) * (-0.37-(22.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.37 + (((tickAnim - 8) / 2) * (0-(-0.37)));
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
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (28-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28 + (((tickAnim - 8) / 2) * (0-(28)));
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
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 34.25 + (((tickAnim - 15) / 15) * (0-(34.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (34.25-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 34.25 + (((tickAnim - 45) / 15) * (0-(34.25)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 29.75 + (((tickAnim - 15) / 5) * (45.83-(29.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 45.83 + (((tickAnim - 20) / 10) * (0-(45.83)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (29.75-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 29.75 + (((tickAnim - 45) / 5) * (45.83-(29.75)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 45.83 + (((tickAnim - 50) / 10) * (0-(45.83)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -32.25 + (((tickAnim - 15) / 8) * (-54.37-(-32.25)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -54.37 + (((tickAnim - 23) / 4) * (-54.37-(-54.37)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -54.37 + (((tickAnim - 27) / 3) * (0-(-54.37)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -32.25 + (((tickAnim - 45) / 8) * (-54.37-(-32.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = -54.37 + (((tickAnim - 53) / 4) * (-54.37-(-54.37)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -54.37 + (((tickAnim - 57) / 3) * (0-(-54.37)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (75.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 75.5 + (((tickAnim - 15) / 8) * (86-(75.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 86 + (((tickAnim - 23) / 4) * (86-(86)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 86 + (((tickAnim - 27) / 3) * (0-(86)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (75.5-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 75.5 + (((tickAnim - 45) / 8) * (86-(75.5)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 86 + (((tickAnim - 53) / 4) * (86-(86)));
            yy = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 86 + (((tickAnim - 57) / 3) * (0-(86)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0.925-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 23) / 4) * (0.925-(0.925)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 27) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0.925-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 53) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 53) / 4) * (0.925-(0.925)));
            zz = 0 + (((tickAnim - 53) / 4) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 57) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
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
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20 + (((tickAnim - 15) / 20) * (-20-(-20)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 35) / 15) * (0-(-20)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.45-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -7.725 + (((tickAnim - 15) / 20) * (-7.725-(-7.725)));
            zz = 1.45 + (((tickAnim - 15) / 20) * (1.45-(1.45)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -7.725 + (((tickAnim - 35) / 15) * (0-(-7.725)));
            zz = 1.45 + (((tickAnim - 35) / 15) * (0-(1.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19.75 + (((tickAnim - 15) / 20) * (19.75-(19.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 19.75 + (((tickAnim - 35) / 15) * (0-(19.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
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
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 8) / 7) * (15.75-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 15) / 20) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15.75 + (((tickAnim - 35) / 5) * (0-(15.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (2-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 15) / 20) * (2-(2)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 35) / 5) * (0-(2)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -10.75 + (((tickAnim - 43) / 7) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (9.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.5 + (((tickAnim - 15) / 20) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 9.5 + (((tickAnim - 35) / 8) * (0-(9.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -26.5 + (((tickAnim - 15) / 20) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 35) / 15) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 50 + (((tickAnim - 15) / 20) * (50-(50)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 35) / 15) * (0-(50)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-76.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -76.75 + (((tickAnim - 15) / 20) * (-76.75-(-76.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -76.75 + (((tickAnim - 35) / 15) * (0-(-76.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 15) / 20) * (-0.475-(-0.475)));
            zz = -0.4 + (((tickAnim - 15) / 20) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.475 + (((tickAnim - 35) / 15) * (0-(-0.475)));
            zz = -0.4 + (((tickAnim - 35) / 15) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (73.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.5 + (((tickAnim - 15) / 20) * (73.5-(73.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.5 + (((tickAnim - 35) / 15) * (0-(73.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -26.5 + (((tickAnim - 15) / 20) * (-26.5-(-26.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -26.5 + (((tickAnim - 35) / 15) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 50 + (((tickAnim - 15) / 20) * (50-(50)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 50 + (((tickAnim - 35) / 15) * (0-(50)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-76.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -76.75 + (((tickAnim - 15) / 20) * (-76.75-(-76.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -76.75 + (((tickAnim - 35) / 15) * (0-(-76.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.4-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.475 + (((tickAnim - 15) / 20) * (-0.475-(-0.475)));
            zz = -0.4 + (((tickAnim - 15) / 20) * (-0.4-(-0.4)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.475 + (((tickAnim - 35) / 15) * (0-(-0.475)));
            zz = -0.4 + (((tickAnim - 35) / 15) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (73.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 73.5 + (((tickAnim - 15) / 20) * (73.5-(73.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 73.5 + (((tickAnim - 35) / 15) * (0-(73.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 6) / 2) * (3.75-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.75 + (((tickAnim - 8) / 3) * (-1.5-(3.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -1.5 + (((tickAnim - 11) / 4) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (17.75-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 17.75 + (((tickAnim - 22) / 8) * (0-(17.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25 + (((tickAnim - 6) / 2) * (-26.91-(-25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -26.91 + (((tickAnim - 8) / 3) * (-25-(-26.91)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -25 + (((tickAnim - 11) / 4) * (-19.25-(-25)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -19.25 + (((tickAnim - 15) / 7) * (-25.94-(-19.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -25.94 + (((tickAnim - 22) / 8) * (0-(-25.94)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 6) / 2) * (-0.75-(-10)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 8) / 22) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.25 + (((tickAnim - 6) / 2) * (1.5-(9.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.5 + (((tickAnim - 8) / 7) * (9.25-(1.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 9.25 + (((tickAnim - 15) / 7) * (-5.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 22) / 8) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -11.25 + (((tickAnim - 8) / 3) * (6-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 11) / 4) * (-18.25-(6)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -18.25 + (((tickAnim - 15) / 7) * (0.75-(-18.25)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0.75 + (((tickAnim - 22) / 8) * (0-(0.75)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 40.5 + (((tickAnim - 6) / 2) * (0-(40.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (50-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 50 + (((tickAnim - 11) / 4) * (12-(50)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 12 + (((tickAnim - 15) / 7) * (49-(12)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 49 + (((tickAnim - 22) / 8) * (0-(49)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*-0.3);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(15.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-450))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-14.75), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-280))*10), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*12), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-400))*15), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-400))*5));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 40 + (((tickAnim - 0) / 4) * (-27.75-(40)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -27.75 + (((tickAnim - 4) / 2) * (-13.75-(-27.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -13.75 + (((tickAnim - 6) / 4) * (40-(-13.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 28 + (((tickAnim - 0) / 2) * (43.35-(28)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 43.35 + (((tickAnim - 2) / 2) * (4.5-(43.35)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 4.5 + (((tickAnim - 4) / 2) * (0-(4.5)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 4) / 2) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 6) / 4) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -16 + (((tickAnim - 0) / 2) * (-51.1-(-16)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -51.1 + (((tickAnim - 2) / 2) * (-21.25-(-51.1)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -21.25 + (((tickAnim - 4) / 2) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-16-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 4) / 2) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 6) / 4) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 71.25 + (((tickAnim - 0) / 2) * (92.2-(71.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 92.2 + (((tickAnim - 2) / 2) * (50.75-(92.2)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 50.75 + (((tickAnim - 4) / 2) * (15.25-(50.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 15.25 + (((tickAnim - 6) / 1) * (1-(15.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 7) / 3) * (71.25-(1)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.285-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.07-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 1.285 + (((tickAnim - 1) / 3) * (0.525-(1.285)));
            zz = 0.07 + (((tickAnim - 1) / 3) * (0.175-(0.07)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 4) / 2) * (1.025-(0.525)));
            zz = 0.175 + (((tickAnim - 4) / 2) * (0-(0.175)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.025 + (((tickAnim - 6) / 1) * (0.35-(1.025)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 7) / 3) * (0-(0.35)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -27.75 + (((tickAnim - 0) / 2) * (-13.75-(-27.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -13.75 + (((tickAnim - 2) / 4) * (40-(-13.75)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 6) / 4) * (-27.75-(40)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 9.5 + (((tickAnim - 0) / 2) * (0-(9.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 28 + (((tickAnim - 6) / 2) * (43.35-(28)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 43.35 + (((tickAnim - 8) / 2) * (9.5-(43.35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 2) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 4) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -21.25 + (((tickAnim - 0) / 2) * (0-(-21.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-16-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 6) / 2) * (-51.1-(-16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -51.1 + (((tickAnim - 8) / 2) * (-21.25-(-51.1)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 2) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -0.175 + (((tickAnim - 2) / 4) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
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
            xx = 50.75 + (((tickAnim - 0) / 2) * (15.25-(50.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 15.25 + (((tickAnim - 2) / 1) * (1-(15.25)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (75.75-(1)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 75.75 + (((tickAnim - 6) / 2) * (92.2-(75.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 92.2 + (((tickAnim - 8) / 2) * (50.75-(92.2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 2) * (-0.25-(0.525)));
            zz = 0.175 + (((tickAnim - 0) / 2) * (0-(0.175)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 2) / 4) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (1.285-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0.07-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 1.285 + (((tickAnim - 7) / 3) * (0.525-(1.285)));
            zz = 0.07 + (((tickAnim - 7) / 3) * (0.175-(0.07)));
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
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSinocalliopteryx entity = (EntityPrehistoricFloraSinocalliopteryx) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+80))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-20))*0.3);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-4));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*4));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*2), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*2), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-550))*2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-4), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*2), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-4), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*2), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-100))*2), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*8), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-550))*-3));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 33.5 + (((tickAnim - 0) / 10) * (-14.25-(33.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.25 + (((tickAnim - 10) / 10) * (33.5-(-14.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 28.5 + (((tickAnim - 0) / 2) * (35.33-(28.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 35.33 + (((tickAnim - 2) / 6) * (-9.91-(35.33)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -9.91 + (((tickAnim - 8) / 2) * (-4.25-(-9.91)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.25 + (((tickAnim - 10) / 10) * (28.5-(-4.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = -20.98075 + (((tickAnim - 0) / 3) * (-53.98556-(-20.98075)));
            yy = 0.03156 + (((tickAnim - 0) / 3) * (0.02367-(0.03156)));
            zz = 0.19244 + (((tickAnim - 0) / 3) * (0.14433-(0.19244)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -53.98556 + (((tickAnim - 3) / 3) * (-53.98556-(-53.98556)));
            yy = 0.02367 + (((tickAnim - 3) / 3) * (0.02367-(0.02367)));
            zz = 0.14433 + (((tickAnim - 3) / 3) * (0.14433-(0.14433)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -53.98556 + (((tickAnim - 6) / 4) * (10.25-(-53.98556)));
            yy = 0.02367 + (((tickAnim - 6) / 4) * (0-(0.02367)));
            zz = 0.14433 + (((tickAnim - 6) / 4) * (0-(0.14433)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 10) / 10) * (-20.98075-(10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.03156-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0.19244-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 55.25 + (((tickAnim - 0) / 3) * (84.81-(55.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 84.81 + (((tickAnim - 3) / 3) * (84.81-(84.81)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 84.81 + (((tickAnim - 6) / 4) * (8-(84.81)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 10) / 3) * (-8.25-(8)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 13) / 7) * (55.25-(-8.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.31-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 1.31 + (((tickAnim - 3) / 3) * (1.31-(1.31)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 1.31 + (((tickAnim - 6) / 4) * (-0.35-(1.31)));
            zz = 0 + (((tickAnim - 6) / 4) * (0.175-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 10) / 3) * (0-(-0.35)));
            zz = 0.175 + (((tickAnim - 10) / 3) * (0-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 16) / 4) * (0-(0.55)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -14.25 + (((tickAnim - 0) / 10) * (33.5-(-14.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 33.5 + (((tickAnim - 10) / 10) * (-14.25-(33.5)));
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
            xx = -4.25 + (((tickAnim - 0) / 10) * (28.5-(-4.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 28.5 + (((tickAnim - 10) / 2) * (35.33-(28.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 35.33 + (((tickAnim - 12) / 6) * (-9.91-(35.33)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.91 + (((tickAnim - 18) / 2) * (-4.25-(-9.91)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.25 + (((tickAnim - 0) / 10) * (-20.98075-(10.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.03156-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.19244-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20.98075 + (((tickAnim - 10) / 3) * (-53.98556-(-20.98075)));
            yy = 0.03156 + (((tickAnim - 10) / 3) * (0.02367-(0.03156)));
            zz = 0.19244 + (((tickAnim - 10) / 3) * (0.14433-(0.19244)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -53.98556 + (((tickAnim - 13) / 3) * (-53.98556-(-53.98556)));
            yy = 0.02367 + (((tickAnim - 13) / 3) * (0.02367-(0.02367)));
            zz = 0.14433 + (((tickAnim - 13) / 3) * (0.14433-(0.14433)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -53.98556 + (((tickAnim - 16) / 4) * (0-(-53.98556)));
            yy = 0.02367 + (((tickAnim - 16) / 4) * (0-(0.02367)));
            zz = 0.14433 + (((tickAnim - 16) / 4) * (0-(0.14433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 10) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
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
            xx = 8 + (((tickAnim - 0) / 3) * (-8.25-(8)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -8.25 + (((tickAnim - 3) / 7) * (55.25-(-8.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 55.25 + (((tickAnim - 10) / 3) * (84.81-(55.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 84.81 + (((tickAnim - 13) / 3) * (84.81-(84.81)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 84.81 + (((tickAnim - 16) / 4) * (18.5-(84.81)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 0) / 3) * (0-(-0.35)));
            zz = 0.175 + (((tickAnim - 0) / 3) * (0-(0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.55-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 4) * (0-(0.55)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.31-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.31 + (((tickAnim - 13) / 3) * (1.31-(1.31)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 1.31 + (((tickAnim - 16) / 4) * (-0.35-(1.31)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
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

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSinocalliopteryx e = (EntityPrehistoricFloraSinocalliopteryx) entity;
        animator.update(entity);


    }
}
