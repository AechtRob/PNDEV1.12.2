package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTrilophosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTrilophosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended armLw;
    private final AdvancedModelRendererExtended armL;
    private final AdvancedModelRendererExtended armL2;
    private final AdvancedModelRendererExtended armL3;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended cube_r21;
    private final AdvancedModelRendererExtended cube_r22;
    private final AdvancedModelRendererExtended cube_r23;
    private final AdvancedModelRendererExtended cube_r24;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r25;
    private final AdvancedModelRendererExtended cube_r26;
    private final AdvancedModelRendererExtended neckflap;
    private final AdvancedModelRendererExtended armRw;
    private final AdvancedModelRendererExtended armR;
    private final AdvancedModelRendererExtended armR2;
    private final AdvancedModelRendererExtended armR3;
    private final AdvancedModelRendererExtended cube_r27;
    private final AdvancedModelRendererExtended cube_r28;
    private final AdvancedModelRendererExtended cube_r29;
    private final AdvancedModelRendererExtended cube_r30;
    private final AdvancedModelRendererExtended cube_r31;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;

    private ModelAnimator animator;

    public ModelTrilophosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 17.5F, -2.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.1069F, 7.047F, 1.8243F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 35, -3.0F, -9.75F, 0.0F, 6, 6, 6, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-2.3931F, 1.047F, 6.8243F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.9163F, 0.0F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 44, -1.5F, -1.25F, -4.5F, 3, 3, 5, 0.01F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(0.0F, 0.5F, -4.25F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.48F, -0.3491F, 0.0F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 31, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 4.4F, 0.15F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.5672F, 0.0F, 0.0F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 6, -1.0F, 0.0F, -2.25F, 2, 1, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(1.0F, 0.5F, -1.75F);
        this.legR3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.829F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 0, -0.75F, 0.02F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.5F, 0.5F, -2.25F);
        this.legR3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -0.5F, 0.01F, -3.5F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, -2.25F);
        this.legR3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 5, -0.5F, 0.0F, -3.75F, 1, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-1.0F, 0.5F, -1.75F);
        this.legR3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, 0.02F, -3.0F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.5F, -2.25F);
        this.legR3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.1309F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -0.5F, 0.01F, -4.75F, 1, 1, 5, 0.0F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(2.6069F, 1.047F, 6.8243F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.9163F, 0.0F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 44, -1.5F, -1.25F, -4.5F, 3, 3, 5, 0.01F, true));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(0.0F, 0.5F, -4.25F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.48F, 0.3491F, 0.0F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 31, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 4.4F, 0.15F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.5672F, 0.0F, 0.0F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 6, -1.0F, 0.0F, -2.25F, 2, 1, 3, 0.01F, true));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(-1.0F, 0.5F, -1.75F);
        this.legL3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.829F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 0, -0.25F, 0.02F, -2.5F, 1, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.5F, -2.25F);
        this.legL3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 0, -0.5F, 0.01F, -3.5F, 1, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, -2.25F);
        this.legL3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 5, -0.5F, 0.0F, -3.75F, 1, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(1.0F, 0.5F, -1.75F);
        this.legL3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, 0.02F, -3.0F, 1, 1, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.5F, 0.5F, -2.25F);
        this.legL3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0611F, -0.1309F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -0.5F, 0.01F, -4.75F, 1, 1, 5, 0.0F, true));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.1069F, 0.047F, 4.8243F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.5F, -3.0F, -10.0F, 7, 7, 10, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -2.4151F, -9.889F);
        this.body1.addChild(chest);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, 0.4151F, -0.111F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 0, -3.0F, -0.5F, -4.5F, 6, 6, 5, 0.0F, false));

        this.armLw = new AdvancedModelRendererExtended(this);
        this.armLw.setRotationPoint(2.5F, 4.6651F, -3.111F);
        this.chest.addChild(armLw);


        this.armL = new AdvancedModelRendererExtended(this);
        this.armL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armLw.addChild(armL);
        this.setRotateAngle(armL, 0.2182F, 0.9163F, 0.0F);
        this.armL.cubeList.add(new ModelBox(armL, 16, 44, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.01F, true));

        this.armL2 = new AdvancedModelRendererExtended(this);
        this.armL2.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.2182F, 0.2182F, 0.0F);
        this.armL2.cubeList.add(new ModelBox(armL2, 44, 33, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, true));

        this.armL3 = new AdvancedModelRendererExtended(this);
        this.armL3.setRotationPoint(0.5F, 4.5F, 0.75F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, -0.1745F, -1.2217F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 23, 18, -1.25F, 0.0F, -1.0F, 2, 1, 2, 0.01F, true));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.armL3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, -0.48F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 35, -0.5F, 0.02F, -2.5F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.armL3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, -0.1745F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 18, -0.5F, 0.01F, -4.75F, 1, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(-0.5F, 0.5F, -1.0F);
        this.armL3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0785F, 0.0873F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 24, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(-1.25F, 0.5F, -1.0F);
        this.armL3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0611F, 0.3927F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 35, -0.25F, 0.01F, -2.5F, 1, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(-1.25F, 0.5F, 0.0F);
        this.armL3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0349F, 0.7418F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 11, -0.5F, 0.02F, -2.5F, 1, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 1.9151F, -1.111F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.4363F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 36, 18, -2.0F, -1.85F, -5.0F, 4, 4, 5, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, 0.0F, -2.35F, -5.0F, 0, 1, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -4.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 23, -1.5F, -1.85F, -2.0F, 3, 4, 2, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 2, 0.0F, -2.35F, -2.0F, 0, 1, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 36, 27, -1.5F, -1.85F, -3.0F, 3, 3, 1, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 24, 39, -1.5F, 0.85F, -2.9F, 3, 1, 1, -0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.925F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 16, 39, -1.5F, 0.25F, -0.75F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 46, 11, -0.5F, 0.26F, -3.675F, 1, 1, 3, -0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 0, -0.5F, -0.1F, -3.675F, 1, 1, 1, -0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 30, 47, -1.5F, -1.75F, -0.5F, 3, 3, 1, 0.01F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 0, -0.5F, -1.175F, 0.4F, 1, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0472F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -0.5F, -0.5F, 0.125F, 1, 2, 1, 0.01F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(1.25F, 1.0F, -0.75F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2618F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 44, 27, -1.0F, -0.75F, -2.975F, 1, 1, 3, -0.01F, true));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(1.5F, -0.5F, -1.0F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3054F, 0.2531F, 0.2182F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 47, -1.125F, -0.925F, -1.975F, 1, 2, 2, -0.01F, true));

        this.cube_r22 = new AdvancedModelRendererExtended(this);
        this.cube_r22.setRotationPoint(-1.5F, -0.5F, -1.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3054F, -0.2531F, -0.2182F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 47, 0.125F, -0.925F, -1.975F, 1, 2, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRendererExtended(this);
        this.cube_r23.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3927F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 38, -1.5F, -0.75F, 2.3F, 3, 2, 1, -0.01F, false));

        this.cube_r24 = new AdvancedModelRendererExtended(this);
        this.cube_r24.setRotationPoint(-1.25F, 1.0F, -0.75F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2618F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 44, 27, 0.0F, -0.75F, -2.975F, 1, 1, 3, -0.01F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.25F, 0.5F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 31, 18, -1.5F, -1.0F, -1.0F, 3, 2, 1, 0.005F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 11, 44, -0.5F, -0.025F, -4.0F, 1, 1, 3, 0.005F, false));

        this.cube_r25 = new AdvancedModelRendererExtended(this);
        this.cube_r25.setRotationPoint(0.5F, 0.75F, -4.0F);
        this.lowerjaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.2182F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 41, 12, -1.025F, -0.775F, 0.1F, 1, 1, 3, -0.005F, true));

        this.cube_r26 = new AdvancedModelRendererExtended(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.75F, -4.0F);
        this.lowerjaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.2182F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 41, 12, 0.025F, -0.775F, 0.1F, 1, 1, 3, -0.005F, false));

        this.neckflap = new AdvancedModelRendererExtended(this);
        this.neckflap.setRotationPoint(0.0F, 2.05F, -4.4F);
        this.neck.addChild(neckflap);
        this.setRotateAngle(neckflap, 0.2225F, 0.0F, 0.0F);
        this.neckflap.cubeList.add(new ModelBox(neckflap, 22, 21, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.armRw = new AdvancedModelRendererExtended(this);
        this.armRw.setRotationPoint(-2.5F, 4.6651F, -3.111F);
        this.chest.addChild(armRw);


        this.armR = new AdvancedModelRendererExtended(this);
        this.armR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armRw.addChild(armR);
        this.setRotateAngle(armR, 0.2182F, -0.9163F, 0.0F);
        this.armR.cubeList.add(new ModelBox(armR, 16, 44, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.01F, false));

        this.armR2 = new AdvancedModelRendererExtended(this);
        this.armR2.setRotationPoint(0.0F, -0.5F, 4.5F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -0.2182F, -0.2182F, 0.0F);
        this.armR2.cubeList.add(new ModelBox(armR2, 44, 33, -1.0F, 0.0F, -0.5F, 2, 5, 2, 0.0F, false));

        this.armR3 = new AdvancedModelRendererExtended(this);
        this.armR3.setRotationPoint(-0.5F, 4.5F, 0.75F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, -0.1745F, 1.2217F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 23, 18, -0.75F, 0.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r27 = new AdvancedModelRendererExtended(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.5F, -1.0F);
        this.armR3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.48F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 35, -0.5F, 0.02F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRendererExtended(this);
        this.cube_r28.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.armR3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.1745F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 18, -0.5F, 0.01F, -4.75F, 1, 1, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRendererExtended(this);
        this.cube_r29.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.armR3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0785F, -0.0873F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 24, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r30 = new AdvancedModelRendererExtended(this);
        this.cube_r30.setRotationPoint(1.25F, 0.5F, -1.0F);
        this.armR3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0611F, -0.3927F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 24, 35, -0.75F, 0.01F, -2.5F, 1, 1, 3, 0.0F, false));

        this.cube_r31 = new AdvancedModelRendererExtended(this);
        this.cube_r31.setRotationPoint(1.25F, 0.5F, 0.0F);
        this.armR3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0349F, -0.7418F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 11, -0.5F, 0.02F, -2.5F, 1, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.1069F, 0.047F, 8.8243F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 18, 21, -2.0F, -1.0F, -1.0F, 4, 4, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 31, -1.5F, -0.5F, -1.0F, 3, 3, 10, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 17, -1.0F, -0.5F, -1.0F, 2, 2, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 22, 5, -0.5F, -0.25F, -1.0F, 1, 1, 12, 0.0F, false));
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
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.4F;
        this.body.offsetX = 0.45F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.6F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.4F, 3.8F, -0.2F);
        this.setRotateAngle(neck, -0.4F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, -0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.3F, 0.0F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        this.body.offsetY = -1.1F;

        EntityPrehistoricFloraTrilophosaurus Trilophosaurus = (EntityPrehistoricFloraTrilophosaurus) e;
        float masterSpeed = Trilophosaurus.getTravelSpeed();


        this.faceTarget(f3, f4, 2, neck);
        this.faceTarget(f3, f4, 2, neck2);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        Trilophosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (Trilophosaurus.getAnimation() == Trilophosaurus.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Trilophosaurus.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraTrilophosaurus ee = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 125;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.425-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = -0.425 + (((tickAnim - 25) / 15) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            zz = -0.425 + (((tickAnim - 40) / 70) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = -0.425 + (((tickAnim - 110) / 15) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (13.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 13.5 + (((tickAnim - 25) / 15) * (13.5-(13.5)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 13.5 + (((tickAnim - 40) / 70) * (13.5-(13.5)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = 13.5 + (((tickAnim - 110) / 15) * (0-(13.5)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = -20.25 + (((tickAnim - 25) / 15) * (-20.25-(-20.25)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = -20.25 + (((tickAnim - 40) / 70) * (-20.25-(-20.25)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = -20.25 + (((tickAnim - 110) / 15) * (0-(-20.25)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (27.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (3.6298-(0)));
            yy = 27.5 + (((tickAnim - 10) / 15) * (62.36982-(27.5)));
            zz = -9.5 + (((tickAnim - 10) / 15) * (23.48299-(-9.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.6298 + (((tickAnim - 25) / 15) * (3.6298-(3.6298)));
            yy = 62.36982 + (((tickAnim - 25) / 15) * (62.36982-(62.36982)));
            zz = 23.48299 + (((tickAnim - 25) / 15) * (23.48299-(23.48299)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 3.6298 + (((tickAnim - 40) / 70) * (3.6298-(3.6298)));
            yy = 62.36982 + (((tickAnim - 40) / 70) * (62.36982-(62.36982)));
            zz = 23.48299 + (((tickAnim - 40) / 70) * (23.48299-(23.48299)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 3.6298 + (((tickAnim - 110) / 8) * (3.2173-(3.6298)));
            yy = 62.36982 + (((tickAnim - 110) / 8) * (32.99711-(62.36982)));
            zz = 23.48299 + (((tickAnim - 110) / 8) * (-4.36327-(23.48299)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 3.2173 + (((tickAnim - 118) / 7) * (0-(3.2173)));
            yy = 32.99711 + (((tickAnim - 118) / 7) * (0-(32.99711)));
            zz = -4.36327 + (((tickAnim - 118) / 7) * (0-(-4.36327)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (35.05901-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.43535-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.96693-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 35.05901 + (((tickAnim - 10) / 8) * (27.41204-(35.05901)));
            yy = -5.43535 + (((tickAnim - 10) / 8) * (3.61259-(-5.43535)));
            zz = -9.96693 + (((tickAnim - 10) / 8) * (-51.46296-(-9.96693)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 27.41204 + (((tickAnim - 18) / 7) * (32.64753-(27.41204)));
            yy = 3.61259 + (((tickAnim - 18) / 7) * (-13.58837-(3.61259)));
            zz = -51.46296 + (((tickAnim - 18) / 7) * (-24.91731-(-51.46296)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 32.64753 + (((tickAnim - 25) / 15) * (32.64753-(32.64753)));
            yy = -13.58837 + (((tickAnim - 25) / 15) * (-13.58837-(-13.58837)));
            zz = -24.91731 + (((tickAnim - 25) / 15) * (-24.91731-(-24.91731)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 32.64753 + (((tickAnim - 40) / 70) * (32.64753-(32.64753)));
            yy = -13.58837 + (((tickAnim - 40) / 70) * (-13.58837-(-13.58837)));
            zz = -24.91731 + (((tickAnim - 40) / 70) * (-24.91731-(-24.91731)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 32.64753 + (((tickAnim - 110) / 8) * (47.57377-(32.64753)));
            yy = -13.58837 + (((tickAnim - 110) / 8) * (-6.79419-(-13.58837)));
            zz = -24.91731 + (((tickAnim - 110) / 8) * (-12.45866-(-24.91731)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 47.57377 + (((tickAnim - 118) / 7) * (0-(47.57377)));
            yy = -6.79419 + (((tickAnim - 118) / 7) * (0-(-6.79419)));
            zz = -12.45866 + (((tickAnim - 118) / 7) * (0-(-12.45866)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 74 + (((tickAnim - 10) / 8) * (67.41852-(74)));
            yy = 0 + (((tickAnim - 10) / 8) * (-0.4174-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (25.09132-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 67.41852 + (((tickAnim - 18) / 7) * (-24.31179-(67.41852)));
            yy = -0.4174 + (((tickAnim - 18) / 7) * (-0.98438-(-0.4174)));
            zz = 25.09132 + (((tickAnim - 18) / 7) * (59.17388-(25.09132)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -24.31179 + (((tickAnim - 25) / 15) * (-24.31179-(-24.31179)));
            yy = -0.98438 + (((tickAnim - 25) / 15) * (-0.98438-(-0.98438)));
            zz = 59.17388 + (((tickAnim - 25) / 15) * (59.17388-(59.17388)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = -24.31179 + (((tickAnim - 40) / 70) * (-24.31179-(-24.31179)));
            yy = -0.98438 + (((tickAnim - 40) / 70) * (-0.98438-(-0.98438)));
            zz = 59.17388 + (((tickAnim - 40) / 70) * (59.17388-(59.17388)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = -24.31179 + (((tickAnim - 110) / 3) * (-49.94292-(-24.31179)));
            yy = -0.98438 + (((tickAnim - 110) / 3) * (8.28599-(-0.98438)));
            zz = 59.17388 + (((tickAnim - 110) / 3) * (82.71168-(59.17388)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = -49.94292 + (((tickAnim - 113) / 5) * (75.84411-(-49.94292)));
            yy = 8.28599 + (((tickAnim - 113) / 5) * (-0.49219-(8.28599)));
            zz = 82.71168 + (((tickAnim - 113) / 5) * (29.58694-(82.71168)));
        }
        else if (tickAnim >= 118 && tickAnim < 122) {
            xx = 75.84411 + (((tickAnim - 118) / 4) * (0.95849-(75.84411)));
            yy = -0.49219 + (((tickAnim - 118) / 4) * (-0.21875-(-0.49219)));
            zz = 29.58694 + (((tickAnim - 118) / 4) * (13.14975-(29.58694)));
        }
        else if (tickAnim >= 122 && tickAnim < 125) {
            xx = 0.95849 + (((tickAnim - 122) / 3) * (0-(0.95849)));
            yy = -0.21875 + (((tickAnim - 122) / 3) * (0-(-0.21875)));
            zz = 13.14975 + (((tickAnim - 122) / 3) * (0-(13.14975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 0) / 110) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 110) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 110) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0.625-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            yy = 0.625 + (((tickAnim - 118) / 7) * (0-(0.625)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.24002-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (7.66766-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -2.24002 + (((tickAnim - 25) / 15) * (-2.74002-(-2.24002)));
            yy = 7.66766 + (((tickAnim - 25) / 15) * (7.66766-(7.66766)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -2.74002 + (((tickAnim - 40) / 8) * (-2.74002-(-2.74002)));
            yy = 7.66766 + (((tickAnim - 40) / 8) * (7.66766-(7.66766)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -2.74002 + (((tickAnim - 48) / 12) * (-2.30842-(-2.74002)));
            yy = 7.66766 + (((tickAnim - 48) / 12) * (13.50459-(7.66766)));
            zz = 0 + (((tickAnim - 48) / 12) * (1.49148-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -2.30842 + (((tickAnim - 60) / 15) * (-2.05842-(-2.30842)));
            yy = 13.50459 + (((tickAnim - 60) / 15) * (13.50459-(13.50459)));
            zz = 1.49148 + (((tickAnim - 60) / 15) * (1.49148-(1.49148)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = -2.05842 + (((tickAnim - 75) / 20) * (-2.05842-(-2.05842)));
            yy = 13.50459 + (((tickAnim - 75) / 20) * (13.50459-(13.50459)));
            zz = 1.49148 + (((tickAnim - 75) / 20) * (1.49148-(1.49148)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -2.05842 + (((tickAnim - 95) / 15) * (-2.05842-(-2.05842)));
            yy = 13.50459 + (((tickAnim - 95) / 15) * (13.50459-(13.50459)));
            zz = 1.49148 + (((tickAnim - 95) / 15) * (1.49148-(1.49148)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -2.05842 + (((tickAnim - 110) / 15) * (0-(-2.05842)));
            yy = 13.50459 + (((tickAnim - 110) / 15) * (0-(13.50459)));
            zz = 1.49148 + (((tickAnim - 110) / 15) * (0-(1.49148)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.91349-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (2.45993-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.32592-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -4.91349 + (((tickAnim - 25) / 15) * (-4.16349-(-4.91349)));
            yy = 2.45993 + (((tickAnim - 25) / 15) * (2.45993-(2.45993)));
            zz = 0.32592 + (((tickAnim - 25) / 15) * (0.32592-(0.32592)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -4.16349 + (((tickAnim - 40) / 8) * (-4.16349-(-4.16349)));
            yy = 2.45993 + (((tickAnim - 40) / 8) * (2.45993-(2.45993)));
            zz = 0.32592 + (((tickAnim - 40) / 8) * (0.32592-(0.32592)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -4.16349 + (((tickAnim - 48) / 12) * (4.33878-(-4.16349)));
            yy = 2.45993 + (((tickAnim - 48) / 12) * (14.0829-(2.45993)));
            zz = 0.32592 + (((tickAnim - 48) / 12) * (2.07029-(0.32592)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 4.33878 + (((tickAnim - 60) / 15) * (3.83878-(4.33878)));
            yy = 14.0829 + (((tickAnim - 60) / 15) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 60) / 15) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = 3.83878 + (((tickAnim - 75) / 4) * (3.83878-(3.83878)));
            yy = 14.0829 + (((tickAnim - 75) / 4) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 75) / 4) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = 3.83878 + (((tickAnim - 79) / 3) * (4.33878-(3.83878)));
            yy = 14.0829 + (((tickAnim - 79) / 3) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 79) / 3) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 82 && tickAnim < 84) {
            xx = 4.33878 + (((tickAnim - 82) / 2) * (3.83878-(4.33878)));
            yy = 14.0829 + (((tickAnim - 82) / 2) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 82) / 2) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = 3.83878 + (((tickAnim - 84) / 3) * (4.33878-(3.83878)));
            yy = 14.0829 + (((tickAnim - 84) / 3) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 84) / 3) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = 4.33878 + (((tickAnim - 87) / 2) * (3.83878-(4.33878)));
            yy = 14.0829 + (((tickAnim - 87) / 2) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 87) / 2) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 89 && tickAnim < 95) {
            xx = 3.83878 + (((tickAnim - 89) / 6) * (3.83878-(3.83878)));
            yy = 14.0829 + (((tickAnim - 89) / 6) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 89) / 6) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 3.83878 + (((tickAnim - 95) / 15) * (3.83878-(3.83878)));
            yy = 14.0829 + (((tickAnim - 95) / 15) * (14.0829-(14.0829)));
            zz = 2.07029 + (((tickAnim - 95) / 15) * (2.07029-(2.07029)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 3.83878 + (((tickAnim - 110) / 15) * (0-(3.83878)));
            yy = 14.0829 + (((tickAnim - 110) / 15) * (0-(14.0829)));
            zz = 2.07029 + (((tickAnim - 110) / 15) * (0-(2.07029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -2.75 + (((tickAnim - 25) / 15) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -2.75 + (((tickAnim - 40) / 8) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 48) / 12) * (-1.33454-(-2.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (9.81444-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (1.92698-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -1.33454 + (((tickAnim - 60) / 15) * (-0.58454-(-1.33454)));
            yy = 9.81444 + (((tickAnim - 60) / 15) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 60) / 15) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = -0.58454 + (((tickAnim - 75) / 4) * (-0.58454-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 75) / 4) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 75) / 4) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 79 && tickAnim < 82) {
            xx = -0.58454 + (((tickAnim - 79) / 3) * (-1.83454-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 79) / 3) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 79) / 3) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 82 && tickAnim < 84) {
            xx = -1.83454 + (((tickAnim - 82) / 2) * (-0.58454-(-1.83454)));
            yy = 9.81444 + (((tickAnim - 82) / 2) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 82) / 2) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 84 && tickAnim < 87) {
            xx = -0.58454 + (((tickAnim - 84) / 3) * (-1.83454-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 84) / 3) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 84) / 3) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -1.83454 + (((tickAnim - 87) / 2) * (-0.58454-(-1.83454)));
            yy = 9.81444 + (((tickAnim - 87) / 2) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 87) / 2) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 89 && tickAnim < 95) {
            xx = -0.58454 + (((tickAnim - 89) / 6) * (-0.58454-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 89) / 6) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 89) / 6) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = -0.58454 + (((tickAnim - 95) / 15) * (-0.58454-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 95) / 15) * (9.81444-(9.81444)));
            zz = 1.92698 + (((tickAnim - 95) / 15) * (1.92698-(1.92698)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -0.58454 + (((tickAnim - 110) / 15) * (0-(-0.58454)));
            yy = 9.81444 + (((tickAnim - 110) / 15) * (0-(9.81444)));
            zz = 1.92698 + (((tickAnim - 110) / 15) * (0-(1.92698)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (3.25-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.25 + (((tickAnim - 32) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (1.25-(0)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 75) {
            xx = 1.25 + (((tickAnim - 68) / 7) * (0-(1.25)));
            yy = 0 + (((tickAnim - 68) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 7) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 20) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 15) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armRw, armRw.rotateAngleX + (float) Math.toRadians(0), armRw.rotateAngleY + (float) Math.toRadians(0), armRw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (24.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 24.5 + (((tickAnim - 25) / 15) * (24.5-(24.5)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 24.5 + (((tickAnim - 40) / 70) * (24.5-(24.5)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            yy = 24.5 + (((tickAnim - 110) / 15) * (0-(24.5)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(0), armR2.rotateAngleY + (float) Math.toRadians(0), armR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(0), armR3.rotateAngleY + (float) Math.toRadians(0), armR3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 1.5 + (((tickAnim - 25) / 15) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = 1.5 + (((tickAnim - 40) / 70) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 1.5 + (((tickAnim - 110) / 8) * (0-(1.5)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (3-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -2.75 + (((tickAnim - 25) / 15) * (-2.75-(-2.75)));
            yy = 3 + (((tickAnim - 25) / 15) * (3-(3)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = -2.75 + (((tickAnim - 40) / 70) * (-2.75-(-2.75)));
            yy = 3 + (((tickAnim - 40) / 70) * (3-(3)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = -2.75 + (((tickAnim - 110) / 8) * (-2.63746-(-2.75)));
            yy = 3 + (((tickAnim - 110) / 8) * (10.43928-(3)));
            zz = 0 + (((tickAnim - 110) / 8) * (0.95972-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -2.63746 + (((tickAnim - 118) / 7) * (0-(-2.63746)));
            yy = 10.43928 + (((tickAnim - 118) / 7) * (0-(10.43928)));
            zz = 0.95972 + (((tickAnim - 118) / 7) * (0-(0.95972)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-4.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = -4.25 + (((tickAnim - 25) / 15) * (-4.25-(-4.25)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = -4.25 + (((tickAnim - 40) / 70) * (-4.25-(-4.25)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = -4.25 + (((tickAnim - 110) / 8) * (8.25-(-4.25)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            yy = 8.25 + (((tickAnim - 118) / 7) * (0-(8.25)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-8.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = -8.25 + (((tickAnim - 25) / 15) * (-8.25-(-8.25)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 40) / 70) * (0-(0)));
            yy = -8.25 + (((tickAnim - 40) / 70) * (-8.25-(-8.25)));
            zz = 0 + (((tickAnim - 40) / 70) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 110) / 3) * (0-(0)));
            yy = -8.25 + (((tickAnim - 110) / 3) * (-14.08-(-8.25)));
            zz = 0 + (((tickAnim - 110) / 3) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 113) / 5) * (0-(0)));
            yy = -14.08 + (((tickAnim - 113) / 5) * (7-(-14.08)));
            zz = 0 + (((tickAnim - 113) / 5) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            yy = 7 + (((tickAnim - 118) / 2) * (12.67-(7)));
            zz = 0 + (((tickAnim - 118) / 2) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            yy = 12.67 + (((tickAnim - 120) / 5) * (0-(12.67)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.25 + (((tickAnim - 8) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.69321-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.2121-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.3652-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.69321 + (((tickAnim - 8) / 10) * (0-(-12.69321)));
            yy = -1.2121 + (((tickAnim - 8) / 10) * (0-(-1.2121)));
            zz = -5.3652 + (((tickAnim - 8) / 10) * (0-(-5.3652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 8) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.00888-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (14.8868-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (3.8703-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 6.00888 + (((tickAnim - 8) / 10) * (0-(6.00888)));
            yy = 14.8868 + (((tickAnim - 8) / 10) * (0-(14.8868)));
            zz = 3.8703 + (((tickAnim - 8) / 10) * (0-(3.8703)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = -0.425 + (((tickAnim - 8) / 10) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 18.75 + (((tickAnim - 8) / 3) * (25.5-(18.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 25.5 + (((tickAnim - 11) / 7) * (0-(25.5)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7.75 + (((tickAnim - 8) / 10) * (0-(7.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 10.25 + (((tickAnim - 8) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 8) / 1) * (0-(28)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-12.69321-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.21206-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (5.36518-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.69321 + (((tickAnim - 8) / 10) * (0-(-12.69321)));
            yy = 1.21206 + (((tickAnim - 8) / 10) * (0-(1.21206)));
            zz = 5.36518 + (((tickAnim - 8) / 10) * (0-(5.36518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRw, armRw.rotateAngleX + (float) Math.toRadians(xx), armRw.rotateAngleY + (float) Math.toRadians(yy), armRw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 8) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.00888-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-14.88675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.87028-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 6.00888 + (((tickAnim - 8) / 10) * (0-(6.00888)));
            yy = -14.88675 + (((tickAnim - 8) / 10) * (0-(-14.88675)));
            zz = -3.87028 + (((tickAnim - 8) / 10) * (0-(-3.87028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = -0.425 + (((tickAnim - 8) / 10) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.75-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -2.75 + (((tickAnim - 5) / 5) * (1.5-(-2.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 1.5 + (((tickAnim - 10) / 10) * (-3.5-(1.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -3.5 + (((tickAnim - 20) / 10) * (1.5-(-3.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 1.5 + (((tickAnim - 30) / 10) * (-3.5-(1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -3.5 + (((tickAnim - 40) / 10) * (0-(-3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15.52471-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (29.84497-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-17.74622-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -15.52471 + (((tickAnim - 5) / 5) * (-3.95104-(-15.52471)));
            yy = 29.84497 + (((tickAnim - 5) / 5) * (66.51256-(29.84497)));
            zz = -17.74622 + (((tickAnim - 5) / 5) * (15.64949-(-17.74622)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.95104 + (((tickAnim - 10) / 10) * (8.72861-(-3.95104)));
            yy = 66.51256 + (((tickAnim - 10) / 10) * (-25.36508-(66.51256)));
            zz = 15.64949 + (((tickAnim - 10) / 10) * (-3.57052-(15.64949)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 8.72861 + (((tickAnim - 20) / 5) * (-2.4178-(8.72861)));
            yy = -25.36508 + (((tickAnim - 20) / 5) * (20.57049-(-25.36508)));
            zz = -3.57052 + (((tickAnim - 20) / 5) * (-7.58294-(-3.57052)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.4178 + (((tickAnim - 25) / 5) * (-3.95104-(-2.4178)));
            yy = 20.57049 + (((tickAnim - 25) / 5) * (66.51256-(20.57049)));
            zz = -7.58294 + (((tickAnim - 25) / 5) * (15.64949-(-7.58294)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.95104 + (((tickAnim - 30) / 10) * (8.72861-(-3.95104)));
            yy = 66.51256 + (((tickAnim - 30) / 10) * (-25.36508-(66.51256)));
            zz = 15.64949 + (((tickAnim - 30) / 10) * (-3.57052-(15.64949)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 8.72861 + (((tickAnim - 40) / 5) * (4.31389-(8.72861)));
            yy = -25.36508 + (((tickAnim - 40) / 5) * (9.25593-(-25.36508)));
            zz = -3.57052 + (((tickAnim - 40) / 5) * (-0.13017-(-3.57052)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 4.31389 + (((tickAnim - 45) / 5) * (0-(4.31389)));
            yy = 9.25593 + (((tickAnim - 45) / 5) * (0-(9.25593)));
            zz = -0.13017 + (((tickAnim - 45) / 5) * (0-(-0.13017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (24.55508-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.85065-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-20.02997-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 24.55508 + (((tickAnim - 5) / 5) * (29.61015-(24.55508)));
            yy = -19.85065 + (((tickAnim - 5) / 5) * (-39.7013-(-19.85065)));
            zz = -20.02997 + (((tickAnim - 5) / 5) * (-40.05994-(-20.02997)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.61015 + (((tickAnim - 10) / 10) * (31.56693-(29.61015)));
            yy = -39.7013 + (((tickAnim - 10) / 10) * (6.47947-(-39.7013)));
            zz = -40.05994 + (((tickAnim - 10) / 10) * (34.63568-(-40.05994)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 31.56693 + (((tickAnim - 20) / 5) * (52.08854-(31.56693)));
            yy = 6.47947 + (((tickAnim - 20) / 5) * (-16.61091-(6.47947)));
            zz = 34.63568 + (((tickAnim - 20) / 5) * (-2.71213-(34.63568)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 52.08854 + (((tickAnim - 25) / 5) * (29.61015-(52.08854)));
            yy = -16.61091 + (((tickAnim - 25) / 5) * (-39.7013-(-16.61091)));
            zz = -2.71213 + (((tickAnim - 25) / 5) * (-40.05994-(-2.71213)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 29.61015 + (((tickAnim - 30) / 10) * (31.56693-(29.61015)));
            yy = -39.7013 + (((tickAnim - 30) / 10) * (6.47947-(-39.7013)));
            zz = -40.05994 + (((tickAnim - 30) / 10) * (34.63568-(-40.05994)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 31.56693 + (((tickAnim - 40) / 5) * (49.03347-(31.56693)));
            yy = 6.47947 + (((tickAnim - 40) / 5) * (3.23974-(6.47947)));
            zz = 34.63568 + (((tickAnim - 40) / 5) * (17.31784-(34.63568)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 49.03347 + (((tickAnim - 45) / 5) * (0-(49.03347)));
            yy = 3.23974 + (((tickAnim - 45) / 5) * (0-(3.23974)));
            zz = 17.31784 + (((tickAnim - 45) / 5) * (0-(17.31784)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (67.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 67.25 + (((tickAnim - 5) / 5) * (50.5-(67.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 50.5 + (((tickAnim - 10) / 5) * (-69.52207-(50.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (5.49243-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (78.62631-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -69.52207 + (((tickAnim - 15) / 5) * (101.25-(-69.52207)));
            yy = 5.49243 + (((tickAnim - 15) / 5) * (0-(5.49243)));
            zz = 78.62631 + (((tickAnim - 15) / 5) * (0-(78.62631)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 101.25 + (((tickAnim - 20) / 5) * (110.38-(101.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 110.38 + (((tickAnim - 25) / 3) * (-62.1555-(110.38)));
            yy = 0 + (((tickAnim - 25) / 3) * (16.93833-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (84.26348-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -62.1555 + (((tickAnim - 28) / 2) * (50.5-(-62.1555)));
            yy = 16.93833 + (((tickAnim - 28) / 2) * (0-(16.93833)));
            zz = 84.26348 + (((tickAnim - 28) / 2) * (0-(84.26348)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 50.5 + (((tickAnim - 30) / 5) * (-69.52207-(50.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (5.49243-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (78.62631-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -69.52207 + (((tickAnim - 35) / 5) * (101.25-(-69.52207)));
            yy = 5.49243 + (((tickAnim - 35) / 5) * (0-(5.49243)));
            zz = 78.62631 + (((tickAnim - 35) / 5) * (0-(78.62631)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 101.25 + (((tickAnim - 40) / 5) * (102.38-(101.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 102.38 + (((tickAnim - 45) / 5) * (0-(102.38)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4 + (((tickAnim - 15) / 20) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 35) / 15) * (0-(-4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -1.125 + (((tickAnim - 15) / 20) * (-1.125-(-1.125)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -1.125 + (((tickAnim - 35) / 15) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.25 + (((tickAnim - 15) / 20) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25.25 + (((tickAnim - 35) / 15) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.02631-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.27976-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-10.7464-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.02631 + (((tickAnim - 15) / 20) * (31.02631-(31.02631)));
            yy = 0.27976 + (((tickAnim - 15) / 20) * (0.27976-(0.27976)));
            zz = -10.7464 + (((tickAnim - 15) / 20) * (-10.7464-(-10.7464)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.02631 + (((tickAnim - 35) / 15) * (0-(31.02631)));
            yy = 0.27976 + (((tickAnim - 35) / 15) * (0-(0.27976)));
            zz = -10.7464 + (((tickAnim - 35) / 15) * (0-(-10.7464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.25 + (((tickAnim - 15) / 20) * (-25.25-(-25.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25.25 + (((tickAnim - 35) / 15) * (0-(-25.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.02631-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.27976-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (10.7464-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.02631 + (((tickAnim - 15) / 20) * (31.02631-(31.02631)));
            yy = 0.27976 + (((tickAnim - 15) / 20) * (0.27976-(0.27976)));
            zz = 10.7464 + (((tickAnim - 15) / 20) * (10.7464-(10.7464)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.02631 + (((tickAnim - 35) / 15) * (0-(31.02631)));
            yy = 0.27976 + (((tickAnim - 35) / 15) * (0-(0.27976)));
            zz = 10.7464 + (((tickAnim - 35) / 15) * (0-(10.7464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 15) / 20) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 35) / 15) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 15) / 20) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 35) / 15) * (0-(4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.25 + (((tickAnim - 15) / 20) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 35) / 15) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -2.87437 + (((tickAnim - 0) / 14) * (132.91083-(-2.87437)));
            yy = -14.74606 + (((tickAnim - 0) / 14) * (20.2471-(-14.74606)));
            zz = 0.19849 + (((tickAnim - 0) / 14) * (145.915-(0.19849)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 132.91083 + (((tickAnim - 14) / 6) * (62.28068-(132.91083)));
            yy = 20.2471 + (((tickAnim - 14) / 6) * (7.9624-(20.2471)));
            zz = 145.915 + (((tickAnim - 14) / 6) * (82.21519-(145.915)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 62.28068 + (((tickAnim - 20) / 8) * (-2.87437-(62.28068)));
            yy = 7.9624 + (((tickAnim - 20) / 8) * (-14.74606-(7.9624)));
            zz = 82.21519 + (((tickAnim - 20) / 8) * (0.19849-(82.21519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -46.95311 + (((tickAnim - 0) / 14) * (-9.14051-(-46.95311)));
            yy = 16.11208 + (((tickAnim - 0) / 14) * (-7.73844-(16.11208)));
            zz = 2.16757 + (((tickAnim - 0) / 14) * (52.0845-(2.16757)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -9.14051 + (((tickAnim - 14) / 6) * (-66.47621-(-9.14051)));
            yy = -7.73844 + (((tickAnim - 14) / 6) * (6.17154-(-7.73844)));
            zz = 52.0845 + (((tickAnim - 14) / 6) * (21.72288-(52.0845)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -66.47621 + (((tickAnim - 20) / 4) * (-81.38632-(-66.47621)));
            yy = 6.17154 + (((tickAnim - 20) / 4) * (13.59557-(6.17154)));
            zz = 21.72288 + (((tickAnim - 20) / 4) * (7.11812-(21.72288)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -81.38632 + (((tickAnim - 24) / 4) * (-46.95311-(-81.38632)));
            yy = 13.59557 + (((tickAnim - 24) / 4) * (16.11208-(13.59557)));
            zz = 7.11812 + (((tickAnim - 24) / 4) * (2.16757-(7.11812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 49.92358 + (((tickAnim - 0) / 3) * (39.34521-(49.92358)));
            yy = -8.10201 + (((tickAnim - 0) / 3) * (-6.6129-(-8.10201)));
            zz = -5.0219 + (((tickAnim - 0) / 3) * (-27.76956-(-5.0219)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 39.34521 + (((tickAnim - 3) / 3) * (48.55526-(39.34521)));
            yy = -6.6129 + (((tickAnim - 3) / 3) * (-7.75578-(-6.6129)));
            zz = -27.76956 + (((tickAnim - 3) / 3) * (-38.23052-(-27.76956)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 48.55526 + (((tickAnim - 6) / 8) * (79.87388-(48.55526)));
            yy = -7.75578 + (((tickAnim - 6) / 8) * (-6.29377-(-7.75578)));
            zz = -38.23052 + (((tickAnim - 6) / 8) * (-6.79241-(-38.23052)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 79.87388 + (((tickAnim - 14) / 6) * (149.07003-(79.87388)));
            yy = -6.29377 + (((tickAnim - 14) / 6) * (-7.90348-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 14) / 6) * (-4.1198-(-6.79241)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 149.07003 + (((tickAnim - 20) / 4) * (67.14952-(149.07003)));
            yy = -7.90348 + (((tickAnim - 20) / 4) * (15.33567-(-7.90348)));
            zz = -4.1198 + (((tickAnim - 20) / 4) * (-20.94026-(-4.1198)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 67.14952 + (((tickAnim - 24) / 4) * (49.92358-(67.14952)));
            yy = 15.33567 + (((tickAnim - 24) / 4) * (-8.10201-(15.33567)));
            zz = -20.94026 + (((tickAnim - 24) / 4) * (-5.0219-(-20.94026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.03-(0)));
            yy = 0.85 + (((tickAnim - 0) / 2) * (0.9-(0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.03 + (((tickAnim - 2) / 1) * (-0.07-(-0.03)));
            yy = 0.9 + (((tickAnim - 2) / 1) * (1.34-(0.9)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.07 + (((tickAnim - 3) / 3) * (-0.275-(-0.07)));
            yy = 1.34 + (((tickAnim - 3) / 3) * (0.5-(1.34)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.275 + (((tickAnim - 6) / 8) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 6) / 8) * (0-(0.5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.18-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.18 + (((tickAnim - 20) / 8) * (0.85-(0.18)));
            zz = -0.675 + (((tickAnim - 20) / 8) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 132.91083 + (((tickAnim - 0) / 6) * (-3.43808-(132.91083)));
            yy = -20.2471 + (((tickAnim - 0) / 6) * (-3.02555-(-20.2471)));
            zz = -145.91502 + (((tickAnim - 0) / 6) * (-25.05894-(-145.91502)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -3.43808 + (((tickAnim - 6) / 7) * (-5-(-3.43808)));
            yy = -3.02555 + (((tickAnim - 6) / 7) * (11.75-(-3.02555)));
            zz = -25.05894 + (((tickAnim - 6) / 7) * (0-(-25.05894)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 13) / 15) * (132.91083-(-5)));
            yy = 11.75 + (((tickAnim - 13) / 15) * (-20.2471-(11.75)));
            zz = 0 + (((tickAnim - 13) / 15) * (-145.91502-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5.30742 + (((tickAnim - 0) / 6) * (-49.33377-(-5.30742)));
            yy = 4.87353 + (((tickAnim - 0) / 6) * (-4.32032-(4.87353)));
            zz = -43.45103 + (((tickAnim - 0) / 6) * (-43.07114-(-43.45103)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -49.33377 + (((tickAnim - 6) / 7) * (-19.75-(-49.33377)));
            yy = -4.32032 + (((tickAnim - 6) / 7) * (0-(-4.32032)));
            zz = -43.07114 + (((tickAnim - 6) / 7) * (0-(-43.07114)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -19.75 + (((tickAnim - 13) / 15) * (-5.30742-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (4.87353-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (-43.45103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 79.87388 + (((tickAnim - 0) / 6) * (126.27272-(79.87388)));
            yy = -6.29377 + (((tickAnim - 0) / 6) * (-7.823-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 0) / 6) * (-4.25343-(-6.79241)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 126.27272 + (((tickAnim - 6) / 5) * (19.30323-(126.27272)));
            yy = -7.823 + (((tickAnim - 6) / 5) * (-6.4833-(-7.823)));
            zz = -4.25343 + (((tickAnim - 6) / 5) * (33.28058-(-4.25343)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 19.30323 + (((tickAnim - 11) / 2) * (24.99682-(19.30323)));
            yy = -6.4833 + (((tickAnim - 11) / 2) * (-8.82183-(-6.4833)));
            zz = 33.28058 + (((tickAnim - 11) / 2) * (2.55597-(33.28058)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 24.99682 + (((tickAnim - 13) / 1) * (15.74475-(24.99682)));
            yy = -8.82183 + (((tickAnim - 13) / 1) * (-3.9628-(-8.82183)));
            zz = 2.55597 + (((tickAnim - 13) / 1) * (19.35781-(2.55597)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.74475 + (((tickAnim - 14) / 4) * (14.92638-(15.74475)));
            yy = -3.9628 + (((tickAnim - 14) / 4) * (-2.23582-(-3.9628)));
            zz = 19.35781 + (((tickAnim - 14) / 4) * (31.51167-(19.35781)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 14.92638 + (((tickAnim - 18) / 10) * (79.87388-(14.92638)));
            yy = -2.23582 + (((tickAnim - 18) / 10) * (-6.29377-(-2.23582)));
            zz = 31.51167 + (((tickAnim - 18) / 10) * (-6.79241-(31.51167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 7) * (0.95-(0.35)));
            zz = -0.6 + (((tickAnim - 6) / 7) * (0-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0.95 + (((tickAnim - 13) / 15) * (0-(0.95)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 36.75654 + (((tickAnim - 0) / 6) * (61.68326-(36.75654)));
            yy = 33.0052 + (((tickAnim - 0) / 6) * (3.98076-(33.0052)));
            zz = 6.36607 + (((tickAnim - 0) / 6) * (70.27642-(6.36607)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 61.68326 + (((tickAnim - 6) / 6) * (26.02728-(61.68326)));
            yy = 3.98076 + (((tickAnim - 6) / 6) * (18.1119-(3.98076)));
            zz = 70.27642 + (((tickAnim - 6) / 6) * (55.1306-(70.27642)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 26.02728 + (((tickAnim - 12) / 16) * (36.75654-(26.02728)));
            yy = 18.1119 + (((tickAnim - 12) / 16) * (33.0052-(18.1119)));
            zz = 55.1306 + (((tickAnim - 12) / 16) * (6.36607-(55.1306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.875-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 28) {
            xx = 0.475 + (((tickAnim - 6) / 22) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 6) / 22) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 6) / 22) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 97.25 + (((tickAnim - 0) / 6) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.55895-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 126.36712 + (((tickAnim - 6) / 4) * (-19.47787-(126.36712)));
            yy = 4.69673 + (((tickAnim - 6) / 4) * (4.43324-(4.69673)));
            zz = -0.55895 + (((tickAnim - 6) / 4) * (-81.49916-(-0.55895)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -19.47787 + (((tickAnim - 10) / 2) * (37.84231-(-19.47787)));
            yy = 4.43324 + (((tickAnim - 10) / 2) * (1.39308-(4.43324)));
            zz = -81.49916 + (((tickAnim - 10) / 2) * (-30.42816-(-81.49916)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 37.84231 + (((tickAnim - 12) / 4) * (-22.90992-(37.84231)));
            yy = 1.39308 + (((tickAnim - 12) / 4) * (3.16256-(1.39308)));
            zz = -30.42816 + (((tickAnim - 12) / 4) * (-62.69579-(-30.42816)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22.90992 + (((tickAnim - 16) / 2) * (-15.49921-(-22.90992)));
            yy = 3.16256 + (((tickAnim - 16) / 2) * (0.17963-(3.16256)));
            zz = -62.69579 + (((tickAnim - 16) / 2) * (-48.6455-(-62.69579)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -15.49921 + (((tickAnim - 18) / 3) * (4.11753-(-15.49921)));
            yy = 0.17963 + (((tickAnim - 18) / 3) * (-8.37526-(0.17963)));
            zz = -48.6455 + (((tickAnim - 18) / 3) * (-28.00057-(-48.6455)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 4.11753 + (((tickAnim - 21) / 7) * (97.25-(4.11753)));
            yy = -8.37526 + (((tickAnim - 21) / 7) * (0-(-8.37526)));
            zz = -28.00057 + (((tickAnim - 21) / 7) * (0-(-28.00057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.05 + (((tickAnim - 6) / 6) * (-0.1-(-0.05)));
            yy = -0.48 + (((tickAnim - 6) / 6) * (0.15-(-0.48)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.1 + (((tickAnim - 12) / 2) * (-0.09-(-0.1)));
            yy = 0.15 + (((tickAnim - 12) / 2) * (1.375-(0.15)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.02-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.09 + (((tickAnim - 14) / 2) * (-0.08-(-0.09)));
            yy = 1.375 + (((tickAnim - 14) / 2) * (0.98-(1.375)));
            zz = -0.02 + (((tickAnim - 14) / 2) * (-0.03-(-0.02)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -0.08 + (((tickAnim - 16) / 5) * (-0.06-(-0.08)));
            yy = 0.98 + (((tickAnim - 16) / 5) * (0.655-(0.98)));
            zz = -0.03 + (((tickAnim - 16) / 5) * (-0.075-(-0.03)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.06 + (((tickAnim - 21) / 7) * (0-(-0.06)));
            yy = 0.655 + (((tickAnim - 21) / 7) * (0-(0.655)));
            zz = -0.075 + (((tickAnim - 21) / 7) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 26.02728 + (((tickAnim - 0) / 14) * (27.29124-(26.02728)));
            yy = -18.11191 + (((tickAnim - 0) / 14) * (-18.65446-(-18.11191)));
            zz = -55.1306 + (((tickAnim - 0) / 14) * (-4.11992-(-55.1306)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 27.29124 + (((tickAnim - 14) / 7) * (61.68326-(27.29124)));
            yy = -18.65446 + (((tickAnim - 14) / 7) * (-3.9808-(-18.65446)));
            zz = -4.11992 + (((tickAnim - 14) / 7) * (-70.2764-(-4.11992)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 61.68326 + (((tickAnim - 21) / 7) * (26.02728-(61.68326)));
            yy = -3.9808 + (((tickAnim - 21) / 7) * (-18.11191-(-3.9808)));
            zz = -70.2764 + (((tickAnim - 21) / 7) * (-55.1306-(-70.2764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0.475-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-0.875-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.475 + (((tickAnim - 21) / 7) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 21) / 7) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 21) / 7) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 70.68794 + (((tickAnim - 0) / 2) * (11.0202-(70.68794)));
            yy = -8.29036 + (((tickAnim - 0) / 2) * (-5.27291-(-8.29036)));
            zz = -6.58457 + (((tickAnim - 0) / 2) * (41.72781-(-6.58457)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 11.0202 + (((tickAnim - 2) / 5) * (-20.68667-(11.0202)));
            yy = -5.27291 + (((tickAnim - 2) / 5) * (5.69411-(-5.27291)));
            zz = 41.72781 + (((tickAnim - 2) / 5) * (50.85667-(41.72781)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -20.68667 + (((tickAnim - 7) / 7) * (97.25-(-20.68667)));
            yy = 5.69411 + (((tickAnim - 7) / 7) * (0-(5.69411)));
            zz = 50.85667 + (((tickAnim - 7) / 7) * (0-(50.85667)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 97.25 + (((tickAnim - 14) / 7) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 14) / 7) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-0.55895-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 126.36712 + (((tickAnim - 21) / 7) * (70.68794-(126.36712)));
            yy = 4.69673 + (((tickAnim - 21) / 7) * (-8.29036-(4.69673)));
            zz = -0.55895 + (((tickAnim - 21) / 7) * (-6.58457-(-0.55895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.475 + (((tickAnim - 0) / 2) * (0.09-(0.475)));
            yy = 0.85 + (((tickAnim - 0) / 2) * (1.565-(0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.02-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0.09 + (((tickAnim - 2) / 5) * (0.06-(0.09)));
            yy = 1.565 + (((tickAnim - 2) / 5) * (0.655-(1.565)));
            zz = 0.02 + (((tickAnim - 2) / 5) * (0.075-(0.02)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.06 + (((tickAnim - 7) / 7) * (0-(0.06)));
            yy = 0.655 + (((tickAnim - 7) / 7) * (0-(0.655)));
            zz = 0.075 + (((tickAnim - 7) / 7) * (0-(0.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.05 + (((tickAnim - 21) / 7) * (0.475-(-0.05)));
            yy = -0.48 + (((tickAnim - 21) / 7) * (0.85-(-0.48)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -4.11977 + (((tickAnim - 0) / 14) * (17.10286-(-4.11977)));
            yy = 44.57627 + (((tickAnim - 0) / 14) * (-29.0694-(44.57627)));
            zz = 24.52868 + (((tickAnim - 0) / 14) * (-5.1921-(24.52868)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 17.10286 + (((tickAnim - 14) / 7) * (12.45531-(17.10286)));
            yy = -29.0694 + (((tickAnim - 14) / 7) * (48.0936-(-29.0694)));
            zz = -5.1921 + (((tickAnim - 14) / 7) * (-1.6283-(-5.1921)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 12.45531 + (((tickAnim - 21) / 7) * (-4.11977-(12.45531)));
            yy = 48.0936 + (((tickAnim - 21) / 7) * (44.57627-(48.0936)));
            zz = -1.6283 + (((tickAnim - 21) / 7) * (24.52868-(-1.6283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.10286 + (((tickAnim - 0) / 6) * (12.45531-(17.10286)));
            yy = 29.06942 + (((tickAnim - 0) / 6) * (-48.09356-(29.06942)));
            zz = 5.19205 + (((tickAnim - 0) / 6) * (1.62831-(5.19205)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 12.45531 + (((tickAnim - 6) / 6) * (-5.34508-(12.45531)));
            yy = -48.09356 + (((tickAnim - 6) / 6) * (-44.47311-(-48.09356)));
            zz = 1.62831 + (((tickAnim - 6) / 6) * (-22.78137-(1.62831)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -5.34508 + (((tickAnim - 12) / 16) * (17.10286-(-5.34508)));
            yy = -44.47311 + (((tickAnim - 12) / 16) * (29.06942-(-44.47311)));
            zz = -22.78137 + (((tickAnim - 12) / 16) * (5.19205-(-22.78137)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRw, armRw.rotateAngleX + (float) Math.toRadians(xx), armRw.rotateAngleY + (float) Math.toRadians(yy), armRw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5+20))*2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*7), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*2));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = -0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-0.2 + (((tickAnim - 0) / 7) * (0.425-(-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 7) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 0.425 + (((tickAnim - 7) / 6) * (-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-0.2-(0.425)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 7) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 13) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = -0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-0.2 + (((tickAnim - 13) / 7) * (0.4-(-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 13) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 20) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 0.4 + (((tickAnim - 20) / 8) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-50))*0.2-(0.4)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 20) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-120))*-7), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-20))*-2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*7), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-7), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*-7), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckflap, neckflap.rotateAngleX + (float) Math.toRadians(0), neckflap.rotateAngleY + (float) Math.toRadians(0), neckflap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-15));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-190))*7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*2));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 3.75 + (((tickAnim - 12) / 16) * (0-(3.75)));
            yy = 0 + (((tickAnim - 12) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.25), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*5));

    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -8.87437 + (((tickAnim - 0) / 14) * (132.91083-(-8.87437)));
            yy = -14.74606 + (((tickAnim - 0) / 14) * (20.2471-(-14.74606)));
            zz = 0.19849 + (((tickAnim - 0) / 14) * (145.915-(0.19849)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 132.91083 + (((tickAnim - 14) / 6) * (101.14715-(132.91083)));
            yy = 20.2471 + (((tickAnim - 14) / 6) * (11.08889-(20.2471)));
            zz = 145.915 + (((tickAnim - 14) / 6) * (125.75238-(145.915)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 101.14715 + (((tickAnim - 20) / 6) * (3.10786-(101.14715)));
            yy = 11.08889 + (((tickAnim - 20) / 6) * (-11.356-(11.08889)));
            zz = 125.75238 + (((tickAnim - 20) / 6) * (16.67367-(125.75238)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 3.10786 + (((tickAnim - 26) / 2) * (-8.87437-(3.10786)));
            yy = -11.356 + (((tickAnim - 26) / 2) * (-14.74606-(-11.356)));
            zz = 16.67367 + (((tickAnim - 26) / 2) * (0.19849-(16.67367)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -46.95311 + (((tickAnim - 0) / 14) * (-9.14051-(-46.95311)));
            yy = 16.11208 + (((tickAnim - 0) / 14) * (-7.73844-(16.11208)));
            zz = 2.16757 + (((tickAnim - 0) / 14) * (52.0845-(2.16757)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -9.14051 + (((tickAnim - 14) / 6) * (-67.82017-(-9.14051)));
            yy = -7.73844 + (((tickAnim - 14) / 6) * (11.92159-(-7.73844)));
            zz = 52.0845 + (((tickAnim - 14) / 6) * (28.77846-(52.0845)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -67.82017 + (((tickAnim - 20) / 4) * (-81.38632-(-67.82017)));
            yy = 11.92159 + (((tickAnim - 20) / 4) * (13.59557-(11.92159)));
            zz = 28.77846 + (((tickAnim - 20) / 4) * (7.11812-(28.77846)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -81.38632 + (((tickAnim - 24) / 4) * (-46.95311-(-81.38632)));
            yy = 13.59557 + (((tickAnim - 24) / 4) * (16.11208-(13.59557)));
            zz = 7.11812 + (((tickAnim - 24) / 4) * (2.16757-(7.11812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 49.92358 + (((tickAnim - 0) / 3) * (39.34521-(49.92358)));
            yy = -8.10201 + (((tickAnim - 0) / 3) * (-6.6129-(-8.10201)));
            zz = -5.0219 + (((tickAnim - 0) / 3) * (-27.76956-(-5.0219)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 39.34521 + (((tickAnim - 3) / 3) * (48.55526-(39.34521)));
            yy = -6.6129 + (((tickAnim - 3) / 3) * (-7.75578-(-6.6129)));
            zz = -27.76956 + (((tickAnim - 3) / 3) * (-38.23052-(-27.76956)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 48.55526 + (((tickAnim - 6) / 8) * (79.87388-(48.55526)));
            yy = -7.75578 + (((tickAnim - 6) / 8) * (-6.29377-(-7.75578)));
            zz = -38.23052 + (((tickAnim - 6) / 8) * (-6.79241-(-38.23052)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 79.87388 + (((tickAnim - 14) / 6) * (149.07003-(79.87388)));
            yy = -6.29377 + (((tickAnim - 14) / 6) * (-7.90348-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 14) / 6) * (-4.1198-(-6.79241)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 149.07003 + (((tickAnim - 20) / 4) * (67.14952-(149.07003)));
            yy = -7.90348 + (((tickAnim - 20) / 4) * (15.33567-(-7.90348)));
            zz = -4.1198 + (((tickAnim - 20) / 4) * (-20.94026-(-4.1198)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 67.14952 + (((tickAnim - 24) / 4) * (49.92358-(67.14952)));
            yy = 15.33567 + (((tickAnim - 24) / 4) * (-8.10201-(15.33567)));
            zz = -20.94026 + (((tickAnim - 24) / 4) * (-5.0219-(-20.94026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-0.03-(0)));
            yy = 0.85 + (((tickAnim - 0) / 2) * (0.9-(0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.03 + (((tickAnim - 2) / 1) * (-0.07-(-0.03)));
            yy = 0.9 + (((tickAnim - 2) / 1) * (1.34-(0.9)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.07 + (((tickAnim - 3) / 3) * (-0.275-(-0.07)));
            yy = 1.34 + (((tickAnim - 3) / 3) * (0.5-(1.34)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -0.275 + (((tickAnim - 6) / 8) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 6) / 8) * (0-(0.5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.18-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.18 + (((tickAnim - 20) / 8) * (0.85-(0.18)));
            zz = -0.675 + (((tickAnim - 20) / 8) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 122.41083 + (((tickAnim - 0) / 6) * (-3.43808-(122.41083)));
            yy = -20.2471 + (((tickAnim - 0) / 6) * (-3.02555-(-20.2471)));
            zz = -145.91502 + (((tickAnim - 0) / 6) * (-25.05894-(-145.91502)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -3.43808 + (((tickAnim - 6) / 2) * (-24.0238-(-3.43808)));
            yy = -3.02555 + (((tickAnim - 6) / 2) * (2.51528-(-3.02555)));
            zz = -25.05894 + (((tickAnim - 6) / 2) * (-15.66184-(-25.05894)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -24.0238 + (((tickAnim - 8) / 5) * (-16.75-(-24.0238)));
            yy = 2.51528 + (((tickAnim - 8) / 5) * (11.75-(2.51528)));
            zz = -15.66184 + (((tickAnim - 8) / 5) * (0-(-15.66184)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -16.75 + (((tickAnim - 13) / 15) * (122.41083-(-16.75)));
            yy = 11.75 + (((tickAnim - 13) / 15) * (-20.2471-(11.75)));
            zz = 0 + (((tickAnim - 13) / 15) * (-145.91502-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5.30742 + (((tickAnim - 0) / 6) * (-49.33377-(-5.30742)));
            yy = 4.87353 + (((tickAnim - 0) / 6) * (-4.32032-(4.87353)));
            zz = -43.45103 + (((tickAnim - 0) / 6) * (-43.07114-(-43.45103)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -49.33377 + (((tickAnim - 6) / 7) * (-19.75-(-49.33377)));
            yy = -4.32032 + (((tickAnim - 6) / 7) * (0-(-4.32032)));
            zz = -43.07114 + (((tickAnim - 6) / 7) * (0-(-43.07114)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -19.75 + (((tickAnim - 13) / 15) * (-5.30742-(-19.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (4.87353-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (-43.45103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 79.87388 + (((tickAnim - 0) / 6) * (126.27272-(79.87388)));
            yy = -6.29377 + (((tickAnim - 0) / 6) * (-7.823-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 0) / 6) * (-4.25343-(-6.79241)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 126.27272 + (((tickAnim - 6) / 5) * (19.30323-(126.27272)));
            yy = -7.823 + (((tickAnim - 6) / 5) * (-6.4833-(-7.823)));
            zz = -4.25343 + (((tickAnim - 6) / 5) * (33.28058-(-4.25343)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 19.30323 + (((tickAnim - 11) / 2) * (24.99682-(19.30323)));
            yy = -6.4833 + (((tickAnim - 11) / 2) * (-8.82183-(-6.4833)));
            zz = 33.28058 + (((tickAnim - 11) / 2) * (2.55597-(33.28058)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 24.99682 + (((tickAnim - 13) / 1) * (15.74475-(24.99682)));
            yy = -8.82183 + (((tickAnim - 13) / 1) * (-3.9628-(-8.82183)));
            zz = 2.55597 + (((tickAnim - 13) / 1) * (19.35781-(2.55597)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.74475 + (((tickAnim - 14) / 4) * (14.92638-(15.74475)));
            yy = -3.9628 + (((tickAnim - 14) / 4) * (-2.23582-(-3.9628)));
            zz = 19.35781 + (((tickAnim - 14) / 4) * (31.51167-(19.35781)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 14.92638 + (((tickAnim - 18) / 10) * (79.87388-(14.92638)));
            yy = -2.23582 + (((tickAnim - 18) / 10) * (-6.29377-(-2.23582)));
            zz = 31.51167 + (((tickAnim - 18) / 10) * (-6.79241-(31.51167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.6-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.35 + (((tickAnim - 6) / 7) * (0.95-(0.35)));
            zz = -0.6 + (((tickAnim - 6) / 7) * (0-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = 0.95 + (((tickAnim - 13) / 15) * (0-(0.95)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 36.75654 + (((tickAnim - 0) / 6) * (61.68326-(36.75654)));
            yy = 33.0052 + (((tickAnim - 0) / 6) * (3.98076-(33.0052)));
            zz = 6.36607 + (((tickAnim - 0) / 6) * (70.27642-(6.36607)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 61.68326 + (((tickAnim - 6) / 6) * (26.02728-(61.68326)));
            yy = 3.98076 + (((tickAnim - 6) / 6) * (18.1119-(3.98076)));
            zz = 70.27642 + (((tickAnim - 6) / 6) * (55.1306-(70.27642)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 26.02728 + (((tickAnim - 12) / 16) * (36.75654-(26.02728)));
            yy = 18.1119 + (((tickAnim - 12) / 16) * (33.0052-(18.1119)));
            zz = 55.1306 + (((tickAnim - 12) / 16) * (6.36607-(55.1306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.875-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 28) {
            xx = 0.475 + (((tickAnim - 6) / 22) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 6) / 22) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 6) / 22) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 97.25 + (((tickAnim - 0) / 6) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.55895-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 126.36712 + (((tickAnim - 6) / 4) * (-19.47787-(126.36712)));
            yy = 4.69673 + (((tickAnim - 6) / 4) * (4.43324-(4.69673)));
            zz = -0.55895 + (((tickAnim - 6) / 4) * (-81.49916-(-0.55895)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -19.47787 + (((tickAnim - 10) / 2) * (37.84231-(-19.47787)));
            yy = 4.43324 + (((tickAnim - 10) / 2) * (1.39308-(4.43324)));
            zz = -81.49916 + (((tickAnim - 10) / 2) * (-30.42816-(-81.49916)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 37.84231 + (((tickAnim - 12) / 4) * (-22.90992-(37.84231)));
            yy = 1.39308 + (((tickAnim - 12) / 4) * (3.16256-(1.39308)));
            zz = -30.42816 + (((tickAnim - 12) / 4) * (-62.69579-(-30.42816)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22.90992 + (((tickAnim - 16) / 2) * (-15.49921-(-22.90992)));
            yy = 3.16256 + (((tickAnim - 16) / 2) * (0.17963-(3.16256)));
            zz = -62.69579 + (((tickAnim - 16) / 2) * (-48.6455-(-62.69579)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -15.49921 + (((tickAnim - 18) / 3) * (4.11753-(-15.49921)));
            yy = 0.17963 + (((tickAnim - 18) / 3) * (-8.37526-(0.17963)));
            zz = -48.6455 + (((tickAnim - 18) / 3) * (-28.00057-(-48.6455)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 4.11753 + (((tickAnim - 21) / 7) * (97.25-(4.11753)));
            yy = -8.37526 + (((tickAnim - 21) / 7) * (0-(-8.37526)));
            zz = -28.00057 + (((tickAnim - 21) / 7) * (0-(-28.00057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -0.05 + (((tickAnim - 6) / 6) * (-0.1-(-0.05)));
            yy = -0.48 + (((tickAnim - 6) / 6) * (0.15-(-0.48)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.1 + (((tickAnim - 12) / 2) * (-0.09-(-0.1)));
            yy = 0.15 + (((tickAnim - 12) / 2) * (1.375-(0.15)));
            zz = 0 + (((tickAnim - 12) / 2) * (-0.02-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -0.09 + (((tickAnim - 14) / 2) * (-0.08-(-0.09)));
            yy = 1.375 + (((tickAnim - 14) / 2) * (0.98-(1.375)));
            zz = -0.02 + (((tickAnim - 14) / 2) * (-0.03-(-0.02)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -0.08 + (((tickAnim - 16) / 5) * (-0.06-(-0.08)));
            yy = 0.98 + (((tickAnim - 16) / 5) * (0.655-(0.98)));
            zz = -0.03 + (((tickAnim - 16) / 5) * (-0.075-(-0.03)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.06 + (((tickAnim - 21) / 7) * (0-(-0.06)));
            yy = 0.655 + (((tickAnim - 21) / 7) * (0-(0.655)));
            zz = -0.075 + (((tickAnim - 21) / 7) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 26.02728 + (((tickAnim - 0) / 14) * (27.29124-(26.02728)));
            yy = -18.11191 + (((tickAnim - 0) / 14) * (-18.65446-(-18.11191)));
            zz = -55.1306 + (((tickAnim - 0) / 14) * (-4.11992-(-55.1306)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 27.29124 + (((tickAnim - 14) / 7) * (61.68326-(27.29124)));
            yy = -18.65446 + (((tickAnim - 14) / 7) * (-3.9808-(-18.65446)));
            zz = -4.11992 + (((tickAnim - 14) / 7) * (-70.2764-(-4.11992)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 61.68326 + (((tickAnim - 21) / 7) * (26.02728-(61.68326)));
            yy = -3.9808 + (((tickAnim - 21) / 7) * (-18.11191-(-3.9808)));
            zz = -70.2764 + (((tickAnim - 21) / 7) * (-55.1306-(-70.2764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (0.475-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-0.875-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0.475 + (((tickAnim - 21) / 7) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 21) / 7) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 21) / 7) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 70.68794 + (((tickAnim - 0) / 2) * (11.0202-(70.68794)));
            yy = -8.29036 + (((tickAnim - 0) / 2) * (-5.27291-(-8.29036)));
            zz = -6.58457 + (((tickAnim - 0) / 2) * (41.72781-(-6.58457)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 11.0202 + (((tickAnim - 2) / 5) * (-20.68667-(11.0202)));
            yy = -5.27291 + (((tickAnim - 2) / 5) * (5.69411-(-5.27291)));
            zz = 41.72781 + (((tickAnim - 2) / 5) * (50.85667-(41.72781)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -20.68667 + (((tickAnim - 7) / 7) * (97.25-(-20.68667)));
            yy = 5.69411 + (((tickAnim - 7) / 7) * (0-(5.69411)));
            zz = 50.85667 + (((tickAnim - 7) / 7) * (0-(50.85667)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 97.25 + (((tickAnim - 14) / 7) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 14) / 7) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-0.55895-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 126.36712 + (((tickAnim - 21) / 7) * (70.68794-(126.36712)));
            yy = 4.69673 + (((tickAnim - 21) / 7) * (-8.29036-(4.69673)));
            zz = -0.55895 + (((tickAnim - 21) / 7) * (-6.58457-(-0.55895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.475 + (((tickAnim - 0) / 2) * (0.09-(0.475)));
            yy = 0.85 + (((tickAnim - 0) / 2) * (1.565-(0.85)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.02-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0.09 + (((tickAnim - 2) / 5) * (0.06-(0.09)));
            yy = 1.565 + (((tickAnim - 2) / 5) * (0.655-(1.565)));
            zz = 0.02 + (((tickAnim - 2) / 5) * (0.075-(0.02)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.06 + (((tickAnim - 7) / 7) * (0-(0.06)));
            yy = 0.655 + (((tickAnim - 7) / 7) * (0-(0.655)));
            zz = 0.075 + (((tickAnim - 7) / 7) * (0-(0.075)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 14) / 7) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 14) / 7) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -0.05 + (((tickAnim - 21) / 7) * (0.475-(-0.05)));
            yy = -0.48 + (((tickAnim - 21) / 7) * (0.85-(-0.48)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -4.11977 + (((tickAnim - 0) / 14) * (21.50699-(-4.11977)));
            yy = 44.57627 + (((tickAnim - 0) / 14) * (-35.14252-(44.57627)));
            zz = 24.52868 + (((tickAnim - 0) / 14) * (-24.82377-(24.52868)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 21.50699 + (((tickAnim - 14) / 7) * (12.45531-(21.50699)));
            yy = -35.14252 + (((tickAnim - 14) / 7) * (48.0936-(-35.14252)));
            zz = -24.82377 + (((tickAnim - 14) / 7) * (-1.6283-(-24.82377)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 12.45531 + (((tickAnim - 21) / 7) * (-4.11977-(12.45531)));
            yy = 48.0936 + (((tickAnim - 21) / 7) * (44.57627-(48.0936)));
            zz = -1.6283 + (((tickAnim - 21) / 7) * (24.52868-(-1.6283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.10286 + (((tickAnim - 0) / 6) * (12.45531-(17.10286)));
            yy = 29.06942 + (((tickAnim - 0) / 6) * (-48.09356-(29.06942)));
            zz = 5.19205 + (((tickAnim - 0) / 6) * (1.62831-(5.19205)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 12.45531 + (((tickAnim - 6) / 6) * (-5.34508-(12.45531)));
            yy = -48.09356 + (((tickAnim - 6) / 6) * (-44.47311-(-48.09356)));
            zz = 1.62831 + (((tickAnim - 6) / 6) * (-22.78137-(1.62831)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = -5.34508 + (((tickAnim - 12) / 16) * (17.10286-(-5.34508)));
            yy = -44.47311 + (((tickAnim - 12) / 16) * (29.06942-(-44.47311)));
            zz = -22.78137 + (((tickAnim - 12) / 16) * (5.19205-(-22.78137)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRw, armRw.rotateAngleX + (float) Math.toRadians(xx), armRw.rotateAngleY + (float) Math.toRadians(yy), armRw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-90+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5+20))*2.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*7), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*2));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 0) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 7.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-1 + (((tickAnim - 0) / 7) * (9.075-(7.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+50))*-1)));
            zz = -0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 0) / 7) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(-0.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 7) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 9.075 + (((tickAnim - 7) / 6) * (7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-1-(9.075)));
            zz = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 7) / 6) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 13) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-1 + (((tickAnim - 13) / 7) * (9.075-(7.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5+100))*-1)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 13) / 7) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1 + (((tickAnim - 20) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262))*-0.1)));
            yy = 9.075 + (((tickAnim - 20) / 8) * (7.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5-50))*1-(9.075)));
            zz = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3 + (((tickAnim - 20) / 8) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*262/0.5))*0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-150))*-10), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5-20))*-2), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-6.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*-7), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*-7), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckflap, neckflap.rotateAngleX + (float) Math.toRadians(0), neckflap.rotateAngleY + (float) Math.toRadians(0), neckflap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-80))*-15));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-190))*10), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*2));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 3.28543 + (((tickAnim - 0) / 12) * (3.75-(3.28543)));
            yy = 4.07509 + (((tickAnim - 0) / 12) * (0-(4.07509)));
            zz = 1.89779 + (((tickAnim - 0) / 12) * (0-(1.89779)));
        }
        else if (tickAnim >= 12 && tickAnim < 28) {
            xx = 3.75 + (((tickAnim - 12) / 16) * (3.28543-(3.75)));
            yy = 0 + (((tickAnim - 12) / 16) * (4.07509-(0)));
            zz = 0 + (((tickAnim - 12) / 16) * (1.89779-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.25), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*-4), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-180))*4), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-50))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-250))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262-100))*5));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTrilophosaurus entity = (EntityPrehistoricFloraTrilophosaurus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -2.87437 + (((tickAnim - 0) / 6) * (132.91083-(-2.87437)));
            yy = -14.74606 + (((tickAnim - 0) / 6) * (20.2471-(-14.74606)));
            zz = 0.19849 + (((tickAnim - 0) / 6) * (145.915-(0.19849)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 132.91083 + (((tickAnim - 6) / 3) * (62.28068-(132.91083)));
            yy = 20.2471 + (((tickAnim - 6) / 3) * (7.9624-(20.2471)));
            zz = 145.915 + (((tickAnim - 6) / 3) * (82.21519-(145.915)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 62.28068 + (((tickAnim - 9) / 4) * (-2.87437-(62.28068)));
            yy = 7.9624 + (((tickAnim - 9) / 4) * (-14.74606-(7.9624)));
            zz = 82.21519 + (((tickAnim - 9) / 4) * (0.19849-(82.21519)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -46.95311 + (((tickAnim - 0) / 6) * (-9.14051-(-46.95311)));
            yy = 16.11208 + (((tickAnim - 0) / 6) * (-7.73844-(16.11208)));
            zz = 2.16757 + (((tickAnim - 0) / 6) * (52.0845-(2.16757)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -9.14051 + (((tickAnim - 6) / 3) * (-66.47621-(-9.14051)));
            yy = -7.73844 + (((tickAnim - 6) / 3) * (6.17154-(-7.73844)));
            zz = 52.0845 + (((tickAnim - 6) / 3) * (21.72288-(52.0845)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -66.47621 + (((tickAnim - 9) / 2) * (-81.38632-(-66.47621)));
            yy = 6.17154 + (((tickAnim - 9) / 2) * (13.59557-(6.17154)));
            zz = 21.72288 + (((tickAnim - 9) / 2) * (7.11812-(21.72288)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -81.38632 + (((tickAnim - 11) / 2) * (-46.95311-(-81.38632)));
            yy = 13.59557 + (((tickAnim - 11) / 2) * (16.11208-(13.59557)));
            zz = 7.11812 + (((tickAnim - 11) / 2) * (2.16757-(7.11812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 49.92358 + (((tickAnim - 0) / 1) * (39.34521-(49.92358)));
            yy = -8.10201 + (((tickAnim - 0) / 1) * (-6.6129-(-8.10201)));
            zz = -5.0219 + (((tickAnim - 0) / 1) * (-27.76956-(-5.0219)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 39.34521 + (((tickAnim - 1) / 2) * (48.55526-(39.34521)));
            yy = -6.6129 + (((tickAnim - 1) / 2) * (-7.75578-(-6.6129)));
            zz = -27.76956 + (((tickAnim - 1) / 2) * (-38.23052-(-27.76956)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 48.55526 + (((tickAnim - 3) / 3) * (79.87388-(48.55526)));
            yy = -7.75578 + (((tickAnim - 3) / 3) * (-6.29377-(-7.75578)));
            zz = -38.23052 + (((tickAnim - 3) / 3) * (-6.79241-(-38.23052)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 79.87388 + (((tickAnim - 6) / 3) * (149.07003-(79.87388)));
            yy = -6.29377 + (((tickAnim - 6) / 3) * (-7.90348-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 6) / 3) * (-4.1198-(-6.79241)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 149.07003 + (((tickAnim - 9) / 2) * (67.14952-(149.07003)));
            yy = -7.90348 + (((tickAnim - 9) / 2) * (15.33567-(-7.90348)));
            zz = -4.1198 + (((tickAnim - 9) / 2) * (-20.94026-(-4.1198)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 67.14952 + (((tickAnim - 11) / 2) * (49.92358-(67.14952)));
            yy = 15.33567 + (((tickAnim - 11) / 2) * (-8.10201-(15.33567)));
            zz = -20.94026 + (((tickAnim - 11) / 2) * (-5.0219-(-20.94026)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.03-(0)));
            yy = 0.85 + (((tickAnim - 0) / 1) * (0.9-(0.85)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.03 + (((tickAnim - 1) / 1) * (-0.07-(-0.03)));
            yy = 0.9 + (((tickAnim - 1) / 1) * (1.34-(0.9)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.07 + (((tickAnim - 2) / 1) * (-0.275-(-0.07)));
            yy = 1.34 + (((tickAnim - 2) / 1) * (0.5-(1.34)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -0.275 + (((tickAnim - 3) / 3) * (0-(-0.275)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (0-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.18-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.675-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.18 + (((tickAnim - 9) / 4) * (0.85-(0.18)));
            zz = -0.675 + (((tickAnim - 9) / 4) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 132.91083 + (((tickAnim - 0) / 3) * (-3.43808-(132.91083)));
            yy = -20.2471 + (((tickAnim - 0) / 3) * (-3.02555-(-20.2471)));
            zz = -145.91502 + (((tickAnim - 0) / 3) * (-25.05894-(-145.91502)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -3.43808 + (((tickAnim - 3) / 3) * (-5-(-3.43808)));
            yy = -3.02555 + (((tickAnim - 3) / 3) * (11.75-(-3.02555)));
            zz = -25.05894 + (((tickAnim - 3) / 3) * (0-(-25.05894)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 6) / 7) * (132.91083-(-5)));
            yy = 11.75 + (((tickAnim - 6) / 7) * (-20.2471-(11.75)));
            zz = 0 + (((tickAnim - 6) / 7) * (-145.91502-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.30742 + (((tickAnim - 0) / 3) * (-49.33377-(-5.30742)));
            yy = 4.87353 + (((tickAnim - 0) / 3) * (-4.32032-(4.87353)));
            zz = -43.45103 + (((tickAnim - 0) / 3) * (-43.07114-(-43.45103)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -49.33377 + (((tickAnim - 3) / 3) * (-19.75-(-49.33377)));
            yy = -4.32032 + (((tickAnim - 3) / 3) * (0-(-4.32032)));
            zz = -43.07114 + (((tickAnim - 3) / 3) * (0-(-43.07114)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -19.75 + (((tickAnim - 6) / 7) * (-5.30742-(-19.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (4.87353-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-43.45103-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 79.87388 + (((tickAnim - 0) / 3) * (126.27272-(79.87388)));
            yy = -6.29377 + (((tickAnim - 0) / 3) * (-7.823-(-6.29377)));
            zz = -6.79241 + (((tickAnim - 0) / 3) * (-4.25343-(-6.79241)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 126.27272 + (((tickAnim - 3) / 2) * (19.30323-(126.27272)));
            yy = -7.823 + (((tickAnim - 3) / 2) * (-6.4833-(-7.823)));
            zz = -4.25343 + (((tickAnim - 3) / 2) * (33.28058-(-4.25343)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 19.30323 + (((tickAnim - 5) / 1) * (24.99682-(19.30323)));
            yy = -6.4833 + (((tickAnim - 5) / 1) * (-8.82183-(-6.4833)));
            zz = 33.28058 + (((tickAnim - 5) / 1) * (2.55597-(33.28058)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 24.99682 + (((tickAnim - 6) / 2) * (14.92638-(24.99682)));
            yy = -8.82183 + (((tickAnim - 6) / 2) * (-2.23582-(-8.82183)));
            zz = 2.55597 + (((tickAnim - 6) / 2) * (31.51167-(2.55597)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.92638 + (((tickAnim - 8) / 5) * (79.87388-(14.92638)));
            yy = -2.23582 + (((tickAnim - 8) / 5) * (-6.29377-(-2.23582)));
            zz = 31.51167 + (((tickAnim - 8) / 5) * (-6.79241-(31.51167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 3) / 3) * (0.95-(0.35)));
            zz = -0.6 + (((tickAnim - 3) / 3) * (0-(-0.6)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.95 + (((tickAnim - 6) / 7) * (0-(0.95)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.75654 + (((tickAnim - 0) / 3) * (61.68326-(36.75654)));
            yy = 33.0052 + (((tickAnim - 0) / 3) * (3.98076-(33.0052)));
            zz = 6.36607 + (((tickAnim - 0) / 3) * (70.27642-(6.36607)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 61.68326 + (((tickAnim - 3) / 2) * (26.02728-(61.68326)));
            yy = 3.98076 + (((tickAnim - 3) / 2) * (18.1119-(3.98076)));
            zz = 70.27642 + (((tickAnim - 3) / 2) * (55.1306-(70.27642)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 26.02728 + (((tickAnim - 5) / 8) * (36.75654-(26.02728)));
            yy = 18.1119 + (((tickAnim - 5) / 8) * (33.0052-(18.1119)));
            zz = 55.1306 + (((tickAnim - 5) / 8) * (6.36607-(55.1306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.875-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0.475 + (((tickAnim - 3) / 10) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 3) / 10) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 3) / 10) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(xx);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(yy);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 97.25 + (((tickAnim - 0) / 3) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55895-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 126.36712 + (((tickAnim - 3) / 1) * (-19.47787-(126.36712)));
            yy = 4.69673 + (((tickAnim - 3) / 1) * (4.43324-(4.69673)));
            zz = -0.55895 + (((tickAnim - 3) / 1) * (-81.49916-(-0.55895)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -19.47787 + (((tickAnim - 4) / 1) * (37.84231-(-19.47787)));
            yy = 4.43324 + (((tickAnim - 4) / 1) * (1.39308-(4.43324)));
            zz = -81.49916 + (((tickAnim - 4) / 1) * (-30.42816-(-81.49916)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 37.84231 + (((tickAnim - 5) / 2) * (-22.90992-(37.84231)));
            yy = 1.39308 + (((tickAnim - 5) / 2) * (3.16256-(1.39308)));
            zz = -30.42816 + (((tickAnim - 5) / 2) * (-62.69579-(-30.42816)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -22.90992 + (((tickAnim - 7) / 1) * (-15.49921-(-22.90992)));
            yy = 3.16256 + (((tickAnim - 7) / 1) * (0.17963-(3.16256)));
            zz = -62.69579 + (((tickAnim - 7) / 1) * (-48.6455-(-62.69579)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -15.49921 + (((tickAnim - 8) / 1) * (4.11753-(-15.49921)));
            yy = 0.17963 + (((tickAnim - 8) / 1) * (-8.37526-(0.17963)));
            zz = -48.6455 + (((tickAnim - 8) / 1) * (-28.00057-(-48.6455)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 4.11753 + (((tickAnim - 9) / 4) * (97.25-(4.11753)));
            yy = -8.37526 + (((tickAnim - 9) / 4) * (0-(-8.37526)));
            zz = -28.00057 + (((tickAnim - 9) / 4) * (0-(-28.00057)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.05 + (((tickAnim - 3) / 2) * (-0.1-(-0.05)));
            yy = -0.48 + (((tickAnim - 3) / 2) * (0.15-(-0.48)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.1 + (((tickAnim - 5) / 1) * (-0.09-(-0.1)));
            yy = 0.15 + (((tickAnim - 5) / 1) * (1.375-(0.15)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.02-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.09 + (((tickAnim - 6) / 1) * (-0.08-(-0.09)));
            yy = 1.375 + (((tickAnim - 6) / 1) * (0.98-(1.375)));
            zz = -0.02 + (((tickAnim - 6) / 1) * (-0.03-(-0.02)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.08 + (((tickAnim - 7) / 2) * (-0.06-(-0.08)));
            yy = 0.98 + (((tickAnim - 7) / 2) * (0.655-(0.98)));
            zz = -0.03 + (((tickAnim - 7) / 2) * (-0.075-(-0.03)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.06 + (((tickAnim - 9) / 4) * (0-(-0.06)));
            yy = 0.655 + (((tickAnim - 9) / 4) * (0-(0.655)));
            zz = -0.075 + (((tickAnim - 9) / 4) * (0-(-0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 26.02728 + (((tickAnim - 0) / 6) * (27.29124-(26.02728)));
            yy = -18.11191 + (((tickAnim - 0) / 6) * (-18.65446-(-18.11191)));
            zz = -55.1306 + (((tickAnim - 0) / 6) * (-4.11992-(-55.1306)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 27.29124 + (((tickAnim - 6) / 3) * (61.68326-(27.29124)));
            yy = -18.65446 + (((tickAnim - 6) / 3) * (-3.9808-(-18.65446)));
            zz = -4.11992 + (((tickAnim - 6) / 3) * (-70.2764-(-4.11992)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 61.68326 + (((tickAnim - 9) / 4) * (26.02728-(61.68326)));
            yy = -3.9808 + (((tickAnim - 9) / 4) * (-18.11191-(-3.9808)));
            zz = -70.2764 + (((tickAnim - 9) / 4) * (-55.1306-(-70.2764)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0.475-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.875-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0.475 + (((tickAnim - 9) / 4) * (0-(0.475)));
            yy = -0.975 + (((tickAnim - 9) / 4) * (0-(-0.975)));
            zz = -0.875 + (((tickAnim - 9) / 4) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 70.68794 + (((tickAnim - 0) / 1) * (11.0202-(70.68794)));
            yy = -8.29036 + (((tickAnim - 0) / 1) * (-5.27291-(-8.29036)));
            zz = -6.58457 + (((tickAnim - 0) / 1) * (41.72781-(-6.58457)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 11.0202 + (((tickAnim - 1) / 2) * (-20.68667-(11.0202)));
            yy = -5.27291 + (((tickAnim - 1) / 2) * (5.69411-(-5.27291)));
            zz = 41.72781 + (((tickAnim - 1) / 2) * (50.85667-(41.72781)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -20.68667 + (((tickAnim - 3) / 3) * (97.25-(-20.68667)));
            yy = 5.69411 + (((tickAnim - 3) / 3) * (0-(5.69411)));
            zz = 50.85667 + (((tickAnim - 3) / 3) * (0-(50.85667)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 97.25 + (((tickAnim - 6) / 3) * (126.36712-(97.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (4.69673-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.55895-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 126.36712 + (((tickAnim - 9) / 4) * (70.68794-(126.36712)));
            yy = 4.69673 + (((tickAnim - 9) / 4) * (-8.29036-(4.69673)));
            zz = -0.55895 + (((tickAnim - 9) / 4) * (-6.58457-(-0.55895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.475 + (((tickAnim - 0) / 1) * (0.09-(0.475)));
            yy = 0.85 + (((tickAnim - 0) / 1) * (1.565-(0.85)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.02-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.09 + (((tickAnim - 1) / 2) * (0.06-(0.09)));
            yy = 1.565 + (((tickAnim - 1) / 2) * (0.655-(1.565)));
            zz = 0.02 + (((tickAnim - 1) / 2) * (0.075-(0.02)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.06 + (((tickAnim - 3) / 3) * (0-(0.06)));
            yy = 0.655 + (((tickAnim - 3) / 3) * (0-(0.655)));
            zz = 0.075 + (((tickAnim - 3) / 3) * (0-(0.075)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.48-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -0.05 + (((tickAnim - 9) / 4) * (0.475-(-0.05)));
            yy = -0.48 + (((tickAnim - 9) / 4) * (0.85-(-0.48)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -4.11977 + (((tickAnim - 0) / 6) * (17.10286-(-4.11977)));
            yy = 44.57627 + (((tickAnim - 0) / 6) * (-29.0694-(44.57627)));
            zz = 24.52868 + (((tickAnim - 0) / 6) * (-5.1921-(24.52868)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 17.10286 + (((tickAnim - 6) / 3) * (12.45531-(17.10286)));
            yy = -29.0694 + (((tickAnim - 6) / 3) * (48.0936-(-29.0694)));
            zz = -5.1921 + (((tickAnim - 6) / 3) * (-1.6283-(-5.1921)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12.45531 + (((tickAnim - 9) / 4) * (-4.11977-(12.45531)));
            yy = 48.0936 + (((tickAnim - 9) / 4) * (44.57627-(48.0936)));
            zz = -1.6283 + (((tickAnim - 9) / 4) * (24.52868-(-1.6283)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLw, armLw.rotateAngleX + (float) Math.toRadians(xx), armLw.rotateAngleY + (float) Math.toRadians(yy), armLw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.10286 + (((tickAnim - 0) / 3) * (12.45531-(17.10286)));
            yy = 29.06942 + (((tickAnim - 0) / 3) * (-48.09356-(29.06942)));
            zz = 5.19205 + (((tickAnim - 0) / 3) * (1.62831-(5.19205)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.45531 + (((tickAnim - 3) / 2) * (-5.34508-(12.45531)));
            yy = -48.09356 + (((tickAnim - 3) / 2) * (-44.47311-(-48.09356)));
            zz = 1.62831 + (((tickAnim - 3) / 2) * (-22.78137-(1.62831)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -5.34508 + (((tickAnim - 5) / 8) * (17.10286-(-5.34508)));
            yy = -44.47311 + (((tickAnim - 5) / 8) * (29.06942-(-44.47311)));
            zz = -22.78137 + (((tickAnim - 5) / 8) * (5.19205-(-22.78137)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRw, armRw.rotateAngleX + (float) Math.toRadians(xx), armRw.rotateAngleY + (float) Math.toRadians(yy), armRw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5+20))*4.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*15), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1)));
            yy = -0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5+50))*-0.1 + (((tickAnim - 0) / 3) * (0.925-(-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5+50))*-0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1 + (((tickAnim - 3) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1)));
            yy = 0.925 + (((tickAnim - 3) / 3) * (-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5+80))*-0.1-(0.925)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5 + (((tickAnim - 3) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1 + (((tickAnim - 6) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1)));
            yy = -0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5+80))*-0.1 + (((tickAnim - 6) / 3) * (0.95-(-0.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5+80))*-0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5 + (((tickAnim - 6) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1 + (((tickAnim - 9) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575))*-0.1)));
            yy = 0.95 + (((tickAnim - 9) / 4) * (-0.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5-50))*0.1-(0.95)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5 + (((tickAnim - 9) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*575/0.5))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-120))*-15), body1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-20))*-5), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*-15), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*-15), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neckflap, neckflap.rotateAngleX + (float) Math.toRadians(0), neckflap.rotateAngleY + (float) Math.toRadians(0), neckflap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-210))*-25));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-190))*15), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 3.75 + (((tickAnim - 5) / 8) * (0-(3.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(3.25), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-9), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*-9), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*5));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTrilophosaurus e = (EntityPrehistoricFloraTrilophosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(lowerjaw, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

    }
}
