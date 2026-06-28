package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraOtwayemys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelOtwayemys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer shell;
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
    private final AdvancedModelRenderer shellright;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer shellleft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer backrightleg;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer backrightleg2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backrightleg3;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelOtwayemys() {
        this.textureWidth = 64;
        this.textureHeight = 80;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.5F, 21.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 0, -4.0F, -2.9F, -4.0F, 7, 3, 11, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.1F, -1.75F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.4974F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 0, 0.0F, -2.0F, -2.25F, 4, 2, 6, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.0F, 0.1F, -1.75F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.4974F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 0, -4.0F, -2.0F, -2.25F, 4, 2, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.1F, -4.0F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 14, -3.0F, -3.0F, -5.0F, 6, 3, 5, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-1.0F, -1.475F, -7.3F);
        this.base.addChild(shell);
        this.setRotateAngle(shell, -0.0524F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 14, -3.0F, -6.025F, 3.3F, 7, 1, 10, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.0F, -5.975F, 13.3F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.403F, 0.5307F, 0.8708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 63, 0.0F, 0.0F, 0.0F, 4, 0, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.0F, -5.925F, 3.3F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4287F, -0.5694F, 0.8676F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 63, 0.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, -5.975F, 13.3F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.403F, -0.5307F, -0.8708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 63, -4.0F, 0.0F, 0.0F, 4, 0, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.0F, -6.025F, 8.3F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.8727F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 61, 0.0F, 0.0F, -5.0F, 6, 1, 10, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, -6.025F, 8.3F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.8727F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 61, -6.0F, 0.0F, -5.0F, 6, 1, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -6.025F, 3.3F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6981F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 4, 29, -3.5F, 0.0F, -5.0F, 7, 1, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.125F, 16.725F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1396F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 22, -4.0F, -3.0F, -2.0F, 7, 2, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 44, -3.0F, -3.0F, -1.0F, 7, 2, 2, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -6.025F, 13.3F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 37, 69, -3.5F, 0.0F, 0.0F, 7, 1, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-3.0F, -5.925F, 3.3F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4287F, 0.5694F, -0.8676F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 63, -3.0F, 0.0F, -5.0F, 3, 0, 5, 0.0F, false));

        this.shellright = new AdvancedModelRenderer(this);
        this.shellright.setRotationPoint(0.5F, -1.525F, 7.3F);
        this.shell.addChild(shellright);
        this.setRotateAngle(shellright, 0.0F, 0.0F, -0.1745F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.925F, 0.0F, 7.05F);
        this.shellright.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.829F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 38, -2.0F, -2.0F, -2.0F, 4, 2, 5, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-5.575F, 0.0F, 3.75F);
        this.shellright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.2531F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 37, -1.5F, -2.0F, -2.0F, 4, 2, 5, -0.02F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 37, -2.0F, -2.0F, -2.0F, 4, 2, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-5.4F, 0.0F, -4.5F);
        this.shellright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 27, -2.0F, -2.0F, -2.0F, 4, 2, 9, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-5.0F, 0.0F, -7.0F);
        this.shellright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.6109F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 54, 45, -2.0F, -2.0F, -1.0F, 3, 2, 2, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 0.0F, -7.25F);
        this.shellright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.shellleft = new AdvancedModelRenderer(this);
        this.shellleft.setRotationPoint(0.5F, -1.525F, 7.3F);
        this.shell.addChild(shellleft);
        this.setRotateAngle(shellleft, 0.0F, 0.0F, 0.1745F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.925F, 0.0F, 7.05F);
        this.shellleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.829F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 38, -2.0F, -2.0F, -2.0F, 4, 2, 5, 0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(5.575F, 0.0F, 3.75F);
        this.shellleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.2531F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 37, -2.0F, -2.0F, -2.0F, 4, 2, 5, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 37, -2.5F, -2.0F, -2.0F, 4, 2, 5, -0.02F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(5.4F, 0.0F, -4.5F);
        this.shellleft.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0873F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 27, -2.0F, -2.0F, -2.0F, 4, 2, 9, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(5.0F, 0.0F, -7.0F);
        this.shellleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.6109F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 54, 45, -1.0F, -2.0F, -1.0F, 3, 2, 2, -0.01F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.0F, 0.0F, -7.25F);
        this.shellleft.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 0, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -3.0F, 7.5F);
        this.base.addChild(tail);
        this.setRotateAngle(tail, -0.3927F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 36, 8, -2.5F, -0.5F, -0.75F, 5, 3, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 48, -1.5F, -0.25F, -0.25F, 3, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 3.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 44, 49, -1.0F, -1.0F, -0.25F, 2, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 55, 0.0F, -1.0F, -0.25F, 1, 1, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-3.0867F, -1.5325F, -5.25F);
        this.base.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.0F, -0.5236F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.4133F, -0.2175F, 0.0F);
        this.frontrightleg.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.6545F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 49, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-3.2874F, 1.5438F, 0.0F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, 0.0F, 0.5236F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontrightleg2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, -1.5708F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 46, 55, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontrightleg2.addChild(frontrightleg3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontrightleg3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, -1.5708F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 38, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.0867F, -1.5325F, -5.25F);
        this.base.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, 0.5236F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.4133F, -0.2175F, 0.0F);
        this.frontleftleg.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, 0.6545F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 49, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(3.2874F, 1.5438F, 0.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.5236F, 0.0F);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontleftleg2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 0.0F, 1.5708F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 55, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontleftleg2.addChild(frontleftleg3);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontleftleg3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.0F, 1.5708F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 52, 38, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, true));

        this.backrightleg = new AdvancedModelRenderer(this);
        this.backrightleg.setRotationPoint(-3.5867F, -1.2825F, 5.0F);
        this.base.addChild(backrightleg);
        this.setRotateAngle(backrightleg, 0.0F, 0.5672F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.4133F, -0.4675F, 0.0F);
        this.backrightleg.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.6545F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 14, 49, -4.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, false));

        this.backrightleg2 = new AdvancedModelRenderer(this);
        this.backrightleg2.setRotationPoint(-3.2874F, 1.2938F, 0.0F);
        this.backrightleg.addChild(backrightleg2);
        this.setRotateAngle(backrightleg2, 0.0F, -0.3491F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backrightleg2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, -1.5708F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 55, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backrightleg3 = new AdvancedModelRenderer(this);
        this.backrightleg3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backrightleg2.addChild(backrightleg3);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backrightleg3.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.0F, -1.5708F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 14, 54, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(2.5867F, -1.2825F, 5.0F);
        this.base.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, -0.5672F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.4133F, -0.4675F, 0.0F);
        this.backleftleg.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.0F, 0.6545F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 14, 49, -1.0F, -1.0F, -1.5F, 5, 2, 3, 0.0F, true));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(3.2874F, 1.2938F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, 0.3491F, 0.0F);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backleftleg2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0F, 1.5708F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 54, 55, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backleftleg2.addChild(backleftleg3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backleftleg3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.0F, 1.5708F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 14, 54, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.45F, -7.75F);
        this.base.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 36, 38, -2.5F, -1.5F, -3.5F, 4, 3, 4, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.5335F, -2.7091F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 52, 8, -2.0F, -1.0F, -2.0F, 4, 2, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 56, 52, -0.5F, 0.0F, -4.825F, 1, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 54, 25, -1.0F, 0.0F, -2.825F, 2, 1, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.7F, -0.175F, -4.2F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.2618F, 0.5061F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 56, 12, -1.0F, 0.0F, -0.5F, 1, 1, 3, 0.01F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.75F, 0.975F, -4.2F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.5236F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 56, 4, -1.0F, -1.0F, -0.5F, 1, 1, 3, 0.01F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.7F, -0.175F, -4.2F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.2618F, -0.5061F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 56, 12, 0.0F, 0.0F, -0.5F, 1, 1, 3, 0.01F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.75F, 0.975F, -4.2F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.5236F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 56, 4, 0.0F, -1.0F, -0.5F, 1, 1, 3, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 0.0F, -4.775F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.336F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 56, 49, -0.5F, 0.0F, 1.0F, 2, 1, 2, 0.0F, false));
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 52, 12, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.675F, 0.75F, -3.075F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, -0.0873F, -0.576F, 0.3491F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 10, 55, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.675F, 0.75F, -3.075F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, -0.0873F, 0.576F, -0.3491F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 10, 55, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.8335F, -1.0659F);
        this.head.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0873F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 56, 20, -1.0F, -0.0835F, -1.7591F, 2, 1, 1, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 24, 57, -0.5F, -0.0835F, -3.6091F, 1, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 52, 22, -2.0F, 0.0F, -0.925F, 4, 1, 2, -0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 36, 55, -1.5F, -1.25F, -1.175F, 3, 2, 2, -0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.725F, 0.9165F, -3.1341F);
        this.lowerjaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.5061F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 56, 16, -1.0F, -1.0F, -0.5F, 1, 1, 3, -0.01F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.725F, 0.9165F, -3.1341F);
        this.lowerjaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.5061F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 56, 16, 0.0F, -1.0F, -0.5F, 1, 1, 3, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.base.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.6F;
        this.base.offsetX = 0.0F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(120);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 1.2F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.4F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleX = (float) Math.toRadians(90);
        this.base.offsetY = -0.2F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {


        this.base.offsetY = -0.105F;
        this.base.render(0.01F);
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

        EntityPrehistoricFloraOtwayemys entityOtwayemys = (EntityPrehistoricFloraOtwayemys) e;

        if (entityOtwayemys.getAnimation() == entityOtwayemys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityOtwayemys.getAnimation() == entityOtwayemys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityOtwayemys.isReallyInWater()) {

                if (f3 == 0.0F || !entityOtwayemys.getIsMoving()) {
                    if (entityOtwayemys.getAnimation() != entityOtwayemys.EAT_ANIMATION
                        && entityOtwayemys.getAnimation() != entityOtwayemys.DRINK_ANIMATION
                        && entityOtwayemys.getAnimation() != entityOtwayemys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityOtwayemys.getIsFast()) { //Running


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

        EntityPrehistoricFloraOtwayemys ee = (EntityPrehistoricFloraOtwayemys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else {
//                    animIdlePose(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOtwayemys entity = (EntityPrehistoricFloraOtwayemys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (44.06789-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-10.51255-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-19.32302-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 44.06789 + (((tickAnim - 20) / 16) * (-11.64288-(44.06789)));
            yy = -10.51255 + (((tickAnim - 20) / 16) * (11.12365-(-10.51255)));
            zz = -19.32302 + (((tickAnim - 20) / 16) * (-20.75693-(-19.32302)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -11.64288 + (((tickAnim - 36) / 14) * (0-(-11.64288)));
            yy = 11.12365 + (((tickAnim - 36) / 14) * (0-(11.12365)));
            zz = -20.75693 + (((tickAnim - 36) / 14) * (0-(-20.75693)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.19897-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19.48668-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (17.90918-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0.19897 + (((tickAnim - 20) / 16) * (-16.7483-(0.19897)));
            yy = -19.48668 + (((tickAnim - 20) / 16) * (-10.06507-(-19.48668)));
            zz = 17.90918 + (((tickAnim - 20) / 16) * (17.07394-(17.90918)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -16.7483 + (((tickAnim - 36) / 14) * (0-(-16.7483)));
            yy = -10.06507 + (((tickAnim - 36) / 14) * (0-(-10.06507)));
            zz = 17.07394 + (((tickAnim - 36) / 14) * (0-(17.07394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(0);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(0);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 33.75 + (((tickAnim - 20) / 16) * (70.06-(33.75)));
            yy = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 16) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 70.06 + (((tickAnim - 36) / 14) * (0-(70.06)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 20) / 16) * (0-(0)));
            yy = 0.775 + (((tickAnim - 20) / 16) * (0.475-(0.775)));
            zz = 0 + (((tickAnim - 20) / 16) * (-0.475-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = 0.475 + (((tickAnim - 36) / 14) * (0-(0.475)));
            zz = -0.475 + (((tickAnim - 36) / 14) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);

    }
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOtwayemys entity = (EntityPrehistoricFloraOtwayemys) entitylivingbaseIn;
        int animCycle = 300;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80 + (((tickAnim - 11) / 9) * (0-(67.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*80)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = -2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 11) / 9) * (0-(-2.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 10) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -11.75 + (((tickAnim - 290) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.845-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -2.845 + (((tickAnim - 8) / 12) * (-3-(-2.845)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -3 + (((tickAnim - 20) / 260) * (-3-(-3)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -3 + (((tickAnim - 280) / 20) * (0-(-3)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.83333-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-11.97917-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.83333 + (((tickAnim - 8) / 6) * (0.91667-(12.83333)));
            yy = -11.97917 + (((tickAnim - 8) / 6) * (-20.36458-(-11.97917)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0.91667 + (((tickAnim - 14) / 4) * (-0.71429-(0.91667)));
            yy = -20.36458 + (((tickAnim - 14) / 4) * (-25.15625-(-20.36458)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.71429 + (((tickAnim - 18) / 2) * (5.5-(-0.71429)));
            yy = -25.15625 + (((tickAnim - 18) / 2) * (-28.75-(-25.15625)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 5.5 + (((tickAnim - 20) / 260) * (5.5-(5.5)));
            yy = -28.75 + (((tickAnim - 20) / 260) * (-28.75-(-28.75)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 5.5 + (((tickAnim - 280) / 20) * (0-(5.5)));
            yy = -28.75 + (((tickAnim - 280) / 20) * (0-(-28.75)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.74131-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-51.29529-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-17.32165-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 5.74131 + (((tickAnim - 20) / 260) * (5.74131-(5.74131)));
            yy = -51.29529 + (((tickAnim - 20) / 260) * (-51.29529-(-51.29529)));
            zz = -17.32165 + (((tickAnim - 20) / 260) * (-17.32165-(-17.32165)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 5.74131 + (((tickAnim - 280) / 10) * (17.37066-(5.74131)));
            yy = -51.29529 + (((tickAnim - 280) / 10) * (-25.64764-(-51.29529)));
            zz = -17.32165 + (((tickAnim - 280) / 10) * (-8.66083-(-17.32165)));
        }
        else if (tickAnim >= 290 && tickAnim < 295) {
            xx = 17.37066 + (((tickAnim - 290) / 5) * (3.68533-(17.37066)));
            yy = -25.64764 + (((tickAnim - 290) / 5) * (-12.82382-(-25.64764)));
            zz = -8.66083 + (((tickAnim - 290) / 5) * (-4.33041-(-8.66083)));
        }
        else if (tickAnim >= 295 && tickAnim < 300) {
            xx = 3.68533 + (((tickAnim - 295) / 5) * (0-(3.68533)));
            yy = -12.82382 + (((tickAnim - 295) / 5) * (0-(-12.82382)));
            zz = -4.33041 + (((tickAnim - 295) / 5) * (0-(-4.33041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.7-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0.525 + (((tickAnim - 20) / 260) * (0.525-(0.525)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.7 + (((tickAnim - 20) / 260) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0.525 + (((tickAnim - 280) / 20) * (0-(0.525)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = -0.7 + (((tickAnim - 280) / 20) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -29.5 + (((tickAnim - 20) / 260) * (-29.5-(-29.5)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -29.5 + (((tickAnim - 280) / 20) * (0-(-29.5)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0.225 + (((tickAnim - 20) / 260) * (0.225-(0.225)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.425 + (((tickAnim - 20) / 260) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0.225 + (((tickAnim - 280) / 20) * (0-(0.225)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = -0.425 + (((tickAnim - 280) / 20) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.82791-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (57.12033-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (28.18846-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 34.82791 + (((tickAnim - 20) / 260) * (34.82791-(34.82791)));
            yy = 57.12033 + (((tickAnim - 20) / 260) * (57.12033-(57.12033)));
            zz = 28.18846 + (((tickAnim - 20) / 260) * (28.18846-(28.18846)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 34.82791 + (((tickAnim - 280) / 10) * (17.29754-(34.82791)));
            yy = 57.12033 + (((tickAnim - 280) / 10) * (-21.37767-(57.12033)));
            zz = 28.18846 + (((tickAnim - 280) / 10) * (-3.10738-(28.18846)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 17.29754 + (((tickAnim - 290) / 10) * (0-(17.29754)));
            yy = -21.37767 + (((tickAnim - 290) / 10) * (0-(-21.37767)));
            zz = -3.10738 + (((tickAnim - 290) / 10) * (0-(-3.10738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.71729-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-9.00328-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (66.28546-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.71729 + (((tickAnim - 10) / 10) * (21.07116-(22.71729)));
            yy = -9.00328 + (((tickAnim - 10) / 10) * (-5.64814-(-9.00328)));
            zz = 66.28546 + (((tickAnim - 10) / 10) * (64.30183-(66.28546)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 21.07116 + (((tickAnim - 20) / 260) * (21.07116-(21.07116)));
            yy = -5.64814 + (((tickAnim - 20) / 260) * (-5.64814-(-5.64814)));
            zz = 64.30183 + (((tickAnim - 20) / 260) * (64.30183-(64.30183)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 21.07116 + (((tickAnim - 280) / 5) * (-36.72869-(21.07116)));
            yy = -5.64814 + (((tickAnim - 280) / 5) * (-8.6659-(-5.64814)));
            zz = 64.30183 + (((tickAnim - 280) / 5) * (42.67393-(64.30183)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = -36.72869 + (((tickAnim - 285) / 5) * (0-(-36.72869)));
            yy = -8.6659 + (((tickAnim - 285) / 5) * (0-(-8.6659)));
            zz = 42.67393 + (((tickAnim - 285) / 5) * (0-(42.67393)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0.525 + (((tickAnim - 20) / 260) * (0.525-(0.525)));
            yy = -0.65 + (((tickAnim - 20) / 260) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 0.525 + (((tickAnim - 280) / 5) * (0.53-(0.525)));
            yy = -0.65 + (((tickAnim - 280) / 5) * (-0.195-(-0.65)));
            zz = 0 + (((tickAnim - 280) / 5) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 0.53 + (((tickAnim - 285) / 5) * (0.53-(0.53)));
            yy = -0.195 + (((tickAnim - 285) / 5) * (-1.075-(-0.195)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0.53 + (((tickAnim - 290) / 10) * (0-(0.53)));
            yy = -1.075 + (((tickAnim - 290) / 10) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (98.46713-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.42727-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.92353-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 98.46713 + (((tickAnim - 20) / 260) * (98.46713-(98.46713)));
            yy = -12.42727 + (((tickAnim - 20) / 260) * (-12.42727-(-12.42727)));
            zz = 0.92353 + (((tickAnim - 20) / 260) * (0.92353-(0.92353)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 98.46713 + (((tickAnim - 280) / 5) * (23.11308-(98.46713)));
            yy = -12.42727 + (((tickAnim - 280) / 5) * (37.01453-(-12.42727)));
            zz = 0.92353 + (((tickAnim - 280) / 5) * (-50.41593-(0.92353)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 23.11308 + (((tickAnim - 285) / 5) * (0-(23.11308)));
            yy = 37.01453 + (((tickAnim - 285) / 5) * (0-(37.01453)));
            zz = -50.41593 + (((tickAnim - 285) / 5) * (-11-(-50.41593)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = -11 + (((tickAnim - 290) / 10) * (0-(-11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.575 + (((tickAnim - 20) / 260) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (1-(0)));
            zz = -0.575 + (((tickAnim - 280) / 10) * (-0.15-(-0.575)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 290) / 10) * (0-(1)));
            zz = -0.15 + (((tickAnim - 290) / 10) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (34.82791-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-57.12033-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-28.18846-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 34.82791 + (((tickAnim - 20) / 260) * (34.82791-(34.82791)));
            yy = -57.12033 + (((tickAnim - 20) / 260) * (-57.12033-(-57.12033)));
            zz = -28.18846 + (((tickAnim - 20) / 260) * (-28.18846-(-28.18846)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 34.82791 + (((tickAnim - 280) / 10) * (17.29754-(34.82791)));
            yy = -57.12033 + (((tickAnim - 280) / 10) * (21.37767-(-57.12033)));
            zz = -28.18846 + (((tickAnim - 280) / 10) * (3.10738-(-28.18846)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 17.29754 + (((tickAnim - 290) / 10) * (0-(17.29754)));
            yy = 21.37767 + (((tickAnim - 290) / 10) * (0-(21.37767)));
            zz = 3.10738 + (((tickAnim - 290) / 10) * (0-(3.10738)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.71729-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (9.00328-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-66.28546-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 22.71729 + (((tickAnim - 10) / 10) * (21.07116-(22.71729)));
            yy = 9.00328 + (((tickAnim - 10) / 10) * (5.64814-(9.00328)));
            zz = -66.28546 + (((tickAnim - 10) / 10) * (-64.30183-(-66.28546)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 21.07116 + (((tickAnim - 20) / 260) * (21.07116-(21.07116)));
            yy = 5.64814 + (((tickAnim - 20) / 260) * (5.64814-(5.64814)));
            zz = -64.30183 + (((tickAnim - 20) / 260) * (-64.30183-(-64.30183)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 21.07116 + (((tickAnim - 280) / 5) * (-36.72869-(21.07116)));
            yy = 5.64814 + (((tickAnim - 280) / 5) * (8.6659-(5.64814)));
            zz = -64.30183 + (((tickAnim - 280) / 5) * (-42.67393-(-64.30183)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = -36.72869 + (((tickAnim - 285) / 5) * (0-(-36.72869)));
            yy = 8.6659 + (((tickAnim - 285) / 5) * (0-(8.6659)));
            zz = -42.67393 + (((tickAnim - 285) / 5) * (0-(-42.67393)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -0.525 + (((tickAnim - 20) / 260) * (-0.525-(-0.525)));
            yy = -0.65 + (((tickAnim - 20) / 260) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = -0.525 + (((tickAnim - 280) / 5) * (0.53-(-0.525)));
            yy = -0.65 + (((tickAnim - 280) / 5) * (-0.195-(-0.65)));
            zz = 0 + (((tickAnim - 280) / 5) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 0.53 + (((tickAnim - 285) / 5) * (-0.53-(0.53)));
            yy = -0.195 + (((tickAnim - 285) / 5) * (-1.075-(-0.195)));
            zz = 0 + (((tickAnim - 285) / 5) * (0-(0)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = -0.53 + (((tickAnim - 290) / 10) * (0-(-0.53)));
            yy = -1.075 + (((tickAnim - 290) / 10) * (0-(-1.075)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (98.46713-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.42727-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.92353-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 98.46713 + (((tickAnim - 20) / 260) * (98.46713-(98.46713)));
            yy = 12.42727 + (((tickAnim - 20) / 260) * (12.42727-(12.42727)));
            zz = 0.92353 + (((tickAnim - 20) / 260) * (0.92353-(0.92353)));
        }
        else if (tickAnim >= 280 && tickAnim < 285) {
            xx = 98.46713 + (((tickAnim - 280) / 5) * (23.11308-(98.46713)));
            yy = 12.42727 + (((tickAnim - 280) / 5) * (-37.01453-(12.42727)));
            zz = 0.92353 + (((tickAnim - 280) / 5) * (50.41593-(0.92353)));
        }
        else if (tickAnim >= 285 && tickAnim < 290) {
            xx = 23.11308 + (((tickAnim - 285) / 5) * (0-(23.11308)));
            yy = -37.01453 + (((tickAnim - 285) / 5) * (0-(-37.01453)));
            zz = 50.41593 + (((tickAnim - 285) / 5) * (11-(50.41593)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 11 + (((tickAnim - 290) / 10) * (0-(11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.575-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            zz = -0.575 + (((tickAnim - 20) / 260) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 280) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 10) * (1-(0)));
            zz = -0.575 + (((tickAnim - 280) / 10) * (-0.1-(-0.575)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 290) / 10) * (0-(1)));
            zz = -0.1 + (((tickAnim - 290) / 10) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (88.37223-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-43.72782-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.97729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 88.37223 + (((tickAnim - 10) / 10) * (89.24446-(88.37223)));
            yy = -43.72782 + (((tickAnim - 10) / 10) * (-87.45563-(-43.72782)));
            zz = -6.97729 + (((tickAnim - 10) / 10) * (-13.95457-(-6.97729)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 89.24446 + (((tickAnim - 20) / 260) * (89.24446-(89.24446)));
            yy = -87.45563 + (((tickAnim - 20) / 260) * (-87.45563-(-87.45563)));
            zz = -13.95457 + (((tickAnim - 20) / 260) * (-13.95457-(-13.95457)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 89.24446 + (((tickAnim - 280) / 10) * (51.43416-(89.24446)));
            yy = -87.45563 + (((tickAnim - 280) / 10) * (-62.93344-(-87.45563)));
            zz = -13.95457 + (((tickAnim - 280) / 10) * (16.81064-(-13.95457)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 51.43416 + (((tickAnim - 290) / 10) * (0-(51.43416)));
            yy = -62.93344 + (((tickAnim - 290) / 10) * (0-(-62.93344)));
            zz = 16.81064 + (((tickAnim - 290) / 10) * (0-(16.81064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (2.19381-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (35.47499-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (-59.64449-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 2.19381 + (((tickAnim - 20) / 260) * (2.19381-(2.19381)));
            yy = 35.47499 + (((tickAnim - 20) / 260) * (35.47499-(35.47499)));
            zz = -59.64449 + (((tickAnim - 20) / 260) * (-59.64449-(-59.64449)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 2.19381 + (((tickAnim - 280) / 20) * (0-(2.19381)));
            yy = 35.47499 + (((tickAnim - 280) / 20) * (0-(35.47499)));
            zz = -59.64449 + (((tickAnim - 280) / 20) * (0-(-59.64449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -0.45 + (((tickAnim - 20) / 260) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -0.45 + (((tickAnim - 280) / 20) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg2.rotationPointX = this.backrightleg2.rotationPointX + (float)(xx);
        this.backrightleg2.rotationPointY = this.backrightleg2.rotationPointY - (float)(yy);
        this.backrightleg2.rotationPointZ = this.backrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-57.84836-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (42.02068-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-25.3821-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -57.84836 + (((tickAnim - 5) / 5) * (0-(-57.84836)));
            yy = 42.02068 + (((tickAnim - 5) / 5) * (120-(42.02068)));
            zz = -25.3821 + (((tickAnim - 5) / 5) * (0-(-25.3821)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-164.5-(0)));
            yy = 120 + (((tickAnim - 10) / 10) * (89-(120)));
            zz = 0 + (((tickAnim - 10) / 10) * (-180-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -164.5 + (((tickAnim - 20) / 260) * (-164.5-(-164.5)));
            yy = 89 + (((tickAnim - 20) / 260) * (89-(89)));
            zz = -180 + (((tickAnim - 20) / 260) * (-180-(-180)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -164.5 + (((tickAnim - 280) / 10) * (-75.08736-(-164.5)));
            yy = 89 + (((tickAnim - 280) / 10) * (44.14628-(89)));
            zz = -180 + (((tickAnim - 280) / 10) * (-71.54706-(-180)));
        }
        else if (tickAnim >= 290 && tickAnim < 296) {
            xx = -75.08736 + (((tickAnim - 290) / 6) * (-16.86412-(-75.08736)));
            yy = 44.14628 + (((tickAnim - 290) / 6) * (35.0454-(44.14628)));
            zz = -71.54706 + (((tickAnim - 290) / 6) * (-0.34718-(-71.54706)));
        }
        else if (tickAnim >= 296 && tickAnim < 300) {
            xx = -16.86412 + (((tickAnim - 296) / 4) * (0-(-16.86412)));
            yy = 35.0454 + (((tickAnim - 296) / 4) * (0-(35.0454)));
            zz = -0.34718 + (((tickAnim - 296) / 4) * (0-(-0.34718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 5) / 5) * (0-(1.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.325-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0.325 + (((tickAnim - 20) / 260) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = 0.325 + (((tickAnim - 280) / 20) * (0-(0.325)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (88.37223-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (43.72782-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (6.97729-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 88.37223 + (((tickAnim - 10) / 10) * (89.24446-(88.37223)));
            yy = 43.72782 + (((tickAnim - 10) / 10) * (87.45563-(43.72782)));
            zz = 6.97729 + (((tickAnim - 10) / 10) * (13.95457-(6.97729)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 89.24446 + (((tickAnim - 20) / 260) * (89.24446-(89.24446)));
            yy = 87.45563 + (((tickAnim - 20) / 260) * (87.45563-(87.45563)));
            zz = 13.95457 + (((tickAnim - 20) / 260) * (13.95457-(13.95457)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = 89.24446 + (((tickAnim - 280) / 10) * (51.43416-(89.24446)));
            yy = 87.45563 + (((tickAnim - 280) / 10) * (62.93344-(87.45563)));
            zz = 13.95457 + (((tickAnim - 280) / 10) * (-16.81064-(13.95457)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 51.43416 + (((tickAnim - 290) / 10) * (0-(51.43416)));
            yy = 62.93344 + (((tickAnim - 290) / 10) * (0-(62.93344)));
            zz = -16.81064 + (((tickAnim - 290) / 10) * (0-(-16.81064)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (2.19381-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-35.47499-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (59.64449-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 2.19381 + (((tickAnim - 20) / 260) * (2.19381-(2.19381)));
            yy = -35.47499 + (((tickAnim - 20) / 260) * (-35.47499-(-35.47499)));
            zz = 59.64449 + (((tickAnim - 20) / 260) * (59.64449-(59.64449)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 2.19381 + (((tickAnim - 280) / 20) * (0-(2.19381)));
            yy = -35.47499 + (((tickAnim - 280) / 20) * (0-(-35.47499)));
            zz = 59.64449 + (((tickAnim - 280) / 20) * (0-(59.64449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = -0.45 + (((tickAnim - 20) / 260) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = -0.45 + (((tickAnim - 280) / 20) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-57.84836-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-42.02068-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (25.3821-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -57.84836 + (((tickAnim - 5) / 5) * (0-(-57.84836)));
            yy = -42.02068 + (((tickAnim - 5) / 5) * (-120-(-42.02068)));
            zz = 25.3821 + (((tickAnim - 5) / 5) * (0-(25.3821)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (-164.5-(0)));
            yy = -120 + (((tickAnim - 10) / 10) * (-89-(-120)));
            zz = 0 + (((tickAnim - 10) / 10) * (180-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -164.5 + (((tickAnim - 20) / 260) * (-164.5-(-164.5)));
            yy = -89 + (((tickAnim - 20) / 260) * (-89-(-89)));
            zz = 180 + (((tickAnim - 20) / 260) * (180-(180)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -164.5 + (((tickAnim - 280) / 10) * (-75.08736-(-164.5)));
            yy = -89 + (((tickAnim - 280) / 10) * (-44.14628-(-89)));
            zz = 180 + (((tickAnim - 280) / 10) * (71.54706-(180)));
        }
        else if (tickAnim >= 290 && tickAnim < 296) {
            xx = -75.08736 + (((tickAnim - 290) / 6) * (-16.86412-(-75.08736)));
            yy = -44.14628 + (((tickAnim - 290) / 6) * (-35.0454-(-44.14628)));
            zz = 71.54706 + (((tickAnim - 290) / 6) * (0.34718-(71.54706)));
        }
        else if (tickAnim >= 296 && tickAnim < 300) {
            xx = -16.86412 + (((tickAnim - 296) / 4) * (0-(-16.86412)));
            yy = -35.0454 + (((tickAnim - 296) / 4) * (0-(-35.0454)));
            zz = 0.34718 + (((tickAnim - 296) / 4) * (0-(0.34718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 5) / 5) * (0-(1.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.325-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 20) / 260) * (0-(0)));
            yy = 0.325 + (((tickAnim - 20) / 260) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 20) / 260) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = 0.325 + (((tickAnim - 280) / 20) * (0-(0.325)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (22.95223-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-27.69157-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-4.19131-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 22.95223 + (((tickAnim - 13) / 3) * (21.78949-(22.95223)));
            yy = -27.69157 + (((tickAnim - 13) / 3) * (-35.07598-(-27.69157)));
            zz = -4.19131 + (((tickAnim - 13) / 3) * (-5.30899-(-4.19131)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 21.78949 + (((tickAnim - 16) / 4) * (-10.32881-(21.78949)));
            yy = -35.07598 + (((tickAnim - 16) / 4) * (-67.85559-(-35.07598)));
            zz = -5.30899 + (((tickAnim - 16) / 4) * (23.39429-(-5.30899)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -10.32881 + (((tickAnim - 20) / 260) * (-10.32881-(-10.32881)));
            yy = -67.85559 + (((tickAnim - 20) / 260) * (-67.85559-(-67.85559)));
            zz = 23.39429 + (((tickAnim - 20) / 260) * (23.39429-(23.39429)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -10.32881 + (((tickAnim - 280) / 10) * (22.5-(-10.32881)));
            yy = -67.85559 + (((tickAnim - 280) / 10) * (0-(-67.85559)));
            zz = 23.39429 + (((tickAnim - 280) / 10) * (0-(23.39429)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 22.5 + (((tickAnim - 290) / 10) * (0-(22.5)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.1-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -0.8 + (((tickAnim - 20) / 260) * (-0.8-(-0.8)));
            yy = -0.5 + (((tickAnim - 20) / 260) * (-0.5-(-0.5)));
            zz = 1.1 + (((tickAnim - 20) / 260) * (1.1-(1.1)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -0.8 + (((tickAnim - 280) / 20) * (0-(-0.8)));
            yy = -0.5 + (((tickAnim - 280) / 20) * (0-(-0.5)));
            zz = 1.1 + (((tickAnim - 280) / 20) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.72913-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-26.97395-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.31417-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -3.72913 + (((tickAnim - 20) / 260) * (-3.72913-(-3.72913)));
            yy = -26.97395 + (((tickAnim - 20) / 260) * (-26.97395-(-26.97395)));
            zz = -3.31417 + (((tickAnim - 20) / 260) * (-3.31417-(-3.31417)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -3.72913 + (((tickAnim - 280) / 10) * (0-(-3.72913)));
            yy = -26.97395 + (((tickAnim - 280) / 10) * (0-(-26.97395)));
            zz = -3.31417 + (((tickAnim - 280) / 10) * (0-(-3.31417)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 280) {
            xx = -0.525 + (((tickAnim - 20) / 260) * (-0.525-(-0.525)));
            yy = -0.15 + (((tickAnim - 20) / 260) * (-0.15-(-0.15)));
            zz = 0.25 + (((tickAnim - 20) / 260) * (0.25-(0.25)));
        }
        else if (tickAnim >= 280 && tickAnim < 290) {
            xx = -0.525 + (((tickAnim - 280) / 10) * (0-(-0.525)));
            yy = -0.15 + (((tickAnim - 280) / 10) * (0-(-0.15)));
            zz = 0.25 + (((tickAnim - 280) / 10) * (0-(0.25)));
        }
        else if (tickAnim >= 290 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 290) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 290) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraOtwayemys entity = (EntityPrehistoricFloraOtwayemys) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.54633-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.52715-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-5.27859-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 4.54633 + (((tickAnim - 6) / 2) * (11.30919-(4.54633)));
            yy = 1.52715 + (((tickAnim - 6) / 2) * (-0.54094-(1.52715)));
            zz = -5.27859 + (((tickAnim - 6) / 2) * (-12.48848-(-5.27859)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11.30919 + (((tickAnim - 8) / 2) * (11.55919-(11.30919)));
            yy = -0.54094 + (((tickAnim - 8) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 8) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 11.55919 + (((tickAnim - 10) / 2) * (7.95612-(11.55919)));
            yy = -0.54094 + (((tickAnim - 10) / 2) * (-0.36062-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 10) / 2) * (-8.32565-(-12.48848)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 7.95612 + (((tickAnim - 12) / 8) * (0-(7.95612)));
            yy = -0.36062 + (((tickAnim - 12) / 8) * (0-(-0.36062)));
            zz = -8.32565 + (((tickAnim - 12) / 8) * (0-(-8.32565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 6) / 2) * (-0.2-(-0.075)));
            zz = 0.35 + (((tickAnim - 6) / 2) * (0.35-(0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 6) * (-0.39-(-0.2)));
            zz = 0.35 + (((tickAnim - 8) / 6) * (0.115-(0.35)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.39 + (((tickAnim - 14) / 6) * (0-(-0.39)));
            zz = 0.115 + (((tickAnim - 14) / 6) * (0-(0.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 9.5 + (((tickAnim - 3) / 3) * (7.75-(9.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.75 + (((tickAnim - 6) / 2) * (-9.21186-(7.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.84275-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (5.18211-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9.21186 + (((tickAnim - 8) / 4) * (13.13-(-9.21186)));
            yy = 0.84275 + (((tickAnim - 8) / 4) * (0-(0.84275)));
            zz = 5.18211 + (((tickAnim - 8) / 4) * (0-(5.18211)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 13.13 + (((tickAnim - 12) / 8) * (0-(13.13)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
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
            zz = 0 + (((tickAnim - 0) / 3) * (0.46-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0.46 + (((tickAnim - 3) / 3) * (0.2-(0.46)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0.2 + (((tickAnim - 6) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.2 + (((tickAnim - 8) / 4) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 4) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 5) * (0.1325-(1)));
            zz = 1 + (((tickAnim - 4) / 5) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 0.1325 + (((tickAnim - 9) / 5) * (1-(0.1325)));
            zz = 1 + (((tickAnim - 9) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 4) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 4) * (1-(1)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 4) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 5) * (0.1325-(1)));
            zz = 1 + (((tickAnim - 4) / 5) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 9) / 5) * (1-(1)));
            yy = 0.1325 + (((tickAnim - 9) / 5) * (1-(0.1325)));
            zz = 1 + (((tickAnim - 9) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.25 + (((tickAnim - 6) / 2) * (30.5-(9.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 30.5 + (((tickAnim - 8) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraOtwayemys entity = (EntityPrehistoricFloraOtwayemys) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*-1), base.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*-2), base.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2.5));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3))*0.0001 + (((tickAnim - 0) / 3) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3))*0.0001)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 0) / 3) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 3) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 3) / 13) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 3) / 13) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 16) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 16) / 5) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3))*0.0015-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 16) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 21) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3))*0.0015 + (((tickAnim - 21) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3))*0.0015)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 21) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else if (tickAnim >= 26 && tickAnim < 41) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 26) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15 + (((tickAnim - 26) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 26) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05 + (((tickAnim - 41) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160-159))*0.05)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.1 + (((tickAnim - 41) / 4) * (0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.3-159))*0.0001-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2 + (((tickAnim - 41) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*160/0.5-159))*-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 5.22037 + (((tickAnim - 0) / 23) * (0.08727-(5.22037)));
            yy = 26.09039 + (((tickAnim - 0) / 23) * (-28.0019-(26.09039)));
            zz = 6.28238 + (((tickAnim - 0) / 23) * (2.50152-(6.28238)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0.08727 + (((tickAnim - 23) / 12) * (-20.85801-(0.08727)));
            yy = -28.0019 + (((tickAnim - 23) / 12) * (-64.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100-(-28.0019)));
            zz = 2.50152 + (((tickAnim - 23) / 12) * (134.5829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-159-(2.50152)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -20.85801 + (((tickAnim - 35) / 10) * (5.22037-(-20.85801)));
            yy = -64.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100 + (((tickAnim - 35) / 10) * (26.09039-(-64.3073+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*100)));
            zz = 134.5829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-159 + (((tickAnim - 35) / 10) * (6.28238-(134.5829+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-159)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -1.15587 + (((tickAnim - 0) / 23) * (-2.46133-(-1.15587)));
            yy = -21.69433 + (((tickAnim - 0) / 23) * (27.54642-(-21.69433)));
            zz = -4.30548 + (((tickAnim - 0) / 23) * (-5.29306-(-4.30548)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -2.46133 + (((tickAnim - 23) / 7) * (95.45494-(-2.46133)));
            yy = 27.54642 + (((tickAnim - 23) / 7) * (7.68484-(27.54642)));
            zz = -5.29306 + (((tickAnim - 23) / 7) * (8.86547-(-5.29306)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 95.45494 + (((tickAnim - 30) / 8) * (24.28227-(95.45494)));
            yy = 7.68484 + (((tickAnim - 30) / 8) * (-8.63692-(7.68484)));
            zz = 8.86547 + (((tickAnim - 30) / 8) * (1.54828-(8.86547)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 24.28227 + (((tickAnim - 38) / 7) * (-1.15587-(24.28227)));
            yy = -8.63692 + (((tickAnim - 38) / 7) * (-21.69433-(-8.63692)));
            zz = 1.54828 + (((tickAnim - 38) / 7) * (-4.30548-(1.54828)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (1.275-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            yy = 1.275 + (((tickAnim - 30) / 15) * (0-(1.275)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -0.10575 + (((tickAnim - 0) / 21) * (32.73928-(-0.10575)));
            yy = -40.75181 + (((tickAnim - 0) / 21) * (-3.01542-(-40.75181)));
            zz = -1.98208 + (((tickAnim - 0) / 21) * (24.00995-(-1.98208)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 32.73928 + (((tickAnim - 21) / 9) * (13.21135-(32.73928)));
            yy = -3.01542 + (((tickAnim - 21) / 9) * (162.4666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-3.01542)));
            zz = 24.00995 + (((tickAnim - 21) / 9) * (155.4197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-150-(24.00995)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 13.21135 + (((tickAnim - 30) / 9) * (0-(13.21135)));
            yy = 162.4666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 30) / 9) * (-55.75-(162.4666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            zz = 155.4197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-150 + (((tickAnim - 30) / 9) * (0-(155.4197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-10))*-150)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (-0.10575-(0)));
            yy = -55.75 + (((tickAnim - 39) / 6) * (-40.75181-(-55.75)));
            zz = 0 + (((tickAnim - 39) / 6) * (-1.98208-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg, backrightleg.rotateAngleX + (float) Math.toRadians(xx), backrightleg.rotateAngleY + (float) Math.toRadians(yy), backrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0.70242 + (((tickAnim - 0) / 21) * (50.38685-(0.70242)));
            yy = 26.23357 + (((tickAnim - 0) / 21) * (-1.46148-(26.23357)));
            zz = 2.98741 + (((tickAnim - 0) / 21) * (1.71366-(2.98741)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 50.38685 + (((tickAnim - 21) / 4) * (71.68539-(50.38685)));
            yy = -1.46148 + (((tickAnim - 21) / 4) * (8.18877-(-1.46148)));
            zz = 1.71366 + (((tickAnim - 21) / 4) * (1.32419-(1.71366)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = 71.68539 + (((tickAnim - 25) / 6) * (10.08069-(71.68539)));
            yy = 8.18877 + (((tickAnim - 25) / 6) * (24.36964-(8.18877)));
            zz = 1.32419 + (((tickAnim - 25) / 6) * (-19.05766-(1.32419)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 10.08069 + (((tickAnim - 31) / 5) * (-11.46777-(10.08069)));
            yy = 24.36964 + (((tickAnim - 31) / 5) * (34.34794-(24.36964)));
            zz = -19.05766 + (((tickAnim - 31) / 5) * (-7.62297-(-19.05766)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -11.46777 + (((tickAnim - 36) / 3) * (0-(-11.46777)));
            yy = 34.34794 + (((tickAnim - 36) / 3) * (41-(34.34794)));
            zz = -7.62297 + (((tickAnim - 36) / 3) * (0-(-7.62297)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0.70242-(0)));
            yy = 41 + (((tickAnim - 39) / 6) * (26.23357-(41)));
            zz = 0 + (((tickAnim - 39) / 6) * (2.98741-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg3, backrightleg3.rotateAngleX + (float) Math.toRadians(xx), backrightleg3.rotateAngleY + (float) Math.toRadians(yy), backrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 21) / 18) * (0-(0)));
            yy = 0.6 + (((tickAnim - 21) / 18) * (0-(0.6)));
            zz = 0 + (((tickAnim - 21) / 18) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg3.rotationPointX = this.backrightleg3.rotationPointX + (float)(xx);
        this.backrightleg3.rotationPointY = this.backrightleg3.rotationPointY - (float)(yy);
        this.backrightleg3.rotationPointZ = this.backrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*3.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-120))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-180))*1.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-230))*3.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-230))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-300))*5.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-300))*9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-230))*-2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.08857 + (((tickAnim - 0) / 3) * (0.08727-(0.08857)));
            yy = 20.00191 + (((tickAnim - 0) / 3) * (28.0019-(20.00191)));
            zz = -2.51386 + (((tickAnim - 0) / 3) * (-2.50152-(-2.51386)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0.08727 + (((tickAnim - 3) / 13) * (-25.2774-(0.08727)));
            yy = 28.0019 + (((tickAnim - 3) / 13) * (-2.4581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100-(28.0019)));
            zz = -2.50152 + (((tickAnim - 3) / 13) * (-34.118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80-(-2.50152)));
        }
        else if (tickAnim >= 16 && tickAnim < 26) {
            xx = -25.2774 + (((tickAnim - 16) / 10) * (5.22037-(-25.2774)));
            yy = -2.4581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100 + (((tickAnim - 16) / 10) * (-26.09039-(-2.4581+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-100)));
            zz = -34.118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80 + (((tickAnim - 16) / 10) * (-6.28238-(-34.118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*-80)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = 5.22037 + (((tickAnim - 26) / 19) * (0.08857-(5.22037)));
            yy = -26.09039 + (((tickAnim - 26) / 19) * (20.00191-(-26.09039)));
            zz = -6.28238 + (((tickAnim - 26) / 19) * (-2.51386-(-6.28238)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.46133 + (((tickAnim - 0) / 3) * (-2.46133-(-2.46133)));
            yy = -27.54642 + (((tickAnim - 0) / 3) * (-27.54642-(-27.54642)));
            zz = 5.29306 + (((tickAnim - 0) / 3) * (5.29306-(5.29306)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = -2.46133 + (((tickAnim - 3) / 8) * (95.45494-(-2.46133)));
            yy = -27.54642 + (((tickAnim - 3) / 8) * (-7.68484-(-27.54642)));
            zz = 5.29306 + (((tickAnim - 3) / 8) * (-8.86547-(5.29306)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 95.45494 + (((tickAnim - 11) / 9) * (24.28227-(95.45494)));
            yy = -7.68484 + (((tickAnim - 11) / 9) * (8.63692-(-7.68484)));
            zz = -8.86547 + (((tickAnim - 11) / 9) * (-1.54828-(-8.86547)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 24.28227 + (((tickAnim - 20) / 6) * (-1.15587-(24.28227)));
            yy = 8.63692 + (((tickAnim - 20) / 6) * (21.69433-(8.63692)));
            zz = -1.54828 + (((tickAnim - 20) / 6) * (4.30548-(-1.54828)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = -1.15587 + (((tickAnim - 26) / 19) * (-2.46133-(-1.15587)));
            yy = 21.69433 + (((tickAnim - 26) / 19) * (-27.54642-(21.69433)));
            zz = 4.30548 + (((tickAnim - 26) / 19) * (5.29306-(4.30548)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 8) * (1.275-(0)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 1.275 + (((tickAnim - 11) / 9) * (1.12-(1.275)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 1.12 + (((tickAnim - 20) / 6) * (0-(1.12)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 26) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (18.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 18.25 + (((tickAnim - 30) / 8) * (0-(18.25)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg2, backrightleg2.rotateAngleX + (float) Math.toRadians(xx), backrightleg2.rotateAngleY + (float) Math.toRadians(yy), backrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 32.73928 + (((tickAnim - 0) / 9) * (13.21135-(32.73928)));
            yy = 3.01542 + (((tickAnim - 0) / 9) * (-12.9334+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(3.01542)));
            zz = -24.00995 + (((tickAnim - 0) / 9) * (-34.5697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-24.00995)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 13.21135 + (((tickAnim - 9) / 9) * (0-(13.21135)));
            yy = -12.9334+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 9) / 9) * (55.75-(-12.9334+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            zz = -34.5697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 9) / 9) * (0-(-34.5697+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (14.77238-(0)));
            yy = 55.75 + (((tickAnim - 18) / 14) * (24.71908-(55.75)));
            zz = 0 + (((tickAnim - 18) / 14) * (4.68332-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 14.77238 + (((tickAnim - 32) / 13) * (32.73928-(14.77238)));
            yy = 24.71908 + (((tickAnim - 32) / 13) * (3.01542-(24.71908)));
            zz = 4.68332 + (((tickAnim - 32) / 13) * (-24.00995-(4.68332)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-18.25-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = -18.25 + (((tickAnim - 8) / 8) * (0-(-18.25)));
        }
        else if (tickAnim >= 16 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 16) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 16) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 9) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 25) / 7) * (-0.325-(-0.325)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = -0.325 + (((tickAnim - 32) / 13) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 50.38685 + (((tickAnim - 0) / 4) * (71.68539-(50.38685)));
            yy = -1.46148 + (((tickAnim - 0) / 4) * (-8.18877-(-1.46148)));
            zz = 1.71366 + (((tickAnim - 0) / 4) * (1.32419-(1.71366)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 71.68539 + (((tickAnim - 4) / 6) * (-9.63094-(71.68539)));
            yy = -8.18877 + (((tickAnim - 4) / 6) * (-24.54145-(-8.18877)));
            zz = 1.32419 + (((tickAnim - 4) / 6) * (26.47388-(1.32419)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -9.63094 + (((tickAnim - 10) / 5) * (-6.12096-(-9.63094)));
            yy = -24.54145 + (((tickAnim - 10) / 5) * (-35.70906-(-24.54145)));
            zz = 26.47388 + (((tickAnim - 10) / 5) * (0.63021-(26.47388)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -6.12096 + (((tickAnim - 15) / 3) * (0-(-6.12096)));
            yy = -35.70906 + (((tickAnim - 15) / 3) * (-41-(-35.70906)));
            zz = 0.63021 + (((tickAnim - 15) / 3) * (0-(0.63021)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (-14.007-(0)));
            yy = -41 + (((tickAnim - 18) / 14) * (-18.43361-(-41)));
            zz = 0 + (((tickAnim - 18) / 14) * (-2.05478-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = -14.007 + (((tickAnim - 32) / 13) * (50.38685-(-14.007)));
            yy = -18.43361 + (((tickAnim - 32) / 13) * (-1.46148-(-18.43361)));
            zz = -2.05478 + (((tickAnim - 32) / 13) * (1.71366-(-2.05478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0.6 + (((tickAnim - 0) / 18) * (0.2-(0.6)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            yy = 0.2 + (((tickAnim - 18) / 14) * (0.025-(0.2)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 32) / 13) * (0-(0)));
            yy = 0.025 + (((tickAnim - 32) / 13) * (0.6-(0.025)));
            zz = 0 + (((tickAnim - 32) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg3.rotationPointX = this.backleftleg3.rotationPointX + (float)(xx);
        this.backleftleg3.rotationPointY = this.backleftleg3.rotationPointY - (float)(yy);
        this.backleftleg3.rotationPointZ = this.backleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160/0.5-120))*2.9), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-110))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*160-180))*2));


    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraOtwayemys e = (EntityPrehistoricFloraOtwayemys) entity;
        animator.update(entity);


    }
}
