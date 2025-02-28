package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHexanchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHexanchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer anal;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer dorsal;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer tail6;

    private ModelAnimator animator;

    public ModelHexanchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -5.5F, -14.0F, -8.0F, 11, 11, 14, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -14.9578F, -1.985F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 38, -4.5F, 0.0F, -6.0F, 10, 2, 6, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -14.5F, 5.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0654F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 58, -3.5F, 0.0F, -7.0F, 9, 2, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -9.0F, -8.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 26, -6.0F, -4.5F, -8.0F, 12, 9, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.0F, 0.9514F, -7.6478F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5754F, -0.3098F, -0.0014F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 26, 0.75F, -8.15F, -2.0F, 0, 4, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.0F, 0.9514F, -7.6478F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5754F, 0.3098F, 0.0014F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 26, -0.75F, -8.15F, -2.0F, 0, 4, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.0F, 0.4514F, -7.6478F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5754F, -0.3098F, -0.0014F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, -8.15F, -2.0F, 2, 8, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(6.0F, 0.4514F, -7.6478F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5754F, 0.3098F, 0.0014F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -2.0F, -8.15F, -2.0F, 2, 8, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.5102F, -15.3889F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.5752F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 55, -2.5F, 0.25F, -0.475F, 5, 0, 1, 0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 67, 87, -3.5F, 0.0F, 0.025F, 7, 8, 4, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 0.2302F, -18.6755F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9643F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 84, -1.5F, 0.0F, 0.025F, 5, 4, 2, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -1.6928F, -17.5343F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5716F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 10, -1.5F, 0.0F, -1.975F, 5, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -2.9122F, -13.7248F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3098F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 38, -1.5F, 0.0F, -3.975F, 5, 3, 1, 0.001F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 90, 95, -2.5F, 0.0F, -2.975F, 7, 3, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.4904F, -7.936F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2662F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 79, 23, -3.5F, 0.0F, -5.975F, 7, 3, 2, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 87, -4.5F, 0.0F, -3.975F, 9, 3, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -5.5F, 0.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1265F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 2, -4.5F, 0.0F, -7.975F, 10, 2, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1134F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 47, -3.5F, -2.05F, -8.0F, 9, 2, 8, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(6.0F, 3.5F, -1.5F);
        this.head.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, 0.5236F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 37, 0, -0.5F, 0.0F, -0.5F, 11, 0, 9, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-6.0F, 3.5F, -1.5F);
        this.head.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, -0.5236F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 37, 0, -10.5F, 0.0F, -0.5F, 11, 0, 9, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(6.0F, 0.5514F, -7.6478F);
        this.head.addChild(eye);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.5754F, 0.3098F, 0.0014F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 0, -0.825F, -7.55F, 0.425F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 26, -0.925F, -8.05F, -0.075F, 1, 2, 2, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-6.0F, 0.5514F, -7.6478F);
        this.head.addChild(eye2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.5754F, -0.3098F, -0.0014F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 0, -0.175F, -7.55F, 0.425F, 1, 1, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 26, -0.075F, -8.05F, -0.075F, 1, 2, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4744F, -7.9599F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 79, 13, -3.0F, -0.0244F, -7.404F, 6, 1, 8, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 29, -4.5F, -2.0244F, -2.404F, 9, 2, 3, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.8584F, -3.5026F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1353F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 81, 68, -3.5F, -1.8F, -0.025F, 8, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.5F, 0.9756F, -7.404F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2662F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 45, 0.5F, -1.5F, 3.0F, 6, 1, 1, -0.001F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 10, 0.5F, -1.0F, 0.0F, 6, 1, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.1196F, 0.01F, -4.1388F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.2358F, -0.2711F, -0.0322F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 6, 30, 0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-3.5446F, 0.01F, -5.2388F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.1882F, -0.5575F, 0.0846F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 31, 0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.7946F, 0.01F, -6.3388F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.1198F, -0.7572F, 0.196F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 3, 31, 0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.6696F, 0.01F, -7.0888F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.9616F, -0.9841F, 0.4012F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 0, 0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.3946F, 0.01F, -7.3638F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.1514F, -1.4407F, 0.1258F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.1196F, 0.01F, -4.1388F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.2358F, 0.2711F, 0.0322F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 30, -0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.5446F, 0.01F, -5.2388F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.1882F, 0.5575F, -0.0846F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 31, -0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(2.7946F, 0.01F, -6.3388F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.1198F, 0.7572F, -0.196F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 3, 31, -0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.3946F, 0.01F, -7.3638F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.1514F, 1.4407F, -0.1258F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 0, -0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.6696F, 0.01F, -7.0888F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.9616F, 0.9841F, -0.4012F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 37, 0, -0.25F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-6.0F, -0.023F, 0.3209F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.5754F, -0.3534F, -0.0016F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 45, 0.0F, -8.25F, -1.0F, 3, 8, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(6.0F, -0.023F, 0.3209F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.5754F, 0.3534F, 0.0016F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 45, -3.0F, -8.25F, -1.0F, 3, 8, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -8.25F, 6.0F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 33, 35, -4.5F, -5.0F, -1.0F, 9, 9, 10, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5F, -6.0F, -1.0F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 29, 55, -3.5F, -0.2F, 0.0F, 8, 2, 10, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-0.5F, 5.0F, -1.0F);
        this.tail.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0349F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 41, 16, -3.5F, -1.75F, 0.025F, 8, 2, 10, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(4.2314F, 3.9217F, 4.5F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -1.0036F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 0, 74, 0.0F, -0.5F, -0.5F, 0, 7, 11, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-4.2314F, 3.9217F, 4.5F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 1.0036F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 0, 74, 0.0F, -0.5F, -0.5F, 0, 7, 11, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 68, -3.5F, -3.0F, -1.0F, 7, 7, 9, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5F, -4.0F, -1.0F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.144F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 53, 72, -2.5F, -0.4F, 0.05F, 6, 2, 9, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, 5.4F, -1.0F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 75, 75, -2.5F, -1.775F, 0.1F, 6, 2, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 86, -2.5F, -3.0F, -1.0F, 5, 5, 7, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5F, -4.0F, -1.0F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.1658F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 93, -1.5F, -0.225F, 0.075F, 4, 2, 7, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.5F, 3.2436F, -0.0123F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.1571F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 15, 48, -1.5F, -1.975F, -0.825F, 4, 2, 7, 0.0F, false));

        this.anal = new AdvancedModelRenderer(this);
        this.anal.setRotationPoint(-0.5F, 2.9F, 2.0F);
        this.tail3.addChild(anal);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 0.25F, -3.25F);
        this.anal.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1571F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 98, 40, 0.5F, 0.025F, 1.175F, 0, 4, 7, 0.0F, false));

        this.dorsal = new AdvancedModelRenderer(this);
        this.dorsal.setRotationPoint(-0.5F, -4.2F, -0.6F);
        this.tail3.addChild(dorsal);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.2F, -0.4F);
        this.dorsal.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.1658F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 34, 92, 0.5F, -5.225F, 0.075F, 0, 5, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 92, 23, -2.0F, -2.0F, -1.0F, 4, 4, 7, -0.001F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1396F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 49, 97, -0.5F, 0.1F, 0.0F, 3, 2, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 45, 0.0F, -5.5F, -1.0F, 0, 14, 14, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, -1.5F, -1.0F);
        this.tail5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.1745F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 52, 55, -0.5F, 0.0F, 0.0F, 2, 2, 14, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -3.3518F, 13.0067F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 42, 84, -0.5F, -0.4F, -0.825F, 1, 1, 11, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 65, 16, -0.025F, -1.15F, -0.025F, 0, 8, 13, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.head.offsetY = 0.08F;
        this.head.offsetX = -0.0F;
        this.head.offsetZ = -0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.05F, 0.0F, 0.05F);
        this.setRotateAngle(head, 0.05F, -0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.2F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.28F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, -0.2F, 0.1F, 0.05F);
        this.setRotateAngle(head, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail5, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail6, 0.0F, 0.2F, -0.05F);
        this.main.offsetZ = -0.1F;
        this.main.offsetY = -0.05F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.5F;
        this.main.offsetX = 0.35F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(head, -0.05F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail5, 0.0F, 0.2F, -0.05F);
        this.setRotateAngle(tail6, 0.0F, 0.2F, -0.05F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHexanchus ee = (EntityPrehistoricFloraHexanchus) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHexanchus entity = (EntityPrehistoricFloraHexanchus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*1.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*0.5));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003+100))*1), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftfin, frontleftfin.rotateAngleX + (float) Math.toRadians(0), frontleftfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.0030-30))*2), frontleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*-2));
        this.setRotateAngle(frontrightfin, frontrightfin.rotateAngleX + (float) Math.toRadians(0), frontrightfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-30))*2), frontrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*-2));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-50))*4.5), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftfin, backleftfin.rotateAngleX + (float) Math.toRadians(0), backleftfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.0030-30))*2), backleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*-2));
        this.setRotateAngle(backrightfin, backrightfin.rotateAngleX + (float) Math.toRadians(0), backrightfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-30))*2), backrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003))*-2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-100))*6.5), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-150))*8.5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-200))*12.5), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-220))*15.5), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/1.003-250))*20.5), tail6.rotateAngleZ + (float) Math.toRadians(0));
        
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHexanchus entity = (EntityPrehistoricFloraHexanchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*3.5), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*1));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708+100))*4), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftfin, frontleftfin.rotateAngleX + (float) Math.toRadians(0), frontleftfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-30))*4), frontleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*-3));
        this.setRotateAngle(frontrightfin, frontrightfin.rotateAngleX + (float) Math.toRadians(0), frontrightfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-30))*4), frontrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*-3));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-50))*8.5), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backleftfin, backleftfin.rotateAngleX + (float) Math.toRadians(0), backleftfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-30))*2), backleftfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*-2));
        this.setRotateAngle(backrightfin, backrightfin.rotateAngleX + (float) Math.toRadians(0), backrightfin.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-30))*2), backrightfin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708))*-2));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-100))*6.5), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-150))*12.5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-200))*15.5), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-220))*20.5), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*170/0.708-250))*25.5), tail6.rotateAngleZ + (float) Math.toRadians(0));
        
    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHexanchus entity = (EntityPrehistoricFloraHexanchus) entitylivingbaseIn;
        int animCycle = 9;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -5 + (((tickAnim - 5) / 4) * (0-(-5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 8.5 + (((tickAnim - 5) / 4) * (0-(8.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftfin, frontleftfin.rotateAngleX + (float) Math.toRadians(xx), frontleftfin.rotateAngleY + (float) Math.toRadians(yy), frontleftfin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 8.5 + (((tickAnim - 5) / 4) * (0-(8.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightfin, frontrightfin.rotateAngleX + (float) Math.toRadians(xx), frontrightfin.rotateAngleY + (float) Math.toRadians(yy), frontrightfin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 33.25 + (((tickAnim - 5) / 4) * (0-(33.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        EntityPrehistoricFloraHexanchus ee = (EntityPrehistoricFloraHexanchus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
           // this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

