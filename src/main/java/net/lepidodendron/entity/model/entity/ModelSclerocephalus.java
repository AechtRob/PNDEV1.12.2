package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSclerocephalus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSclerocephalus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer armright1;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft1;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;

    private ModelAnimator animator;

    public ModelSclerocephalus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 24.0F, 11.0F);
        this.hip.cubeList.add(new ModelBox(hip, 14, 30, -3.0F, -6.25F, -3.0F, 6, 5, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -6.0F, -2.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -4.0F, -1.0F, -1.0F, 5, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -0.75F, -2.0F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 20, -4.0F, -1.0F, -1.0F, 5, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -3.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.0535F, -0.8002F, -10.0011F, 8, 6, 11, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.4465F, 6.0998F, -9.0011F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -6.0F, -1.0F, -1.0F, 7, 1, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.4465F, -0.4002F, -9.0011F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0262F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 18, -6.0F, -1.0F, -1.0F, 7, 1, 11, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.0535F, 1.9998F, -10.0011F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 27, 0, -3.5F, -2.0F, -5.0F, 7, 5, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, 2.6F, -5.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -5.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -1.5F, -5.0F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1484F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 45, -5.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 50, 12, -3.0F, -2.0F, -2.75F, 6, 4, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -0.05F, -1.5F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 53, -4.0F, -3.0F, -1.0F, 5, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 2.25F, -1.75F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 56, -4.0F, -1.0F, -1.0F, 5, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 46, 30, -1.5F, -1.0F, -8.0F, 3, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 8, -1.5F, -0.6F, -7.95F, 3, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.3F, -1.85F, -2.65F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 8, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.0F, 0.6F, -8.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, -2.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.35F, 0.4F, -8.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.3491F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, -2.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(3.225F, 0.0F, -3.35F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0873F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 63, -2.0F, -1.0F, 0.0F, 2, 1, 4, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.675F, -1.05F, -4.25F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2443F, 0.3054F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 9, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, -1.2F, -3.275F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0873F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 61, -1.5F, -1.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.5F, -1.0F, -8.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2443F, 0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 11, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, 0.0F, -8.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3491F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 60, -2.0F, -1.0F, 0.0F, 2, 1, 5, 0.01F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.225F, 0.0F, -3.35F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0873F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 49, 63, 0.0F, -1.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-3.0F, 0.6F, -8.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.3491F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 1, 2.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.35F, 0.4F, -8.5F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.3491F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 2, 2.0F, -1.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.5F, 0.0F, -8.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3491F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 60, 0.0F, -1.0F, 0.0F, 2, 1, 5, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.3F, -1.85F, -2.65F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2182F, -0.1745F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 8, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.5F, -1.2F, -3.275F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, -0.0873F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 61, -0.5F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -1.225F, -4.025F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 54, -2.5F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.675F, -1.05F, -4.25F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.2443F, -0.3054F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 9, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, -1.0F, -8.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2443F, -0.3054F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 11, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 60, 49, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 45, -1.5F, 0.0F, -8.0F, 3, 1, 8, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 4, -1.5F, -0.25F, -7.9F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 51, 58, -3.0F, -2.0F, -3.0F, 6, 2, 3, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.25F, -0.25F, -8.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.3491F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, -2.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(1.5F, 1.0F, -8.0F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.3491F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 26, -2.0F, -1.0F, 0.0F, 2, 1, 5, -0.01F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(3.2F, 1.0F, -3.35F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0873F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 41, 61, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-3.2F, 1.0F, -3.35F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.0873F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 41, 61, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-3.25F, -0.25F, -8.5F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.3491F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, 2.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.5F, 1.0F, -8.0F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.3491F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 60, 26, 0.0F, -1.0F, 0.0F, 2, 1, 5, -0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.jaw.addChild(bone);
        this.setRotateAngle(bone, -0.096F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 45, 3, -1.5F, -1.0F, 0.0F, 3, 1, 8, -0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.3491F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 13, 60, -2.0F, -1.0F, 0.0F, 2, 1, 5, -0.02F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.2F, 0.0F, 4.65F);
        this.bone.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0873F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 61, 39, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.3491F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 13, 60, 0.0F, -1.0F, 0.0F, 2, 1, 5, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-3.2F, 0.0F, 4.65F);
        this.bone.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.0873F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 61, 39, 0.0F, -1.0F, 0.0F, 2, 1, 4, 0.01F, false));

        this.armright1 = new AdvancedModelRenderer(this);
        this.armright1.setRotationPoint(-3.5F, 2.6F, -2.75F);
        this.chest.addChild(armright1);
        this.setRotateAngle(armright1, 0.0F, 0.4363F, -0.1309F);
        this.armright1.cubeList.add(new ModelBox(armright1, 18, 41, -3.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-2.25F, 0.025F, -0.5F);
        this.armright1.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, -1.5272F, 0.0F);
        this.armright2.cubeList.add(new ModelBox(armright2, 0, 0, -2.25F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-2.25F, 0.5F, 0.1F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.1309F, -0.2182F, 0.0436F);
        this.armright3.cubeList.add(new ModelBox(armright3, 32, 30, -2.25F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

        this.armleft1 = new AdvancedModelRenderer(this);
        this.armleft1.setRotationPoint(3.5F, 2.6F, -2.75F);
        this.chest.addChild(armleft1);
        this.setRotateAngle(armleft1, 0.0F, -0.4363F, 0.1309F);
        this.armleft1.cubeList.add(new ModelBox(armleft1, 18, 41, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(2.25F, 0.025F, -0.5F);
        this.armleft1.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 1.5272F, 0.0F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 0, 0, -0.75F, -1.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(2.25F, 0.5F, 0.1F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.1309F, 0.2182F, -0.0436F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 32, 30, -0.75F, -0.5F, -1.5F, 3, 1, 3, 0.0F, true));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-3.0F, -2.75F, 0.0F);
        this.hip.addChild(legright1);
        this.setRotateAngle(legright1, 0.0F, -0.48F, -0.3927F);
        this.legright1.cubeList.add(new ModelBox(legright1, 59, 5, -3.75F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.5F, 0.0F, 0.1F);
        this.legright1.addChild(legright2);
        this.setRotateAngle(legright2, -0.0873F, 1.2654F, -0.0436F);
        this.legright2.cubeList.add(new ModelBox(legright2, 60, 32, -3.75F, -0.975F, -1.5F, 4, 2, 3, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.75F, 0.5F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, -0.3352F, -0.936F, 0.5803F);
        this.legright3.cubeList.add(new ModelBox(legright3, 59, 0, -3.75F, -0.4F, -1.75F, 4, 1, 4, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(3.0F, -2.75F, 0.0F);
        this.hip.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0F, 0.48F, 0.3927F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 59, 5, -1.25F, -1.0F, -1.5F, 5, 2, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.5F, 0.0F, 0.1F);
        this.legleft1.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.0873F, -1.2654F, 0.0436F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 60, 32, -0.25F, -0.975F, -1.5F, 4, 2, 3, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(2.75F, 0.5F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.3352F, 0.936F, -0.5803F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 59, 0, -0.25F, -0.4F, -1.75F, 4, 1, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.75F, 3.0F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 31, 34, -2.0F, -1.25F, -1.0F, 4, 4, 7, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 27, 0.0F, -1.6F, -1.0F, 0, 1, 7, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 25, 10, 0.0F, 2.75F, -1.0F, 0, 1, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.75F, 6.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 29, 0.0F, 1.25F, 0.0F, 0, 2, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 31, 0.0F, -2.5F, 0.0F, 0, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 39, -1.5F, -1.5F, -1.0F, 3, 3, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 19, 0.0F, -2.25F, 0.0F, 0, 5, 10, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 49, 49, -1.0F, -1.0F, -1.0F, 2, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

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
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraSclerocephalus entitySilesaurus = (EntityPrehistoricFloraSclerocephalus) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraSclerocephalus ee = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSclerocephalus e = (EntityPrehistoricFloraSclerocephalus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
