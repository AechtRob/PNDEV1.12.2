package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMymoorapelta;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMymoorapelta extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer leftArm4;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer rightArm4;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer Tail4;

    private ModelAnimator animator;

    public ModelMymoorapelta() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 12.35F, 8.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, 4.0F, -5.7F, -1.65F, 0, 1, 10, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, 2.5F, -5.7F, -2.65F, 0, 1, 10, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, 1.0F, -5.7F, -1.65F, 0, 1, 10, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -1.0F, -5.7F, -1.65F, 0, 1, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -2.5F, -5.7F, -2.65F, 0, 1, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -4.0F, -5.7F, -1.65F, 0, 1, 10, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -5.5F, -5.2F, -1.65F, 11, 4, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1396F, -0.3054F, 0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 33, 7.5F, -8.15F, 11.5F, 2, 0, 2, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0524F, -0.3054F, 0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 4, 6.25F, -7.4F, 9.75F, 3, 0, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0785F, -0.3054F, 0.3054F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 31, 6.25F, -6.15F, 8.0F, 3, 0, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1396F, 0.3054F, -0.3054F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 33, -9.5F, -8.15F, 11.5F, 2, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0524F, 0.3054F, -0.3054F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 4, -9.25F, -7.4F, 9.75F, 3, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0785F, 0.3054F, -0.3054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 31, -9.25F, -6.15F, 8.0F, 3, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 31, -5.0F, -1.25F, -1.25F, 10, 6, 10, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -2.8F, -8.5F, 11, 8, 9, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2094F, -0.3054F, 0.3054F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 7, 5.0F, -6.15F, 5.5F, 4, 0, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 6, 4.65F, -6.75F, 2.5F, 4, 0, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2094F, -0.3054F, 0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 52, 4.25F, -6.55F, -0.5F, 4, 0, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 12.0F, -8.0F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 5.5F, -15.35F, 5.25F, 1, 2, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, 5.5F, -15.35F, 1.25F, 1, 2, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, 0.75F, -16.85F, 5.25F, 2, 1, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 8, 0.75F, -16.85F, 1.25F, 2, 1, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -6.5F, -15.35F, 5.25F, 1, 2, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -6.5F, -15.35F, 1.25F, 1, 2, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 22, -2.75F, -16.85F, 5.25F, 2, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 65, 8, -2.75F, -16.85F, 1.25F, 2, 1, 3, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 8, -6.0F, -16.1F, 1.0F, 12, 4, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2094F, 0.3054F, -0.3054F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 7, -9.0F, -6.15F, 5.5F, 4, 0, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 51, 6, -8.65F, -6.75F, 2.5F, 4, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2094F, 0.3054F, -0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 52, -8.25F, -6.55F, -0.5F, 4, 0, 2, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0611F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2094F, -0.3054F, 0.2182F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 35, 2.25F, -6.05F, -3.0F, 4, 0, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 54, 1.5F, -6.3F, -5.75F, 4, 0, 2, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2094F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 35, 4.0F, -7.05F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 51, 4.0F, -7.05F, -2.5F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 21, 4.0F, -7.05F, -4.975F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 50, 0.75F, -8.3F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 53, 0.75F, -8.3F, -2.5F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 57, 0.75F, -8.3F, -5.0F, 1, 1, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 43, 21, -5.0F, -7.05F, -4.975F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 51, -5.0F, -7.05F, -2.5F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 35, -5.0F, -7.05F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 53, -1.75F, -8.3F, -2.5F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 50, -1.75F, -8.3F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 57, 57, -1.75F, -8.3F, -5.0F, 1, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 21, -4.0F, -4.9F, -4.95F, 8, 2, 7, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 31, -4.5F, -7.8F, -5.0F, 9, 3, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2094F, 0.3054F, -0.2182F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 35, -6.25F, -6.05F, -3.0F, 4, 0, 2, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 54, -5.5F, -6.3F, -5.75F, 4, 0, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.48F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 41, -4.0F, -5.1F, -5.65F, 8, 6, 6, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.35F, -5.2F);
        this.chest.addChild(neck1);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -0.75F, -9.5F);
        this.neck1.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 47, 0, -2.0F, 0.15F, 5.4F, 4, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.75F, -9.5F);
        this.neck1.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 57, 48, -2.5F, -2.2F, 5.2F, 5, 4, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.75F, -10.0F);
        this.neck1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 0, 2.0F, -1.9F, 6.75F, 1, 2, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 47, 0, -3.0F, -1.9F, 6.75F, 1, 2, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.75F, -9.5F);
        this.neck1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 58, 0.75F, -2.4F, 5.75F, 1, 1, 2, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 58, -1.75F, -2.4F, 5.75F, 1, 1, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.75F, -3.75F);
        this.neck1.addChild(neck2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.neck2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 64, -1.5F, -0.25F, 2.85F, 3, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -6.25F);
        this.neck2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 47, 1.25F, -1.9F, 4.25F, 1, 2, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 47, -2.25F, -1.9F, 4.25F, 1, 2, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, -5.75F);
        this.neck2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 60, 0.75F, -2.4F, 3.0F, 1, 1, 2, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 60, -1.75F, -2.4F, 3.0F, 1, 1, 2, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 21, -2.0F, -1.9F, 2.75F, 4, 3, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -2.85F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 56, 42, -2.0F, 0.0F, -2.95F, 4, 2, 3, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 47, -1.0F, 0.0F, -2.05F, 2, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, 0.0F, -2.95F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1178F, 1.1737F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 73, -3.125F, -0.475F, 0.25F, 1, 1, 2, -0.01F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, 0.0F, -2.95F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1178F, -1.1737F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 14, 73, 2.125F, -0.475F, 0.25F, 1, 1, 2, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 0.0F, -2.95F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2618F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 0, -2.0F, 0.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.0F, 1.1F, -2.7F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.8727F, 0.4363F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 14, 60, 1.0F, -0.1F, 0.95F, 2, 1, 1, 0.01F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-2.0F, 1.1F, -2.7F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.8727F, -0.4363F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 60, -3.0F, -0.1F, 0.95F, 2, 1, 1, 0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.7418F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 67, 30, -1.0F, -0.75F, -2.4F, 2, 1, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.5F, -0.5F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 53, -2.0F, -0.95F, -2.15F, 4, 2, 3, -0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, -1.9F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3927F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 65, 21, -1.0F, -0.15F, -2.35F, 2, 1, 3, -0.01F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(3.5F, 0.75F, -3.9F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.3603F, 0.1807F, -0.2205F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 62, 60, -2.0F, -0.25F, -2.0F, 3, 6, 4, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.25F, 5.0F, 1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.7485F, 0.1372F, 0.1641F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 38, 64, -1.75F, 0.0F, -1.925F, 3, 5, 3, -0.01F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.25F, 4.75F, -1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.3011F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 55, 31, -2.0F, -0.25F, -0.825F, 3, 2, 2, 0.0F, true));

        this.leftArm4 = new AdvancedModelRenderer(this);
        this.leftArm4.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.leftArm3.addChild(leftArm4);
        this.leftArm4.cubeList.add(new ModelBox(leftArm4, 62, 4, -2.0F, 0.0F, -1.825F, 3, 1, 3, -0.01F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-3.5F, 0.75F, -3.9F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.3603F, -0.1807F, 0.2205F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 62, 60, -1.0F, -0.25F, -2.0F, 3, 6, 4, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.25F, 5.0F, 1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.7485F, -0.1372F, -0.1641F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 38, 64, -1.25F, 0.0F, -1.925F, 3, 5, 3, -0.01F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-0.25F, 4.75F, -1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.3011F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 55, 31, -1.0F, -0.25F, -0.825F, 3, 2, 2, 0.0F, false));

        this.rightArm4 = new AdvancedModelRenderer(this);
        this.rightArm4.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.rightArm3.addChild(rightArm4);
        this.rightArm4.cubeList.add(new ModelBox(rightArm4, 62, 4, -1.0F, 0.0F, -1.825F, 3, 1, 3, -0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-4.1F, -2.95F, -3.0F);
        this.chest.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.1309F, -0.7854F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 7.0F, 3.0F);
        this.bone.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2094F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 27, 47, -0.75F, -8.3F, -1.0F, 1, 1, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 53, -0.75F, -8.3F, -5.0F, 1, 1, 2, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 5, 52, -0.75F, -8.3F, -2.5F, 1, 1, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(4.1F, -2.95F, -3.0F);
        this.chest.addChild(bone4);
        this.setRotateAngle(bone4, -0.0436F, -0.1309F, 0.7854F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, 7.0F, 3.0F);
        this.bone4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2094F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 27, 47, -0.25F, -8.3F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 53, -0.25F, -8.3F, -5.0F, 1, 1, 2, 0.0F, true));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 5, 52, -0.25F, -8.3F, -2.5F, 1, 1, 1, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(-5.95F, -4.35F, -3.75F);
        this.body.addChild(bone2);
        this.setRotateAngle(bone2, -0.1134F, 0.0873F, -0.3491F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.5F, 7.0F, 3.0F);
        this.bone2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2094F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 36, -0.5F, -7.8F, -2.0F, 2, 1, 3, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 65, 12, -0.5F, -7.8F, -6.0F, 2, 1, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(5.95F, -4.35F, -3.75F);
        this.body.addChild(bone3);
        this.setRotateAngle(bone3, -0.1134F, -0.0873F, 0.3491F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5F, 7.0F, 3.0F);
        this.bone3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2094F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 36, -1.5F, -7.8F, -2.0F, 2, 1, 3, 0.0F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 65, 12, -1.5F, -7.8F, -6.0F, 2, 1, 3, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(4.4F, -0.5F, 2.35F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 60, -2.0F, -0.25F, -2.0F, 3, 6, 4, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 5.75F, 2.0F);
        this.leftLeg.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.4363F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 14, 63, -2.0F, -5.0F, -3.0F, 3, 5, 3, -0.01F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 5.7F, -1.8F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3491F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 26, 63, -2.0F, -0.0421F, 0.0059F, 3, 5, 3, -0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 4.4579F, 1.1809F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6545F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 31, -2.0F, -0.6495F, -0.8711F, 3, 3, 2, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.2005F, 0.4539F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1309F, 0.0F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 17, 47, -2.0F, 0.0F, -3.325F, 3, 1, 4, -0.01F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-4.4F, -0.5F, 2.35F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 60, -1.0F, -0.25F, -2.0F, 3, 6, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 5.75F, 2.0F);
        this.rightLeg.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.4363F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 14, 63, -1.0F, -5.0F, -3.0F, 3, 5, 3, -0.01F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 5.7F, -1.8F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3491F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 26, 63, -1.0F, -0.0421F, 0.0059F, 3, 5, 3, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 4.4579F, 1.1809F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6545F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 31, -1.0F, -0.6495F, -0.8711F, 3, 3, 2, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.2005F, 0.4539F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1309F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 17, 47, -1.0F, 0.0F, -3.325F, 3, 1, 4, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 20, 53, -3.0F, -0.75F, -1.0F, 6, 4, 6, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.1745F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 31, 0, -2.5F, -1.65F, -1.2F, 5, 1, 6, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 48, 58, 0.5F, -2.15F, 0.8F, 1, 1, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 3, 0.5F, -2.15F, 2.8F, 1, 1, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 47, 3, -1.5F, -2.15F, 2.8F, 1, 1, 1, 0.0F, false));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 48, 58, -1.5F, -2.15F, 0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(3.0F, -0.75F, 2.5F);
        this.tail1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, 0.0F, -0.6981F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 4, 50, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, true));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 45, 26, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 5.0F, -17.0F);
        this.tail1.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1396F, -0.3054F, 0.3054F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 0, 7.0F, -7.15F, 17.5F, 3, 0, 2, 0.0F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 29, 2, 6.5F, -7.4F, 15.0F, 3, 0, 2, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 5.0F, -17.0F);
        this.tail1.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.1396F, 0.3054F, -0.3054F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 29, 0, -10.0F, -7.15F, 17.5F, 3, 0, 2, 0.0F, false));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 29, 2, -9.5F, -7.4F, 15.0F, 3, 0, 2, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-3.0F, -0.75F, 2.5F);
        this.tail1.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.6981F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 45, 26, -0.5F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 4, 50, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0262F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 47, -2.0F, -1.0F, -0.75F, 4, 3, 9, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 50, -0.5F, -1.35F, -0.75F, 0, 1, 9, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 50, 0.5F, -1.35F, -0.75F, 0, 1, 9, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(2.0F, -0.75F, 4.0F);
        this.tail2.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, 0.7854F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 42, 21, 0.0F, -0.6F, -4.75F, 0, 1, 9, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.0F, -0.75F, 4.0F);
        this.tail2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.7854F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 42, 21, 0.0F, -0.6F, -4.75F, 0, 1, 9, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 4.0F, -22.0F);
        this.tail2.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1396F, -0.3054F, 0.3054F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 3, 0, 9.0F, -7.3F, 25.0F, 2, 0, 2, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 5, 7.75F, -7.15F, 22.5F, 3, 0, 2, 0.0F, true));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 7, 7.5F, -6.95F, 20.0F, 3, 0, 2, 0.0F, true));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 4.0F, -22.0F);
        this.tail2.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.1396F, 0.3054F, -0.3054F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 3, 0, -11.0F, -7.3F, 25.0F, 2, 0, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 5, -10.75F, -7.15F, 22.5F, 3, 0, 2, 0.0F, false));
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 7, -10.5F, -6.95F, 20.0F, 3, 0, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1484F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 53, -1.0F, -0.5F, -0.75F, 2, 2, 9, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(1.0F, 0.5F, 2.0F);
        this.tail3.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, 0.0F, 0.3491F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 17, 0.0F, 0.0F, -1.75F, 1, 0, 8, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-1.0F, 0.5F, 2.0F);
        this.tail3.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.3491F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 17, -1.0F, 0.0F, -1.75F, 1, 0, 8, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.1047F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 56, 32, -0.5F, -0.5F, -0.5F, 1, 1, 9, 0.0F, false));
        this.Tail4.cubeList.add(new ModelBox(Tail4, 33, 73, -1.0F, 0.0F, -0.5F, 2, 0, 9, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.chest.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.rightArm.setScale(0,0,0);
        this.leftArm.setScale(0,0,0);
        this.rightArm.scaleChildren = true;
        this.leftArm.scaleChildren = true;
        this.chest.offsetY = 0.0F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.05F;
        this.chest.render(0.01F);
        this.rightArm.setScale(1,1,1);
        this.leftArm.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.0F, 0.0F, -0.05F);
        this.setRotateAngle(body, 0.0F, -0.05F, -0.025F);
        this.setRotateAngle(chest, 0.0F, -0.1F, -0.05F);
        this.setRotateAngle(neck1, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(neck2, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(head, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.1F, 0.4F, 0.0F);
        this.setRotateAngle(tail3, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.3F, 0.3F, 0.0F);
        this.setRotateAngle(leftArm, 0.5F, 0.3F, -0.2F);
        this.setRotateAngle(leftArm2, -1.2F, 0.1F, 0.0F);
        this.setRotateAngle(leftArm3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm4, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.3F, -0.2F, 0.3F);
        this.setRotateAngle(rightArm2, -1.0F, -0.1F, 0.0F);
        this.setRotateAngle(rightArm3, 0.7F, -0.05F, -0.1F);
        this.setRotateAngle(rightArm4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.2F, -0.3F, -0.1F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.15F);
        this.setRotateAngle(rightLeg, 0.0F, 0.1F, 0.3F);
        this.setRotateAngle(rightLeg2, 0.55F, 0.1F, -0.3F);
        this.hips.offsetZ = -0.05F;
        this.hips.offsetY = -0.12F;
        this.hips.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraMymoorapelta entityYuxi = (EntityPrehistoricFloraMymoorapelta) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head};
        entityYuxi.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityYuxi.getAnimation() == entityYuxi.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityYuxi.isReallyInWater()) {

                if (f3 == 0.0F || !entityYuxi.getIsMoving()) {
                    if (entityYuxi.getAnimation() != entityYuxi.EAT_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.DRINK_ANIMATION
                        && entityYuxi.getAnimation() != entityYuxi.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityYuxi.getIsFast()) { //Running


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

        EntityPrehistoricFloraMymoorapelta ee = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            } else {
                //Swimming pose:
                if (!ee.getIsMoving()) { //static in water
                    //
                } else {
                    //moving in water
                    //
                }
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The hiding and unhiding anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 29;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 6) / 7) * (3-(5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 13) / 5) * (0-(3)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-6-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = -6 + (((tickAnim - 18) / 6) * (5-(-6)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 5) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 3 + (((tickAnim - 6) / 7) * (0-(3)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 7 + (((tickAnim - 18) / 6) * (-6-(7)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = -6 + (((tickAnim - 24) / 5) * (0-(-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 6) / 7) * (-11-(-11)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 13) / 5) * (-14-(-11)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-7-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -14 + (((tickAnim - 18) / 6) * (0-(-14)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = -7 + (((tickAnim - 18) / 6) * (7-(-7)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 7 + (((tickAnim - 24) / 5) * (0-(7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 8 + (((tickAnim - 6) / 7) * (15-(8)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 13) / 5) * (6-(15)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 6 + (((tickAnim - 18) / 7) * (0-(6)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 11) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 13) / 2) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 17) / 1) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);
    }

    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 33) / 84) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 33) / 84) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 84) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (39-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 29) / 88) * (39-(39)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 39 + (((tickAnim - 117) / 43) * (0-(39)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 12 + (((tickAnim - 117) / 43) * (0-(12)));
            yy = 0.42902 + (((tickAnim - 117) / 43) * (0-(0.42902)));
            zz = -0.33008 + (((tickAnim - 117) / 43) * (0-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.7252-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.18705-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.08143-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.7252 + (((tickAnim - 8) / 3) * (27.63512-(17.7252)));
            yy = 6.18705 + (((tickAnim - 8) / 3) * (3.71223-(6.18705)));
            zz = -5.08143 + (((tickAnim - 8) / 3) * (-3.04886-(-5.08143)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.63512 + (((tickAnim - 11) / 3) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 11) / 3) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 11) / 3) * (0-(-3.04886)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 14) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 16) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 18) / 99) * (31-(31)));
            yy = 0 + (((tickAnim - 18) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 99) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 31 + (((tickAnim - 117) / 16) * (25-(31)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 25 + (((tickAnim - 133) / 6) * (13.16794-(25)));
            yy = 0 + (((tickAnim - 133) / 6) * (7.21884-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (-6.93856-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 13.16794 + (((tickAnim - 139) / 5) * (3.73551-(13.16794)));
            yy = 7.21884 + (((tickAnim - 139) / 5) * (2.97798-(7.21884)));
            zz = -6.93856 + (((tickAnim - 139) / 5) * (-4.01823-(-6.93856)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 3.73551 + (((tickAnim - 144) / 16) * (0-(3.73551)));
            yy = 2.97798 + (((tickAnim - 144) / 16) * (0-(2.97798)));
            zz = -4.01823 + (((tickAnim - 144) / 16) * (0-(-4.01823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (-0.2-(-0.2)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0.6-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (0.5-(-0.2)));
            zz = 0.6 + (((tickAnim - 8) / 6) * (0.3-(0.6)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 14) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 17) * (0.23-(0.4)));
            zz = 0.3 + (((tickAnim - 16) / 17) * (0.33-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.23 + (((tickAnim - 33) / 84) * (0.23-(0.23)));
            zz = 0.33 + (((tickAnim - 33) / 84) * (0.33-(0.33)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.23 + (((tickAnim - 117) / 16) * (0.175-(0.23)));
            zz = 0.33 + (((tickAnim - 117) / 16) * (0.5-(0.33)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 133) / 3) * (0.83-(0.175)));
            zz = 0.5 + (((tickAnim - 133) / 3) * (0.76-(0.5)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = 0.83 + (((tickAnim - 136) / 8) * (-0.115-(0.83)));
            zz = 0.76 + (((tickAnim - 136) / 8) * (0.53-(0.76)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = -0.115 + (((tickAnim - 144) / 2) * (0.06-(-0.115)));
            zz = 0.53 + (((tickAnim - 144) / 2) * (0.48-(0.53)));
        }
        else if (tickAnim >= 146 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 146) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 146) / 2) * (0.055-(0.06)));
            zz = 0.48 + (((tickAnim - 146) / 2) * (0.44-(0.48)));
        }
        else if (tickAnim >= 148 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 148) / 1) * (0-(0)));
            yy = 0.055 + (((tickAnim - 148) / 1) * (-0.07-(0.055)));
            zz = 0.44 + (((tickAnim - 148) / 1) * (0.39-(0.44)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 149) / 2) * (-0.05-(-0.07)));
            zz = 0.39 + (((tickAnim - 149) / 2) * (0.35-(0.39)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = -0.05 + (((tickAnim - 151) / 9) * (-0.1-(-0.05)));
            zz = 0.35 + (((tickAnim - 151) / 9) * (0.1-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -33 + (((tickAnim - 3) / 8) * (3-(-33)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-17-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17 + (((tickAnim - 18) / 2) * (-19.99933-(-17)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.15205-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.08957-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -19.99933 + (((tickAnim - 20) / 11) * (-16.99618-(-19.99933)));
            yy = -0.15205 + (((tickAnim - 20) / 11) * (-0.86162-(-0.15205)));
            zz = -0.08957 + (((tickAnim - 20) / 11) * (-0.50758-(-0.08957)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -16.99618 + (((tickAnim - 31) / 86) * (-16.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 31) / 86) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 31) / 86) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -16.99618 + (((tickAnim - 117) / 16) * (-2.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 117) / 16) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 117) / 16) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -2.99618 + (((tickAnim - 133) / 6) * (-50.69775-(-2.99618)));
            yy = -0.86162 + (((tickAnim - 133) / 6) * (-0.58132-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 133) / 6) * (-0.34245-(-0.50758)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = -50.69775 + (((tickAnim - 139) / 5) * (-14.70156-(-50.69775)));
            yy = -0.58132 + (((tickAnim - 139) / 5) * (2.18123-(-0.58132)));
            zz = -0.34245 + (((tickAnim - 139) / 5) * (1.42364-(-0.34245)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = -14.70156 + (((tickAnim - 144) / 16) * (0-(-14.70156)));
            yy = 2.18123 + (((tickAnim - 144) / 16) * (0-(2.18123)));
            zz = 1.42364 + (((tickAnim - 144) / 16) * (0-(1.42364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.46-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.46 + (((tickAnim - 3) / 5) * (0.12-(-0.46)));
            zz = 0.12 + (((tickAnim - 3) / 5) * (0.35-(0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.12 + (((tickAnim - 8) / 3) * (0.2-(0.12)));
            zz = 0.35 + (((tickAnim - 8) / 3) * (0.2-(0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 2) * (-0.16-(0.2)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (-0.85-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.16 + (((tickAnim - 13) / 3) * (-0.09-(-0.16)));
            zz = -0.85 + (((tickAnim - 13) / 3) * (-0.79-(-0.85)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.09 + (((tickAnim - 16) / 2) * (0.01-(-0.09)));
            zz = -0.79 + (((tickAnim - 16) / 2) * (-0.41-(-0.79)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 18) / 2) * (0.01-(0.01)));
            zz = -0.41 + (((tickAnim - 18) / 2) * (-0.31-(-0.41)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 20) / 3) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 20) / 3) * (-0.31-(-0.31)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 23) / 5) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 23) / 5) * (-0.11-(-0.31)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 28) / 3) * (0.01-(0.01)));
            zz = -0.11 + (((tickAnim - 28) / 3) * (-0.01-(-0.11)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0.01 + (((tickAnim - 31) / 86) * (0.01-(0.01)));
            zz = -0.01 + (((tickAnim - 31) / 86) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.01 + (((tickAnim - 117) / 16) * (-0.39-(0.01)));
            zz = -0.01 + (((tickAnim - 117) / 16) * (-0.21-(-0.01)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.39 + (((tickAnim - 133) / 3) * (0.04-(-0.39)));
            zz = -0.21 + (((tickAnim - 133) / 3) * (0.14-(-0.21)));
        }
        else if (tickAnim >= 136 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 136) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 136) / 3) * (0.15-(0.04)));
            zz = 0.14 + (((tickAnim - 136) / 3) * (0.14-(0.14)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 139) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 139) / 5) * (-0.23-(0.15)));
            zz = 0.14 + (((tickAnim - 139) / 5) * (-0.09-(0.14)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 144) / 16) * (0-(0)));
            yy = -0.23 + (((tickAnim - 144) / 16) * (-0.2-(-0.23)));
            zz = -0.09 + (((tickAnim - 144) / 16) * (0-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55556-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-15-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.55556 + (((tickAnim - 3) / 5) * (-1-(-0.55556)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (-24.97532-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.12972-(0)));
            zz = -1 + (((tickAnim - 8) / 3) * (-0.67698-(-1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -24.97532 + (((tickAnim - 11) / 2) * (-37-(-24.97532)));
            yy = -0.12972 + (((tickAnim - 11) / 2) * (0-(-0.12972)));
            zz = -0.67698 + (((tickAnim - 11) / 2) * (0-(-0.67698)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 13) / 3) * (-22-(-37)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 16) / 2) * (-17.99383-(-22)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.74485-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.86146-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -17.99383 + (((tickAnim - 18) / 11) * (-13.92254-(-17.99383)));
            yy = -0.74485 + (((tickAnim - 18) / 11) * (-0.73066-(-0.74485)));
            zz = 0.86146 + (((tickAnim - 18) / 11) * (1.32282-(0.86146)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -13.92254 + (((tickAnim - 29) / 88) * (-10.98057-(-13.92254)));
            yy = -0.73066 + (((tickAnim - 29) / 88) * (-0.77517-(-0.73066)));
            zz = 1.32282 + (((tickAnim - 29) / 88) * (-0.13816-(1.32282)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -10.98057 + (((tickAnim - 117) / 16) * (-19.93444-(-10.98057)));
            yy = -0.77517 + (((tickAnim - 117) / 16) * (-1.58427-(-0.77517)));
            zz = -0.13816 + (((tickAnim - 117) / 16) * (-1.05315-(-0.13816)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -19.93444 + (((tickAnim - 133) / 6) * (60.42621-(-19.93444)));
            yy = -1.58427 + (((tickAnim - 133) / 6) * (-1.23771-(-1.58427)));
            zz = -1.05315 + (((tickAnim - 133) / 6) * (-0.82278-(-1.05315)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 60.42621 + (((tickAnim - 139) / 5) * (10.8853-(60.42621)));
            yy = -1.23771 + (((tickAnim - 139) / 5) * (-6.41695-(-1.23771)));
            zz = -0.82278 + (((tickAnim - 139) / 5) * (2.69485-(-0.82278)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 10.8853 + (((tickAnim - 144) / 16) * (0-(10.8853)));
            yy = -6.41695 + (((tickAnim - 144) / 16) * (0-(-6.41695)));
            zz = 2.69485 + (((tickAnim - 144) / 16) * (0-(2.69485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.33-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 16) / 2) * (0.2-(0.33)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 18) / 2) * (0.1-(0.2)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 6) * (0.52-(0.2)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.52 + (((tickAnim - 29) / 88) * (0.5-(0.52)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 16) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 133) / 11) * (0.46-(0.3)));
            zz = 0 + (((tickAnim - 133) / 11) * (-0.08-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 144) / 2) * (0.23-(0.46)));
            zz = -0.08 + (((tickAnim - 144) / 2) * (-0.09-(-0.08)));
        }
        else if (tickAnim >= 146 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 146) / 14) * (0-(0)));
            yy = 0.23 + (((tickAnim - 146) / 14) * (0.2-(0.23)));
            zz = -0.09 + (((tickAnim - 146) / 14) * (-0.2-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 13) * (0-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 27 + (((tickAnim - 13) / 4) * (40-(27)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 40 + (((tickAnim - 17) / 10) * (-38.12058-(40)));
            yy = 0 + (((tickAnim - 17) / 10) * (-4.16037-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-1.63998-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -38.12058 + (((tickAnim - 27) / 6) * (-47.02019-(-38.12058)));
            yy = -4.16037 + (((tickAnim - 27) / 6) * (-8.57463-(-4.16037)));
            zz = -1.63998 + (((tickAnim - 27) / 6) * (-2.9193-(-1.63998)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -47.02019 + (((tickAnim - 33) / 84) * (-47.02019-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 33) / 84) * (-8.57463-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 33) / 84) * (-2.9193-(-2.9193)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = -47.02019 + (((tickAnim - 117) / 19) * (0-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 117) / 19) * (0-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 117) / 19) * (0-(-2.9193)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (-3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 17) * (0.6-(0.2)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 6) * (1.85-(0.6)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 23) / 4) * (1.25-(1.85)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 1.25 + (((tickAnim - 27) / 6) * (0.75-(1.25)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.75 + (((tickAnim - 33) / 84) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 117) / 19) * (0-(0)));
            yy = 0.75 + (((tickAnim - 117) / 19) * (-0.45-(0.75)));
            zz = 0 + (((tickAnim - 117) / 19) * (-0.1-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 136) / 2) * (-0.55-(-0.45)));
            zz = -0.1 + (((tickAnim - 136) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 138) / 2) * (-0.355-(-0.55)));
            zz = -0.1 + (((tickAnim - 138) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 140 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 140) / 2) * (0-(0)));
            yy = -0.355 + (((tickAnim - 140) / 2) * (-0.33-(-0.355)));
            zz = -0.1 + (((tickAnim - 140) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 142) / 1) * (0-(0)));
            yy = -0.33 + (((tickAnim - 142) / 1) * (-0.41-(-0.33)));
            zz = -0.1 + (((tickAnim - 142) / 1) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 143) / 2) * (0-(0)));
            yy = -0.41 + (((tickAnim - 143) / 2) * (-0.43-(-0.41)));
            zz = -0.1 + (((tickAnim - 143) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = -0.43 + (((tickAnim - 145) / 15) * (-0.175-(-0.43)));
            zz = -0.1 + (((tickAnim - 145) / 15) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 8) / 5) * (-7-(-3.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 13) / 7) * (14-(-7)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14 + (((tickAnim - 20) / 5) * (13-(14)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 13 + (((tickAnim - 25) / 7) * (24-(13)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 24 + (((tickAnim - 32) / 85) * (24-(24)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 24 + (((tickAnim - 117) / 12) * (34.42-(24)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = 34.42 + (((tickAnim - 129) / 7) * (-3-(34.42)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = -3 + (((tickAnim - 136) / 24) * (0-(-3)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 8) * (0.5-(0.2)));
            zz = -0.3 + (((tickAnim - 20) / 8) * (0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 28) / 4) * (0.5-(0.5)));
            zz = 0.3 + (((tickAnim - 28) / 4) * (0.8-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 32) / 1) * (0.5-(0.5)));
            zz = 0.8 + (((tickAnim - 32) / 1) * (0.9-(0.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 84) * (0.5-(0.5)));
            zz = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 8) * (0.64-(0.5)));
            zz = 0.9 + (((tickAnim - 117) / 8) * (0.65-(0.9)));
        }
        else if (tickAnim >= 125 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 125) / 11) * (0-(0)));
            yy = 0.64 + (((tickAnim - 125) / 11) * (1.25-(0.64)));
            zz = 0.65 + (((tickAnim - 125) / 11) * (-0.4-(0.65)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 1.25 + (((tickAnim - 136) / 24) * (0-(1.25)));
            zz = -0.4 + (((tickAnim - 136) / 24) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 11 + (((tickAnim - 4) / 9) * (2-(11)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 13) / 5) * (30.24-(2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 30.24 + (((tickAnim - 18) / 5) * (17.57-(30.24)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 17.57 + (((tickAnim - 23) / 4) * (10-(17.57)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 27) / 5) * (35.00575-(10)));
            yy = 0 + (((tickAnim - 27) / 5) * (1.10913-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (1.72251-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 35.00575 + (((tickAnim - 32) / 85) * (35.00575-(35.00575)));
            yy = 1.10913 + (((tickAnim - 32) / 85) * (1.10913-(1.10913)));
            zz = 1.72251 + (((tickAnim - 32) / 85) * (1.72251-(1.72251)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 35.00575 + (((tickAnim - 117) / 43) * (0-(35.00575)));
            yy = 1.10913 + (((tickAnim - 117) / 43) * (0-(1.10913)));
            zz = 1.72251 + (((tickAnim - 117) / 43) * (0-(1.72251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.38-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.38 + (((tickAnim - 4) / 4) * (-0.2-(-0.38)));
            zz = 0.14 + (((tickAnim - 4) / 4) * (0.1-(0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (-0.3-(-0.2)));
            zz = 0.1 + (((tickAnim - 8) / 5) * (-0.2-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 14) * (0.7-(-0.3)));
            zz = -0.2 + (((tickAnim - 13) / 14) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 27) / 5) * (1.1-(0.7)));
            zz = -0.1 + (((tickAnim - 27) / 5) * (0.2-(-0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 1.1 + (((tickAnim - 32) / 85) * (0.8-(1.1)));
            zz = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.8 + (((tickAnim - 117) / 13) * (1.03-(0.8)));
            zz = 0.2 + (((tickAnim - 117) / 13) * (0.33-(0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = 1.03 + (((tickAnim - 130) / 6) * (0.7-(1.03)));
            zz = 0.33 + (((tickAnim - 130) / 6) * (0.4-(0.33)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0.7 + (((tickAnim - 136) / 24) * (0-(0.7)));
            zz = 0.4 + (((tickAnim - 136) / 24) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2 + (((tickAnim - 0) / 4) * (-15.75-(2)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15.75 + (((tickAnim - 4) / 5) * (-20.61-(-15.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.61 + (((tickAnim - 9) / 4) * (-24.99809-(-20.61)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.22494-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.97438-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -24.99809 + (((tickAnim - 13) / 7) * (16-(-24.99809)));
            yy = -0.22494 + (((tickAnim - 13) / 7) * (0-(-0.22494)));
            zz = -0.97438 + (((tickAnim - 13) / 7) * (0-(-0.97438)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16 + (((tickAnim - 20) / 3) * (-16-(16)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16 + (((tickAnim - 23) / 2) * (-18.68-(-16)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -18.68 + (((tickAnim - 25) / 2) * (-16-(-18.68)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 27) / 1) * (-7-(-16)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 117) {
            xx = -7 + (((tickAnim - 28) / 89) * (-7-(-7)));
            yy = 0 + (((tickAnim - 28) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 89) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -7 + (((tickAnim - 117) / 8) * (-12.61-(-7)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 129) {
            xx = -12.61 + (((tickAnim - 125) / 4) * (-17.28-(-12.61)));
            yy = 0 + (((tickAnim - 125) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 4) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -17.28 + (((tickAnim - 129) / 7) * (-16.03-(-17.28)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -16.03 + (((tickAnim - 136) / 4) * (-12-(-16.03)));
            yy = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -12 + (((tickAnim - 140) / 20) * (1-(-12)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 9) / 4) * (-0.24-(-0.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            yy = -0.24 + (((tickAnim - 13) / 19) * (0.2-(-0.24)));
            zz = 0 + (((tickAnim - 13) / 19) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 13) * (-0.04-(0.2)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = -0.04 + (((tickAnim - 130) / 6) * (0.44-(-0.04)));
            zz = 0 + (((tickAnim - 130) / 6) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            yy = 0.44 + (((tickAnim - 136) / 4) * (0.25-(0.44)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.25 + (((tickAnim - 140) / 20) * (0.1-(0.25)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29 + (((tickAnim - 0) / 5) * (-21-(29)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -21 + (((tickAnim - 5) / 4) * (-38-(-21)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -38 + (((tickAnim - 9) / 5) * (-62-(-38)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -62 + (((tickAnim - 14) / 9) * (-61.95651-(-62)));
            yy = 0 + (((tickAnim - 14) / 9) * (5.9414-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.83804-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = -61.95651 + (((tickAnim - 23) / 94) * (-61.87822-(-61.95651)));
            yy = 5.9414 + (((tickAnim - 23) / 94) * (9.9017-(5.9414)));
            zz = 0.83804 + (((tickAnim - 23) / 94) * (1.40575-(0.83804)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -61.87822 + (((tickAnim - 117) / 21) * (-41.87822-(-61.87822)));
            yy = 9.9017 + (((tickAnim - 117) / 21) * (9.9017-(9.9017)));
            zz = 1.40575 + (((tickAnim - 117) / 21) * (1.40575-(1.40575)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = -41.87822 + (((tickAnim - 138) / 11) * (0-(-41.87822)));
            yy = 9.9017 + (((tickAnim - 138) / 11) * (0-(9.9017)));
            zz = 1.40575 + (((tickAnim - 138) / 11) * (0-(1.40575)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.4-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 14) / 1) * (-0.455-(-0.275)));
            zz = 0.4 + (((tickAnim - 14) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -0.455 + (((tickAnim - 15) / 1) * (-0.445-(-0.455)));
            zz = 0.4 + (((tickAnim - 15) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 16) / 1) * (-0.49-(-0.445)));
            zz = 0.4 + (((tickAnim - 16) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.49 + (((tickAnim - 17) / 1) * (-0.33-(-0.49)));
            zz = 0.4 + (((tickAnim - 17) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.33 + (((tickAnim - 18) / 15) * (0.9-(-0.33)));
            zz = 0.4 + (((tickAnim - 18) / 15) * (0.4-(0.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
            zz = 0.4 + (((tickAnim - 33) / 84) * (0.4-(0.4)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.9 + (((tickAnim - 117) / 16) * (-0.225-(0.9)));
            zz = 0.4 + (((tickAnim - 117) / 16) * (-0.22-(0.4)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 133) / 3) * (-0.36-(-0.225)));
            zz = -0.22 + (((tickAnim - 133) / 3) * (-0.31-(-0.22)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = -0.36 + (((tickAnim - 136) / 8) * (0.85-(-0.36)));
            zz = -0.31 + (((tickAnim - 136) / 8) * (-0.2-(-0.31)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 144) / 5) * (-0.95-(0.85)));
            zz = -0.2 + (((tickAnim - 144) / 5) * (0-(-0.2)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.95 + (((tickAnim - 149) / 2) * (-0.975-(-0.95)));
            zz = 0 + (((tickAnim - 149) / 2) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 151) / 2) * (0-(0)));
            yy = -0.975 + (((tickAnim - 151) / 2) * (-0.77-(-0.975)));
            zz = 0 + (((tickAnim - 151) / 2) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 153) / 1) * (0-(0)));
            yy = -0.77 + (((tickAnim - 153) / 1) * (-0.715-(-0.77)));
            zz = 0 + (((tickAnim - 153) / 1) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 154) / 2) * (0-(0)));
            yy = -0.715 + (((tickAnim - 154) / 2) * (-0.36-(-0.715)));
            zz = 0 + (((tickAnim - 154) / 2) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 156) / 4) * (0-(0)));
            yy = -0.36 + (((tickAnim - 156) / 4) * (0-(-0.36)));
            zz = 0 + (((tickAnim - 156) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 5) / 4) * (22-(28)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 22 + (((tickAnim - 9) / 5) * (39-(22)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 14) / 103) * (39-(39)));
            yy = 0 + (((tickAnim - 14) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 103) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 39 + (((tickAnim - 117) / 21) * (28.13-(39)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 28.13 + (((tickAnim - 138) / 6) * (35.8-(28.13)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 35.8 + (((tickAnim - 144) / 5) * (3-(35.8)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 149) / 11) * (0-(3)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 1.8 + (((tickAnim - 13) / 0) * (1.94-(1.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.94 + (((tickAnim - 13) / 1) * (2.16-(1.94)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 2.16 + (((tickAnim - 14) / 2) * (1.98-(2.16)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 1.98 + (((tickAnim - 16) / 2) * (2.07-(1.98)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 2.07 + (((tickAnim - 18) / 5) * (2.1-(2.07)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 2.1 + (((tickAnim - 23) / 8) * (2.1-(2.1)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 2.1 + (((tickAnim - 31) / 86) * (2.1-(2.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0.15-(0)));
            zz = 2.1 + (((tickAnim - 117) / 21) * (1.81-(2.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 0.15 + (((tickAnim - 138) / 11) * (0.2-(0.15)));
            zz = 1.81 + (((tickAnim - 138) / 11) * (-0.21-(1.81)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 149) / 11) * (0-(0.2)));
            zz = -0.21 + (((tickAnim - 149) / 11) * (0-(-0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37 + (((tickAnim - 0) / 5) * (-1-(37)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1 + (((tickAnim - 5) / 4) * (-2-(-1)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -2 + (((tickAnim - 9) / 5) * (33-(-2)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 33 + (((tickAnim - 14) / 9) * (34-(33)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = 34 + (((tickAnim - 23) / 94) * (34-(34)));
            yy = 0 + (((tickAnim - 23) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 94) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 34 + (((tickAnim - 117) / 21) * (26-(34)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 26 + (((tickAnim - 138) / 6) * (-5.42-(26)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = -5.42 + (((tickAnim - 144) / 5) * (8-(-5.42)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 8 + (((tickAnim - 149) / 11) * (0-(8)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.18 + (((tickAnim - 9) / 5) * (0.4-(0.18)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.4 + (((tickAnim - 14) / 9) * (0.9-(0.4)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 23) / 8) * (1.1-(0.9)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 1.1 + (((tickAnim - 31) / 86) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 1.1 + (((tickAnim - 117) / 21) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 1.1 + (((tickAnim - 138) / 11) * (0.61-(1.1)));
            zz = 0 + (((tickAnim - 138) / 11) * (0.5-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.61 + (((tickAnim - 149) / 11) * (0-(0.61)));
            zz = 0.5 + (((tickAnim - 149) / 11) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 0) / 13) * (-9-(10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 13) / 10) * (-9.43-(-9)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -9.43 + (((tickAnim - 23) / 9) * (-6-(-9.43)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 32) / 85) * (-8-(-6)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -8 + (((tickAnim - 117) / 21) * (-9-(-8)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -9 + (((tickAnim - 138) / 5) * (4.1-(-9)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 4.1 + (((tickAnim - 143) / 6) * (-14.55-(4.1)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = -14.55 + (((tickAnim - 149) / 4) * (-6.25-(-14.55)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -6.25 + (((tickAnim - 153) / 7) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.41-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 3) / 20) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 20) * (0.2-(0.41)));
            zz = 0 + (((tickAnim - 3) / 20) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 21) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 138) / 22) * (0-(0)));
            yy = 0.2 + (((tickAnim - 138) / 22) * (0-(0.2)));
            zz = 0 + (((tickAnim - 138) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 33) * (-7.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -7.25 + (((tickAnim - 33) / 84) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -7.25 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-7.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -0.4 + (((tickAnim - 117) / 43) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3 + (((tickAnim - 0) / 33) * (3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 33) / 84) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3-(3)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 0) / 117) * (5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 5.5 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(5.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2 + (((tickAnim - 0) / 117) * (-0.75-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -0.75 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2-(-0.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 10) / 3) * (-31.34436-(-40)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.7498-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.25841-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.34436 + (((tickAnim - 13) / 5) * (-5.26625-(-31.34436)));
            yy = 2.7498 + (((tickAnim - 13) / 5) * (-0.57627-(2.7498)));
            zz = -2.25841 + (((tickAnim - 13) / 5) * (-7.07087-(-2.25841)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -5.26625 + (((tickAnim - 18) / 3) * (27.63512-(-5.26625)));
            yy = -0.57627 + (((tickAnim - 18) / 3) * (3.71223-(-0.57627)));
            zz = -7.07087 + (((tickAnim - 18) / 3) * (-3.04886-(-7.07087)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 27.63512 + (((tickAnim - 21) / 4) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 21) / 4) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 21) / 4) * (0-(-3.04886)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 25) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 29 + (((tickAnim - 27) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 29) / 88) * (32.0968-(31)));
            yy = 0 + (((tickAnim - 29) / 88) * (2.59146-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (4.27748-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 32.0968 + (((tickAnim - 117) / 6) * (28.19418-(32.0968)));
            yy = 2.59146 + (((tickAnim - 117) / 6) * (-3.79706-(2.59146)));
            zz = 4.27748 + (((tickAnim - 117) / 6) * (5.91482-(4.27748)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 28.19418 + (((tickAnim - 123) / 5) * (3.06208-(28.19418)));
            yy = -3.79706 + (((tickAnim - 123) / 5) * (1.55488-(-3.79706)));
            zz = 5.91482 + (((tickAnim - 123) / 5) * (2.56649-(5.91482)));
        }
        else if (tickAnim >= 128 && tickAnim < 145) {
            xx = 3.06208 + (((tickAnim - 128) / 17) * (0.10865-(3.06208)));
            yy = 1.55488 + (((tickAnim - 128) / 17) * (-9.69232-(1.55488)));
            zz = 2.56649 + (((tickAnim - 128) / 17) * (16.70221-(2.56649)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 0.10865 + (((tickAnim - 145) / 7) * (11.72274-(0.10865)));
            yy = -9.69232 + (((tickAnim - 145) / 7) * (-2.63698-(-9.69232)));
            zz = 16.70221 + (((tickAnim - 145) / 7) * (4.54415-(16.70221)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 11.72274 + (((tickAnim - 152) / 8) * (0-(11.72274)));
            yy = -2.63698 + (((tickAnim - 152) / 8) * (0-(-2.63698)));
            zz = 4.54415 + (((tickAnim - 152) / 8) * (0-(4.54415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 10) * (-1.2-(-0.4)));
            zz = 0.4 + (((tickAnim - 0) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 10) / 3) * (-0.695-(-1.2)));
            zz = 0.4 + (((tickAnim - 10) / 3) * (0.49-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.695 + (((tickAnim - 13) / 5) * (0.325-(-0.695)));
            zz = 0.49 + (((tickAnim - 13) / 5) * (0.66-(0.49)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 3) * (0.25-(0.325)));
            zz = 0.66 + (((tickAnim - 18) / 3) * (0.1-(0.66)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 21) / 4) * (0.5-(0.25)));
            zz = 0.1 + (((tickAnim - 21) / 4) * (0.3-(0.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 25) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 27) / 1) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 27) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 29) / 2) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 29) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 31) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 85) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 32) / 85) * (0.3-(0.3)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 117) / 11) * (1.44-(0.3)));
            zz = 0.3 + (((tickAnim - 117) / 11) * (1.58-(0.3)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 1.44 + (((tickAnim - 128) / 1) * (1.26-(1.44)));
            zz = 1.58 + (((tickAnim - 128) / 1) * (1.5-(1.58)));
        }
        else if (tickAnim >= 129 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 129) / 2) * (0-(0)));
            yy = 1.26 + (((tickAnim - 129) / 2) * (1.29-(1.26)));
            zz = 1.5 + (((tickAnim - 129) / 2) * (1.42-(1.5)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.29 + (((tickAnim - 131) / 2) * (1.01-(1.29)));
            zz = 1.42 + (((tickAnim - 131) / 2) * (1.34-(1.42)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 1.01 + (((tickAnim - 133) / 1) * (1.04-(1.01)));
            zz = 1.34 + (((tickAnim - 133) / 1) * (1.26-(1.34)));
        }
        else if (tickAnim >= 134 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 134) / 26) * (0-(0)));
            yy = 1.04 + (((tickAnim - 134) / 26) * (-0.1-(1.04)));
            zz = 1.26 + (((tickAnim - 134) / 26) * (0.1-(1.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.29-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.29 + (((tickAnim - 5) / 7) * (-17-(-1.29)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -17 + (((tickAnim - 12) / 5) * (-54.35-(-17)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -54.35 + (((tickAnim - 17) / 7) * (-17-(-54.35)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = -17 + (((tickAnim - 24) / 93) * (-12-(-17)));
            yy = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 93) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -12 + (((tickAnim - 117) / 7) * (-44.32428-(-12)));
            yy = 0 + (((tickAnim - 117) / 7) * (-2.63157-(0)));
            zz = 0 + (((tickAnim - 117) / 7) * (-0.89032-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = -44.32428 + (((tickAnim - 124) / 4) * (-28.78371-(-44.32428)));
            yy = -2.63157 + (((tickAnim - 124) / 4) * (-4.73683-(-2.63157)));
            zz = -0.89032 + (((tickAnim - 124) / 4) * (-1.60258-(-0.89032)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -28.78371 + (((tickAnim - 128) / 5) * (-23.54851-(-28.78371)));
            yy = -4.73683 + (((tickAnim - 128) / 5) * (-5.30773-(-4.73683)));
            zz = -1.60258 + (((tickAnim - 128) / 5) * (-3.04499-(-1.60258)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -23.54851 + (((tickAnim - 133) / 7) * (-16.66138-(-23.54851)));
            yy = -5.30773 + (((tickAnim - 133) / 7) * (-3.9808-(-5.30773)));
            zz = -3.04499 + (((tickAnim - 133) / 7) * (-2.28374-(-3.04499)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -16.66138 + (((tickAnim - 140) / 5) * (-12.39571-(-16.66138)));
            yy = -3.9808 + (((tickAnim - 140) / 5) * (-2.47897-(-3.9808)));
            zz = -2.28374 + (((tickAnim - 140) / 5) * (-11.1353-(-2.28374)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = -12.39571 + (((tickAnim - 145) / 7) * (-40.79337-(-12.39571)));
            yy = -2.47897 + (((tickAnim - 145) / 7) * (-0.0007-(-2.47897)));
            zz = -11.1353 + (((tickAnim - 145) / 7) * (-0.00314-(-11.1353)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -40.79337 + (((tickAnim - 152) / 8) * (0-(-40.79337)));
            yy = -0.0007 + (((tickAnim - 152) / 8) * (0-(-0.0007)));
            zz = -0.00314 + (((tickAnim - 152) / 8) * (0-(-0.00314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (-0.08-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = -0.08 + (((tickAnim - 17) / 7) * (0.01-(-0.08)));
            zz = 0.35 + (((tickAnim - 17) / 7) * (-0.01-(0.35)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            yy = 0.01 + (((tickAnim - 24) / 93) * (0.51-(0.01)));
            zz = -0.01 + (((tickAnim - 24) / 93) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            yy = 0.51 + (((tickAnim - 117) / 6) * (0.39-(0.51)));
            zz = -0.01 + (((tickAnim - 117) / 6) * (0.42-(-0.01)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            yy = 0.39 + (((tickAnim - 123) / 5) * (0.14-(0.39)));
            zz = 0.42 + (((tickAnim - 123) / 5) * (0.39-(0.42)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            yy = 0.14 + (((tickAnim - 128) / 32) * (-0.2-(0.14)));
            zz = 0.39 + (((tickAnim - 128) / 32) * (0-(0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (40.86-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40.86 + (((tickAnim - 8) / 5) * (53-(40.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 53 + (((tickAnim - 13) / 6) * (-10.33-(53)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.33 + (((tickAnim - 19) / 4) * (-19.33-(-10.33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.33 + (((tickAnim - 23) / 4) * (-17.33-(-19.33)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -17.33 + (((tickAnim - 27) / 2) * (-14.33-(-17.33)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -14.33 + (((tickAnim - 29) / 88) * (-17.29966-(-14.33)));
            yy = 0 + (((tickAnim - 29) / 88) * (-0.7019-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (-4.95061-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -17.29966 + (((tickAnim - 117) / 7) * (0-(-17.29966)));
            yy = -0.7019 + (((tickAnim - 117) / 7) * (0-(-0.7019)));
            zz = -4.95061 + (((tickAnim - 117) / 7) * (0-(-4.95061)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (28.85-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 28.85 + (((tickAnim - 128) / 2) * (25.2637-(28.85)));
            yy = 0 + (((tickAnim - 128) / 2) * (1.13352-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (-1.64787-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 25.2637 + (((tickAnim - 130) / 10) * (17.25654-(25.2637)));
            yy = 1.13352 + (((tickAnim - 130) / 10) * (8.95221-(1.13352)));
            zz = -1.64787 + (((tickAnim - 130) / 10) * (-4.49939-(-1.64787)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 17.25654 + (((tickAnim - 140) / 5) * (12-(17.25654)));
            yy = 8.95221 + (((tickAnim - 140) / 5) * (0-(8.95221)));
            zz = -4.49939 + (((tickAnim - 140) / 5) * (0-(-4.49939)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 12 + (((tickAnim - 145) / 7) * (46.69038-(12)));
            yy = 0 + (((tickAnim - 145) / 7) * (2.17904-(0)));
            zz = 0 + (((tickAnim - 145) / 7) * (-0.72817-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 46.69038 + (((tickAnim - 152) / 8) * (0-(46.69038)));
            yy = 2.17904 + (((tickAnim - 152) / 8) * (0-(2.17904)));
            zz = -0.72817 + (((tickAnim - 152) / 8) * (0-(-0.72817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 10) * (0.12-(0.3)));
            zz = 0 + (((tickAnim - 3) / 10) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.12 + (((tickAnim - 13) / 6) * (0.36-(0.12)));
            zz = -0.1 + (((tickAnim - 13) / 6) * (0-(-0.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 19) / 4) * (0.36-(0.36)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 23) / 4) * (0.26-(0.36)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.26 + (((tickAnim - 27) / 2) * (0.35-(0.26)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 88) * (0.425-(0.35)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 117) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 117) / 5) * (0.2-(0.425)));
            zz = 0 + (((tickAnim - 117) / 5) * (-0.01-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 122) / 6) * (-0.18-(0.2)));
            zz = -0.01 + (((tickAnim - 122) / 6) * (-0.05-(-0.01)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = -0.18 + (((tickAnim - 128) / 12) * (0.17-(-0.18)));
            zz = -0.05 + (((tickAnim - 128) / 12) * (-0.15-(-0.05)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 140) / 20) * (0.3-(0.17)));
            zz = -0.15 + (((tickAnim - 140) / 20) * (-0.3-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);
    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 56) {
            xx = 20 + (((tickAnim - 13) / 43) * (20-(20)));
            yy = 0 + (((tickAnim - 13) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 43) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 66) {
            xx = 20 + (((tickAnim - 56) / 10) * (0-(20)));
            yy = 0 + (((tickAnim - 56) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 10) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 10) / 10) * (20-(10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 20) / 20) * (17.5-(20)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 17.5 + (((tickAnim - 40) / 11) * (14-(17.5)));
            yy = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 67) {
            xx = 14 + (((tickAnim - 51) / 16) * (-15-(14)));
            yy = 0 + (((tickAnim - 51) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 16) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 70) {
            xx = -15 + (((tickAnim - 67) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 67) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 3) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 13) / 10) * (20-(25)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20 + (((tickAnim - 23) / 4) * (14.97-(20)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 14.97 + (((tickAnim - 27) / 16) * (0.47-(14.97)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 61) {
            xx = 0.47 + (((tickAnim - 43) / 18) * (-5-(0.47)));
            yy = 0 + (((tickAnim - 43) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 18) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = -5 + (((tickAnim - 61) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 9) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (12-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (-15.91527-(0)));
            yy = 12 + (((tickAnim - 10) / 9) * (19.291-(12)));
            zz = 0 + (((tickAnim - 10) / 9) * (-5.38152-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -15.91527 + (((tickAnim - 19) / 3) * (-15.91527-(-15.91527)));
            yy = 19.291 + (((tickAnim - 19) / 3) * (19.291-(19.291)));
            zz = -5.38152 + (((tickAnim - 19) / 3) * (-5.38152-(-5.38152)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = -15.91527 + (((tickAnim - 22) / 9) * (0-(-15.91527)));
            yy = 19.291 + (((tickAnim - 22) / 9) * (0-(19.291)));
            zz = -5.38152 + (((tickAnim - 22) / 9) * (0-(-5.38152)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 8) * (-14.5-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 41) / 15) * (0-(0)));
            yy = -14.5 + (((tickAnim - 41) / 15) * (-14.5-(-14.5)));
            zz = 0 + (((tickAnim - 41) / 15) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 56) / 3) * (19-(0)));
            yy = -14.5 + (((tickAnim - 56) / 3) * (0-(-14.5)));
            zz = 0 + (((tickAnim - 56) / 3) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 19 + (((tickAnim - 59) / 4) * (15-(19)));
            yy = 0 + (((tickAnim - 59) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 4) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 15 + (((tickAnim - 63) / 4) * (0-(15)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 2) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 69) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 69) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 3) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = 10 + (((tickAnim - 72) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 2) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 74) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 74) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 3) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 79) {
            xx = 10 + (((tickAnim - 77) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 77) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (25-(0)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 25 + (((tickAnim - 19) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 22) / 9) * (24.5-(0)));
            yy = 0 + (((tickAnim - 22) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 9) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 24.5 + (((tickAnim - 31) / 2) * (-0.37-(24.5)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -0.37 + (((tickAnim - 33) / 10) * (25.1-(-0.37)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 25.1 + (((tickAnim - 43) / 2) * (0-(25.1)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 45) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 13) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (15-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 63) {
            xx = 15 + (((tickAnim - 60) / 3) * (5-(15)));
            yy = 0 + (((tickAnim - 60) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 3) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 63) / 2) * (5-(5)));
            yy = 0 + (((tickAnim - 63) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 2) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 5 + (((tickAnim - 65) / 3) * (20-(5)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 20 + (((tickAnim - 68) / 2) * (5-(20)));
            yy = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 5 + (((tickAnim - 70) / 3) * (5-(5)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 75) {
            xx = 5 + (((tickAnim - 73) / 2) * (10-(5)));
            yy = 0 + (((tickAnim - 73) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 2) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 10 + (((tickAnim - 75) / 3) * (0-(10)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 78) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 56) {
            xx = -10 + (((tickAnim - 13) / 43) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 43) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 66) {
            xx = -10 + (((tickAnim - 56) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 56) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 10) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 56) {
            xx = -27.5 + (((tickAnim - 13) / 43) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 13) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 43) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 66) {
            xx = -27.5 + (((tickAnim - 56) / 10) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 56) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 10) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 55) {
            xx = 17.5 + (((tickAnim - 13) / 42) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 42) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 66) {
            xx = 17.5 + (((tickAnim - 55) / 11) * (0-(17.5)));
            yy = 0 + (((tickAnim - 55) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 11) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 7) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.175-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 6) / 7) * (-0.05-(0.1)));
            zz = 0.175 + (((tickAnim - 6) / 7) * (0.125-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 13) / 42) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 42) * (-0.05-(-0.05)));
            zz = 0.125 + (((tickAnim - 13) / 42) * (0.125-(0.125)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 55) / 5) * (0.1-(-0.05)));
            zz = 0.125 + (((tickAnim - 55) / 5) * (-0.025-(0.125)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 60) / 5) * (0-(0.1)));
            zz = -0.025 + (((tickAnim - 60) / 5) * (0-(-0.025)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 65) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 7) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 72) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 13 && tickAnim < 57) {
            xx = -0.75 + (((tickAnim - 13) / 44) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 13) / 44) * (0-(0)));
            yy = 0.175 + (((tickAnim - 13) / 44) * (0.175-(0.175)));
            zz = 0 + (((tickAnim - 13) / 44) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 57) / 9) * (0-(0)));
            yy = 0.175 + (((tickAnim - 57) / 9) * (0-(0.175)));
            zz = 0 + (((tickAnim - 57) / 9) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-22.04327-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.23143-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (6.73866-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 57) {
            xx = -22.04327 + (((tickAnim - 13) / 44) * (-22.04327-(-22.04327)));
            yy = 1.23143 + (((tickAnim - 13) / 44) * (1.23143-(1.23143)));
            zz = 6.73866 + (((tickAnim - 13) / 44) * (6.73866-(6.73866)));
        }
        else if (tickAnim >= 57 && tickAnim < 66) {
            xx = -22.04327 + (((tickAnim - 57) / 9) * (0-(-22.04327)));
            yy = 1.23143 + (((tickAnim - 57) / 9) * (0-(1.23143)));
            zz = 6.73866 + (((tickAnim - 57) / 9) * (0-(6.73866)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 8) / 5) * (45-(27.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 45 + (((tickAnim - 13) / 7) * (0-(45)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20 + (((tickAnim - 8) / 8) * (25-(20)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 8) / 8) * (5-(15)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 16) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 15 + (((tickAnim - 6) / 4) * (20-(15)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 10) / 3) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 5 + (((tickAnim - 10) / 36) * (5-(5)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 5 + (((tickAnim - 46) / 9) * (0-(5)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 46) {
            xx = 2 + (((tickAnim - 10) / 36) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 36) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 2 + (((tickAnim - 46) / 9) * (0-(2)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (24.74534-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.63039-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (12.71743-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 24.74534 + (((tickAnim - 21) / 12) * (27.74534-(24.74534)));
            yy = -2.63039 + (((tickAnim - 21) / 12) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 21) / 12) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 27.74534 + (((tickAnim - 33) / 13) * (24.74534-(27.74534)));
            yy = -2.63039 + (((tickAnim - 33) / 13) * (-2.63039-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 33) / 13) * (12.71743-(12.71743)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 24.74534 + (((tickAnim - 46) / 9) * (0-(24.74534)));
            yy = -2.63039 + (((tickAnim - 46) / 9) * (0-(-2.63039)));
            zz = 12.71743 + (((tickAnim - 46) / 9) * (0-(12.71743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 21) / 12) * (3-(0)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 8 + (((tickAnim - 21) / 12) * (8-(8)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 33) / 13) * (0-(3)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 8 + (((tickAnim - 33) / 13) * (8-(8)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 9) * (0-(0)));
            zz = 8 + (((tickAnim - 46) / 9) * (0-(8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.57594-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-11.96731-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (8.64235-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -1.57594 + (((tickAnim - 21) / 12) * (1.42406-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 21) / 12) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 21) / 12) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 1.42406 + (((tickAnim - 33) / 13) * (-1.57594-(1.42406)));
            yy = -11.96731 + (((tickAnim - 33) / 13) * (-11.96731-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 33) / 13) * (8.64235-(8.64235)));
        }
        else if (tickAnim >= 46 && tickAnim < 55) {
            xx = -1.57594 + (((tickAnim - 46) / 9) * (0-(-1.57594)));
            yy = -11.96731 + (((tickAnim - 46) / 9) * (0-(-11.96731)));
            zz = 8.64235 + (((tickAnim - 46) / 9) * (0-(8.64235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12 + (((tickAnim - 11) / 7) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 11) / 7) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.37738-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.86606 + (((tickAnim - 18) / 4) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 18) / 4) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 18) / 4) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.13394 + (((tickAnim - 22) / 5) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 22) / 5) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 22) / 5) * (0-(-1.37738)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 27) / 6) * (12.86606-(12)));
            yy = 0 + (((tickAnim - 27) / 6) * (15.51386-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (-1.37738-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 12.86606 + (((tickAnim - 33) / 5) * (-5.13394-(12.86606)));
            yy = 15.51386 + (((tickAnim - 33) / 5) * (15.51386-(15.51386)));
            zz = -1.37738 + (((tickAnim - 33) / 5) * (-1.37738-(-1.37738)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -5.13394 + (((tickAnim - 38) / 7) * (12-(-5.13394)));
            yy = 15.51386 + (((tickAnim - 38) / 7) * (0-(15.51386)));
            zz = -1.37738 + (((tickAnim - 38) / 7) * (0-(-1.37738)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 12 + (((tickAnim - 45) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 14) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0.1-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 8) * (0-(0.2)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0.1-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 45) / 10) * (0-(0.1)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 11) / 7) * (-51-(-10)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -51 + (((tickAnim - 18) / 4) * (-44-(-51)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -44 + (((tickAnim - 22) / 5) * (-10-(-44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 27) / 6) * (-51-(-10)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -51 + (((tickAnim - 33) / 5) * (-44-(-51)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -44 + (((tickAnim - 38) / 7) * (-10-(-44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -10 + (((tickAnim - 45) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 24) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 42) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -9 + (((tickAnim - 11) / 7) * (-1-(-9)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 18) / 4) * (44-(-1)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 44 + (((tickAnim - 22) / 5) * (-9-(44)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 27) / 6) * (-1-(-9)));
            yy = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -1 + (((tickAnim - 33) / 5) * (44-(-1)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 44 + (((tickAnim - 38) / 7) * (-9-(44)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 55) {
            xx = -9 + (((tickAnim - 45) / 10) * (0-(-9)));
            yy = 0 + (((tickAnim - 45) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            yy = 0.1 + (((tickAnim - 11) / 16) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 27) / 18) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 18) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 27) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 29) / 26) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 29) / 26) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 29) / 26) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 29) / 26) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 31) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2 + (((tickAnim - 0) / 31) * (-6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+30))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3 + (((tickAnim - 0) / 31) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+60))*3)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 31) / 86) * (-6-(-6)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -6 + (((tickAnim - 117) / 43) * (0-(-6)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (-1.6-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 13) / 18) * (0-(0)));
            yy = -1.6 + (((tickAnim - 13) / 18) * (-3.5-(-1.6)));
            zz = 0 + (((tickAnim - 13) / 18) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = -3.5 + (((tickAnim - 31) / 86) * (-3.5-(-3.5)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -3.5 + (((tickAnim - 117) / 43) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9 + (((tickAnim - 0) / 14) * (0.81612-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9)));
        }
        else if (tickAnim >= 14 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 14) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 14) / 19) * (0-(0)));
            zz = 0.81612 + (((tickAnim - 14) / 19) * (0-(0.81612)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.75-10))*1.9-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -2 + (((tickAnim - 0) / 8) * (-2-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (8-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = -2 + (((tickAnim - 8) / 12) * (0-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 20) / 13) * (6.6604-(8)));
            yy = 0 + (((tickAnim - 20) / 13) * (0.08058-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 6.6604 + (((tickAnim - 33) / 84) * (6.6604-(6.6604)));
            yy = 0.08058 + (((tickAnim - 33) / 84) * (0.08058-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 33) / 84) * (-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 6.6604 + (((tickAnim - 117) / 43) * (0-(6.6604)));
            yy = 0.08058 + (((tickAnim - 117) / 43) * (0-(0.08058)));
            zz = -0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1 + (((tickAnim - 117) / 43) * (-2-(-0.4051+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/0.75-50))*0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = -0.475 + (((tickAnim - 33) / 84) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5.81671-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (10.83085-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (9.06678-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 5.81671 + (((tickAnim - 13) / 16) * (39-(5.81671)));
            yy = 10.83085 + (((tickAnim - 13) / 16) * (0-(10.83085)));
            zz = 9.06678 + (((tickAnim - 13) / 16) * (0-(9.06678)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 29) / 88) * (39-(39)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 39 + (((tickAnim - 117) / 43) * (0-(39)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0.5-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 13) / 7) * (13-(0.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 13 + (((tickAnim - 20) / 9) * (23-(13)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 23 + (((tickAnim - 29) / 88) * (23-(23)));
            yy = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 23 + (((tickAnim - 117) / 43) * (0-(23)));
            yy = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -20 + (((tickAnim - 8) / 12) * (12-(-20)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 12 + (((tickAnim - 20) / 9) * (12-(12)));
            yy = 0 + (((tickAnim - 20) / 9) * (0.42902-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (-0.33008-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 12 + (((tickAnim - 29) / 88) * (12-(12)));
            yy = 0.42902 + (((tickAnim - 29) / 88) * (0.42902-(0.42902)));
            zz = -0.33008 + (((tickAnim - 29) / 88) * (-0.33008-(-0.33008)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 12 + (((tickAnim - 117) / 43) * (0-(12)));
            yy = 0.42902 + (((tickAnim - 117) / 43) * (0-(0.42902)));
            zz = -0.33008 + (((tickAnim - 117) / 43) * (0-(-0.33008)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 20 + (((tickAnim - 8) / 9) * (0-(20)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 3) / 3) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 12) / 2) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 146) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 146) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(xx);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(yy);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (17.7252-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (6.18705-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.08143-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 17.7252 + (((tickAnim - 8) / 3) * (27.63512-(17.7252)));
            yy = 6.18705 + (((tickAnim - 8) / 3) * (3.71223-(6.18705)));
            zz = -5.08143 + (((tickAnim - 8) / 3) * (-3.04886-(-5.08143)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 27.63512 + (((tickAnim - 11) / 3) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 11) / 3) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 11) / 3) * (0-(-3.04886)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 30 + (((tickAnim - 14) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 29 + (((tickAnim - 16) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 18) / 99) * (31-(31)));
            yy = 0 + (((tickAnim - 18) / 99) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 99) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 31 + (((tickAnim - 117) / 16) * (25-(31)));
            yy = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 25 + (((tickAnim - 133) / 6) * (13.16794-(25)));
            yy = 0 + (((tickAnim - 133) / 6) * (7.21884-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (-6.93856-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 13.16794 + (((tickAnim - 139) / 5) * (3.73551-(13.16794)));
            yy = 7.21884 + (((tickAnim - 139) / 5) * (2.97798-(7.21884)));
            zz = -6.93856 + (((tickAnim - 139) / 5) * (-4.01823-(-6.93856)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 3.73551 + (((tickAnim - 144) / 16) * (0-(3.73551)));
            yy = 2.97798 + (((tickAnim - 144) / 16) * (0-(2.97798)));
            zz = -4.01823 + (((tickAnim - 144) / 16) * (0-(-4.01823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (-0.2-(-0.2)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0.6-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (0.5-(-0.2)));
            zz = 0.6 + (((tickAnim - 8) / 6) * (0.3-(0.6)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 14) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 14) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 17) * (0.23-(0.4)));
            zz = 0.3 + (((tickAnim - 16) / 17) * (0.33-(0.3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.23 + (((tickAnim - 33) / 84) * (0.23-(0.23)));
            zz = 0.33 + (((tickAnim - 33) / 84) * (0.33-(0.33)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.23 + (((tickAnim - 117) / 16) * (0.175-(0.23)));
            zz = 0.33 + (((tickAnim - 117) / 16) * (0.5-(0.33)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 133) / 3) * (0.83-(0.175)));
            zz = 0.5 + (((tickAnim - 133) / 3) * (0.76-(0.5)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = 0.83 + (((tickAnim - 136) / 8) * (-0.115-(0.83)));
            zz = 0.76 + (((tickAnim - 136) / 8) * (0.53-(0.76)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = -0.115 + (((tickAnim - 144) / 2) * (0.06-(-0.115)));
            zz = 0.53 + (((tickAnim - 144) / 2) * (0.48-(0.53)));
        }
        else if (tickAnim >= 146 && tickAnim < 148) {
            xx = 0 + (((tickAnim - 146) / 2) * (0-(0)));
            yy = 0.06 + (((tickAnim - 146) / 2) * (0.055-(0.06)));
            zz = 0.48 + (((tickAnim - 146) / 2) * (0.44-(0.48)));
        }
        else if (tickAnim >= 148 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 148) / 1) * (0-(0)));
            yy = 0.055 + (((tickAnim - 148) / 1) * (-0.07-(0.055)));
            zz = 0.44 + (((tickAnim - 148) / 1) * (0.39-(0.44)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 149) / 2) * (-0.05-(-0.07)));
            zz = 0.39 + (((tickAnim - 149) / 2) * (0.35-(0.39)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = -0.05 + (((tickAnim - 151) / 9) * (-0.1-(-0.05)));
            zz = 0.35 + (((tickAnim - 151) / 9) * (0.1-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-33-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -33 + (((tickAnim - 3) / 8) * (3-(-33)));
            yy = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 11) / 7) * (-17-(3)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17 + (((tickAnim - 18) / 2) * (-19.99933-(-17)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.15205-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (-0.08957-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = -19.99933 + (((tickAnim - 20) / 11) * (-16.99618-(-19.99933)));
            yy = -0.15205 + (((tickAnim - 20) / 11) * (-0.86162-(-0.15205)));
            zz = -0.08957 + (((tickAnim - 20) / 11) * (-0.50758-(-0.08957)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = -16.99618 + (((tickAnim - 31) / 86) * (-16.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 31) / 86) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 31) / 86) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -16.99618 + (((tickAnim - 117) / 16) * (-2.99618-(-16.99618)));
            yy = -0.86162 + (((tickAnim - 117) / 16) * (-0.86162-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 117) / 16) * (-0.50758-(-0.50758)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -2.99618 + (((tickAnim - 133) / 6) * (-50.69775-(-2.99618)));
            yy = -0.86162 + (((tickAnim - 133) / 6) * (-0.58132-(-0.86162)));
            zz = -0.50758 + (((tickAnim - 133) / 6) * (-0.34245-(-0.50758)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = -50.69775 + (((tickAnim - 139) / 5) * (-14.70156-(-50.69775)));
            yy = -0.58132 + (((tickAnim - 139) / 5) * (2.18123-(-0.58132)));
            zz = -0.34245 + (((tickAnim - 139) / 5) * (1.42364-(-0.34245)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = -14.70156 + (((tickAnim - 144) / 16) * (0-(-14.70156)));
            yy = 2.18123 + (((tickAnim - 144) / 16) * (0-(2.18123)));
            zz = 1.42364 + (((tickAnim - 144) / 16) * (0-(1.42364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.46-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.46 + (((tickAnim - 3) / 5) * (0.12-(-0.46)));
            zz = 0.12 + (((tickAnim - 3) / 5) * (0.35-(0.12)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.12 + (((tickAnim - 8) / 3) * (0.2-(0.12)));
            zz = 0.35 + (((tickAnim - 8) / 3) * (0.2-(0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 11) / 2) * (-0.16-(0.2)));
            zz = 0.2 + (((tickAnim - 11) / 2) * (-0.85-(0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.16 + (((tickAnim - 13) / 3) * (-0.09-(-0.16)));
            zz = -0.85 + (((tickAnim - 13) / 3) * (-0.79-(-0.85)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.09 + (((tickAnim - 16) / 2) * (0.01-(-0.09)));
            zz = -0.79 + (((tickAnim - 16) / 2) * (-0.41-(-0.79)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.01 + (((tickAnim - 18) / 2) * (0.01-(0.01)));
            zz = -0.41 + (((tickAnim - 18) / 2) * (-0.31-(-0.41)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 20) / 3) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 20) / 3) * (-0.31-(-0.31)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 23) / 5) * (0.01-(0.01)));
            zz = -0.31 + (((tickAnim - 23) / 5) * (-0.11-(-0.31)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.01 + (((tickAnim - 28) / 3) * (0.01-(0.01)));
            zz = -0.11 + (((tickAnim - 28) / 3) * (-0.01-(-0.11)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0.01 + (((tickAnim - 31) / 86) * (0.01-(0.01)));
            zz = -0.01 + (((tickAnim - 31) / 86) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.01 + (((tickAnim - 117) / 16) * (-0.39-(0.01)));
            zz = -0.01 + (((tickAnim - 117) / 16) * (-0.21-(-0.01)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.39 + (((tickAnim - 133) / 3) * (0.04-(-0.39)));
            zz = -0.21 + (((tickAnim - 133) / 3) * (0.14-(-0.21)));
        }
        else if (tickAnim >= 136 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 136) / 3) * (0-(0)));
            yy = 0.04 + (((tickAnim - 136) / 3) * (0.15-(0.04)));
            zz = 0.14 + (((tickAnim - 136) / 3) * (0.14-(0.14)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 139) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 139) / 5) * (-0.23-(0.15)));
            zz = 0.14 + (((tickAnim - 139) / 5) * (-0.09-(0.14)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 144) / 16) * (0-(0)));
            yy = -0.23 + (((tickAnim - 144) / 16) * (-0.2-(-0.23)));
            zz = -0.09 + (((tickAnim - 144) / 16) * (0-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.55556-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-15-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -0.55556 + (((tickAnim - 3) / 5) * (-1-(-0.55556)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 8) / 3) * (-24.97532-(-15)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.12972-(0)));
            zz = -1 + (((tickAnim - 8) / 3) * (-0.67698-(-1)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -24.97532 + (((tickAnim - 11) / 2) * (-37-(-24.97532)));
            yy = -0.12972 + (((tickAnim - 11) / 2) * (0-(-0.12972)));
            zz = -0.67698 + (((tickAnim - 11) / 2) * (0-(-0.67698)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 13) / 3) * (-22-(-37)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -22 + (((tickAnim - 16) / 2) * (-17.99383-(-22)));
            yy = 0 + (((tickAnim - 16) / 2) * (-0.74485-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.86146-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = -17.99383 + (((tickAnim - 18) / 11) * (-13.92254-(-17.99383)));
            yy = -0.74485 + (((tickAnim - 18) / 11) * (-0.73066-(-0.74485)));
            zz = 0.86146 + (((tickAnim - 18) / 11) * (1.32282-(0.86146)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -13.92254 + (((tickAnim - 29) / 88) * (-10.98057-(-13.92254)));
            yy = -0.73066 + (((tickAnim - 29) / 88) * (-0.77517-(-0.73066)));
            zz = 1.32282 + (((tickAnim - 29) / 88) * (-0.13816-(1.32282)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = -10.98057 + (((tickAnim - 117) / 16) * (-19.93444-(-10.98057)));
            yy = -0.77517 + (((tickAnim - 117) / 16) * (-1.58427-(-0.77517)));
            zz = -0.13816 + (((tickAnim - 117) / 16) * (-1.05315-(-0.13816)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = -19.93444 + (((tickAnim - 133) / 6) * (60.42621-(-19.93444)));
            yy = -1.58427 + (((tickAnim - 133) / 6) * (-1.23771-(-1.58427)));
            zz = -1.05315 + (((tickAnim - 133) / 6) * (-0.82278-(-1.05315)));
        }
        else if (tickAnim >= 139 && tickAnim < 144) {
            xx = 60.42621 + (((tickAnim - 139) / 5) * (10.8853-(60.42621)));
            yy = -1.23771 + (((tickAnim - 139) / 5) * (-6.41695-(-1.23771)));
            zz = -0.82278 + (((tickAnim - 139) / 5) * (2.69485-(-0.82278)));
        }
        else if (tickAnim >= 144 && tickAnim < 160) {
            xx = 10.8853 + (((tickAnim - 144) / 16) * (0-(10.8853)));
            yy = -6.41695 + (((tickAnim - 144) / 16) * (0-(-6.41695)));
            zz = 2.69485 + (((tickAnim - 144) / 16) * (0-(2.69485)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.33-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 16) / 2) * (0.2-(0.33)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 18) / 2) * (0.1-(0.2)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 20) / 3) * (0.2-(0.1)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 6) * (0.52-(0.2)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.52 + (((tickAnim - 29) / 88) * (0.5-(0.52)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 16) * (0.3-(0.5)));
            zz = 0 + (((tickAnim - 117) / 16) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 133) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 133) / 11) * (0.46-(0.3)));
            zz = 0 + (((tickAnim - 133) / 11) * (-0.08-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 146) {
            xx = 0 + (((tickAnim - 144) / 2) * (0-(0)));
            yy = 0.46 + (((tickAnim - 144) / 2) * (0.23-(0.46)));
            zz = -0.08 + (((tickAnim - 144) / 2) * (-0.09-(-0.08)));
        }
        else if (tickAnim >= 146 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 146) / 14) * (0-(0)));
            yy = 0.23 + (((tickAnim - 146) / 14) * (0.2-(0.23)));
            zz = -0.09 + (((tickAnim - 146) / 14) * (-0.2-(-0.09)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 13) * (0-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 27 + (((tickAnim - 13) / 4) * (40-(27)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 40 + (((tickAnim - 17) / 10) * (-38.12058-(40)));
            yy = 0 + (((tickAnim - 17) / 10) * (-4.16037-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (-1.63998-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -38.12058 + (((tickAnim - 27) / 6) * (-47.02019-(-38.12058)));
            yy = -4.16037 + (((tickAnim - 27) / 6) * (-8.57463-(-4.16037)));
            zz = -1.63998 + (((tickAnim - 27) / 6) * (-2.9193-(-1.63998)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -47.02019 + (((tickAnim - 33) / 84) * (-47.02019-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 33) / 84) * (-8.57463-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 33) / 84) * (-2.9193-(-2.9193)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = -47.02019 + (((tickAnim - 117) / 19) * (0-(-47.02019)));
            yy = -8.57463 + (((tickAnim - 117) / 19) * (0-(-8.57463)));
            zz = -2.9193 + (((tickAnim - 117) / 19) * (0-(-2.9193)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (-3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 17) * (0.6-(0.2)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 6) * (1.85-(0.6)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 23) / 4) * (1.25-(1.85)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 1.25 + (((tickAnim - 27) / 6) * (0.75-(1.25)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.75 + (((tickAnim - 33) / 84) * (0.75-(0.75)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 117) / 19) * (0-(0)));
            yy = 0.75 + (((tickAnim - 117) / 19) * (-0.45-(0.75)));
            zz = 0 + (((tickAnim - 117) / 19) * (-0.1-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 136) / 2) * (0-(0)));
            yy = -0.45 + (((tickAnim - 136) / 2) * (-0.55-(-0.45)));
            zz = -0.1 + (((tickAnim - 136) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 138) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 138) / 2) * (-0.355-(-0.55)));
            zz = -0.1 + (((tickAnim - 138) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 140 && tickAnim < 142) {
            xx = 0 + (((tickAnim - 140) / 2) * (0-(0)));
            yy = -0.355 + (((tickAnim - 140) / 2) * (-0.33-(-0.355)));
            zz = -0.1 + (((tickAnim - 140) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 142) / 1) * (0-(0)));
            yy = -0.33 + (((tickAnim - 142) / 1) * (-0.41-(-0.33)));
            zz = -0.1 + (((tickAnim - 142) / 1) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 143) / 2) * (0-(0)));
            yy = -0.41 + (((tickAnim - 143) / 2) * (-0.43-(-0.41)));
            zz = -0.1 + (((tickAnim - 143) / 2) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            yy = -0.43 + (((tickAnim - 145) / 15) * (-0.175-(-0.43)));
            zz = -0.1 + (((tickAnim - 145) / 15) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.25 + (((tickAnim - 8) / 5) * (-7-(-3.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7 + (((tickAnim - 13) / 7) * (14-(-7)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 14 + (((tickAnim - 20) / 5) * (13-(14)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 13 + (((tickAnim - 25) / 7) * (24-(13)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 24 + (((tickAnim - 32) / 85) * (24-(24)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 24 + (((tickAnim - 117) / 12) * (34.42-(24)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = 34.42 + (((tickAnim - 129) / 7) * (-3-(34.42)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = -3 + (((tickAnim - 136) / 24) * (0-(-3)));
            yy = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 24) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.2-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (-0.3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 8) * (0.5-(0.2)));
            zz = -0.3 + (((tickAnim - 20) / 8) * (0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 28) / 4) * (0.5-(0.5)));
            zz = 0.3 + (((tickAnim - 28) / 4) * (0.8-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 32) / 1) * (0.5-(0.5)));
            zz = 0.8 + (((tickAnim - 32) / 1) * (0.9-(0.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.5 + (((tickAnim - 33) / 84) * (0.5-(0.5)));
            zz = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 117) / 8) * (0.64-(0.5)));
            zz = 0.9 + (((tickAnim - 117) / 8) * (0.65-(0.9)));
        }
        else if (tickAnim >= 125 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 125) / 11) * (0-(0)));
            yy = 0.64 + (((tickAnim - 125) / 11) * (1.25-(0.64)));
            zz = 0.65 + (((tickAnim - 125) / 11) * (-0.4-(0.65)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 1.25 + (((tickAnim - 136) / 24) * (0-(1.25)));
            zz = -0.4 + (((tickAnim - 136) / 24) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 11 + (((tickAnim - 4) / 9) * (2-(11)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 13) / 5) * (30.24-(2)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 30.24 + (((tickAnim - 18) / 5) * (17.57-(30.24)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 17.57 + (((tickAnim - 23) / 4) * (10-(17.57)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 27) / 5) * (35.00575-(10)));
            yy = 0 + (((tickAnim - 27) / 5) * (1.10913-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (1.72251-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 35.00575 + (((tickAnim - 32) / 85) * (35.00575-(35.00575)));
            yy = 1.10913 + (((tickAnim - 32) / 85) * (1.10913-(1.10913)));
            zz = 1.72251 + (((tickAnim - 32) / 85) * (1.72251-(1.72251)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 35.00575 + (((tickAnim - 117) / 43) * (0-(35.00575)));
            yy = 1.10913 + (((tickAnim - 117) / 43) * (0-(1.10913)));
            zz = 1.72251 + (((tickAnim - 117) / 43) * (0-(1.72251)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.38-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.14-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.38 + (((tickAnim - 4) / 4) * (-0.2-(-0.38)));
            zz = 0.14 + (((tickAnim - 4) / 4) * (0.1-(0.14)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 5) * (-0.3-(-0.2)));
            zz = 0.1 + (((tickAnim - 8) / 5) * (-0.2-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 14) * (0.7-(-0.3)));
            zz = -0.2 + (((tickAnim - 13) / 14) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 27) / 5) * (1.1-(0.7)));
            zz = -0.1 + (((tickAnim - 27) / 5) * (0.2-(-0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 1.1 + (((tickAnim - 32) / 85) * (0.8-(1.1)));
            zz = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.8 + (((tickAnim - 117) / 13) * (1.03-(0.8)));
            zz = 0.2 + (((tickAnim - 117) / 13) * (0.33-(0.2)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = 1.03 + (((tickAnim - 130) / 6) * (0.7-(1.03)));
            zz = 0.33 + (((tickAnim - 130) / 6) * (0.4-(0.33)));
        }
        else if (tickAnim >= 136 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 136) / 24) * (0-(0)));
            yy = 0.7 + (((tickAnim - 136) / 24) * (0-(0.7)));
            zz = 0.4 + (((tickAnim - 136) / 24) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2 + (((tickAnim - 0) / 4) * (-15.75-(2)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15.75 + (((tickAnim - 4) / 5) * (-20.61-(-15.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.61 + (((tickAnim - 9) / 4) * (-24.99809-(-20.61)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.22494-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.97438-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -24.99809 + (((tickAnim - 13) / 7) * (16-(-24.99809)));
            yy = -0.22494 + (((tickAnim - 13) / 7) * (0-(-0.22494)));
            zz = -0.97438 + (((tickAnim - 13) / 7) * (0-(-0.97438)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16 + (((tickAnim - 20) / 3) * (-16-(16)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -16 + (((tickAnim - 23) / 2) * (-18.68-(-16)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = -18.68 + (((tickAnim - 25) / 2) * (-16-(-18.68)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 27) / 1) * (-7-(-16)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 117) {
            xx = -7 + (((tickAnim - 28) / 89) * (-7-(-7)));
            yy = 0 + (((tickAnim - 28) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 89) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 125) {
            xx = -7 + (((tickAnim - 117) / 8) * (-12.61-(-7)));
            yy = 0 + (((tickAnim - 117) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 8) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 129) {
            xx = -12.61 + (((tickAnim - 125) / 4) * (-17.28-(-12.61)));
            yy = 0 + (((tickAnim - 125) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 4) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 136) {
            xx = -17.28 + (((tickAnim - 129) / 7) * (-16.03-(-17.28)));
            yy = 0 + (((tickAnim - 129) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 7) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = -16.03 + (((tickAnim - 136) / 4) * (-12-(-16.03)));
            yy = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = -12 + (((tickAnim - 140) / 20) * (1-(-12)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 9) / 4) * (-0.24-(-0.1)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 13) / 19) * (0-(0)));
            yy = -0.24 + (((tickAnim - 13) / 19) * (0.2-(-0.24)));
            zz = 0 + (((tickAnim - 13) / 19) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 117) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 13) * (-0.04-(0.2)));
            zz = 0 + (((tickAnim - 117) / 13) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 130) / 6) * (0-(0)));
            yy = -0.04 + (((tickAnim - 130) / 6) * (0.44-(-0.04)));
            zz = 0 + (((tickAnim - 130) / 6) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 136) / 4) * (0-(0)));
            yy = 0.44 + (((tickAnim - 136) / 4) * (0.25-(0.44)));
            zz = 0 + (((tickAnim - 136) / 4) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.25 + (((tickAnim - 140) / 20) * (0.1-(0.25)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29 + (((tickAnim - 0) / 5) * (-21-(29)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -21 + (((tickAnim - 5) / 4) * (-38-(-21)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -38 + (((tickAnim - 9) / 5) * (-62-(-38)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = -62 + (((tickAnim - 14) / 9) * (-61.95651-(-62)));
            yy = 0 + (((tickAnim - 14) / 9) * (5.9414-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0.83804-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = -61.95651 + (((tickAnim - 23) / 94) * (-61.87822-(-61.95651)));
            yy = 5.9414 + (((tickAnim - 23) / 94) * (9.9017-(5.9414)));
            zz = 0.83804 + (((tickAnim - 23) / 94) * (1.40575-(0.83804)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -61.87822 + (((tickAnim - 117) / 21) * (-41.87822-(-61.87822)));
            yy = 9.9017 + (((tickAnim - 117) / 21) * (9.9017-(9.9017)));
            zz = 1.40575 + (((tickAnim - 117) / 21) * (1.40575-(1.40575)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = -41.87822 + (((tickAnim - 138) / 11) * (0-(-41.87822)));
            yy = 9.9017 + (((tickAnim - 138) / 11) * (0-(9.9017)));
            zz = 1.40575 + (((tickAnim - 138) / 11) * (0-(1.40575)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0.4-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 14) / 1) * (-0.455-(-0.275)));
            zz = 0.4 + (((tickAnim - 14) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -0.455 + (((tickAnim - 15) / 1) * (-0.445-(-0.455)));
            zz = 0.4 + (((tickAnim - 15) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 16) / 1) * (-0.49-(-0.445)));
            zz = 0.4 + (((tickAnim - 16) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -0.49 + (((tickAnim - 17) / 1) * (-0.33-(-0.49)));
            zz = 0.4 + (((tickAnim - 17) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -0.33 + (((tickAnim - 18) / 15) * (0.9-(-0.33)));
            zz = 0.4 + (((tickAnim - 18) / 15) * (0.4-(0.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            yy = 0.9 + (((tickAnim - 33) / 84) * (0.9-(0.9)));
            zz = 0.4 + (((tickAnim - 33) / 84) * (0.4-(0.4)));
        }
        else if (tickAnim >= 117 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 117) / 16) * (0-(0)));
            yy = 0.9 + (((tickAnim - 117) / 16) * (-0.225-(0.9)));
            zz = 0.4 + (((tickAnim - 117) / 16) * (-0.22-(0.4)));
        }
        else if (tickAnim >= 133 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 133) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 133) / 3) * (-0.36-(-0.225)));
            zz = -0.22 + (((tickAnim - 133) / 3) * (-0.31-(-0.22)));
        }
        else if (tickAnim >= 136 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 136) / 8) * (0-(0)));
            yy = -0.36 + (((tickAnim - 136) / 8) * (0.85-(-0.36)));
            zz = -0.31 + (((tickAnim - 136) / 8) * (-0.2-(-0.31)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 144) / 5) * (-0.95-(0.85)));
            zz = -0.2 + (((tickAnim - 144) / 5) * (0-(-0.2)));
        }
        else if (tickAnim >= 149 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 149) / 2) * (0-(0)));
            yy = -0.95 + (((tickAnim - 149) / 2) * (-0.975-(-0.95)));
            zz = 0 + (((tickAnim - 149) / 2) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 151) / 2) * (0-(0)));
            yy = -0.975 + (((tickAnim - 151) / 2) * (-0.77-(-0.975)));
            zz = 0 + (((tickAnim - 151) / 2) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 153) / 1) * (0-(0)));
            yy = -0.77 + (((tickAnim - 153) / 1) * (-0.715-(-0.77)));
            zz = 0 + (((tickAnim - 153) / 1) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 154) / 2) * (0-(0)));
            yy = -0.715 + (((tickAnim - 154) / 2) * (-0.36-(-0.715)));
            zz = 0 + (((tickAnim - 154) / 2) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 156) / 4) * (0-(0)));
            yy = -0.36 + (((tickAnim - 156) / 4) * (0-(-0.36)));
            zz = 0 + (((tickAnim - 156) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 5) / 4) * (22-(28)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 22 + (((tickAnim - 9) / 5) * (39-(22)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 117) {
            xx = 39 + (((tickAnim - 14) / 103) * (39-(39)));
            yy = 0 + (((tickAnim - 14) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 103) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 39 + (((tickAnim - 117) / 21) * (28.13-(39)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 28.13 + (((tickAnim - 138) / 6) * (35.8-(28.13)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = 35.8 + (((tickAnim - 144) / 5) * (3-(35.8)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 149) / 11) * (0-(3)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 1.8 + (((tickAnim - 13) / 0) * (1.94-(1.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 1.94 + (((tickAnim - 13) / 1) * (2.16-(1.94)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 2.16 + (((tickAnim - 14) / 2) * (1.98-(2.16)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 1.98 + (((tickAnim - 16) / 2) * (2.07-(1.98)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 2.07 + (((tickAnim - 18) / 5) * (2.1-(2.07)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            zz = 2.1 + (((tickAnim - 23) / 8) * (2.1-(2.1)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            zz = 2.1 + (((tickAnim - 31) / 86) * (2.1-(2.1)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 21) * (0.15-(0)));
            zz = 2.1 + (((tickAnim - 117) / 21) * (1.81-(2.1)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 0.15 + (((tickAnim - 138) / 11) * (0.2-(0.15)));
            zz = 1.81 + (((tickAnim - 138) / 11) * (-0.21-(1.81)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.2 + (((tickAnim - 149) / 11) * (0-(0.2)));
            zz = -0.21 + (((tickAnim - 149) / 11) * (0-(-0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37 + (((tickAnim - 0) / 5) * (-1-(37)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1 + (((tickAnim - 5) / 4) * (-2-(-1)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -2 + (((tickAnim - 9) / 5) * (33-(-2)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 33 + (((tickAnim - 14) / 9) * (34-(33)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 117) {
            xx = 34 + (((tickAnim - 23) / 94) * (34-(34)));
            yy = 0 + (((tickAnim - 23) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 94) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 34 + (((tickAnim - 117) / 21) * (26-(34)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 144) {
            xx = 26 + (((tickAnim - 138) / 6) * (-5.42-(26)));
            yy = 0 + (((tickAnim - 138) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 6) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 149) {
            xx = -5.42 + (((tickAnim - 144) / 5) * (8-(-5.42)));
            yy = 0 + (((tickAnim - 144) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 5) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 8 + (((tickAnim - 149) / 11) * (0-(8)));
            yy = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.18 + (((tickAnim - 9) / 5) * (0.4-(0.18)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.4 + (((tickAnim - 14) / 9) * (0.9-(0.4)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 23) / 8) * (0-(0)));
            yy = 0.9 + (((tickAnim - 23) / 8) * (1.1-(0.9)));
            zz = 0 + (((tickAnim - 23) / 8) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 31) / 86) * (0-(0)));
            yy = 1.1 + (((tickAnim - 31) / 86) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 31) / 86) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 1.1 + (((tickAnim - 117) / 21) * (1.1-(1.1)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 138) / 11) * (0-(0)));
            yy = 1.1 + (((tickAnim - 138) / 11) * (0.61-(1.1)));
            zz = 0 + (((tickAnim - 138) / 11) * (0.5-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 149) / 11) * (0-(0)));
            yy = 0.61 + (((tickAnim - 149) / 11) * (0-(0.61)));
            zz = 0.5 + (((tickAnim - 149) / 11) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 0) / 13) * (-9-(10)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 13) / 10) * (-9.43-(-9)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -9.43 + (((tickAnim - 23) / 9) * (-6-(-9.43)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 32) / 85) * (-8-(-6)));
            yy = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = -8 + (((tickAnim - 117) / 21) * (-9-(-8)));
            yy = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -9 + (((tickAnim - 138) / 5) * (4.1-(-9)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 4.1 + (((tickAnim - 143) / 6) * (-14.55-(4.1)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = -14.55 + (((tickAnim - 149) / 4) * (-6.25-(-14.55)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 160) {
            xx = -6.25 + (((tickAnim - 153) / 7) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 153) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.41-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 3) / 20) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 20) * (0.2-(0.41)));
            zz = 0 + (((tickAnim - 3) / 20) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.2 + (((tickAnim - 32) / 85) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 32) / 85) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 117) / 21) * (0-(0)));
            yy = 0.2 + (((tickAnim - 117) / 21) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 117) / 21) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 138) / 22) * (0-(0)));
            yy = 0.2 + (((tickAnim - 138) / 22) * (0-(0.2)));
            zz = 0 + (((tickAnim - 138) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 33) * (-7.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 33) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = -7.25 + (((tickAnim - 33) / 84) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -7.25 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-7.25)));
            yy = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 117 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 117) / 43) * (0-(0)));
            yy = -0.4 + (((tickAnim - 117) / 43) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 117) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3 + (((tickAnim - 0) / 33) * (3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3 + (((tickAnim - 0) / 33) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3)));
        }
        else if (tickAnim >= 33 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 33) / 84) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 84) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 3 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-30))*3-(3)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*7.5-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-90))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2 + (((tickAnim - 0) / 117) * (5.5-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3 + (((tickAnim - 0) / 117) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = 5.5 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-60))*2-(5.5)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 117) {
            xx = 5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2 + (((tickAnim - 0) / 117) * (-0.75-(5.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3 + (((tickAnim - 0) / 117) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3)));
        }
        else if (tickAnim >= 117 && tickAnim < 160) {
            xx = -0.75 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-90))*2-(-0.75)));
            yy = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*10-(0)));
            zz = 0 + (((tickAnim - 117) / 43) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-120))*3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 10) / 3) * (-31.34436-(-40)));
            yy = 0 + (((tickAnim - 10) / 3) * (2.7498-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.25841-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -31.34436 + (((tickAnim - 13) / 5) * (-5.26625-(-31.34436)));
            yy = 2.7498 + (((tickAnim - 13) / 5) * (-0.57627-(2.7498)));
            zz = -2.25841 + (((tickAnim - 13) / 5) * (-7.07087-(-2.25841)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -5.26625 + (((tickAnim - 18) / 3) * (27.63512-(-5.26625)));
            yy = -0.57627 + (((tickAnim - 18) / 3) * (3.71223-(-0.57627)));
            zz = -7.07087 + (((tickAnim - 18) / 3) * (-3.04886-(-7.07087)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 27.63512 + (((tickAnim - 21) / 4) * (30-(27.63512)));
            yy = 3.71223 + (((tickAnim - 21) / 4) * (0-(3.71223)));
            zz = -3.04886 + (((tickAnim - 21) / 4) * (0-(-3.04886)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 30 + (((tickAnim - 25) / 2) * (29-(30)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 29 + (((tickAnim - 27) / 2) * (31-(29)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 31 + (((tickAnim - 29) / 88) * (32.0968-(31)));
            yy = 0 + (((tickAnim - 29) / 88) * (2.59146-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (4.27748-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 32.0968 + (((tickAnim - 117) / 6) * (28.19418-(32.0968)));
            yy = 2.59146 + (((tickAnim - 117) / 6) * (-3.79706-(2.59146)));
            zz = 4.27748 + (((tickAnim - 117) / 6) * (5.91482-(4.27748)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 28.19418 + (((tickAnim - 123) / 5) * (3.06208-(28.19418)));
            yy = -3.79706 + (((tickAnim - 123) / 5) * (1.55488-(-3.79706)));
            zz = 5.91482 + (((tickAnim - 123) / 5) * (2.56649-(5.91482)));
        }
        else if (tickAnim >= 128 && tickAnim < 145) {
            xx = 3.06208 + (((tickAnim - 128) / 17) * (0.10865-(3.06208)));
            yy = 1.55488 + (((tickAnim - 128) / 17) * (-9.69232-(1.55488)));
            zz = 2.56649 + (((tickAnim - 128) / 17) * (16.70221-(2.56649)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 0.10865 + (((tickAnim - 145) / 7) * (11.72274-(0.10865)));
            yy = -9.69232 + (((tickAnim - 145) / 7) * (-2.63698-(-9.69232)));
            zz = 16.70221 + (((tickAnim - 145) / 7) * (4.54415-(16.70221)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 11.72274 + (((tickAnim - 152) / 8) * (0-(11.72274)));
            yy = -2.63698 + (((tickAnim - 152) / 8) * (0-(-2.63698)));
            zz = 4.54415 + (((tickAnim - 152) / 8) * (0-(4.54415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 10) * (-1.2-(-0.4)));
            zz = 0.4 + (((tickAnim - 0) / 10) * (0.4-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -1.2 + (((tickAnim - 10) / 3) * (-0.695-(-1.2)));
            zz = 0.4 + (((tickAnim - 10) / 3) * (0.49-(0.4)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.695 + (((tickAnim - 13) / 5) * (0.325-(-0.695)));
            zz = 0.49 + (((tickAnim - 13) / 5) * (0.66-(0.49)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 3) * (0.25-(0.325)));
            zz = 0.66 + (((tickAnim - 18) / 3) * (0.1-(0.66)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 21) / 4) * (0.5-(0.25)));
            zz = 0.1 + (((tickAnim - 21) / 4) * (0.3-(0.1)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 2) * (0.4-(0.5)));
            zz = 0.3 + (((tickAnim - 25) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 27) / 1) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 27) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 29) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 29) / 2) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 29) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 31) / 1) * (0.4-(0.3)));
            zz = 0.3 + (((tickAnim - 31) / 1) * (0.3-(0.3)));
        }
        else if (tickAnim >= 32 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 32) / 85) * (0-(0)));
            yy = 0.4 + (((tickAnim - 32) / 85) * (0.3-(0.4)));
            zz = 0.3 + (((tickAnim - 32) / 85) * (0.3-(0.3)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            yy = 0.3 + (((tickAnim - 117) / 11) * (1.44-(0.3)));
            zz = 0.3 + (((tickAnim - 117) / 11) * (1.58-(0.3)));
        }
        else if (tickAnim >= 128 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 128) / 1) * (0-(0)));
            yy = 1.44 + (((tickAnim - 128) / 1) * (1.26-(1.44)));
            zz = 1.58 + (((tickAnim - 128) / 1) * (1.5-(1.58)));
        }
        else if (tickAnim >= 129 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 129) / 2) * (0-(0)));
            yy = 1.26 + (((tickAnim - 129) / 2) * (1.29-(1.26)));
            zz = 1.5 + (((tickAnim - 129) / 2) * (1.42-(1.5)));
        }
        else if (tickAnim >= 131 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 131) / 2) * (0-(0)));
            yy = 1.29 + (((tickAnim - 131) / 2) * (1.01-(1.29)));
            zz = 1.42 + (((tickAnim - 131) / 2) * (1.34-(1.42)));
        }
        else if (tickAnim >= 133 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 133) / 1) * (0-(0)));
            yy = 1.01 + (((tickAnim - 133) / 1) * (1.04-(1.01)));
            zz = 1.34 + (((tickAnim - 133) / 1) * (1.26-(1.34)));
        }
        else if (tickAnim >= 134 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 134) / 26) * (0-(0)));
            yy = 1.04 + (((tickAnim - 134) / 26) * (-0.1-(1.04)));
            zz = 1.26 + (((tickAnim - 134) / 26) * (0.1-(1.26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.29-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -1.29 + (((tickAnim - 5) / 7) * (-17-(-1.29)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -17 + (((tickAnim - 12) / 5) * (-54.35-(-17)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -54.35 + (((tickAnim - 17) / 7) * (-17-(-54.35)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = -17 + (((tickAnim - 24) / 93) * (-12-(-17)));
            yy = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 93) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -12 + (((tickAnim - 117) / 7) * (-44.32428-(-12)));
            yy = 0 + (((tickAnim - 117) / 7) * (-2.63157-(0)));
            zz = 0 + (((tickAnim - 117) / 7) * (-0.89032-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = -44.32428 + (((tickAnim - 124) / 4) * (-28.78371-(-44.32428)));
            yy = -2.63157 + (((tickAnim - 124) / 4) * (-4.73683-(-2.63157)));
            zz = -0.89032 + (((tickAnim - 124) / 4) * (-1.60258-(-0.89032)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = -28.78371 + (((tickAnim - 128) / 5) * (-23.54851-(-28.78371)));
            yy = -4.73683 + (((tickAnim - 128) / 5) * (-5.30773-(-4.73683)));
            zz = -1.60258 + (((tickAnim - 128) / 5) * (-3.04499-(-1.60258)));
        }
        else if (tickAnim >= 133 && tickAnim < 140) {
            xx = -23.54851 + (((tickAnim - 133) / 7) * (-16.66138-(-23.54851)));
            yy = -5.30773 + (((tickAnim - 133) / 7) * (-3.9808-(-5.30773)));
            zz = -3.04499 + (((tickAnim - 133) / 7) * (-2.28374-(-3.04499)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -16.66138 + (((tickAnim - 140) / 5) * (-12.39571-(-16.66138)));
            yy = -3.9808 + (((tickAnim - 140) / 5) * (-2.47897-(-3.9808)));
            zz = -2.28374 + (((tickAnim - 140) / 5) * (-11.1353-(-2.28374)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = -12.39571 + (((tickAnim - 145) / 7) * (-40.79337-(-12.39571)));
            yy = -2.47897 + (((tickAnim - 145) / 7) * (-0.0007-(-2.47897)));
            zz = -11.1353 + (((tickAnim - 145) / 7) * (-0.00314-(-11.1353)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = -40.79337 + (((tickAnim - 152) / 8) * (0-(-40.79337)));
            yy = -0.0007 + (((tickAnim - 152) / 8) * (0-(-0.0007)));
            zz = -0.00314 + (((tickAnim - 152) / 8) * (0-(-0.00314)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 5) * (-0.08-(0.2)));
            zz = 0 + (((tickAnim - 12) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = -0.08 + (((tickAnim - 17) / 7) * (0.01-(-0.08)));
            zz = 0.35 + (((tickAnim - 17) / 7) * (-0.01-(0.35)));
        }
        else if (tickAnim >= 24 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 24) / 93) * (0-(0)));
            yy = 0.01 + (((tickAnim - 24) / 93) * (0.51-(0.01)));
            zz = -0.01 + (((tickAnim - 24) / 93) * (-0.01-(-0.01)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            yy = 0.51 + (((tickAnim - 117) / 6) * (0.39-(0.51)));
            zz = -0.01 + (((tickAnim - 117) / 6) * (0.42-(-0.01)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            yy = 0.39 + (((tickAnim - 123) / 5) * (0.14-(0.39)));
            zz = 0.42 + (((tickAnim - 123) / 5) * (0.39-(0.42)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            yy = 0.14 + (((tickAnim - 128) / 32) * (-0.2-(0.14)));
            zz = 0.39 + (((tickAnim - 128) / 32) * (0-(0.39)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (40.86-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 40.86 + (((tickAnim - 8) / 5) * (53-(40.86)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 53 + (((tickAnim - 13) / 6) * (-10.33-(53)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -10.33 + (((tickAnim - 19) / 4) * (-19.33-(-10.33)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -19.33 + (((tickAnim - 23) / 4) * (-17.33-(-19.33)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -17.33 + (((tickAnim - 27) / 2) * (-14.33-(-17.33)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = -14.33 + (((tickAnim - 29) / 88) * (-17.29966-(-14.33)));
            yy = 0 + (((tickAnim - 29) / 88) * (-0.7019-(0)));
            zz = 0 + (((tickAnim - 29) / 88) * (-4.95061-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 124) {
            xx = -17.29966 + (((tickAnim - 117) / 7) * (0-(-17.29966)));
            yy = -0.7019 + (((tickAnim - 117) / 7) * (0-(-0.7019)));
            zz = -4.95061 + (((tickAnim - 117) / 7) * (0-(-4.95061)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 124) / 4) * (28.85-(0)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 130) {
            xx = 28.85 + (((tickAnim - 128) / 2) * (25.2637-(28.85)));
            yy = 0 + (((tickAnim - 128) / 2) * (1.13352-(0)));
            zz = 0 + (((tickAnim - 128) / 2) * (-1.64787-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 140) {
            xx = 25.2637 + (((tickAnim - 130) / 10) * (17.25654-(25.2637)));
            yy = 1.13352 + (((tickAnim - 130) / 10) * (8.95221-(1.13352)));
            zz = -1.64787 + (((tickAnim - 130) / 10) * (-4.49939-(-1.64787)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 17.25654 + (((tickAnim - 140) / 5) * (12-(17.25654)));
            yy = 8.95221 + (((tickAnim - 140) / 5) * (0-(8.95221)));
            zz = -4.49939 + (((tickAnim - 140) / 5) * (0-(-4.49939)));
        }
        else if (tickAnim >= 145 && tickAnim < 152) {
            xx = 12 + (((tickAnim - 145) / 7) * (46.69038-(12)));
            yy = 0 + (((tickAnim - 145) / 7) * (2.17904-(0)));
            zz = 0 + (((tickAnim - 145) / 7) * (-0.72817-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 46.69038 + (((tickAnim - 152) / 8) * (0-(46.69038)));
            yy = 2.17904 + (((tickAnim - 152) / 8) * (0-(2.17904)));
            zz = -0.72817 + (((tickAnim - 152) / 8) * (0-(-0.72817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 10) * (0.12-(0.3)));
            zz = 0 + (((tickAnim - 3) / 10) * (-0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.12 + (((tickAnim - 13) / 6) * (0.36-(0.12)));
            zz = -0.1 + (((tickAnim - 13) / 6) * (0-(-0.1)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 19) / 4) * (0.36-(0.36)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.36 + (((tickAnim - 23) / 4) * (0.26-(0.36)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = 0.26 + (((tickAnim - 27) / 2) * (0.35-(0.26)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 29) / 88) * (0-(0)));
            yy = 0.35 + (((tickAnim - 29) / 88) * (0.425-(0.35)));
            zz = 0 + (((tickAnim - 29) / 88) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 117) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 117) / 5) * (0.2-(0.425)));
            zz = 0 + (((tickAnim - 117) / 5) * (-0.01-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 122) / 6) * (0-(0)));
            yy = 0.2 + (((tickAnim - 122) / 6) * (-0.18-(0.2)));
            zz = -0.01 + (((tickAnim - 122) / 6) * (-0.05-(-0.01)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            yy = -0.18 + (((tickAnim - 128) / 12) * (0.17-(-0.18)));
            zz = -0.05 + (((tickAnim - 128) / 12) * (-0.15-(-0.05)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 140) / 20) * (0.3-(0.17)));
            zz = -0.15 + (((tickAnim - 140) / 20) * (-0.3-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);
    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 100;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 2 + (((tickAnim - 8) / 17) * (-3.36-(2)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -3.36 + (((tickAnim - 25) / 26) * (-3.36-(-3.36)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = -3.36 + (((tickAnim - 51) / 49) * (0-(-3.36)));
            yy = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (-7-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -7 + (((tickAnim - 25) / 26) * (-7-(-7)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = -7 + (((tickAnim - 51) / 49) * (0-(-7)));
            yy = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = 0.1 + (((tickAnim - 25) / 26) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = 0.1 + (((tickAnim - 51) / 49) * (0-(0.1)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (-4-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -4 + (((tickAnim - 25) / 26) * (-4.10096-(-4)));
            yy = 0 + (((tickAnim - 25) / 26) * (-6.79108-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (1.70143-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = -4.10096 + (((tickAnim - 51) / 49) * (0-(-4.10096)));
            yy = -6.79108 + (((tickAnim - 51) / 49) * (0-(-6.79108)));
            zz = 1.70143 + (((tickAnim - 51) / 49) * (0-(1.70143)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0.3-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = 0.3 + (((tickAnim - 25) / 26) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = 0.3 + (((tickAnim - 51) / 49) * (0-(0.3)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (7-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 7 + (((tickAnim - 25) / 26) * (6.99154-(7)));
            yy = 0 + (((tickAnim - 25) / 26) * (0.50066-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (-1.93634-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 6.99154 + (((tickAnim - 51) / 49) * (0-(6.99154)));
            yy = 0.50066 + (((tickAnim - 51) / 49) * (0-(0.50066)));
            zz = -1.93634 + (((tickAnim - 51) / 49) * (0-(-1.93634)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.88646-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-12.60234-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.85133-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0.88646 + (((tickAnim - 8) / 17) * (-8.83664-(0.88646)));
            yy = -12.60234 + (((tickAnim - 8) / 17) * (15.48212-(-12.60234)));
            zz = -3.85133 + (((tickAnim - 8) / 17) * (6.80808-(-3.85133)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -8.83664 + (((tickAnim - 25) / 26) * (1.99058-(-8.83664)));
            yy = 15.48212 + (((tickAnim - 25) / 26) * (-1.74754-(15.48212)));
            zz = 6.80808 + (((tickAnim - 25) / 26) * (-4.61075-(6.80808)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 1.99058 + (((tickAnim - 51) / 49) * (0-(1.99058)));
            yy = -1.74754 + (((tickAnim - 51) / 49) * (0-(-1.74754)));
            zz = -4.61075 + (((tickAnim - 51) / 49) * (0-(-4.61075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0.4 + (((tickAnim - 25) / 26) * (0.4-(0.4)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            zz = 0.4 + (((tickAnim - 51) / 49) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 8 + (((tickAnim - 8) / 17) * (23-(8)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 23 + (((tickAnim - 25) / 26) * (23-(23)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 23 + (((tickAnim - 51) / 8) * (0-(23)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.6-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0.6 + (((tickAnim - 25) / 26) * (0.6-(0.6)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 8) * (-0.3-(0)));
            zz = 0.6 + (((tickAnim - 51) / 8) * (0-(0.6)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 59) / 3) * (-0.37-(-0.3)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            yy = -0.37 + (((tickAnim - 62) / 2) * (-0.15-(-0.37)));
            zz = 0 + (((tickAnim - 62) / 2) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 64) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 64) / 2) * (-0.25-(-0.15)));
            zz = 0 + (((tickAnim - 64) / 2) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 66) / 2) * (-0.15-(-0.25)));
            zz = 0 + (((tickAnim - 66) / 2) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 68) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 68) / 4) * (-0.27-(-0.15)));
            zz = 0 + (((tickAnim - 68) / 4) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 72) / 3) * (0-(0)));
            yy = -0.27 + (((tickAnim - 72) / 3) * (-0.15-(-0.27)));
            zz = 0 + (((tickAnim - 72) / 3) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 75) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 75) / 4) * (-0.25-(-0.15)));
            zz = 0 + (((tickAnim - 75) / 4) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 79) / 4) * (-0.15-(-0.25)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 83) / 5) * (0-(0)));
            yy = -0.15 + (((tickAnim - 83) / 5) * (-0.17-(-0.15)));
            zz = 0 + (((tickAnim - 83) / 5) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            yy = -0.17 + (((tickAnim - 88) / 12) * (0-(-0.17)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 8) / 17) * (-21-(-8)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -21 + (((tickAnim - 25) / 26) * (-21-(-21)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -21 + (((tickAnim - 51) / 8) * (13-(-21)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 100) {
            xx = 13 + (((tickAnim - 59) / 41) * (0-(13)));
            yy = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 8) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 51) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 8) / 51) * (-0.2-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            yy = -0.3 + (((tickAnim - 59) / 41) * (0-(-0.3)));
            zz = -0.2 + (((tickAnim - 59) / 41) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (21-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 21 + (((tickAnim - 25) / 26) * (21-(21)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 21 + (((tickAnim - 51) / 8) * (-24-(21)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -24 + (((tickAnim - 59) / 5) * (-4-(-24)));
            yy = 0 + (((tickAnim - 59) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 5) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 100) {
            xx = -4 + (((tickAnim - 64) / 36) * (0-(-4)));
            yy = 0 + (((tickAnim - 64) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 59 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 24.5 + (((tickAnim - 25) / 26) * (24.5-(24.5)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 24.5 + (((tickAnim - 51) / 8) * (0-(24.5)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 12) * (-0.4-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = -0.4 + (((tickAnim - 12) / 13) * (-1.25-(-0.4)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = -1.25 + (((tickAnim - 25) / 26) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            yy = -1.25 + (((tickAnim - 51) / 8) * (1.02-(-1.25)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            yy = 1.02 + (((tickAnim - 59) / 10) * (-0.1-(1.02)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 69) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 69) / 4) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 69) / 4) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 3) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 76) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 76) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 76) / 3) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 79) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 4) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 79) / 4) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 83) / 3) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 86) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 88) / 12) * (0-(0)));
            yy = -0.1 + (((tickAnim - 88) / 12) * (-0.175-(-0.1)));
            zz = 0 + (((tickAnim - 88) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -16 + (((tickAnim - 25) / 26) * (-16-(-16)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = -16 + (((tickAnim - 51) / 8) * (8.71-(-16)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = 8.71 + (((tickAnim - 59) / 10) * (-2-(8.71)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = -2 + (((tickAnim - 69) / 31) * (0-(-2)));
            yy = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 12 + (((tickAnim - 25) / 26) * (12-(12)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 59) {
            xx = 12 + (((tickAnim - 51) / 8) * (-13.03-(12)));
            yy = 0 + (((tickAnim - 51) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 8) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 69) {
            xx = -13.03 + (((tickAnim - 59) / 10) * (0-(-13.03)));
            yy = 0 + (((tickAnim - 59) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 10) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0.1);



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-19-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = -19 + (((tickAnim - 25) / 26) * (-19-(-19)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = -19 + (((tickAnim - 51) / 14) * (-11.71-(-19)));
            yy = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 14) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 69) {
            xx = -11.71 + (((tickAnim - 65) / 4) * (2.08-(-11.71)));
            yy = 0 + (((tickAnim - 65) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 4) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 2.08 + (((tickAnim - 69) / 31) * (0-(2.08)));
            yy = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 51) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 18) * (0.1-(0)));
            zz = 0 + (((tickAnim - 51) / 18) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            yy = 0.1 + (((tickAnim - 69) / 31) * (0-(0.1)));
            zz = 0 + (((tickAnim - 69) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 51) / 49) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 51) / 49) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(0);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(0);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(0);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(0);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(0);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(0);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 51) / 49) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));

        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(0);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(0);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 8 + (((tickAnim - 8) / 17) * (2.55-(8)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 2.55 + (((tickAnim - 25) / 26) * (2.55-(2.55)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 2.55 + (((tickAnim - 51) / 49) * (0-(2.55)));
            yy = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (1.3-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = -0.6 + (((tickAnim - 25) / 26) * (-0.6-(-0.6)));
            zz = 1.3 + (((tickAnim - 25) / 26) * (1.3-(1.3)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = -0.6 + (((tickAnim - 51) / 49) * (0-(-0.6)));
            zz = 1.3 + (((tickAnim - 51) / 49) * (0-(1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -8 + (((tickAnim - 8) / 17) * (10-(-8)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 10 + (((tickAnim - 25) / 26) * (10-(10)));
            yy = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 10 + (((tickAnim - 51) / 49) * (0-(10)));
            yy = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (-0.1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0-(0)));
            yy = -0.2 + (((tickAnim - 25) / 26) * (-0.2-(-0.2)));
            zz = -0.1 + (((tickAnim - 25) / 26) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 51 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 51) / 49) * (0-(0)));
            yy = -0.2 + (((tickAnim - 51) / 49) * (0-(-0.2)));
            zz = -0.1 + (((tickAnim - 51) / 49) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);
    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-10))*3), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+10))*3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 1) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+10))*-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+10))*-3), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);










        if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.69154 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.75-40))*-3-(-4.69154)));
            yy = -4.66982 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*5-(-4.66982)));
            zz = 2.2011 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75+30))*-3-(2.2011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.3)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+60))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75+90))*-3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+60))*3));

        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 13) / 0) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-70))*3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(11.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+30))*-6), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15 + (((tickAnim - 0) / 2) * (25.83333-(15)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 25.83333 + (((tickAnim - 2) / 1) * (27.5-(25.83333)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (32.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (10-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (-10-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 5) / 3) * (-17.5-(32.5)));
            yy = 10 + (((tickAnim - 5) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 5) / 3) * (-15-(-10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 8) / 2) * (-25-(-17.5)));
            yy = 10 + (((tickAnim - 8) / 2) * (5-(10)));
            zz = -15 + (((tickAnim - 8) / 2) * (-10-(-15)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 10) / 1) * (-12.5-(-25)));
            yy = 5 + (((tickAnim - 10) / 1) * (3.33333-(5)));
            zz = -10 + (((tickAnim - 10) / 1) * (-8.33333-(-10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 11) / 2) * (-2.5-(-12.5)));
            yy = 3.33333 + (((tickAnim - 11) / 2) * (0-(3.33333)));
            zz = -8.33333 + (((tickAnim - 11) / 2) * (-5-(-8.33333)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 13) / 2) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0.4 + (((tickAnim - 0) / 2) * (0.53-(0.4)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.53 + (((tickAnim - 2) / 1) * (0.5-(0.53)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.5-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0.5 + (((tickAnim - 5) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 1) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.4)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 11) / 1) * (-0.28-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 11) / 1) * (0.1-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 12) / 1) * (-0.5-(-0.28)));
            zz = 0.1 + (((tickAnim - 12) / 1) * (0.3-(0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 0) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.5)));
            zz = 0.3 + (((tickAnim - 13) / 0) * (0.6-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 13) / 2) * (0-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.6 + (((tickAnim - 13) / 2) * (0.4-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5 + (((tickAnim - 0) / 3) * (-2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (-60.05965-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.4239-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.46453-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.05965 + (((tickAnim - 5) / 3) * (-32.22845-(-60.05965)));
            yy = -0.4239 + (((tickAnim - 5) / 3) * (-0.36445-(-0.4239)));
            zz = -2.46453 + (((tickAnim - 5) / 3) * (-1.77222-(-2.46453)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.22845 + (((tickAnim - 8) / 2) * (0.04703-(-32.22845)));
            yy = -0.36445 + (((tickAnim - 8) / 2) * (-0.55262-(-0.36445)));
            zz = -1.77222 + (((tickAnim - 8) / 2) * (2.71402-(-1.77222)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.04703 + (((tickAnim - 10) / 1) * (-9.96865-(0.04703)));
            yy = -0.55262 + (((tickAnim - 10) / 1) * (-0.36842-(-0.55262)));
            zz = 2.71402 + (((tickAnim - 10) / 1) * (1.80935-(2.71402)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.96865 + (((tickAnim - 11) / 2) * (-15-(-9.96865)));
            yy = -0.36842 + (((tickAnim - 11) / 2) * (0-(-0.36842)));
            zz = 1.80935 + (((tickAnim - 11) / 2) * (0-(1.80935)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 13) / 2) * (-5-(-15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 9.25 + (((tickAnim - 0) / 3) * (11.25-(9.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.25 + (((tickAnim - 3) / 2) * (50.75-(11.25)));
            yy = 5 + (((tickAnim - 3) / 2) * (0-(5)));
            zz = 5 + (((tickAnim - 3) / 2) * (0-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 50.75 + (((tickAnim - 5) / 3) * (36.25-(50.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 36.25 + (((tickAnim - 8) / 2) * (0-(36.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (9.25-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -42 + (((tickAnim - 0) / 1) * (-21.66667-(-42)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = -10 + (((tickAnim - 0) / 1) * (-10-(-10)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -21.66667 + (((tickAnim - 1) / 2) * (-10-(-21.66667)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 1) / 2) * (-10-(-10)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 3) / 2) * (15-(-10)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 3) / 2) * (-5-(-10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (25-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 10) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -10 + (((tickAnim - 10) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 13) / 2) * (-42-(-30)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -1.5 + (((tickAnim - 0) / 1) * (-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 1) / 1) * (-0.28-(-1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.28 + (((tickAnim - 2) / 1) * (-0.6-(-0.28)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 0) * (-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.6)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 3) / 2) * (-0.5-(-0.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 5) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 10) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31 + (((tickAnim - 0) / 1) * (19.66667-(31)));
            yy = -5 + (((tickAnim - 0) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 0) / 1) * (5-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.66667 + (((tickAnim - 1) / 1) * (12.83333-(19.66667)));
            yy = -5 + (((tickAnim - 1) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 1) / 1) * (5-(5)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.83333 + (((tickAnim - 2) / 1) * (12-(12.83333)));
            yy = -5 + (((tickAnim - 2) / 1) * (-5-(-5)));
            zz = 5 + (((tickAnim - 2) / 1) * (5-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12 + (((tickAnim - 3) / 2) * (-2.5-(12)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 5 + (((tickAnim - 3) / 2) * (5-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (17.5-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (0-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.5 + (((tickAnim - 8) / 2) * (34.66284-(17.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.95085-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (4.44344-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.66284 + (((tickAnim - 10) / 3) * (22.40747-(34.66284)));
            yy = 1.95085 + (((tickAnim - 10) / 3) * (2.89034-(1.95085)));
            zz = 4.44344 + (((tickAnim - 10) / 3) * (8.65534-(4.44344)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.40747 + (((tickAnim - 13) / 2) * (31-(22.40747)));
            yy = 2.89034 + (((tickAnim - 13) / 2) * (-5-(2.89034)));
            zz = 8.65534 + (((tickAnim - 13) / 2) * (5-(8.65534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 8.5 + (((tickAnim - 0) / 1) * (-0.90424-(8.5)));
            yy = 2.5 + (((tickAnim - 0) / 1) * (1.37761-(2.5)));
            zz = 5 + (((tickAnim - 0) / 1) * (3.35853-(5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.90424 + (((tickAnim - 1) / 1) * (1.69153-(-0.90424)));
            yy = 1.37761 + (((tickAnim - 1) / 1) * (0.25522-(1.37761)));
            zz = 3.35853 + (((tickAnim - 1) / 1) * (1.71706-(3.35853)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.69153 + (((tickAnim - 2) / 1) * (-5.46271-(1.69153)));
            yy = 0.25522 + (((tickAnim - 2) / 1) * (-0.86717-(0.25522)));
            zz = 1.71706 + (((tickAnim - 2) / 1) * (0.07558-(1.71706)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -5.46271 + (((tickAnim - 3) / 0) * (-7.47514-(-5.46271)));
            yy = -0.86717 + (((tickAnim - 3) / 0) * (-0.57811-(-0.86717)));
            zz = 0.07558 + (((tickAnim - 3) / 0) * (0.05039-(0.07558)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.47514 + (((tickAnim - 3) / 2) * (-3-(-7.47514)));
            yy = -0.57811 + (((tickAnim - 3) / 2) * (0-(-0.57811)));
            zz = 0.05039 + (((tickAnim - 3) / 2) * (0-(0.05039)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (40-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40 + (((tickAnim - 8) / 2) * (47.5-(40)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 47.5 + (((tickAnim - 10) / 3) * (22.5-(47.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 13) / 2) * (8.5-(22.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (2.5-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 4 + (((tickAnim - 0) / 5) * (0-(4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (18-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 18 + (((tickAnim - 8) / 4) * (-16-(18)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -16 + (((tickAnim - 12) / 1) * (-16.67-(-16)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -16.67 + (((tickAnim - 13) / 2) * (4-(-16.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (-7.5-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -7.5 + (((tickAnim - 3) / 3) * (-30-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 10 + (((tickAnim - 3) / 3) * (10-(10)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 6) / 2) * (-41.52976-(-30)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 6) / 2) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -41.52976 + (((tickAnim - 8) / 0) * (-23.33333-(-41.52976)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 0) * (10-(10)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -23.33333 + (((tickAnim - 8) / 2) * (-21.66667-(-23.33333)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 8) / 2) * (10-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -21.66667 + (((tickAnim - 10) / 1) * (-15-(-21.66667)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 1) * (10-(10)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -15 + (((tickAnim - 11) / 2) * (15-(-15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 10 + (((tickAnim - 11) / 2) * (5-(10)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (25-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 2) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (1-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 6) / 2) * (-1.5-(1)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -1.5 + (((tickAnim - 8) / 0) * (-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(-1.5)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 8) / 1) * (-0.72-(-0.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -0.72 + (((tickAnim - 9) / 1) * (-1-(-0.72)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 1) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 11) / 2) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 2) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5 + (((tickAnim - 0) / 3) * (34.71686-(17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5.66716-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 34.71686 + (((tickAnim - 3) / 3) * (22.40747-(34.71686)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -5.66716 + (((tickAnim - 3) / 3) * (-8.65534-(-5.66716)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 22.40747 + (((tickAnim - 6) / 2) * (31.71919-(22.40747)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = -8.65534 + (((tickAnim - 6) / 2) * (-6.44947-(-8.65534)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 31.71919 + (((tickAnim - 8) / 0) * (22.33333-(31.71919)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -6.44947 + (((tickAnim - 8) / 0) * (-5-(-6.44947)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 22.33333 + (((tickAnim - 8) / 1) * (16.66667-(22.33333)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 16.66667 + (((tickAnim - 9) / 1) * (18-(16.66667)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 9) / 1) * (-5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 10) / 3) * (17.5-(18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 13) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 13) / 2) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 0) / 3) * (47.5-(40)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 47.5 + (((tickAnim - 3) / 3) * (13.5-(47.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 6) / 2) * (11.79448-(13.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.96731-(0)));
            zz = -5 + (((tickAnim - 6) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 11.79448 + (((tickAnim - 8) / 0) * (0.96161-(11.79448)));
            yy = -0.96731 + (((tickAnim - 8) / 0) * (-0.93627-(-0.96731)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.75037-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.96161 + (((tickAnim - 8) / 1) * (4.12874-(0.96161)));
            yy = -0.93627 + (((tickAnim - 8) / 1) * (-0.90523-(-0.93627)));
            zz = -3.75037 + (((tickAnim - 8) / 1) * (-2.50075-(-3.75037)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 4.12874 + (((tickAnim - 9) / 1) * (-4.5-(4.12874)));
            yy = -0.90523 + (((tickAnim - 9) / 1) * (0-(-0.90523)));
            zz = -2.50075 + (((tickAnim - 9) / 1) * (-5-(-2.50075)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 10) / 3) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 10) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 8) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 11) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14 + (((tickAnim - 0) / 4) * (-18-(14)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -18 + (((tickAnim - 4) / 2) * (-16-(-18)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 6) / 2) * (0-(-16)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (14-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*-3));

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 1) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1 + (((tickAnim - 10) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.1)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.75-120))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.5 + (((tickAnim - 3) / 2) * (6.25-(12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 5) / 3) * (32.75-(6.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32.75 + (((tickAnim - 8) / 2) * (-1.75-(32.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.75 + (((tickAnim - 10) / 3) * (0-(-1.75)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (0-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 11) / 2) * (0-(0.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm4.rotationPointX = this.leftArm4.rotationPointX + (float)(xx);
        this.leftArm4.rotationPointY = this.leftArm4.rotationPointY - (float)(yy);
        this.leftArm4.rotationPointZ = this.leftArm4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (-22.5-(-17.5)));
            yy = -10 + (((tickAnim - 0) / 3) * (-5-(-10)));
            zz = 15 + (((tickAnim - 0) / 3) * (10-(15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-2.5-(-22.5)));
            yy = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
            zz = 10 + (((tickAnim - 3) / 2) * (5-(10)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 5) / 3) * (15-(-2.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 5) / 3) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (25-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 0) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25 + (((tickAnim - 8) / 2) * (22.5-(25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.5 + (((tickAnim - 10) / 3) * (32.5-(22.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-10-(0)));
            zz = 5 + (((tickAnim - 10) / 3) * (10-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (-17.5-(32.5)));
            yy = -10 + (((tickAnim - 13) / 2) * (-10-(-10)));
            zz = 10 + (((tickAnim - 13) / 2) * (15-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 0) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2-(0.25)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2 + (((tickAnim - 3) / 2) * (-0.8-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.2)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 1) * (-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5-(-0.8)));
            zz = 0.4 + (((tickAnim - 5) / 1) * (0.3-(0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5 + (((tickAnim - 6) / 2) * (0.2-(-0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.5)));
            zz = 0.3 + (((tickAnim - 6) / 2) * (0.4-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 2) * (0-(0.2)));
            zz = 0.4 + (((tickAnim - 8) / 2) * (0.6-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.6 + (((tickAnim - 10) / 3) * (0.5-(0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 2) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.22845 + (((tickAnim - 0) / 3) * (-7.45297-(-32.22845)));
            yy = 0.36445 + (((tickAnim - 0) / 3) * (0.55262-(0.36445)));
            zz = 1.77222 + (((tickAnim - 0) / 3) * (-2.71402-(1.77222)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.45297 + (((tickAnim - 3) / 2) * (-15-(-7.45297)));
            yy = 0.55262 + (((tickAnim - 3) / 2) * (0-(0.55262)));
            zz = -2.71402 + (((tickAnim - 3) / 2) * (0-(-2.71402)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 5) / 3) * (0-(-15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 0) * (-3.33333-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3.33333 + (((tickAnim - 8) / 2) * (0-(-3.33333)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2.5 + (((tickAnim - 10) / 3) * (-43.80965-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.4239-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (2.46453-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -43.80965 + (((tickAnim - 13) / 2) * (-32.22845-(-43.80965)));
            yy = 0.4239 + (((tickAnim - 13) / 2) * (0.36445-(0.4239)));
            zz = 2.46453 + (((tickAnim - 13) / 2) * (1.77222-(2.46453)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39 + (((tickAnim - 0) / 3) * (18.25-(39)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 18.25 + (((tickAnim - 3) / 2) * (17.5-(18.25)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (-5-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 5) / 3) * (-2.5-(17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (25.28227-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-2.68526-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-2.68526-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25.28227 + (((tickAnim - 10) / 3) * (27.5-(25.28227)));
            yy = -2.68526 + (((tickAnim - 10) / 3) * (0-(-2.68526)));
            zz = -2.68526 + (((tickAnim - 10) / 3) * (0-(-2.68526)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 27.5 + (((tickAnim - 13) / 2) * (39-(27.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31 + (((tickAnim - 0) / 3) * (-4-(31)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4 + (((tickAnim - 3) / 2) * (0-(-4)));
            yy = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (21.25-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 21.25 + (((tickAnim - 13) / 2) * (31-(21.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm4.rotationPointX = this.rightArm4.rotationPointX + (float)(xx);
        this.rightArm4.rotationPointY = this.rightArm4.rotationPointY - (float)(yy);
        this.rightArm4.rotationPointZ = this.rightArm4.rotationPointZ + (float)(zz);
    }



    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMymoorapelta entity = (EntityPrehistoricFloraMymoorapelta) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3.5));

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 0) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 9) / 11) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5 + (((tickAnim - 20) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 0) / 4) * (-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999)));
        }
        else if (tickAnim >= 4 && tickAnim < 40) {
            xx = -0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2 + (((tickAnim - 4) / 36) * (-0.0089+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2-(-0.1384+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-10))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.0002-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-3.4772)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035 + (((tickAnim - 4) / 36) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-2.9999-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+20))*-0.035)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.1)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-10))*-3.051), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-2.878), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+99))*-3.62));

        if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 4) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 26) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*-3));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*4 + (((tickAnim - 0) / 40) * (5.5-(5.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*4)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 0) / 4) * (-6.25-(27.5)));
            yy = 10 + (((tickAnim - 0) / 4) * (10-(10)));
            zz = -10 + (((tickAnim - 0) / 4) * (-10-(-10)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.25 + (((tickAnim - 4) / 3) * (-17.5-(-6.25)));
            yy = 10 + (((tickAnim - 4) / 3) * (10-(10)));
            zz = -10 + (((tickAnim - 4) / 3) * (-10-(-10)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -17.5 + (((tickAnim - 7) / 5) * (-22.5-(-17.5)));
            yy = 10 + (((tickAnim - 7) / 5) * (0-(10)));
            zz = -10 + (((tickAnim - 7) / 5) * (-5-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -22.5 + (((tickAnim - 12) / 10) * (10-(-22.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = -5 + (((tickAnim - 12) / 10) * (-2.5-(-5)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 22) / 4) * (17.75-(10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 22) / 4) * (-0.75-(-2.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 17.75 + (((tickAnim - 26) / 2) * (17.5-(17.75)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = -0.75 + (((tickAnim - 26) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 28) / 7) * (32.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (2.5-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 32.5 + (((tickAnim - 35) / 5) * (27.5-(32.5)));
            yy = 2.5 + (((tickAnim - 35) / 5) * (10-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 5) * (-10-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.5 + (((tickAnim - 0) / 7) * (0.2-(0.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (-1.07-(0)));
            zz = 0.2 + (((tickAnim - 7) / 3) * (0.2-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -1.07 + (((tickAnim - 10) / 2) * (-1.375-(-1.07)));
            zz = 0.2 + (((tickAnim - 10) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -1.375 + (((tickAnim - 12) / 5) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-1.375)));
            zz = 0.2 + (((tickAnim - 12) / 5) * (0.975-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 17) / 5) * (-0.9-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.975 + (((tickAnim - 17) / 5) * (0.9-(0.975)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = -0.9 + (((tickAnim - 22) / 4) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2-(-0.9)));
            zz = 0.9 + (((tickAnim - 22) / 4) * (1.15-(0.9)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2 + (((tickAnim - 26) / 2) * (-1.3-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.2)));
            zz = 1.15 + (((tickAnim - 26) / 2) * (1-(1.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 4) * (-0.6-(-1.3)));
            zz = 1 + (((tickAnim - 28) / 4) * (0.8-(1)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = -0.6 + (((tickAnim - 32) / 3) * (-0.3-(-0.6)));
            zz = 0.8 + (((tickAnim - 32) / 3) * (0.8-(0.8)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 35) / 5) * (0-(-0.3)));
            zz = 0.8 + (((tickAnim - 35) / 5) * (0.5-(0.8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -33.5482 + (((tickAnim - 0) / 4) * (-26.62249-(-33.5482)));
            yy = 1.69871 + (((tickAnim - 0) / 4) * (-0.72162-(1.69871)));
            zz = -2.10316 + (((tickAnim - 0) / 4) * (-2.21221-(-2.10316)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = -26.62249 + (((tickAnim - 4) / 8) * (-15.21694-(-26.62249)));
            yy = -0.72162 + (((tickAnim - 4) / 8) * (2.69952-(-0.72162)));
            zz = -2.21221 + (((tickAnim - 4) / 8) * (0.7854-(-2.21221)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -15.21694 + (((tickAnim - 12) / 4) * (-17.46178-(-15.21694)));
            yy = 2.69952 + (((tickAnim - 12) / 4) * (2.31367-(2.69952)));
            zz = 0.7854 + (((tickAnim - 12) / 4) * (-0.66643-(0.7854)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -17.46178 + (((tickAnim - 16) / 4) * (-19.20662-(-17.46178)));
            yy = 2.31367 + (((tickAnim - 16) / 4) * (1.92782-(2.31367)));
            zz = -0.66643 + (((tickAnim - 16) / 4) * (-2.11825-(-0.66643)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -19.20662 + (((tickAnim - 20) / 3) * (-12.03671-(-19.20662)));
            yy = 1.92782 + (((tickAnim - 20) / 3) * (1.52284-(1.92782)));
            zz = -2.11825 + (((tickAnim - 20) / 3) * (-1.67327-(-2.11825)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -12.03671 + (((tickAnim - 23) / 3) * (-4.61198-(-12.03671)));
            yy = 1.52284 + (((tickAnim - 23) / 3) * (0.57834-(1.52284)));
            zz = -1.67327 + (((tickAnim - 23) / 3) * (-0.63547-(-1.67327)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -4.61198 + (((tickAnim - 26) / 2) * (-1.14865-(-4.61198)));
            yy = 0.57834 + (((tickAnim - 26) / 2) * (1.03378-(0.57834)));
            zz = -0.63547 + (((tickAnim - 26) / 2) * (-0.50342-(-0.63547)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.14865 + (((tickAnim - 28) / 5) * (-7.77427-(-1.14865)));
            yy = 1.03378 + (((tickAnim - 28) / 5) * (1.66393-(1.03378)));
            zz = -0.50342 + (((tickAnim - 28) / 5) * (-0.32071-(-0.50342)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -7.77427 + (((tickAnim - 33) / 4) * (-23.18327-(-7.77427)));
            yy = 1.66393 + (((tickAnim - 33) / 4) * (3.5637-(1.66393)));
            zz = -0.32071 + (((tickAnim - 33) / 4) * (0.23014-(-0.32071)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -23.18327 + (((tickAnim - 37) / 3) * (-33.5482-(-23.18327)));
            yy = 3.5637 + (((tickAnim - 37) / 3) * (1.69871-(3.5637)));
            zz = 0.23014 + (((tickAnim - 37) / 3) * (-2.10316-(0.23014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 12) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 12) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0.2)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 16) / 4) * (0.2-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.2)));
            zz = 0.2 + (((tickAnim - 20) / 4) * (0.1-(0.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 24) / 2) * (0.17-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.1 + (((tickAnim - 24) / 2) * (0.08-(0.1)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.17 + (((tickAnim - 26) / 2) * (0.3-(0.17)));
            zz = 0.08 + (((tickAnim - 26) / 2) * (0.3-(0.08)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 28) / 7) * (0.8-(0.3)));
            zz = 0.3 + (((tickAnim - 28) / 7) * (0.2-(0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 35) / 5) * (0.2-(0.8)));
            zz = 0.2 + (((tickAnim - 35) / 5) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 51.5 + (((tickAnim - 0) / 7) * (35-(51.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 35 + (((tickAnim - 7) / 2) * (20.23391-(35)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.69237-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.33078-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 20.23391 + (((tickAnim - 9) / 3) * (33.46783-(20.23391)));
            yy = -0.69237 + (((tickAnim - 9) / 3) * (-1.38475-(-0.69237)));
            zz = 1.33078 + (((tickAnim - 9) / 3) * (2.66155-(1.33078)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 33.46783 + (((tickAnim - 12) / 8) * (10.98436-(33.46783)));
            yy = -1.38475 + (((tickAnim - 12) / 8) * (-0.75155-(-1.38475)));
            zz = 2.66155 + (((tickAnim - 12) / 8) * (2.38443-(2.66155)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.98436 + (((tickAnim - 20) / 5) * (-2.45469-(10.98436)));
            yy = -0.75155 + (((tickAnim - 20) / 5) * (-0.22546-(-0.75155)));
            zz = 2.38443 + (((tickAnim - 20) / 5) * (0.71533-(2.38443)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -2.45469 + (((tickAnim - 25) / 3) * (-2.5-(-2.45469)));
            yy = -0.22546 + (((tickAnim - 25) / 3) * (0-(-0.22546)));
            zz = 0.71533 + (((tickAnim - 25) / 3) * (0-(0.71533)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 28) / 7) * (42.5-(-2.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 42.5 + (((tickAnim - 35) / 5) * (51.5-(42.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3 + (((tickAnim - 0) / 5) * (30-(-3)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 5) / 5) * (-8.5-(30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -8.5 + (((tickAnim - 10) / 4) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (9.5-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 9.5 + (((tickAnim - 18) / 3) * (4.5-(9.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 4.5 + (((tickAnim - 21) / 2) * (-0.5-(4.5)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -0.5 + (((tickAnim - 23) / 3) * (-3-(-0.5)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm4, leftArm4.rotateAngleX + (float) Math.toRadians(xx), leftArm4.rotateAngleY + (float) Math.toRadians(yy), leftArm4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -44.5 + (((tickAnim - 0) / 4) * (-23.03301-(-44.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -23.03301 + (((tickAnim - 4) / 4) * (-10-(-23.03301)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 4) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -10 + (((tickAnim - 8) / 9) * (11-(-10)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -5 + (((tickAnim - 8) / 9) * (0-(-5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 17) / 3) * (15-(11)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 20) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = -5 + (((tickAnim - 20) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -22.5 + (((tickAnim - 28) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = -5 + (((tickAnim - 28) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -37.5 + (((tickAnim - 33) / 4) * (-35.5-(-37.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 33) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -35.5 + (((tickAnim - 37) / 3) * (-44.5-(-35.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 37) / 3) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 3) * (-0.56-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.56 + (((tickAnim - 3) / 1) * (0.4-(-0.56)));
            zz = -0.15 + (((tickAnim - 3) / 1) * (-0.25-(-0.15)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 4) / 4) * (-0.475-(0.4)));
            zz = -0.25 + (((tickAnim - 4) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.475 + (((tickAnim - 8) / 5) * (-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.475)));
            zz = -0.5 + (((tickAnim - 8) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 13) / 4) * (-0.5-(-0.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 13) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 9) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 27.5 + (((tickAnim - 0) / 4) * (17.25-(27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 17.25 + (((tickAnim - 4) / 4) * (13-(17.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 13 + (((tickAnim - 8) / 9) * (6.81734-(13)));
            yy = 0 + (((tickAnim - 8) / 9) * (2.27304-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (-1.63154-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 6.81734 + (((tickAnim - 17) / 6) * (25.10922-(6.81734)));
            yy = 2.27304 + (((tickAnim - 17) / 6) * (2.46671-(2.27304)));
            zz = -1.63154 + (((tickAnim - 17) / 6) * (1.45998-(-1.63154)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 25.10922 + (((tickAnim - 23) / 5) * (36.50144-(25.10922)));
            yy = 2.46671 + (((tickAnim - 23) / 5) * (3.23554-(2.46671)));
            zz = 1.45998 + (((tickAnim - 23) / 5) * (-0.22309-(1.45998)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 36.50144 + (((tickAnim - 28) / 5) * (37.83252-(36.50144)));
            yy = 3.23554 + (((tickAnim - 28) / 5) * (3.33317-(3.23554)));
            zz = -0.22309 + (((tickAnim - 28) / 5) * (0.57399-(-0.22309)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 37.83252 + (((tickAnim - 33) / 4) * (22.59171-(37.83252)));
            yy = 3.33317 + (((tickAnim - 33) / 4) * (3.39042-(3.33317)));
            zz = 0.57399 + (((tickAnim - 33) / 4) * (4.6193-(0.57399)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 22.59171 + (((tickAnim - 37) / 3) * (27.5-(22.59171)));
            yy = 3.39042 + (((tickAnim - 37) / 3) * (0-(3.39042)));
            zz = 4.6193 + (((tickAnim - 37) / 3) * (0-(4.6193)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17.98072 + (((tickAnim - 0) / 4) * (7.49527-(17.98072)));
            yy = 0.95645 + (((tickAnim - 0) / 4) * (0.21782-(0.95645)));
            zz = 2.69009 + (((tickAnim - 0) / 4) * (2.5095-(2.69009)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.49527 + (((tickAnim - 4) / 4) * (-2.99294-(7.49527)));
            yy = 0.21782 + (((tickAnim - 4) / 4) * (-0.32621-(0.21782)));
            zz = 2.5095 + (((tickAnim - 4) / 4) * (2.52136-(2.5095)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2.99294 + (((tickAnim - 8) / 9) * (12.5-(-2.99294)));
            yy = -0.32621 + (((tickAnim - 8) / 9) * (0-(-0.32621)));
            zz = 2.52136 + (((tickAnim - 8) / 9) * (0-(2.52136)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 17) / 6) * (49-(12.5)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 49 + (((tickAnim - 23) / 7) * (7.5-(49)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 7.5 + (((tickAnim - 30) / 7) * (5-(7.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 37) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0.95645-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (2.69009-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 13) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 9) / 8) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -4.5 + (((tickAnim - 17) / 5) * (7-(-4.5)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 22) / 6) * (11-(7)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 11 + (((tickAnim - 28) / 6) * (-22.5-(11)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 34) / 6) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 0) / 6) * (-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 0) / 6) * (-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 0) / 6) * (-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 6 && tickAnim < 19) {
            xx = -0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 6) / 13) * (-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1716+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 6) / 13) * (-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0789+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 6) / 13) * (-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-2.5046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 19) / 5) * (-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-0.1461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 19) / 5) * (-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-0.0554+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = -0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 19) / 5) * (2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(-0.0046+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3 + (((tickAnim - 24) / 8) * (-3.35325-(-0.2809+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3)));
            yy = -0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 24) / 8) * (-4.59467-(-0.0296+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 24) / 8) * (0.91332-(2.4989+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.35325 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+60))*3-(-3.35325)));
            yy = -4.59467 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(-4.59467)));
            zz = 0.91332 + (((tickAnim - 32) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(0.91332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*7.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*3), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.rotationPointX = this.Tail4.rotationPointX + (float)(xx);
        this.Tail4.rotationPointY = this.Tail4.rotationPointY - (float)(yy);
        this.Tail4.rotationPointZ = this.Tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 0) / 8) * (-22.5-(15)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 0) / 8) * (5-(5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -22.5 + (((tickAnim - 8) / 5) * (-37.5-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 5 + (((tickAnim - 8) / 5) * (5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -37.5 + (((tickAnim - 13) / 4) * (-32.5-(-37.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 13) / 4) * (5-(5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 17) / 3) * (-40.5-(-32.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 17) / 3) * (5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -40.5 + (((tickAnim - 20) / 4) * (-16.25-(-40.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 20) / 4) * (5-(5)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -16.25 + (((tickAnim - 24) / 4) * (-10-(-16.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 24) / 4) * (5-(5)));
        }
        else if (tickAnim >= 28 && tickAnim < 37) {
            xx = -10 + (((tickAnim - 28) / 9) * (12.5-(-10)));
            yy = 0 + (((tickAnim - 28) / 9) * (0-(0)));
            zz = 5 + (((tickAnim - 28) / 9) * (0-(5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 12.5 + (((tickAnim - 37) / 3) * (15-(12.5)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.65 + (((tickAnim - 20) / 4) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.75-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25 + (((tickAnim - 24) / 4) * (-0.5-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.25)));
            zz = -0.75 + (((tickAnim - 24) / 4) * (-0.5-(-0.75)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.5 + (((tickAnim - 28) / 5) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5-(-0.5)));
            zz = -0.5 + (((tickAnim - 28) / 5) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5 + (((tickAnim - 33) / 4) * (-0.5-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.5)));
            zz = -0.25 + (((tickAnim - 33) / 4) * (0-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 37) / 3) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 0) / 8) * (36.47058-(25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.38152-(0)));
            zz = -5 + (((tickAnim - 0) / 8) * (-5.09528-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 36.47058 + (((tickAnim - 8) / 9) * (19.91451-(36.47058)));
            yy = -1.38152 + (((tickAnim - 8) / 9) * (0-(-1.38152)));
            zz = -5.09528 + (((tickAnim - 8) / 9) * (-8.74877-(-5.09528)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 19.91451 + (((tickAnim - 17) / 3) * (24.5-(19.91451)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -8.74877 + (((tickAnim - 17) / 3) * (0-(-8.74877)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 24.5 + (((tickAnim - 20) / 4) * (17.25-(24.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 17.25 + (((tickAnim - 24) / 4) * (12-(17.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 28) / 5) * (4.5-(12)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 4.5 + (((tickAnim - 33) / 4) * (15.01256-(4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (1.43344-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (1.00397-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 15.01256 + (((tickAnim - 37) / 3) * (25-(15.01256)));
            yy = 1.43344 + (((tickAnim - 37) / 3) * (0-(1.43344)));
            zz = 1.00397 + (((tickAnim - 37) / 3) * (-5-(1.00397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.1-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.3)));
            zz = -0.1 + (((tickAnim - 24) / 4) * (0-(-0.1)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 0) / 8) * (17.5-(35)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.5 + (((tickAnim - 8) / 5) * (0.5-(17.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.5 + (((tickAnim - 13) / 4) * (5-(0.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 17) / 3) * (17.98072-(5)));
            yy = 0 + (((tickAnim - 17) / 3) * (-0.95645-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-2.69009-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 17.98072 + (((tickAnim - 20) / 4) * (1.49527-(17.98072)));
            yy = -0.95645 + (((tickAnim - 20) / 4) * (-0.21782-(-0.95645)));
            zz = -2.69009 + (((tickAnim - 20) / 4) * (-2.5095-(-2.69009)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.49527 + (((tickAnim - 24) / 4) * (-1.99294-(1.49527)));
            yy = -0.21782 + (((tickAnim - 24) / 4) * (0.32621-(-0.21782)));
            zz = -2.5095 + (((tickAnim - 24) / 4) * (-2.52136-(-2.5095)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -1.99294 + (((tickAnim - 28) / 5) * (-4.5-(-1.99294)));
            yy = 0.32621 + (((tickAnim - 28) / 5) * (0-(0.32621)));
            zz = -2.52136 + (((tickAnim - 28) / 5) * (-2.5-(-2.52136)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -4.5 + (((tickAnim - 33) / 4) * (8-(-4.5)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 33) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 37) / 3) * (35-(8)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25 + (((tickAnim - 24) / 4) * (0-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 33) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 0) / 16) * (-16.25-(13)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -16.25 + (((tickAnim - 16) / 4) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 33) / 7) * (13-(2)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 0) / 8) * (15-(10)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 2.5 + (((tickAnim - 0) / 8) * (0-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (27.5-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (2.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 27.5 + (((tickAnim - 15) / 5) * (27.5-(27.5)));
            yy = -2.5 + (((tickAnim - 15) / 5) * (-10-(-2.5)));
            zz = 2.5 + (((tickAnim - 15) / 5) * (10-(2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 27.5 + (((tickAnim - 20) / 8) * (-22.5-(27.5)));
            yy = -10 + (((tickAnim - 20) / 8) * (-10-(-10)));
            zz = 10 + (((tickAnim - 20) / 8) * (10-(10)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -22.5 + (((tickAnim - 28) / 4) * (-12-(-22.5)));
            yy = -10 + (((tickAnim - 28) / 4) * (0-(-10)));
            zz = 10 + (((tickAnim - 28) / 4) * (5-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -12 + (((tickAnim - 32) / 8) * (10-(-12)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 5 + (((tickAnim - 32) / 8) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.9 + (((tickAnim - 0) / 2) * (-1.23-(-0.9)));
            zz = 1.2 + (((tickAnim - 0) / 2) * (1.675-(1.2)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -1.23 + (((tickAnim - 2) / 2) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(-1.23)));
            zz = 1.675 + (((tickAnim - 2) / 2) * (1.575-(1.675)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 4) / 3) * (-0.735-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = 1.575 + (((tickAnim - 4) / 3) * (1.7-(1.575)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.735 + (((tickAnim - 7) / 1) * (-0.8-(-0.735)));
            zz = 1.7 + (((tickAnim - 7) / 1) * (1.55-(1.7)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.8 + (((tickAnim - 8) / 2) * (-0.4-(-0.8)));
            zz = 1.55 + (((tickAnim - 8) / 2) * (0.8-(1.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.4 + (((tickAnim - 10) / 5) * (-0.125-(-0.4)));
            zz = 0.8 + (((tickAnim - 10) / 5) * (0.8-(0.8)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 15) / 5) * (0-(-0.125)));
            zz = 0.8 + (((tickAnim - 15) / 5) * (0.6-(0.8)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (-0.875-(0)));
            zz = 0.6 + (((tickAnim - 20) / 8) * (0.675-(0.6)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = -0.875 + (((tickAnim - 28) / 4) * (-1.075-(-0.875)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (1-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -1.075 + (((tickAnim - 32) / 1) * (-0.9-(-1.075)));
            zz = 1 + (((tickAnim - 32) / 1) * (0.75-(1)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = -0.9 + (((tickAnim - 33) / 3) * (-0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(-0.9)));
            zz = 0.75 + (((tickAnim - 33) / 3) * (0.7-(0.75)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            yy = -0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 36) / 2) * (-0.835-(-0.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0.7 + (((tickAnim - 36) / 2) * (0.825-(0.7)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = -0.835 + (((tickAnim - 38) / 2) * (-0.9-(-0.835)));
            zz = 0.825 + (((tickAnim - 38) / 2) * (1.2-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.58426 + (((tickAnim - 0) / 8) * (2.5-(-12.58426)));
            yy = -1.16329 + (((tickAnim - 0) / 8) * (0-(-1.16329)));
            zz = -0.2855 + (((tickAnim - 0) / 8) * (0-(-0.2855)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 8) / 8) * (-12.89782-(2.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (-3.63642-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.62082-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -12.89782 + (((tickAnim - 16) / 4) * (-38.25909-(-12.89782)));
            yy = -3.63642 + (((tickAnim - 16) / 4) * (-4.09833-(-3.63642)));
            zz = 0.62082 + (((tickAnim - 16) / 4) * (7.48039-(0.62082)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -38.25909 + (((tickAnim - 20) / 8) * (-25.22536-(-38.25909)));
            yy = -4.09833 + (((tickAnim - 20) / 8) * (1.41179-(-4.09833)));
            zz = 7.48039 + (((tickAnim - 20) / 8) * (2.86574-(7.48039)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.22536 + (((tickAnim - 28) / 4) * (-16.21678-(-25.22536)));
            yy = 1.41179 + (((tickAnim - 28) / 4) * (-2.66269-(1.41179)));
            zz = 2.86574 + (((tickAnim - 28) / 4) * (-0.76204-(2.86574)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -16.21678 + (((tickAnim - 32) / 8) * (-12.58426-(-16.21678)));
            yy = -2.66269 + (((tickAnim - 32) / 8) * (-1.16329-(-2.66269)));
            zz = -0.76204 + (((tickAnim - 32) / 8) * (-0.2855-(-0.76204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 4) * (0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(0.1)));
            zz = 0.3 + (((tickAnim - 0) / 4) * (0.2-(0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 4) / 3) * (-0.065-(0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = 0.2 + (((tickAnim - 4) / 3) * (-0.085-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.065 + (((tickAnim - 7) / 1) * (0.3-(-0.065)));
            zz = -0.085 + (((tickAnim - 7) / 1) * (0.1-(-0.085)));
        }
        else if (tickAnim >= 8 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 8) / 24) * (0-(0)));
            yy = 0.3 + (((tickAnim - 8) / 24) * (0-(0.3)));
            zz = 0.1 + (((tickAnim - 8) / 24) * (0-(0.1)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 2.4972 + (((tickAnim - 0) / 4) * (-5.31659-(2.4972)));
            yy = 0.342 + (((tickAnim - 0) / 4) * (0.18155-(0.342)));
            zz = -0.9397 + (((tickAnim - 0) / 4) * (-0.97202-(-0.9397)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.31659 + (((tickAnim - 4) / 3) * (-12.10056-(-5.31659)));
            yy = 0.18155 + (((tickAnim - 4) / 3) * (0.0684-(0.18155)));
            zz = -0.97202 + (((tickAnim - 4) / 3) * (-0.18794-(-0.97202)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -12.10056 + (((tickAnim - 7) / 1) * (-12-(-12.10056)));
            yy = 0.0684 + (((tickAnim - 7) / 1) * (0-(0.0684)));
            zz = -0.18794 + (((tickAnim - 7) / 1) * (0-(-0.18794)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (2.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 2.25 + (((tickAnim - 10) / 2) * (8.17-(2.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 8.17 + (((tickAnim - 12) / 3) * (24-(8.17)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 24 + (((tickAnim - 15) / 5) * (34.75-(24)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 34.75 + (((tickAnim - 20) / 5) * (40.08-(34.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 40.08 + (((tickAnim - 25) / 3) * (26.75-(40.08)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 26.75 + (((tickAnim - 28) / 4) * (24.97476-(26.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (1.02565-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (-2.81938-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 24.97476 + (((tickAnim - 32) / 8) * (2.4972-(24.97476)));
            yy = 1.02565 + (((tickAnim - 32) / 8) * (0.342-(1.02565)));
            zz = -2.81938 + (((tickAnim - 32) / 8) * (-0.9397-(-2.81938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 25) {
            xx = -1.5 + (((tickAnim - 20) / 5) * (23.25-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.25 + (((tickAnim - 25) / 5) * (-9.75-(23.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -9.75 + (((tickAnim - 30) / 4) * (-0.75-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm4, rightArm4.rotateAngleX + (float) Math.toRadians(xx), rightArm4.rotateAngleY + (float) Math.toRadians(yy), rightArm4.rotateAngleZ + (float) Math.toRadians(zz));
    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMymoorapelta e = (EntityPrehistoricFloraMymoorapelta) entity;
        animator.update(entity);


    }
}
