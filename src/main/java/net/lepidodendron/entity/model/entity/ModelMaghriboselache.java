package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMaghriboselache;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMaghriboselache extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer upperjaw;
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

    private ModelAnimator animator;

    public ModelMaghriboselache() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -4.325F, -2.0F, 9, 7, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 54, 47, -3.5F, -4.0F, -6.0F, 7, 6, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 76, 45, 0.0F, -7.5F, 0.25F, 0, 3, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.725F, -1.9F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 16, -4.0F, -1.0F, 0.0F, 8, 2, 9, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.4F, -0.75F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6676F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 77, -0.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.4F, -1.75F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.829F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 59, -0.5F, -6.0F, 0.0F, 1, 6, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.4F, -2.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.048F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, -4.0F, 0.0F, 0.0F, 8, 1, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.1F, -5.85F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0742F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 24, -3.0F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.1F, -5.95F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.144F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 66, -3.0F, -2.0F, 0.0F, 6, 2, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.275F, -2.25F, -5.85F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0698F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 74, 36, -2.0F, -1.0F, 0.0F, 2, 5, 4, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-4.275F, -2.25F, -5.85F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0698F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 74, 36, 0.0F, -1.0F, 0.0F, 2, 5, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-4.5F, 2.5F, -0.5F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, 0.0F, -0.5236F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 49, -7.0F, 0.0F, -1.0F, 7, 0, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(4.5F, 2.5F, -0.5F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.0F, 0.5236F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 49, 0.0F, 0.0F, -1.0F, 7, 0, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.25F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 34, 16, -4.0F, -2.0F, -1.0F, 8, 7, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, -5.5F, 0.1F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0262F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 29, -4.5F, 3.0F, -1.0F, 7, 1, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.975F, -0.05F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0087F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 51, -4.0F, 3.0F, -1.0F, 7, 2, 6, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 36, 0, -3.5F, -1.5F, -1.55F, 7, 6, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.075F, 4.45F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1702F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 56, -3.0F, 4.9088F, -7.0419F, 6, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.975F, 4.45F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 59, -3.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.45F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 52, 36, -2.5F, -1.15F, -1.0F, 5, 5, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 24, 37, 0.0F, -5.675F, 0.45F, 0, 5, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.425F, 0.95F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 56, -0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.9F, 0.2F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1222F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 64, -2.0F, 1.0F, -1.0F, 4, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.925F, -0.4F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 62, 8, -2.0F, 1.0F, -1.0F, 4, 2, 6, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.1F, 5.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 58, 67, -1.0F, -0.4F, 3.0F, 2, 2, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 62, 16, -2.25F, 1.1F, 0.25F, 2, 0, 8, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 62, 16, 0.25F, 1.1F, 0.25F, 2, 0, 8, 0.0F, true));
        this.body5.cubeList.add(new ModelBox(body5, 74, 67, -1.5F, -0.4F, -1.0F, 3, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.675F, 0.2F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1134F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 57, -1.0F, -2.0F, -1.0F, 2, 1, 9, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.75F, 0.3F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2356F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 37, -1.0F, -2.0F, -1.0F, 2, 2, 10, -0.01F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.6F, 9.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 34, 29, 0.0F, -8.5F, -0.8F, 0, 13, 9, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-2.0F, 4.625F, 0.35F);
        this.body4.addChild(bone);
        this.setRotateAngle(bone, 0.2182F, 0.0F, 1.0472F);
        this.bone.cubeList.add(new ModelBox(bone, 46, 74, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(2.0F, 4.625F, 0.35F);
        this.body4.addChild(bone2);
        this.setRotateAngle(bone2, 0.2182F, 0.0F, -1.0472F);
        this.bone2.cubeList.add(new ModelBox(bone2, 46, 74, 0.0F, 0.0F, 0.0F, 0, 3, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.15F, -5.6F);
        this.body.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.175F, 1.05F, -4.85F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.5585F, 0.1309F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 47, 0.75F, -1.5F, -2.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.8F, 0.775F, -4.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1571F, 0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 77, 2.0F, -1.5F, -1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.175F, 1.05F, -4.85F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5585F, -0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 47, -0.75F, -1.5F, -2.5F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.075F, -4.85F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5585F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 12, -1.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.8F, 0.775F, -4.0F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1571F, -0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 77, -2.0F, -1.5F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.775F, -4.4F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1571F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 58, 75, -2.0F, -1.0F, -1.0F, 4, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.95F, -4.8F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.4189F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 76, 56, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.85F, -2.0F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0698F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 67, -3.0F, -4.0F, -1.0F, 6, 4, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.5F, -5.25F);
        this.body.addChild(upperjaw);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(3.1F, -0.025F, -4.25F);
        this.upperjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.5236F, 0.2618F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 76, 60, -2.0F, -2.75F, 0.75F, 2, 2, 3, 0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.55F, -1.075F, -4.9F);
        this.upperjaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1833F, 0.3927F, -0.3054F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 47, 0.025F, -2.0F, -0.9F, 1, 2, 2, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(3.1F, -0.125F, -4.25F);
        this.upperjaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0611F, 0.2618F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 71, -2.0F, -3.0F, -0.75F, 2, 3, 5, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.55F, -1.075F, -4.9F);
        this.upperjaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1833F, -0.3927F, 0.3054F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 47, -1.025F, -2.0F, -0.9F, 1, 2, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0F, -3.65F, 0.15F);
        this.upperjaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1047F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 74, 74, -2.0F, -1.0F, -2.0F, 6, 2, 2, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, -3.5F, -1.575F);
        this.upperjaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3578F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 74, -2.0F, -1.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -2.55F, -4.175F);
        this.upperjaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3054F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 14, 72, -2.0F, -1.0F, -4.0F, 4, 1, 4, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -0.2F, -5.075F);
        this.upperjaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.4102F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 53, -2.0F, -2.0F, -2.0F, 5, 1, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 12, -2.0F, -1.0F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-3.1F, -0.025F, -4.25F);
        this.upperjaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.5236F, -0.2618F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 60, 0.0F, -2.75F, 0.75F, 2, 2, 3, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-3.1F, -0.125F, -4.25F);
        this.upperjaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0611F, -0.2618F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 71, 0.0F, -3.0F, -0.75F, 2, 3, 5, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.775F, 0.6F, -4.5F);
        this.upperjaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.2182F, 0.2182F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 20, 77, 2.0F, -1.5F, -1.75F, 0, 1, 3, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.775F, 0.6F, -4.5F);
        this.upperjaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.2182F, -0.2182F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 20, 77, -2.0F, -1.5F, -1.75F, 0, 1, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -0.025F, -1.1F);
        this.upperjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0436F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 62, 0, -3.0F, -3.0F, -4.0F, 6, 3, 5, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.body.offsetY = -0.34F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.08F;
        this.body.offsetX = 0.408F;
        this.body.rotateAngleY = (float)Math.toRadians(260);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.40F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMaghriboselache ee = (EntityPrehistoricFloraMaghriboselache) entitylivingbodyIn;
        if (ee.isReallyInWater()) {
            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animRunning(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMaghriboselache entity = (EntityPrehistoricFloraMaghriboselache) entitylivingbodyIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*7), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*11), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*11), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*11), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2), upperjaw.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animWalking(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMaghriboselache entity = (EntityPrehistoricFloraMaghriboselache) entitylivingbodyIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*-1.5), pectoralfinright.rotateAngleY + (float) Math.toRadians(0), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1.5), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1.5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*4), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*6), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*8), body4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*8), body5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*8), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), upperjaw.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animAttack(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMaghriboselache entity = (EntityPrehistoricFloraMaghriboselache) entitylivingbodyIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
 if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 5) / 3) * (1-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32.92-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.92 + (((tickAnim - 5) / 3) * (0-(32.92)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -1.25 + (((tickAnim - 5) / 3) * (1-(-1.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 1 + (((tickAnim - 8) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(xx), upperjaw.rotateAngleY + (float) Math.toRadians(yy), upperjaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4};

        EntityPrehistoricFloraMaghriboselache ee = (EntityPrehistoricFloraMaghriboselache) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -.0F;
            this.bob(body, -0.3f, 0F, false, f2, 1);
        }



    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

