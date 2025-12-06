package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMesodermochelys;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMesodermochelys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
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
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer frontrightflipper;
    private final AdvancedModelRenderer frontrightflipper2;
    private final AdvancedModelRenderer frontrightflipper3;
    private final AdvancedModelRenderer frontleftflipper;
    private final AdvancedModelRenderer frontleftflipper2;
    private final AdvancedModelRenderer frontleftflipper3;
    private final AdvancedModelRenderer backrightflipper;
    private final AdvancedModelRenderer backrightflipper2;
    private final AdvancedModelRenderer backrightflipper3;
    private final AdvancedModelRenderer backleftflipper;
    private final AdvancedModelRenderer backleftflipper2;
    private final AdvancedModelRenderer backleftflipper3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer carapaceright;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer carapaceleft;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer bellyshell;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;

    private ModelAnimator animator;

    public ModelMesodermochelys() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 17.125F, 0.0F);
        this.setRotateAngle(base, -0.2356F, 0.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 102, 56, -1.5F, -3.35F, 17.5F, 3, 2, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 86, 30, -3.0F, -2.95F, -11.5F, 6, 2, 2, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 68, 0, -3.0F, -5.7F, -1.5F, 6, 1, 10, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -5.7F, -1.5F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.288F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 68, 11, -4.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -5.7F, 8.5F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2574F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 59, -4.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -5.7F, 8.5F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.1222F, 0.5149F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 49, 0.0F, 0.0F, 0.0F, 11, 0, 10, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.0F, -5.7F, 4.5F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.5149F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 24, 0.0F, 0.0F, -6.0F, 11, 1, 10, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.0F, -5.7F, -1.5F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, -0.1222F, 0.5149F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 46, 0.0F, 0.0F, -10.0F, 11, 0, 10, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.0F, -5.7F, 8.5F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2443F, -0.1222F, -0.5149F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 49, -11.0F, 0.0F, 0.0F, 11, 0, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-3.0F, -5.7F, -1.5F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.1222F, -0.5149F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 46, -11.0F, 0.0F, -10.0F, 11, 0, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.0F, -5.7F, 4.5F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.5149F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 24, -11.0F, 0.0F, -6.0F, 11, 1, 10, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.55F, -9.5F);
        this.base.addChild(neck);
        this.setRotateAngle(neck, 0.3927F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 71, -4.0F, -2.25F, -4.0F, 8, 6, 6, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.25F, -3.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0873F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 29, 83, -3.0F, -2.0F, -5.0F, 6, 6, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 91, -2.5F, -1.4F, -3.75F, 5, 3, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 105, 51, -1.0F, 0.625F, -6.75F, 2, 1, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.625F, 0.6F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 101, -1.0F, -2.0F, 0.25F, 1, 3, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -0.4F, -6.225F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.5323F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 101, -0.9764F, 0.0F, -0.0346F, 1, 2, 3, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.5F, 0.6F, -3.725F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.5323F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 30, -2.0F, -1.0F, -2.95F, 2, 2, 3, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -0.4F, -6.225F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, -0.5323F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 101, -0.0236F, 0.0F, -0.0346F, 1, 2, 3, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, 0.6F, -3.725F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5323F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 102, 30, 0.0F, -1.0F, -2.95F, 2, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.7376F, -7.1877F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 76, 54, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0F, 1.2F, -5.0F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.8988F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 80, 49, -2.0F, -2.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5F, -1.5964F, -5.3469F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3665F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 102, 60, -3.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.675F, -0.9F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 95, -3.0F, -2.0F, -3.0F, 5, 2, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-2.625F, 0.6F, -4.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.1745F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 101, 0.0F, -2.0F, 0.25F, 1, 3, 4, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-1.4787F, -0.0674F, -4.7334F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.3927F, -0.5672F, 0.0F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 82, 22, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(1.4787F, -0.0674F, -4.7334F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.3927F, 0.5672F, 0.0F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 82, 22, -0.5F, -0.75F, -0.5F, 1, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-2.0F, 1.4F, -1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 56, 1.0F, 0.0F, -6.0F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 100, 7, 0.5F, 0.0F, -4.0F, 3, 1, 5, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 94, 0.0F, -2.0F, -2.5F, 4, 2, 5, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.5F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.5236F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 75, 44, -1.0F, -0.99F, 1.0F, 1, 1, 2, -0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(4.0F, 1.0F, -3.4F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 60, 101, -2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 88, 101, -2.025F, -0.35F, 0.0F, 2, 1, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.0F, 1.625F, -3.4F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.126F, 0.5247F, -0.0254F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 97, 101, -1.025F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.625F, -3.4F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.126F, -0.5247F, 0.0254F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 97, 101, 0.025F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.65F, -3.4F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.2182F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 88, 101, 0.025F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 60, 101, 0.0F, -1.65F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.5F, 1.0F, -6.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.5236F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 75, 44, 0.0F, -0.99F, 1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.0F, 1.2623F, -5.9892F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0218F, 0.0F, -3.1416F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 34, 51, -1.0F, -0.025F, -0.025F, 2, 1, 3, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(2.0F, 1.732F, -3.102F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0175F, 0.0F, -3.1416F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 29, 34, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.0F, 1.2623F, -5.9892F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1527F, 0.0F, -3.1416F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 51, -1.0F, -0.025F, -0.025F, 2, 1, 3, -0.02F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(6.4F, 3.25F, -6.1F);
        this.base.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.5236F, -0.8727F, 0.0F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 36, 59, -3.1233F, -1.5F, -8.6588F, 6, 3, 11, 0.0F, true));

        this.frontleftflipper2 = new AdvancedModelRenderer(this);
        this.frontleftflipper2.setRotationPoint(-3.0233F, -1.0F, -7.6588F);
        this.frontleftflipper.addChild(frontleftflipper2);
        this.setRotateAngle(frontleftflipper2, -0.048F, -0.6981F, 0.0F);
        this.frontleftflipper2.cubeList.add(new ModelBox(frontleftflipper2, 28, 73, -0.75F, 0.0F, -7.0F, 7, 2, 7, 0.0F, true));

        this.frontleftflipper3 = new AdvancedModelRenderer(this);
        this.frontleftflipper3.setRotationPoint(2.275F, 0.0F, -7.0F);
        this.frontleftflipper2.addChild(frontleftflipper3);
        this.setRotateAngle(frontleftflipper3, -0.3219F, -0.2122F, 0.1628F);
        this.frontleftflipper3.cubeList.add(new ModelBox(frontleftflipper3, 44, 35, -2.475F, 0.5F, -12.0F, 6, 1, 13, 0.0F, true));

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-6.4F, 3.25F, -6.1F);
        this.base.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.5236F, 0.8727F, 0.0F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 36, 59, -2.8767F, -1.5F, -8.6588F, 6, 3, 11, 0.0F, false));

        this.frontrightflipper2 = new AdvancedModelRenderer(this);
        this.frontrightflipper2.setRotationPoint(3.0233F, -1.0F, -7.6588F);
        this.frontrightflipper.addChild(frontrightflipper2);
        this.setRotateAngle(frontrightflipper2, -0.048F, 0.6981F, 0.0F);
        this.frontrightflipper2.cubeList.add(new ModelBox(frontrightflipper2, 28, 73, -6.25F, 0.0F, -7.0F, 7, 2, 7, 0.0F, false));

        this.frontrightflipper3 = new AdvancedModelRenderer(this);
        this.frontrightflipper3.setRotationPoint(-2.275F, 0.0F, -7.0F);
        this.frontrightflipper2.addChild(frontrightflipper3);
        this.setRotateAngle(frontrightflipper3, -0.3219F, 0.2122F, -0.1628F);
        this.frontrightflipper3.cubeList.add(new ModelBox(frontrightflipper3, 44, 35, -3.525F, 0.5F, -12.0F, 6, 1, 13, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(5.4F, 1.5F, 12.9F);
        this.base.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, 1.5708F, 0.3927F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 82, 35, -1.0F, -1.5F, -2.5F, 4, 4, 8, 0.01F, true));

        this.backleftflipper2 = new AdvancedModelRenderer(this);
        this.backleftflipper2.setRotationPoint(0.75F, 0.5F, 4.5F);
        this.backleftflipper.addChild(backleftflipper2);
        this.setRotateAngle(backleftflipper2, 0.4408F, -0.5963F, -0.0385F);
        this.backleftflipper2.cubeList.add(new ModelBox(backleftflipper2, 0, 83, -2.775F, -1.0F, -0.75F, 5, 2, 6, 0.0F, true));

        this.backleftflipper3 = new AdvancedModelRenderer(this);
        this.backleftflipper3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backleftflipper2.addChild(backleftflipper3);
        this.setRotateAngle(backleftflipper3, 0.0F, -0.2618F, 0.0F);
        this.backleftflipper3.cubeList.add(new ModelBox(backleftflipper3, 78, 80, -2.75F, -0.5F, 0.0F, 6, 1, 8, 0.0F, true));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-5.4F, 1.5F, 12.9F);
        this.base.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, -1.5708F, -0.3927F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 82, 35, -3.0F, -1.5F, -2.5F, 4, 4, 8, 0.01F, false));

        this.backrightflipper2 = new AdvancedModelRenderer(this);
        this.backrightflipper2.setRotationPoint(-0.75F, 0.5F, 4.5F);
        this.backrightflipper.addChild(backrightflipper2);
        this.setRotateAngle(backrightflipper2, 0.4408F, 0.5963F, 0.0385F);
        this.backrightflipper2.cubeList.add(new ModelBox(backrightflipper2, 0, 83, -2.225F, -1.0F, -0.75F, 5, 2, 6, 0.0F, false));

        this.backrightflipper3 = new AdvancedModelRenderer(this);
        this.backrightflipper3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backrightflipper2.addChild(backrightflipper3);
        this.setRotateAngle(backrightflipper3, 0.0F, 0.2618F, 0.0F);
        this.backrightflipper3.cubeList.add(new ModelBox(backrightflipper3, 78, 80, -3.25F, -0.5F, 0.0F, 6, 1, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.45F, 14.0F);
        this.base.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 86, 22, -3.0F, -1.25F, 0.0F, 6, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 78, 89, -2.0F, -1.25F, -1.0F, 4, 3, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.2662F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 56, 73, -1.0F, -1.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 100, 101, 0.0F, -0.5F, -1.0F, 1, 1, 4, 0.0F, false));

        this.carapaceright = new AdvancedModelRenderer(this);
        this.carapaceright.setRotationPoint(-0.5F, -1.5F, -0.5F);
        this.base.addChild(carapaceright);
        this.setRotateAngle(carapaceright, 0.0F, 0.0F, -0.2618F);
        this.carapaceright.cubeList.add(new ModelBox(carapaceright, 84, 47, -13.1F, -2.0F, -0.25F, 3, 2, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-4.55F, 0.0F, 18.35F);
        this.carapaceright.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, 1.1519F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 101, 0.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-8.275F, 0.0F, 15.1F);
        this.carapaceright.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.8465F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 72, 97, 0.0F, -2.0F, 0.0F, 3, 2, 5, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-11.425F, 0.0F, 11.35F);
        this.carapaceright.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.6981F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 100, 0, 0.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-13.1F, 0.0F, 6.75F);
        this.carapaceright.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.3491F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 98, 0.0F, -2.0F, 0.0F, 3, 2, 5, 0.01F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-11.6F, 0.0F, -5.0F);
        this.carapaceright.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 1.2654F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 36, 94, -5.0F, -2.0F, 0.0F, 5, 2, 4, 0.01F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-8.4F, 0.0F, -8.9F);
        this.carapaceright.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.8727F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 96, 89, -5.0F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-4.0F, 0.0F, -11.25F);
        this.carapaceright.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.48F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 54, 95, -5.0F, -2.0F, 0.0F, 5, 2, 4, 0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-2.0F, 0.0F, -11.0F);
        this.carapaceright.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.1745F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 88, 97, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.carapaceleft = new AdvancedModelRenderer(this);
        this.carapaceleft.setRotationPoint(0.5F, -1.5F, -0.5F);
        this.base.addChild(carapaceleft);
        this.setRotateAngle(carapaceleft, 0.0F, 0.0F, 0.2618F);
        this.carapaceleft.cubeList.add(new ModelBox(carapaceleft, 84, 47, 10.1F, -2.0F, -0.25F, 3, 2, 7, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(4.55F, 0.0F, 18.35F);
        this.carapaceleft.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -1.1519F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 16, 101, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(8.275F, 0.0F, 15.1F);
        this.carapaceleft.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, -0.8465F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 72, 97, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.01F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(11.425F, 0.0F, 11.35F);
        this.carapaceleft.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, -0.6981F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 100, 0, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(13.1F, 0.0F, 6.75F);
        this.carapaceleft.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.3491F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 98, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.01F, true));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(11.6F, 0.0F, -5.0F);
        this.carapaceleft.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -1.2654F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 36, 94, 0.0F, -2.0F, 0.0F, 5, 2, 4, 0.01F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(8.4F, 0.0F, -8.9F);
        this.carapaceleft.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, -0.8727F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 96, 89, 0.0F, -2.0F, 0.0F, 5, 2, 4, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(4.0F, 0.0F, -11.25F);
        this.carapaceleft.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, -0.48F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 54, 95, 0.0F, -2.0F, 0.0F, 5, 2, 4, 0.01F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(2.0F, 0.0F, -11.0F);
        this.carapaceleft.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.1745F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 88, 97, 0.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, true));

        this.bellyshell = new AdvancedModelRenderer(this);
        this.bellyshell.setRotationPoint(0.0F, 7.25F, 0.0F);
        this.base.addChild(bellyshell);
        this.setRotateAngle(bellyshell, 0.2182F, 0.0F, 0.0F);
        this.bellyshell.cubeList.add(new ModelBox(bellyshell, 0, 0, -8.0F, -6.0F, -6.0F, 16, 6, 18, 0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.bellyshell.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.2182F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 70, 70, -5.0F, -4.0F, 0.0F, 10, 4, 6, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.bellyshell.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -1.0472F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 56, 80, 6.0F, -6.0F, -4.0F, 2, 6, 9, 0.0F, true));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 24, 0.0F, -6.0F, -4.0F, 6, 6, 16, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.bellyshell.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0F, 1.0472F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 56, 80, -8.0F, -6.0F, -4.0F, 2, 6, 9, 0.0F, false));
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 24, -6.0F, -6.0F, -4.0F, 6, 6, 16, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.bellyshell.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.5236F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 56, -6.0F, -9.0F, -6.0F, 12, 9, 6, 0.01F, false));
        

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
        this.base.offsetY = -0.4F;
        this.base.offsetX = 0.0F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(120);
        this.base.rotateAngleX = (float)Math.toRadians(0);
        this.base.rotateAngleZ = (float)Math.toRadians(0);
        this.base.scaleChildren = true;
        float scaler = 0.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);
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

        EntityPrehistoricFloraMesodermochelys entityMesodermochelys = (EntityPrehistoricFloraMesodermochelys) e;

        if (entityMesodermochelys.getAnimation() == entityMesodermochelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};

        if (entityMesodermochelys.getAnimation() == entityMesodermochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityMesodermochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityMesodermochelys.getIsMoving()) {
                    if (entityMesodermochelys.getAnimation() != entityMesodermochelys.EAT_ANIMATION
                        && entityMesodermochelys.getAnimation() != entityMesodermochelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityMesodermochelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraMesodermochelys ee = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
            animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        } else if (ee.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 5.25 + (((tickAnim - 17) / 1) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 17) / 1) * (-0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 5.25 + (((tickAnim - 18) / 19) * (8.75-(5.25)));
            yy = -0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3 + (((tickAnim - 18) / 19) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3-(-0.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 8.75 + (((tickAnim - 37) / 1) * (8.75-(8.75)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3 + (((tickAnim - 37) / 1) * (0-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.3)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 8.75 + (((tickAnim - 38) / 6) * (-2.59227-(8.75)));
            yy = 0 + (((tickAnim - 38) / 6) * (-0.84816-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (-4.41951-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -2.59227 + (((tickAnim - 44) / 6) * (0-(-2.59227)));
            yy = -0.84816 + (((tickAnim - 44) / 6) * (0-(-0.84816)));
            zz = -4.41951 + (((tickAnim - 44) / 6) * (0-(-4.41951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 19) * (1.025-(0.525)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            yy = 1.025 + (((tickAnim - 37) / 7) * (-13.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*15-(1.025)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = -13.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*15 + (((tickAnim - 44) / 6) * (0-(-13.065+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*15)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 38) {
            xx = -7.5 + (((tickAnim - 18) / 20) * (-30.43646-(-7.5)));
            yy = 0 + (((tickAnim - 18) / 20) * (-1.70689-(0)));
            zz = 0 + (((tickAnim - 18) / 20) * (2.42115-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -30.43646 + (((tickAnim - 38) / 12) * (0-(-30.43646)));
            yy = -1.70689 + (((tickAnim - 38) / 12) * (0-(-1.70689)));
            zz = 2.42115 + (((tickAnim - 38) / 12) * (0-(2.42115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (-40.555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -40.555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100 + (((tickAnim - 37) / 7) * (-126.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(-40.555+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*100)));
            yy = 0 + (((tickAnim - 37) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 7) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -126.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 44) / 6) * (0-(-126.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 10) / 10) * (10-(8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 10 + (((tickAnim - 20) / 9) * (5.56-(10)));
            yy = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 5.56 + (((tickAnim - 29) / 8) * (8.06-(5.56)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 8.06 + (((tickAnim - 37) / 13) * (0-(8.06)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-8.15597-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-1.61134-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (5.3604-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -8.15597 + (((tickAnim - 17) / 1) * (-8.15597-(-8.15597)));
            yy = -1.61134 + (((tickAnim - 17) / 1) * (-0.7113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1-(-1.61134)));
            zz = 5.3604 + (((tickAnim - 17) / 1) * (5.3604-(5.3604)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = -8.15597 + (((tickAnim - 18) / 19) * (-8.15597-(-8.15597)));
            yy = -0.7113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1 + (((tickAnim - 18) / 19) * (-1.6863+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1-(-0.7113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1)));
            zz = 5.3604 + (((tickAnim - 18) / 19) * (5.3604-(5.3604)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -8.15597 + (((tickAnim - 37) / 1) * (-8.15597-(-8.15597)));
            yy = -1.6863+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1 + (((tickAnim - 37) / 1) * (-1.43634-(-1.6863+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1)));
            zz = 5.3604 + (((tickAnim - 37) / 1) * (5.3604-(5.3604)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -8.15597 + (((tickAnim - 38) / 6) * (12.92202-(-8.15597)));
            yy = -1.43634 + (((tickAnim - 38) / 6) * (-0.71817-(-1.43634)));
            zz = 5.3604 + (((tickAnim - 38) / 6) * (2.6802-(5.3604)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 12.92202 + (((tickAnim - 44) / 6) * (0-(12.92202)));
            yy = -0.71817 + (((tickAnim - 44) / 6) * (0-(-0.71817)));
            zz = 2.6802 + (((tickAnim - 44) / 6) * (0-(2.6802)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 38) {
            xx = -14.25 + (((tickAnim - 17) / 21) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 17) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 21) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -14.25 + (((tickAnim - 38) / 2) * (-4.91-(-14.25)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -4.91 + (((tickAnim - 40) / 4) * (0-(-4.91)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (-0.0442-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0.15747-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (-4.82735-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -0.0442 + (((tickAnim - 44) / 6) * (0-(-0.0442)));
            yy = 0.15747 + (((tickAnim - 44) / 6) * (0-(0.15747)));
            zz = -4.82735 + (((tickAnim - 44) / 6) * (0-(-4.82735)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 18) / 19) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1 + (((tickAnim - 18) / 19) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1)));
            zz = 0 + (((tickAnim - 18) / 19) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1 + (((tickAnim - 37) / 1) * (0-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-1)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (4.92229-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (3.78645-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (5.29811-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 4.92229 + (((tickAnim - 44) / 6) * (0-(4.92229)));
            yy = 3.78645 + (((tickAnim - 44) / 6) * (0-(3.78645)));
            zz = 5.29811 + (((tickAnim - 44) / 6) * (0-(5.29811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (-1.13909-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (1.83091-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (9.30935-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -1.13909 + (((tickAnim - 44) / 6) * (0-(-1.13909)));
            yy = 1.83091 + (((tickAnim - 44) / 6) * (0-(1.83091)));
            zz = 9.30935 + (((tickAnim - 44) / 6) * (0-(9.30935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (-12.58722-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (1.90035-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (7.67021-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -12.58722 + (((tickAnim - 44) / 6) * (0-(-12.58722)));
            yy = 1.90035 + (((tickAnim - 44) / 6) * (0-(1.90035)));
            zz = 7.67021 + (((tickAnim - 44) / 6) * (0-(7.67021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper2.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 17) / 21) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 17) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 21) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -12.5 + (((tickAnim - 38) / 6) * (319.6433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350-(-12.5)));
            yy = 0 + (((tickAnim - 38) / 6) * (-1.36237-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (6.86679-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 319.6433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350 + (((tickAnim - 44) / 6) * (0-(319.6433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350)));
            yy = -1.36237 + (((tickAnim - 44) / 6) * (0-(-1.36237)));
            zz = 6.86679 + (((tickAnim - 44) / 6) * (0-(6.86679)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 17) / 21) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 17) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 21) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -9.5 + (((tickAnim - 38) / 6) * (322.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350-(-9.5)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 322.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350 + (((tickAnim - 44) / 6) * (0-(322.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*30+50))*-350)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 17) / 21) * (23-(0)));
            yy = 0 + (((tickAnim - 17) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 21) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 23 + (((tickAnim - 38) / 5) * (-328.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(23)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = -328.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 43) / 1) * (-347.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350-(-328.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -347.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350 + (((tickAnim - 44) / 4) * (309.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350-(-347.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*350)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 309.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350 + (((tickAnim - 48) / 2) * (0-(309.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-350)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (-7-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = -6.75 + (((tickAnim - 38) / 6) * (-11.22727-(-6.75)));
            yy = 0 + (((tickAnim - 38) / 6) * (-3.10592-(0)));
            zz = -7 + (((tickAnim - 38) / 6) * (-10.79559-(-7)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -11.22727 + (((tickAnim - 44) / 6) * (0-(-11.22727)));
            yy = -3.10592 + (((tickAnim - 44) / 6) * (0-(-3.10592)));
            zz = -10.79559 + (((tickAnim - 44) / 6) * (0-(-10.79559)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper2.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (75.13177-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-11.35568-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (82.1556-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 75.13177 + (((tickAnim - 17) / 8) * (59.2149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250-(75.13177)));
            yy = -11.35568 + (((tickAnim - 17) / 8) * (-57.31625-(-11.35568)));
            zz = 82.1556 + (((tickAnim - 17) / 8) * (87.5799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250-(82.1556)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 59.2149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250 + (((tickAnim - 25) / 8) * (75.13177-(59.2149+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250)));
            yy = -57.31625 + (((tickAnim - 25) / 8) * (-11.35568-(-57.31625)));
            zz = 87.5799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250 + (((tickAnim - 25) / 8) * (82.1556-(87.5799+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 75.13177 + (((tickAnim - 33) / 7) * (16.38288-(75.13177)));
            yy = -11.35568 + (((tickAnim - 33) / 7) * (-38.91299-(-11.35568)));
            zz = 82.1556 + (((tickAnim - 33) / 7) * (31.35625-(82.1556)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 16.38288 + (((tickAnim - 40) / 5) * (40.69144-(16.38288)));
            yy = -38.91299 + (((tickAnim - 40) / 5) * (-19.45649-(-38.91299)));
            zz = 31.35625 + (((tickAnim - 40) / 5) * (15.67812-(31.35625)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 40.69144 + (((tickAnim - 45) / 5) * (0-(40.69144)));
            yy = -19.45649 + (((tickAnim - 45) / 5) * (0-(-19.45649)));
            zz = 15.67812 + (((tickAnim - 45) / 5) * (0-(15.67812)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-21.16264-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-3.75003-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (23.41862-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -21.16264 + (((tickAnim - 17) / 8) * (-31.87233-(-21.16264)));
            yy = -3.75003 + (((tickAnim - 17) / 8) * (6.06487-(-3.75003)));
            zz = 23.41862 + (((tickAnim - 17) / 8) * (32.82678-(23.41862)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -31.87233 + (((tickAnim - 25) / 8) * (-21.16264-(-31.87233)));
            yy = 6.06487 + (((tickAnim - 25) / 8) * (-3.75003-(6.06487)));
            zz = 32.82678 + (((tickAnim - 25) / 8) * (23.41862-(32.82678)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -21.16264 + (((tickAnim - 33) / 7) * (-31.87233-(-21.16264)));
            yy = -3.75003 + (((tickAnim - 33) / 7) * (6.06487-(-3.75003)));
            zz = 23.41862 + (((tickAnim - 33) / 7) * (32.82678-(23.41862)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -31.87233 + (((tickAnim - 40) / 5) * (-2.40549-(-31.87233)));
            yy = 6.06487 + (((tickAnim - 40) / 5) * (9.0379-(6.06487)));
            zz = 32.82678 + (((tickAnim - 40) / 5) * (-8.23894-(32.82678)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -2.40549 + (((tickAnim - 45) / 5) * (0-(-2.40549)));
            yy = 9.0379 + (((tickAnim - 45) / 5) * (0-(9.0379)));
            zz = -8.23894 + (((tickAnim - 45) / 5) * (0-(-8.23894)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (11.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (211.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-350-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 11.5 + (((tickAnim - 17) / 8) * (11.5-(11.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 211.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-350 + (((tickAnim - 25) / 8) * (0-(211.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-350)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 11.5 + (((tickAnim - 25) / 8) * (11.5-(11.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (26.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-350-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 11.5 + (((tickAnim - 33) / 7) * (11.5-(11.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 26.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-350 + (((tickAnim - 40) / 3) * (-26.5-(26.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*-350)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 11.5 + (((tickAnim - 40) / 3) * (0-(11.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -26.5 + (((tickAnim - 43) / 2) * (-20.25-(-26.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (5.75-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -20.25 + (((tickAnim - 45) / 3) * (14.375-(-20.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 5.75 + (((tickAnim - 45) / 3) * (2.875-(5.75)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 14.375 + (((tickAnim - 48) / 2) * (0-(14.375)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 2.875 + (((tickAnim - 48) / 2) * (0-(2.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(xx), backleftflipper3.rotateAngleY + (float) Math.toRadians(yy), backleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (1.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 1.4 + (((tickAnim - 25) / 8) * (0-(1.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0.375-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.85-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-0.775-(0)));
            yy = 0.375 + (((tickAnim - 40) / 3) * (0.25-(0.375)));
            zz = 0.85 + (((tickAnim - 40) / 3) * (0.22-(0.85)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.775 + (((tickAnim - 43) / 7) * (0-(-0.775)));
            yy = 0.25 + (((tickAnim - 43) / 7) * (0-(0.25)));
            zz = 0.22 + (((tickAnim - 43) / 7) * (0-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftflipper3.rotationPointX = this.backleftflipper3.rotationPointX + (float)(xx);
        this.backleftflipper3.rotationPointY = this.backleftflipper3.rotationPointY - (float)(yy);
        this.backleftflipper3.rotationPointZ = this.backleftflipper3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (16.38288-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (38.91299-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-31.35625-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 16.38288 + (((tickAnim - 16) / 1) * (-142.6171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(16.38288)));
            yy = 38.91299 + (((tickAnim - 16) / 1) * (38.91299-(38.91299)));
            zz = -31.35625 + (((tickAnim - 16) / 1) * (129.7438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(-31.35625)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -142.6171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 17) / 8) * (75.13177-(-142.6171+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 38.91299 + (((tickAnim - 17) / 8) * (11.35568-(38.91299)));
            zz = 129.7438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 17) / 8) * (-82.1556-(129.7438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 75.13177 + (((tickAnim - 25) / 8) * (97.7329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*100-(75.13177)));
            yy = 11.35568 + (((tickAnim - 25) / 8) * (38.91299-(11.35568)));
            zz = -82.1556 + (((tickAnim - 25) / 8) * (-283.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(-82.1556)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 97.7329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*100 + (((tickAnim - 33) / 7) * (75.13177-(97.7329+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*100)));
            yy = 38.91299 + (((tickAnim - 33) / 7) * (11.35568-(38.91299)));
            zz = -283.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 33) / 7) * (-82.1556-(-283.9062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 75.13177 + (((tickAnim - 40) / 5) * (56.06589-(75.13177)));
            yy = 11.35568 + (((tickAnim - 40) / 5) * (5.67784-(11.35568)));
            zz = -82.1556 + (((tickAnim - 40) / 5) * (-41.0778-(-82.1556)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 56.06589 + (((tickAnim - 45) / 5) * (0-(56.06589)));
            yy = 5.67784 + (((tickAnim - 45) / 5) * (0-(5.67784)));
            zz = -41.0778 + (((tickAnim - 45) / 5) * (0-(-41.0778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.97547-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-5.40924-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-4.01069-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.97547 + (((tickAnim - 8) / 9) * (-20.6546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-50-(-0.97547)));
            yy = -5.40924 + (((tickAnim - 8) / 9) * (10.54836-(-5.40924)));
            zz = -4.01069 + (((tickAnim - 8) / 9) * (-35.50608-(-4.01069)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -20.6546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-50 + (((tickAnim - 17) / 8) * (-93.5243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*50-(-20.6546+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-50)));
            yy = 10.54836 + (((tickAnim - 17) / 8) * (8.99555-(10.54836)));
            zz = -35.50608 + (((tickAnim - 17) / 8) * (-55.81392-(-35.50608)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -93.5243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*50 + (((tickAnim - 25) / 8) * (-33.47963-(-93.5243+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*50)));
            yy = 8.99555 + (((tickAnim - 25) / 8) * (10.54836-(8.99555)));
            zz = -55.81392 + (((tickAnim - 25) / 8) * (-35.50608-(-55.81392)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -33.47963 + (((tickAnim - 33) / 7) * (-21.16264-(-33.47963)));
            yy = 10.54836 + (((tickAnim - 33) / 7) * (3.75003-(10.54836)));
            zz = -35.50608 + (((tickAnim - 33) / 7) * (-23.41862-(-35.50608)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -21.16264 + (((tickAnim - 40) / 5) * (-15.21718-(-21.16264)));
            yy = 3.75003 + (((tickAnim - 40) / 5) * (0.95968-(3.75003)));
            zz = -23.41862 + (((tickAnim - 40) / 5) * (-5.65567-(-23.41862)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -15.21718 + (((tickAnim - 45) / 5) * (0-(-15.21718)));
            yy = 0.95968 + (((tickAnim - 45) / 5) * (0-(0.95968)));
            zz = -5.65567 + (((tickAnim - 45) / 5) * (0-(-5.65567)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backrightflipper2.rotationPointX = this.backrightflipper2.rotationPointX + (float)(0);
        this.backrightflipper2.rotationPointY = this.backrightflipper2.rotationPointY - (float)(0);
        this.backrightflipper2.rotationPointZ = this.backrightflipper2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.33795-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.9513-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (13.42729-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -0.33795 + (((tickAnim - 8) / 5) * (10.74576-(-0.33795)));
            yy = 0.9513 + (((tickAnim - 8) / 5) * (4.49957-(0.9513)));
            zz = 13.42729 + (((tickAnim - 8) / 5) * (17.20908-(13.42729)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 10.74576 + (((tickAnim - 13) / 4) * (-53.15214-(10.74576)));
            yy = 4.49957 + (((tickAnim - 13) / 4) * (-19.0596-(4.49957)));
            zz = 17.20908 + (((tickAnim - 13) / 4) * (-9.43389-(17.20908)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -53.15214 + (((tickAnim - 17) / 8) * (-274.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*350-(-53.15214)));
            yy = -19.0596 + (((tickAnim - 17) / 8) * (0-(-19.0596)));
            zz = -9.43389 + (((tickAnim - 17) / 8) * (-11.5-(-9.43389)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -274.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*350 + (((tickAnim - 25) / 8) * (475.52+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-550-(-274.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*350)));
            yy = 0 + (((tickAnim - 25) / 8) * (-9.40445-(0)));
            zz = -11.5 + (((tickAnim - 25) / 8) * (-3.10495-(-11.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 475.52+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-550 + (((tickAnim - 33) / 7) * (0-(475.52+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*-550)));
            yy = -9.40445 + (((tickAnim - 33) / 7) * (0-(-9.40445)));
            zz = -3.10495 + (((tickAnim - 33) / 7) * (-11.5-(-3.10495)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (4.75-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = -11.5 + (((tickAnim - 40) / 3) * (17.75-(-11.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 4.75 + (((tickAnim - 43) / 2) * (0-(4.75)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 17.75 + (((tickAnim - 43) / 2) * (0-(17.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(xx), backrightflipper3.rotateAngleY + (float) Math.toRadians(yy), backrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.925-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0.925 + (((tickAnim - 17) / 8) * (0-(0.925)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.95-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.375 + (((tickAnim - 33) / 7) * (0-(0.375)));
            zz = 0.95 + (((tickAnim - 33) / 7) * (0-(0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 4) * (0.645-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 44) / 1) * (0-(0)));
            yy = 0.645 + (((tickAnim - 44) / 1) * (0.325-(0.645)));
            zz = 0 + (((tickAnim - 44) / 1) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.325 + (((tickAnim - 45) / 5) * (0-(0.325)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightflipper3.rotationPointX = this.backrightflipper3.rotationPointX + (float)(xx);
        this.backrightflipper3.rotationPointY = this.backrightflipper3.rotationPointY - (float)(yy);
        this.backrightflipper3.rotationPointZ = this.backrightflipper3.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-16.79508-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.95817-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.02696-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -16.79508 + (((tickAnim - 3) / 4) * (-22.5-(-16.79508)));
            yy = -0.95817 + (((tickAnim - 3) / 4) * (0-(-0.95817)));
            zz = 10.02696 + (((tickAnim - 3) / 4) * (10-(10.02696)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 7) / 3) * (-12.15405-(-22.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.90017-(0)));
            zz = 10 + (((tickAnim - 7) / 3) * (19.31226-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -12.15405 + (((tickAnim - 10) / 3) * (-19.02495-(-12.15405)));
            yy = 0.90017 + (((tickAnim - 10) / 3) * (3.92815-(0.90017)));
            zz = 19.31226 + (((tickAnim - 10) / 3) * (13.85123-(19.31226)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -19.02495 + (((tickAnim - 13) / 7) * (0-(-19.02495)));
            yy = 3.92815 + (((tickAnim - 13) / 7) * (0-(3.92815)));
            zz = 13.85123 + (((tickAnim - 13) / 7) * (0-(13.85123)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 5) * (-1-(-0.25)));
            zz = -1 + (((tickAnim - 8) / 5) * (1.31-(-1)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 7) * (0-(-1)));
            zz = 1.31 + (((tickAnim - 13) / 7) * (0-(1.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-6.82854-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.73281-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (14.70644-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -6.82854 + (((tickAnim - 7) / 6) * (-5.60899-(-6.82854)));
            yy = -0.73281 + (((tickAnim - 7) / 6) * (-6.60504-(-0.73281)));
            zz = 14.70644 + (((tickAnim - 7) / 6) * (4.95683-(14.70644)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -5.60899 + (((tickAnim - 13) / 7) * (0-(-5.60899)));
            yy = -6.60504 + (((tickAnim - 13) / 7) * (0-(-6.60504)));
            zz = 4.95683 + (((tickAnim - 13) / 7) * (0-(4.95683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (3.75-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 3.75 + (((tickAnim - 7) / 3) * (0-(3.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (13.33-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 13.33 + (((tickAnim - 13) / 7) * (0-(13.33)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 42.5 + (((tickAnim - 7) / 3) * (0-(42.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 8) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 8) * (1-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (0.4-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 0.4 + (((tickAnim - 10) / 10) * (1-(0.4)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
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
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 8) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 8) / 2) * (0.4-(1)));
            zz = 1 + (((tickAnim - 8) / 2) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            yy = 0.4 + (((tickAnim - 10) / 10) * (1-(0.4)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(7.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*5), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), base.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*0.5);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*7), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*1), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*5), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), head.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+180))*1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*1));
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(-23.6376+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20), frontleftflipper.rotateAngleY + (float) Math.toRadians(-22.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*20), frontleftflipper.rotateAngleZ + (float) Math.toRadians(5.1144-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*10));
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*10), frontleftflipper2.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*20), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5));
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*3))*30), frontleftflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), backleftflipper.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), backleftflipper.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(-21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), backleftflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), backleftflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), tail.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), tail2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1), tail3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1));
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(-23.6376+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*20), frontrightflipper.rotateAngleY + (float) Math.toRadians(22.9739+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*-20), frontrightflipper.rotateAngleZ + (float) Math.toRadians(5.1144-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*-10));
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*10), frontrightflipper2.rotateAngleY + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*-20), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-10));
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*3))*30), frontrightflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-20), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), backrightflipper.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), backrightflipper.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(-21.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), backrightflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), backrightflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -1.25 + (((tickAnim - 0) / 33) * (-5.25-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5.25 + (((tickAnim - 33) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (2-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 2 + (((tickAnim - 45) / 6) * (0-(2)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 51) / 29) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = -0.8 + (((tickAnim - 0) / 33) * (0.9-(-0.8)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.9 + (((tickAnim - 33) / 7) * (-0.8-(0.9)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -0.8 + (((tickAnim - 40) / 40) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.base.rotationPointX = this.base.rotationPointX + (float)(xx);
        this.base.rotationPointY = this.base.rotationPointY - (float)(yy);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -5 + (((tickAnim - 20) / 12) * (3.47-(-5)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 80) {
            xx = 3.47 + (((tickAnim - 32) / 48) * (0-(3.47)));
            yy = 0 + (((tickAnim - 32) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 48) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 10 + (((tickAnim - 20) / 24) * (-5-(10)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 44) / 36) * (0-(-5)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 5 + (((tickAnim - 20) / 24) * (-7.5-(5)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 24) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -7.5 + (((tickAnim - 44) / 36) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.98903 + (((tickAnim - 0) / 6) * (16.70537-(7.98903)));
            yy = 4.98966 + (((tickAnim - 0) / 6) * (-1.88365-(4.98966)));
            zz = 12.86222 + (((tickAnim - 0) / 6) * (-15.44049-(12.86222)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 16.70537 + (((tickAnim - 6) / 6) * (41.92149-(16.70537)));
            yy = -1.88365 + (((tickAnim - 6) / 6) * (-8.75689-(-1.88365)));
            zz = -15.44049 + (((tickAnim - 6) / 6) * (-43.74287-(-15.44049)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 41.92149 + (((tickAnim - 12) / 18) * (129.63-(41.92149)));
            yy = -8.75689 + (((tickAnim - 12) / 18) * (-11.91-(-8.75689)));
            zz = -43.74287 + (((tickAnim - 12) / 18) * (-117.51-(-43.74287)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 129.63 + (((tickAnim - 30) / 7) * (125.26918-(129.63)));
            yy = -11.91 + (((tickAnim - 30) / 7) * (-6.46287-(-11.91)));
            zz = -117.51 + (((tickAnim - 30) / 7) * (-119.48057-(-117.51)));
        }
        else if (tickAnim >= 37 && tickAnim < 45) {
            xx = 125.26918 + (((tickAnim - 37) / 8) * (115.81798-(125.26918)));
            yy = -6.46287 + (((tickAnim - 37) / 8) * (0.34616-(-6.46287)));
            zz = -119.48057 + (((tickAnim - 37) / 8) * (-121.94382-(-119.48057)));
        }
        else if (tickAnim >= 45 && tickAnim < 59) {
            xx = 115.81798 + (((tickAnim - 45) / 14) * (-3.0612-(115.81798)));
            yy = 0.34616 + (((tickAnim - 45) / 14) * (-0.79831-(0.34616)));
            zz = -121.94382 + (((tickAnim - 45) / 14) * (-34.69187-(-121.94382)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -3.0612 + (((tickAnim - 59) / 5) * (-10.69303-(-3.0612)));
            yy = -0.79831 + (((tickAnim - 59) / 5) * (2.85897-(-0.79831)));
            zz = -34.69187 + (((tickAnim - 59) / 5) * (-3.66317-(-34.69187)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = -10.69303 + (((tickAnim - 64) / 4) * (-5.64656-(-10.69303)));
            yy = 2.85897 + (((tickAnim - 64) / 4) * (5.47351-(2.85897)));
            zz = -3.66317 + (((tickAnim - 64) / 4) * (5.31799-(-3.66317)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -5.64656 + (((tickAnim - 68) / 3) * (-5.36848-(-5.64656)));
            yy = 5.47351 + (((tickAnim - 68) / 3) * (7.04228-(5.47351)));
            zz = 5.31799 + (((tickAnim - 68) / 3) * (10.70683-(5.31799)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -5.36848 + (((tickAnim - 71) / 9) * (7.98903-(-5.36848)));
            yy = 7.04228 + (((tickAnim - 71) / 9) * (4.98966-(7.04228)));
            zz = 10.70683 + (((tickAnim - 71) / 9) * (12.86222-(10.70683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28.99351 + (((tickAnim - 0) / 6) * (-15.78965-(-28.99351)));
            yy = 24.78879 + (((tickAnim - 0) / 6) * (36.28635-(24.78879)));
            zz = -8.79945 + (((tickAnim - 0) / 6) * (-0.45362-(-8.79945)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -15.78965 + (((tickAnim - 6) / 6) * (-18.72566-(-15.78965)));
            yy = 36.28635 + (((tickAnim - 6) / 6) * (45.90653-(36.28635)));
            zz = -0.45362 + (((tickAnim - 6) / 6) * (4.62236-(-0.45362)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = -18.72566 + (((tickAnim - 12) / 12) * (-33.10993-(-18.72566)));
            yy = 45.90653 + (((tickAnim - 12) / 12) * (45.37134-(45.90653)));
            zz = 4.62236 + (((tickAnim - 12) / 12) * (14.97391-(4.62236)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -33.10993 + (((tickAnim - 24) / 6) * (-41.06133-(-33.10993)));
            yy = 45.37134 + (((tickAnim - 24) / 6) * (38.61947-(45.37134)));
            zz = 14.97391 + (((tickAnim - 24) / 6) * (19.43621-(14.97391)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -41.06133 + (((tickAnim - 30) / 9) * (-24.89195-(-41.06133)));
            yy = 38.61947 + (((tickAnim - 30) / 9) * (9.93226-(38.61947)));
            zz = 19.43621 + (((tickAnim - 30) / 9) * (24.97874-(19.43621)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -24.89195 + (((tickAnim - 39) / 6) * (-9.79752-(-24.89195)));
            yy = 9.93226 + (((tickAnim - 39) / 6) * (14.55551-(9.93226)));
            zz = 24.97874 + (((tickAnim - 39) / 6) * (18.59694-(24.97874)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = -9.79752 + (((tickAnim - 45) / 7) * (13.88501-(-9.79752)));
            yy = 14.55551 + (((tickAnim - 45) / 7) * (5.3565-(14.55551)));
            zz = 18.59694 + (((tickAnim - 45) / 7) * (-5.04153-(18.59694)));
        }
        else if (tickAnim >= 52 && tickAnim < 68) {
            xx = 13.88501 + (((tickAnim - 52) / 16) * (-2.87661-(13.88501)));
            yy = 5.3565 + (((tickAnim - 52) / 16) * (26.63833-(5.3565)));
            zz = -5.04153 + (((tickAnim - 52) / 16) * (1.21118-(-5.04153)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -2.87661 + (((tickAnim - 68) / 3) * (-10.86289-(-2.87661)));
            yy = 26.63833 + (((tickAnim - 68) / 3) * (24.39971-(26.63833)));
            zz = 1.21118 + (((tickAnim - 68) / 3) * (-3.55623-(1.21118)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -10.86289 + (((tickAnim - 71) / 9) * (-28.99351-(-10.86289)));
            yy = 24.39971 + (((tickAnim - 71) / 9) * (24.78879-(24.39971)));
            zz = -3.55623 + (((tickAnim - 71) / 9) * (-8.79945-(-3.55623)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper2.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 0) / 30) * (20.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = -11 + (((tickAnim - 0) / 30) * (-11-(-11)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 20.5 + (((tickAnim - 30) / 15) * (14.75-(20.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = -11 + (((tickAnim - 30) / 15) * (0-(-11)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 14.75 + (((tickAnim - 45) / 7) * (38.8285-(14.75)));
            yy = 0 + (((tickAnim - 45) / 7) * (0.6102-(0)));
            zz = 0 + (((tickAnim - 45) / 7) * (-12.5026-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 38.8285 + (((tickAnim - 52) / 10) * (-0.5-(38.8285)));
            yy = 0.6102 + (((tickAnim - 52) / 10) * (0-(0.6102)));
            zz = -12.5026 + (((tickAnim - 52) / 10) * (0-(-12.5026)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -0.5 + (((tickAnim - 62) / 6) * (4.74224-(-0.5)));
            yy = 0 + (((tickAnim - 62) / 6) * (-0.53945-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (-16.12117-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 4.74224 + (((tickAnim - 68) / 3) * (12.23016-(4.74224)));
            yy = -0.53945 + (((tickAnim - 68) / 3) * (-0.47847-(-0.53945)));
            zz = -16.12117 + (((tickAnim - 68) / 3) * (-13.17601-(-16.12117)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 12.23016 + (((tickAnim - 71) / 9) * (13.5-(12.23016)));
            yy = -0.47847 + (((tickAnim - 71) / 9) * (0-(-0.47847)));
            zz = -13.17601 + (((tickAnim - 71) / 9) * (-11-(-13.17601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 8.5 + (((tickAnim - 0) / 40) * (0-(8.5)));
            yy = -49 + (((tickAnim - 0) / 40) * (-51-(-49)));
            zz = -20.5 + (((tickAnim - 0) / 40) * (-20.5-(-20.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (8.5-(0)));
            yy = -51 + (((tickAnim - 40) / 40) * (-49-(-51)));
            zz = -20.5 + (((tickAnim - 40) / 40) * (-20.5-(-20.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -24.79493 + (((tickAnim - 0) / 20) * (-18.72298-(-24.79493)));
            yy = 20.95938 + (((tickAnim - 0) / 20) * (21.32873-(20.95938)));
            zz = 10.0498 + (((tickAnim - 0) / 20) * (7.51195-(10.0498)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -18.72298 + (((tickAnim - 20) / 20) * (-15.91919-(-18.72298)));
            yy = 21.32873 + (((tickAnim - 20) / 20) * (21.72236-(21.32873)));
            zz = 7.51195 + (((tickAnim - 20) / 20) * (4.98179-(7.51195)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15.91919 + (((tickAnim - 40) / 5) * (-19.91919-(-15.91919)));
            yy = 21.72236 + (((tickAnim - 40) / 5) * (21.72236-(21.72236)));
            zz = 4.98179 + (((tickAnim - 40) / 5) * (4.98179-(4.98179)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -19.91919 + (((tickAnim - 45) / 6) * (-15.91919-(-19.91919)));
            yy = 21.72236 + (((tickAnim - 45) / 6) * (21.72236-(21.72236)));
            zz = 4.98179 + (((tickAnim - 45) / 6) * (4.98179-(4.98179)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = -15.91919 + (((tickAnim - 51) / 29) * (-24.79493-(-15.91919)));
            yy = 21.72236 + (((tickAnim - 51) / 29) * (20.95938-(21.72236)));
            zz = 4.98179 + (((tickAnim - 51) / 29) * (10.0498-(4.98179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 8.7 + (((tickAnim - 0) / 36) * (7.58-(8.7)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 7.58 + (((tickAnim - 36) / 3) * (4.45-(7.58)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 4.45 + (((tickAnim - 39) / 6) * (1.25-(4.45)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 1.25 + (((tickAnim - 45) / 6) * (7.41-(1.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 7.41 + (((tickAnim - 51) / 29) * (8.7-(7.41)));
            yy = 0 + (((tickAnim - 51) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -5.5 + (((tickAnim - 0) / 34) * (-3.25-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = -3.25 + (((tickAnim - 34) / 5) * (-0.85-(-3.25)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -0.85 + (((tickAnim - 39) / 4) * (-4.5-(-0.85)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -4.5 + (((tickAnim - 43) / 5) * (-10-(-4.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = -10 + (((tickAnim - 48) / 32) * (-5.5-(-10)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (6.41762-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.48484-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (4.11535-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 6.41762 + (((tickAnim - 33) / 12) * (1.03018-(6.41762)));
            yy = -0.48484 + (((tickAnim - 33) / 12) * (-0.09968-(-0.48484)));
            zz = 4.11535 + (((tickAnim - 33) / 12) * (1.80922-(4.11535)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 1.03018 + (((tickAnim - 45) / 6) * (-2.6336-(1.03018)));
            yy = -0.09968 + (((tickAnim - 45) / 6) * (0.05037-(-0.09968)));
            zz = 1.80922 + (((tickAnim - 45) / 6) * (3.90391-(1.80922)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = -2.6336 + (((tickAnim - 51) / 29) * (0-(-2.6336)));
            yy = 0.05037 + (((tickAnim - 51) / 29) * (0-(0.05037)));
            zz = 3.90391 + (((tickAnim - 51) / 29) * (0-(3.90391)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(xx), backleftflipper3.rotateAngleY + (float) Math.toRadians(yy), backleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 7.98903 + (((tickAnim - 0) / 6) * (16.70537-(7.98903)));
            yy = -4.98966 + (((tickAnim - 0) / 6) * (1.88365-(-4.98966)));
            zz = -12.86222 + (((tickAnim - 0) / 6) * (15.44049-(-12.86222)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 16.70537 + (((tickAnim - 6) / 6) * (41.92149-(16.70537)));
            yy = 1.88365 + (((tickAnim - 6) / 6) * (8.75689-(1.88365)));
            zz = 15.44049 + (((tickAnim - 6) / 6) * (43.74287-(15.44049)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 41.92149 + (((tickAnim - 12) / 18) * (129.63-(41.92149)));
            yy = 8.75689 + (((tickAnim - 12) / 18) * (11.91-(8.75689)));
            zz = 43.74287 + (((tickAnim - 12) / 18) * (117.51-(43.74287)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 129.63 + (((tickAnim - 30) / 7) * (120.01918-(129.63)));
            yy = 11.91 + (((tickAnim - 30) / 7) * (6.46287-(11.91)));
            zz = 117.51 + (((tickAnim - 30) / 7) * (119.48057-(117.51)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 120.01918 + (((tickAnim - 37) / 2) * (131.10524-(120.01918)));
            yy = 6.46287 + (((tickAnim - 37) / 2) * (10.23338-(6.46287)));
            zz = 119.48057 + (((tickAnim - 37) / 2) * (138.17719-(119.48057)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 131.10524 + (((tickAnim - 39) / 6) * (115.81798-(131.10524)));
            yy = 10.23338 + (((tickAnim - 39) / 6) * (-0.34616-(10.23338)));
            zz = 138.17719 + (((tickAnim - 39) / 6) * (121.94382-(138.17719)));
        }
        else if (tickAnim >= 45 && tickAnim < 59) {
            xx = 115.81798 + (((tickAnim - 45) / 14) * (-3.0612-(115.81798)));
            yy = -0.34616 + (((tickAnim - 45) / 14) * (-0.79831-(-0.34616)));
            zz = 121.94382 + (((tickAnim - 45) / 14) * (34.69187-(121.94382)));
        }
        else if (tickAnim >= 59 && tickAnim < 64) {
            xx = -3.0612 + (((tickAnim - 59) / 5) * (-10.69303-(-3.0612)));
            yy = -0.79831 + (((tickAnim - 59) / 5) * (-2.85897-(-0.79831)));
            zz = 34.69187 + (((tickAnim - 59) / 5) * (3.66317-(34.69187)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = -10.69303 + (((tickAnim - 64) / 4) * (-5.64656-(-10.69303)));
            yy = -2.85897 + (((tickAnim - 64) / 4) * (-5.47351-(-2.85897)));
            zz = 3.66317 + (((tickAnim - 64) / 4) * (-5.31799-(3.66317)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -5.64656 + (((tickAnim - 68) / 3) * (-5.36848-(-5.64656)));
            yy = -5.47351 + (((tickAnim - 68) / 3) * (-7.04228-(-5.47351)));
            zz = -5.31799 + (((tickAnim - 68) / 3) * (-10.70683-(-5.31799)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -5.36848 + (((tickAnim - 71) / 9) * (7.98903-(-5.36848)));
            yy = -7.04228 + (((tickAnim - 71) / 9) * (-4.98966-(-7.04228)));
            zz = -10.70683 + (((tickAnim - 71) / 9) * (-12.86222-(-10.70683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -28.99351 + (((tickAnim - 0) / 6) * (-15.78965-(-28.99351)));
            yy = -24.78879 + (((tickAnim - 0) / 6) * (-36.28635-(-24.78879)));
            zz = 8.79945 + (((tickAnim - 0) / 6) * (0.45362-(8.79945)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -15.78965 + (((tickAnim - 6) / 6) * (-18.72566-(-15.78965)));
            yy = -36.28635 + (((tickAnim - 6) / 6) * (-45.90653-(-36.28635)));
            zz = 0.45362 + (((tickAnim - 6) / 6) * (-4.62236-(0.45362)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = -18.72566 + (((tickAnim - 12) / 12) * (-33.10993-(-18.72566)));
            yy = -45.90653 + (((tickAnim - 12) / 12) * (-45.37134-(-45.90653)));
            zz = -4.62236 + (((tickAnim - 12) / 12) * (-14.97391-(-4.62236)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -33.10993 + (((tickAnim - 24) / 6) * (-41.06133-(-33.10993)));
            yy = -45.37134 + (((tickAnim - 24) / 6) * (-38.61947-(-45.37134)));
            zz = -14.97391 + (((tickAnim - 24) / 6) * (-19.43621-(-14.97391)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = -41.06133 + (((tickAnim - 30) / 9) * (-23.14195-(-41.06133)));
            yy = -38.61947 + (((tickAnim - 30) / 9) * (-9.93226-(-38.61947)));
            zz = -19.43621 + (((tickAnim - 30) / 9) * (-24.97874-(-19.43621)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -23.14195 + (((tickAnim - 39) / 6) * (-24.15341-(-23.14195)));
            yy = -9.93226 + (((tickAnim - 39) / 6) * (-14.52224-(-9.93226)));
            zz = -24.97874 + (((tickAnim - 39) / 6) * (-37.82719-(-24.97874)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = -24.15341 + (((tickAnim - 45) / 7) * (8.38111-(-24.15341)));
            yy = -14.52224 + (((tickAnim - 45) / 7) * (-9.79505-(-14.52224)));
            zz = -37.82719 + (((tickAnim - 45) / 7) * (-5.14847-(-37.82719)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 8.38111 + (((tickAnim - 52) / 9) * (7.06104-(8.38111)));
            yy = -9.79505 + (((tickAnim - 52) / 9) * (-8.79064-(-9.79505)));
            zz = -5.14847 + (((tickAnim - 52) / 9) * (5.00445-(-5.14847)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 7.06104 + (((tickAnim - 61) / 7) * (-2.87661-(7.06104)));
            yy = -8.79064 + (((tickAnim - 61) / 7) * (-26.63833-(-8.79064)));
            zz = 5.00445 + (((tickAnim - 61) / 7) * (-1.21118-(5.00445)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -2.87661 + (((tickAnim - 68) / 3) * (-10.86289-(-2.87661)));
            yy = -26.63833 + (((tickAnim - 68) / 3) * (-24.39971-(-26.63833)));
            zz = -1.21118 + (((tickAnim - 68) / 3) * (3.55623-(-1.21118)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -10.86289 + (((tickAnim - 71) / 9) * (-28.99351-(-10.86289)));
            yy = -24.39971 + (((tickAnim - 71) / 9) * (-24.78879-(-24.39971)));
            zz = 3.55623 + (((tickAnim - 71) / 9) * (8.79945-(3.55623)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper2.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 0) / 30) * (20.5-(13.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 11 + (((tickAnim - 0) / 30) * (11-(11)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 20.5 + (((tickAnim - 30) / 7) * (23.83194-(20.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0.76989-(0)));
            zz = 11 + (((tickAnim - 30) / 7) * (8.22928-(11)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 23.83194 + (((tickAnim - 37) / 2) * (15.62602-(23.83194)));
            yy = 0.76989 + (((tickAnim - 37) / 2) * (0.84996-(0.76989)));
            zz = 8.22928 + (((tickAnim - 37) / 2) * (12.00893-(8.22928)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 15.62602 + (((tickAnim - 39) / 6) * (20.0106-(15.62602)));
            yy = 0.84996 + (((tickAnim - 39) / 6) * (0.50715-(0.84996)));
            zz = 12.00893 + (((tickAnim - 39) / 6) * (12.79002-(12.00893)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 20.0106 + (((tickAnim - 45) / 7) * (40.80363-(20.0106)));
            yy = 0.50715 + (((tickAnim - 45) / 7) * (14.59149-(0.50715)));
            zz = 12.79002 + (((tickAnim - 45) / 7) * (18.29649-(12.79002)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 40.80363 + (((tickAnim - 52) / 10) * (-0.5-(40.80363)));
            yy = 14.59149 + (((tickAnim - 52) / 10) * (0-(14.59149)));
            zz = 18.29649 + (((tickAnim - 52) / 10) * (0-(18.29649)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -0.5 + (((tickAnim - 62) / 6) * (4.74224-(-0.5)));
            yy = 0 + (((tickAnim - 62) / 6) * (0.53945-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (16.12117-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 4.74224 + (((tickAnim - 68) / 3) * (12.23016-(4.74224)));
            yy = 0.53945 + (((tickAnim - 68) / 3) * (0.47847-(0.53945)));
            zz = 16.12117 + (((tickAnim - 68) / 3) * (13.17601-(16.12117)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 12.23016 + (((tickAnim - 71) / 9) * (13.5-(12.23016)));
            yy = 0.47847 + (((tickAnim - 71) / 9) * (0-(0.47847)));
            zz = 13.17601 + (((tickAnim - 71) / 9) * (11-(13.17601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 8.5 + (((tickAnim - 0) / 40) * (-0.73094-(8.5)));
            yy = 49 + (((tickAnim - 0) / 40) * (50.74985-(49)));
            zz = 20.5 + (((tickAnim - 0) / 40) * (20.47042-(20.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -0.73094 + (((tickAnim - 40) / 40) * (8.5-(-0.73094)));
            yy = 50.74985 + (((tickAnim - 40) / 40) * (49-(50.74985)));
            zz = 20.47042 + (((tickAnim - 40) / 40) * (20.5-(20.47042)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -24.79493 + (((tickAnim - 0) / 20) * (-22.00287-(-24.79493)));
            yy = -20.95938 + (((tickAnim - 0) / 20) * (-21.22928-(-20.95938)));
            zz = -10.0498 + (((tickAnim - 0) / 20) * (-12.12717-(-10.0498)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -22.00287 + (((tickAnim - 20) / 20) * (-15.2869-(-22.00287)));
            yy = -21.22928 + (((tickAnim - 20) / 20) * (-22.31371-(-21.22928)));
            zz = -12.12717 + (((tickAnim - 20) / 20) * (-5.30555-(-12.12717)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15.2869 + (((tickAnim - 40) / 5) * (-19.91919-(-15.2869)));
            yy = -22.31371 + (((tickAnim - 40) / 5) * (-21.72236-(-22.31371)));
            zz = -5.30555 + (((tickAnim - 40) / 5) * (-4.98179-(-5.30555)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -19.91919 + (((tickAnim - 45) / 6) * (-15.91919-(-19.91919)));
            yy = -21.72236 + (((tickAnim - 45) / 6) * (-21.72236-(-21.72236)));
            zz = -4.98179 + (((tickAnim - 45) / 6) * (-4.98179-(-4.98179)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = -15.91919 + (((tickAnim - 51) / 29) * (-24.79493-(-15.91919)));
            yy = -21.72236 + (((tickAnim - 51) / 29) * (-20.95938-(-21.72236)));
            zz = -4.98179 + (((tickAnim - 51) / 29) * (-10.0498-(-4.98179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (6.41762-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.48484-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (4.11535-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = 6.41762 + (((tickAnim - 33) / 12) * (1.03018-(6.41762)));
            yy = -0.48484 + (((tickAnim - 33) / 12) * (-0.09968-(-0.48484)));
            zz = 4.11535 + (((tickAnim - 33) / 12) * (1.80922-(4.11535)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 1.03018 + (((tickAnim - 45) / 6) * (1.57887-(1.03018)));
            yy = -0.09968 + (((tickAnim - 45) / 6) * (-0.36545-(-0.09968)));
            zz = 1.80922 + (((tickAnim - 45) / 6) * (-3.06612-(1.80922)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 1.57887 + (((tickAnim - 51) / 29) * (0-(1.57887)));
            yy = -0.36545 + (((tickAnim - 51) / 29) * (0-(-0.36545)));
            zz = -3.06612 + (((tickAnim - 51) / 29) * (0-(-3.06612)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(xx), backrightflipper3.rotateAngleY + (float) Math.toRadians(yy), backrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));

    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMesodermochelys e = (EntityPrehistoricFloraMesodermochelys) entity;
        animator.update(entity);


    }
}
