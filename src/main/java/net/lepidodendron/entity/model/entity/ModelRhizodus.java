package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRhizodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRhizodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer jawright;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer jawleft;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer upperjaw;
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
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;

    private ModelAnimator animator;

    public ModelRhizodus() {
        this.textureWidth = 112;
        this.textureHeight = 112;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -27.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 42, -3.0F, -10.75F, 10.5F, 6, 9, 8, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.725F, 11.2F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 69, -2.5F, -9.0F, 0.0F, 5, 2, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.925F, 5.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1222F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 70, -2.0F, -8.0F, -1.0F, 4, 2, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.075F, -1.9F, 3.9F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0698F, 0.0698F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 72, 1.5F, -8.0F, -1.0F, 1, 7, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.075F, -1.9F, 3.8F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, -0.0698F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 72, -2.5F, -8.0F, -1.0F, 1, 7, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.35F, 3.7F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 53, -2.5F, -8.0F, -1.0F, 5, 8, 8, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, -5.325F, 11.225F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.6109F, -0.2618F, 0.4363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 88, 29, -0.5F, -2.5F, -0.5F, 1, 4, 5, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 87, -0.5F, -4.35F, 4.2F, 1, 6, 5, 0.01F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 36, 80, 0.0F, -5.35F, 5.95F, 0, 7, 8, 0.0F, false));
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 32, 95, -0.5F, -2.6F, 9.2F, 1, 4, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, -5.325F, 11.225F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.6109F, 0.2618F, -0.4363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 88, 29, -0.5F, -2.5F, -0.5F, 1, 4, 5, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 87, -0.5F, -4.35F, 4.2F, 1, 6, 5, 0.01F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 36, 80, 0.0F, -5.35F, 5.95F, 0, 7, 8, 0.0F, true));
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 32, 95, -0.5F, -2.6F, 9.2F, 1, 4, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -9.2F, 18.45F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0175F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, -1.5F, -0.75F, 6, 9, 12, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.675F, 0.225F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 0, -2.5F, -1.0F, -1.0F, 5, 2, 12, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0175F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.45F, 0.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0175F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 40, -2.0F, -1.0F, -1.0F, 4, 1, 12, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.55F, 0.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -2.5F, -1.0F, -1.0F, 5, 9, 12, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body3.addChild(body4);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.875F, 0.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0262F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 21, -2.0F, 0.0F, -1.0F, 4, 8, 11, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.2F, 1.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0175F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 59, -1.5F, -1.0F, -2.0F, 3, 2, 11, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.65F, 6.175F, 8.075F);
        this.body4.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.6981F, -0.2618F, 0.3054F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 94, 87, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 94, 93, 0.0F, -1.75F, 1.0F, 0, 3, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.65F, 6.175F, 8.075F);
        this.body4.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.6981F, 0.2618F, -0.3054F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 94, 87, -0.5F, -1.0F, 0.0F, 1, 2, 4, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 94, 93, 0.0F, -1.75F, 1.0F, 0, 3, 4, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.8F, 10.0F);
        this.body4.addChild(body5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.3F, -7.2F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 95, 0.0F, -1.0F, 7.0F, 0, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.1F, 0.0F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 96, 0.0F, -1.0F, 8.0F, 0, 2, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 80, 47, -0.5F, -1.0F, -1.0F, 1, 2, 9, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.775F, 0.0F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 69, -1.0F, -1.0F, -1.0F, 2, 2, 10, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.1F, 0.1F);
        this.body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 53, -1.5F, -1.0F, -1.0F, 3, 7, 10, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0873F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.05F, 0.0F);
        this.body6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1396F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 81, -0.5F, -0.75F, -1.0F, 1, 2, 7, 0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.95F, 1.7F);
        this.body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 42, 0.0F, -2.0F, 5.9F, 0, 4, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 87, -0.5F, -1.0F, 4.0F, 1, 3, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.15F, 0.0F);
        this.body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 80, -1.0F, -1.0F, -1.0F, 2, 6, 7, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, -0.05F, 6.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 80, 58, -0.5F, -2.0F, -0.5F, 1, 4, 7, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.6F, 0.5F);
        this.body7.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1047F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 68, 87, -0.5F, 0.0F, -1.0F, 1, 2, 6, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.85F, 6.4F);
        this.body7.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 14, 0.0F, 0.0F, -1.0F, 0, 7, 11, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -2.75F, 6.4F);
        this.body7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 86, 10, -0.5F, 0.0F, -1.0F, 1, 2, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.875F, 6.4F);
        this.body7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3709F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 6, 98, -0.5F, 0.0F, 6.0F, 1, 1, 2, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.375F, 4.3F);
        this.body7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 32, -0.5F, -3.0F, -1.0F, 1, 5, 10, -0.02F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.8F, 0.5F);
        this.body7.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2007F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 88, 38, -0.5F, 0.0F, -1.0F, 1, 2, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.15F, 2.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1484F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 10, -0.7F, -0.65F, -9.9F, 1, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 10, -0.3F, -0.65F, -9.9F, 1, 1, 3, 0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 66, 47, -1.0F, -0.65F, -6.9F, 2, 2, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 14, -1.5F, -0.65F, -2.9F, 3, 2, 4, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 1.975F, 18.1F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0262F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 78, 78, -2.0F, -1.0F, -25.0F, 3, 1, 8, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.3F, 2.75F, 5.025F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0349F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 6, 0.0F, -2.0F, -15.0F, 1, 1, 3, 0.0F, true));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 94, 6, -0.4F, -2.0F, -15.0F, 1, 1, 3, 0.0F, false));

        this.jawright = new AdvancedModelRenderer(this);
        this.jawright.setRotationPoint(-0.7F, 1.35F, -9.9F);
        this.jaw.addChild(jawright);
        this.setRotateAngle(jawright, 0.0F, -0.2793F, 0.0F);
        this.jawright.cubeList.add(new ModelBox(jawright, 78, 10, 0.0F, -2.0F, 0.0F, 1, 1, 3, 0.0F, false));
        this.jawright.cubeList.add(new ModelBox(jawright, 64, 95, 0.0F, -1.2F, 0.0F, 1, 1, 3, -0.01F, false));
        this.jawright.cubeList.add(new ModelBox(jawright, 62, 14, 0.425F, -3.1F, 0.0F, 0, 2, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.7F, 0.0F, 6.9F);
        this.jawright.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1265F, 0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 93, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.675F, 0.0F, 6.9F);
        this.jawright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.2182F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 68, 81, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.jawright.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.1745F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 52, 90, 0.0F, -2.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.475F, -1.3F, 4.55F);
        this.jawright.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.1745F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 96, 58, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.85F, -0.55F, 3.85F);
        this.jawright.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0873F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 64, 35, 0.0F, -2.0F, 2.0F, 0, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.6F, -0.825F, 2.45F);
        this.jawright.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0873F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 64, 32, 0.0F, -2.0F, 2.0F, 0, 2, 1, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.325F, -0.825F, 0.75F);
        this.jawright.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0873F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 62, 17, 0.0F, -2.0F, 2.0F, 0, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.05F, -1.3F, 0.75F);
        this.jawright.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0873F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 49, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));

        this.jawleft = new AdvancedModelRenderer(this);
        this.jawleft.setRotationPoint(0.7F, 1.35F, -9.9F);
        this.jaw.addChild(jawleft);
        this.setRotateAngle(jawleft, 0.0F, 0.2793F, 0.0F);
        this.jawleft.cubeList.add(new ModelBox(jawleft, 78, 10, -1.0F, -2.0F, 0.0F, 1, 1, 3, 0.0F, true));
        this.jawleft.cubeList.add(new ModelBox(jawleft, 64, 95, -1.0F, -1.2F, 0.0F, 1, 1, 3, -0.01F, true));
        this.jawleft.cubeList.add(new ModelBox(jawleft, 62, 14, -0.425F, -3.1F, 0.0F, 0, 2, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.7F, 0.0F, 6.9F);
        this.jawleft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1265F, -0.2182F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 93, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.675F, 0.0F, 6.9F);
        this.jawleft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.2182F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 68, 81, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.jawleft.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.1745F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 52, 90, -2.0F, -2.0F, 0.0F, 2, 2, 4, -0.01F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.475F, -1.3F, 4.55F);
        this.jawleft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.1745F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 96, 58, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.85F, -0.55F, 3.85F);
        this.jawleft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.0873F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 64, 35, 0.0F, -2.0F, 2.0F, 0, 1, 1, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.6F, -0.825F, 2.45F);
        this.jawleft.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.0873F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 64, 32, 0.0F, -2.0F, 2.0F, 0, 2, 1, 0.0F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.325F, -0.825F, 0.75F);
        this.jawleft.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.0873F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 62, 17, 0.0F, -2.0F, 2.0F, 0, 2, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.05F, -1.3F, 0.75F);
        this.jawleft.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.0873F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 28, 49, 0.0F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, -5.0F, 1.25F);
        this.body.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.1309F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 88, 45, -1.0F, -1.0F, -9.225F, 2, 1, 1, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -4.25F, -4.75F);
        this.upperjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.2959F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 87, -1.5F, -7.25F, 0.0F, 3, 6, 3, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, -2.7F, -8.15F);
        this.upperjaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -1.1825F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 12, 93, -1.0F, -5.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, -1.825F, -8.775F);
        this.upperjaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.8858F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 96, 66, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, -0.95F, -9.225F);
        this.upperjaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.4669F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 94, 45, -1.0F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.725F, -3.8F, -5.775F);
        this.upperjaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.1658F, 0.0742F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 86, 19, -1.0F, 0.0F, 2.0F, 1, 4, 6, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.95F, -2.0F, -9.325F);
        this.upperjaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.3665F, 0.1658F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 18, 72, -1.0F, 0.0F, 2.0F, 1, 3, 4, 0.0F, true));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.9F, -1.775F, -8.825F);
        this.upperjaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.5323F, 0.2574F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 98, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.125F, -2.975F, -9.625F);
        this.upperjaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.1658F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 64, 90, -1.0F, 1.0F, 3.0F, 1, 1, 1, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(1.0F, 0.0F, -9.225F);
        this.upperjaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0873F, 0.2051F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 72, 95, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(1.625F, 0.3F, -6.35F);
        this.upperjaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.1222F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 94, 0, -1.0F, -2.0F, 0.0F, 1, 2, 4, -0.01F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(2.1F, 0.275F, -2.425F);
        this.upperjaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.0524F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 50, 14, -1.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(1.45F, -0.025F, -6.225F);
        this.upperjaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.1047F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 86, 96, -0.1F, -0.5F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.625F, -0.025F, -8.725F);
        this.upperjaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0873F, 0.2269F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 80, 96, -0.1F, -0.5F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.75F, -0.275F, -9.225F);
        this.upperjaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.0873F, 0.2269F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 96, 62, -0.1F, -0.5F, 0.3F, 0, 1, 3, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-2.1F, 0.275F, -2.425F);
        this.upperjaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.0524F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 50, 14, 0.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.625F, 0.3F, -6.35F);
        this.upperjaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.1222F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 94, 0, 0.0F, -2.0F, 0.0F, 1, 2, 4, -0.01F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.725F, -3.8F, -5.775F);
        this.upperjaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1658F, -0.0742F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 86, 19, 0.0F, 0.0F, 2.0F, 1, 4, 6, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.125F, -2.975F, -9.625F);
        this.upperjaw.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.1658F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 64, 90, 0.0F, 1.0F, 3.0F, 1, 1, 1, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.95F, -2.0F, -9.325F);
        this.upperjaw.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.3665F, -0.1658F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 18, 72, 0.0F, 0.0F, 2.0F, 1, 3, 4, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.9F, -1.775F, -8.825F);
        this.upperjaw.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.5323F, -0.2574F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 98, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-1.45F, -0.025F, -6.225F);
        this.upperjaw.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, -0.1047F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 86, 96, 0.1F, -0.5F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(-0.625F, -0.025F, -8.725F);
        this.upperjaw.addChild(cube_r63);
        this.setRotateAngle(cube_r63, -0.0873F, -0.2269F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 80, 96, 0.1F, -0.5F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(-0.75F, -0.275F, -9.225F);
        this.upperjaw.addChild(cube_r64);
        this.setRotateAngle(cube_r64, -0.0873F, -0.2269F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 96, 62, 0.1F, -0.5F, 0.3F, 0, 1, 3, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-1.0F, 0.0F, -9.225F);
        this.upperjaw.addChild(cube_r65);
        this.setRotateAngle(cube_r65, -0.0873F, -0.2051F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 72, 95, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 0.175F, -4.25F);
        this.upperjaw.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0175F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 70, 0, -1.5F, -1.0F, -2.0F, 3, 1, 9, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 0.0F, -8.225F);
        this.upperjaw.addChild(cube_r67);
        this.setRotateAngle(cube_r67, -0.1047F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 48, 96, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

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
        this.body.offsetY = -0.05F;
        this.body.offsetX = 0.2F;
        this.body.offsetZ = 3.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.4F;
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
        this.body.offsetX = -0.3F;
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.3F, 0.0F);
        this.body.offsetY = -0.5F;
        this.body.render(0.01F);
        resetToDefaultPose();


    }
    public void renderStaticSuspended(float f) {

        this.setRotateAngle(body, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.5F, 0.0F);
        this.body.offsetY = 0.1F;
        this.body.render(0.01F);
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

        this.body.offsetY = -0.1F;
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body6};
        ((EntityPrehistoricFloraRhizodus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.125F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.22F;
        }
        if (!e.isInWater()) {
            speed = 0.20F;
        }

        //this.head.rotateAngleY += ((f3 / 2F) / (180F / (float) Math.PI));
        //this.head.rotateAngleX += ((f4 / 2F) / (180F / (float) Math.PI));
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.35F * still, -0.65, f2, 0.6F * still);
            this.swing(body, speed, 0.1F * still, true, 0, 0, f2, 0.65F);
        }
        else {
            this.swing(body, speed, 0.06F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.3F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.3F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.3F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.3F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.6F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.8F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.6F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = -0.15F;
            this.bob(body, -speed * 1.8F, 1.5F, false, f2, 1);
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
        animator.startKeyframe(4);
        animator.move(this.upperjaw, 0,0,-0.5F);
        animator.rotate(this.upperjaw, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}

