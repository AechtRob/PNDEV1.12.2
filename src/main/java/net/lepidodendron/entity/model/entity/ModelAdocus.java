package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAdocus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelAdocus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer shellright;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer shellright2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer shellright3;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer shellright4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer shellleft;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer shellleft2;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer shellleft3;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer shellleft4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer tail;

    private ModelAnimator animator;

    public ModelAdocus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 28, 27, -3.5F, -10.8F, -3.5F, 7, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -1.3F, -5.4F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2967F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 35, -3.0F, -3.0F, -5.75F, 8, 3, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.475F, 4.775F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -4.0F, -3.0F, -2.0F, 8, 3, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -9.175F, 8.2F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6632F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 43, -3.0F, 0.0F, 0.0F, 7, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -10.8F, 3.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3316F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 46, -3.0F, 0.0F, 0.0F, 7, 1, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -10.8F, -3.5F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4538F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, -3.0F, 0.0F, -7.0F, 7, 1, 7, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.375F, -0.15F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0175F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -7.0F, -4.0F, -6.0F, 15, 3, 9, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.5F, -9.075F, 8.2F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4538F, 0.4887F, 0.7679F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 6, 0.0F, 0.0F, 0.0F, 5, 0, 6, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.5F, -10.8F, 3.5F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2487F, 0.2182F, 0.7854F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 0, 0.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.5F, -10.8F, -0.5F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 12, 0.0F, 0.0F, -3.0F, 8, 1, 7, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.5F, -10.8F, -3.5F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3927F, -0.2618F, 0.7854F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 20, 0.0F, 0.0F, -7.0F, 8, 0, 7, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-3.5F, -9.075F, 8.2F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4538F, -0.4887F, -0.7679F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 6, -5.0F, 0.0F, 0.0F, 5, 0, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.5F, -10.8F, 3.5F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2487F, -0.2182F, -0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 0, -8.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.5F, -10.8F, -3.5F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.2618F, -0.7854F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 20, -8.0F, 0.0F, -7.0F, 8, 0, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.5F, -10.8F, -0.5F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 12, -8.0F, 0.0F, -3.0F, 8, 1, 7, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -4.75F, -9.25F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6545F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 50, -3.0F, -2.025F, -3.0F, 7, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -3.5F, 9.65F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 12, -4.0F, -2.0F, -1.0F, 7, 2, 6, 0.01F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -5.4F, -9.85F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.0611F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 14, 62, -1.5F, -1.45F, -2.4F, 3, 3, 3, 0.011F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.15F, -3.05F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 62, 51, -1.5F, -1.175F, -1.85F, 3, 2, 3, -0.01F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 63, -1.5F, 0.6F, -1.85F, 3, 1, 3, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.1F, -1.1F);
        this.neck2.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 56, 32, -1.5F, -0.8F, -2.075F, 3, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.45F, -0.4F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1614F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 37, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.925F, -3.4F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.3578F, 0.1222F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 64, 59, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.925F, -3.4F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3491F, -0.3578F, -0.1222F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 64, 59, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.925F, -3.4F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5236F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 64, 56, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.025F, -1.9F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 63, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 0.2F, -2.1F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.3491F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 58, 24, -2.0F, -1.0F, 0.0F, 3, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.675F, -0.65F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 64, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 41, -1.0F, -1.35F, -1.0F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 52, -0.5F, -0.5F, -2.5F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.5F, -2.5F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2443F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 8, 64, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.5F, -2.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2443F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 8, 64, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.7F, -0.125F, -2.55F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, -0.1745F, 0.0349F, 0.2618F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.75F, -0.75F);
        this.eyeright.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3491F, -0.5672F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 39, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.7F, -0.125F, -2.55F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, -0.1745F, -0.0349F, -0.2618F);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.75F, -0.75F);
        this.eyeleft.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3491F, 0.5672F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 39, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.shellright = new AdvancedModelRenderer(this);
        this.shellright.setRotationPoint(0.125F, -3.425F, -9.25F);
        this.main.addChild(shellright);
        this.setRotateAngle(shellright, 0.0F, 0.0F, -0.0873F);
        this.shellright.cubeList.add(new ModelBox(shellright, 0, 37, -9.7F, -2.6F, 7.1F, 5, 2, 7, 0.01F, false));
        this.shellright.cubeList.add(new ModelBox(shellright, 1, 68, -5.7F, -1.595F, 11.85F, 4, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-6.6F, -0.6F, 21.325F);
        this.shellright.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.9076F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 56, 12, -0.025F, -2.0F, -0.025F, 4, 2, 4, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-8.6F, -0.6F, 17.925F);
        this.shellright.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.5323F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 35, -0.025F, -2.0F, -0.025F, 5, 2, 4, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-9.675F, -0.6F, 14.125F);
        this.shellright.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.2705F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 52, -0.025F, -2.0F, -0.025F, 5, 2, 4, 0.0F, false));

        this.shellright2 = new AdvancedModelRenderer(this);
        this.shellright2.setRotationPoint(-8.65F, -0.6F, 7.275F);
        this.shellright.addChild(shellright2);
        this.setRotateAngle(shellright2, -0.0436F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellright2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.2618F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 50, 57, -0.025F, -2.0F, -0.025F, 3, 2, 4, 0.0F, false));

        this.shellright3 = new AdvancedModelRenderer(this);
        this.shellright3.setRotationPoint(4.8F, 0.0F, -3.975F);
        this.shellright2.addChild(shellright3);
        this.setRotateAngle(shellright3, -0.3054F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.5F, 0.0F, -2.875F);
        this.shellright3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.8727F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 44, 51, -4.3F, -2.0F, -0.925F, 5, 2, 4, 0.0F, false));

        this.shellright4 = new AdvancedModelRenderer(this);
        this.shellright4.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.shellright3.addChild(shellright4);
        this.setRotateAngle(shellright4, -0.3491F, 0.0F, 0.0F);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.075F, 0.1F, -0.8F);
        this.shellright4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.3054F, 0.576F, 0.0873F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 26, 62, -1.5F, -2.0F, -0.725F, 3, 2, 3, 0.0F, false));

        this.shellleft = new AdvancedModelRenderer(this);
        this.shellleft.setRotationPoint(-0.125F, -3.425F, -9.25F);
        this.main.addChild(shellleft);
        this.setRotateAngle(shellleft, 0.0F, 0.0F, 0.0873F);
        this.shellleft.cubeList.add(new ModelBox(shellleft, 1, 68, 1.7F, -1.595F, 11.85F, 4, 1, 4, 0.0F, true));
        this.shellleft.cubeList.add(new ModelBox(shellleft, 0, 37, 4.7F, -2.6F, 7.1F, 5, 2, 7, 0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(6.6F, -0.6F, 21.325F);
        this.shellleft.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, -0.9076F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 12, -3.975F, -2.0F, -0.025F, 4, 2, 4, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(8.6F, -0.6F, 17.925F);
        this.shellleft.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -0.5323F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 54, 35, -4.975F, -2.0F, -0.025F, 5, 2, 4, 0.01F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(9.675F, -0.6F, 14.125F);
        this.shellleft.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.2705F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 52, -4.975F, -2.0F, -0.025F, 5, 2, 4, 0.0F, true));

        this.shellleft2 = new AdvancedModelRenderer(this);
        this.shellleft2.setRotationPoint(8.65F, -0.6F, 7.275F);
        this.shellleft.addChild(shellleft2);
        this.setRotateAngle(shellleft2, -0.0436F, 0.0F, 0.0F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.shellleft2.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 0.2618F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 50, 57, -2.975F, -2.0F, -0.025F, 3, 2, 4, 0.0F, true));

        this.shellleft3 = new AdvancedModelRenderer(this);
        this.shellleft3.setRotationPoint(-4.8F, 0.0F, -3.975F);
        this.shellleft2.addChild(shellleft3);
        this.setRotateAngle(shellleft3, -0.3054F, 0.0F, 0.0F);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.5F, 0.0F, -2.875F);
        this.shellleft3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.8727F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 51, -0.7F, -2.0F, -0.925F, 5, 2, 4, 0.0F, true));

        this.shellleft4 = new AdvancedModelRenderer(this);
        this.shellleft4.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.shellleft3.addChild(shellleft4);
        this.setRotateAngle(shellleft4, -0.3491F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.075F, 0.1F, -0.8F);
        this.shellleft4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.3054F, -0.576F, -0.0873F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 26, 62, -1.5F, -2.0F, -0.725F, 3, 2, 3, 0.0F, true));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.75F, -3.0F, -5.75F);
        this.main.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3752F, 0.9163F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 18, 55, -1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(1.5F, 0.0F, -5.0F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.6109F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 38, 62, -3.0F, -1.0F, -3.0F, 3, 2, 3, -0.01F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-1.5F, 0.0F, -3.0F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.3491F, -0.6981F, 0.0436F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 56, 27, -2.0F, -0.5F, -3.0F, 4, 1, 4, -0.01F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.75F, -3.0F, -5.75F);
        this.main.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3752F, -0.9163F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 18, 55, -1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(-1.5F, 0.0F, -5.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.6109F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 38, 62, 0.0F, -1.0F, -3.0F, 3, 2, 3, -0.01F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(1.5F, 0.0F, -3.0F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, -0.3491F, 0.6981F, -0.0436F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 56, 27, -2.0F, -0.5F, -3.0F, 4, 1, 4, -0.01F, true));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.25F, -2.85F, 6.0F);
        this.main.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.3491F, 2.2253F, 0.0F);
        this.backrightleg.cubeList.add(new ModelBox(backrightleg, 0, 58, -1.5F, -1.0F, -3.0F, 3, 2, 4, 0.01F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(1.5F, 0.0F, -3.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0F, 0.3054F, 0.0F);
        this.backrightleg2.cubeList.add(new ModelBox(backrightleg2, 58, 18, -3.0F, -1.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(-1.5F, 0.0F, -4.0F);
        this.backrightleg2.addChild(backrightleg3);
        this.setRotateAngle(backrightleg3, -0.2618F, -0.4363F, 0.0F);
        this.backrightleg3.cubeList.add(new ModelBox(backrightleg3, 34, 57, -2.0F, -0.5F, -3.0F, 4, 1, 4, -0.01F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(3.25F, -2.85F, 6.0F);
        this.main.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.3491F, -2.2253F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 58, -1.5F, -1.0F, -3.0F, 3, 2, 4, 0.01F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(-1.5F, 0.0F, -3.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.3054F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 58, 18, 0.0F, -1.0F, -4.0F, 3, 2, 4, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(1.5F, 0.0F, -4.0F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.2618F, 0.4363F, 0.0F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 34, 57, -2.0F, -0.5F, -3.0F, 4, 1, 4, -0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.9731F, 8.6186F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, 0.0087F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 54, 47, -0.5F, -0.475F, 2.925F, 1, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 59, 45, -1.0F, -1.225F, -0.075F, 2, 2, 3, 0.0F, false));
        

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
        this.main.offsetX = 0.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.4F, 3.8F, -0.2F);
        
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
        resetToDefaultPose();
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

        EntityPrehistoricFloraAdocus entityAdocus = (EntityPrehistoricFloraAdocus) e;

        if (entityAdocus.getAnimation() == entityAdocus.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        if (entityAdocus.getAnimation() == entityAdocus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityAdocus.isReallyInWater()) {

                if (f3 == 0.0F || !entityAdocus.getIsMoving()) {
                    if (entityAdocus.getAnimation() != entityAdocus.EAT_ANIMATION
                        && entityAdocus.getAnimation() != entityAdocus.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityAdocus.getIsFast()) { //Running


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

        EntityPrehistoricFloraAdocus ee = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if(ee.getIsFast()) {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else {
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //animIdlePose(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                //Swimming pose:
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.5 + (((tickAnim - 13) / 3) * (3.91628-(2.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.17085-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-2.49416-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 3.91628 + (((tickAnim - 16) / 2) * (5.34-(3.91628)));
            yy = 0.17085 + (((tickAnim - 16) / 2) * (0-(0.17085)));
            zz = -2.49416 + (((tickAnim - 16) / 2) * (0-(-2.49416)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 5.34 + (((tickAnim - 18) / 5) * (4.73926-(5.34)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.20668-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (2.49145-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 4.73926 + (((tickAnim - 23) / 9) * (3.75-(4.73926)));
            yy = -0.20668 + (((tickAnim - 23) / 9) * (0-(-0.20668)));
            zz = 2.49145 + (((tickAnim - 23) / 9) * (0-(2.49145)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 32) / 3) * (4.06614-(3.75)));
            yy = 0 + (((tickAnim - 32) / 3) * (0.17738-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (-2.4937-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.06614 + (((tickAnim - 35) / 5) * (4.55-(4.06614)));
            yy = 0.17738 + (((tickAnim - 35) / 5) * (0-(0.17738)));
            zz = -2.4937 + (((tickAnim - 35) / 5) * (0-(-2.4937)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.55 + (((tickAnim - 40) / 10) * (0-(4.55)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 19) * (-0.99-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 19) / 14) * (0-(0)));
            yy = -0.99 + (((tickAnim - 19) / 14) * (-1.11-(-0.99)));
            zz = 0 + (((tickAnim - 19) / 14) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -1.11 + (((tickAnim - 33) / 17) * (-1.325-(-1.11)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -32.5 + (((tickAnim - 0) / 20) * (-30.22695-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.24868-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.15603-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.22695 + (((tickAnim - 20) / 10) * (-25.98463-(-30.22695)));
            yy = 6.24868 + (((tickAnim - 20) / 10) * (4.16579-(6.24868)));
            zz = -4.15603 + (((tickAnim - 20) / 10) * (-2.77069-(-4.15603)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -25.98463 + (((tickAnim - 30) / 7) * (-33.12672-(-25.98463)));
            yy = 4.16579 + (((tickAnim - 30) / 7) * (-1.48029-(4.16579)));
            zz = -2.77069 + (((tickAnim - 30) / 7) * (0.77546-(-2.77069)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -33.12672 + (((tickAnim - 37) / 6) * (-37.54003-(-33.12672)));
            yy = -1.48029 + (((tickAnim - 37) / 6) * (-0.83266-(-1.48029)));
            zz = 0.77546 + (((tickAnim - 37) / 6) * (0.4362-(0.77546)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -37.54003 + (((tickAnim - 43) / 7) * (-32.5-(-37.54003)));
            yy = -0.83266 + (((tickAnim - 43) / 7) * (0-(-0.83266)));
            zz = 0.4362 + (((tickAnim - 43) / 7) * (0-(0.4362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = -0.75 + (((tickAnim - 0) / 50) * (-0.75-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-7.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-15), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -38.98474 + (((tickAnim - 0) / 13) * (-40.83532-(-38.98474)));
            yy = -41.01308 + (((tickAnim - 0) / 13) * (-44.18922-(-41.01308)));
            zz = -51.60592 + (((tickAnim - 0) / 13) * (-50.6387-(-51.60592)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -40.83532 + (((tickAnim - 13) / 3) * (-41.46876-(-40.83532)));
            yy = -44.18922 + (((tickAnim - 13) / 3) * (-46.35357-(-44.18922)));
            zz = -50.6387 + (((tickAnim - 13) / 3) * (-46.81686-(-50.6387)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -41.46876 + (((tickAnim - 16) / 7) * (-41.81836-(-41.46876)));
            yy = -46.35357 + (((tickAnim - 16) / 7) * (-45.64383-(-46.35357)));
            zz = -46.81686 + (((tickAnim - 16) / 7) * (-52.29149-(-46.81686)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -41.81836 + (((tickAnim - 23) / 9) * (-41.98825-(-41.81836)));
            yy = -45.64383 + (((tickAnim - 23) / 9) * (-46.53517-(-45.64383)));
            zz = -52.29149 + (((tickAnim - 23) / 9) * (-49.19444-(-52.29149)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -41.98825 + (((tickAnim - 32) / 3) * (-42.1549-(-41.98825)));
            yy = -46.53517 + (((tickAnim - 32) / 3) * (-48.6165-(-46.53517)));
            zz = -49.19444 + (((tickAnim - 32) / 3) * (-48.59975-(-49.19444)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -42.1549 + (((tickAnim - 35) / 15) * (-38.98474-(-42.1549)));
            yy = -48.6165 + (((tickAnim - 35) / 15) * (-41.01308-(-48.6165)));
            zz = -48.59975 + (((tickAnim - 35) / 15) * (-51.60592-(-48.59975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(0), frontrightleg2.rotateAngleY + (float) Math.toRadians(32.5), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -72.72294 + (((tickAnim - 0) / 13) * (-67.61663-(-72.72294)));
            yy = -5.03318 + (((tickAnim - 0) / 13) * (-7.53112-(-5.03318)));
            zz = 114.6374 + (((tickAnim - 0) / 13) * (114.49033-(114.6374)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -67.61663 + (((tickAnim - 13) / 5) * (-71.61663-(-67.61663)));
            yy = -7.53112 + (((tickAnim - 13) / 5) * (-7.53112-(-7.53112)));
            zz = 114.49033 + (((tickAnim - 13) / 5) * (114.49033-(114.49033)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -71.61663 + (((tickAnim - 18) / 14) * (-67.61663-(-71.61663)));
            yy = -7.53112 + (((tickAnim - 18) / 14) * (-7.53112-(-7.53112)));
            zz = 114.49033 + (((tickAnim - 18) / 14) * (114.49033-(114.49033)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -67.61663 + (((tickAnim - 32) / 8) * (-73.93769-(-67.61663)));
            yy = -7.53112 + (((tickAnim - 32) / 8) * (-6.39569-(-7.53112)));
            zz = 114.49033 + (((tickAnim - 32) / 8) * (114.55718-(114.49033)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -73.93769 + (((tickAnim - 40) / 10) * (-72.72294-(-73.93769)));
            yy = -6.39569 + (((tickAnim - 40) / 10) * (-5.03318-(-6.39569)));
            zz = 114.55718 + (((tickAnim - 40) / 10) * (114.6374-(114.55718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -156.71162 + (((tickAnim - 0) / 8) * (-81.3933-(-156.71162)));
            yy = -46.81243 + (((tickAnim - 0) / 8) * (-51.54418-(-46.81243)));
            zz = -147.55062 + (((tickAnim - 0) / 8) * (-69.81777-(-147.55062)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -81.3933 + (((tickAnim - 8) / 3) * (-183.25794-(-81.3933)));
            yy = -51.54418 + (((tickAnim - 8) / 3) * (-49.88581-(-51.54418)));
            zz = -69.81777 + (((tickAnim - 8) / 3) * (-177.70707-(-69.81777)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -183.25794 + (((tickAnim - 11) / 7) * (-189.74179-(-183.25794)));
            yy = -49.88581 + (((tickAnim - 11) / 7) * (-84.71168-(-49.88581)));
            zz = -177.70707 + (((tickAnim - 11) / 7) * (-183.11624-(-177.70707)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -189.74179 + (((tickAnim - 18) / 5) * (-179.36-(-189.74179)));
            yy = -84.71168 + (((tickAnim - 18) / 5) * (-72.8-(-84.71168)));
            zz = -183.11624 + (((tickAnim - 18) / 5) * (-171.94-(-183.11624)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -179.36 + (((tickAnim - 23) / 9) * (-48.47309-(-179.36)));
            yy = -72.8 + (((tickAnim - 23) / 9) * (-64.10278-(-72.8)));
            zz = -171.94 + (((tickAnim - 23) / 9) * (-35.13146-(-171.94)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -48.47309 + (((tickAnim - 32) / 3) * (-78.03266-(-48.47309)));
            yy = -64.10278 + (((tickAnim - 32) / 3) * (-49.8239-(-64.10278)));
            zz = -35.13146 + (((tickAnim - 32) / 3) * (-66.37832-(-35.13146)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -78.03266 + (((tickAnim - 35) / 3) * (-156.38682-(-78.03266)));
            yy = -49.8239 + (((tickAnim - 35) / 3) * (-53.407-(-49.8239)));
            zz = -66.37832 + (((tickAnim - 35) / 3) * (-146.54299-(-66.37832)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -156.38682 + (((tickAnim - 38) / 2) * (-187.79064-(-156.38682)));
            yy = -53.407 + (((tickAnim - 38) / 2) * (-86.46489-(-53.407)));
            zz = -146.54299 + (((tickAnim - 38) / 2) * (-176.13571-(-146.54299)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -187.79064 + (((tickAnim - 40) / 10) * (-156.71162-(-187.79064)));
            yy = -86.46489 + (((tickAnim - 40) / 10) * (-46.81243-(-86.46489)));
            zz = -176.13571 + (((tickAnim - 40) / 10) * (-147.55062-(-176.13571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 35 + (((tickAnim - 0) / 8) * (57.5-(35)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 57.5 + (((tickAnim - 8) / 10) * (17.5-(57.5)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 14) * (52.5-(17.5)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 52.5 + (((tickAnim - 32) / 8) * (27.5-(52.5)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 27.5 + (((tickAnim - 40) / 10) * (35-(27.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -7.71027 + (((tickAnim - 0) / 14) * (-65.86377-(-7.71027)));
            yy = -34.7486 + (((tickAnim - 0) / 14) * (-0.77999-(-34.7486)));
            zz = 14.49277 + (((tickAnim - 0) / 14) * (62.71433-(14.49277)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -65.86377 + (((tickAnim - 14) / 8) * (-8.23343-(-65.86377)));
            yy = -0.77999 + (((tickAnim - 14) / 8) * (19.73674-(-0.77999)));
            zz = 62.71433 + (((tickAnim - 14) / 8) * (53.06335-(62.71433)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = -8.23343 + (((tickAnim - 22) / 10) * (-52.57541-(-8.23343)));
            yy = 19.73674 + (((tickAnim - 22) / 10) * (10.46768-(19.73674)));
            zz = 53.06335 + (((tickAnim - 22) / 10) * (49.24913-(53.06335)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = -52.57541 + (((tickAnim - 32) / 6) * (-46.24175-(-52.57541)));
            yy = 10.46768 + (((tickAnim - 32) / 6) * (35.25502-(10.46768)));
            zz = 49.24913 + (((tickAnim - 32) / 6) * (84.52524-(49.24913)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = -46.24175 + (((tickAnim - 38) / 3) * (-18.3448-(-46.24175)));
            yy = 35.25502 + (((tickAnim - 38) / 3) * (31.08684-(35.25502)));
            zz = 84.52524 + (((tickAnim - 38) / 3) * (87.3158-(84.52524)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -18.3448 + (((tickAnim - 41) / 9) * (-7.71027-(-18.3448)));
            yy = 31.08684 + (((tickAnim - 41) / 9) * (-34.7486-(31.08684)));
            zz = 87.3158 + (((tickAnim - 41) / 9) * (14.49277-(87.3158)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -38.98474 + (((tickAnim - 0) / 13) * (-37.98683-(-38.98474)));
            yy = 41.01308 + (((tickAnim - 0) / 13) * (41.76764-(41.01308)));
            zz = 51.60592 + (((tickAnim - 0) / 13) * (49.16863-(51.60592)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -37.98683 + (((tickAnim - 13) / 3) * (-37.86663-(-37.98683)));
            yy = 41.76764 + (((tickAnim - 13) / 3) * (40.77061-(41.76764)));
            zz = 49.16863 + (((tickAnim - 13) / 3) * (49.05575-(49.16863)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -37.86663 + (((tickAnim - 16) / 2) * (-38.83597-(-37.86663)));
            yy = 40.77061 + (((tickAnim - 16) / 2) * (43.33918-(40.77061)));
            zz = 49.05575 + (((tickAnim - 16) / 2) * (47.62739-(49.05575)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -38.83597 + (((tickAnim - 18) / 5) * (-40.92675-(-38.83597)));
            yy = 43.33918 + (((tickAnim - 18) / 5) * (45.61311-(43.33918)));
            zz = 47.62739 + (((tickAnim - 18) / 5) * (45.67857-(47.62739)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -40.92675 + (((tickAnim - 23) / 9) * (-43.19565-(-40.92675)));
            yy = 45.61311 + (((tickAnim - 23) / 9) * (46.67337-(45.61311)));
            zz = 45.67857 + (((tickAnim - 23) / 9) * (51.94086-(45.67857)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -43.19565 + (((tickAnim - 32) / 9) * (-40.70493-(-43.19565)));
            yy = 46.67337 + (((tickAnim - 32) / 9) * (43.12791-(46.67337)));
            zz = 51.94086 + (((tickAnim - 32) / 9) * (44.69497-(51.94086)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -40.70493 + (((tickAnim - 41) / 9) * (-38.98474-(-40.70493)));
            yy = 43.12791 + (((tickAnim - 41) / 9) * (41.01308-(43.12791)));
            zz = 44.69497 + (((tickAnim - 41) / 9) * (51.60592-(44.69497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(0), frontleftleg2.rotateAngleY + (float) Math.toRadians(-32.5), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -72.72294 + (((tickAnim - 0) / 13) * (-75.22294-(-72.72294)));
            yy = 5.03318 + (((tickAnim - 0) / 13) * (5.03318-(5.03318)));
            zz = -114.6374 + (((tickAnim - 0) / 13) * (-114.6374-(-114.6374)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -75.22294 + (((tickAnim - 13) / 5) * (-80.16151-(-75.22294)));
            yy = 5.03318 + (((tickAnim - 13) / 5) * (5.71438-(5.03318)));
            zz = -114.6374 + (((tickAnim - 13) / 5) * (-114.59529-(-114.6374)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -80.16151 + (((tickAnim - 18) / 14) * (-67.49769-(-80.16151)));
            yy = 5.71438 + (((tickAnim - 18) / 14) * (7.53091-(5.71438)));
            zz = -114.59529 + (((tickAnim - 18) / 14) * (-114.483-(-114.59529)));
        }
        else if (tickAnim >= 32 && tickAnim < 41) {
            xx = -67.49769 + (((tickAnim - 32) / 9) * (-78.40531-(-67.49769)));
            yy = 7.53091 + (((tickAnim - 32) / 9) * (11.23347-(7.53091)));
            zz = -114.483 + (((tickAnim - 32) / 9) * (-115.61645-(-114.483)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -78.40531 + (((tickAnim - 41) / 9) * (-72.72294-(-78.40531)));
            yy = 11.23347 + (((tickAnim - 41) / 9) * (5.03318-(11.23347)));
            zz = -115.61645 + (((tickAnim - 41) / 9) * (-114.6374-(-115.61645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -156.71162 + (((tickAnim - 0) / 13) * (-81.3933-(-156.71162)));
            yy = 46.81243 + (((tickAnim - 0) / 13) * (51.54418-(46.81243)));
            zz = 147.55062 + (((tickAnim - 0) / 13) * (69.81777-(147.55062)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -81.3933 + (((tickAnim - 13) / 2) * (-183.25794-(-81.3933)));
            yy = 51.54418 + (((tickAnim - 13) / 2) * (49.88581-(51.54418)));
            zz = 69.81777 + (((tickAnim - 13) / 2) * (177.70707-(69.81777)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -183.25794 + (((tickAnim - 15) / 7) * (-189.74179-(-183.25794)));
            yy = 49.88581 + (((tickAnim - 15) / 7) * (84.71168-(49.88581)));
            zz = 177.70707 + (((tickAnim - 15) / 7) * (183.11624-(177.70707)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -189.74179 + (((tickAnim - 22) / 6) * (-179.36-(-189.74179)));
            yy = 84.71168 + (((tickAnim - 22) / 6) * (72.8-(84.71168)));
            zz = 183.11624 + (((tickAnim - 22) / 6) * (171.94-(183.11624)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = -179.36 + (((tickAnim - 28) / 8) * (-48.47309-(-179.36)));
            yy = 72.8 + (((tickAnim - 28) / 8) * (64.10278-(72.8)));
            zz = 171.94 + (((tickAnim - 28) / 8) * (35.13146-(171.94)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -48.47309 + (((tickAnim - 36) / 3) * (-78.03266-(-48.47309)));
            yy = 64.10278 + (((tickAnim - 36) / 3) * (49.8239-(64.10278)));
            zz = 35.13146 + (((tickAnim - 36) / 3) * (66.37832-(35.13146)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = -78.03266 + (((tickAnim - 39) / 3) * (-156.38682-(-78.03266)));
            yy = 49.8239 + (((tickAnim - 39) / 3) * (53.407-(49.8239)));
            zz = 66.37832 + (((tickAnim - 39) / 3) * (146.54299-(66.37832)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = -156.38682 + (((tickAnim - 42) / 2) * (-187.79064-(-156.38682)));
            yy = 53.407 + (((tickAnim - 42) / 2) * (86.46489-(53.407)));
            zz = 146.54299 + (((tickAnim - 42) / 2) * (176.13571-(146.54299)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -187.79064 + (((tickAnim - 44) / 6) * (-156.71162-(-187.79064)));
            yy = 86.46489 + (((tickAnim - 44) / 6) * (46.81243-(86.46489)));
            zz = 176.13571 + (((tickAnim - 44) / 6) * (147.55062-(176.13571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -35 + (((tickAnim - 0) / 13) * (-57.5-(-35)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -57.5 + (((tickAnim - 13) / 9) * (-17.5-(-57.5)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 22) / 14) * (0-(0)));
            yy = -17.5 + (((tickAnim - 22) / 14) * (-52.5-(-17.5)));
            zz = 0 + (((tickAnim - 22) / 14) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = -52.5 + (((tickAnim - 36) / 8) * (-27.5-(-52.5)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -27.5 + (((tickAnim - 44) / 6) * (-35-(-27.5)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -7.71027 + (((tickAnim - 0) / 18) * (-65.86377-(-7.71027)));
            yy = 34.7486 + (((tickAnim - 0) / 18) * (0.77999-(34.7486)));
            zz = -14.49277 + (((tickAnim - 0) / 18) * (-62.71433-(-14.49277)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -65.86377 + (((tickAnim - 18) / 8) * (-8.23343-(-65.86377)));
            yy = 0.77999 + (((tickAnim - 18) / 8) * (-19.73674-(0.77999)));
            zz = -62.71433 + (((tickAnim - 18) / 8) * (-53.06335-(-62.71433)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = -8.23343 + (((tickAnim - 26) / 10) * (-52.57541-(-8.23343)));
            yy = -19.73674 + (((tickAnim - 26) / 10) * (-10.46768-(-19.73674)));
            zz = -53.06335 + (((tickAnim - 26) / 10) * (-49.24913-(-53.06335)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = -52.57541 + (((tickAnim - 36) / 6) * (-46.24175-(-52.57541)));
            yy = -10.46768 + (((tickAnim - 36) / 6) * (-35.25502-(-10.46768)));
            zz = -49.24913 + (((tickAnim - 36) / 6) * (-84.52524-(-49.24913)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -46.24175 + (((tickAnim - 42) / 3) * (-18.3448-(-46.24175)));
            yy = -35.25502 + (((tickAnim - 42) / 3) * (-31.08684-(-35.25502)));
            zz = -84.52524 + (((tickAnim - 42) / 3) * (-87.3158-(-84.52524)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -18.3448 + (((tickAnim - 45) / 5) * (-7.71027-(-18.3448)));
            yy = -31.08684 + (((tickAnim - 45) / 5) * (34.7486-(-31.08684)));
            zz = -87.3158 + (((tickAnim - 45) / 5) * (-14.49277-(-87.3158)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-25.91607-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (2.11021-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-16.03189-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -25.91607 + (((tickAnim - 6) / 5) * (-10.20855-(-25.91607)));
            yy = 2.11021 + (((tickAnim - 6) / 5) * (5.40976-(2.11021)));
            zz = -16.03189 + (((tickAnim - 6) / 5) * (-24.7207-(-16.03189)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10.20855 + (((tickAnim - 11) / 7) * (5.28775-(-10.20855)));
            yy = 5.40976 + (((tickAnim - 11) / 7) * (5.79735-(5.40976)));
            zz = -24.7207 + (((tickAnim - 11) / 7) * (-24.99651-(-24.7207)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.28775 + (((tickAnim - 18) / 3) * (8.44619-(5.28775)));
            yy = 5.79735 + (((tickAnim - 18) / 3) * (13.16925-(5.79735)));
            zz = -24.99651 + (((tickAnim - 18) / 3) * (-25.09866-(-24.99651)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.44619 + (((tickAnim - 21) / 2) * (3.3997-(8.44619)));
            yy = 13.16925 + (((tickAnim - 21) / 2) * (11.10394-(13.16925)));
            zz = -25.09866 + (((tickAnim - 21) / 2) * (-13.38289-(-25.09866)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 3.3997 + (((tickAnim - 23) / 4) * (2.84433-(3.3997)));
            yy = 11.10394 + (((tickAnim - 23) / 4) * (2.66255-(11.10394)));
            zz = -13.38289 + (((tickAnim - 23) / 4) * (-9.21013-(-13.38289)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 2.84433 + (((tickAnim - 27) / 7) * (-4.15-(2.84433)));
            yy = 2.66255 + (((tickAnim - 27) / 7) * (0.5-(2.66255)));
            zz = -9.21013 + (((tickAnim - 27) / 7) * (-1.73-(-9.21013)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.15 + (((tickAnim - 34) / 6) * (0-(-4.15)));
            yy = 0.5 + (((tickAnim - 34) / 6) * (0-(0.5)));
            zz = -1.73 + (((tickAnim - 34) / 6) * (0-(-1.73)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.92-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 12) / 6) * (-0.5-(-0.25)));
            zz = -0.92 + (((tickAnim - 12) / 6) * (-0.22-(-0.92)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = -0.5 + (((tickAnim - 18) / 4) * (-0.5-(-0.5)));
            zz = -0.22 + (((tickAnim - 18) / 4) * (2-(-0.22)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = -0.5 + (((tickAnim - 22) / 18) * (0-(-0.5)));
            zz = 2 + (((tickAnim - 22) / 18) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (36.37345-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-7.12331-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.43652-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 36.37345 + (((tickAnim - 6) / 5) * (11.64952-(36.37345)));
            yy = -7.12331 + (((tickAnim - 6) / 5) * (-8.87772-(-7.12331)));
            zz = -0.43652 + (((tickAnim - 6) / 5) * (-9.58098-(-0.43652)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.64952 + (((tickAnim - 11) / 3) * (-0.65004-(11.64952)));
            yy = -8.87772 + (((tickAnim - 11) / 3) * (-4.35098-(-8.87772)));
            zz = -9.58098 + (((tickAnim - 11) / 3) * (-24.6947-(-9.58098)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.65004 + (((tickAnim - 14) / 4) * (6.11937-(-0.65004)));
            yy = -4.35098 + (((tickAnim - 14) / 4) * (-6.00784-(-4.35098)));
            zz = -24.6947 + (((tickAnim - 14) / 4) * (-24.44267-(-24.6947)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.11937 + (((tickAnim - 18) / 3) * (0.51434-(6.11937)));
            yy = -6.00784 + (((tickAnim - 18) / 3) * (-5.869-(-6.00784)));
            zz = -24.44267 + (((tickAnim - 18) / 3) * (-10.00685-(-24.44267)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.51434 + (((tickAnim - 21) / 6) * (-2.70768-(0.51434)));
            yy = -5.869 + (((tickAnim - 21) / 6) * (-3.88687-(-5.869)));
            zz = -10.00685 + (((tickAnim - 21) / 6) * (-4.94866-(-10.00685)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -2.70768 + (((tickAnim - 27) / 7) * (8.87-(-2.70768)));
            yy = -3.88687 + (((tickAnim - 27) / 7) * (-0.73-(-3.88687)));
            zz = -4.94866 + (((tickAnim - 27) / 7) * (-0.93-(-4.94866)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 8.87 + (((tickAnim - 34) / 6) * (0-(8.87)));
            yy = -0.73 + (((tickAnim - 34) / 6) * (0-(-0.73)));
            zz = -0.93 + (((tickAnim - 34) / 6) * (0-(-0.93)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 32.5 + (((tickAnim - 11) / 6) * (27.5-(32.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 27.5 + (((tickAnim - 17) / 1) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 18) / 22) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 18) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5), tail.rotateAngleY + (float) Math.toRadians(-2.5), tail.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 17) / 6) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 6) * (0.2-(1)));
            zz = 1 + (((tickAnim - 17) / 6) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 1 + (((tickAnim - 23) / 9) * (1-(1)));
            yy = 0.2 + (((tickAnim - 23) / 9) * (1-(0.2)));
            zz = 1 + (((tickAnim - 23) / 9) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 310;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (2.5-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -2.5 + (((tickAnim - 5) / 2) * (0-(-2.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 7) / 3) * (0-(2.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 10) / 270) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 270) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 289) {
            xx = 0 + (((tickAnim - 280) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 9) * (0-(0)));
        }
        else if (tickAnim >= 289 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 289) / 4) * (-1.29762-(0)));
            yy = 0 + (((tickAnim - 289) / 4) * (-0.10901-(0)));
            zz = 0 + (((tickAnim - 289) / 4) * (-1.09762-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 295) {
            xx = -1.29762 + (((tickAnim - 293) / 2) * (-0.95-(-1.29762)));
            yy = -0.10901 + (((tickAnim - 293) / 2) * (0.00001-(-0.10901)));
            zz = -1.09762 + (((tickAnim - 293) / 2) * (0.75059-(-1.09762)));
        }
        else if (tickAnim >= 295 && tickAnim < 298) {
            xx = -0.95 + (((tickAnim - 295) / 3) * (0-(-0.95)));
            yy = 0.00001 + (((tickAnim - 295) / 3) * (0-(0.00001)));
            zz = 0.75059 + (((tickAnim - 295) / 3) * (0-(0.75059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 5) * (-1.22-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.22 + (((tickAnim - 5) / 5) * (-1.325-(-1.22)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 10) / 270) * (0-(0)));
            yy = -1.325 + (((tickAnim - 10) / 270) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 10) / 270) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = -1.325 + (((tickAnim - 280) / 10) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -32.5 + (((tickAnim - 0) / 2) * (6.67-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 6.67 + (((tickAnim - 2) / 3) * (10-(6.67)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 280) {
            xx = 10 + (((tickAnim - 5) / 275) * (10-(10)));
            yy = 0 + (((tickAnim - 5) / 275) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 275) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 10 + (((tickAnim - 280) / 10) * (-2.5-(10)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 294) {
            xx = -2.5 + (((tickAnim - 290) / 4) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 290) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 4) * (0-(0)));
        }
        else if (tickAnim >= 294 && tickAnim < 300) {
            xx = -5 + (((tickAnim - 294) / 6) * (-32.60394-(-5)));
            yy = 0 + (((tickAnim - 294) / 6) * (4.04331-(0)));
            zz = 0 + (((tickAnim - 294) / 6) * (-2.94382-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = -32.60394 + (((tickAnim - 300) / 5) * (-37.55197-(-32.60394)));
            yy = 4.04331 + (((tickAnim - 300) / 5) * (2.02165-(4.04331)));
            zz = -2.94382 + (((tickAnim - 300) / 5) * (-1.47191-(-2.94382)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = -37.55197 + (((tickAnim - 305) / 5) * (-32.5-(-37.55197)));
            yy = 2.02165 + (((tickAnim - 305) / 5) * (0-(2.02165)));
            zz = -1.47191 + (((tickAnim - 305) / 5) * (0-(-1.47191)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -0.75 + (((tickAnim - 0) / 5) * (5.25-(-0.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 5) / 275) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 275) * (0-(0)));
            zz = 5.25 + (((tickAnim - 5) / 275) * (5.25-(5.25)));
        }
        else if (tickAnim >= 280 && tickAnim < 294) {
            xx = 0 + (((tickAnim - 280) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 14) * (0-(0)));
            zz = 5.25 + (((tickAnim - 280) / 14) * (-0.75-(5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = -7.5 + (((tickAnim - 0) / 280) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -7.5 + (((tickAnim - 280) / 10) * (-25-(-7.5)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = -25 + (((tickAnim - 290) / 5) * (-23.75-(-25)));
            yy = 0 + (((tickAnim - 290) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 5) * (0-(0)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = -23.75 + (((tickAnim - 295) / 5) * (-7.5-(-23.75)));
            yy = 0 + (((tickAnim - 295) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 295) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = -15 + (((tickAnim - 0) / 280) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -15 + (((tickAnim - 280) / 10) * (-15-(-15)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -15 + (((tickAnim - 290) / 10) * (-15.01365-(-15)));
            yy = 0 + (((tickAnim - 290) / 10) * (2.41476-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (-0.64743-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 305) {
            xx = -15.01365 + (((tickAnim - 300) / 5) * (-15.01365-(-15.01365)));
            yy = 2.41476 + (((tickAnim - 300) / 5) * (-2.41476-(2.41476)));
            zz = -0.64743 + (((tickAnim - 300) / 5) * (0.64743-(-0.64743)));
        }
        else if (tickAnim >= 305 && tickAnim < 310) {
            xx = -15.01365 + (((tickAnim - 305) / 5) * (-15-(-15.01365)));
            yy = -2.41476 + (((tickAnim - 305) / 5) * (0-(-2.41476)));
            zz = 0.64743 + (((tickAnim - 305) / 5) * (0-(0.64743)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -38.98474 + (((tickAnim - 0) / 3) * (-43.15675-(-38.98474)));
            yy = -41.01308 + (((tickAnim - 0) / 3) * (-56.46938-(-41.01308)));
            zz = -51.60592 + (((tickAnim - 0) / 3) * (-72.54649-(-51.60592)));
        }
        else if (tickAnim >= 3 && tickAnim < 280) {
            xx = -43.15675 + (((tickAnim - 3) / 277) * (-43.15675-(-43.15675)));
            yy = -56.46938 + (((tickAnim - 3) / 277) * (-56.46938-(-56.46938)));
            zz = -72.54649 + (((tickAnim - 3) / 277) * (-72.54649-(-72.54649)));
        }
        else if (tickAnim >= 280 && tickAnim < 288) {
            xx = -43.15675 + (((tickAnim - 280) / 8) * (-24.19265-(-43.15675)));
            yy = -56.46938 + (((tickAnim - 280) / 8) * (-32.82589-(-56.46938)));
            zz = -72.54649 + (((tickAnim - 280) / 8) * (7.55704-(-72.54649)));
        }
        else if (tickAnim >= 288 && tickAnim < 293) {
            xx = -24.19265 + (((tickAnim - 288) / 5) * (-39.7983-(-24.19265)));
            yy = -32.82589 + (((tickAnim - 288) / 5) * (-36.33138-(-32.82589)));
            zz = 7.55704 + (((tickAnim - 288) / 5) * (-34.23095-(7.55704)));
        }
        else if (tickAnim >= 293 && tickAnim < 296) {
            xx = -39.7983 + (((tickAnim - 293) / 3) * (-38.98474-(-39.7983)));
            yy = -36.33138 + (((tickAnim - 293) / 3) * (-41.01308-(-36.33138)));
            zz = -34.23095 + (((tickAnim - 293) / 3) * (-51.60592-(-34.23095)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (4-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 280) {
            xx = 2 + (((tickAnim - 5) / 275) * (2-(2)));
            yy = 1 + (((tickAnim - 5) / 275) * (1-(1)));
            zz = 4 + (((tickAnim - 5) / 275) * (4-(4)));
        }
        else if (tickAnim >= 280 && tickAnim < 293) {
            xx = 2 + (((tickAnim - 280) / 13) * (0-(2)));
            yy = 1 + (((tickAnim - 280) / 13) * (0-(1)));
            zz = 4 + (((tickAnim - 280) / 13) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg.rotationPointX = this.frontrightleg.rotationPointX + (float)(xx);
        this.frontrightleg.rotationPointY = this.frontrightleg.rotationPointY - (float)(yy);
        this.frontrightleg.rotationPointZ = this.frontrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 280) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 280) / 13) * (0-(0)));
            yy = 32.5 + (((tickAnim - 280) / 13) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 280) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -72.72294 + (((tickAnim - 0) / 3) * (-71.92567-(-72.72294)));
            yy = -5.03318 + (((tickAnim - 0) / 3) * (42.43308-(-5.03318)));
            zz = 114.6374 + (((tickAnim - 0) / 3) * (112.62836-(114.6374)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -71.92567 + (((tickAnim - 3) / 1) * (71.35205-(-71.92567)));
            yy = 42.43308 + (((tickAnim - 3) / 1) * (51.0556-(42.43308)));
            zz = 112.62836 + (((tickAnim - 3) / 1) * (151.7211-(112.62836)));
        }
        else if (tickAnim >= 4 && tickAnim < 280) {
            xx = 71.35205 + (((tickAnim - 4) / 276) * (71.35205-(71.35205)));
            yy = 51.0556 + (((tickAnim - 4) / 276) * (51.0556-(51.0556)));
            zz = 151.7211 + (((tickAnim - 4) / 276) * (151.7211-(151.7211)));
        }
        else if (tickAnim >= 280 && tickAnim < 289) {
            xx = 71.35205 + (((tickAnim - 280) / 9) * (34.80049-(71.35205)));
            yy = 51.0556 + (((tickAnim - 280) / 9) * (12.49456-(51.0556)));
            zz = 151.7211 + (((tickAnim - 280) / 9) * (126.22605-(151.7211)));
        }
        else if (tickAnim >= 289 && tickAnim < 293) {
            xx = 34.80049 + (((tickAnim - 289) / 4) * (-72.72294-(34.80049)));
            yy = 12.49456 + (((tickAnim - 289) / 4) * (-5.03318-(12.49456)));
            zz = 126.22605 + (((tickAnim - 289) / 4) * (114.6374-(126.22605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 1 && tickAnim < 3) {
            xx = -38.98474 + (((tickAnim - 1) / 2) * (-43.15675-(-38.98474)));
            yy = 41.01308 + (((tickAnim - 1) / 2) * (56.46938-(41.01308)));
            zz = 51.60592 + (((tickAnim - 1) / 2) * (72.54649-(51.60592)));
        }
        else if (tickAnim >= 3 && tickAnim < 283) {
            xx = -43.15675 + (((tickAnim - 3) / 280) * (-43.15675-(-43.15675)));
            yy = 56.46938 + (((tickAnim - 3) / 280) * (56.46938-(56.46938)));
            zz = 72.54649 + (((tickAnim - 3) / 280) * (72.54649-(72.54649)));
        }
        else if (tickAnim >= 283 && tickAnim < 289) {
            xx = -43.15675 + (((tickAnim - 283) / 6) * (-22.78572-(-43.15675)));
            yy = 56.46938 + (((tickAnim - 283) / 6) * (32.66667-(56.46938)));
            zz = 72.54649 + (((tickAnim - 283) / 6) * (-9.74315-(72.54649)));
        }
        else if (tickAnim >= 289 && tickAnim < 293) {
            xx = -22.78572 + (((tickAnim - 289) / 4) * (-38.98474-(-22.78572)));
            yy = 32.66667 + (((tickAnim - 289) / 4) * (41.01308-(32.66667)));
            zz = -9.74315 + (((tickAnim - 289) / 4) * (51.60592-(-9.74315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 1) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 1) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 283) {
            xx = -2 + (((tickAnim - 6) / 277) * (-2-(-2)));
            yy = 1 + (((tickAnim - 6) / 277) * (1-(1)));
            zz = 4 + (((tickAnim - 6) / 277) * (4-(4)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = -2 + (((tickAnim - 283) / 10) * (0-(-2)));
            yy = 1 + (((tickAnim - 283) / 10) * (0-(1)));
            zz = 4 + (((tickAnim - 283) / 10) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(xx);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(yy);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 1 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 1) / 282) * (0-(0)));
            yy = -32.5 + (((tickAnim - 1) / 282) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 1) / 282) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 283) / 10) * (0-(0)));
            yy = -32.5 + (((tickAnim - 283) / 10) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 283) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 1 && tickAnim < 3) {
            xx = -72.72294 + (((tickAnim - 1) / 2) * (-71.92567-(-72.72294)));
            yy = 5.03318 + (((tickAnim - 1) / 2) * (-42.43308-(5.03318)));
            zz = -114.6374 + (((tickAnim - 1) / 2) * (-112.62836-(-114.6374)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -71.92567 + (((tickAnim - 3) / 2) * (71.35205-(-71.92567)));
            yy = -42.43308 + (((tickAnim - 3) / 2) * (-51.0556-(-42.43308)));
            zz = -112.62836 + (((tickAnim - 3) / 2) * (-151.7211-(-112.62836)));
        }
        else if (tickAnim >= 5 && tickAnim < 283) {
            xx = 71.35205 + (((tickAnim - 5) / 278) * (71.35205-(71.35205)));
            yy = -51.0556 + (((tickAnim - 5) / 278) * (-51.0556-(-51.0556)));
            zz = -151.7211 + (((tickAnim - 5) / 278) * (-151.7211-(-151.7211)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = 71.35205 + (((tickAnim - 283) / 10) * (-72.72294-(71.35205)));
            yy = -51.0556 + (((tickAnim - 283) / 10) * (5.03318-(-51.0556)));
            zz = -151.7211 + (((tickAnim - 283) / 10) * (-114.6374-(-151.7211)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 1 && tickAnim < 3) {
            xx = -156.71162 + (((tickAnim - 1) / 2) * (-33.29557-(-156.71162)));
            yy = -46.81243 + (((tickAnim - 1) / 2) * (-66.34628-(-46.81243)));
            zz = -147.55062 + (((tickAnim - 1) / 2) * (-22.15408-(-147.55062)));
        }
        else if (tickAnim >= 3 && tickAnim < 283) {
            xx = -33.29557 + (((tickAnim - 3) / 280) * (-33.29557-(-33.29557)));
            yy = -66.34628 + (((tickAnim - 3) / 280) * (-66.34628-(-66.34628)));
            zz = -22.15408 + (((tickAnim - 3) / 280) * (-22.15408-(-22.15408)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = -33.29557 + (((tickAnim - 283) / 10) * (-156.71162-(-33.29557)));
            yy = -66.34628 + (((tickAnim - 283) / 10) * (-46.81243-(-66.34628)));
            zz = -22.15408 + (((tickAnim - 283) / 10) * (-147.55062-(-22.15408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0.75-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (-3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 283) {
            xx = 0.75 + (((tickAnim - 3) / 280) * (0.75-(0.75)));
            yy = 0.25 + (((tickAnim - 3) / 280) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 3) / 280) * (-3-(-3)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = 0.75 + (((tickAnim - 283) / 10) * (0-(0.75)));
            yy = 0.25 + (((tickAnim - 283) / 10) * (0-(0.25)));
            zz = -3 + (((tickAnim - 283) / 10) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 35 + (((tickAnim - 1) / 2) * (82.5-(35)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 283) {
            xx = 0 + (((tickAnim - 3) / 280) * (0-(0)));
            yy = 82.5 + (((tickAnim - 3) / 280) * (82.5-(82.5)));
            zz = 0 + (((tickAnim - 3) / 280) * (0-(0)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 283) / 10) * (0-(0)));
            yy = 82.5 + (((tickAnim - 283) / 10) * (35-(82.5)));
            zz = 0 + (((tickAnim - 283) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 1 && tickAnim < 3) {
            xx = -7.71027 + (((tickAnim - 1) / 2) * (-34.02413-(-7.71027)));
            yy = -34.7486 + (((tickAnim - 1) / 2) * (-33.53478-(-34.7486)));
            zz = 14.49277 + (((tickAnim - 1) / 2) * (19.00103-(14.49277)));
        }
        else if (tickAnim >= 3 && tickAnim < 283) {
            xx = -34.02413 + (((tickAnim - 3) / 280) * (-34.02413-(-34.02413)));
            yy = -33.53478 + (((tickAnim - 3) / 280) * (-33.53478-(-33.53478)));
            zz = 19.00103 + (((tickAnim - 3) / 280) * (19.00103-(19.00103)));
        }
        else if (tickAnim >= 283 && tickAnim < 293) {
            xx = -34.02413 + (((tickAnim - 283) / 10) * (-7.71027-(-34.02413)));
            yy = -33.53478 + (((tickAnim - 283) / 10) * (-34.7486-(-33.53478)));
            zz = 19.00103 + (((tickAnim - 283) / 10) * (14.49277-(19.00103)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 2 && tickAnim < 4) {
            xx = -156.71162 + (((tickAnim - 2) / 2) * (-33.29557-(-156.71162)));
            yy = 46.81243 + (((tickAnim - 2) / 2) * (66.34628-(46.81243)));
            zz = 147.55062 + (((tickAnim - 2) / 2) * (22.15408-(147.55062)));
        }
        else if (tickAnim >= 4 && tickAnim < 282) {
            xx = -33.29557 + (((tickAnim - 4) / 278) * (-33.29557-(-33.29557)));
            yy = 66.34628 + (((tickAnim - 4) / 278) * (66.34628-(66.34628)));
            zz = 22.15408 + (((tickAnim - 4) / 278) * (22.15408-(22.15408)));
        }
        else if (tickAnim >= 282 && tickAnim < 292) {
            xx = -33.29557 + (((tickAnim - 282) / 10) * (-156.71162-(-33.29557)));
            yy = 66.34628 + (((tickAnim - 282) / 10) * (46.81243-(66.34628)));
            zz = 22.15408 + (((tickAnim - 282) / 10) * (147.55062-(22.15408)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 2) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (-3-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 282) {
            xx = -0.75 + (((tickAnim - 4) / 278) * (-0.75-(-0.75)));
            yy = 0.25 + (((tickAnim - 4) / 278) * (0.25-(0.25)));
            zz = -3 + (((tickAnim - 4) / 278) * (-3-(-3)));
        }
        else if (tickAnim >= 282 && tickAnim < 292) {
            xx = -0.75 + (((tickAnim - 282) / 10) * (0-(-0.75)));
            yy = 0.25 + (((tickAnim - 282) / 10) * (0-(0.25)));
            zz = -3 + (((tickAnim - 282) / 10) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = -35 + (((tickAnim - 2) / 2) * (-82.5-(-35)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 4) / 278) * (0-(0)));
            yy = -82.5 + (((tickAnim - 4) / 278) * (-82.5-(-82.5)));
            zz = 0 + (((tickAnim - 4) / 278) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 292) {
            xx = 0 + (((tickAnim - 282) / 10) * (0-(0)));
            yy = -82.5 + (((tickAnim - 282) / 10) * (-35-(-82.5)));
            zz = 0 + (((tickAnim - 282) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 2 && tickAnim < 4) {
            xx = -7.71027 + (((tickAnim - 2) / 2) * (-34.02413-(-7.71027)));
            yy = 34.7486 + (((tickAnim - 2) / 2) * (33.53478-(34.7486)));
            zz = -14.49277 + (((tickAnim - 2) / 2) * (-19.00103-(-14.49277)));
        }
        else if (tickAnim >= 4 && tickAnim < 282) {
            xx = -34.02413 + (((tickAnim - 4) / 278) * (-34.02413-(-34.02413)));
            yy = 33.53478 + (((tickAnim - 4) / 278) * (33.53478-(33.53478)));
            zz = -19.00103 + (((tickAnim - 4) / 278) * (-19.00103-(-19.00103)));
        }
        else if (tickAnim >= 282 && tickAnim < 292) {
            xx = -34.02413 + (((tickAnim - 282) / 10) * (-7.71027-(-34.02413)));
            yy = 33.53478 + (((tickAnim - 282) / 10) * (34.7486-(33.53478)));
            zz = -19.00103 + (((tickAnim - 282) / 10) * (-14.49277-(-19.00103)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.80643-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-14.95002-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-20.25915-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -7.80643 + (((tickAnim - 3) / 4) * (0-(-7.80643)));
            yy = -14.95002 + (((tickAnim - 3) / 4) * (-77.5-(-14.95002)));
            zz = -20.25915 + (((tickAnim - 3) / 4) * (0-(-20.25915)));
        }
        else if (tickAnim >= 7 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 7) / 273) * (0-(0)));
            yy = -77.5 + (((tickAnim - 7) / 273) * (-77.5-(-77.5)));
            zz = 0 + (((tickAnim - 7) / 273) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = -77.5 + (((tickAnim - 280) / 10) * (0-(-77.5)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 290) / 3) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 290) / 3) * (1.81818-(0)));
            zz = 0 + (((tickAnim - 290) / 3) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 299) {
            xx = -2.5 + (((tickAnim - 293) / 6) * (0-(-2.5)));
            yy = 1.81818 + (((tickAnim - 293) / 6) * (5-(1.81818)));
            zz = 0 + (((tickAnim - 293) / 6) * (0-(0)));
        }
        else if (tickAnim >= 299 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 299) / 5) * (2.5-(0)));
            yy = 5 + (((tickAnim - 299) / 5) * (2.69231-(5)));
            zz = 0 + (((tickAnim - 299) / 5) * (0-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 310) {
            xx = 2.5 + (((tickAnim - 304) / 6) * (0-(2.5)));
            yy = 2.69231 + (((tickAnim - 304) / 6) * (0-(2.69231)));
            zz = 0 + (((tickAnim - 304) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 480;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 64) / 16) * (0.81819-(0)));
            yy = 0 + (((tickAnim - 64) / 16) * (-0.03572-(0)));
            zz = 0 + (((tickAnim - 64) / 16) * (2.49974-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = 0.81819 + (((tickAnim - 80) / 14) * (2.55104-(0.81819)));
            yy = -0.03572 + (((tickAnim - 80) / 14) * (0.03399-(-0.03572)));
            zz = 2.49974 + (((tickAnim - 80) / 14) * (-0.58915-(2.49974)));
        }
        else if (tickAnim >= 94 && tickAnim < 117) {
            xx = 2.55104 + (((tickAnim - 94) / 23) * (3.49962-(2.55104)));
            yy = 0.03399 + (((tickAnim - 94) / 23) * (-0.04362-(0.03399)));
            zz = -0.58915 + (((tickAnim - 94) / 23) * (0.99905-(-0.58915)));
        }
        else if (tickAnim >= 117 && tickAnim < 139) {
            xx = 3.49962 + (((tickAnim - 117) / 22) * (2.5-(3.49962)));
            yy = -0.04362 + (((tickAnim - 117) / 22) * (0-(-0.04362)));
            zz = 0.99905 + (((tickAnim - 117) / 22) * (0-(0.99905)));
        }
        else if (tickAnim >= 139 && tickAnim < 438) {
            xx = 2.5 + (((tickAnim - 139) / 299) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 139) / 299) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 299) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 454) {
            xx = 2.5 + (((tickAnim - 438) / 16) * (1.54906-(2.5)));
            yy = 0 + (((tickAnim - 438) / 16) * (-0.05409-(0)));
            zz = 0 + (((tickAnim - 438) / 16) * (1.99927-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 467) {
            xx = 1.54906 + (((tickAnim - 454) / 13) * (0.8-(1.54906)));
            yy = -0.05409 + (((tickAnim - 454) / 13) * (0-(-0.05409)));
            zz = 1.99927 + (((tickAnim - 454) / 13) * (-0.96792-(1.99927)));
        }
        else if (tickAnim >= 467 && tickAnim < 480) {
            xx = 0.8 + (((tickAnim - 467) / 13) * (0-(0.8)));
            yy = 0 + (((tickAnim - 467) / 13) * (0-(0)));
            zz = -0.96792 + (((tickAnim - 467) / 13) * (0-(-0.96792)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 64) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 64) / 416) * (0-(0)));
            yy = -1.325 + (((tickAnim - 64) / 416) * (-1.325-(-1.325)));
            zz = 0 + (((tickAnim - 64) / 416) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -32.5 + (((tickAnim - 0) / 18) * (-22.84722-(-32.5)));
            yy = 0 + (((tickAnim - 0) / 18) * (8.97909-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-4.41998-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = -22.84722 + (((tickAnim - 18) / 26) * (-12.30145-(-22.84722)));
            yy = 8.97909 + (((tickAnim - 18) / 26) * (-7.13545-(8.97909)));
            zz = -4.41998 + (((tickAnim - 18) / 26) * (0.98033-(-4.41998)));
        }
        else if (tickAnim >= 44 && tickAnim < 64) {
            xx = -12.30145 + (((tickAnim - 44) / 20) * (-12.5-(-12.30145)));
            yy = -7.13545 + (((tickAnim - 44) / 20) * (0-(-7.13545)));
            zz = 0.98033 + (((tickAnim - 44) / 20) * (0-(0.98033)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = -12.5 + (((tickAnim - 64) / 49) * (-2.5-(-12.5)));
            yy = 0 + (((tickAnim - 64) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 49) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 393) {
            xx = -2.5 + (((tickAnim - 113) / 280) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 113) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 280) * (0-(0)));
        }
        else if (tickAnim >= 393 && tickAnim < 406) {
            xx = -2.5 + (((tickAnim - 393) / 13) * (-21.02-(-2.5)));
            yy = 0 + (((tickAnim - 393) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 393) / 13) * (0-(0)));
        }
        else if (tickAnim >= 406 && tickAnim < 410) {
            xx = -21.02 + (((tickAnim - 406) / 4) * (-23.52-(-21.02)));
            yy = 0 + (((tickAnim - 406) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 406) / 4) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 418) {
            xx = -23.52 + (((tickAnim - 410) / 8) * (-22.34267-(-23.52)));
            yy = 0 + (((tickAnim - 410) / 8) * (5.73882-(0)));
            zz = 0 + (((tickAnim - 410) / 8) * (-3.31745-(0)));
        }
        else if (tickAnim >= 418 && tickAnim < 424) {
            xx = -22.34267 + (((tickAnim - 418) / 6) * (-26.01839-(-22.34267)));
            yy = 5.73882 + (((tickAnim - 418) / 6) * (10.84-(5.73882)));
            zz = -3.31745 + (((tickAnim - 418) / 6) * (-6.26629-(-3.31745)));
        }
        else if (tickAnim >= 424 && tickAnim < 438) {
            xx = -26.01839 + (((tickAnim - 424) / 14) * (-27.54089-(-26.01839)));
            yy = 10.84 + (((tickAnim - 424) / 14) * (8.5911-(10.84)));
            zz = -6.26629 + (((tickAnim - 424) / 14) * (-5.13724-(-6.26629)));
        }
        else if (tickAnim >= 438 && tickAnim < 446) {
            xx = -27.54089 + (((tickAnim - 438) / 8) * (-26.46704-(-27.54089)));
            yy = 8.5911 + (((tickAnim - 438) / 8) * (-0.68543-(8.5911)));
            zz = -5.13724 + (((tickAnim - 438) / 8) * (0.83581-(-5.13724)));
        }
        else if (tickAnim >= 446 && tickAnim < 452) {
            xx = -26.46704 + (((tickAnim - 446) / 6) * (-30.07626-(-26.46704)));
            yy = -0.68543 + (((tickAnim - 446) / 6) * (-7.90051-(-0.68543)));
            zz = 0.83581 + (((tickAnim - 446) / 6) * (5.48152-(0.83581)));
        }
        else if (tickAnim >= 452 && tickAnim < 463) {
            xx = -30.07626 + (((tickAnim - 452) / 11) * (-30.86945-(-30.07626)));
            yy = -7.90051 + (((tickAnim - 452) / 11) * (-3.66163-(-7.90051)));
            zz = 5.48152 + (((tickAnim - 452) / 11) * (2.57648-(5.48152)));
        }
        else if (tickAnim >= 463 && tickAnim < 469) {
            xx = -30.86945 + (((tickAnim - 463) / 6) * (-30.74968-(-30.86945)));
            yy = -3.66163 + (((tickAnim - 463) / 6) * (-2.1256-(-3.66163)));
            zz = 2.57648 + (((tickAnim - 463) / 6) * (1.50566-(2.57648)));
        }
        else if (tickAnim >= 469 && tickAnim < 474) {
            xx = -30.74968 + (((tickAnim - 469) / 5) * (-32.50415-(-30.74968)));
            yy = -2.1256 + (((tickAnim - 469) / 5) * (-0.809-(-2.1256)));
            zz = 1.50566 + (((tickAnim - 469) / 5) * (0.58782-(1.50566)));
        }
        else if (tickAnim >= 474 && tickAnim < 480) {
            xx = -32.50415 + (((tickAnim - 474) / 6) * (-32.5-(-32.50415)));
            yy = -0.809 + (((tickAnim - 474) / 6) * (0-(-0.809)));
            zz = 0.58782 + (((tickAnim - 474) / 6) * (0-(0.58782)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 0) / 438) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 438) * (-0.49-(-0.5)));
            zz = -0.275 + (((tickAnim - 0) / 438) * (-0.36-(-0.275)));
        }
        else if (tickAnim >= 438 && tickAnim < 474) {
            xx = 0 + (((tickAnim - 438) / 36) * (0-(0)));
            yy = -0.49 + (((tickAnim - 438) / 36) * (-0.335-(-0.49)));
            zz = -0.36 + (((tickAnim - 438) / 36) * (-0.25-(-0.36)));
        }
        else if (tickAnim >= 474 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 474) / 6) * (0-(0)));
            yy = -0.335 + (((tickAnim - 474) / 6) * (-0.5-(-0.335)));
            zz = -0.25 + (((tickAnim - 474) / 6) * (-0.275-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -7.5 + (((tickAnim - 0) / 17) * (-7.64277-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (1.83051-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.16425-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -7.64277 + (((tickAnim - 17) / 6) * (-7.70034-(-7.64277)));
            yy = 1.83051 + (((tickAnim - 17) / 6) * (5.63369-(1.83051)));
            zz = -0.16425 + (((tickAnim - 17) / 6) * (-0.5117-(-0.16425)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = -7.70034 + (((tickAnim - 23) / 15) * (-7.73789-(-7.70034)));
            yy = 5.63369 + (((tickAnim - 23) / 15) * (-8.12052-(5.63369)));
            zz = -0.5117 + (((tickAnim - 23) / 15) * (0.73352-(-0.5117)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = -7.73789 + (((tickAnim - 38) / 9) * (-7.64593-(-7.73789)));
            yy = -8.12052 + (((tickAnim - 38) / 9) * (-10.41326-(-8.12052)));
            zz = 0.73352 + (((tickAnim - 38) / 9) * (0.92382-(0.73352)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
            xx = -7.64593 + (((tickAnim - 47) / 8) * (-7.6851-(-7.64593)));
            yy = -10.41326 + (((tickAnim - 47) / 8) * (-12.9246-(-10.41326)));
            zz = 0.92382 + (((tickAnim - 47) / 8) * (1.16286-(0.92382)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = -7.6851 + (((tickAnim - 55) / 26) * (-7.5-(-7.6851)));
            yy = -12.9246 + (((tickAnim - 55) / 26) * (0-(-12.9246)));
            zz = 1.16286 + (((tickAnim - 55) / 26) * (0-(1.16286)));
        }
        else if (tickAnim >= 81 && tickAnim < 363) {
            xx = -7.5 + (((tickAnim - 81) / 282) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 81) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 282) * (0-(0)));
        }
        else if (tickAnim >= 363 && tickAnim < 393) {
            xx = -7.5 + (((tickAnim - 363) / 30) * (-9.62-(-7.5)));
            yy = 0 + (((tickAnim - 363) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 363) / 30) * (0-(0)));
        }
        else if (tickAnim >= 393 && tickAnim < 406) {
            xx = -9.62 + (((tickAnim - 393) / 13) * (-18.1-(-9.62)));
            yy = 0 + (((tickAnim - 393) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 393) / 13) * (0-(0)));
        }
        else if (tickAnim >= 406 && tickAnim < 410) {
            xx = -18.1 + (((tickAnim - 406) / 4) * (-14.19-(-18.1)));
            yy = 0 + (((tickAnim - 406) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 406) / 4) * (0-(0)));
        }
        else if (tickAnim >= 410 && tickAnim < 424) {
            xx = -14.19 + (((tickAnim - 410) / 14) * (-13.05112-(-14.19)));
            yy = 0 + (((tickAnim - 410) / 14) * (11.07941-(0)));
            zz = 0 + (((tickAnim - 410) / 14) * (-1.96118-(0)));
        }
        else if (tickAnim >= 424 && tickAnim < 438) {
            xx = -13.05112 + (((tickAnim - 424) / 14) * (-11.55837-(-13.05112)));
            yy = 11.07941 + (((tickAnim - 424) / 14) * (7.40751-(11.07941)));
            zz = -1.96118 + (((tickAnim - 424) / 14) * (-1.17752-(-1.96118)));
        }
        else if (tickAnim >= 438 && tickAnim < 452) {
            xx = -11.55837 + (((tickAnim - 438) / 14) * (-9.94173-(-11.55837)));
            yy = 7.40751 + (((tickAnim - 438) / 14) * (-15.80934-(7.40751)));
            zz = -1.17752 + (((tickAnim - 438) / 14) * (1.90863-(-1.17752)));
        }
        else if (tickAnim >= 452 && tickAnim < 463) {
            xx = -9.94173 + (((tickAnim - 452) / 11) * (-9.34873-(-9.94173)));
            yy = -15.80934 + (((tickAnim - 452) / 11) * (-19.88625-(-15.80934)));
            zz = 1.90863 + (((tickAnim - 452) / 11) * (2.40639-(1.90863)));
        }
        else if (tickAnim >= 463 && tickAnim < 474) {
            xx = -9.34873 + (((tickAnim - 463) / 11) * (-7.50683-(-9.34873)));
            yy = -19.88625 + (((tickAnim - 463) / 11) * (2.98857-(-19.88625)));
            zz = 2.40639 + (((tickAnim - 463) / 11) * (-0.2617-(2.40639)));
        }
        else if (tickAnim >= 474 && tickAnim < 480) {
            xx = -7.50683 + (((tickAnim - 474) / 6) * (-7.5-(-7.50683)));
            yy = 2.98857 + (((tickAnim - 474) / 6) * (0-(2.98857)));
            zz = -0.2617 + (((tickAnim - 474) / 6) * (0-(-0.2617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -15 + (((tickAnim - 0) / 64) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = -15 + (((tickAnim - 64) / 416) * (-15-(-15)));
            yy = 0 + (((tickAnim - 64) / 416) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 416) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 1 + (((tickAnim - 0) / 64) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 64) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 64) * (1-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 64) / 49) * (1-(1)));
            yy = 1 + (((tickAnim - 64) / 49) * (0.2-(1)));
            zz = 1 + (((tickAnim - 64) / 49) * (1-(1)));
        }
        else if (tickAnim >= 113 && tickAnim < 364) {
            xx = 1 + (((tickAnim - 113) / 251) * (1-(1)));
            yy = 0.2 + (((tickAnim - 113) / 251) * (0.2-(0.2)));
            zz = 1 + (((tickAnim - 113) / 251) * (1-(1)));
        }
        else if (tickAnim >= 364 && tickAnim < 378) {
            xx = 1 + (((tickAnim - 364) / 14) * (1-(1)));
            yy = 0.2 + (((tickAnim - 364) / 14) * (1-(0.2)));
            zz = 1 + (((tickAnim - 364) / 14) * (1-(1)));
        }
        else if (tickAnim >= 378 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 378) / 102) * (1-(1)));
            yy = 1 + (((tickAnim - 378) / 102) * (1-(1)));
            zz = 1 + (((tickAnim - 378) / 102) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 1 + (((tickAnim - 0) / 64) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 64) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 64) * (1-(1)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = 1 + (((tickAnim - 64) / 49) * (1-(1)));
            yy = 1 + (((tickAnim - 64) / 49) * (0.2-(1)));
            zz = 1 + (((tickAnim - 64) / 49) * (1-(1)));
        }
        else if (tickAnim >= 113 && tickAnim < 364) {
            xx = 1 + (((tickAnim - 113) / 251) * (1-(1)));
            yy = 0.2 + (((tickAnim - 113) / 251) * (0.2-(0.2)));
            zz = 1 + (((tickAnim - 113) / 251) * (1-(1)));
        }
        else if (tickAnim >= 364 && tickAnim < 378) {
            xx = 1 + (((tickAnim - 364) / 14) * (1-(1)));
            yy = 0.2 + (((tickAnim - 364) / 14) * (1-(0.2)));
            zz = 1 + (((tickAnim - 364) / 14) * (1-(1)));
        }
        else if (tickAnim >= 378 && tickAnim < 480) {
            xx = 1 + (((tickAnim - 378) / 102) * (1-(1)));
            yy = 1 + (((tickAnim - 378) / 102) * (1-(1)));
            zz = 1 + (((tickAnim - 378) / 102) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -38.98474 + (((tickAnim - 0) / 64) * (-38.98474-(-38.98474)));
            yy = -41.01308 + (((tickAnim - 0) / 64) * (-41.01308-(-41.01308)));
            zz = -51.60592 + (((tickAnim - 0) / 64) * (-51.60592-(-51.60592)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = -38.98474 + (((tickAnim - 64) / 16) * (-38.2687-(-38.98474)));
            yy = -41.01308 + (((tickAnim - 64) / 16) * (-41.26396-(-41.01308)));
            zz = -51.60592 + (((tickAnim - 64) / 16) * (-53.66164-(-51.60592)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = -38.2687 + (((tickAnim - 80) / 14) * (-39.12689-(-38.2687)));
            yy = -41.26396 + (((tickAnim - 80) / 14) * (-42.72478-(-41.26396)));
            zz = -53.66164 + (((tickAnim - 80) / 14) * (-45.44984-(-53.66164)));
        }
        else if (tickAnim >= 94 && tickAnim < 139) {
            xx = -39.12689 + (((tickAnim - 94) / 45) * (-38.74555-(-39.12689)));
            yy = -42.72478 + (((tickAnim - 94) / 45) * (-45.78547-(-42.72478)));
            zz = -45.44984 + (((tickAnim - 94) / 45) * (-50.09503-(-45.44984)));
        }
        else if (tickAnim >= 139 && tickAnim < 438) {
            xx = -38.74555 + (((tickAnim - 139) / 299) * (-38.74555-(-38.74555)));
            yy = -45.78547 + (((tickAnim - 139) / 299) * (-45.78547-(-45.78547)));
            zz = -50.09503 + (((tickAnim - 139) / 299) * (-50.09503-(-50.09503)));
        }
        else if (tickAnim >= 438 && tickAnim < 454) {
            xx = -38.74555 + (((tickAnim - 438) / 16) * (-37.82998-(-38.74555)));
            yy = -45.78547 + (((tickAnim - 438) / 16) * (-42.84835-(-45.78547)));
            zz = -50.09503 + (((tickAnim - 438) / 16) * (-53.01013-(-50.09503)));
        }
        else if (tickAnim >= 454 && tickAnim < 467) {
            xx = -37.82998 + (((tickAnim - 454) / 13) * (-38.69045-(-37.82998)));
            yy = -42.84835 + (((tickAnim - 454) / 13) * (-42.34321-(-42.84835)));
            zz = -53.01013 + (((tickAnim - 454) / 13) * (-50.88834-(-53.01013)));
        }
        else if (tickAnim >= 467 && tickAnim < 480) {
            xx = -38.69045 + (((tickAnim - 467) / 13) * (-38.98474-(-38.69045)));
            yy = -42.34321 + (((tickAnim - 467) / 13) * (-41.01308-(-42.34321)));
            zz = -50.88834 + (((tickAnim - 467) / 13) * (-51.60592-(-50.88834)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 64) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 64) / 416) * (0-(0)));
            yy = 32.5 + (((tickAnim - 64) / 416) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 64) / 416) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -72.72294 + (((tickAnim - 0) / 64) * (-72.72294-(-72.72294)));
            yy = -5.03318 + (((tickAnim - 0) / 64) * (-5.03318-(-5.03318)));
            zz = 114.6374 + (((tickAnim - 0) / 64) * (114.6374-(114.6374)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = -72.72294 + (((tickAnim - 64) / 416) * (-72.72294-(-72.72294)));
            yy = -5.03318 + (((tickAnim - 64) / 416) * (-5.03318-(-5.03318)));
            zz = 114.6374 + (((tickAnim - 64) / 416) * (114.6374-(114.6374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -38.98474 + (((tickAnim - 0) / 64) * (-38.98474-(-38.98474)));
            yy = 41.01308 + (((tickAnim - 0) / 64) * (41.01308-(41.01308)));
            zz = 51.60592 + (((tickAnim - 0) / 64) * (51.60592-(51.60592)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = -38.98474 + (((tickAnim - 64) / 16) * (-38.99095-(-38.98474)));
            yy = 41.01308 + (((tickAnim - 64) / 16) * (41.97591-(41.01308)));
            zz = 51.60592 + (((tickAnim - 64) / 16) * (46.2978-(51.60592)));
        }
        else if (tickAnim >= 80 && tickAnim < 94) {
            xx = -38.99095 + (((tickAnim - 80) / 14) * (-38.84874-(-38.99095)));
            yy = 41.97591 + (((tickAnim - 80) / 14) * (42.96297-(41.97591)));
            zz = 46.2978 + (((tickAnim - 80) / 14) * (49.69064-(46.2978)));
        }
        else if (tickAnim >= 94 && tickAnim < 118) {
            xx = -38.84874 + (((tickAnim - 94) / 24) * (-40.38196-(-38.84874)));
            yy = 42.96297 + (((tickAnim - 94) / 24) * (46.36841-(42.96297)));
            zz = 49.69064 + (((tickAnim - 94) / 24) * (50.09585-(49.69064)));
        }
        else if (tickAnim >= 118 && tickAnim < 139) {
            xx = -40.38196 + (((tickAnim - 118) / 21) * (-38.74555-(-40.38196)));
            yy = 46.36841 + (((tickAnim - 118) / 21) * (45.78547-(46.36841)));
            zz = 50.09585 + (((tickAnim - 118) / 21) * (50.09503-(50.09585)));
        }
        else if (tickAnim >= 139 && tickAnim < 438) {
            xx = -38.74555 + (((tickAnim - 139) / 299) * (-38.74555-(-38.74555)));
            yy = 45.78547 + (((tickAnim - 139) / 299) * (45.78547-(45.78547)));
            zz = 50.09503 + (((tickAnim - 139) / 299) * (50.09503-(50.09503)));
        }
        else if (tickAnim >= 438 && tickAnim < 454) {
            xx = -38.74555 + (((tickAnim - 438) / 16) * (-39.52559-(-38.74555)));
            yy = 45.78547 + (((tickAnim - 438) / 16) * (44.70838-(45.78547)));
            zz = 50.09503 + (((tickAnim - 438) / 16) * (49.77083-(50.09503)));
        }
        else if (tickAnim >= 454 && tickAnim < 467) {
            xx = -39.52559 + (((tickAnim - 454) / 13) * (-37.96916-(-39.52559)));
            yy = 44.70838 + (((tickAnim - 454) / 13) * (41.2988-(44.70838)));
            zz = 49.77083 + (((tickAnim - 454) / 13) * (52.44921-(49.77083)));
        }
        else if (tickAnim >= 467 && tickAnim < 480) {
            xx = -37.96916 + (((tickAnim - 467) / 13) * (-38.98474-(-37.96916)));
            yy = 41.2988 + (((tickAnim - 467) / 13) * (41.01308-(41.2988)));
            zz = 52.44921 + (((tickAnim - 467) / 13) * (51.60592-(52.44921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = -32.5 + (((tickAnim - 0) / 64) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 64) / 416) * (0-(0)));
            yy = -32.5 + (((tickAnim - 64) / 416) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 64) / 416) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -72.72294 + (((tickAnim - 0) / 64) * (-72.72294-(-72.72294)));
            yy = 5.03318 + (((tickAnim - 0) / 64) * (5.03318-(5.03318)));
            zz = -114.6374 + (((tickAnim - 0) / 64) * (-114.6374-(-114.6374)));
        }
        else if (tickAnim >= 64 && tickAnim < 480) {
            xx = -72.72294 + (((tickAnim - 64) / 416) * (-72.72294-(-72.72294)));
            yy = 5.03318 + (((tickAnim - 64) / 416) * (5.03318-(5.03318)));
            zz = -114.6374 + (((tickAnim - 64) / 416) * (-114.6374-(-114.6374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -156.71162 + (((tickAnim - 0) / 64) * (-156.71162-(-156.71162)));
            yy = -46.81243 + (((tickAnim - 0) / 64) * (-46.81243-(-46.81243)));
            zz = -147.55062 + (((tickAnim - 0) / 64) * (-147.55062-(-147.55062)));
        }
        else if (tickAnim >= 64 && tickAnim < 91) {
            xx = -156.71162 + (((tickAnim - 64) / 27) * (-188.94531-(-156.71162)));
            yy = -46.81243 + (((tickAnim - 64) / 27) * (-82.72619-(-46.81243)));
            zz = -147.55062 + (((tickAnim - 64) / 27) * (-170.23951-(-147.55062)));
        }
        else if (tickAnim >= 91 && tickAnim < 113) {
            xx = -188.94531 + (((tickAnim - 91) / 22) * (-193.38519-(-188.94531)));
            yy = -82.72619 + (((tickAnim - 91) / 22) * (-111.90612-(-82.72619)));
            zz = -170.23951 + (((tickAnim - 91) / 22) * (-188.67423-(-170.23951)));
        }
        else if (tickAnim >= 113 && tickAnim < 139) {
            xx = -193.38519 + (((tickAnim - 113) / 26) * (-199.38519-(-193.38519)));
            yy = -111.90612 + (((tickAnim - 113) / 26) * (-111.90612-(-111.90612)));
            zz = -188.67423 + (((tickAnim - 113) / 26) * (-188.67423-(-188.67423)));
        }
        else if (tickAnim >= 139 && tickAnim < 438) {
            xx = -199.38519 + (((tickAnim - 139) / 299) * (-193.38519-(-199.38519)));
            yy = -111.90612 + (((tickAnim - 139) / 299) * (-111.90612-(-111.90612)));
            zz = -188.67423 + (((tickAnim - 139) / 299) * (-188.67423-(-188.67423)));
        }
        else if (tickAnim >= 438 && tickAnim < 455) {
            xx = -193.38519 + (((tickAnim - 438) / 17) * (-156.71162-(-193.38519)));
            yy = -111.90612 + (((tickAnim - 438) / 17) * (-46.81243-(-111.90612)));
            zz = -188.67423 + (((tickAnim - 438) / 17) * (-147.55062-(-188.67423)));
        }
        else if (tickAnim >= 455 && tickAnim < 480) {
            xx = -156.71162 + (((tickAnim - 455) / 25) * (-156.71162-(-156.71162)));
            yy = -46.81243 + (((tickAnim - 455) / 25) * (-46.81243-(-46.81243)));
            zz = -147.55062 + (((tickAnim - 455) / 25) * (-147.55062-(-147.55062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 64) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 49) * (2-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 113) / 325) * (0-(0)));
            yy = 0 + (((tickAnim - 113) / 325) * (0-(0)));
            zz = 2 + (((tickAnim - 113) / 325) * (2-(2)));
        }
        else if (tickAnim >= 438 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 438) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 438) / 17) * (0-(0)));
            zz = 2 + (((tickAnim - 438) / 17) * (0-(2)));
        }
        else if (tickAnim >= 455 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 455) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 455) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 455) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg.rotationPointX = this.backrightleg.rotationPointX + (float)(xx);
        this.backrightleg.rotationPointY = this.backrightleg.rotationPointY - (float)(yy);
        this.backrightleg.rotationPointZ = this.backrightleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 35 + (((tickAnim - 0) / 64) * (35-(35)));
            zz = 0 + (((tickAnim - 0) / 64) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 64) / 49) * (0-(0)));
            yy = 35 + (((tickAnim - 64) / 49) * (-15-(35)));
            zz = 0 + (((tickAnim - 64) / 49) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 438) {
            xx = 0 + (((tickAnim - 113) / 325) * (0-(0)));
            yy = -15 + (((tickAnim - 113) / 325) * (-15-(-15)));
            zz = 0 + (((tickAnim - 113) / 325) * (0-(0)));
        }
        else if (tickAnim >= 438 && tickAnim < 455) {
            xx = 0 + (((tickAnim - 438) / 17) * (0-(0)));
            yy = -15 + (((tickAnim - 438) / 17) * (35-(-15)));
            zz = 0 + (((tickAnim - 438) / 17) * (0-(0)));
        }
        else if (tickAnim >= 455 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 455) / 25) * (0-(0)));
            yy = 35 + (((tickAnim - 455) / 25) * (35-(35)));
            zz = 0 + (((tickAnim - 455) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 64) {
            xx = -7.71027 + (((tickAnim - 0) / 64) * (-7.71027-(-7.71027)));
            yy = -34.7486 + (((tickAnim - 0) / 64) * (-34.7486-(-34.7486)));
            zz = 14.49277 + (((tickAnim - 0) / 64) * (14.49277-(14.49277)));
        }
        else if (tickAnim >= 64 && tickAnim < 113) {
            xx = -7.71027 + (((tickAnim - 64) / 49) * (1.87827-(-7.71027)));
            yy = -34.7486 + (((tickAnim - 64) / 49) * (-6.04594-(-34.7486)));
            zz = 14.49277 + (((tickAnim - 64) / 49) * (1.47163-(14.49277)));
        }
        else if (tickAnim >= 113 && tickAnim < 438) {
            xx = 1.87827 + (((tickAnim - 113) / 325) * (1.87827-(1.87827)));
            yy = -6.04594 + (((tickAnim - 113) / 325) * (-6.04594-(-6.04594)));
            zz = 1.47163 + (((tickAnim - 113) / 325) * (1.47163-(1.47163)));
        }
        else if (tickAnim >= 438 && tickAnim < 455) {
            xx = 1.87827 + (((tickAnim - 438) / 17) * (-7.71027-(1.87827)));
            yy = -6.04594 + (((tickAnim - 438) / 17) * (-34.7486-(-6.04594)));
            zz = 1.47163 + (((tickAnim - 438) / 17) * (14.49277-(1.47163)));
        }
        else if (tickAnim >= 455 && tickAnim < 480) {
            xx = -7.71027 + (((tickAnim - 455) / 25) * (-7.71027-(-7.71027)));
            yy = -34.7486 + (((tickAnim - 455) / 25) * (-34.7486-(-34.7486)));
            zz = 14.49277 + (((tickAnim - 455) / 25) * (14.49277-(14.49277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = -156.71162 + (((tickAnim - 0) / 68) * (-156.71162-(-156.71162)));
            yy = 46.81243 + (((tickAnim - 0) / 68) * (46.81243-(46.81243)));
            zz = 147.55062 + (((tickAnim - 0) / 68) * (147.55062-(147.55062)));
        }
        else if (tickAnim >= 68 && tickAnim < 83) {
            xx = -156.71162 + (((tickAnim - 68) / 15) * (-180.63318-(-156.71162)));
            yy = 46.81243 + (((tickAnim - 68) / 15) * (65.89162-(46.81243)));
            zz = 147.55062 + (((tickAnim - 68) / 15) * (159.60409-(147.55062)));
        }
        else if (tickAnim >= 83 && tickAnim < 117) {
            xx = -180.63318 + (((tickAnim - 83) / 34) * (-197.38519-(-180.63318)));
            yy = 65.89162 + (((tickAnim - 83) / 34) * (111.90612-(65.89162)));
            zz = 159.60409 + (((tickAnim - 83) / 34) * (188.67423-(159.60409)));
        }
        else if (tickAnim >= 117 && tickAnim < 441) {
            xx = -197.38519 + (((tickAnim - 117) / 324) * (-193.38519-(-197.38519)));
            yy = 111.90612 + (((tickAnim - 117) / 324) * (111.90612-(111.90612)));
            zz = 188.67423 + (((tickAnim - 117) / 324) * (188.67423-(188.67423)));
        }
        else if (tickAnim >= 441 && tickAnim < 458) {
            xx = -193.38519 + (((tickAnim - 441) / 17) * (-156.71162-(-193.38519)));
            yy = 111.90612 + (((tickAnim - 441) / 17) * (46.81243-(111.90612)));
            zz = 188.67423 + (((tickAnim - 441) / 17) * (147.55062-(188.67423)));
        }
        else if (tickAnim >= 458 && tickAnim < 480) {
            xx = -156.71162 + (((tickAnim - 458) / 22) * (-156.71162-(-156.71162)));
            yy = 46.81243 + (((tickAnim - 458) / 22) * (46.81243-(46.81243)));
            zz = 147.55062 + (((tickAnim - 458) / 22) * (147.55062-(147.55062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 68) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 49) * (2-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 441) {
            xx = 0 + (((tickAnim - 117) / 324) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 324) * (0-(0)));
            zz = 2 + (((tickAnim - 117) / 324) * (2-(2)));
        }
        else if (tickAnim >= 441 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 441) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 441) / 17) * (0-(0)));
            zz = 2 + (((tickAnim - 441) / 17) * (0-(2)));
        }
        else if (tickAnim >= 458 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 458) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 458) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 458) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg.rotationPointX = this.backleftleg.rotationPointX + (float)(xx);
        this.backleftleg.rotationPointY = this.backleftleg.rotationPointY - (float)(yy);
        this.backleftleg.rotationPointZ = this.backleftleg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            yy = -35 + (((tickAnim - 0) / 68) * (-35-(-35)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 68) / 49) * (0-(0)));
            yy = -35 + (((tickAnim - 68) / 49) * (15-(-35)));
            zz = 0 + (((tickAnim - 68) / 49) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 441) {
            xx = 0 + (((tickAnim - 117) / 324) * (0-(0)));
            yy = 15 + (((tickAnim - 117) / 324) * (15-(15)));
            zz = 0 + (((tickAnim - 117) / 324) * (0-(0)));
        }
        else if (tickAnim >= 441 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 441) / 17) * (0-(0)));
            yy = 15 + (((tickAnim - 441) / 17) * (-35-(15)));
            zz = 0 + (((tickAnim - 441) / 17) * (0-(0)));
        }
        else if (tickAnim >= 458 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 458) / 22) * (0-(0)));
            yy = -35 + (((tickAnim - 458) / 22) * (-35-(-35)));
            zz = 0 + (((tickAnim - 458) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = -7.71027 + (((tickAnim - 0) / 68) * (-7.71027-(-7.71027)));
            yy = 34.7486 + (((tickAnim - 0) / 68) * (34.7486-(34.7486)));
            zz = -14.49277 + (((tickAnim - 0) / 68) * (-14.49277-(-14.49277)));
        }
        else if (tickAnim >= 68 && tickAnim < 117) {
            xx = -7.71027 + (((tickAnim - 68) / 49) * (1.87827-(-7.71027)));
            yy = 34.7486 + (((tickAnim - 68) / 49) * (6.04594-(34.7486)));
            zz = -14.49277 + (((tickAnim - 68) / 49) * (-1.47163-(-14.49277)));
        }
        else if (tickAnim >= 117 && tickAnim < 441) {
            xx = 1.87827 + (((tickAnim - 117) / 324) * (1.87827-(1.87827)));
            yy = 6.04594 + (((tickAnim - 117) / 324) * (6.04594-(6.04594)));
            zz = -1.47163 + (((tickAnim - 117) / 324) * (-1.47163-(-1.47163)));
        }
        else if (tickAnim >= 441 && tickAnim < 458) {
            xx = 1.87827 + (((tickAnim - 441) / 17) * (-7.71027-(1.87827)));
            yy = 6.04594 + (((tickAnim - 441) / 17) * (34.7486-(6.04594)));
            zz = -1.47163 + (((tickAnim - 441) / 17) * (-14.49277-(-1.47163)));
        }
        else if (tickAnim >= 458 && tickAnim < 480) {
            xx = -7.71027 + (((tickAnim - 458) / 22) * (-7.71027-(-7.71027)));
            yy = 34.7486 + (((tickAnim - 458) / 22) * (34.7486-(34.7486)));
            zz = -14.49277 + (((tickAnim - 458) / 22) * (-14.49277-(-14.49277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*10), main.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*10));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*1), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*5));
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*50), frontrightleg.rotateAngleY + (float) Math.toRadians(-40), frontrightleg.rotateAngleZ + (float) Math.toRadians(60));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*50), frontrightleg2.rotateAngleY + (float) Math.toRadians(-30), frontrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(40-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), frontrightleg3.rotateAngleY + (float) Math.toRadians(50), frontrightleg3.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*20));
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*50), frontleftleg.rotateAngleY + (float) Math.toRadians(40), frontleftleg.rotateAngleZ + (float) Math.toRadians(-60));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*50), frontleftleg2.rotateAngleY + (float) Math.toRadians(30), frontleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), frontleftleg3.rotateAngleY + (float) Math.toRadians(-50), frontleftleg3.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*20));
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*20), backrightleg.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*30), backrightleg.rotateAngleZ + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*20));
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(0), backrightleg2.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*30), backrightleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), backrightleg3.rotateAngleY + (float) Math.toRadians(0), backrightleg3.rotateAngleZ + (float) Math.toRadians(40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*20));
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*20), backleftleg.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*30), backleftleg.rotateAngleZ + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*3))*20));
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(0), backleftleg2.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*30), backleftleg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60*2))*50), backleftleg3.rotateAngleY + (float) Math.toRadians(0), backleftleg3.rotateAngleZ + (float) Math.toRadians(-40+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*20));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*10), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*10));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-20), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.74974-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.68037-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (0.98689-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -0.74974 + (((tickAnim - 3) / 4) * (-1.1-(-0.74974)));
            yy = 0.68037 + (((tickAnim - 3) / 4) * (0.15-(0.68037)));
            zz = 0.98689 + (((tickAnim - 3) / 4) * (-0.27647-(0.98689)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -1.1 + (((tickAnim - 7) / 7) * (0-(-1.1)));
            yy = 0.15 + (((tickAnim - 7) / 7) * (-0.5-(0.15)));
            zz = -0.27647 + (((tickAnim - 7) / 7) * (-0.5-(-0.27647)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0.49977-(0)));
            yy = -0.5 + (((tickAnim - 14) / 8) * (-0.84882-(-0.5)));
            zz = -0.5 + (((tickAnim - 14) / 8) * (-1.31545-(-0.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0.49977 + (((tickAnim - 22) / 8) * (0-(0.49977)));
            yy = -0.84882 + (((tickAnim - 22) / 8) * (-1-(-0.84882)));
            zz = -1.31545 + (((tickAnim - 22) / 8) * (-1-(-1.31545)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-0.66644-(0)));
            yy = -1 + (((tickAnim - 30) / 3) * (-0.98255-(-1)));
            zz = -1 + (((tickAnim - 30) / 3) * (0.55545-(-1)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -0.66644 + (((tickAnim - 33) / 5) * (-1.1-(-0.66644)));
            yy = -0.98255 + (((tickAnim - 33) / 5) * (-0.775-(-0.98255)));
            zz = 0.55545 + (((tickAnim - 33) / 5) * (0.55-(0.55545)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -1.1 + (((tickAnim - 38) / 7) * (0-(-1.1)));
            yy = -0.775 + (((tickAnim - 38) / 7) * (-0.125-(-0.775)));
            zz = 0.55 + (((tickAnim - 38) / 7) * (-0.5-(0.55)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0.49977-(0)));
            yy = -0.125 + (((tickAnim - 45) / 8) * (0.54882-(-0.125)));
            zz = -0.5 + (((tickAnim - 45) / 8) * (1.24966-(-0.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0.49977 + (((tickAnim - 53) / 7) * (0-(0.49977)));
            yy = 0.54882 + (((tickAnim - 53) / 7) * (1-(0.54882)));
            zz = 1.24966 + (((tickAnim - 53) / 7) * (1-(1.24966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 5) * (0-(0.3)));
            zz = 0.2 + (((tickAnim - 5) / 5) * (0.3-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-0.2-(0)));
            zz = 0.3 + (((tickAnim - 10) / 10) * (0.3-(0.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 10) * (0-(-0.2)));
            zz = 0.3 + (((tickAnim - 20) / 10) * (0-(0.3)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.18-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            yy = 0.18 + (((tickAnim - 35) / 6) * (-0.1-(0.18)));
            zz = 0.1 + (((tickAnim - 35) / 6) * (0.2-(0.1)));
        }
        else if (tickAnim >= 41 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 41) / 10) * (0-(0)));
            yy = -0.1 + (((tickAnim - 41) / 10) * (-0.21-(-0.1)));
            zz = 0.2 + (((tickAnim - 41) / 10) * (0.1-(0.2)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = -0.21 + (((tickAnim - 51) / 9) * (0-(-0.21)));
            zz = 0.1 + (((tickAnim - 51) / 9) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = -1.5 + (((tickAnim - 0) / 5) * (-1.08333-(-1.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 5) / 25) * (0-(2.5)));
            yy = -1.08333 + (((tickAnim - 5) / 25) * (1-(-1.08333)));
            zz = 0 + (((tickAnim - 5) / 25) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (2.5-(0)));
            yy = 1 + (((tickAnim - 30) / 5) * (0.58333-(1)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 35) / 25) * (0-(2.5)));
            yy = 0.58333 + (((tickAnim - 35) / 25) * (-1.5-(0.58333)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26.62169 + (((tickAnim - 0) / 8) * (-33.40176-(-26.62169)));
            yy = -29.21339 + (((tickAnim - 0) / 8) * (-25.46753-(-29.21339)));
            zz = -36.00963 + (((tickAnim - 0) / 8) * (-59.7396-(-36.00963)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -33.40176 + (((tickAnim - 8) / 12) * (-52.85721-(-33.40176)));
            yy = -25.46753 + (((tickAnim - 8) / 12) * (-21.28608-(-25.46753)));
            zz = -59.7396 + (((tickAnim - 8) / 12) * (-70.59566-(-59.7396)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -52.85721 + (((tickAnim - 20) / 8) * (-61.82301-(-52.85721)));
            yy = -21.28608 + (((tickAnim - 20) / 8) * (-8.33399-(-21.28608)));
            zz = -70.59566 + (((tickAnim - 20) / 8) * (-76.5223-(-70.59566)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -61.82301 + (((tickAnim - 28) / 12) * (-51.94195-(-61.82301)));
            yy = -8.33399 + (((tickAnim - 28) / 12) * (21.5586-(-8.33399)));
            zz = -76.5223 + (((tickAnim - 28) / 12) * (-53.9295-(-76.5223)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = -51.94195 + (((tickAnim - 40) / 11) * (-63.04935-(-51.94195)));
            yy = 21.5586 + (((tickAnim - 40) / 11) * (-1.95041-(21.5586)));
            zz = -53.9295 + (((tickAnim - 40) / 11) * (-41.75611-(-53.9295)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -63.04935 + (((tickAnim - 51) / 4) * (-51.49147-(-63.04935)));
            yy = -1.95041 + (((tickAnim - 51) / 4) * (-14.34257-(-1.95041)));
            zz = -41.75611 + (((tickAnim - 51) / 4) * (-39.1441-(-41.75611)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -51.49147 + (((tickAnim - 55) / 5) * (-26.62169-(-51.49147)));
            yy = -14.34257 + (((tickAnim - 55) / 5) * (-29.21339-(-14.34257)));
            zz = -39.1441 + (((tickAnim - 55) / 5) * (-36.00963-(-39.1441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (48.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 48.75 + (((tickAnim - 20) / 8) * (50.47-(48.75)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 50.47 + (((tickAnim - 28) / 12) * (50-(50.47)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 50 + (((tickAnim - 40) / 20) * (0-(50)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -73.37164 + (((tickAnim - 0) / 8) * (-73.08231-(-73.37164)));
            yy = 4.72197 + (((tickAnim - 0) / 8) * (0.59057-(4.72197)));
            zz = 105.85606 + (((tickAnim - 0) / 8) * (117.79688-(105.85606)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -73.08231 + (((tickAnim - 8) / 12) * (-95.00067-(-73.08231)));
            yy = 0.59057 + (((tickAnim - 8) / 12) * (29.87003-(0.59057)));
            zz = 117.79688 + (((tickAnim - 8) / 12) * (138.2145-(117.79688)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -95.00067 + (((tickAnim - 20) / 8) * (-114.8839-(-95.00067)));
            yy = 29.87003 + (((tickAnim - 20) / 8) * (35.99211-(29.87003)));
            zz = 138.2145 + (((tickAnim - 20) / 8) * (146.75706-(138.2145)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -114.8839 + (((tickAnim - 28) / 12) * (-128.04391-(-114.8839)));
            yy = 35.99211 + (((tickAnim - 28) / 12) * (31.68665-(35.99211)));
            zz = 146.75706 + (((tickAnim - 28) / 12) * (158.97032-(146.75706)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = -128.04391 + (((tickAnim - 40) / 11) * (-114.76143-(-128.04391)));
            yy = 31.68665 + (((tickAnim - 40) / 11) * (13.60314-(31.68665)));
            zz = 158.97032 + (((tickAnim - 40) / 11) * (127.04568-(158.97032)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = -114.76143 + (((tickAnim - 51) / 9) * (-73.37164-(-114.76143)));
            yy = 13.60314 + (((tickAnim - 51) / 9) * (4.72197-(13.60314)));
            zz = 127.04568 + (((tickAnim - 51) / 9) * (105.85606-(127.04568)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -59.85 + (((tickAnim - 0) / 10) * (-51.94195-(-59.85)));
            yy = 2.36 + (((tickAnim - 0) / 10) * (-21.5586-(2.36)));
            zz = 72 + (((tickAnim - 0) / 10) * (53.9295-(72)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -51.94195 + (((tickAnim - 10) / 11) * (-63.04935-(-51.94195)));
            yy = -21.5586 + (((tickAnim - 10) / 11) * (1.95041-(-21.5586)));
            zz = 53.9295 + (((tickAnim - 10) / 11) * (41.75611-(53.9295)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -63.04935 + (((tickAnim - 21) / 4) * (-51.49147-(-63.04935)));
            yy = 1.95041 + (((tickAnim - 21) / 4) * (14.34257-(1.95041)));
            zz = 41.75611 + (((tickAnim - 21) / 4) * (39.1441-(41.75611)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -51.49147 + (((tickAnim - 25) / 5) * (-26.62169-(-51.49147)));
            yy = 14.34257 + (((tickAnim - 25) / 5) * (29.21339-(14.34257)));
            zz = 39.1441 + (((tickAnim - 25) / 5) * (36.00963-(39.1441)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -26.62169 + (((tickAnim - 30) / 8) * (-33.40176-(-26.62169)));
            yy = 29.21339 + (((tickAnim - 30) / 8) * (25.46753-(29.21339)));
            zz = 36.00963 + (((tickAnim - 30) / 8) * (59.7396-(36.00963)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -33.40176 + (((tickAnim - 38) / 12) * (-52.85721-(-33.40176)));
            yy = 25.46753 + (((tickAnim - 38) / 12) * (21.28608-(25.46753)));
            zz = 59.7396 + (((tickAnim - 38) / 12) * (70.59566-(59.7396)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -52.85721 + (((tickAnim - 50) / 8) * (-61.82301-(-52.85721)));
            yy = 21.28608 + (((tickAnim - 50) / 8) * (8.33399-(21.28608)));
            zz = 70.59566 + (((tickAnim - 50) / 8) * (76.5223-(70.59566)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -61.82301 + (((tickAnim - 58) / 2) * (-59.85-(-61.82301)));
            yy = 8.33399 + (((tickAnim - 58) / 2) * (2.36-(8.33399)));
            zz = 76.5223 + (((tickAnim - 58) / 2) * (72-(76.5223)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -50.38 + (((tickAnim - 0) / 10) * (-50-(-50.38)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            yy = -50 + (((tickAnim - 10) / 20) * (0-(-50)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (-48.75-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            yy = -48.75 + (((tickAnim - 50) / 8) * (-50.47-(-48.75)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = -50.47 + (((tickAnim - 58) / 2) * (-50.38-(-50.47)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -117.52 + (((tickAnim - 0) / 10) * (-128.04391-(-117.52)));
            yy = -35.13 + (((tickAnim - 0) / 10) * (-31.68665-(-35.13)));
            zz = -149.2 + (((tickAnim - 0) / 10) * (-158.97032-(-149.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -128.04391 + (((tickAnim - 10) / 11) * (-114.76143-(-128.04391)));
            yy = -31.68665 + (((tickAnim - 10) / 11) * (-13.60314-(-31.68665)));
            zz = -158.97032 + (((tickAnim - 10) / 11) * (-127.04568-(-158.97032)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -114.76143 + (((tickAnim - 21) / 9) * (-73.37164-(-114.76143)));
            yy = -13.60314 + (((tickAnim - 21) / 9) * (-4.72197-(-13.60314)));
            zz = -127.04568 + (((tickAnim - 21) / 9) * (-105.85606-(-127.04568)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -73.37164 + (((tickAnim - 30) / 8) * (-73.08231-(-73.37164)));
            yy = -4.72197 + (((tickAnim - 30) / 8) * (-0.59057-(-4.72197)));
            zz = -105.85606 + (((tickAnim - 30) / 8) * (-117.79688-(-105.85606)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -73.08231 + (((tickAnim - 38) / 12) * (-95.00067-(-73.08231)));
            yy = -0.59057 + (((tickAnim - 38) / 12) * (-29.87003-(-0.59057)));
            zz = -117.79688 + (((tickAnim - 38) / 12) * (-138.2145-(-117.79688)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = -95.00067 + (((tickAnim - 50) / 8) * (-114.8839-(-95.00067)));
            yy = -29.87003 + (((tickAnim - 50) / 8) * (-35.99211-(-29.87003)));
            zz = -138.2145 + (((tickAnim - 50) / 8) * (-146.75706-(-138.2145)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -114.8839 + (((tickAnim - 58) / 2) * (-117.52-(-114.8839)));
            yy = -35.99211 + (((tickAnim - 58) / 2) * (-35.13-(-35.99211)));
            zz = -146.75706 + (((tickAnim - 58) / 2) * (-149.2-(-146.75706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -167.14 + (((tickAnim - 0) / 3) * (-173.76374-(-167.14)));
            yy = -74.81 + (((tickAnim - 0) / 3) * (-78.07596-(-74.81)));
            zz = -164.23 + (((tickAnim - 0) / 3) * (-172.67129-(-164.23)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -173.76374 + (((tickAnim - 3) / 7) * (-179-(-173.76374)));
            yy = -78.07596 + (((tickAnim - 3) / 7) * (-97.5-(-78.07596)));
            zz = -172.67129 + (((tickAnim - 3) / 7) * (-180-(-172.67129)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -179 + (((tickAnim - 10) / 6) * (-173.54014-(-179)));
            yy = -97.5 + (((tickAnim - 10) / 6) * (-57.78929-(-97.5)));
            zz = -180 + (((tickAnim - 10) / 6) * (-156.50248-(-180)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -173.54014 + (((tickAnim - 16) / 5) * (-101.75727-(-173.54014)));
            yy = -57.78929 + (((tickAnim - 16) / 5) * (-54.89862-(-57.78929)));
            zz = -156.50248 + (((tickAnim - 16) / 5) * (-69.25112-(-156.50248)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -101.75727 + (((tickAnim - 21) / 6) * (-55.89643-(-101.75727)));
            yy = -54.89862 + (((tickAnim - 21) / 6) * (-76.2267-(-54.89862)));
            zz = -69.25112 + (((tickAnim - 21) / 6) * (-36.98382-(-69.25112)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -55.89643 + (((tickAnim - 27) / 3) * (-49.78089-(-55.89643)));
            yy = -76.2267 + (((tickAnim - 27) / 3) * (-84.81769-(-76.2267)));
            zz = -36.98382 + (((tickAnim - 27) / 3) * (-39.26202-(-36.98382)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -49.78089 + (((tickAnim - 30) / 3) * (-55.32035-(-49.78089)));
            yy = -84.81769 + (((tickAnim - 30) / 3) * (-80.39917-(-84.81769)));
            zz = -39.26202 + (((tickAnim - 30) / 3) * (-49.69315-(-39.26202)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -55.32035 + (((tickAnim - 33) / 10) * (-86.69734-(-55.32035)));
            yy = -80.39917 + (((tickAnim - 33) / 10) * (-68.95256-(-80.39917)));
            zz = -49.69315 + (((tickAnim - 33) / 10) * (-73.72414-(-49.69315)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -86.69734 + (((tickAnim - 43) / 5) * (-111.4379-(-86.69734)));
            yy = -68.95256 + (((tickAnim - 43) / 5) * (-63.85418-(-68.95256)));
            zz = -73.72414 + (((tickAnim - 43) / 5) * (-99.43136-(-73.72414)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -111.4379 + (((tickAnim - 48) / 7) * (-147.35916-(-111.4379)));
            yy = -63.85418 + (((tickAnim - 48) / 7) * (-70.42767-(-63.85418)));
            zz = -99.43136 + (((tickAnim - 48) / 7) * (-138.31054-(-99.43136)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -147.35916 + (((tickAnim - 55) / 5) * (-167.14-(-147.35916)));
            yy = -70.42767 + (((tickAnim - 55) / 5) * (-74.81-(-70.42767)));
            zz = -138.31054 + (((tickAnim - 55) / 5) * (-164.23-(-138.31054)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25.25 + (((tickAnim - 0) / 10) * (0-(25.25)));
            yy = 16.91 + (((tickAnim - 0) / 10) * (0-(16.91)));
            zz = 19.75 + (((tickAnim - 0) / 10) * (0-(19.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 10) / 20) * (100.9899-(0)));
            yy = 0 + (((tickAnim - 10) / 20) * (67.6599-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (79.0101-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 60) {
            xx = 100.9899 + (((tickAnim - 30) / 30) * (25.25-(100.9899)));
            yy = 67.6599 + (((tickAnim - 30) / 30) * (16.91-(67.6599)));
            zz = 79.0101 + (((tickAnim - 30) / 30) * (19.75-(79.0101)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -53.19 + (((tickAnim - 0) / 10) * (-30.20339-(-53.19)));
            yy = -27.35 + (((tickAnim - 0) / 10) * (-33.35727-(-27.35)));
            zz = 37.37 + (((tickAnim - 0) / 10) * (33.61819-(37.37)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.20339 + (((tickAnim - 10) / 10) * (-34.94-(-30.20339)));
            yy = -33.35727 + (((tickAnim - 10) / 10) * (-19.54-(-33.35727)));
            zz = 33.61819 + (((tickAnim - 10) / 10) * (43.12-(33.61819)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -34.94 + (((tickAnim - 20) / 10) * (-52.16698-(-34.94)));
            yy = -19.54 + (((tickAnim - 20) / 10) * (-9.32681-(-19.54)));
            zz = 43.12 + (((tickAnim - 20) / 10) * (48.62443-(43.12)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -52.16698 + (((tickAnim - 30) / 3) * (-57.28065-(-52.16698)));
            yy = -9.32681 + (((tickAnim - 30) / 3) * (-11.32938-(-9.32681)));
            zz = 48.62443 + (((tickAnim - 30) / 3) * (47.37394-(48.62443)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -57.28065 + (((tickAnim - 33) / 10) * (-56.56572-(-57.28065)));
            yy = -11.32938 + (((tickAnim - 33) / 10) * (-14.46948-(-11.32938)));
            zz = 47.37394 + (((tickAnim - 33) / 10) * (44.99586-(47.37394)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = -56.56572 + (((tickAnim - 43) / 12) * (-55.10427-(-56.56572)));
            yy = -14.46948 + (((tickAnim - 43) / 12) * (-21.32607-(-14.46948)));
            zz = 44.99586 + (((tickAnim - 43) / 12) * (40.83679-(44.99586)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -55.10427 + (((tickAnim - 55) / 5) * (-53.19-(-55.10427)));
            yy = -21.32607 + (((tickAnim - 55) / 5) * (-27.35-(-21.32607)));
            zz = 40.83679 + (((tickAnim - 55) / 5) * (37.37-(40.83679)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -49.78089 + (((tickAnim - 0) / 3) * (-55.32035-(-49.78089)));
            yy = 84.81769 + (((tickAnim - 0) / 3) * (80.39917-(84.81769)));
            zz = 39.26202 + (((tickAnim - 0) / 3) * (49.69315-(39.26202)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -55.32035 + (((tickAnim - 3) / 10) * (-86.69734-(-55.32035)));
            yy = 80.39917 + (((tickAnim - 3) / 10) * (68.95256-(80.39917)));
            zz = 49.69315 + (((tickAnim - 3) / 10) * (73.72414-(49.69315)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -86.69734 + (((tickAnim - 13) / 5) * (-111.4379-(-86.69734)));
            yy = 68.95256 + (((tickAnim - 13) / 5) * (63.85418-(68.95256)));
            zz = 73.72414 + (((tickAnim - 13) / 5) * (99.43136-(73.72414)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -111.4379 + (((tickAnim - 18) / 7) * (-147.35916-(-111.4379)));
            yy = 63.85418 + (((tickAnim - 18) / 7) * (70.42767-(63.85418)));
            zz = 99.43136 + (((tickAnim - 18) / 7) * (138.31054-(99.43136)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -147.35916 + (((tickAnim - 25) / 5) * (-167.14-(-147.35916)));
            yy = 70.42767 + (((tickAnim - 25) / 5) * (74.81-(70.42767)));
            zz = 138.31054 + (((tickAnim - 25) / 5) * (164.23-(138.31054)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -167.14 + (((tickAnim - 30) / 3) * (-173.76374-(-167.14)));
            yy = 74.81 + (((tickAnim - 30) / 3) * (78.07596-(74.81)));
            zz = 164.23 + (((tickAnim - 30) / 3) * (172.67129-(164.23)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -173.76374 + (((tickAnim - 33) / 7) * (-179-(-173.76374)));
            yy = 78.07596 + (((tickAnim - 33) / 7) * (97.5-(78.07596)));
            zz = 172.67129 + (((tickAnim - 33) / 7) * (180-(172.67129)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -179 + (((tickAnim - 40) / 6) * (-173.54014-(-179)));
            yy = 97.5 + (((tickAnim - 40) / 6) * (57.78929-(97.5)));
            zz = 180 + (((tickAnim - 40) / 6) * (156.50248-(180)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -173.54014 + (((tickAnim - 46) / 5) * (-101.75727-(-173.54014)));
            yy = 57.78929 + (((tickAnim - 46) / 5) * (54.89862-(57.78929)));
            zz = 156.50248 + (((tickAnim - 46) / 5) * (69.25112-(156.50248)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = -101.75727 + (((tickAnim - 51) / 6) * (-55.89643-(-101.75727)));
            yy = 54.89862 + (((tickAnim - 51) / 6) * (76.2267-(54.89862)));
            zz = 69.25112 + (((tickAnim - 51) / 6) * (36.98382-(69.25112)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = -55.89643 + (((tickAnim - 57) / 3) * (-49.78089-(-55.89643)));
            yy = 76.2267 + (((tickAnim - 57) / 3) * (84.81769-(76.2267)));
            zz = 36.98382 + (((tickAnim - 57) / 3) * (39.26202-(36.98382)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 100.9899 + (((tickAnim - 0) / 30) * (25.25-(100.9899)));
            yy = -67.6599 + (((tickAnim - 0) / 30) * (-16.91-(-67.6599)));
            zz = -79.0101 + (((tickAnim - 0) / 30) * (-19.75-(-79.0101)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 25.25 + (((tickAnim - 30) / 10) * (0-(25.25)));
            yy = -16.91 + (((tickAnim - 30) / 10) * (0-(-16.91)));
            zz = -19.75 + (((tickAnim - 30) / 10) * (0-(-19.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (100.9899-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (-67.6599-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (-79.0101-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -52.16698 + (((tickAnim - 0) / 3) * (-57.28065-(-52.16698)));
            yy = 9.32681 + (((tickAnim - 0) / 3) * (11.32938-(9.32681)));
            zz = -48.62443 + (((tickAnim - 0) / 3) * (-47.37394-(-48.62443)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -57.28065 + (((tickAnim - 3) / 10) * (-56.56572-(-57.28065)));
            yy = 11.32938 + (((tickAnim - 3) / 10) * (14.46948-(11.32938)));
            zz = -47.37394 + (((tickAnim - 3) / 10) * (-44.99586-(-47.37394)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -56.56572 + (((tickAnim - 13) / 12) * (-55.10427-(-56.56572)));
            yy = 14.46948 + (((tickAnim - 13) / 12) * (21.32607-(14.46948)));
            zz = -44.99586 + (((tickAnim - 13) / 12) * (-40.83679-(-44.99586)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -55.10427 + (((tickAnim - 25) / 5) * (-53.19-(-55.10427)));
            yy = 21.32607 + (((tickAnim - 25) / 5) * (27.35-(21.32607)));
            zz = -40.83679 + (((tickAnim - 25) / 5) * (-37.37-(-40.83679)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -53.19 + (((tickAnim - 30) / 10) * (-30.20339-(-53.19)));
            yy = 27.35 + (((tickAnim - 30) / 10) * (33.35727-(27.35)));
            zz = -37.37 + (((tickAnim - 30) / 10) * (-33.61819-(-37.37)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -30.20339 + (((tickAnim - 40) / 10) * (-34.94-(-30.20339)));
            yy = 33.35727 + (((tickAnim - 40) / 10) * (19.54-(33.35727)));
            zz = -33.61819 + (((tickAnim - 40) / 10) * (-43.12-(-33.61819)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -34.94 + (((tickAnim - 50) / 10) * (-52.16698-(-34.94)));
            yy = 19.54 + (((tickAnim - 50) / 10) * (9.32681-(19.54)));
            zz = -43.12 + (((tickAnim - 50) / 10) * (-48.62443-(-43.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAdocus entity = (EntityPrehistoricFloraAdocus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 2.50954 + (((tickAnim - 0) / 1) * (0.54594-(2.50954)));
            yy = -4.99523 + (((tickAnim - 0) / 1) * (-3.39065-(-4.99523)));
            zz = -0.21865 + (((tickAnim - 0) / 1) * (6.52915-(-0.21865)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0.54594 + (((tickAnim - 1) / 2) * (-2.5-(0.54594)));
            yy = -3.39065 + (((tickAnim - 1) / 2) * (0-(-3.39065)));
            zz = 6.52915 + (((tickAnim - 1) / 2) * (5-(6.52915)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -2.5 + (((tickAnim - 3) / 2) * (2.50954-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (4.99523-(0)));
            zz = 5 + (((tickAnim - 3) / 2) * (0.21865-(5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 2.50954 + (((tickAnim - 5) / 1) * (0.54594-(2.50954)));
            yy = 4.99523 + (((tickAnim - 5) / 1) * (3.39065-(4.99523)));
            zz = 0.21865 + (((tickAnim - 5) / 1) * (-6.52915-(0.21865)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.54594 + (((tickAnim - 6) / 2) * (-2.5-(0.54594)));
            yy = 3.39065 + (((tickAnim - 6) / 2) * (0-(3.39065)));
            zz = -6.52915 + (((tickAnim - 6) / 2) * (-5-(-6.52915)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (2.50954-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (-4.99523-(0)));
            zz = -5 + (((tickAnim - 8) / 2) * (-0.21865-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.5-(1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 1) * (1.83-(0.5)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.83 + (((tickAnim - 4) / 1) * (1-(1.83)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 3) * (0.5-(1)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.5 + (((tickAnim - 8) / 1) * (1.83-(0.5)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.83 + (((tickAnim - 9) / 1) * (1-(1.83)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -24.68123 + (((tickAnim - 0) / 1) * (-45.05314-(-24.68123)));
            yy = -33.81913 + (((tickAnim - 0) / 1) * (-11.98748-(-33.81913)));
            zz = -43.35895 + (((tickAnim - 0) / 1) * (-64.94501-(-43.35895)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -45.05314 + (((tickAnim - 1) / 2) * (-77.58175-(-45.05314)));
            yy = -11.98748 + (((tickAnim - 1) / 2) * (3.87858-(-11.98748)));
            zz = -64.94501 + (((tickAnim - 1) / 2) * (-94.15085-(-64.94501)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -77.58175 + (((tickAnim - 3) / 2) * (-152.77651-(-77.58175)));
            yy = 3.87858 + (((tickAnim - 3) / 2) * (17.00491-(3.87858)));
            zz = -94.15085 + (((tickAnim - 3) / 2) * (-138.78318-(-94.15085)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -152.77651 + (((tickAnim - 5) / 3) * (-61.24508-(-152.77651)));
            yy = 17.00491 + (((tickAnim - 5) / 3) * (-5.70598-(17.00491)));
            zz = -138.78318 + (((tickAnim - 5) / 3) * (-33.97867-(-138.78318)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -61.24508 + (((tickAnim - 8) / 2) * (-24.68123-(-61.24508)));
            yy = -5.70598 + (((tickAnim - 8) / 2) * (-33.81913-(-5.70598)));
            zz = -33.97867 + (((tickAnim - 8) / 2) * (-43.35895-(-33.97867)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -152.77651 + (((tickAnim - 0) / 3) * (-61.24508-(-152.77651)));
            yy = -17.00491 + (((tickAnim - 0) / 3) * (5.70598-(-17.00491)));
            zz = 138.78318 + (((tickAnim - 0) / 3) * (33.97867-(138.78318)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -61.24508 + (((tickAnim - 3) / 2) * (-24.68123-(-61.24508)));
            yy = 5.70598 + (((tickAnim - 3) / 2) * (33.81913-(5.70598)));
            zz = 33.97867 + (((tickAnim - 3) / 2) * (43.35895-(33.97867)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -24.68123 + (((tickAnim - 5) / 1) * (-45.05314-(-24.68123)));
            yy = 33.81913 + (((tickAnim - 5) / 1) * (11.98748-(33.81913)));
            zz = 43.35895 + (((tickAnim - 5) / 1) * (64.94501-(43.35895)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -45.05314 + (((tickAnim - 6) / 2) * (-77.58175-(-45.05314)));
            yy = 11.98748 + (((tickAnim - 6) / 2) * (-3.87858-(11.98748)));
            zz = 64.94501 + (((tickAnim - 6) / 2) * (94.15085-(64.94501)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -77.58175 + (((tickAnim - 8) / 2) * (-152.77651-(-77.58175)));
            yy = -3.87858 + (((tickAnim - 8) / 2) * (-17.00491-(-3.87858)));
            zz = 94.15085 + (((tickAnim - 8) / 2) * (138.78318-(94.15085)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-74.9351-(0)));
            yy = 35 + (((tickAnim - 0) / 5) * (-85.06386-(35)));
            zz = 0 + (((tickAnim - 0) / 5) * (-101.95322-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -74.9351 + (((tickAnim - 5) / 3) * (2.5-(-74.9351)));
            yy = -85.06386 + (((tickAnim - 5) / 3) * (0-(-85.06386)));
            zz = -101.95322 + (((tickAnim - 5) / 3) * (0-(-101.95322)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (35-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -74.9351 + (((tickAnim - 0) / 3) * (2.5-(-74.9351)));
            yy = 85.06386 + (((tickAnim - 0) / 3) * (0-(85.06386)));
            zz = 101.95322 + (((tickAnim - 0) / 3) * (0-(101.95322)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.5 + (((tickAnim - 3) / 2) * (0-(2.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (-35-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-74.9351-(0)));
            yy = -35 + (((tickAnim - 5) / 5) * (85.06386-(-35)));
            zz = 0 + (((tickAnim - 5) / 5) * (101.95322-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.02856 + (((tickAnim - 0) / 3) * (0-(-0.02856)));
            yy = 4.99519 + (((tickAnim - 0) / 3) * (0-(4.99519)));
            zz = -0.21866 + (((tickAnim - 0) / 3) * (-5-(-0.21866)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-5-(0)));
            zz = -5 + (((tickAnim - 3) / 2) * (0-(-5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
            zz = 0 + (((tickAnim - 5) / 3) * (5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-0.02856-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.99519-(0)));
            zz = 5 + (((tickAnim - 8) / 2) * (-0.21866-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 22.5 + (((tickAnim - 3) / 2) * (15-(22.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 15 + (((tickAnim - 5) / 3) * (42.5-(15)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 42.5 + (((tickAnim - 8) / 2) * (0-(42.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-64.03914-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-6.02317-(0)));
            zz = 47.5 + (((tickAnim - 0) / 3) * (78.95627-(47.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -64.03914 + (((tickAnim - 3) / 2) * (32.5-(-64.03914)));
            yy = -6.02317 + (((tickAnim - 3) / 2) * (0-(-6.02317)));
            zz = 78.95627 + (((tickAnim - 3) / 2) * (112.5-(78.95627)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 32.5 + (((tickAnim - 5) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 112.5 + (((tickAnim - 5) / 5) * (47.5-(112.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 3) * (-42.5-(-15)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -42.5 + (((tickAnim - 3) / 2) * (0-(-42.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-22.5-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -22.5 + (((tickAnim - 8) / 2) * (-15-(-22.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.5 + (((tickAnim - 0) / 5) * (0-(32.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = -112.5 + (((tickAnim - 0) / 5) * (-47.5-(-112.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-64.03914-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (6.02317-(0)));
            zz = -47.5 + (((tickAnim - 5) / 3) * (-78.95627-(-47.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -64.03914 + (((tickAnim - 8) / 2) * (32.5-(-64.03914)));
            yy = 6.02317 + (((tickAnim - 8) / 2) * (0-(6.02317)));
            zz = -78.95627 + (((tickAnim - 8) / 2) * (-112.5-(-78.95627)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (60-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 60 + (((tickAnim - 5) / 5) * (0-(60)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-85.38338-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-8.11421-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (76.5625-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -85.38338 + (((tickAnim - 5) / 5) * (0-(-85.38338)));
            yy = -8.11421 + (((tickAnim - 5) / 5) * (0-(-8.11421)));
            zz = 76.5625 + (((tickAnim - 5) / 5) * (0-(76.5625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -60 + (((tickAnim - 0) / 5) * (0-(-60)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-60-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -85.38338 + (((tickAnim - 0) / 5) * (0-(-85.38338)));
            yy = 8.11421 + (((tickAnim - 0) / 5) * (0-(8.11421)));
            zz = -76.5625 + (((tickAnim - 0) / 5) * (0-(-76.5625)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-85.38338-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (8.11421-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-76.5625-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*1440-60))*10), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60*3))*10), tail.rotateAngleZ + (float) Math.toRadians(0));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAdocus e = (EntityPrehistoricFloraAdocus) entity;
        animator.update(entity);


    }
}
