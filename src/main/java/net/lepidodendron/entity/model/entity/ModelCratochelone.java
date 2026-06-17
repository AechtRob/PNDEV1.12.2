package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCratochelone;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCratochelone extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
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
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer frontleftflipper;
    private final AdvancedModelRenderer frontleftflipper2;
    private final AdvancedModelRenderer frontleftflipper3;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer frontrightflipper;
    private final AdvancedModelRenderer frontrightflipper2;
    private final AdvancedModelRenderer frontrightflipper3;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer bellyshell;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer backleftflipper;
    private final AdvancedModelRenderer backleftflipper2;
    private final AdvancedModelRenderer backleftflipper3;
    private final AdvancedModelRenderer backrightflipper;
    private final AdvancedModelRenderer backrightflipper2;
    private final AdvancedModelRenderer backrightflipper3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer shellright;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer shellleft;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;

    private ModelAnimator animator;

    public ModelCratochelone() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 19.775F, 12.35F);
        this.setRotateAngle(body, -0.0131F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 86, 45, -4.0F, -2.0F, -1.0F, 9, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 62, 113, -0.5F, -4.75F, -30.8F, 2, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 17, -5.5F, -6.15F, -24.35F, 12, 2, 9, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(13.825F, 1.0F, -27.875F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 65, -9.0F, -3.0F, -1.0F, 10, 3, 9, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-12.825F, 1.0F, -27.875F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 65, -1.0F, -3.0F, -1.0F, 10, 3, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.5F, -4.225F, -6.65F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3796F, 0.0873F, 0.48F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 51, 0.0F, 0.0F, 0.0F, 10, 0, 7, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.5F, -6.15F, -15.35F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0873F, 0.5672F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 65, 0.0F, 0.0F, 0.0F, 11, 1, 9, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(6.5F, -6.15F, -21.35F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.5672F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 0, 0.0F, 0.0F, -3.0F, 12, 2, 9, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(5.5F, -6.15F, -24.35F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3185F, 0.0F, 0.5236F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 28, 0.0F, 0.0F, -6.0F, 12, 0, 6, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.5F, -4.225F, -6.65F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3796F, -0.0873F, -0.48F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 51, -10.0F, 0.0F, 0.0F, 10, 0, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -4.225F, -6.65F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3752F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 90, 87, -4.0F, 0.0F, 0.0F, 8, 2, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -6.15F, -15.35F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2182F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 54, -6.0F, 0.0F, 0.0F, 12, 2, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.5F, -6.15F, -24.35F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3185F, 0.0F, -0.5236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 28, -12.0F, 0.0F, -6.0F, 12, 0, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -6.15F, -24.35F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 78, 65, -5.0F, 0.0F, -6.0F, 10, 3, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-5.5F, -6.15F, -15.35F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, -0.0873F, -0.5672F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 65, -11.0F, 0.0F, 0.0F, 11, 1, 9, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-5.5F, -6.15F, -21.35F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.5672F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 0, -12.0F, 0.0F, -3.0F, 12, 2, 9, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -0.45F, -30.35F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 86, 34, -4.5F, -1.75F, -5.0F, 9, 5, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.575F, 0.4F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 60, 97, -5.0F, -3.0F, -5.0F, 8, 2, 6, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.225F, -4.6F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 98, 0, -4.0F, -2.5F, -4.0F, 7, 4, 5, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 86, 11, -5.25F, -2.5F, -1.075F, 2, 4, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 108, 58, -3.0F, -1.5F, -6.0F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 70, 112, -2.0F, -0.5F, -9.0F, 3, 2, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 86, 11, 2.25F, -2.5F, -1.075F, 2, 4, 2, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.525F, -7.675F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3403F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 108, -3.0F, 0.0F, 0.6F, 4, 2, 4, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.35F, -9.75F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5236F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 34, -1.0F, 0.5F, 0.0F, 1, 1, 1, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 80, -1.5F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 64, 34, -2.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.2F, -7.5F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9163F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 86, 49, -2.0F, 0.0F, -0.3F, 3, 1, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 92, 113, -2.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.75F, 0.5F, -4.0F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1745F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 110, 109, -2.0F, -3.0F, 0.0F, 2, 4, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.875F, -2.8F, -4.1F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3709F, 0.6545F, 0.1702F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 110, 63, -2.2F, 0.0F, -4.2F, 2, 2, 4, -0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.0F, -0.5F, -9.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3578F, 0.3054F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 113, -2.05F, 0.0F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.0F, 0.5F, -9.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.3054F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 114, -2.0F, -1.0F, 0.0F, 2, 2, 3, -0.015F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.75F, 0.5F, -4.0F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.6981F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 82, 113, -2.0F, -2.0F, -3.0F, 2, 3, 3, -0.01F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.0F, -0.5F, -9.0F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3578F, -0.3054F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 50, 113, 0.05F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.0F, 0.5F, -9.0F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.3054F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 114, 0.0F, -1.0F, 0.0F, 2, 2, 3, -0.015F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, -3.2F, 0.0F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 58, -4.0F, 0.0F, -4.0F, 8, 1, 5, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.875F, -2.8F, -4.1F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.3709F, -0.6545F, -0.1702F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 110, 63, 0.2F, 0.0F, -4.2F, 2, 2, 4, -0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-4.75F, 0.5F, -4.0F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, -0.6981F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 82, 113, 0.0F, -2.0F, -3.0F, 2, 3, 3, -0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-4.75F, 0.5F, -4.0F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, -0.1745F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 110, 109, 0.0F, -3.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-4.75F, 0.0F, -4.0F);
        this.head.addChild(eyeright);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeright.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.6981F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 77, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(3.75F, 0.0F, -4.0F);
        this.head.addChild(eyeleft);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeleft.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.6981F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 32, 77, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 1.5F, -0.75F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 28, 99, -3.5F, -2.0F, -3.25F, 7, 4, 5, 0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 34, -2.0F, 0.0F, -5.25F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 72, 34, -1.0F, 0.0F, -7.25F, 2, 1, 2, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 99, -4.675F, -1.0F, -0.325F, 2, 3, 2, -0.015F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 52, 99, 2.675F, -1.0F, -0.325F, 2, 3, 2, -0.01F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.0F, 1.0F, -7.25F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.2356F, 0.576F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 10, 114, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.01F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.45F, 1.0F, -8.125F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.6021F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 114, 73, -2.0F, -1.0F, 1.0F, 2, 1, 3, -0.015F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(4.15F, 1.0F, -3.25F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.6981F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 114, 77, -2.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.175F, 1.625F, -5.525F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.1134F, 0.6981F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 114, 81, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(4.15F, 1.0F, -3.25F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.1745F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 114, -2.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.45F, 1.0F, -8.125F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.6021F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 114, 73, 0.0F, -1.0F, 1.0F, 2, 1, 3, -0.015F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-4.15F, 1.0F, -3.25F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.6981F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 114, 77, 0.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-2.175F, 1.625F, -5.525F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.1134F, -0.6981F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 114, 81, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 1.625F, -5.35F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.1134F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 110, 69, -1.5F, -1.0F, 0.0F, 4, 1, 3, 0.01F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0F, 1.0F, -7.25F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.2356F, -0.576F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 10, 114, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, 1.0F, -7.25F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.3054F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 88, 31, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-4.15F, 1.0F, -3.25F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.1745F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 34, 114, 0.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(8.725F, 1.0F, -25.45F);
        this.body.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.2369F, -0.6076F, 0.0065F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 0, 37, -3.8006F, -2.3843F, -10.7022F, 8, 4, 13, 0.0F, true));

        this.frontleftflipper2 = new AdvancedModelRenderer(this);
        this.frontleftflipper2.setRotationPoint(0.6244F, -0.8843F, -10.2022F);
        this.frontleftflipper.addChild(frontleftflipper2);
        this.setRotateAngle(frontleftflipper2, -0.1883F, -0.5235F, 0.1301F);
        this.frontleftflipper2.cubeList.add(new ModelBox(frontleftflipper2, 0, 77, -3.75F, -1.0F, -7.0F, 8, 3, 9, 0.0F, true));

        this.frontleftflipper3 = new AdvancedModelRenderer(this);
        this.frontleftflipper3.setRotationPoint(0.275F, 0.0F, -7.0F);
        this.frontleftflipper2.addChild(frontleftflipper3);
        this.setRotateAngle(frontleftflipper3, 0.0012F, -0.3537F, -0.0414F);
        this.frontleftflipper3.cubeList.add(new ModelBox(frontleftflipper3, 42, 37, -4.225F, -0.5F, -10.0F, 10, 2, 12, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-2.775F, 0.0F, -10.0F);
        this.frontleftflipper3.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, -0.2618F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 90, 96, -0.2F, 0.0F, -7.0F, 7, 1, 7, 0.0F, true));

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-6.9F, 1.0F, -25.45F);
        this.body.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.2369F, 0.6076F, -0.0065F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 0, 37, -4.8767F, -2.5F, -11.1588F, 8, 4, 13, 0.0F, false));

        this.frontrightflipper2 = new AdvancedModelRenderer(this);
        this.frontrightflipper2.setRotationPoint(-1.3017F, -1.0F, -10.6588F);
        this.frontrightflipper.addChild(frontrightflipper2);
        this.setRotateAngle(frontrightflipper2, -0.1883F, 0.5235F, -0.1301F);
        this.frontrightflipper2.cubeList.add(new ModelBox(frontrightflipper2, 0, 77, -4.25F, -1.0F, -7.0F, 8, 3, 9, 0.0F, false));

        this.frontrightflipper3 = new AdvancedModelRenderer(this);
        this.frontrightflipper3.setRotationPoint(-0.275F, 0.0F, -7.0F);
        this.frontrightflipper2.addChild(frontrightflipper3);
        this.setRotateAngle(frontrightflipper3, 0.0012F, 0.3537F, 0.0414F);
        this.frontrightflipper3.cubeList.add(new ModelBox(frontrightflipper3, 42, 37, -5.775F, -0.5F, -10.0F, 10, 2, 12, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(2.775F, 0.0F, -10.0F);
        this.frontrightflipper3.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.2618F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 90, 96, -6.8F, 0.0F, -7.0F, 7, 1, 7, 0.0F, false));

        this.bellyshell = new AdvancedModelRenderer(this);
        this.bellyshell.setRotationPoint(0.5F, 4.7F, -20.35F);
        this.body.addChild(bellyshell);
        this.setRotateAngle(bellyshell, 0.0262F, 0.0F, 0.0F);
        this.bellyshell.cubeList.add(new ModelBox(bellyshell, 0, 0, -6.0F, -1.0F, -3.0F, 12, 1, 16, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.bellyshell.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 38, 75, -6.0F, -5.0F, 0.0F, 12, 5, 7, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.bellyshell.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.2182F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 42, 51, -6.0F, -6.0F, -8.0F, 12, 6, 8, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(6.0F, 0.0F, 5.0F);
        this.bellyshell.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.0F, -0.3054F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 17, 0.0F, -4.0F, -8.0F, 10, 4, 16, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-6.0F, 0.0F, 5.0F);
        this.bellyshell.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0F, 0.3054F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 17, -10.0F, -4.0F, -8.0F, 10, 4, 16, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(4.65F, 0.9F, -3.7F);
        this.body.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 2.8972F, 1.4399F, 3.1416F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 32, 87, -2.0F, -1.0F, -2.5F, 5, 3, 9, 0.01F, true));

        this.backleftflipper2 = new AdvancedModelRenderer(this);
        this.backleftflipper2.setRotationPoint(0.75F, 0.5F, 5.5F);
        this.backleftflipper.addChild(backleftflipper2);
        this.setRotateAngle(backleftflipper2, 0.2945F, -0.9252F, -0.325F);
        this.backleftflipper2.cubeList.add(new ModelBox(backleftflipper2, 60, 87, -4.025F, -1.0F, -0.75F, 7, 2, 8, 0.0F, true));

        this.backleftflipper3 = new AdvancedModelRenderer(this);
        this.backleftflipper3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.backleftflipper2.addChild(backleftflipper3);
        this.setRotateAngle(backleftflipper3, 0.0651F, -0.259F, -0.0496F);
        this.backleftflipper3.cubeList.add(new ModelBox(backleftflipper3, 76, 75, -4.75F, -0.5F, -1.0F, 8, 1, 11, 0.0F, true));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-3.65F, 0.9F, -3.7F);
        this.body.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 2.8972F, -1.4399F, -3.1416F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 32, 87, -3.0F, -1.0F, -2.5F, 5, 3, 9, 0.01F, false));

        this.backrightflipper2 = new AdvancedModelRenderer(this);
        this.backrightflipper2.setRotationPoint(-0.75F, 0.5F, 5.5F);
        this.backrightflipper.addChild(backrightflipper2);
        this.setRotateAngle(backrightflipper2, 0.2945F, 0.9252F, 0.325F);
        this.backrightflipper2.cubeList.add(new ModelBox(backrightflipper2, 60, 87, -2.975F, -1.0F, -0.75F, 7, 2, 8, 0.0F, false));

        this.backrightflipper3 = new AdvancedModelRenderer(this);
        this.backrightflipper3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.backrightflipper2.addChild(backrightflipper3);
        this.setRotateAngle(backrightflipper3, 0.0651F, 0.259F, 0.0496F);
        this.backrightflipper3.cubeList.add(new ModelBox(backrightflipper3, 76, 75, -3.25F, -0.5F, -1.0F, 8, 1, 11, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, 0.3F, -0.35F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.288F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 94, 11, -5.0F, -1.25F, -1.0F, 10, 4, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 100, -3.5F, -1.25F, -1.0F, 7, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 70, 105, -2.0F, -1.0F, -1.0F, 4, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 110, 104, -0.5F, -0.5F, -1.0F, 2, 1, 4, 0.0F, false));

        this.shellright = new AdvancedModelRenderer(this);
        this.shellright.setRotationPoint(0.5F, -1.5F, -18.55F);
        this.body.addChild(shellright);
        this.setRotateAngle(shellright, -0.0436F, 0.0F, -0.2182F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-13.55F, 0.0F, 11.25F);
        this.shellright.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, 0.7156F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 89, -1.0F, -2.0F, -1.0F, 5, 2, 9, 0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-15.8F, 0.0F, 5.175F);
        this.shellright.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, 0.3054F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 88, 104, -1.0F, -2.0F, -1.0F, 4, 2, 7, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-16.3F, 0.0F, -0.525F);
        this.shellright.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.0436F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 52, 105, -1.0F, -2.0F, -1.0F, 3, 2, 6, 0.01F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-15.325F, 0.0F, -9.325F);
        this.shellright.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, -0.1309F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 94, 20, -1.0F, -2.0F, -1.0F, 4, 2, 9, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-2.975F, 0.0F, 18.675F);
        this.shellright.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.288F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 108, -6.0F, -2.0F, -3.0F, 5, 2, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-13.525F, -0.1F, -12.1F);
        this.shellright.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.0F, -0.096F);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.bone.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, 0.925F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 18, 108, -3.0F, -2.0F, -1.0F, 3, 2, 5, 0.01F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(13.125F, 0.525F, 0.85F);
        this.bone.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, -0.3927F, 0.1745F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 108, 45, -4.0F, -2.0F, -1.0F, 4, 2, 3, 0.01F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(10.275F, 0.0F, 2.375F);
        this.bone.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0873F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 122, -11.0F, -2.0F, -1.0F, 11, 2, 4, -0.01F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(10.275F, 0.0F, -0.625F);
        this.bone.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0873F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 56, 11, -11.0F, -2.0F, -1.0F, 11, 2, 4, 0.0F, false));

        this.shellleft = new AdvancedModelRenderer(this);
        this.shellleft.setRotationPoint(0.5F, -1.5F, -18.55F);
        this.body.addChild(shellleft);
        this.setRotateAngle(shellleft, -0.0436F, 0.0F, 0.2182F);


        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(13.55F, 0.0F, 11.25F);
        this.shellleft.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.7156F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 89, -4.0F, -2.0F, -1.0F, 5, 2, 9, 0.01F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(15.8F, 0.0F, 5.175F);
        this.shellleft.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, -0.3054F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 88, 104, -3.0F, -2.0F, -1.0F, 4, 2, 7, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(16.3F, 0.0F, -0.525F);
        this.shellleft.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, -0.0436F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 52, 105, -2.0F, -2.0F, -1.0F, 3, 2, 6, 0.01F, true));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(15.325F, 0.0F, -9.325F);
        this.shellleft.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, 0.1309F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 94, 20, -3.0F, -2.0F, -1.0F, 4, 2, 9, 0.0F, true));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(2.975F, 0.0F, 18.675F);
        this.shellleft.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, 0.288F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 108, 1.0F, -2.0F, -3.0F, 5, 2, 4, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(13.525F, -0.1F, -12.1F);
        this.shellleft.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.0F, 0.096F);


        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.bone2.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, -0.925F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 18, 108, 0.0F, -2.0F, -1.0F, 3, 2, 5, 0.01F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-13.125F, 0.525F, 0.85F);
        this.bone2.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.3927F, -0.1745F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 108, 45, 0.0F, -2.0F, -1.0F, 4, 2, 3, 0.01F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(-10.275F, 0.0F, 2.375F);
        this.bone2.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.0873F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 122, 0.0F, -2.0F, -1.0F, 11, 2, 4, -0.01F, true));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(-10.275F, 0.0F, -0.625F);
        this.bone2.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, -0.0873F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 56, 11, 0.0F, -2.0F, -1.0F, 11, 2, 4, 0.0F, true));

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
        this.body.offsetY = -0.4F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(0);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.body.offsetY = -0.105F;
        this.body.render(0.01F);
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

        EntityPrehistoricFloraCratochelone entityCratochelone = (EntityPrehistoricFloraCratochelone) e;

        if (entityCratochelone.getAnimation() == entityCratochelone.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityCratochelone.getAnimation() == entityCratochelone.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityCratochelone.isReallyInWater()) {

                if (f3 == 0.0F || !entityCratochelone.getIsMoving()) {
                    if (entityCratochelone.getAnimation() != entityCratochelone.EAT_ANIMATION
                        && entityCratochelone.getAnimation() != entityCratochelone.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }
                    return;
                }

                if (entityCratochelone.getIsFast()) { //Running


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
    public void setLivingAnimations(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();

        EntityPrehistoricFloraCratochelone ee = (EntityPrehistoricFloraCratochelone) entitylivingbodyIn;

        if (ee.isReallyInWater()) {
            animSwimming(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);

        } else if (ee.getIsMoving()) {
            animWalking(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbodyIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratochelone entity = (EntityPrehistoricFloraCratochelone) entitylivingbodyIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 20) / 15) * (4-(4)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.375-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 20) / 15) * (1.375-(1.375)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.375 + (((tickAnim - 35) / 15) * (0-(1.375)));
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




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.25 + (((tickAnim - 20) / 15) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 35) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 20) / 15) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 20) / 15) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
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
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-103.56841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-25.45067-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-94.7998-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -103.56841 + (((tickAnim - 20) / 15) * (-146.77666-(-103.56841)));
            yy = -25.45067 + (((tickAnim - 20) / 15) * (-46.76795-(-25.45067)));
            zz = -94.7998 + (((tickAnim - 20) / 15) * (-108.62449-(-94.7998)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -146.77666 + (((tickAnim - 35) / 15) * (0-(-146.77666)));
            yy = -46.76795 + (((tickAnim - 35) / 15) * (0-(-46.76795)));
            zz = -108.62449 + (((tickAnim - 35) / 15) * (0-(-108.62449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-13.48008-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (38.1251-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (20.43459-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -13.48008 + (((tickAnim - 20) / 15) * (-23.76081-(-13.48008)));
            yy = 38.1251 + (((tickAnim - 20) / 15) * (32.34662-(38.1251)));
            zz = 20.43459 + (((tickAnim - 20) / 15) * (18.37118-(20.43459)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.76081 + (((tickAnim - 35) / 15) * (0-(-23.76081)));
            yy = 32.34662 + (((tickAnim - 35) / 15) * (0-(32.34662)));
            zz = 18.37118 + (((tickAnim - 35) / 15) * (0-(18.37118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (13.724-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (-3.22891-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (-5.99645-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 13.724 + (((tickAnim - 24) / 11) * (-15.25-(13.724)));
            yy = -3.22891 + (((tickAnim - 24) / 11) * (0-(-3.22891)));
            zz = -5.99645 + (((tickAnim - 24) / 11) * (0-(-5.99645)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(xx), backleftflipper3.rotateAngleY + (float) Math.toRadians(yy), backleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-103.56841-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (25.45067-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (94.7998-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -103.56841 + (((tickAnim - 20) / 15) * (-146.77666-(-103.56841)));
            yy = 25.45067 + (((tickAnim - 20) / 15) * (46.76795-(25.45067)));
            zz = 94.7998 + (((tickAnim - 20) / 15) * (108.62449-(94.7998)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -146.77666 + (((tickAnim - 35) / 15) * (0-(-146.77666)));
            yy = 46.76795 + (((tickAnim - 35) / 15) * (0-(46.76795)));
            zz = 108.62449 + (((tickAnim - 35) / 15) * (0-(108.62449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.36985-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-30.42447-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-15.04062-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -5.36985 + (((tickAnim - 20) / 15) * (-18.37711-(-5.36985)));
            yy = -30.42447 + (((tickAnim - 20) / 15) * (-30.36572-(-30.42447)));
            zz = -15.04062 + (((tickAnim - 20) / 15) * (-24.79175-(-15.04062)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -18.37711 + (((tickAnim - 35) / 8) * (2.06144-(-18.37711)));
            yy = -30.36572 + (((tickAnim - 35) / 8) * (-15.18286-(-30.36572)));
            zz = -24.79175 + (((tickAnim - 35) / 8) * (-12.39588-(-24.79175)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 2.06144 + (((tickAnim - 43) / 7) * (0-(2.06144)));
            yy = -15.18286 + (((tickAnim - 43) / 7) * (0-(-15.18286)));
            zz = -12.39588 + (((tickAnim - 43) / 7) * (0-(-12.39588)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (13.724-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (-3.22891-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (-5.99645-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 13.724 + (((tickAnim - 24) / 11) * (-15.25-(13.724)));
            yy = -3.22891 + (((tickAnim - 24) / 11) * (0-(-3.22891)));
            zz = -5.99645 + (((tickAnim - 24) / 11) * (0-(-5.99645)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.25 + (((tickAnim - 35) / 15) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(xx), backrightflipper3.rotateAngleY + (float) Math.toRadians(yy), backrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.29-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -10.29 + (((tickAnim - 20) / 15) * (-9.25-(-10.29)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.25 + (((tickAnim - 35) / 15) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCratochelone entity = (EntityPrehistoricFloraCratochelone) entitylivingbodyIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-18.51581-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.54094-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-12.48848-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.51581 + (((tickAnim - 6) / 2) * (-19.94081-(-18.51581)));
            yy = -0.54094 + (((tickAnim - 6) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 6) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -19.94081 + (((tickAnim - 8) / 2) * (-20.69081-(-19.94081)));
            yy = -0.54094 + (((tickAnim - 8) / 2) * (-0.54094-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 8) / 2) * (-12.48848-(-12.48848)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -20.69081 + (((tickAnim - 10) / 2) * (-18.04388-(-20.69081)));
            yy = -0.54094 + (((tickAnim - 10) / 2) * (-0.36062-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 10) / 2) * (-8.32565-(-12.48848)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -18.04388 + (((tickAnim - 12) / 8) * (0-(-18.04388)));
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
            yy = 0 + (((tickAnim - 0) / 6) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.725-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.625 + (((tickAnim - 6) / 2) * (-0.675-(-0.625)));
            zz = -0.725 + (((tickAnim - 6) / 2) * (-0.9-(-0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.675 + (((tickAnim - 8) / 6) * (-0.39-(-0.675)));
            zz = -0.9 + (((tickAnim - 8) / 6) * (0.115-(-0.9)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.5 + (((tickAnim - 3) / 3) * (-6.5-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 6) / 2) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -6.5 + (((tickAnim - 8) / 4) * (13.13-(-6.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 8) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 5) * (0.385-(1)));
            zz = 1 + (((tickAnim - 8) / 5) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.385 + (((tickAnim - 13) / 5) * (1-(0.385)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 1 + (((tickAnim - 8) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 5) * (0.385-(1)));
            zz = 1 + (((tickAnim - 8) / 5) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 0.385 + (((tickAnim - 13) / 5) * (1-(0.385)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 6) / 2) * (30.5-(26.75)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwimming(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratochelone entity = (EntityPrehistoricFloraCratochelone) entitylivingbodyIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+40))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-30))*-0.59);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120+50))*-1);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-80))*-6), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-120))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(16.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-20), frontleftflipper.rotateAngleY + (float) Math.toRadians(-15.3529+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*20), frontleftflipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*20));


        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*20), frontleftflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*30), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*30));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 18) / 42) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 42) * (0-(-0.7)));
            zz = 1.425 + (((tickAnim - 18) / 42) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftflipper2.rotationPointX = this.frontleftflipper2.rotationPointX + (float)(xx);
        this.frontleftflipper2.rotationPointY = this.frontleftflipper2.rotationPointY - (float)(yy);
        this.frontleftflipper2.rotationPointZ = this.frontleftflipper2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-10), frontleftflipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*20), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*10));


        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(16.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*-20), frontrightflipper.rotateAngleY + (float) Math.toRadians(15.3529+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-20), frontrightflipper.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-20));


        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*20), frontrightflipper2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-200))*-30), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*-30));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 18) / 42) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 42) * (0-(-0.7)));
            zz = 1.425 + (((tickAnim - 18) / 42) * (0-(1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightflipper2.rotationPointX = this.frontrightflipper2.rotationPointX + (float)(xx);
        this.frontrightflipper2.rotationPointY = this.frontrightflipper2.rotationPointY - (float)(yy);
        this.frontrightflipper2.rotationPointZ = this.frontrightflipper2.rotationPointZ + (float)(zz);



        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-10), frontrightflipper3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-250))*-20), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*-10));


        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*4), backleftflipper.rotateAngleY + (float) Math.toRadians(0), backleftflipper.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), backleftflipper2.rotateAngleY + (float) Math.toRadians(0), backleftflipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*4), backleftflipper3.rotateAngleY + (float) Math.toRadians(0), backleftflipper3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*4), backrightflipper.rotateAngleY + (float) Math.toRadians(0), backrightflipper.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*4), backrightflipper2.rotateAngleY + (float) Math.toRadians(0), backrightflipper2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*4), backrightflipper3.rotateAngleY + (float) Math.toRadians(0), backrightflipper3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))*7), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))*7), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))*7), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))*7), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animWalking(EntityLivingBase entitylivingbodyIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCratochelone entity = (EntityPrehistoricFloraCratochelone) entitylivingbodyIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 2 + (((tickAnim - 46) / 1) * (4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5-(2)));
            yy = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 1) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = 4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5 + (((tickAnim - 47) / 33) * (0-(4.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+90))*5)));
            yy = 0 + (((tickAnim - 47) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.235 + (((tickAnim - 0) / 12) * (0-(-0.235)));
            zz = 0.005 + (((tickAnim - 0) / 12) * (-0.175-(0.005)));
        }
        else if (tickAnim >= 12 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 12) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 34) * (1.025-(0)));
            zz = -0.175 + (((tickAnim - 12) / 34) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1-(-0.175)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 46) / 12) * (-0.31-(1.025)));
            zz = 0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1 + (((tickAnim - 46) / 12) * (-0.2-(0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+20))*-1)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            yy = -0.31 + (((tickAnim - 58) / 22) * (-0.235-(-0.31)));
            zz = -0.2 + (((tickAnim - 58) / 22) * (0.005-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 5.25 + (((tickAnim - 46) / 17) * (0.23-(5.25)));
            yy = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 17) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0.23 + (((tickAnim - 63) / 17) * (0-(0.23)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = -9 + (((tickAnim - 46) / 17) * (-0.78-(-9)));
            yy = 0 + (((tickAnim - 46) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 17) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -0.78 + (((tickAnim - 63) / 17) * (0-(-0.78)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 0) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 18) * (1.275-(1)));
            zz = 1 + (((tickAnim - 0) / 18) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 34) {
            xx = 1 + (((tickAnim - 18) / 16) * (1-(1)));
            yy = 1.275 + (((tickAnim - 18) / 16) * (1-(1.275)));
            zz = 1 + (((tickAnim - 18) / 16) * (1-(1)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 34) / 9) * (1-(1)));
            yy = 1 + (((tickAnim - 34) / 9) * (1-(1)));
            zz = 1 + (((tickAnim - 34) / 9) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 43) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 17) * (1.275-(1)));
            zz = 1 + (((tickAnim - 43) / 17) * (1-(1)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 60) / 20) * (1-(1)));
            yy = 1.275 + (((tickAnim - 60) / 20) * (1-(1.275)));
            zz = 1 + (((tickAnim - 60) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.jaw.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (-1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (5.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*10-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 80) {
            xx = -1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20 + (((tickAnim - 46) / 34) * (0-(-1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20)));
            yy = 5.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 46) / 34) * (0-(5.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = 3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*10 + (((tickAnim - 46) / 34) * (0-(3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 3.93294 + (((tickAnim - 0) / 21) * (-1.19707-(3.93294)));
            yy = 10.441 + (((tickAnim - 0) / 21) * (1.64509-(10.441)));
            zz = -12.25628 + (((tickAnim - 0) / 21) * (-11.36905-(-12.25628)));
        }
        else if (tickAnim >= 21 && tickAnim < 46) {
            xx = -1.19707 + (((tickAnim - 21) / 25) * (5.60383-(-1.19707)));
            yy = 1.64509 + (((tickAnim - 21) / 25) * (-8.75008-(1.64509)));
            zz = -11.36905 + (((tickAnim - 21) / 25) * (-10.3205-(-11.36905)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = 5.60383 + (((tickAnim - 46) / 12) * (-8.73587-(5.60383)));
            yy = -8.75008 + (((tickAnim - 46) / 12) * (39.9403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(-8.75008)));
            zz = -10.3205 + (((tickAnim - 46) / 12) * (-42.4305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(-10.3205)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -8.73587 + (((tickAnim - 58) / 22) * (3.93294-(-8.73587)));
            yy = 39.9403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 58) / 22) * (10.441-(39.9403+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            zz = -42.4305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 58) / 22) * (-12.25628-(-42.4305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper2.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 6.09461 + (((tickAnim - 0) / 21) * (6.33769-(6.09461)));
            yy = -11.64279 + (((tickAnim - 0) / 21) * (-16.56062-(-11.64279)));
            zz = -3.37719 + (((tickAnim - 0) / 21) * (1.65142-(-3.37719)));
        }
        else if (tickAnim >= 21 && tickAnim < 46) {
            xx = 6.33769 + (((tickAnim - 21) / 25) * (12.68222-(6.33769)));
            yy = -16.56062 + (((tickAnim - 21) / 25) * (-21.48976-(-16.56062)));
            zz = 1.65142 + (((tickAnim - 21) / 25) * (-1.6578-(1.65142)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = 12.68222 + (((tickAnim - 46) / 22) * (9.44114-(12.68222)));
            yy = -21.48976 + (((tickAnim - 46) / 22) * (-10.89204-(-21.48976)));
            zz = -1.6578 + (((tickAnim - 46) / 22) * (-9.77074-(-1.6578)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 9.44114 + (((tickAnim - 68) / 12) * (6.09461-(9.44114)));
            yy = -10.89204 + (((tickAnim - 68) / 12) * (-11.64279-(-10.89204)));
            zz = -9.77074 + (((tickAnim - 68) / 12) * (-3.37719-(-9.77074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (1.2-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 68) {
            xx = 0.425 + (((tickAnim - 46) / 22) * (0-(0.425)));
            yy = 0 + (((tickAnim - 46) / 22) * (0-(0)));
            zz = 1.2 + (((tickAnim - 46) / 22) * (0-(1.2)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftflipper3.rotationPointX = this.frontleftflipper3.rotationPointX + (float)(xx);
        this.frontleftflipper3.rotationPointY = this.frontleftflipper3.rotationPointY - (float)(yy);
        this.frontleftflipper3.rotationPointZ = this.frontleftflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -341.49 + (((tickAnim - 0) / 46) * (-183.41729-(-341.49)));
            yy = 1.01422 + (((tickAnim - 0) / 46) * (-11.68572-(1.01422)));
            zz = -340.8748 + (((tickAnim - 0) / 46) * (-173.32848-(-340.8748)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = -183.41729 + (((tickAnim - 46) / 17) * (-173.37266-(-183.41729)));
            yy = -11.68572 + (((tickAnim - 46) / 17) * (-4.80424-(-11.68572)));
            zz = -173.32848 + (((tickAnim - 46) / 17) * (-182.00374-(-173.32848)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -173.37266 + (((tickAnim - 63) / 17) * (-341.49-(-173.37266)));
            yy = -4.80424 + (((tickAnim - 63) / 17) * (1.01422-(-4.80424)));
            zz = -182.00374 + (((tickAnim - 63) / 17) * (-340.8748-(-182.00374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -9.4104 + (((tickAnim - 0) / 21) * (-4.16873-(-9.4104)));
            yy = 41.88585 + (((tickAnim - 0) / 21) * (19.06385-(41.88585)));
            zz = 15.84951 + (((tickAnim - 0) / 21) * (19.64996-(15.84951)));
        }
        else if (tickAnim >= 21 && tickAnim < 46) {
            xx = -4.16873 + (((tickAnim - 21) / 25) * (2.19484-(-4.16873)));
            yy = 19.06385 + (((tickAnim - 21) / 25) * (22.79528-(19.06385)));
            zz = 19.64996 + (((tickAnim - 21) / 25) * (2.68361-(19.64996)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 2.19484 + (((tickAnim - 46) / 17) * (-6.08406-(2.19484)));
            yy = 22.79528 + (((tickAnim - 46) / 17) * (48.27119-(22.79528)));
            zz = 2.68361 + (((tickAnim - 46) / 17) * (12.45883-(2.68361)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -6.08406 + (((tickAnim - 63) / 17) * (-9.4104-(-6.08406)));
            yy = 48.27119 + (((tickAnim - 63) / 17) * (41.88585-(48.27119)));
            zz = 12.45883 + (((tickAnim - 63) / 17) * (15.84951-(12.45883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 3.5 + (((tickAnim - 0) / 21) * (0-(3.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 4.5 + (((tickAnim - 21) / 13) * (8.89-(4.5)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 63) {
            xx = 8.89 + (((tickAnim - 34) / 29) * (-8.56-(8.89)));
            yy = 0 + (((tickAnim - 34) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 29) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -8.56 + (((tickAnim - 63) / 10) * (6.6-(-8.56)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 6.6 + (((tickAnim - 73) / 7) * (0-(6.6)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (3.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(xx), backleftflipper3.rotateAngleY + (float) Math.toRadians(yy), backleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = -341.49 + (((tickAnim - 0) / 46) * (-183.41729-(-341.49)));
            yy = -1.01422 + (((tickAnim - 0) / 46) * (11.68572-(-1.01422)));
            zz = 340.8748 + (((tickAnim - 0) / 46) * (173.32848-(340.8748)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = -183.41729 + (((tickAnim - 46) / 17) * (-173.37266-(-183.41729)));
            yy = 11.68572 + (((tickAnim - 46) / 17) * (4.80424-(11.68572)));
            zz = 173.32848 + (((tickAnim - 46) / 17) * (182.00374-(173.32848)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -173.37266 + (((tickAnim - 63) / 17) * (-341.49-(-173.37266)));
            yy = 4.80424 + (((tickAnim - 63) / 17) * (-1.01422-(4.80424)));
            zz = 182.00374 + (((tickAnim - 63) / 17) * (340.8748-(182.00374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -9.4104 + (((tickAnim - 0) / 21) * (-4.16873-(-9.4104)));
            yy = -41.88585 + (((tickAnim - 0) / 21) * (-19.06385-(-41.88585)));
            zz = -15.84951 + (((tickAnim - 0) / 21) * (-19.64996-(-15.84951)));
        }
        else if (tickAnim >= 21 && tickAnim < 46) {
            xx = -4.16873 + (((tickAnim - 21) / 25) * (2.19484-(-4.16873)));
            yy = -19.06385 + (((tickAnim - 21) / 25) * (-22.79528-(-19.06385)));
            zz = -19.64996 + (((tickAnim - 21) / 25) * (-2.68361-(-19.64996)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 2.19484 + (((tickAnim - 46) / 17) * (-6.08406-(2.19484)));
            yy = -22.79528 + (((tickAnim - 46) / 17) * (-48.27119-(-22.79528)));
            zz = -2.68361 + (((tickAnim - 46) / 17) * (-12.45883-(-2.68361)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -6.08406 + (((tickAnim - 63) / 17) * (-9.4104-(-6.08406)));
            yy = -48.27119 + (((tickAnim - 63) / 17) * (-41.88585-(-48.27119)));
            zz = -12.45883 + (((tickAnim - 63) / 17) * (-15.84951-(-12.45883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = -3.5 + (((tickAnim - 0) / 21) * (0-(-3.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 4.5 + (((tickAnim - 21) / 13) * (8.89-(4.5)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 63) {
            xx = 8.89 + (((tickAnim - 34) / 29) * (-9.31-(8.89)));
            yy = 0 + (((tickAnim - 34) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 29) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 73) {
            xx = -9.31 + (((tickAnim - 63) / 10) * (6.6-(-9.31)));
            yy = 0 + (((tickAnim - 63) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 10) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 6.6 + (((tickAnim - 73) / 7) * (0-(6.6)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (-3.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(xx), backrightflipper3.rotateAngleY + (float) Math.toRadians(yy), backrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 1.25 + (((tickAnim - 0) / 46) * (-6-(1.25)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 58) {
            xx = -6 + (((tickAnim - 46) / 12) * (2-(-6)));
            yy = 0 + (((tickAnim - 46) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 12) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 2 + (((tickAnim - 58) / 22) * (1.25-(2)));
            yy = 0 + (((tickAnim - 58) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (-1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (-14.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (-3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-10-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 80) {
            xx = -1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20 + (((tickAnim - 47) / 33) * (0-(-1.9655+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-20)));
            yy = -14.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 47) / 33) * (0-(-14.9031+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = -3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-10 + (((tickAnim - 47) / 33) * (0-(-3.1541+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-90))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 3.93294 + (((tickAnim - 0) / 21) * (-1.19707-(3.93294)));
            yy = -10.441 + (((tickAnim - 0) / 21) * (-1.64509-(-10.441)));
            zz = 12.25628 + (((tickAnim - 0) / 21) * (11.36905-(12.25628)));
        }
        else if (tickAnim >= 21 && tickAnim < 46) {
            xx = -1.19707 + (((tickAnim - 21) / 25) * (3.10383-(-1.19707)));
            yy = -1.64509 + (((tickAnim - 21) / 25) * (8.75008-(-1.64509)));
            zz = 11.36905 + (((tickAnim - 21) / 25) * (10.3205-(11.36905)));
        }
        else if (tickAnim >= 46 && tickAnim < 63) {
            xx = 3.10383 + (((tickAnim - 46) / 17) * (-8.63587-(3.10383)));
            yy = 8.75008 + (((tickAnim - 46) / 17) * (-27.8847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50-(8.75008)));
            zz = 10.3205 + (((tickAnim - 46) / 17) * (29.5555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(10.3205)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -8.63587 + (((tickAnim - 63) / 17) * (3.93294-(-8.63587)));
            yy = -27.8847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 63) / 17) * (-10.441-(-27.8847+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            zz = 29.5555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 63) / 17) * (12.25628-(29.5555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper2.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 6.33769 + (((tickAnim - 0) / 25) * (11.18222-(6.33769)));
            yy = 16.56062 + (((tickAnim - 0) / 25) * (21.48976-(16.56062)));
            zz = 1.65142 + (((tickAnim - 0) / 25) * (1.6578-(1.65142)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 11.18222 + (((tickAnim - 25) / 23) * (10.30798-(11.18222)));
            yy = 21.48976 + (((tickAnim - 25) / 23) * (11.55926-(21.48976)));
            zz = 1.6578 + (((tickAnim - 25) / 23) * (4.25481-(1.6578)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 10.30798 + (((tickAnim - 48) / 15) * (9.44114-(10.30798)));
            yy = 11.55926 + (((tickAnim - 48) / 15) * (6.89204-(11.55926)));
            zz = 4.25481 + (((tickAnim - 48) / 15) * (9.77074-(4.25481)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 9.44114 + (((tickAnim - 63) / 17) * (6.33769-(9.44114)));
            yy = 6.89204 + (((tickAnim - 63) / 17) * (16.56062-(6.89204)));
            zz = 9.77074 + (((tickAnim - 63) / 17) * (1.65142-(9.77074)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.425-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (1.2-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = -0.425 + (((tickAnim - 25) / 23) * (0-(-0.425)));
            yy = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            zz = 1.2 + (((tickAnim - 25) / 23) * (0-(1.2)));
        }
        else if (tickAnim >= 48 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 11) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightflipper3.rotationPointX = this.frontrightflipper3.rotationPointX + (float)(xx);
        this.frontrightflipper3.rotationPointY = this.frontrightflipper3.rotationPointY - (float)(yy);
        this.frontrightflipper3.rotationPointZ = this.frontrightflipper3.rotationPointZ + (float)(zz);

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCratochelone e = (EntityPrehistoricFloraCratochelone) entity;
        animator.update(entity);


    }
}
