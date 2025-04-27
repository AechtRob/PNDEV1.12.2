package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDissimilites;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDissimilites extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Shell1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Shell2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Shell3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Shell4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer Shell5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer Shell6;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Shell7;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer Shell8;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer Shell9;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer Shell10;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer Shell11;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer Shell12;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer Shell13;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer Shell14;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer Shell15;
    private final AdvancedModelRenderer Shell16;
    private final AdvancedModelRenderer Shell17;
    private final AdvancedModelRenderer Mantle;
    private final AdvancedModelRenderer Siphon;
    private final AdvancedModelRenderer Tentacle1;
    private final AdvancedModelRenderer Tentacle2;
    private final AdvancedModelRenderer Tentacle3;
    private final AdvancedModelRenderer Tentacle4;
    private final AdvancedModelRenderer Tentacle5;
    private final AdvancedModelRenderer Tentacle6;
    private final AdvancedModelRenderer Tentacle7;
    private final AdvancedModelRenderer Tentacle8;
    private final AdvancedModelRenderer Tentacle9;
    private final AdvancedModelRenderer Tentacle10;

    private ModelAnimator animator;

    public ModelDissimilites() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Shell1 = new AdvancedModelRenderer(this);
        this.Shell1.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Root.addChild(Shell1);
        this.Shell1.cubeList.add(new ModelBox(Shell1, 0, 16, -2.0F, -4.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -3.0F, -4.0F);
        this.Shell1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 0.0F, -4.0F, 1, 0, 8, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -1.0F, -4.0F);
        this.Shell1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 17, -1.0F, 0.0F, -4.0F, 1, 0, 8, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.Shell1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7549F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 1, 0.0F, 0.0F, -4.0F, 0, 1, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.Shell1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.7549F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 1, 0.0F, 0.0F, -4.0F, 0, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, -3.0F, -4.0F);
        this.Shell1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.0F, -4.0F, 1, 0, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -1.0F, -4.0F);
        this.Shell1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 17, 0.0F, 0.0F, -4.0F, 1, 0, 8, 0.0F, false));

        this.Shell2 = new AdvancedModelRenderer(this);
        this.Shell2.setRotationPoint(0.0F, -0.575F, -7.75F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, 0.0436F, 0.0F, 0.0F);
        this.Shell2.cubeList.add(new ModelBox(Shell2, 19, 0, -1.5F, -3.0F, -6.0F, 3, 3, 6, 0.04F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.475F, -1.875F, -4.5F);
        this.Shell2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.5498F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, 0.0F, -1.5F, 1, 0, 6, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.475F, -0.825F, -4.5F);
        this.Shell2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.5672F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, -1.0F, 0.0F, -1.5F, 1, 0, 6, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.85F, 0.0F, -3.0F);
        this.Shell2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4538F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, 0.0F, 0.0F, -3.0F, 0, 1, 6, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.475F, -0.825F, -4.5F);
        this.Shell2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5672F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 0.0F, 0.0F, -1.5F, 1, 0, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.475F, -1.875F, -4.5F);
        this.Shell2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5498F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0F, -1.5F, 1, 0, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.85F, 0.0F, -3.0F);
        this.Shell2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.4538F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, 0.0F, 0.0F, -3.0F, 0, 1, 6, 0.0F, false));

        this.Shell3 = new AdvancedModelRenderer(this);
        this.Shell3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.5236F, 0.0F, 0.0F);
        this.Shell3.cubeList.add(new ModelBox(Shell3, 14, 29, -1.5F, -3.0F, -3.0F, 3, 3, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.475F, -0.65F, -1.5F);
        this.Shell3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.5672F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, 0.0F, -1.5F);
        this.Shell3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.3447F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 10, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.475F, -0.65F, -1.5F);
        this.Shell3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.5672F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.75F, 0.0F, -1.5F);
        this.Shell3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3447F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 10, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Shell4 = new AdvancedModelRenderer(this);
        this.Shell4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell3.addChild(Shell4);
        this.setRotateAngle(Shell4, -1.0036F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 28, 22, -1.5F, -3.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.475F, -1.45F, -1.5F);
        this.Shell4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.5498F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 1, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.475F, -0.65F, -1.5F);
        this.Shell4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.5672F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 3, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.7F, 0.0F, -1.5F);
        this.Shell4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.3752F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 17, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.475F, -0.65F, -1.5F);
        this.Shell4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.5672F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 3, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.475F, -1.45F, -1.5F);
        this.Shell4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.5498F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 1, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.7F, 0.0F, -1.5F);
        this.Shell4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, -0.3752F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 17, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Shell5 = new AdvancedModelRenderer(this);
        this.Shell5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -1.0036F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 26, 29, -1.5F, -2.0F, -3.0F, 3, 2, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.475F, -1.45F, -1.5F);
        this.Shell5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.5498F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 10, -1.0F, 0.0F, -1.5F, 1, 0, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.475F, -0.45F, -1.5F);
        this.Shell5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.5672F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 6, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.625F, 0.0F, -1.5F);
        this.Shell5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.4931F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 18, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.475F, -0.45F, -1.5F);
        this.Shell5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.5672F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 6, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.475F, -1.45F, -1.5F);
        this.Shell5.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.5498F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 10, 0.0F, 0.0F, -1.5F, 1, 0, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.625F, 0.0F, -1.5F);
        this.Shell5.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.4931F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 18, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.Shell6 = new AdvancedModelRenderer(this);
        this.Shell6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.48F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 19, 10, -1.5F, -2.0F, -3.0F, 3, 2, 3, -0.04F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.475F, -1.45F, -1.5F);
        this.Shell6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 0.5498F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 17, -1.0F, 0.0F, -1.5F, 1, 0, 2, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.475F, -0.45F, -1.5F);
        this.Shell6.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.5672F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 5, 8, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -0.075F, -1.5F);
        this.Shell6.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.5236F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 16, 18, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.5F, -0.075F, -1.5F);
        this.Shell6.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -0.5236F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 16, 18, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.475F, -0.45F, -1.5F);
        this.Shell6.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.5672F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 5, 8, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.475F, -1.45F, -1.5F);
        this.Shell6.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, -0.5498F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 14, 17, 0.0F, 0.0F, -1.5F, 1, 0, 2, 0.0F, false));

        this.Shell7 = new AdvancedModelRenderer(this);
        this.Shell7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.1309F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 37, 0, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.9F, 1.15F, -1.5F);
        this.Shell7.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.034F, -0.0196F, 0.5233F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 0, -2.1239F, -1.9467F, -1.4019F, 1, 0, 3, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, -0.5F, -1.5F);
        this.Shell7.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.5236F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 10, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.Shell7.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, 0.5672F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 19, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.Shell7.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, -0.5672F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 19, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.9F, 1.15F, -1.5F);
        this.Shell7.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.034F, 0.0196F, -0.5233F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 16, 0, 1.1239F, -1.9467F, -1.4019F, 1, 0, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0F, -0.5F, -1.5F);
        this.Shell7.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.5236F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 16, 10, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.Shell8 = new AdvancedModelRenderer(this);
        this.Shell8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell7.addChild(Shell8);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 14, 18, -1.0F, -1.0F, -10.0F, 2, 1, 10, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.25F, -0.95F);
        this.Shell8.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0611F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -1.0F, -2.0F, -11.0F, 2, 1, 15, -0.04F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.9F, 1.425F, -5.0F);
        this.Shell8.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.034F, -0.0196F, 0.5233F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -2.1239F, -1.9467F, -4.9019F, 1, 0, 10, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.975F, -0.5F, -5.0F);
        this.Shell8.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, -0.5236F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 2, 0, -1.0F, 0.0F, -5.0F, 1, 0, 10, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.Shell8.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.48F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 6, 0.0F, 0.0F, -5.0F, 0, 1, 10, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.Shell8.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.48F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 16, 6, 0.0F, 0.0F, -5.0F, 0, 1, 10, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.9F, 1.425F, -5.0F);
        this.Shell8.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.034F, 0.0196F, -0.5233F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 0, 1.1239F, -1.9467F, -4.9019F, 1, 0, 10, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.975F, -0.5F, -5.0F);
        this.Shell8.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.0F, 0.5236F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 2, 0, 0.0F, 0.0F, -5.0F, 1, 0, 10, 0.0F, false));

        this.Shell9 = new AdvancedModelRenderer(this);
        this.Shell9.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.0436F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 34, 35, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.975F, 1.65F, -1.5F);
        this.Shell9.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.034F, -0.0196F, 0.5233F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 2, 16, -2.125F, -1.9486F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.975F, -0.5F, -1.5F);
        this.Shell9.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.5236F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 16, 3, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.Shell9.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.48F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 20, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.Shell9.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.0F, -0.48F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 20, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.975F, 1.65F, -1.5F);
        this.Shell9.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.034F, 0.0196F, -0.5233F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 2, 16, 1.125F, -1.9486F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.975F, -0.5F, -1.5F);
        this.Shell9.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0F, 0.5236F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 16, 3, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.Shell10 = new AdvancedModelRenderer(this);
        this.Shell10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell9.addChild(Shell10);
        this.setRotateAngle(Shell10, -0.3054F, 0.0F, 0.0F);
        this.Shell10.cubeList.add(new ModelBox(Shell10, 16, 17, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.04F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, -0.575F, -1.5F);
        this.Shell10.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0F, 0.4363F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 9, 10, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, -0.3F, -1.5F);
        this.Shell10.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, 0.0F, -0.4363F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 9, -1.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.Shell10.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.0F, 0.3927F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 16, 19, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.Shell10.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.0F, -0.3927F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 16, 19, 0.0F, 0.0F, -1.5F, 0, 1, 3, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.5F, -0.3F, -1.5F);
        this.Shell10.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, 0.4363F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 9, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.5F, -0.575F, -1.5F);
        this.Shell10.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, -0.4363F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 9, 10, 0.0F, 0.0F, -1.5F, 1, 0, 3, 0.0F, false));

        this.Shell11 = new AdvancedModelRenderer(this);
        this.Shell11.setRotationPoint(0.0F, -0.025F, -2.8F);
        this.Shell10.addChild(Shell11);
        this.setRotateAngle(Shell11, 0.1745F, 0.0F, 0.0F);
        this.Shell11.cubeList.add(new ModelBox(Shell11, 0, 16, -0.5F, -1.0F, -3.0F, 1, 1, 3, 0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.5F, -0.55F, -1.525F);
        this.Shell11.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, 0.0F, 0.4363F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 9, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.5F, -0.275F, -1.525F);
        this.Shell11.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.0F, -0.4363F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 8, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.5F, 0.0F, -1.5F);
        this.Shell11.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0F, 0.6109F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 10, 13, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.5F, -0.55F, -1.525F);
        this.Shell11.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.0F, -0.4363F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 0, 9, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.5F, -0.275F, -1.525F);
        this.Shell11.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.0F, 0.4363F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 8, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.5F, 0.0F, -1.5F);
        this.Shell11.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.0F, -0.6109F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 10, 13, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Shell12 = new AdvancedModelRenderer(this);
        this.Shell12.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Shell11.addChild(Shell12);
        this.setRotateAngle(Shell12, -0.5672F, 0.0F, 0.0F);
        this.Shell12.cubeList.add(new ModelBox(Shell12, 37, 8, -0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.5F, -0.55F, -0.525F);
        this.Shell12.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0F, 0.4363F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 7, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-0.5F, -0.275F, -0.525F);
        this.Shell12.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, 0.0F, -0.4363F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 6, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-0.5F, 0.0F, -0.5F);
        this.Shell12.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, 0.0F, 0.3927F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 8, 10, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.5F, -0.55F, -0.525F);
        this.Shell12.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.0F, -0.4363F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 7, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, -0.275F, -0.525F);
        this.Shell12.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0F, 0.4363F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 6, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.0F, -0.5F);
        this.Shell12.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, 0.0F, -0.3927F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 8, 10, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Shell13 = new AdvancedModelRenderer(this);
        this.Shell13.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell12.addChild(Shell13);
        this.setRotateAngle(Shell13, -0.7418F, 0.0F, 0.0F);
        this.Shell13.cubeList.add(new ModelBox(Shell13, 37, 5, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(-0.5F, -0.55F, -0.525F);
        this.Shell13.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, 0.0F, 0.4363F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 5, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.5F, -0.275F, -0.525F);
        this.Shell13.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.0F, -0.4363F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 4, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.5F, -0.025F, -0.5F);
        this.Shell13.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.0F, 0.3927F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 10, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.5F, -0.55F, -0.525F);
        this.Shell13.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, 0.0F, -0.4363F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 5, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.5F, -0.275F, -0.525F);
        this.Shell13.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, 0.0F, 0.4363F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 4, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.5F, -0.025F, -0.5F);
        this.Shell13.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.0F, -0.3927F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 10, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Shell14 = new AdvancedModelRenderer(this);
        this.Shell14.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell13.addChild(Shell14);
        this.setRotateAngle(Shell14, -0.9163F, 0.0F, 0.0F);
        this.Shell14.cubeList.add(new ModelBox(Shell14, 12, 35, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.02F, false));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.5F, -0.55F, -0.525F);
        this.Shell14.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0F, 0.4363F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 3, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(-0.5F, -0.275F, -0.525F);
        this.Shell14.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, 0.0F, -0.4363F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 0, 2, -1.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(-0.5F, -0.05F, -0.5F);
        this.Shell14.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, 0.0F, 0.4451F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 9, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.5F, -0.55F, -0.525F);
        this.Shell14.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.0F, -0.4363F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 3, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(0.5F, -0.275F, -0.525F);
        this.Shell14.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.0F, 0.4363F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 2, 0.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.5F, -0.05F, -0.5F);
        this.Shell14.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, 0.0F, -0.4451F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 9, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Shell15 = new AdvancedModelRenderer(this);
        this.Shell15.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell14.addChild(Shell15);
        this.setRotateAngle(Shell15, -0.829F, 0.0F, 0.0F);
        this.Shell15.cubeList.add(new ModelBox(Shell15, 23, 29, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.03F, false));

        this.Shell16 = new AdvancedModelRenderer(this);
        this.Shell16.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell15.addChild(Shell16);
        this.setRotateAngle(Shell16, -0.829F, 0.0F, 0.0F);
        this.Shell16.cubeList.add(new ModelBox(Shell16, 28, 10, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.04F, false));

        this.Shell17 = new AdvancedModelRenderer(this);
        this.Shell17.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Shell16.addChild(Shell17);
        this.setRotateAngle(Shell17, -0.5411F, 0.0F, 0.0F);
        this.Shell17.cubeList.add(new ModelBox(Shell17, 21, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, -0.05F, false));

        this.Mantle = new AdvancedModelRenderer(this);
        this.Mantle.setRotationPoint(0.0F, -3.325F, 4.425F);
        this.Root.addChild(Mantle);
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 28, -2.0F, -1.5F, 0.5F, 4, 3, 3, -0.04F, false));
        this.Mantle.cubeList.add(new ModelBox(Mantle, 0, 13, -2.0F, -1.0F, 1.0F, 4, 1, 1, 0.0F, false));

        this.Siphon = new AdvancedModelRenderer(this);
        this.Siphon.setRotationPoint(0.0F, 1.7F, 1.825F);
        this.Mantle.addChild(Siphon);
        this.setRotateAngle(Siphon, -0.1745F, 0.0F, 0.0F);
        this.Siphon.cubeList.add(new ModelBox(Siphon, 1, 44, -1.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

        this.Tentacle1 = new AdvancedModelRenderer(this);
        this.Tentacle1.setRotationPoint(-0.5F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle1);
        this.setRotateAngle(Tentacle1, -0.1789F, -0.0215F, 0.0039F);
        this.Tentacle1.cubeList.add(new ModelBox(Tentacle1, 36, 14, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2 = new AdvancedModelRenderer(this);
        this.Tentacle2.setRotationPoint(-1.45F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle2);
        this.setRotateAngle(Tentacle2, -0.1178F, 0.0F, 0.6109F);
        this.Tentacle2.cubeList.add(new ModelBox(Tentacle2, 28, 35, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle3 = new AdvancedModelRenderer(this);
        this.Tentacle3.setRotationPoint(-1.45F, 0.0F, 3.425F);
        this.Mantle.addChild(Tentacle3);
        this.setRotateAngle(Tentacle3, 0.0F, -0.2487F, 0.0F);
        this.Tentacle3.cubeList.add(new ModelBox(Tentacle3, 16, 35, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4 = new AdvancedModelRenderer(this);
        this.Tentacle4.setRotationPoint(-1.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle4);
        this.setRotateAngle(Tentacle4, 0.1614F, 0.0F, -0.7854F);
        this.Tentacle4.cubeList.add(new ModelBox(Tentacle4, 6, 35, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5 = new AdvancedModelRenderer(this);
        this.Tentacle5.setRotationPoint(-0.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle5);
        this.setRotateAngle(Tentacle5, 0.2662F, -0.0253F, -0.0069F);
        this.Tentacle5.cubeList.add(new ModelBox(Tentacle5, 34, 30, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6 = new AdvancedModelRenderer(this);
        this.Tentacle6.setRotationPoint(0.5F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle6);
        this.setRotateAngle(Tentacle6, -0.1789F, 0.0215F, -0.0039F);
        this.Tentacle6.cubeList.add(new ModelBox(Tentacle6, 22, 34, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7 = new AdvancedModelRenderer(this);
        this.Tentacle7.setRotationPoint(1.45F, 1.0F, 3.425F);
        this.Mantle.addChild(Tentacle7);
        this.setRotateAngle(Tentacle7, -0.1178F, 0.0F, -0.6109F);
        this.Tentacle7.cubeList.add(new ModelBox(Tentacle7, 0, 34, -0.5F, -0.55F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle8 = new AdvancedModelRenderer(this);
        this.Tentacle8.setRotationPoint(1.45F, 0.0F, 3.425F);
        this.Mantle.addChild(Tentacle8);
        this.setRotateAngle(Tentacle8, 0.0F, 0.2487F, 0.0F);
        this.Tentacle8.cubeList.add(new ModelBox(Tentacle8, 31, 9, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9 = new AdvancedModelRenderer(this);
        this.Tentacle9.setRotationPoint(1.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle9);
        this.setRotateAngle(Tentacle9, 0.1614F, 0.0F, 0.7854F);
        this.Tentacle9.cubeList.add(new ModelBox(Tentacle9, 31, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10 = new AdvancedModelRenderer(this);
        this.Tentacle10.setRotationPoint(0.45F, -0.925F, 3.425F);
        this.Mantle.addChild(Tentacle10);
        this.setRotateAngle(Tentacle10, 0.2662F, 0.0253F, 0.0069F);
        this.Tentacle10.cubeList.add(new ModelBox(Tentacle10, 30, 17, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));
        
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.2F;
        this.Root.offsetX = -0.15F;
        this.Root.offsetZ = -0.4F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Root.offsetZ = -0.1F;
        this.Root.offsetY = -0.03F;
        this.Root.offsetX = -0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -1.2F;
        this.Root.offsetX = 1.2F;
        this.Root.rotateAngleY = (float)Math.toRadians(242);
        this.Root.rotateAngleX = (float)Math.toRadians(-18);
        this.Root.rotateAngleZ = (float)Math.toRadians(-8);
        this.Root.scaleChildren = true;
        float scaler = 1.23F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDissimilites ee = (EntityPrehistoricFloraDissimilites) entitylivingbaseIn;

        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDissimilites entity = (EntityPrehistoricFloraDissimilites) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-50))*0.35), Root.rotateAngleY + (float) Math.toRadians(0), Root.rotateAngleZ + (float) Math.toRadians(0));
        this.Root.rotationPointX = this.Root.rotationPointX + (float)(0);
        this.Root.rotationPointY = this.Root.rotationPointY - (float)(0);
        this.Root.rotationPointZ = this.Root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*0.18);


        this.setRotateAngle(Mantle, Mantle.rotateAngleX + (float) Math.toRadians(0), Mantle.rotateAngleY + (float) Math.toRadians(0), Mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.Mantle.setScale((float)1,(float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410+20))*0.005));


        this.Siphon.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-5))*0.015),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*0.05));


        this.setRotateAngle(Tentacle1, Tentacle1.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Tentacle1.rotateAngleY + (float) Math.toRadians(0), Tentacle1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle2, Tentacle2.rotateAngleX + (float) Math.toRadians(16.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*-0.8), Tentacle2.rotateAngleY + (float) Math.toRadians(0), Tentacle2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle3, Tentacle3.rotateAngleX + (float) Math.toRadians(0), Tentacle3.rotateAngleY + (float) Math.toRadians(17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-60))*-1), Tentacle3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle4, Tentacle4.rotateAngleX + (float) Math.toRadians(-20.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*0.8), Tentacle4.rotateAngleY + (float) Math.toRadians(0), Tentacle4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle5, Tentacle5.rotateAngleX + (float) Math.toRadians(-20.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*0.5), Tentacle5.rotateAngleY + (float) Math.toRadians(0), Tentacle5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle6, Tentacle6.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*-0.5), Tentacle6.rotateAngleY + (float) Math.toRadians(0), Tentacle6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle7, Tentacle7.rotateAngleX + (float) Math.toRadians(16.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*-0.8), Tentacle7.rotateAngleY + (float) Math.toRadians(0), Tentacle7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle8, Tentacle8.rotateAngleX + (float) Math.toRadians(0), Tentacle8.rotateAngleY + (float) Math.toRadians(-17.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-60))*1), Tentacle8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle9, Tentacle9.rotateAngleX + (float) Math.toRadians(-20.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-20))*0.8), Tentacle9.rotateAngleY + (float) Math.toRadians(0), Tentacle9.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tentacle10, Tentacle10.rotateAngleX + (float) Math.toRadians(-20.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410))*0.5), Tentacle10.rotateAngleY + (float) Math.toRadians(0), Tentacle10.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraDissimilites ee = (EntityPrehistoricFloraDissimilites) e;

        if (!e.isInWater()) {
            this.Root.rotateAngleZ = (float) Math.toRadians(90);
            this.Root.offsetY = 0f;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

