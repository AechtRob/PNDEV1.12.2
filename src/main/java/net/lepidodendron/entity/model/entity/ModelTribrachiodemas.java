package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTribrachiodemas;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTribrachiodemas extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Wholecumber;
    private final AdvancedModelRenderer Cumberback;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Cumbermidback;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Cumbermiddle;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Cumbermidfront;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Cumberfront;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;

    private ModelAnimator animator;

    public ModelTribrachiodemas() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Wholecumber = new AdvancedModelRenderer(this);
        this.Wholecumber.setRotationPoint(0.0F, 22.0383F, 5.6071F);


        this.Cumberback = new AdvancedModelRenderer(this);
        this.Cumberback.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Wholecumber.addChild(Cumberback);
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 8, 16, -0.5F, -0.5383F, 0.8929F, 1, 1, 1, 0.0F, false));
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 12, 13, -0.5F, -1.0383F, -1.6071F, 1, 2, 3, 0.0F, false));
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 0, 10, -1.0F, -0.5383F, -1.6071F, 2, 1, 3, 0.0F, false));
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 20, 0, -1.75F, -0.0383F, -1.6321F, 1, 0, 3, 0.0F, false));
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 9, 11, 0.75F, -0.0383F, -1.6321F, 1, 0, 3, 0.0F, false));
        this.Cumberback.cubeList.add(new ModelBox(Cumberback, 25, 5, 0.0F, -1.7883F, -1.6321F, 0, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.4617F, -5.6321F);
        this.Cumberback.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, 0.0F, 0.5F, 4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.2071F, 1.0439F, -6.1321F);
        this.Cumberback.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, 0.0F, -0.5F, 4.5F, 0, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.2071F, 1.0439F, -6.1321F);
        this.Cumberback.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3491F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 23, 0.0F, -0.5F, 4.5F, 0, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.4617F, -5.6321F);
        this.Cumberback.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 24, 0.0F, 0.5F, 4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.75F, 0.7117F, -5.6321F);
        this.Cumberback.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 3, 0.0F, -0.5F, 4.0F, 0, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.75F, 0.7117F, -5.6321F);
        this.Cumberback.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 19, 0.0F, -0.5F, 4.0F, 0, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.75F, -0.7883F, -5.6321F);
        this.Cumberback.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 20, 0.0F, -0.5F, 4.0F, 0, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.75F, -0.7883F, -5.6321F);
        this.Cumberback.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 24, 0.0F, -0.5F, 4.0F, 0, 1, 3, 0.0F, false));

        this.Cumbermidback = new AdvancedModelRenderer(this);
        this.Cumbermidback.setRotationPoint(0.0F, -0.0383F, -1.6071F);
        this.Cumberback.addChild(Cumbermidback);
        this.setRotateAngle(Cumbermidback, -0.1745F, 0.0F, 0.0F);
        this.Cumbermidback.cubeList.add(new ModelBox(Cumbermidback, 0, 5, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Cumbermidback.cubeList.add(new ModelBox(Cumbermidback, 20, 10, -2.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermidback.cubeList.add(new ModelBox(Cumbermidback, 2, 14, 1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermidback.cubeList.add(new ModelBox(Cumbermidback, 6, 25, 0.0F, -2.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Cumbermidback.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 15, 0.0F, 0.0F, 1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.2071F, 1.0821F, -4.5F);
        this.Cumbermidback.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, 0.0F, -1.0F, 1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.2071F, 1.0821F, -4.5F);
        this.Cumbermidback.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 0.0F, -1.0F, 1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, -4.0F);
        this.Cumbermidback.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 17, 0.0F, 0.0F, 1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.75F, 0.75F, -4.0F);
        this.Cumbermidback.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 21, 0.0F, -0.25F, 1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.75F, 0.75F, -4.0F);
        this.Cumbermidback.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 19, 0.0F, -0.25F, 1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.75F, -0.75F, -4.0F);
        this.Cumbermidback.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 21, 0.0F, -1.0F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.75F, -0.75F, -4.0F);
        this.Cumbermidback.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 25, 0.0F, -1.0F, 1.0F, 0, 1, 3, 0.0F, false));

        this.Cumbermiddle = new AdvancedModelRenderer(this);
        this.Cumbermiddle.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Cumbermidback.addChild(Cumbermiddle);
        this.setRotateAngle(Cumbermiddle, 0.1745F, 0.0F, 0.0F);
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 0, 0, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 14, 0, 0.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 0, 14, -1.25F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 14, 8, -0.5F, -1.25F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 14, 4, -0.5F, 0.25F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 20, 13, -2.25F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 16, 0, 1.25F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermiddle.cubeList.add(new ModelBox(Cumbermiddle, 25, 6, 0.0F, -2.25F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.Cumbermiddle.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 17, 0.0F, 0.0F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.2071F, 1.0821F, -1.5F);
        this.Cumbermiddle.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 15, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2071F, 1.0821F, -1.5F);
        this.Cumbermiddle.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 17, 0.0F, -1.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.Cumbermiddle.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, -0.7854F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 19, 0.0F, 0.0F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.75F, 0.75F, -1.0F);
        this.Cumbermiddle.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 21, 0.0F, -0.25F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.75F, 0.75F, -1.0F);
        this.Cumbermiddle.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 13, 0.0F, -0.25F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.75F, -0.75F, -1.0F);
        this.Cumbermiddle.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 22, 0.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.75F, -0.75F, -1.0F);
        this.Cumbermiddle.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 1, 0.0F, -1.0F, -2.0F, 0, 1, 3, 0.0F, false));

        this.Cumbermidfront = new AdvancedModelRenderer(this);
        this.Cumbermidfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Cumbermiddle.addChild(Cumbermidfront);
        this.setRotateAngle(Cumbermidfront, 0.3054F, 0.0F, 0.0F);
        this.Cumbermidfront.cubeList.add(new ModelBox(Cumbermidfront, 7, 2, -1.0F, -1.0F, -3.0F, 2, 2, 3, 0.0F, false));
        this.Cumbermidfront.cubeList.add(new ModelBox(Cumbermidfront, 21, 18, -2.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermidfront.cubeList.add(new ModelBox(Cumbermidfront, 18, 0, 1.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));
        this.Cumbermidfront.cubeList.add(new ModelBox(Cumbermidfront, 25, 7, 0.0F, -2.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Cumbermidfront.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 11, 0.0F, 0.0F, -5.0F, 0, 2, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.2071F, 1.0821F, 1.5F);
        this.Cumbermidfront.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.3491F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 15, 0.0F, -1.0F, -4.5F, 0, 2, 3, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.2071F, 1.0821F, 1.5F);
        this.Cumbermidfront.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -0.3491F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 17, 9, 0.0F, -1.0F, -4.5F, 0, 2, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Cumbermidfront.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 1, 0.0F, 0.0F, -5.0F, 0, 2, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.75F, 0.75F, 2.0F);
        this.Cumbermidfront.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 6, 21, 0.0F, -0.25F, -5.0F, 0, 2, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.75F, 0.75F, 2.0F);
        this.Cumbermidfront.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, 0.7854F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 21, 0.0F, -0.25F, -5.0F, 0, 2, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.75F, -0.75F, 2.0F);
        this.Cumbermidfront.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -0.7854F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 23, 0.0F, -1.0F, -5.0F, 0, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.75F, -0.75F, 2.0F);
        this.Cumbermidfront.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 25, 2, 0.0F, -1.0F, -5.0F, 0, 1, 3, 0.0F, false));

        this.Cumberfront = new AdvancedModelRenderer(this);
        this.Cumberfront.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Cumbermidfront.addChild(Cumberfront);
        this.setRotateAngle(Cumberfront, -0.3054F, 0.0F, 0.0F);
        this.Cumberfront.cubeList.add(new ModelBox(Cumberfront, 7, 11, -0.5F, -1.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Cumberfront.cubeList.add(new ModelBox(Cumberfront, 7, 7, -1.0F, -0.5F, -2.975F, 2, 1, 3, 0.0F, false));
        this.Cumberfront.cubeList.add(new ModelBox(Cumberfront, 4, 0, -1.75F, 0.0F, -2.95F, 1, 0, 3, 0.0F, false));
        this.Cumberfront.cubeList.add(new ModelBox(Cumberfront, 11, 0, 0.75F, 0.0F, -2.95F, 1, 0, 3, 0.0F, false));
        this.Cumberfront.cubeList.add(new ModelBox(Cumberfront, 24, 19, 0.0F, -1.75F, -2.95F, 0, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.5F, 4.05F);
        this.Cumberfront.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 23, 0.0F, 0.5F, -7.0F, 0, 1, 3, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.2071F, 1.0821F, 4.55F);
        this.Cumberfront.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 0.3491F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 23, 0.0F, -0.5F, -7.5F, 0, 1, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.2071F, 1.0821F, 4.55F);
        this.Cumberfront.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, -0.3491F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 23, 0.0F, -0.5F, -7.5F, 0, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.5F, 4.05F);
        this.Cumberfront.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.0F, -0.7854F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 24, 0.0F, 0.5F, -7.0F, 0, 1, 3, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.75F, 0.75F, 4.05F);
        this.Cumberfront.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.0F, -0.7854F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 6, 19, 0.0F, -0.5F, -7.0F, 0, 2, 3, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.75F, 0.75F, 4.05F);
        this.Cumberfront.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0F, 0.7854F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 19, 5, 0.0F, -0.5F, -7.0F, 0, 2, 3, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.75F, -0.75F, 4.05F);
        this.Cumberfront.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, 0.0F, -0.7854F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 24, 18, 0.0F, -0.5F, -7.0F, 0, 1, 3, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.75F, -0.75F, 4.05F);
        this.Cumberfront.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, 0.7854F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 18, 24, 0.0F, -0.5F, -7.0F, 0, 1, 3, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.0F, -2.7545F);
        this.Cumberfront.addChild(mouth);
        this.setRotateAngle(mouth, 0.6545F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 9, 0, -0.5F, -0.5F, -0.7455F, 1, 1, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.5F, -0.7455F);
        this.mouth.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.4363F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, -0.5F, -0.7455F);
        this.mouth.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.4363F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 1, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.5F, 0.0F, -0.7455F);
        this.mouth.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.5236F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 1, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, 0.0F, -0.7455F);
        this.mouth.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.5236F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 4, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Wholecumber.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Wholecumber.offsetY = 0.062F;
        this.Wholecumber.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Wholecumber.offsetY = 1.32F;

        AdvancedModelRenderer[] bodyF = {this.Cumberback, this.Cumbermidback, this.Cumbermiddle, this.Cumbermidfront, this.Cumberfront};
        //AdvancedModelRenderer[] bodyB = {this.segment5, this.segment6, this.segment7, this.segment8, this.segment9};
        AdvancedModelRenderer[] bodyH = {this.Cumberfront};

        EntityPrehistoricFloraTribrachiodemas ee = (EntityPrehistoricFloraTribrachiodemas) e;

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSpeed = 0.05F;

        this.Wholecumber.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.Wholecumber.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.Wholecumber.setScaleX(scaler2 * 0.55F);

        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);

            //this.chainWave(bodyH, legSpeed, 0.1f, -0.8F, f2, 0.4F);
            this.chainSwing(bodyH, legSpeed, 0.1F, 0.8F, f2, 0.45F);

        this.chainWave(bodyF, 0.4F, 0.03f, 0.05, f2, 0.1F);
       // this.chainSwing(bodyB, 0.085F, 0.2f, 0.1, f2, 0.15F);
        this.chainSwing(bodyF, 0.06F, 0.1F, -1, f2, 0.25F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}
