package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGorgonichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer upperJaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
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
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer lowerJaw;
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
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer backfinLeft;
    private final AdvancedModelRenderer backfinRight;
    private final AdvancedModelRenderer frontfinLeft;
    private final AdvancedModelRenderer frontfinRight;


    private ModelAnimator animator;

    public ModelGorgonichthys() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.0F, -6.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 46, -7.0F, -10.975F, -1.25F, 14, 10, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 36, 58, -6.5F, -9.25F, -3.8F, 13, 9, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -10.925F, -1.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 0, -5.0F, -0.0124F, -3.0104F, 10, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.75F, -3.875F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 7, -5.5F, -2.0F, 0.0F, 11, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.6F, -0.35F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 37, -6.0F, -3.0F, -1.0F, 12, 3, 4, 0.01F, false));

        this.upperJaw = new AdvancedModelRenderer(this);
        this.upperJaw.setRotationPoint(0.0F, -5.825F, -4.0F);
        this.main.addChild(upperJaw);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.2F, -0.6F, -2.925F);
        this.upperJaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1091F, -0.3908F, 0.3857F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 85, 0.0F, -3.0F, 0.0F, 2, 4, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.025F, -1.55F, -6.275F);
        this.upperJaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.6891F, -0.9149F, -0.9445F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 76, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.425F, 0.15F, -3.325F);
        this.upperJaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0728F, -0.4306F, 0.173F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 44, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 1.525F, -6.575F);
        this.upperJaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2628F, -0.3864F, 0.0718F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 28, -1.0F, -2.9768F, -0.0186F, 0, 3, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.025F, 2.575F, -4.1F);
        this.upperJaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8991F, -0.5406F, 0.0719F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 70, 0.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.75F, -0.45F, -5.9F);
        this.upperJaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3545F, 0.2707F, -0.0721F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 51, -1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.475F, -3.25F, -2.25F);
        this.upperJaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3967F, -0.1977F, -0.4459F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 93, -2.0F, -0.342F, -3.9397F, 2, 2, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-6.45F, -0.375F, 1.0F);
        this.upperJaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2245F, -0.4601F, 0.1103F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 83, 0.0F, 0.0F, -5.0F, 2, 4, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.275F, 0.6F, -3.75F);
        this.upperJaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0728F, -0.4306F, 0.173F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 96, 39, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.025F, -3.275F);
        this.upperJaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 74, 44, -4.0F, -2.0F, 0.0F, 8, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.25F, -6.25F);
        this.upperJaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 82, 93, -2.0F, -1.0F, 0.0F, 4, 1, 3, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(4.2F, -0.6F, -2.925F);
        this.upperJaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1091F, 0.3908F, -0.3857F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 85, -2.0F, -3.0F, 0.0F, 2, 4, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.025F, -1.55F, -6.275F);
        this.upperJaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.6891F, 0.9149F, 0.9445F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 88, 76, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, 1.525F, -6.575F);
        this.upperJaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2628F, 0.3864F, -0.0718F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 28, 1.0F, -2.9768F, -0.0186F, 0, 3, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(4.025F, 2.575F, -4.1F);
        this.upperJaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.8991F, 0.5406F, -0.0719F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 70, -2.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.75F, -0.45F, -5.9F);
        this.upperJaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3545F, -0.2707F, 0.0721F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 96, 51, -1.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.475F, -3.25F, -2.25F);
        this.upperJaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.3967F, 0.1977F, 0.4459F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 70, 93, 0.0F, -0.342F, -3.9397F, 2, 2, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(6.45F, -0.375F, 1.0F);
        this.upperJaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2245F, 0.4601F, -0.1103F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 83, -2.0F, 0.0F, -5.0F, 2, 4, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -3.225F, -4.15F);
        this.upperJaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 87, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(3.425F, 0.15F, -3.325F);
        this.upperJaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0728F, 0.4306F, -0.173F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 44, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.275F, 0.6F, -3.75F);
        this.upperJaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0728F, 0.4306F, -0.173F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 96, 39, 0.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -4.0F, -1.25F);
        this.upperJaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 75, -3.5F, 0.0F, -3.0F, 7, 3, 5, 0.0F, false));

        this.lowerJaw = new AdvancedModelRenderer(this);
        this.lowerJaw.setRotationPoint(0.0F, -2.75F, -4.1F);
        this.main.addChild(lowerJaw);
        this.setRotateAngle(lowerJaw, 0.4014F, 0.0F, 0.0F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.1473F, -0.233F, 0.4733F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 60, -1.1265F, -2.3662F, -2.119F, 1, 3, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.9934F, -0.3476F, 0.4752F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 96, 34, -1.214F, -0.6715F, -5.7385F, 0, 2, 3, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.6479F, -0.4738F, 0.3327F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 14, 83, -1.5748F, -0.5312F, -5.9103F, 2, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.6425F, 0.2114F, -0.3083F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 88, 4.1317F, -2.0293F, -4.4727F, 1, 3, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.5179F, -0.3604F, 0.2708F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 80, 79, -1.3387F, -0.8528F, -3.1819F, 2, 2, 6, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.1473F, 0.233F, -0.4733F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 28, 60, 0.1265F, -2.3662F, -2.119F, 1, 3, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -1.5403F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 44, -4.375F, 4.2693F, -3.2151F, 2, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 4.5564F, -0.7923F);
        this.lowerJaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.336F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 88, -3.5F, -1.9F, 0.525F, 7, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.375F, 1.8761F, -3.73F);
        this.lowerJaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6938F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 70, -7.875F, -2.8836F, 0.51F, 9, 3, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.9599F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 78, 19, -6.375F, 1.1475F, -3.0642F, 6, 2, 4, -0.01F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.9163F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 88, 25, -4.875F, 1.9823F, -4.8763F, 3, 1, 2, 0.0F, false));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 78, 25, -4.875F, 1.1846F, -4.6433F, 3, 1, 2, -0.001F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.9934F, 0.3476F, -0.4752F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 96, 34, 1.214F, -0.6715F, -5.7385F, 0, 2, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.4363F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 74, 12, -6.875F, -0.7563F, -2.4524F, 7, 1, 6, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.6479F, 0.4738F, -0.3327F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 14, 83, -0.4252F, -0.5312F, -5.9103F, 2, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.5629F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 14, 88, -4.875F, -0.5569F, -6.172F, 3, 1, 5, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.6425F, -0.2114F, 0.3083F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 76, 88, -5.1317F, -2.0293F, -4.4727F, 1, 3, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(3.375F, -0.2127F, -1.3058F);
        this.lowerJaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.5179F, 0.3604F, -0.2708F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 80, 79, -0.6613F, -0.8528F, -3.1819F, 2, 2, 6, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.0F, 5.5F);
        this.main.addChild(body1);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -3.75F, 0.25F);
        this.body1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2618F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 68, 58, 0.0F, -11.0F, 0.0F, 0, 11, 10, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 8.8F, -3.075F);
        this.body1.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0131F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 36, 46, -5.0F, -3.0F, 0.0F, 10, 3, 9, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.775F, 1.0F);
        this.body1.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0436F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 32, 0, -6.0F, -3.0F, -4.0F, 12, 10, 9, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 5.75F);
        this.body1.addChild(body3);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 7.825F, 0.0F);
        this.body3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1047F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 68, 28, -3.5F, -3.0F, 0.0F, 7, 3, 7, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, -0.4F, 0.75F);
        this.body3.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1047F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 28, -5.0F, -4.0F, -1.0F, 10, 10, 8, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 1.1F, 7.0F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 5.0F, 5.0F);
        this.tail.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.192F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 74, 51, -3.0F, -2.0F, -5.0F, 6, 2, 5, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.65F, 1.125F);
        this.tail.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.1571F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 60, -4.0F, -4.0F, -1.0F, 8, 9, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 24, 77, -2.5F, -3.0F, -0.7F, 5, 6, 5, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 3.7F, 1.4F);
        this.tail2.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.3054F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 13, 95, 0.0F, 0.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 3.0F, 4.225F);
        this.tail2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.336F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 44, 77, -2.0F, -2.0F, -6.0F, 4, 2, 6, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -3.225F, 4.325F);
        this.tail2.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1396F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 88, 71, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.451F, 3.9076F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 64, 79, -1.5F, -2.0F, -0.25F, 3, 4, 5, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.125F, 7.6F);
        this.tail3.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.2836F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 28, 66, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 2.0F, 4.75F);
        this.tail3.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.2967F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 88, -1.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, -2.0F, 4.75F);
        this.tail3.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1484F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 65, -1.0F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, -2.0F, 4.75F);
        this.tail3.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0436F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 92, -1.0F, 0.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(2.3952F, 0.474F, -1.8262F);
        this.tail3.addChild(bone);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.8952F, -0.349F, 2.1762F);
        this.bone.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.3491F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 94, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.1309F, -0.349F, 4.9952F);
        this.bone.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, -0.0436F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 22, 95, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.001F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, -0.349F, 7.9924F);
        this.bone.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.6545F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 32, 95, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0F, 8.675F);
        this.tail3.addChild(tail4);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, -1.9F, 0.05F);
        this.tail4.addChild(cube_r60);
        this.setRotateAngle(cube_r60, -0.829F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, -1, 0.0F, -18.0F, -1.0F, 0, 22, 16, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, -4.1664F, 3.571F);
        this.tail4.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.8247F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 88, 58, -0.5F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, -0.2463F, 0.8296F);
        this.tail4.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.9556F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 58, 92, -0.5F, -1.0F, 0.0F, 1, 2, 5, 0.001F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 1.4F, -0.025F);
        this.tail4.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.5716F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 96, 76, -0.5F, -1.9951F, -0.0161F, 1, 2, 2, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-2.3952F, 0.125F, 6.1662F);
        this.tail3.addChild(bone2);
        this.setRotateAngle(bone2, 0.0349F, 0.0F, 0.0F);


        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.6545F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 32, 95, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.1309F, 0.0F, -2.9971F);
        this.bone2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0436F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 22, 95, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.001F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.8952F, 0.0F, -5.8162F);
        this.bone2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, -0.3491F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 44, 94, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.backfinLeft = new AdvancedModelRenderer(this);
        this.backfinLeft.setRotationPoint(0.0F, 6.5F, 2.75F);
        this.body3.addChild(backfinLeft);
        this.setRotateAngle(backfinLeft, 0.0436F, -0.2182F, 0.5672F);
        this.backfinLeft.cubeList.add(new ModelBox(backfinLeft, 68, 38, 2.1007F, -0.3778F, -0.6761F, 8, 0, 6, 0.0F, false));

        this.backfinRight = new AdvancedModelRenderer(this);
        this.backfinRight.setRotationPoint(0.0F, 6.5F, 2.75F);
        this.body3.addChild(backfinRight);
        this.setRotateAngle(backfinRight, 0.0436F, 0.2182F, -0.5672F);
        this.backfinRight.cubeList.add(new ModelBox(backfinRight, 68, 38, -10.1007F, -0.3778F, -0.6761F, 8, 0, 6, 0.0F, true));

        this.frontfinLeft = new AdvancedModelRenderer(this);
        this.frontfinLeft.setRotationPoint(4.5F, 0.5F, -0.75F);
        this.main.addChild(frontfinLeft);
        this.setRotateAngle(frontfinLeft, 0.0F, 0.0F, 0.5672F);
        this.frontfinLeft.cubeList.add(new ModelBox(frontfinLeft, 32, 19, 1.0F, 0.0F, -2.0F, 14, 0, 9, 0.0F, false));

        this.frontfinRight = new AdvancedModelRenderer(this);
        this.frontfinRight.setRotationPoint(-4.5F, 0.5F, -0.75F);
        this.main.addChild(frontfinRight);
        this.setRotateAngle(frontfinRight, 0.0F, 0.0F, -0.5672F);
        this.frontfinRight.cubeList.add(new ModelBox(frontfinRight, 32, 19, -15.0F, 0.0F, -2.0F, 14, 0, 9, 0.0F, true));



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


        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

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
        this.flap(frontfinRight, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontfinRight, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backfinLeft  , (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinLeft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backfinRight, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backfinRight, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(270);
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
        animator.rotate(this.lowerJaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.lowerJaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

