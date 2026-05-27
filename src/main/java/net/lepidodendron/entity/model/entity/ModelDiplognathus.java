package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDiplognathus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
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
    private final AdvancedModelRenderer upperJaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
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
    private final AdvancedModelRenderer frontfinLeft;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer backfinLeft;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer tailFin;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer keel;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer keel5;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer backfinRight4;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer frontfinRight4;
    private final AdvancedModelRenderer cube_r62;


    private ModelAnimator animator;

    public ModelDiplognathus() {
        this.textureWidth = 82;
        this.textureHeight = 72;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 17.775F, -2.325F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.8F, 5.1F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1222F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 40, 0.0F, -7.0F, 0.0F, 0, 7, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.725F, 5.775F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0785F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -3.0F, -3.0017F, 0.9779F, 6, 3, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.4F, 0.725F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 0, -4.0F, -0.0114F, 0.0152F, 8, 5, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.425F, 1.25F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 24, -3.5F, -3.0017F, -0.0221F, 7, 3, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.075F, 1.275F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1484F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 34, -3.0F, -3.0F, -2.0F, 6, 3, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -5.125F, 6.65F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 12, -3.5F, 0.006F, 0.0154F, 7, 5, 6, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.05F, 0.125F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.4F, 0.1F, -1.575F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, -0.288F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 67, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.225F, -0.575F, -6.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5847F, -0.1571F, 0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 37, 0.0F, -0.02F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.275F, 0.625F, -1.225F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, -0.4625F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 67, -1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.425F, 0.025F, -5.125F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4189F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 45, 0.0F, -0.02F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.975F, 0.025F, -2.925F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1484F, -0.5323F, -0.0611F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 67, 25, 0.0F, -0.02F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 1.025F, 0.175F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0087F, -0.3316F, -0.0349F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 67, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.4F, 0.1F, -1.575F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.288F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 67, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.05F, -3.3F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1571F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 67, 30, -0.5F, -0.965F, -2.0F, 1, 1, 2, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.475F, -4.875F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.4014F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 54, 68, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.225F, -0.575F, -6.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5847F, 0.1571F, -0.0873F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 21, 37, 0.0F, -0.02F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.425F, 0.025F, -5.125F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4189F, 0.0873F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 45, 0.0F, -0.02F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.275F, 0.625F, -1.225F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.4625F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 67, 1.0F, -1.0F, -4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.975F, 0.025F, -2.925F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1484F, 0.5323F, 0.0611F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 67, 25, -1.0F, -0.02F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.0F, 1.025F, 0.175F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0087F, 0.3316F, 0.0349F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 67, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 1.625F, -1.95F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2967F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 61, 68, -2.0F, -0.995F, -1.8868F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, 1.65F, -0.825F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1396F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 48, -3.0F, -1.0F, -2.0F, 4, 1, 3, 0.0F, false));

        this.upperJaw = new AdvancedModelRenderer(this);
        this.upperJaw.setRotationPoint(0.0F, 0.2F, 1.6F);
        this.main.addChild(upperJaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.3102F, -1.5385F, -6.7035F);
        this.upperJaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.288F, -0.5847F, 0.0873F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 68, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4F, 0.0F, -5.025F);
        this.upperJaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0785F, -0.3229F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 46, -1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.075F, -2.55F, -2.425F);
        this.upperJaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.274F, -0.2256F, -0.074F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 15, 50, -1.0F, -0.3457F, -2.0143F, 1, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.5509F, -4.5461F, -0.6737F);
        this.upperJaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3434F, -0.2515F, -0.0635F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 0, -0.05F, 0.0F, -5.0F, 2, 2, 5, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, -2.725F, -5.475F);
        this.upperJaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3665F, -0.4363F, -0.1745F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 64, 53, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.875F, -0.4F, -5.475F);
        this.upperJaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.4669F, -0.48F, 0.0742F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 68, 0.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.1F, -0.125F, -1.725F);
        this.upperJaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.074F, -0.2967F, 0.0302F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 46, 0.0F, -3.0F, -4.0F, 1, 3, 6, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.875F, -1.925F, -2.75F);
        this.upperJaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.274F, -0.2256F, -0.074F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 67, -1.0F, -1.3457F, -2.0143F, 1, 2, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.3102F, -1.5385F, -6.7035F);
        this.upperJaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.288F, 0.5847F, -0.0873F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 68, 68, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.4F, 0.0F, -5.025F);
        this.upperJaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0785F, 0.3229F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 46, 1.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.875F, -0.4F, -5.475F);
        this.upperJaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4669F, 0.48F, -0.0742F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 68, -1.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.1F, -0.125F, -1.725F);
        this.upperJaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.074F, 0.2967F, -0.0302F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 46, -1.0F, -3.0F, -4.0F, 1, 3, 6, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0F, -2.725F, -5.475F);
        this.upperJaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3665F, 0.4363F, 0.1745F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 64, 53, -1.0F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, -3.05F, -4.875F);
        this.upperJaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3665F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 63, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.5509F, -4.5461F, -0.6737F);
        this.upperJaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.3434F, 0.2515F, 0.0635F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 54, 0, -1.95F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -2.2218F, -6.5746F);
        this.upperJaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.2182F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 22, 67, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.1F, -0.8809F, -4.5729F);
        this.upperJaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.5411F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 41, 62, -1.9F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -4.525F, -0.65F);
        this.upperJaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3316F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 15, 53, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(2.075F, -2.55F, -2.425F);
        this.upperJaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.274F, 0.2256F, 0.074F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 15, 50, 0.0F, -0.3457F, -2.0143F, 1, 1, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.875F, -1.925F, -2.75F);
        this.upperJaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.274F, 0.2256F, 0.074F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 33, 67, 0.0F, -1.3457F, -2.0143F, 1, 2, 2, 0.0F, false));

        this.frontfinLeft = new AdvancedModelRenderer(this);
        this.frontfinLeft.setRotationPoint(3.5F, 1.0F, 2.9F);
        this.main.addChild(frontfinLeft);
        this.setRotateAngle(frontfinLeft, 0.0F, 0.0F, 0.6545F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0F, 0.0F, 0.6F);
        this.frontfinLeft.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.2618F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 25, 34, -2.0F, 0.0F, -1.0F, 8, 0, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.4F, 12.5F);
        this.main.addChild(tail1);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -2.3F, -0.15F);
        this.tail1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 52, 12, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 4.45F, 0.05F);
        this.tail1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.2094F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 52, 18, -2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 1.45F, 0.8F);
        this.tail1.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.0175F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 37, -3.0F, -3.0F, -1.0F, 6, 4, 4, 0.0F, false));

        this.backfinLeft = new AdvancedModelRenderer(this);
        this.backfinLeft.setRotationPoint(1.9F, 2.75F, 1.6F);
        this.tail1.addChild(backfinLeft);
        this.setRotateAngle(backfinLeft, 0.0F, 0.0F, 0.6545F);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.1F, 0.0F, 0.7F);
        this.backfinLeft.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.192F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 21, 40, -2.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 3.75F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 21, 45, -2.5F, -1.375F, -0.175F, 5, 3, 4, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, -2.175F, -0.175F);
        this.tail2.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.096F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 54, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 3.175F, 0.075F);
        this.tail2.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.2182F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 56, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.95F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 49, 54, -1.5F, -1.375F, -0.175F, 3, 3, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 57, 40, -1.0F, -1.35F, 3.725F, 2, 3, 4, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 2.3F, -0.15F);
        this.tail3.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.1789F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 28, 61, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -1.775F, -0.25F);
        this.tail3.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.096F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 56, 62, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tailFin = new AdvancedModelRenderer(this);
        this.tailFin.setRotationPoint(0.0F, -0.125F, 7.725F);
        this.tail3.addChild(tailFin);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.275F, -0.325F);
        this.tailFin.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.925F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 0, 0.0F, -13.0F, -1.0F, 0, 14, 12, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, -3.825F, 4.475F);
        this.tailFin.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.6283F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 15, 60, -0.5F, -1.0F, -1.0F, 1, 1, 5, -0.001F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 0.825F, 0.7F);
        this.tailFin.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.733F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 52, 25, -0.5F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.keel = new AdvancedModelRenderer(this);
        this.keel.setRotationPoint(1.25F, 0.05F, 2.15F);
        this.tail3.addChild(keel);
        this.setRotateAngle(keel, -0.0175F, 0.0F, 0.0F);


        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.8531F, 0.5F, 3.8709F);
        this.keel.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.5672F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 64, 58, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.9404F, 0.5F, 1.8728F);
        this.keel.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.0436F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 63, 8, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.001F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.25F, 0.5F, 0.0F);
        this.keel.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.3491F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 54, 8, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.keel5 = new AdvancedModelRenderer(this);
        this.keel5.setRotationPoint(-1.25F, 0.05F, 2.15F);
        this.tail3.addChild(keel5);
        this.setRotateAngle(keel5, -0.0175F, 0.0F, 0.0F);


        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.8531F, 0.5F, 3.8709F);
        this.keel5.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.5672F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 64, 58, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.9404F, 0.5F, 1.8728F);
        this.keel5.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0436F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 63, 8, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.001F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.25F, 0.5F, 0.0F);
        this.keel5.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.3491F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 54, 8, 0.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.backfinRight4 = new AdvancedModelRenderer(this);
        this.backfinRight4.setRotationPoint(-1.9F, 2.75F, 1.6F);
        this.tail1.addChild(backfinRight4);
        this.setRotateAngle(backfinRight4, 0.0F, 0.0F, -0.6545F);


        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-1.1F, 0.0F, 0.7F);
        this.backfinRight4.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.192F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 21, 40, -5.0F, 0.0F, -1.0F, 7, 0, 4, 0.0F, true));

        this.frontfinRight4 = new AdvancedModelRenderer(this);
        this.frontfinRight4.setRotationPoint(-3.5F, 1.0F, 2.9F);
        this.main.addChild(frontfinRight4);
        this.setRotateAngle(frontfinRight4, 0.0F, 0.0F, -0.6545F);


        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.0F, 0.0F, 0.6F);
        this.frontfinRight4.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.2618F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 25, 34, -6.0F, 0.0F, -1.0F, 8, 0, 5, 0.0F, true));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.5F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.12F;
        this.main.offsetY = -0.19F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetX = -0.06F;
        this.main.offsetZ = 0.03F;
        this.main.offsetY = -0.5F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();


        AdvancedModelRenderer[] fishTail = {this.tail1, this.tail2, this.tail3, this.tailFin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.9F;
        }
        if (!e.isInWater()) {
            speed = 0.34F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.2F * still);
            this.chainSwing(fishTail, speed * still, 0.2F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed * still, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontfinLeft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontfinLeft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontfinRight4, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontfinRight4, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backfinLeft  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinLeft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backfinRight4, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinRight4, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

