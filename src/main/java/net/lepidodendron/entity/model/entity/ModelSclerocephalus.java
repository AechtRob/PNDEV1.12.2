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
        this.neck.offsetZ = -0.1F;
        this.neck.offsetY = -0.0F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(chest, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(neck, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(head, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.hip.offsetY = -0.05F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.8F;
        this.hip.offsetX = -0.2F;
        this.hip.rotateAngleY = (float)Math.toRadians(140);
        this.hip.rotateAngleX = (float)Math.toRadians(24);
        this.hip.rotateAngleZ = (float)Math.toRadians(5);
        this.hip.scaleChildren = true;
        float scaler = 0.98F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
        resetToDefaultPose();
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
        } else if (ee.getAnimation() == ee.LOOK_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*2), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+20))*0.15);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+130))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+220))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+270))*2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+70))*2));


        this.bone.rotationPointX = this.bone.rotationPointX + (float)(0);
        this.bone.rotationPointY = this.bone.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*0.13);
        this.bone.rotationPointZ = this.bone.rotationPointZ + (float)(0);
        this.bone.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-0.2),(float)1);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 12.35901 + (((tickAnim - 0) / 9) * (11.34477-(12.35901)));
            yy = 24.10998 + (((tickAnim - 0) / 9) * (-14.45335-(24.10998)));
            zz = 16.16404 + (((tickAnim - 0) / 9) * (31.86318-(16.16404)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 11.34477 + (((tickAnim - 9) / 10) * (0-(11.34477)));
            yy = -14.45335 + (((tickAnim - 9) / 10) * (-45.75-(-14.45335)));
            zz = 31.86318 + (((tickAnim - 9) / 10) * (0-(31.86318)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (12.35901-(0)));
            yy = -45.75 + (((tickAnim - 19) / 21) * (24.10998-(-45.75)));
            zz = 0 + (((tickAnim - 19) / 21) * (16.16404-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 35.66174 + (((tickAnim - 0) / 9) * (22.71969-(35.66174)));
            yy = 52.55505 + (((tickAnim - 0) / 9) * (60.31307-(52.55505)));
            zz = 10.94124 + (((tickAnim - 0) / 9) * (-11.85914-(10.94124)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 22.71969 + (((tickAnim - 9) / 8) * (-9.76477-(22.71969)));
            yy = 60.31307 + (((tickAnim - 9) / 8) * (32.19719-(60.31307)));
            zz = -11.85914 + (((tickAnim - 9) / 8) * (5.88031-(-11.85914)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -9.76477 + (((tickAnim - 17) / 2) * (5.53832-(-9.76477)));
            yy = 32.19719 + (((tickAnim - 17) / 2) * (31.6814-(32.19719)));
            zz = 5.88031 + (((tickAnim - 17) / 2) * (-6.6852-(5.88031)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 5.53832 + (((tickAnim - 19) / 21) * (35.66174-(5.53832)));
            yy = 31.6814 + (((tickAnim - 19) / 21) * (52.55505-(31.6814)));
            zz = -6.6852 + (((tickAnim - 19) / 21) * (10.94124-(-6.6852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 49.05567 + (((tickAnim - 0) / 9) * (35.21116-(49.05567)));
            yy = -35.69393 + (((tickAnim - 0) / 9) * (20.80734-(-35.69393)));
            zz = -55.71994 + (((tickAnim - 0) / 9) * (-45.5353-(-55.71994)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 35.21116 + (((tickAnim - 9) / 8) * (-2.45978-(35.21116)));
            yy = 20.80734 + (((tickAnim - 9) / 8) * (3.73322-(20.80734)));
            zz = -45.5353 + (((tickAnim - 9) / 8) * (15.40566-(-45.5353)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -2.45978 + (((tickAnim - 17) / 2) * (0-(-2.45978)));
            yy = 3.73322 + (((tickAnim - 17) / 2) * (0-(3.73322)));
            zz = 15.40566 + (((tickAnim - 17) / 2) * (0-(15.40566)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (-11.02745-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (-12.36674-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-2.02682-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -11.02745 + (((tickAnim - 23) / 7) * (-11.73073-(-11.02745)));
            yy = -12.36674 + (((tickAnim - 23) / 7) * (-28.85572-(-12.36674)));
            zz = -2.02682 + (((tickAnim - 23) / 7) * (-4.72926-(-2.02682)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -11.73073 + (((tickAnim - 30) / 10) * (49.05567-(-11.73073)));
            yy = -28.85572 + (((tickAnim - 30) / 10) * (-35.69393-(-28.85572)));
            zz = -4.72926 + (((tickAnim - 30) / 10) * (-55.71994-(-4.72926)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.14925-(0)));
            yy = 45.75 + (((tickAnim - 0) / 13) * (10.42522-(45.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (-11.71863-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 10.14925 + (((tickAnim - 13) / 13) * (20.88273-(10.14925)));
            yy = 10.42522 + (((tickAnim - 13) / 13) * (-21.81193-(10.42522)));
            zz = -11.71863 + (((tickAnim - 13) / 13) * (-27.6214-(-11.71863)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 20.88273 + (((tickAnim - 26) / 7) * (13.01104-(20.88273)));
            yy = -21.81193 + (((tickAnim - 26) / 7) * (18.00747-(-21.81193)));
            zz = -27.6214 + (((tickAnim - 26) / 7) * (-33.09431-(-27.6214)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 13.01104 + (((tickAnim - 33) / 7) * (0-(13.01104)));
            yy = 18.00747 + (((tickAnim - 33) / 7) * (45.75-(18.00747)));
            zz = -33.09431 + (((tickAnim - 33) / 7) * (0-(-33.09431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 5.53832 + (((tickAnim - 0) / 13) * (-3.41411-(5.53832)));
            yy = -31.68145 + (((tickAnim - 0) / 13) * (-42.45495-(-31.68145)));
            zz = 6.68518 + (((tickAnim - 0) / 13) * (8.88186-(6.68518)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -3.41411 + (((tickAnim - 13) / 13) * (35.66174-(-3.41411)));
            yy = -42.45495 + (((tickAnim - 13) / 13) * (-52.5551-(-42.45495)));
            zz = 8.88186 + (((tickAnim - 13) / 13) * (10.94124-(8.88186)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 35.66174 + (((tickAnim - 26) / 7) * (16.39264-(35.66174)));
            yy = -52.5551 + (((tickAnim - 26) / 7) * (-53.63649-(-52.5551)));
            zz = 10.94124 + (((tickAnim - 26) / 7) * (3.54425-(10.94124)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 16.39264 + (((tickAnim - 33) / 5) * (9.4016+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25-(16.39264)));
            yy = -53.63649 + (((tickAnim - 33) / 5) * (-30.14079-(-53.63649)));
            zz = 3.54425 + (((tickAnim - 33) / 5) * (15.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50-(3.54425)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 9.4016+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25 + (((tickAnim - 38) / 2) * (5.53832-(9.4016+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*25)));
            yy = -30.14079 + (((tickAnim - 38) / 2) * (-31.68145-(-30.14079)));
            zz = 15.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50 + (((tickAnim - 38) / 2) * (6.68518-(15.4645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -7 + (((tickAnim - 13) / 13) * (25.55567-(-7)));
            yy = 0 + (((tickAnim - 13) / 13) * (-35.6939-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (55.7199-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 25.55567 + (((tickAnim - 26) / 7) * (7.1719-(25.55567)));
            yy = -35.6939 + (((tickAnim - 26) / 7) * (-26.2074-(-35.6939)));
            zz = 55.7199 + (((tickAnim - 26) / 7) * (56.43783-(55.7199)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 7.1719 + (((tickAnim - 33) / 5) * (-14.3225-(7.1719)));
            yy = -26.2074 + (((tickAnim - 33) / 5) * (-13.12455-(-26.2074)));
            zz = 56.43783 + (((tickAnim - 33) / 5) * (-6.90125-(56.43783)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -14.3225 + (((tickAnim - 38) / 2) * (0-(-14.3225)));
            yy = -13.12455 + (((tickAnim - 38) / 2) * (0-(-13.12455)));
            zz = -6.90125 + (((tickAnim - 38) / 2) * (0-(-6.90125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3.29922 + (((tickAnim - 0) / 20) * (-0.25962-(3.29922)));
            yy = -2.2234 + (((tickAnim - 0) / 20) * (44.24838-(-2.2234)));
            zz = -3.21821 + (((tickAnim - 0) / 20) * (2.54747-(-3.21821)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -0.25962 + (((tickAnim - 20) / 8) * (-13.74536-(-0.25962)));
            yy = 44.24838 + (((tickAnim - 20) / 8) * (5.67364-(44.24838)));
            zz = 2.54747 + (((tickAnim - 20) / 8) * (37.15235-(2.54747)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -13.74536 + (((tickAnim - 28) / 7) * (6.29302-(-13.74536)));
            yy = 5.67364 + (((tickAnim - 28) / 7) * (-16.3923-(5.67364)));
            zz = 37.15235 + (((tickAnim - 28) / 7) * (-9.0378-(37.15235)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 6.29302 + (((tickAnim - 35) / 5) * (3.29922-(6.29302)));
            yy = -16.3923 + (((tickAnim - 35) / 5) * (-2.2234-(-16.3923)));
            zz = -9.0378 + (((tickAnim - 35) / 5) * (-3.21821-(-9.0378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(xx), legright1.rotateAngleY + (float) Math.toRadians(yy), legright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 18.50489 + (((tickAnim - 0) / 20) * (-19.25-(18.50489)));
            yy = -37.07172 + (((tickAnim - 0) / 20) * (-9.25-(-37.07172)));
            zz = 10.4654 + (((tickAnim - 0) / 20) * (0-(10.4654)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -19.25 + (((tickAnim - 20) / 8) * (-2.26244-(-19.25)));
            yy = -9.25 + (((tickAnim - 20) / 8) * (-42.55917-(-9.25)));
            zz = 0 + (((tickAnim - 20) / 8) * (-0.92711-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -2.26244 + (((tickAnim - 28) / 5) * (5.8839-(-2.26244)));
            yy = -42.55917 + (((tickAnim - 28) / 5) * (-53.93501-(-42.55917)));
            zz = -0.92711 + (((tickAnim - 28) / 5) * (3.67718-(-0.92711)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5.8839 + (((tickAnim - 33) / 2) * (22.80396-(5.8839)));
            yy = -53.93501 + (((tickAnim - 33) / 2) * (-40.17621-(-53.93501)));
            zz = 3.67718 + (((tickAnim - 33) / 2) * (11.81247-(3.67718)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 22.80396 + (((tickAnim - 35) / 5) * (18.50489-(22.80396)));
            yy = -40.17621 + (((tickAnim - 35) / 5) * (-37.07172-(-40.17621)));
            zz = 11.81247 + (((tickAnim - 35) / 5) * (10.4654-(11.81247)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (18.45191-(0)));
            yy = -7.75 + (((tickAnim - 0) / 13) * (-19.53479-(-7.75)));
            zz = 0 + (((tickAnim - 0) / 13) * (-17.81911-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.45191 + (((tickAnim - 13) / 7) * (75.19075-(18.45191)));
            yy = -19.53479 + (((tickAnim - 13) / 7) * (-21.1381-(-19.53479)));
            zz = -17.81911 + (((tickAnim - 13) / 7) * (-37.3934-(-17.81911)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 75.19075 + (((tickAnim - 20) / 8) * (130.72635-(75.19075)));
            yy = -21.1381 + (((tickAnim - 20) / 8) * (68.62573-(-21.1381)));
            zz = -37.3934 + (((tickAnim - 20) / 8) * (-50.31233-(-37.3934)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 130.72635 + (((tickAnim - 28) / 5) * (19.24165-(130.72635)));
            yy = 68.62573 + (((tickAnim - 28) / 5) * (11.9535-(68.62573)));
            zz = -50.31233 + (((tickAnim - 28) / 5) * (-9.96393-(-50.31233)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 19.24165 + (((tickAnim - 33) / 2) * (0-(19.24165)));
            yy = 11.9535 + (((tickAnim - 33) / 2) * (0-(11.9535)));
            zz = -9.96393 + (((tickAnim - 33) / 2) * (0-(-9.96393)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (-7.75-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3.70592 + (((tickAnim - 0) / 6) * (-1.63574-(3.70592)));
            yy = -45.89304 + (((tickAnim - 0) / 6) * (-17.15513-(-45.89304)));
            zz = -11.6002 + (((tickAnim - 0) / 6) * (-39.22057-(-11.6002)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -1.63574 + (((tickAnim - 6) / 7) * (6.29302-(-1.63574)));
            yy = -17.15513 + (((tickAnim - 6) / 7) * (16.3923-(-17.15513)));
            zz = -39.22057 + (((tickAnim - 6) / 7) * (9.0378-(-39.22057)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 6.29302 + (((tickAnim - 13) / 27) * (3.70592-(6.29302)));
            yy = 16.3923 + (((tickAnim - 13) / 27) * (-45.89304-(16.3923)));
            zz = 9.0378 + (((tickAnim - 13) / 27) * (-11.6002-(9.0378)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 19.25 + (((tickAnim - 0) / 6) * (-1.0024-(19.25)));
            yy = 9.25 + (((tickAnim - 0) / 6) * (40.60435-(9.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (6.71378-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.0024 + (((tickAnim - 6) / 4) * (5.7509-(-1.0024)));
            yy = 40.60435 + (((tickAnim - 6) / 4) * (64.72993-(40.60435)));
            zz = 6.71378 + (((tickAnim - 6) / 4) * (-11.50585-(6.71378)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.7509 + (((tickAnim - 10) / 3) * (22.80396-(5.7509)));
            yy = 64.72993 + (((tickAnim - 10) / 3) * (40.1762-(64.72993)));
            zz = -11.50585 + (((tickAnim - 10) / 3) * (-11.8125-(-11.50585)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 22.80396 + (((tickAnim - 13) / 27) * (19.25-(22.80396)));
            yy = 40.1762 + (((tickAnim - 13) / 27) * (9.25-(40.1762)));
            zz = -11.8125 + (((tickAnim - 13) / 27) * (0-(-11.8125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 75.19075 + (((tickAnim - 0) / 6) * (95.99562-(75.19075)));
            yy = 21.13814 + (((tickAnim - 0) / 6) * (-57.27056-(21.13814)));
            zz = 37.39336 + (((tickAnim - 0) / 6) * (52.35829-(37.39336)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 95.99562 + (((tickAnim - 6) / 4) * (4.75902-(95.99562)));
            yy = -57.27056 + (((tickAnim - 6) / 4) * (-31.91668-(-57.27056)));
            zz = 52.35829 + (((tickAnim - 6) / 4) * (7.43818-(52.35829)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 4.75902 + (((tickAnim - 10) / 3) * (0-(4.75902)));
            yy = -31.91668 + (((tickAnim - 10) / 3) * (0-(-31.91668)));
            zz = 7.43818 + (((tickAnim - 10) / 3) * (0-(7.43818)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-31.17548-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (7.45689-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-23.78125-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -31.17548 + (((tickAnim - 25) / 15) * (75.19075-(-31.17548)));
            yy = 7.45689 + (((tickAnim - 25) / 15) * (21.13814-(7.45689)));
            zz = -23.78125 + (((tickAnim - 25) / 15) * (37.39336-(-23.78125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-9.75), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*3), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(6.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-130))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-70))));
        

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*3), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-30))*-0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+130))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-130))*1));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+150))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+70))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+220))*2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+70))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+270))*2), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+70))*2));
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(50), armright1.rotateAngleY + (float) Math.toRadians(29.75), armright1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(22.814), armright2.rotateAngleY + (float) Math.toRadians(79.25597), armright2.rotateAngleZ + (float) Math.toRadians(-36.60767));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(0.43181), armright3.rotateAngleY + (float) Math.toRadians(14.48235), armright3.rotateAngleZ + (float) Math.toRadians(-23.24705));
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(50), armleft1.rotateAngleY + (float) Math.toRadians(-29.75), armleft1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(22.814), armleft2.rotateAngleY + (float) Math.toRadians(-79.256), armleft2.rotateAngleZ + (float) Math.toRadians(36.6077+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(0.43181), armleft3.rotateAngleY + (float) Math.toRadians(-14.4824), armleft3.rotateAngleZ + (float) Math.toRadians(23.2471+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*2));
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(18.47786), legright1.rotateAngleY + (float) Math.toRadians(58.38384), legright1.rotateAngleZ + (float) Math.toRadians(-17.15641));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-13.96236), legright2.rotateAngleY + (float) Math.toRadians(-31.82275), legright2.rotateAngleZ + (float) Math.toRadians(-35.0295+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*4));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(43.36098), legright3.rotateAngleY + (float) Math.toRadians(44.23837), legright3.rotateAngleZ + (float) Math.toRadians(-60.4234+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+60))*4));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(0);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0.575);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(0);
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(18.47786), legleft1.rotateAngleY + (float) Math.toRadians(-58.3838), legleft1.rotateAngleZ + (float) Math.toRadians(17.1564));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-13.96236), legleft2.rotateAngleY + (float) Math.toRadians(31.8227), legleft2.rotateAngleZ + (float) Math.toRadians(35.0295+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*4));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(43.36098), legleft3.rotateAngleY + (float) Math.toRadians(-44.2384), legleft3.rotateAngleZ + (float) Math.toRadians(60.4234+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+60))*4));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(0);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0.575);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(0);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-30))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-60))*8), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-130))*12), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-70))));
        

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*-0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+130))*5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-130))*1));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+150))*5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+70))*2));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+220))*5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+70))*2));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+270))*5), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+70))*2));
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(50), armright1.rotateAngleY + (float) Math.toRadians(29.75), armright1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(22.814), armright2.rotateAngleY + (float) Math.toRadians(79.25597), armright2.rotateAngleZ + (float) Math.toRadians(-36.60767));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(0.43181), armright3.rotateAngleY + (float) Math.toRadians(14.48235), armright3.rotateAngleZ + (float) Math.toRadians(-23.24705));
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(50), armleft1.rotateAngleY + (float) Math.toRadians(-29.75), armleft1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(22.814), armleft2.rotateAngleY + (float) Math.toRadians(-79.256), armleft2.rotateAngleZ + (float) Math.toRadians(36.6077+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*3));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(0.43181), armleft3.rotateAngleY + (float) Math.toRadians(-14.4824), armleft3.rotateAngleZ + (float) Math.toRadians(23.2471+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2));
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(18.47786), legright1.rotateAngleY + (float) Math.toRadians(58.38384), legright1.rotateAngleZ + (float) Math.toRadians(-17.15641));
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(-13.96236), legright2.rotateAngleY + (float) Math.toRadians(-31.82275), legright2.rotateAngleZ + (float) Math.toRadians(-35.0295+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*4));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(43.36098), legright3.rotateAngleY + (float) Math.toRadians(44.23837), legright3.rotateAngleZ + (float) Math.toRadians(-60.4234+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+60))*4));
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(0);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(0.575);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(0);
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(18.47786), legleft1.rotateAngleY + (float) Math.toRadians(-58.3838), legleft1.rotateAngleZ + (float) Math.toRadians(17.1564));
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(-13.96236), legleft2.rotateAngleY + (float) Math.toRadians(31.8227), legleft2.rotateAngleZ + (float) Math.toRadians(35.0295+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*4));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(43.36098), legleft3.rotateAngleY + (float) Math.toRadians(-44.2384), legleft3.rotateAngleZ + (float) Math.toRadians(60.4234+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+60))*4));
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(0);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(0.575);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(0);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-50))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-6.25), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*12), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-170))*15), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))));
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.00363-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.98904-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.20914-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 6.00363 + (((tickAnim - 3) / 7) * (-14.49637-(6.00363)));
            yy = -1.98904 + (((tickAnim - 3) / 7) * (-1.98904-(-1.98904)));
            zz = -0.20914 + (((tickAnim - 3) / 7) * (-0.20914-(-0.20914)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -14.49637 + (((tickAnim - 10) / 2) * (-4.66425-(-14.49637)));
            yy = -1.98904 + (((tickAnim - 10) / 2) * (-1.32603-(-1.98904)));
            zz = -0.20914 + (((tickAnim - 10) / 2) * (-0.13943-(-0.20914)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -4.66425 + (((tickAnim - 12) / 3) * (0-(-4.66425)));
            yy = -1.32603 + (((tickAnim - 12) / 3) * (0-(-1.32603)));
            zz = -0.13943 + (((tickAnim - 12) / 3) * (0-(-0.13943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13 + (((tickAnim - 3) / 3) * (-12.19444-(-13)));
            yy = 1.75 + (((tickAnim - 3) / 3) * (1.75-(1.75)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -12.19444 + (((tickAnim - 6) / 4) * (10-(-12.19444)));
            yy = 1.75 + (((tickAnim - 6) / 4) * (1.75-(1.75)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 10) / 2) * (-2.08333-(10)));
            yy = 1.75 + (((tickAnim - 10) / 2) * (1.16667-(1.75)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -2.08333 + (((tickAnim - 12) / 3) * (0-(-2.08333)));
            yy = 1.16667 + (((tickAnim - 12) / 3) * (0-(1.16667)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (28.5-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 28.5 + (((tickAnim - 10) / 2) * (0-(28.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSclerocephalus entity = (EntityPrehistoricFloraSclerocephalus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -2.75 + (((tickAnim - 25) / 16) * (-3.5-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -3.5 + (((tickAnim - 41) / 19) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -3.5 + (((tickAnim - 60) / 15) * (-3.5003-(-3.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (0.7486-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (-0.04579-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -3.5003 + (((tickAnim - 75) / 15) * (-3.5003-(-3.5003)));
            yy = 0.7486 + (((tickAnim - 75) / 15) * (0.7486-(0.7486)));
            zz = -0.04579 + (((tickAnim - 75) / 15) * (-0.04579-(-0.04579)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -3.5003 + (((tickAnim - 90) / 10) * (0-(-3.5003)));
            yy = 0.7486 + (((tickAnim - 90) / 10) * (0-(0.7486)));
            zz = -0.04579 + (((tickAnim - 90) / 10) * (0-(-0.04579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -1.5 + (((tickAnim - 25) / 16) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -1.5 + (((tickAnim - 41) / 19) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -1.5 + (((tickAnim - 60) / 15) * (-1.50322-(-1.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (3.74871-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (-0.0983-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -1.50322 + (((tickAnim - 75) / 15) * (-1.50322-(-1.50322)));
            yy = 3.74871 + (((tickAnim - 75) / 15) * (3.74871-(3.74871)));
            zz = -0.0983 + (((tickAnim - 75) / 15) * (-0.0983-(-0.0983)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -1.50322 + (((tickAnim - 90) / 10) * (0-(-1.50322)));
            yy = 3.74871 + (((tickAnim - 90) / 10) * (0-(3.74871)));
            zz = -0.0983 + (((tickAnim - 90) / 10) * (0-(-0.0983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -8.5 + (((tickAnim - 25) / 16) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -8.5 + (((tickAnim - 41) / 19) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -8.5 + (((tickAnim - 60) / 15) * (-10.75161-(-8.5)));
            yy = 0 + (((tickAnim - 60) / 15) * (8.02999-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (3.12932-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -10.75161 + (((tickAnim - 75) / 15) * (-10.79485-(-10.75161)));
            yy = 8.02999 + (((tickAnim - 75) / 15) * (9.50356-(8.02999)));
            zz = 3.12932 + (((tickAnim - 75) / 15) * (2.84563-(3.12932)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -10.79485 + (((tickAnim - 90) / 10) * (0-(-10.79485)));
            yy = 9.50356 + (((tickAnim - 90) / 10) * (0-(9.50356)));
            zz = 2.84563 + (((tickAnim - 90) / 10) * (0-(2.84563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = -2 + (((tickAnim - 25) / 16) * (-2-(-2)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = -2 + (((tickAnim - 41) / 19) * (-2-(-2)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -2 + (((tickAnim - 60) / 15) * (-2.01964-(-2)));
            yy = 0 + (((tickAnim - 60) / 15) * (7.99509-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (-0.28102-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -2.01964 + (((tickAnim - 75) / 15) * (-2.01964-(-2.01964)));
            yy = 7.99509 + (((tickAnim - 75) / 15) * (7.99509-(7.99509)));
            zz = -0.28102 + (((tickAnim - 75) / 15) * (-0.28102-(-0.28102)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -2.01964 + (((tickAnim - 90) / 10) * (0-(-2.01964)));
            yy = 7.99509 + (((tickAnim - 90) / 10) * (0-(7.99509)));
            zz = -0.28102 + (((tickAnim - 90) / 10) * (0-(-0.28102)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.13 + (((tickAnim - 0) / 90) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.13-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.13)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.13 + (((tickAnim - 90) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.13)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.bone.rotationPointX = this.bone.rotationPointX + (float)(xx);
        this.bone.rotationPointY = this.bone.rotationPointY - (float)(yy);
        this.bone.rotationPointZ = this.bone.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 1 + (((tickAnim - 0) / 90) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.2 + (((tickAnim - 0) / 90) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.2-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.2)));
            zz = 1 + (((tickAnim - 0) / 90) * (1-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 1 + (((tickAnim - 90) / 10) * (1-(1)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.2 + (((tickAnim - 90) / 10) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.2)));
            zz = 1 + (((tickAnim - 90) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.bone.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-14.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = -14.5 + (((tickAnim - 25) / 16) * (-20-(-14.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = -20 + (((tickAnim - 41) / 19) * (-20-(-20)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = -20 + (((tickAnim - 60) / 15) * (-20-(-20)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = -20 + (((tickAnim - 75) / 15) * (-20-(-20)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -20 + (((tickAnim - 90) / 10) * (0-(-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1, armright1.rotateAngleX + (float) Math.toRadians(xx), armright1.rotateAngleY + (float) Math.toRadians(yy), armright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 15.25 + (((tickAnim - 25) / 16) * (20.25-(15.25)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 20.25 + (((tickAnim - 41) / 19) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 20.25 + (((tickAnim - 60) / 15) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 20.25 + (((tickAnim - 75) / 15) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 20.25 + (((tickAnim - 90) / 10) * (0-(20.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (11.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 5.5 + (((tickAnim - 25) / 16) * (3.27179-(5.5)));
            yy = 0 + (((tickAnim - 25) / 16) * (-0.36353-(0)));
            zz = 11.5 + (((tickAnim - 25) / 16) * (16.73379-(11.5)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 3.27179 + (((tickAnim - 41) / 19) * (3.27179-(3.27179)));
            yy = -0.36353 + (((tickAnim - 41) / 19) * (-0.36353-(-0.36353)));
            zz = 16.73379 + (((tickAnim - 41) / 19) * (16.73379-(16.73379)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 3.27179 + (((tickAnim - 60) / 8) * (15.17194-(3.27179)));
            yy = -0.36353 + (((tickAnim - 60) / 8) * (4.21104-(-0.36353)));
            zz = 16.73379 + (((tickAnim - 60) / 8) * (-13.03815-(16.73379)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 15.17194 + (((tickAnim - 68) / 7) * (3.27179-(15.17194)));
            yy = 4.21104 + (((tickAnim - 68) / 7) * (-0.36353-(4.21104)));
            zz = -13.03815 + (((tickAnim - 68) / 7) * (16.73379-(-13.03815)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 3.27179 + (((tickAnim - 75) / 15) * (3.27179-(3.27179)));
            yy = -0.36353 + (((tickAnim - 75) / 15) * (-0.36353-(-0.36353)));
            zz = 16.73379 + (((tickAnim - 75) / 15) * (16.73379-(16.73379)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 3.27179 + (((tickAnim - 90) / 10) * (0-(3.27179)));
            yy = -0.36353 + (((tickAnim - 90) / 10) * (0-(-0.36353)));
            zz = 16.73379 + (((tickAnim - 90) / 10) * (0-(16.73379)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1, armleft1.rotateAngleX + (float) Math.toRadians(xx), armleft1.rotateAngleY + (float) Math.toRadians(yy), armleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 12.25 + (((tickAnim - 25) / 16) * (17.25-(12.25)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 17.25 + (((tickAnim - 41) / 19) * (17.25-(17.25)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 17.25 + (((tickAnim - 60) / 8) * (-51.09708-(17.25)));
            yy = 0 + (((tickAnim - 60) / 8) * (-15.41936-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (-69.80658-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -51.09708 + (((tickAnim - 68) / 7) * (2.41165-(-51.09708)));
            yy = -15.41936 + (((tickAnim - 68) / 7) * (-15.40253-(-15.41936)));
            zz = -69.80658 + (((tickAnim - 68) / 7) * (-14.93955-(-69.80658)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 2.41165 + (((tickAnim - 75) / 15) * (2.41165-(2.41165)));
            yy = -15.40253 + (((tickAnim - 75) / 15) * (-15.40253-(-15.40253)));
            zz = -14.93955 + (((tickAnim - 75) / 15) * (-14.93955-(-14.93955)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 2.41165 + (((tickAnim - 90) / 10) * (0-(2.41165)));
            yy = -15.40253 + (((tickAnim - 90) / 10) * (0-(-15.40253)));
            zz = -14.93955 + (((tickAnim - 90) / 10) * (0-(-14.93955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 16) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (-0.17224-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (-10.13498-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (40.4318-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = -0.17224 + (((tickAnim - 68) / 7) * (0-(-0.17224)));
            yy = -10.13498 + (((tickAnim - 68) / 7) * (0-(-10.13498)));
            zz = 40.4318 + (((tickAnim - 68) / 7) * (0-(40.4318)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


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
