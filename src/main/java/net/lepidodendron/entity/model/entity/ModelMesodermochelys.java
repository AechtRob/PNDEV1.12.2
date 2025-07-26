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
        this.base.setRotationPoint(0.0F, 16.25F, 0.0F);
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

        this.frontrightflipper = new AdvancedModelRenderer(this);
        this.frontrightflipper.setRotationPoint(-6.4F, 3.25F, -6.1F);
        this.base.addChild(frontrightflipper);
        this.setRotateAngle(frontrightflipper, 0.5236F, 0.8727F, 0.0F);
        this.frontrightflipper.cubeList.add(new ModelBox(frontrightflipper, 36, 59, -2.8767F, -1.5F, -8.6588F, 6, 3, 11, 0.0F, false));

        this.frontrightflipper2 = new AdvancedModelRenderer(this);
        this.frontrightflipper2.setRotationPoint(3.0233F, -1.0F, -7.6588F);
        this.frontrightflipper.addChild(frontrightflipper2);
        this.setRotateAngle(frontrightflipper2, 0.0F, 0.6981F, 0.0F);
        this.frontrightflipper2.cubeList.add(new ModelBox(frontrightflipper2, 28, 73, -6.25F, 0.0F, -7.0F, 7, 2, 7, 0.0F, false));

        this.frontrightflipper3 = new AdvancedModelRenderer(this);
        this.frontrightflipper3.setRotationPoint(-2.275F, 0.0F, -7.0F);
        this.frontrightflipper2.addChild(frontrightflipper3);
        this.setRotateAngle(frontrightflipper3, 0.0F, 0.2618F, 0.0F);
        this.frontrightflipper3.cubeList.add(new ModelBox(frontrightflipper3, 44, 35, -3.525F, 0.5F, -12.0F, 6, 1, 13, 0.0F, false));

        this.frontleftflipper = new AdvancedModelRenderer(this);
        this.frontleftflipper.setRotationPoint(6.4F, 3.25F, -6.1F);
        this.base.addChild(frontleftflipper);
        this.setRotateAngle(frontleftflipper, 0.5236F, -0.8727F, 0.0F);
        this.frontleftflipper.cubeList.add(new ModelBox(frontleftflipper, 36, 59, -3.1233F, -1.5F, -8.6588F, 6, 3, 11, 0.0F, true));

        this.frontleftflipper2 = new AdvancedModelRenderer(this);
        this.frontleftflipper2.setRotationPoint(-3.0233F, -1.0F, -7.6588F);
        this.frontleftflipper.addChild(frontleftflipper2);
        this.setRotateAngle(frontleftflipper2, 0.0F, -0.6981F, 0.0F);
        this.frontleftflipper2.cubeList.add(new ModelBox(frontleftflipper2, 28, 73, -0.75F, 0.0F, -7.0F, 7, 2, 7, 0.0F, true));

        this.frontleftflipper3 = new AdvancedModelRenderer(this);
        this.frontleftflipper3.setRotationPoint(2.275F, 0.0F, -7.0F);
        this.frontleftflipper2.addChild(frontleftflipper3);
        this.setRotateAngle(frontleftflipper3, 0.0F, -0.2618F, 0.0F);
        this.frontleftflipper3.cubeList.add(new ModelBox(frontleftflipper3, 44, 35, -2.475F, 0.5F, -12.0F, 6, 1, 13, 0.0F, true));

        this.backrightflipper = new AdvancedModelRenderer(this);
        this.backrightflipper.setRotationPoint(-5.4F, 1.5F, 12.9F);
        this.base.addChild(backrightflipper);
        this.setRotateAngle(backrightflipper, 0.0F, -1.5708F, -0.3927F);
        this.backrightflipper.cubeList.add(new ModelBox(backrightflipper, 82, 35, -3.0F, -1.5F, -2.5F, 4, 4, 8, 0.01F, false));

        this.backrightflipper2 = new AdvancedModelRenderer(this);
        this.backrightflipper2.setRotationPoint(-0.75F, 0.5F, 4.5F);
        this.backrightflipper.addChild(backrightflipper2);
        this.setRotateAngle(backrightflipper2, 0.0F, 0.6109F, 0.0F);
        this.backrightflipper2.cubeList.add(new ModelBox(backrightflipper2, 0, 83, -2.225F, -1.0F, -0.75F, 5, 2, 6, 0.0F, false));

        this.backrightflipper3 = new AdvancedModelRenderer(this);
        this.backrightflipper3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backrightflipper2.addChild(backrightflipper3);
        this.setRotateAngle(backrightflipper3, 0.0F, 0.2618F, 0.0F);
        this.backrightflipper3.cubeList.add(new ModelBox(backrightflipper3, 78, 80, -3.25F, -0.5F, 0.0F, 6, 1, 8, 0.0F, false));

        this.backleftflipper = new AdvancedModelRenderer(this);
        this.backleftflipper.setRotationPoint(5.4F, 1.5F, 12.9F);
        this.base.addChild(backleftflipper);
        this.setRotateAngle(backleftflipper, 0.0F, 1.5708F, 0.3927F);
        this.backleftflipper.cubeList.add(new ModelBox(backleftflipper, 82, 35, -1.0F, -1.5F, -2.5F, 4, 4, 8, 0.01F, true));

        this.backleftflipper2 = new AdvancedModelRenderer(this);
        this.backleftflipper2.setRotationPoint(0.75F, 0.5F, 4.5F);
        this.backleftflipper.addChild(backleftflipper2);
        this.setRotateAngle(backleftflipper2, 0.0F, -0.6109F, 0.0F);
        this.backleftflipper2.cubeList.add(new ModelBox(backleftflipper2, 0, 83, -2.775F, -1.0F, -0.75F, 5, 2, 6, 0.0F, true));

        this.backleftflipper3 = new AdvancedModelRenderer(this);
        this.backleftflipper3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backleftflipper2.addChild(backleftflipper3);
        this.setRotateAngle(backleftflipper3, 0.0F, -0.2618F, 0.0F);
        this.backleftflipper3.cubeList.add(new ModelBox(backleftflipper3, 78, 80, -2.75F, -0.5F, 0.0F, 6, 1, 8, 0.0F, true));

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
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
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
        float scaler = 1.0F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        
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

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = -12.5 + (((tickAnim - 0) / 13) * (-8.75228-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.13078-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.99572-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -8.75228 + (((tickAnim - 13) / 14) * (-7.50303-(-8.75228)));
            yy = -0.13078 + (((tickAnim - 13) / 14) * (-0.17428-(-0.13078)));
            zz = 1.99572 + (((tickAnim - 13) / 14) * (1.9924-(1.99572)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -7.50303 + (((tickAnim - 27) / 9) * (-15.35728-(-7.50303)));
            yy = -0.17428 + (((tickAnim - 27) / 9) * (-0.1247-(-0.17428)));
            zz = 1.9924 + (((tickAnim - 27) / 9) * (-2.49689-(1.9924)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = -15.35728 + (((tickAnim - 36) / 7) * (-12.01-(-15.35728)));
            yy = -0.1247 + (((tickAnim - 36) / 7) * (0-(-0.1247)));
            zz = -2.49689 + (((tickAnim - 36) / 7) * (0-(-2.49689)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -12.01 + (((tickAnim - 43) / 7) * (-12.5-(-12.01)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(xx), base.rotateAngleY + (float) Math.toRadians(yy), base.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.6 + (((tickAnim - 0) / 13) * (0.55-(-0.6)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 14) * (0.9-(0.55)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 27) / 23) * (0-(0)));
            yy = 0.9 + (((tickAnim - 27) / 23) * (-0.6-(0.9)));
            zz = 0 + (((tickAnim - 27) / 23) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = -7.5 + (((tickAnim - 20) / 14) * (-1.68646-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 14) * (-1.70689-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (2.42115-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -1.68646 + (((tickAnim - 34) / 16) * (0-(-1.68646)));
            yy = -1.70689 + (((tickAnim - 34) / 16) * (0-(-1.70689)));
            zz = 2.42115 + (((tickAnim - 34) / 16) * (0-(2.42115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.25 + (((tickAnim - 10) / 10) * (-7.5-(-11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -7.5 + (((tickAnim - 20) / 17) * (4.17-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 4.17 + (((tickAnim - 37) / 13) * (0-(4.17)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.82743-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.86581-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-10.19442-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -5.82743 + (((tickAnim - 13) / 14) * (-7.0463-(-5.82743)));
            yy = 0.86581 + (((tickAnim - 13) / 14) * (0.75369-(0.86581)));
            zz = -10.19442 + (((tickAnim - 13) / 14) * (-11.76701-(-10.19442)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -7.0463 + (((tickAnim - 27) / 9) * (2.81989-(-7.0463)));
            yy = 0.75369 + (((tickAnim - 27) / 9) * (1.05026-(0.75369)));
            zz = -11.76701 + (((tickAnim - 27) / 9) * (0.92535-(-11.76701)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 2.81989 + (((tickAnim - 36) / 7) * (0.34372-(2.81989)));
            yy = 1.05026 + (((tickAnim - 36) / 7) * (1.10549-(1.05026)));
            zz = 0.92535 + (((tickAnim - 36) / 7) * (-2.25707-(0.92535)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0.34372 + (((tickAnim - 43) / 7) * (0-(0.34372)));
            yy = 1.10549 + (((tickAnim - 43) / 7) * (0-(1.10549)));
            zz = -2.25707 + (((tickAnim - 43) / 7) * (0-(-2.25707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-11.82743-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.86581-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (10.19442-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -11.82743 + (((tickAnim - 13) / 14) * (-13.0463-(-11.82743)));
            yy = -0.86581 + (((tickAnim - 13) / 14) * (-0.75369-(-0.86581)));
            zz = 10.19442 + (((tickAnim - 13) / 14) * (11.76701-(10.19442)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -13.0463 + (((tickAnim - 27) / 9) * (8.81989-(-13.0463)));
            yy = -0.75369 + (((tickAnim - 27) / 9) * (-1.05026-(-0.75369)));
            zz = 11.76701 + (((tickAnim - 27) / 9) * (-0.92535-(11.76701)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 8.81989 + (((tickAnim - 36) / 7) * (-1.65628-(8.81989)));
            yy = -1.05026 + (((tickAnim - 36) / 7) * (-1.10549-(-1.05026)));
            zz = -0.92535 + (((tickAnim - 36) / 7) * (2.25707-(-0.92535)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.65628 + (((tickAnim - 43) / 7) * (0-(-1.65628)));
            yy = -1.10549 + (((tickAnim - 43) / 7) * (0-(-1.10549)));
            zz = 2.25707 + (((tickAnim - 43) / 7) * (0-(2.25707)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 11.20262 + (((tickAnim - 0) / 6) * (-6.24797-(11.20262)));
            yy = 27.32368 + (((tickAnim - 0) / 6) * (20.00943-(27.32368)));
            zz = 1.46504 + (((tickAnim - 0) / 6) * (14.7117-(1.46504)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -6.24797 + (((tickAnim - 6) / 7) * (-80.62627-(-6.24797)));
            yy = 20.00943 + (((tickAnim - 6) / 7) * (16.05548-(20.00943)));
            zz = 14.7117 + (((tickAnim - 6) / 7) * (83.68159-(14.7117)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -80.62627 + (((tickAnim - 13) / 8) * (-4.55157-(-80.62627)));
            yy = 16.05548 + (((tickAnim - 13) / 8) * (47.90463-(16.05548)));
            zz = 83.68159 + (((tickAnim - 13) / 8) * (0.39233-(83.68159)));
        }
        else if (tickAnim >= 21 && tickAnim < 32) {
            xx = -4.55157 + (((tickAnim - 21) / 11) * (-10.95272-(-4.55157)));
            yy = 47.90463 + (((tickAnim - 21) / 11) * (8.50841-(47.90463)));
            zz = 0.39233 + (((tickAnim - 21) / 11) * (20.55965-(0.39233)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -10.95272 + (((tickAnim - 32) / 4) * (10.35709-(-10.95272)));
            yy = 8.50841 + (((tickAnim - 32) / 4) * (68.87323-(8.50841)));
            zz = 20.55965 + (((tickAnim - 32) / 4) * (10.53417-(20.55965)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 10.35709 + (((tickAnim - 36) / 7) * (41.81839-(10.35709)));
            yy = 68.87323 + (((tickAnim - 36) / 7) * (30.17986-(68.87323)));
            zz = 10.53417 + (((tickAnim - 36) / 7) * (-33.57534-(10.53417)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 41.81839 + (((tickAnim - 43) / 7) * (11.20262-(41.81839)));
            yy = 30.17986 + (((tickAnim - 43) / 7) * (27.32368-(30.17986)));
            zz = -33.57534 + (((tickAnim - 43) / 7) * (1.46504-(-33.57534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-30-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = -30 + (((tickAnim - 15) / 9) * (7.5-(-30)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 24) / 5) * (-27.5-(7.5)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (0-(0)));
            yy = -27.5 + (((tickAnim - 29) / 7) * (-7.5-(-27.5)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            yy = -7.5 + (((tickAnim - 36) / 7) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 7.5 + (((tickAnim - 43) / 7) * (0-(7.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 11.20262 + (((tickAnim - 0) / 8) * (-9.55518-(11.20262)));
            yy = -27.32368 + (((tickAnim - 0) / 8) * (-19.43861-(-27.32368)));
            zz = -1.46504 + (((tickAnim - 0) / 8) * (-19.09263-(-1.46504)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -9.55518 + (((tickAnim - 8) / 10) * (-67.14235-(-9.55518)));
            yy = -19.43861 + (((tickAnim - 8) / 10) * (-6.39434-(-19.43861)));
            zz = -19.09263 + (((tickAnim - 8) / 10) * (-68.97015-(-19.09263)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -67.14235 + (((tickAnim - 18) / 8) * (-4.55157-(-67.14235)));
            yy = -6.39434 + (((tickAnim - 18) / 8) * (-47.90463-(-6.39434)));
            zz = -68.97015 + (((tickAnim - 18) / 8) * (-0.39233-(-68.97015)));
        }
        else if (tickAnim >= 26 && tickAnim < 37) {
            xx = -4.55157 + (((tickAnim - 26) / 11) * (-10.95272-(-4.55157)));
            yy = -47.90463 + (((tickAnim - 26) / 11) * (-8.50841-(-47.90463)));
            zz = -0.39233 + (((tickAnim - 26) / 11) * (-20.55965-(-0.39233)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -10.95272 + (((tickAnim - 37) / 4) * (10.35709-(-10.95272)));
            yy = -8.50841 + (((tickAnim - 37) / 4) * (-68.87323-(-8.50841)));
            zz = -20.55965 + (((tickAnim - 37) / 4) * (-10.53417-(-20.55965)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 10.35709 + (((tickAnim - 41) / 9) * (11.20262-(10.35709)));
            yy = -68.87323 + (((tickAnim - 41) / 9) * (-27.32368-(-68.87323)));
            zz = -10.53417 + (((tickAnim - 41) / 9) * (-1.46504-(-10.53417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 20) / 9) * (0-(0)));
            yy = 30 + (((tickAnim - 20) / 9) * (-7.5-(30)));
            zz = 0 + (((tickAnim - 20) / 9) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 29) / 5) * (27.5-(-7.5)));
            zz = 0 + (((tickAnim - 29) / 5) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            yy = 27.5 + (((tickAnim - 34) / 7) * (7.5-(27.5)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 7.5 + (((tickAnim - 41) / 9) * (0-(7.5)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -12.5 + (((tickAnim - 13) / 14) * (-15.45-(-12.5)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 36) {
            xx = -15.45 + (((tickAnim - 27) / 9) * (3.12-(-15.45)));
            yy = 0 + (((tickAnim - 27) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 9) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 43) {
            xx = 3.12 + (((tickAnim - 36) / 7) * (-0.85-(3.12)));
            yy = 0 + (((tickAnim - 36) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 7) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -0.85 + (((tickAnim - 43) / 7) * (0-(-0.85)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -22.85586 + (((tickAnim - 0) / 24) * (-25.40196-(-22.85586)));
            yy = -3.86693 + (((tickAnim - 0) / 24) * (-3.94402-(-3.86693)));
            zz = -9.29783 + (((tickAnim - 0) / 24) * (-9.74871-(-9.29783)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -25.40196 + (((tickAnim - 24) / 26) * (-22.85586-(-25.40196)));
            yy = -3.94402 + (((tickAnim - 24) / 26) * (-3.86693-(-3.94402)));
            zz = -9.74871 + (((tickAnim - 24) / 26) * (-9.29783-(-9.74871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -22.85586 + (((tickAnim - 0) / 24) * (-25.40196-(-22.85586)));
            yy = 3.86693 + (((tickAnim - 0) / 24) * (3.94402-(3.86693)));
            zz = 9.29783 + (((tickAnim - 0) / 24) * (9.74871-(9.29783)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -25.40196 + (((tickAnim - 24) / 26) * (-22.85586-(-25.40196)));
            yy = 3.94402 + (((tickAnim - 24) / 26) * (3.86693-(3.94402)));
            zz = 9.74871 + (((tickAnim - 24) / 26) * (9.29783-(9.74871)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 11.833 + (((tickAnim - 0) / 18) * (20-(11.833)));
            yy = -0.52697 + (((tickAnim - 0) / 18) * (0-(-0.52697)));
            zz = -9.96679 + (((tickAnim - 0) / 18) * (0-(-9.96679)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 18) / 5) * (26.09504-(20)));
            yy = 0 + (((tickAnim - 18) / 5) * (-10.37925-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (47.63733-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 26.09504 + (((tickAnim - 23) / 3) * (7.22552-(26.09504)));
            yy = -10.37925 + (((tickAnim - 23) / 3) * (1.24405-(-10.37925)));
            zz = 47.63733 + (((tickAnim - 23) / 3) * (37.41735-(47.63733)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 7.22552 + (((tickAnim - 26) / 3) * (-30.70726-(7.22552)));
            yy = 1.24405 + (((tickAnim - 26) / 3) * (-7.51271-(1.24405)));
            zz = 37.41735 + (((tickAnim - 26) / 3) * (45.34328-(37.41735)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -30.70726 + (((tickAnim - 29) / 4) * (6.59649-(-30.70726)));
            yy = -7.51271 + (((tickAnim - 29) / 4) * (-35.59326-(-7.51271)));
            zz = 45.34328 + (((tickAnim - 29) / 4) * (22.39295-(45.34328)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 6.59649 + (((tickAnim - 33) / 4) * (6.99079-(6.59649)));
            yy = -35.59326 + (((tickAnim - 33) / 4) * (-11.38367-(-35.59326)));
            zz = 22.39295 + (((tickAnim - 33) / 4) * (6.7614-(22.39295)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 6.99079 + (((tickAnim - 37) / 1) * (10.83758-(6.99079)));
            yy = -11.38367 + (((tickAnim - 37) / 1) * (-5.06093-(-11.38367)));
            zz = 6.7614 + (((tickAnim - 37) / 1) * (58.39815-(6.7614)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 10.83758 + (((tickAnim - 38) / 3) * (-11.98491-(10.83758)));
            yy = -5.06093 + (((tickAnim - 38) / 3) * (-6.37433-(-5.06093)));
            zz = 58.39815 + (((tickAnim - 38) / 3) * (48.6335-(58.39815)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -11.98491 + (((tickAnim - 41) / 5) * (-8.9934-(-11.98491)));
            yy = -6.37433 + (((tickAnim - 41) / 5) * (-3.18488-(-6.37433)));
            zz = 48.6335 + (((tickAnim - 41) / 5) * (16.6699-(48.6335)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -8.9934 + (((tickAnim - 46) / 4) * (11.833-(-8.9934)));
            yy = -3.18488 + (((tickAnim - 46) / 4) * (-0.52697-(-3.18488)));
            zz = 16.6699 + (((tickAnim - 46) / 4) * (-9.96679-(16.6699)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper3, backleftflipper3.rotateAngleX + (float) Math.toRadians(xx), backleftflipper3.rotateAngleY + (float) Math.toRadians(yy), backleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 11.833 + (((tickAnim - 0) / 13) * (20-(11.833)));
            yy = 0.52697 + (((tickAnim - 0) / 13) * (0-(0.52697)));
            zz = 9.96679 + (((tickAnim - 0) / 13) * (0-(9.96679)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 13) / 5) * (26.09504-(20)));
            yy = 0 + (((tickAnim - 13) / 5) * (10.37925-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-47.63733-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 26.09504 + (((tickAnim - 18) / 3) * (7.22552-(26.09504)));
            yy = 10.37925 + (((tickAnim - 18) / 3) * (-1.24405-(10.37925)));
            zz = -47.63733 + (((tickAnim - 18) / 3) * (-37.41735-(-47.63733)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 7.22552 + (((tickAnim - 21) / 3) * (-30.70726-(7.22552)));
            yy = -1.24405 + (((tickAnim - 21) / 3) * (7.51271-(-1.24405)));
            zz = -37.41735 + (((tickAnim - 21) / 3) * (-45.34328-(-37.41735)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -30.70726 + (((tickAnim - 24) / 8) * (6.99079-(-30.70726)));
            yy = 7.51271 + (((tickAnim - 24) / 8) * (11.38367-(7.51271)));
            zz = -45.34328 + (((tickAnim - 24) / 8) * (-6.7614-(-45.34328)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 6.99079 + (((tickAnim - 32) / 1) * (10.83758-(6.99079)));
            yy = 11.38367 + (((tickAnim - 32) / 1) * (5.06093-(11.38367)));
            zz = -6.7614 + (((tickAnim - 32) / 1) * (-58.39815-(-6.7614)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 10.83758 + (((tickAnim - 33) / 3) * (-11.98491-(10.83758)));
            yy = 5.06093 + (((tickAnim - 33) / 3) * (6.37433-(5.06093)));
            zz = -58.39815 + (((tickAnim - 33) / 3) * (-48.6335-(-58.39815)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -11.98491 + (((tickAnim - 36) / 14) * (11.833-(-11.98491)));
            yy = 6.37433 + (((tickAnim - 36) / 14) * (0.52697-(6.37433)));
            zz = -48.6335 + (((tickAnim - 36) / 14) * (9.96679-(-48.6335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper3, backrightflipper3.rotateAngleX + (float) Math.toRadians(xx), backrightflipper3.rotateAngleY + (float) Math.toRadians(yy), backrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.setRotateAngle(base, base.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*5), base.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*3), base.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*4));
        this.base.rotationPointX = this.base.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*1);
        this.base.rotationPointY = this.base.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1);
        this.base.rotationPointZ = this.base.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*0.5);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*7), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*1), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*5), neck2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*5), head.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+180))*1), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*1));
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30), frontrightflipper.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*30), frontrightflipper.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*20));
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*10), frontrightflipper2.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*20), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*3))*30), frontrightflipper3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*30), frontleftflipper.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*30), frontleftflipper.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60*2))*20));
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*10), frontleftflipper2.rotateAngleY + (float) Math.toRadians(10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*2))*20), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60*3))*30), frontleftflipper3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*20), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*10));
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), backrightflipper.rotateAngleY + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), backrightflipper.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), backrightflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), backrightflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), backleftflipper.rotateAngleY + (float) Math.toRadians(-30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), backleftflipper.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), backleftflipper2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), backleftflipper2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1), tail.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*7), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*1), tail2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*10), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-120))*1), tail3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-180))*1));



    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMesodermochelys entity = (EntityPrehistoricFloraMesodermochelys) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -15 + (((tickAnim - 0) / 33) * (-17.49762-(-15)));
            yy = 0 + (((tickAnim - 0) / 33) * (0.10901-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (2.49762-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -17.49762 + (((tickAnim - 33) / 7) * (-15-(-17.49762)));
            yy = 0.10901 + (((tickAnim - 33) / 7) * (0-(0.10901)));
            zz = 2.49762 + (((tickAnim - 33) / 7) * (-1-(2.49762)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -15 + (((tickAnim - 40) / 5) * (-12.5-(-15)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 40) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -12.5 + (((tickAnim - 45) / 6) * (-15-(-12.5)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 79) {
            xx = -15 + (((tickAnim - 51) / 28) * (-15-(-15)));
            yy = 0 + (((tickAnim - 51) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 28) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 40) / 39) * (0-(0)));
            yy = -0.8 + (((tickAnim - 40) / 39) * (-0.8-(-0.8)));
            zz = 0 + (((tickAnim - 40) / 39) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 7.98903 + (((tickAnim - 0) / 15) * (50.87747-(7.98903)));
            yy = -4.98966 + (((tickAnim - 0) / 15) * (2.61518-(-4.98966)));
            zz = -12.86222 + (((tickAnim - 0) / 15) * (45.80528-(-12.86222)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 50.87747 + (((tickAnim - 15) / 18) * (136.63-(50.87747)));
            yy = 2.61518 + (((tickAnim - 15) / 18) * (11.91-(2.61518)));
            zz = 45.80528 + (((tickAnim - 15) / 18) * (117.51-(45.80528)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 136.63 + (((tickAnim - 33) / 7) * (118.26918-(136.63)));
            yy = 11.91 + (((tickAnim - 33) / 7) * (6.46287-(11.91)));
            zz = 117.51 + (((tickAnim - 33) / 7) * (119.48057-(117.51)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 118.26918 + (((tickAnim - 40) / 8) * (117.81798-(118.26918)));
            yy = 6.46287 + (((tickAnim - 40) / 8) * (-0.34616-(6.46287)));
            zz = 119.48057 + (((tickAnim - 40) / 8) * (121.94382-(119.48057)));
        }
        else if (tickAnim >= 48 && tickAnim < 63) {
            xx = 117.81798 + (((tickAnim - 48) / 15) * (12.29498-(117.81798)));
            yy = -0.34616 + (((tickAnim - 48) / 15) * (-2.84744-(-0.34616)));
            zz = 121.94382 + (((tickAnim - 48) / 15) * (41.36414-(121.94382)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 12.29498 + (((tickAnim - 63) / 7) * (-17.92315-(12.29498)));
            yy = -2.84744 + (((tickAnim - 63) / 7) * (1.57976-(-2.84744)));
            zz = 41.36414 + (((tickAnim - 63) / 7) * (-11.53377-(41.36414)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = -17.92315 + (((tickAnim - 70) / 4) * (-3.6382-(-17.92315)));
            yy = 1.57976 + (((tickAnim - 70) / 4) * (-4.65392-(1.57976)));
            zz = -11.53377 + (((tickAnim - 70) / 4) * (-16.83219-(-11.53377)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -3.6382 + (((tickAnim - 74) / 6) * (7.98903-(-3.6382)));
            yy = -4.65392 + (((tickAnim - 74) / 6) * (-4.98966-(-4.65392)));
            zz = -16.83219 + (((tickAnim - 74) / 6) * (-12.86222-(-16.83219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper, frontrightflipper.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = -28.99351 + (((tickAnim - 0) / 15) * (-27.0858-(-28.99351)));
            yy = -24.78879 + (((tickAnim - 0) / 15) * (-47.78378-(-24.78879)));
            zz = 8.79945 + (((tickAnim - 0) / 15) * (-7.89211-(8.79945)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -27.0858 + (((tickAnim - 15) / 13) * (-38.85993-(-27.0858)));
            yy = -47.78378 + (((tickAnim - 15) / 13) * (-45.37134-(-47.78378)));
            zz = -7.89211 + (((tickAnim - 15) / 13) * (-14.97391-(-7.89211)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -38.85993 + (((tickAnim - 28) / 5) * (-41.06133-(-38.85993)));
            yy = -45.37134 + (((tickAnim - 28) / 5) * (-38.61947-(-45.37134)));
            zz = -14.97391 + (((tickAnim - 28) / 5) * (-19.43621-(-14.97391)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -41.06133 + (((tickAnim - 33) / 10) * (-24.89195-(-41.06133)));
            yy = -38.61947 + (((tickAnim - 33) / 10) * (-9.93226-(-38.61947)));
            zz = -19.43621 + (((tickAnim - 33) / 10) * (-24.97874-(-19.43621)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -24.89195 + (((tickAnim - 43) / 5) * (-9.79752-(-24.89195)));
            yy = -9.93226 + (((tickAnim - 43) / 5) * (-14.55551-(-9.93226)));
            zz = -24.97874 + (((tickAnim - 43) / 5) * (-18.59694-(-24.97874)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -9.79752 + (((tickAnim - 48) / 7) * (-5.62083-(-9.79752)));
            yy = -14.55551 + (((tickAnim - 48) / 7) * (-6.16108-(-14.55551)));
            zz = -18.59694 + (((tickAnim - 48) / 7) * (9.47256-(-18.59694)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = -5.62083 + (((tickAnim - 55) / 9) * (21.06104-(-5.62083)));
            yy = -6.16108 + (((tickAnim - 55) / 9) * (-8.79064-(-6.16108)));
            zz = 9.47256 + (((tickAnim - 55) / 9) * (5.00445-(9.47256)));
        }
        else if (tickAnim >= 64 && tickAnim < 72) {
            xx = 21.06104 + (((tickAnim - 64) / 8) * (-1.87661-(21.06104)));
            yy = -8.79064 + (((tickAnim - 64) / 8) * (-26.63833-(-8.79064)));
            zz = 5.00445 + (((tickAnim - 64) / 8) * (-1.21118-(5.00445)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = -1.87661 + (((tickAnim - 72) / 2) * (-7.41625-(-1.87661)));
            yy = -26.63833 + (((tickAnim - 72) / 2) * (-24.56427-(-26.63833)));
            zz = -1.21118 + (((tickAnim - 72) / 2) * (12.01058-(-1.21118)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -7.41625 + (((tickAnim - 74) / 6) * (-28.99351-(-7.41625)));
            yy = -24.56427 + (((tickAnim - 74) / 6) * (-24.78879-(-24.56427)));
            zz = 12.01058 + (((tickAnim - 74) / 6) * (8.79945-(12.01058)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper2, frontrightflipper2.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper2.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 0) / 33) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = -7.5 + (((tickAnim - 33) / 15) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -7.5 + (((tickAnim - 48) / 7) * (20-(-7.5)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 65) {
            xx = 20 + (((tickAnim - 55) / 10) * (-0.5-(20)));
            yy = 0 + (((tickAnim - 55) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 10) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 72) {
            xx = -0.5 + (((tickAnim - 65) / 7) * (-22.5-(-0.5)));
            yy = 0 + (((tickAnim - 65) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 7) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 74) {
            xx = -22.5 + (((tickAnim - 72) / 2) * (-18-(-22.5)));
            yy = 0 + (((tickAnim - 72) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 2) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -18 + (((tickAnim - 74) / 6) * (-7.5-(-18)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightflipper3, frontrightflipper3.rotateAngleX + (float) Math.toRadians(xx), frontrightflipper3.rotateAngleY + (float) Math.toRadians(yy), frontrightflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 7.98903 + (((tickAnim - 0) / 12) * (50.12747-(7.98903)));
            yy = 4.98966 + (((tickAnim - 0) / 12) * (-2.61518-(4.98966)));
            zz = 12.86222 + (((tickAnim - 0) / 12) * (-45.80528-(12.86222)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 50.12747 + (((tickAnim - 12) / 18) * (129.63-(50.12747)));
            yy = -2.61518 + (((tickAnim - 12) / 18) * (-11.91-(-2.61518)));
            zz = -45.80528 + (((tickAnim - 12) / 18) * (-117.51-(-45.80528)));
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
            xx = -5.64656 + (((tickAnim - 68) / 3) * (9.38152-(-5.64656)));
            yy = 5.47351 + (((tickAnim - 68) / 3) * (7.04228-(5.47351)));
            zz = 5.31799 + (((tickAnim - 68) / 3) * (10.70683-(5.31799)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 9.38152 + (((tickAnim - 71) / 9) * (7.98903-(9.38152)));
            yy = 7.04228 + (((tickAnim - 71) / 9) * (4.98966-(7.04228)));
            zz = 10.70683 + (((tickAnim - 71) / 9) * (12.86222-(10.70683)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper, frontleftflipper.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -28.99351 + (((tickAnim - 0) / 12) * (-27.0858-(-28.99351)));
            yy = 24.78879 + (((tickAnim - 0) / 12) * (47.78378-(24.78879)));
            zz = -8.79945 + (((tickAnim - 0) / 12) * (7.89211-(-8.79945)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = -27.0858 + (((tickAnim - 12) / 12) * (-38.85993-(-27.0858)));
            yy = 47.78378 + (((tickAnim - 12) / 12) * (45.37134-(47.78378)));
            zz = 7.89211 + (((tickAnim - 12) / 12) * (14.97391-(7.89211)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -38.85993 + (((tickAnim - 24) / 6) * (-41.06133-(-38.85993)));
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
            xx = -9.79752 + (((tickAnim - 45) / 7) * (-5.62083-(-9.79752)));
            yy = 14.55551 + (((tickAnim - 45) / 7) * (6.16108-(14.55551)));
            zz = 18.59694 + (((tickAnim - 45) / 7) * (-9.47256-(18.59694)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = -5.62083 + (((tickAnim - 52) / 9) * (21.06104-(-5.62083)));
            yy = 6.16108 + (((tickAnim - 52) / 9) * (8.79064-(6.16108)));
            zz = -9.47256 + (((tickAnim - 52) / 9) * (-5.00445-(-9.47256)));
        }
        else if (tickAnim >= 61 && tickAnim < 68) {
            xx = 21.06104 + (((tickAnim - 61) / 7) * (-2.87661-(21.06104)));
            yy = 8.79064 + (((tickAnim - 61) / 7) * (26.63833-(8.79064)));
            zz = -5.00445 + (((tickAnim - 61) / 7) * (1.21118-(-5.00445)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -2.87661 + (((tickAnim - 68) / 3) * (-25.01168-(-2.87661)));
            yy = 26.63833 + (((tickAnim - 68) / 3) * (26.08347-(26.63833)));
            zz = 1.21118 + (((tickAnim - 68) / 3) * (-1.79201-(1.21118)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -25.01168 + (((tickAnim - 71) / 9) * (-28.99351-(-25.01168)));
            yy = 26.08347 + (((tickAnim - 71) / 9) * (24.78879-(26.08347)));
            zz = -1.79201 + (((tickAnim - 71) / 9) * (-8.79945-(-1.79201)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper2, frontleftflipper2.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper2.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 0) / 30) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.5 + (((tickAnim - 30) / 15) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = -7.5 + (((tickAnim - 45) / 7) * (20-(-7.5)));
            yy = 0 + (((tickAnim - 45) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 7) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 62) {
            xx = 20 + (((tickAnim - 52) / 10) * (-0.5-(20)));
            yy = 0 + (((tickAnim - 52) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 10) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 68) {
            xx = -0.5 + (((tickAnim - 62) / 6) * (-20-(-0.5)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 80) {
            xx = -20 + (((tickAnim - 68) / 12) * (-7.5-(-20)));
            yy = 0 + (((tickAnim - 68) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftflipper3, frontleftflipper3.rotateAngleX + (float) Math.toRadians(xx), frontleftflipper3.rotateAngleY + (float) Math.toRadians(yy), frontleftflipper3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 23.3 + (((tickAnim - 0) / 12) * (22.38472-(23.3)));
            yy = 30 + (((tickAnim - 0) / 12) * (27.47611-(30)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.52257-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 33) {
            xx = 22.38472 + (((tickAnim - 12) / 21) * (17.74655-(22.38472)));
            yy = 27.47611 + (((tickAnim - 12) / 21) * (29.84971-(27.47611)));
            zz = -0.52257 + (((tickAnim - 12) / 21) * (-1.95325-(-0.52257)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 17.74655 + (((tickAnim - 33) / 3) * (23.72819-(17.74655)));
            yy = 29.84971 + (((tickAnim - 33) / 3) * (29.8876-(29.84971)));
            zz = -1.95325 + (((tickAnim - 33) / 3) * (0.97695-(-1.95325)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 23.72819 + (((tickAnim - 36) / 3) * (22.8499-(23.72819)));
            yy = 29.8876 + (((tickAnim - 36) / 3) * (30.04799-(29.8876)));
            zz = 0.97695 + (((tickAnim - 36) / 3) * (0.86775-(0.97695)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 22.8499 + (((tickAnim - 39) / 2) * (19.66075-(22.8499)));
            yy = 30.04799 + (((tickAnim - 39) / 2) * (30.12819-(30.04799)));
            zz = 0.86775 + (((tickAnim - 39) / 2) * (0.81314-(0.86775)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 19.66075 + (((tickAnim - 41) / 4) * (16.53-(19.66075)));
            yy = 30.12819 + (((tickAnim - 41) / 4) * (30.11-(30.12819)));
            zz = 0.81314 + (((tickAnim - 41) / 4) * (0.72-(0.81314)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 16.53 + (((tickAnim - 45) / 6) * (22.77-(16.53)));
            yy = 30.11 + (((tickAnim - 45) / 6) * (30.09-(30.11)));
            zz = 0.72 + (((tickAnim - 45) / 6) * (0.58-(0.72)));
        }
        else if (tickAnim >= 51 && tickAnim < 76) {
            xx = 22.77 + (((tickAnim - 51) / 25) * (23.3-(22.77)));
            yy = 30.09 + (((tickAnim - 51) / 25) * (30-(30.09)));
            zz = 0.58 + (((tickAnim - 51) / 25) * (0-(0.58)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper, backrightflipper.rotateAngleX + (float) Math.toRadians(xx), backrightflipper.rotateAngleY + (float) Math.toRadians(yy), backrightflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 7.5 + (((tickAnim - 43) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightflipper2, backrightflipper2.rotateAngleX + (float) Math.toRadians(xx), backrightflipper2.rotateAngleY + (float) Math.toRadians(yy), backrightflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 22.8 + (((tickAnim - 0) / 12) * (21.88472-(22.8)));
            yy = -30 + (((tickAnim - 0) / 12) * (-27.47611-(-30)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.52257-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 33) {
            xx = 21.88472 + (((tickAnim - 12) / 21) * (22.8143-(21.88472)));
            yy = -27.47611 + (((tickAnim - 12) / 21) * (-29.90345-(-27.47611)));
            zz = 0.52257 + (((tickAnim - 12) / 21) * (-2.05012-(0.52257)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 22.8143 + (((tickAnim - 33) / 3) * (23.22819-(22.8143)));
            yy = -29.90345 + (((tickAnim - 33) / 3) * (-29.8876-(-29.90345)));
            zz = -2.05012 + (((tickAnim - 33) / 3) * (-0.97695-(-2.05012)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 23.22819 + (((tickAnim - 36) / 5) * (18.16472-(23.22819)));
            yy = -29.8876 + (((tickAnim - 36) / 5) * (-32.62001-(-29.8876)));
            zz = -0.97695 + (((tickAnim - 36) / 5) * (-0.611-(-0.97695)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 18.16472 + (((tickAnim - 41) / 4) * (16.03563-(18.16472)));
            yy = -32.62001 + (((tickAnim - 41) / 4) * (-30.82487-(-32.62001)));
            zz = -0.611 + (((tickAnim - 41) / 4) * (-0.65859-(-0.611)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 16.03563 + (((tickAnim - 45) / 6) * (22.81537-(16.03563)));
            yy = -30.82487 + (((tickAnim - 45) / 6) * (-30.66881-(-30.82487)));
            zz = -0.65859 + (((tickAnim - 45) / 6) * (-0.53399-(-0.65859)));
        }
        else if (tickAnim >= 51 && tickAnim < 76) {
            xx = 22.81537 + (((tickAnim - 51) / 25) * (22.8-(22.81537)));
            yy = -30.66881 + (((tickAnim - 51) / 25) * (-30-(-30.66881)));
            zz = -0.53399 + (((tickAnim - 51) / 25) * (0-(-0.53399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper, backleftflipper.rotateAngleX + (float) Math.toRadians(xx), backleftflipper.rotateAngleY + (float) Math.toRadians(yy), backleftflipper.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 39) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 7.5 + (((tickAnim - 43) / 5) * (0-(7.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftflipper2, backleftflipper2.rotateAngleX + (float) Math.toRadians(xx), backleftflipper2.rotateAngleY + (float) Math.toRadians(yy), backleftflipper2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 8.7 + (((tickAnim - 0) / 36) * (8.58-(8.7)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = 8.58 + (((tickAnim - 36) / 3) * (3.7-(8.58)));
            yy = 0 + (((tickAnim - 36) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 3) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 3.7 + (((tickAnim - 39) / 6) * (1.25-(3.7)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 1.25 + (((tickAnim - 45) / 6) * (9.16-(1.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 80) {
            xx = 9.16 + (((tickAnim - 51) / 29) * (8.7-(9.16)));
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
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 43) / 5) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



    }


        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMesodermochelys e = (EntityPrehistoricFloraMesodermochelys) entity;
        animator.update(entity);


    }
}
