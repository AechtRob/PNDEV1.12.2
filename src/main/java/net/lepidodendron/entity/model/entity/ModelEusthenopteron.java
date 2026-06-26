package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEusthenopteron;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEusthenopteron extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body7;
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
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer upperjaw;
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
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;

    private ModelAnimator animator;

    public ModelEusthenopteron() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.4F, -8.75F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.425F, 0.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 26, -2.0F, 1.0F, -2.0F, 4, 1, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 30, -2.5F, 1.0F, 1.0F, 5, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.575F, -0.85F, 0.1F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0262F, 0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 59, 1.0F, -2.0F, -2.0F, 1, 4, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.575F, -0.85F, 0.1F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0262F, -0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 59, -2.0F, -2.0F, -2.0F, 1, 4, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0262F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 46, -2.0F, -3.0F, -2.0F, 4, 5, 3, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, -2.5F, -3.0F, 1.0F, 5, 5, 6, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.175F, 1.1F, 0.4F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.4363F, -0.3491F, 0.2618F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 60, 4, -0.5F, -0.375F, -0.5F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.375F, 0.5F);
        this.pectoralfinright.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1658F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 53, 0.0F, -2.725F, 1.0F, 0, 3, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.175F, 1.1F, 0.4F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.4363F, 0.3491F, -0.2618F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 60, 4, -0.5F, -0.375F, -0.5F, 1, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.375F, 0.5F);
        this.pectoralfinleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1658F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 53, 0.0F, -2.725F, 1.0F, 0, 3, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.35F, 7.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 22, 12, -2.0F, 2.3F, -0.7F, 4, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.325F, 2.5F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0262F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -2.5F, -2.0F, -3.0F, 5, 5, 7, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 6.5F);
        this.body2.addChild(body3);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 1.275F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 20, -2.0F, 2.0F, -2.0F, 4, 1, 5, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.275F, 0.475F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 52, 0.0F, 0.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.35F, 1.5F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 20, -2.5F, -2.0F, -2.0F, 5, 5, 5, -0.02F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.225F, 2.25F, 3.65F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.5672F, -0.1309F, 0.3927F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 60, 11, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.75F, 1.75F);
        this.pelvicfinright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3011F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 60, 0.0F, -1.725F, -0.5F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.225F, 2.25F, 3.65F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.5672F, 0.1309F, -0.3927F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 60, 11, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.75F, 1.75F);
        this.pelvicfinleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3011F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 60, 0.0F, -1.725F, -0.5F, 0, 2, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 4.4F);
        this.body3.addChild(body4);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.55F, 0.95F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 46, -1.5F, 0.0F, -2.0F, 3, 1, 5, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.75F, 0.95F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 37, -2.0F, -3.0F, -2.0F, 4, 4, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 3.95F);
        this.body4.addChild(body5);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.1F, 0.25F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 46, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.225F, 0.25F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1658F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 0, -1.5F, -2.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.125F, 2.75F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 23, 0.0F, 0.0F, -1.75F, 0, 3, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.125F, -0.25F);
        this.body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.7679F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 35, 0.0F, 0.0F, -0.75F, 0, 3, 8, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.025F, 4.25F);
        this.body5.addChild(body6);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.725F, 0.275F);
        this.body6.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0349F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 54, 30, -1.0F, 0.0F, -1.0F, 2, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.475F, 0.2F);
        this.body6.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 53, -1.0F, -2.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.275F, 3.1F);
        this.body6.addChild(body7);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.95F, 0.45F);
        this.body7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.8727F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 8, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.25F, 0.3F);
        this.body7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4189F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 57, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.75F, -1.025F);
        this.body7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0611F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 30, 0.0F, -5.0F, 0.0F, 0, 9, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.4F, 0.1F);
        this.body7.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 54, -0.5F, -1.0F, -1.0F, 1, 1, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.325F, -2.4F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.375F, 0.7F, -5.15F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2705F, 0.1745F, -0.0393F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 54, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.375F, 0.2F, -5.575F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2705F, 0.1745F, -0.0393F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 18, 27, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.65F, 0.45F, -3.6F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0698F, 0.1745F, -0.0393F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 20, 25, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.075F, 0.75F, -1.25F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0131F, 0.1833F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 46, 0.0F, -1.0F, -4.0F, 1, 1, 6, 0.01F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.925F, 0.425F, -1.775F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0087F, 0.1745F, -0.0393F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 37, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.925F, 0.425F, -1.775F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0087F, -0.1745F, 0.0393F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 37, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.65F, 0.45F, -3.6F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0698F, -0.1745F, 0.0393F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 20, 25, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.375F, 0.2F, -5.575F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.2705F, -0.1745F, 0.0393F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 18, 27, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.375F, 0.7F, -5.15F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2705F, -0.1745F, 0.0393F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 54, -1.0F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.675F, -5.275F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.2705F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 9, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.9F, -1.2F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0436F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 56, 26, -1.5F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 15, -1.0F, -1.0F, -4.0F, 2, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.075F, 0.75F, -1.25F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0131F, -0.1833F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 30, 46, -1.0F, -1.0F, -4.0F, 1, 1, 6, 0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.75F, -1.25F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0087F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 8, -1.0F, -1.0F, -4.0F, 2, 1, 6, 0.01F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.725F, -2.4F);
        this.body.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.2967F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 24, 0, -1.0F, -1.0F, -7.4F, 2, 1, 8, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, -2.1F, -5.75F);
        this.upperjaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3971F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 44, 15, -1.5F, 0.0F, 2.0F, 3, 1, 4, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -2.0F, -5.7F);
        this.upperjaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4407F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 50, 43, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -1.0F, -7.4F);
        this.upperjaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.5367F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 32, 9, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.95F, 0.25F, -2.35F);
        this.upperjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0349F, 0.1745F, -0.0393F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 16, 35, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.675F, 0.375F, -4.075F);
        this.upperjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0175F, 0.1745F, -0.0393F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 18, 25, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.4F, 0.35F, -5.675F);
        this.upperjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0087F, 0.1745F, -0.0393F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 27, 0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.475F, -3.025F, -0.55F);
        this.upperjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.4276F, 0.2138F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 18, 23, 0.0F, -0.8F, -5.75F, 1, 1, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.525F, 0.0F, -0.3F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.2138F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 50, 37, -1.0F, -1.0F, -7.0F, 2, 1, 5, -0.01F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.175F, 0.0F, 4.55F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.1571F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 58, 49, -1.0F, -1.0F, -7.0F, 2, 1, 3, 0.01F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(2.175F, -1.1F, 4.35F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1249F, 0.1746F, -0.009F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 58, 43, -1.0F, -3.0F, -7.0F, 2, 3, 3, 0.01F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-2.175F, -1.1F, 4.35F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.1249F, -0.1746F, 0.009F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 58, 43, -1.0F, -3.0F, -7.0F, 2, 3, 3, 0.01F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-2.175F, 0.0F, 4.55F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, -0.1571F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 58, 49, -1.0F, -1.0F, -7.0F, 2, 1, 3, 0.01F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.4F, -3.025F, -0.55F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.432F, 0.2094F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 60, 0, 0.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, true));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 52, 53, 0.0F, -1.0F, -7.0F, 1, 1, 5, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.4F, -3.025F, -0.55F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.432F, -0.2094F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 60, 0, -1.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 52, 53, -1.0F, -1.0F, -7.0F, 1, 1, 5, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.475F, -3.025F, -0.55F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.4276F, -0.2138F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 18, 23, -1.0F, -0.8F, -5.75F, 1, 1, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.4F, 0.35F, -5.675F);
        this.upperjaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.0087F, -0.1745F, 0.0393F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 20, 27, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.95F, 0.25F, -2.35F);
        this.upperjaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0349F, -0.1745F, 0.0393F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 16, 35, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.675F, 0.375F, -4.075F);
        this.upperjaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0175F, -0.1745F, 0.0393F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 18, 25, -0.8F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.525F, 0.0F, -0.3F);
        this.upperjaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.2138F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 50, 37, -1.0F, -1.0F, -7.0F, 2, 1, 5, -0.01F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.6F;
        this.body.offsetX = 1.45F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.25F;
        this.body.offsetZ = 0.08F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, -0.1F, 0.0F);

        this.body.offsetZ = -0.2F;
        this.body.offsetY = -0.05F;
        this.body.offsetX = 0.032F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
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

        this.body.offsetY = 0.F;
        this.body.offsetZ = -0.F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};
        ((EntityPrehistoricFloraEusthenopteron)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.198F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.2F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        speed = speed * 1.3F;

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.40F * still, -1.05, f2, 0.5F * still);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }

        this.walk(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.walk(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(pectoralfinright, (float) (speed * 0.75), -0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinright, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);



        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.3F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperjaw, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }
}