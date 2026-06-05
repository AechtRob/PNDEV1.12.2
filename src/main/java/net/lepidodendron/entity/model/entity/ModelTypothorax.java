package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTypothorax;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTypothorax extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Typothorax;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r38;

    private ModelAnimator animator;

    public ModelTypothorax() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.Typothorax = new AdvancedModelRenderer(this);
        this.Typothorax.setRotationPoint(0.0F, 9.0F, 11.0F);
        this.Typothorax.cubeList.add(new ModelBox(Typothorax, 0, 46, -6.0F, -2.5F, -2.4F, 12, 8, 5, 0.0F, false));
        this.Typothorax.cubeList.add(new ModelBox(Typothorax, 41, 77, 5.7F, -0.5F, -2.4F, 2, 1, 5, 0.0F, false));
        this.Typothorax.cubeList.add(new ModelBox(Typothorax, 41, 77, -7.7F, -0.5F, -2.4F, 2, 1, 5, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.7F, 1.8F, 0.0F);
        this.Typothorax.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 37, 64, -2.6F, -0.8F, -2.0F, 5, 8, 4, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.leftLeg2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 72, -2.0F, 0.0F, 0.0F, 4, 7, 3, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 3.0F, 5.0F);
        this.leftLeg2.addChild(leftLeg3);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 60, 24, -2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.7F, 1.8F, 0.0F);
        this.Typothorax.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 37, 64, -2.4F, -0.8F, -2.0F, 5, 8, 4, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.1309F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rightLeg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 72, -2.0F, 0.0F, 0.0F, 4, 7, 3, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 3.0F, 5.0F);
        this.rightLeg2.addChild(rightLeg3);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4363F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 24, -2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -2.4F);
        this.Typothorax.addChild(body);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 7.9F, -6.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 39, -8.0F, -3.8185F, 0.8174F, 16, 4, 7, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.8F, -6.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 51, -9.0F, 0.1503F, -0.4341F, 1, 1, 8, 0.001F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 51, 8.0F, 0.1503F, -0.4341F, 1, 1, 8, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.7F, -7.7F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 17, -8.0F, -0.0104F, -0.1314F, 16, 6, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body.addChild(body2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.1F, -7.1F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1833F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 63, -9.0F, -0.3972F, -0.4893F, 2, 1, 9, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 63, 7.0F, -0.3972F, -0.4893F, 2, 1, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 9.5F, -6.2F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 32, -7.0F, -3.9256F, -0.0242F, 14, 4, 9, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.5F, -8.7F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4276F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -7.0F, -0.1F, -0.2F, 14, 6, 10, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 6.5F, -7.0F);
        this.body2.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 35, 51, -3.5F, -2.0F, -6.0F, 7, 5, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-5.0F, -1.5F, -5.6F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0239F, 0.0F, -0.0142F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 21, -1.3135F, -0.4482F, -0.9149F, 2, 1, 6, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(5.0F, -1.5F, -5.6F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0239F, 0.0F, 0.0142F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 77, 21, -0.6865F, -0.4482F, -0.9149F, 2, 1, 6, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.9F, -5.6F);
        this.chest.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 0, -4.5F, 0.0F, -1.2F, 9, 3, 6, -0.001F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.1F, 2.6F, -4.0F);
        this.chest.addChild(leftArm);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 1.1F, 0.0F);
        this.leftArm.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5749F, 0.4981F, -0.6353F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 77, -1.3F, -2.0F, 0.0F, 3, 5, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(3.1F, 1.5F, 1.7F);
        this.leftArm.addChild(leftArm2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.leftArm2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0225F, -0.0008F, 0.0255F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -0.8F, -0.4F, -2.0F, 2, 5, 2, 0.001F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 32, -1.6F, -0.4F, -2.0F, 2, 5, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 4.6F, 1.0F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.2478F, -0.8213F, -2.0001F);
        this.leftArm3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 61, -1.1688F, -1.5353F, -0.8678F, 1, 3, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.1F, 2.6F, -4.0F);
        this.chest.addChild(rightArm);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.0F, 1.1F, 0.0F);
        this.rightArm.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5749F, -0.4981F, 0.6353F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 77, -1.7F, -2.0F, 0.0F, 3, 5, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-3.1F, 1.5F, 1.7F);
        this.rightArm.addChild(rightArm2);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rightArm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0225F, 0.0008F, -0.0255F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, -1.2F, -0.4F, -2.0F, 2, 5, 2, 0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 32, -0.4F, -0.4F, -2.0F, 2, 5, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 4.6F, 1.0F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2478F, -0.8213F, -2.0001F);
        this.rightArm3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 61, 0.1688F, -1.5353F, -0.8678F, 1, 3, 3, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, -1.1F, -6.0F);
        this.chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 73, 12, -2.5F, -1.0F, -3.5F, 5, 4, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.0F, -3.5F);
        this.Neck.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 67, 79, -1.5F, -1.3F, 1.0F, 3, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.Neck.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 69, 33, -2.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.0F, 0.0F, -2.9F);
        this.Neck.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1072F, 0.4071F, 0.2376F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 57, 51, -4.2F, -0.7F, -0.5F, 4, 1, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(2.0F, 0.0F, -2.9F);
        this.Neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1072F, -0.4071F, -0.2376F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 57, 51, 0.2F, -0.7F, -0.5F, 4, 1, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -3.4F);
        this.Neck.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 79, 0, -1.5F, -1.0F, -2.8F, 3, 2, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 38, 38, -1.5F, -0.5F, -2.3F, 3, 1, 1, 0.04F, false));
        this.Head.cubeList.add(new ModelBox(Head, 66, 12, -1.0F, 0.0F, -4.8F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 35, 51, -1.0F, 0.0F, -5.8F, 2, 1, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.0F, -4.8F);
        this.Head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5672F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 22, -1.0F, -0.5F, -1.8F, 2, 1, 1, -0.001F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, -2.8F);
        this.Head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 39, 0, -0.5F, 0.0556F, -3.1214F, 1, 1, 1, -0.001F, false));
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 46, -0.5F, 0.0556F, -2.9214F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 80, 51, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 80, 70, -1.0F, 0.0F, -6.0F, 2, 1, 3, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 80, 39, -1.5F, -1.0F, -2.8F, 3, 1, 3, -0.001F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.2793F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 35, 77, -1.0F, -1.1F, 0.5F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.2F);
        this.Typothorax.addChild(tail);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 68, 70, -6.0F, -0.5F, -0.5F, 2, 1, 7, 0.0F, true));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 68, 70, 4.0F, -0.5F, -0.5F, 2, 1, 7, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 10, -4.0F, -2.4F, -0.5F, 8, 6, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 3.6F, 0.6F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.6894F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 17, -2.4F, -3.3162F, 2.2647F, 1, 2, 2, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 0, -2.4F, -1.6162F, -0.7353F, 1, 2, 3, 0.0F, true));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 17, 1.4F, -3.3162F, 2.2647F, 1, 2, 2, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 0, 1.4F, -1.6162F, -0.7353F, 1, 2, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-3.0F, -3.0F, 1.0F);
        this.tail.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2193F, 0.1298F, -0.0172F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 71, 61, 0.0F, -0.2951F, -0.0999F, 1, 1, 7, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.0F, -3.0F, 1.0F);
        this.tail.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.2193F, -0.1298F, 0.0172F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 71, 61, -1.0F, -0.2951F, -0.0999F, 1, 1, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.7F);
        this.tail.addChild(tail2);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2967F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 2, -3.8F, -0.6F, -1.3F, 2, 1, 8, 0.0F, true));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 2, 1.8F, -0.6F, -1.3F, 2, 1, 8, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.4F, -1.5F, 0.4F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.3333F, 0.099F, -0.0342F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 67, -0.7F, -0.406F, -0.0643F, 1, 1, 8, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.4F, -1.5F, 0.4F);
        this.tail2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3333F, -0.099F, 0.0342F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 56, 67, -0.3F, -0.406F, -0.0643F, 1, 1, 8, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.tail2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.3316F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 24, -2.5F, -1.9F, -2.0F, 5, 4, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 2.1F, 7.2F);
        this.tail2.addChild(tail3);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 0.2F, -0.5F);
        this.tail3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.2443F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 15, 74, -2.5F, 0.1002F, -0.0158F, 1, 1, 7, -0.001F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 15, 74, 1.5F, 0.1002F, -0.0158F, 1, 1, 7, -0.001F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 60, -1.5F, -0.8998F, -1.0158F, 3, 3, 8, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.7F, -1.4F, 0.4F);
        this.tail3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.3319F, 0.0508F, -0.0127F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 26, 77, -0.5F, -0.1296F, 0.098F, 1, 3, 6, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.7F, -1.4F, 0.4F);
        this.tail3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3319F, -0.0508F, 0.0127F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 26, 77, -0.5F, -0.1296F, 0.098F, 1, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.9F, 6.4F);
        this.tail3.addChild(tail4);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.tail4.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0698F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 55, 55, -1.0F, -0.8F, -0.4F, 2, 2, 9, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Typothorax.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Typothorax.offsetY = 0.16F;
        this.Typothorax.offsetX = -0.03F;
        this.Typothorax.rotateAngleY = (float)Math.toRadians(150);
        this.Typothorax.rotateAngleX = (float)Math.toRadians(2);
        this.Typothorax.rotateAngleZ = (float)Math.toRadians(0);
        this.Typothorax.scaleChildren = true;
        float scaler = 0.646F;
        this.Typothorax.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Typothorax.render(f);
        //Reset rotations, positions and sizing:
        this.Typothorax.setScale(1.0F, 1.0F, 1.0F);
        this.Typothorax.scaleChildren = false;
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

        EntityPrehistoricFloraTypothorax entityYuxi = (EntityPrehistoricFloraTypothorax) e;

        if (entityYuxi.getAnimation() == entityYuxi.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Head};
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

        EntityPrehistoricFloraTypothorax ee = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;

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

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 14) / 11) * (0-(12.5)));
            yy = 0 + (((tickAnim - 14) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 30.5 + (((tickAnim - 12) / 10) * (-13.03-(30.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -13.03 + (((tickAnim - 22) / 4) * (0-(-13.03)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (30.5-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 30.5 + (((tickAnim - 38) / 7) * (-13.03-(30.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -13.03 + (((tickAnim - 45) / 5) * (0-(-13.03)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 7.75 + (((tickAnim - 12) / 10) * (6.53-(7.75)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 6.53 + (((tickAnim - 22) / 4) * (0-(6.53)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (7.75-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 7.75 + (((tickAnim - 38) / 7) * (6.53-(7.75)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 6.53 + (((tickAnim - 45) / 5) * (0-(6.53)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-0.275-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 22) / 4) * (0-(0.575)));
            zz = -0.275 + (((tickAnim - 22) / 4) * (0-(-0.275)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 26) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 19) * (0.575-(0)));
            zz = 0 + (((tickAnim - 26) / 19) * (-0.275-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 45) / 5) * (0-(0.575)));
            zz = -0.275 + (((tickAnim - 45) / 5) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (32.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 32.5 + (((tickAnim - 12) / 10) * (33.81-(32.5)));
            yy = 0 + (((tickAnim - 12) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 10) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 33.81 + (((tickAnim - 22) / 4) * (0-(33.81)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 26) / 12) * (32.5-(0)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 32.5 + (((tickAnim - 38) / 7) * (33.81-(32.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 33.81 + (((tickAnim - 45) / 5) * (0-(33.81)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-1.125-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 1.1 + (((tickAnim - 22) / 4) * (0-(1.1)));
            zz = -1.125 + (((tickAnim - 22) / 4) * (0-(-1.125)));
        }
        else if (tickAnim >= 26 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 26) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 19) * (1.1-(0)));
            zz = 0 + (((tickAnim - 26) / 19) * (-1.125-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.1 + (((tickAnim - 45) / 5) * (0-(1.1)));
            zz = -1.125 + (((tickAnim - 45) / 5) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 18) / 15) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 33) / 17) * (0-(-8)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Typothorax, Typothorax.rotateAngleX + (float) Math.toRadians(xx), Typothorax.rotateAngleY + (float) Math.toRadians(yy), Typothorax.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5.35-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -5.35 + (((tickAnim - 18) / 15) * (-5.35-(-5.35)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5.35 + (((tickAnim - 33) / 17) * (0-(-5.35)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Typothorax.rotationPointX = this.Typothorax.rotationPointX + (float)(xx);
        this.Typothorax.rotationPointY = this.Typothorax.rotationPointY - (float)(yy);
        this.Typothorax.rotationPointZ = this.Typothorax.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21 + (((tickAnim - 18) / 15) * (-21-(-21)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 33) / 17) * (0-(-21)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 59 + (((tickAnim - 18) / 15) * (59-(59)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 59 + (((tickAnim - 33) / 17) * (0-(59)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 15) * (0.225-(0.225)));
            zz = -0.225 + (((tickAnim - 18) / 15) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 17) * (0-(0.225)));
            zz = -0.225 + (((tickAnim - 33) / 17) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -29.5 + (((tickAnim - 18) / 15) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 33) / 17) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1 + (((tickAnim - 18) / 15) * (-1-(-1)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 33) / 17) * (0-(-1)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-25.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -25.75 + (((tickAnim - 18) / 15) * (-25.75-(-25.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -25.75 + (((tickAnim - 33) / 17) * (0-(-25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (26-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21.5 + (((tickAnim - 18) / 15) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 26 + (((tickAnim - 18) / 15) * (26-(26)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 26 + (((tickAnim - 33) / 17) * (0-(26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 30.75 + (((tickAnim - 18) / 15) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 33) / 17) * (0-(30.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 15) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.525 + (((tickAnim - 33) / 17) * (0-(0.525)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 9 + (((tickAnim - 18) / 15) * (9-(9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 33) / 17) * (0-(9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21 + (((tickAnim - 18) / 15) * (-21-(-21)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21 + (((tickAnim - 33) / 17) * (0-(-21)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (59-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 59 + (((tickAnim - 18) / 15) * (59-(59)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 59 + (((tickAnim - 33) / 17) * (0-(59)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 15) * (0.225-(0.225)));
            zz = -0.225 + (((tickAnim - 18) / 15) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.225 + (((tickAnim - 33) / 17) * (0-(0.225)));
            zz = -0.225 + (((tickAnim - 33) / 17) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -29.5 + (((tickAnim - 18) / 15) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -29.5 + (((tickAnim - 33) / 17) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.325 + (((tickAnim - 18) / 15) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.325 + (((tickAnim - 33) / 17) * (0-(0.325)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (25.75-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 25.75 + (((tickAnim - 18) / 15) * (25.75-(25.75)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 25.75 + (((tickAnim - 33) / 17) * (0-(25.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-26-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -21.5 + (((tickAnim - 18) / 15) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = -26 + (((tickAnim - 18) / 15) * (-26-(-26)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = -26 + (((tickAnim - 33) / 17) * (0-(-26)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 30.75 + (((tickAnim - 18) / 15) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 33) / 17) * (0-(30.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0.525 + (((tickAnim - 18) / 15) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.525 + (((tickAnim - 33) / 17) * (0-(0.525)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 300;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 20) / 20) * (-3.25-(-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -3.25 + (((tickAnim - 40) / 220) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -3.25 + (((tickAnim - 260) / 20) * (-10.12-(-3.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -10.12 + (((tickAnim - 280) / 20) * (0-(-10.12)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Typothorax, Typothorax.rotateAngleX + (float) Math.toRadians(xx), Typothorax.rotateAngleY + (float) Math.toRadians(yy), Typothorax.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -3.8 + (((tickAnim - 20) / 20) * (-6.3-(-3.8)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = -6.3 + (((tickAnim - 40) / 220) * (-6.3-(-6.3)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = -6.3 + (((tickAnim - 260) / 40) * (0-(-6.3)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Typothorax.rotationPointX = this.Typothorax.rotationPointX + (float)(xx);
        this.Typothorax.rotationPointY = this.Typothorax.rotationPointY - (float)(yy);
        this.Typothorax.rotationPointZ = this.Typothorax.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.77787-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.82425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.9576-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -20.77787 + (((tickAnim - 20) / 20) * (-39.52787-(-20.77787)));
            yy = -12.82425 + (((tickAnim - 20) / 20) * (-12.82425-(-12.82425)));
            zz = -0.9576 + (((tickAnim - 20) / 20) * (-0.9576-(-0.9576)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -39.52787 + (((tickAnim - 40) / 220) * (-39.52787-(-39.52787)));
            yy = -12.82425 + (((tickAnim - 40) / 220) * (-12.82425-(-12.82425)));
            zz = -0.9576 + (((tickAnim - 40) / 220) * (-0.9576-(-0.9576)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -39.52787 + (((tickAnim - 260) / 20) * (-7.26393-(-39.52787)));
            yy = -12.82425 + (((tickAnim - 260) / 20) * (-6.41213-(-12.82425)));
            zz = -0.9576 + (((tickAnim - 260) / 20) * (-0.4788-(-0.9576)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -7.26393 + (((tickAnim - 280) / 20) * (0-(-7.26393)));
            yy = -6.41213 + (((tickAnim - 280) / 20) * (0-(-6.41213)));
            zz = -0.4788 + (((tickAnim - 280) / 20) * (0-(-0.4788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 50 + (((tickAnim - 20) / 20) * (63.25-(50)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 63.25 + (((tickAnim - 40) / 220) * (63.25-(63.25)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 63.25 + (((tickAnim - 260) / 20) * (36.88-(63.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 36.88 + (((tickAnim - 280) / 20) * (0-(36.88)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 20) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 220) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 260) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -19.25 + (((tickAnim - 20) / 20) * (-20-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -20 + (((tickAnim - 40) / 220) * (-20-(-20)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -20 + (((tickAnim - 260) / 20) * (-18-(-20)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -18 + (((tickAnim - 280) / 20) * (0-(-18)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 20) / 20) * (0.475-(-0.175)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.475 + (((tickAnim - 40) / 220) * (0.475-(0.475)));
            zz = -0.225 + (((tickAnim - 40) / 220) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.475 + (((tickAnim - 260) / 40) * (0-(0.475)));
            zz = -0.225 + (((tickAnim - 260) / 40) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -4.25 + (((tickAnim - 40) / 220) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -4.25 + (((tickAnim - 260) / 20) * (6.13-(-4.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 6.13 + (((tickAnim - 280) / 20) * (0-(6.13)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 15.75 + (((tickAnim - 40) / 220) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 15.75 + (((tickAnim - 260) / 40) * (0-(15.75)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.125 + (((tickAnim - 40) / 220) * (0.125-(0.125)));
            zz = 0.5 + (((tickAnim - 40) / 220) * (0.5-(0.5)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.125 + (((tickAnim - 260) / 40) * (0-(0.125)));
            zz = 0.5 + (((tickAnim - 260) / 40) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (3.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 20) / 20) * (0-(8)));
            yy = 0 + (((tickAnim - 20) / 20) * (-20.25-(0)));
            zz = 3.75 + (((tickAnim - 20) / 20) * (-26.75-(3.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = -20.25 + (((tickAnim - 40) / 220) * (-20.25-(-20.25)));
            zz = -26.75 + (((tickAnim - 40) / 220) * (-26.75-(-26.75)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = -20.25 + (((tickAnim - 260) / 40) * (0-(-20.25)));
            zz = -26.75 + (((tickAnim - 260) / 40) * (0-(-26.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (-43.25264-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (4.04018-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (20.60072-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -43.25264 + (((tickAnim - 31) / 9) * (-60.92796-(-43.25264)));
            yy = 4.04018 + (((tickAnim - 31) / 9) * (7.4588-(4.04018)));
            zz = 20.60072 + (((tickAnim - 31) / 9) * (38.0321-(20.60072)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -60.92796 + (((tickAnim - 40) / 220) * (-60.92796-(-60.92796)));
            yy = 7.4588 + (((tickAnim - 40) / 220) * (7.4588-(7.4588)));
            zz = 38.0321 + (((tickAnim - 40) / 220) * (38.0321-(38.0321)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -60.92796 + (((tickAnim - 260) / 40) * (0-(-60.92796)));
            yy = 7.4588 + (((tickAnim - 260) / 40) * (0-(7.4588)));
            zz = 38.0321 + (((tickAnim - 260) / 40) * (0-(38.0321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 0) / 300) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 300) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 300) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (73.72919-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (10.3289-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (-2.99564-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 73.72919 + (((tickAnim - 40) / 220) * (73.72919-(73.72919)));
            yy = 10.3289 + (((tickAnim - 40) / 220) * (10.3289-(10.3289)));
            zz = -2.99564 + (((tickAnim - 40) / 220) * (-2.99564-(-2.99564)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 73.72919 + (((tickAnim - 260) / 40) * (0-(73.72919)));
            yy = 10.3289 + (((tickAnim - 260) / 40) * (0-(10.3289)));
            zz = -2.99564 + (((tickAnim - 260) / 40) * (0-(-2.99564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.625-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.375 + (((tickAnim - 40) / 220) * (0.375-(0.375)));
            zz = -0.625 + (((tickAnim - 40) / 220) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.375 + (((tickAnim - 260) / 40) * (0-(0.375)));
            zz = -0.625 + (((tickAnim - 260) / 40) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 7 + (((tickAnim - 40) / 220) * (7-(7)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 7 + (((tickAnim - 260) / 40) * (0-(7)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 15.5 + (((tickAnim - 40) / 220) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 15.5 + (((tickAnim - 260) / 40) * (0-(15.5)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 260) {
            xx = -5 + (((tickAnim - 20) / 240) * (-5-(-5)));
            yy = 0 + (((tickAnim - 20) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 240) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -5 + (((tickAnim - 260) / 40) * (0-(-5)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 260) {
            xx = -4.5 + (((tickAnim - 20) / 240) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 20) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 240) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -4.5 + (((tickAnim - 260) / 40) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (8-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 260) {
            xx = 8 + (((tickAnim - 20) / 240) * (8-(8)));
            yy = 0 + (((tickAnim - 20) / 240) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 240) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 285) {
            xx = 8 + (((tickAnim - 260) / 25) * (-2.5-(8)));
            yy = 0 + (((tickAnim - 260) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 25) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = -2.5 + (((tickAnim - 285) / 15) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 285) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (11.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 20) / 20) * (0-(11.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 277) {
            xx = 0 + (((tickAnim - 260) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 17) * (0-(0)));
        }
        else if (tickAnim >= 277 && tickAnim < 285) {
            xx = 0 + (((tickAnim - 277) / 8) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 277) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 277) / 8) * (0-(0)));
        }
        else if (tickAnim >= 285 && tickAnim < 300) {
            xx = -11.75 + (((tickAnim - 285) / 15) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 285) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 285) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-20.77787-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.82425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.9576-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -20.77787 + (((tickAnim - 20) / 20) * (-39.52787-(-20.77787)));
            yy = 12.82425 + (((tickAnim - 20) / 20) * (12.82425-(12.82425)));
            zz = 0.9576 + (((tickAnim - 20) / 20) * (0.9576-(0.9576)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -39.52787 + (((tickAnim - 40) / 220) * (-39.52787-(-39.52787)));
            yy = 12.82425 + (((tickAnim - 40) / 220) * (12.82425-(12.82425)));
            zz = 0.9576 + (((tickAnim - 40) / 220) * (0.9576-(0.9576)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -39.52787 + (((tickAnim - 260) / 20) * (-7.26393-(-39.52787)));
            yy = 12.82425 + (((tickAnim - 260) / 20) * (6.41213-(12.82425)));
            zz = 0.9576 + (((tickAnim - 260) / 20) * (0.4788-(0.9576)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -7.26393 + (((tickAnim - 280) / 20) * (0-(-7.26393)));
            yy = 6.41213 + (((tickAnim - 280) / 20) * (0-(6.41213)));
            zz = 0.4788 + (((tickAnim - 280) / 20) * (0-(0.4788)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (50-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 50 + (((tickAnim - 20) / 20) * (63.25-(50)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 63.25 + (((tickAnim - 40) / 220) * (63.25-(63.25)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 63.25 + (((tickAnim - 260) / 20) * (36.88-(63.25)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 36.88 + (((tickAnim - 280) / 20) * (0-(36.88)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 20) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.2 + (((tickAnim - 40) / 220) * (0.2-(0.2)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 260) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -19.25 + (((tickAnim - 20) / 20) * (-20-(-19.25)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -20 + (((tickAnim - 40) / 220) * (-20-(-20)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = -20 + (((tickAnim - 260) / 20) * (-18-(-20)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -18 + (((tickAnim - 280) / 20) * (0-(-18)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 20) / 20) * (0.475-(-0.175)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.475 + (((tickAnim - 40) / 220) * (0.475-(0.475)));
            zz = -0.225 + (((tickAnim - 40) / 220) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.475 + (((tickAnim - 260) / 40) * (0-(0.475)));
            zz = -0.225 + (((tickAnim - 260) / 40) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 20) / 20) * (0-(8)));
            yy = 0 + (((tickAnim - 20) / 20) * (20.25-(0)));
            zz = -3.75 + (((tickAnim - 20) / 20) * (26.75-(-3.75)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 20.25 + (((tickAnim - 40) / 220) * (20.25-(20.25)));
            zz = 26.75 + (((tickAnim - 40) / 220) * (26.75-(26.75)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 20.25 + (((tickAnim - 260) / 40) * (0-(20.25)));
            zz = 26.75 + (((tickAnim - 260) / 40) * (0-(26.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 20) / 11) * (-43.25264-(0)));
            yy = 0 + (((tickAnim - 20) / 11) * (-4.04018-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (-20.60072-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -43.25264 + (((tickAnim - 31) / 9) * (-60.92796-(-43.25264)));
            yy = -4.04018 + (((tickAnim - 31) / 9) * (-7.4588-(-4.04018)));
            zz = -20.60072 + (((tickAnim - 31) / 9) * (-38.0321-(-20.60072)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -60.92796 + (((tickAnim - 40) / 220) * (-60.92796-(-60.92796)));
            yy = -7.4588 + (((tickAnim - 40) / 220) * (-7.4588-(-7.4588)));
            zz = -38.0321 + (((tickAnim - 40) / 220) * (-38.0321-(-38.0321)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -60.92796 + (((tickAnim - 260) / 40) * (0-(-60.92796)));
            yy = -7.4588 + (((tickAnim - 260) / 40) * (0-(-7.4588)));
            zz = -38.0321 + (((tickAnim - 260) / 40) * (0-(-38.0321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 0) / 300) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 300) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 300) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 20) / 20) * (73.72919-(10)));
            yy = 0 + (((tickAnim - 20) / 20) * (-10.3289-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (2.99564-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 73.72919 + (((tickAnim - 40) / 220) * (73.72919-(73.72919)));
            yy = -10.3289 + (((tickAnim - 40) / 220) * (-10.3289-(-10.3289)));
            zz = 2.99564 + (((tickAnim - 40) / 220) * (2.99564-(2.99564)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 73.72919 + (((tickAnim - 260) / 40) * (0-(73.72919)));
            yy = -10.3289 + (((tickAnim - 260) / 40) * (0-(-10.3289)));
            zz = 2.99564 + (((tickAnim - 260) / 40) * (0-(2.99564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0.375-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (-0.625-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0.375 + (((tickAnim - 40) / 220) * (0.375-(0.375)));
            zz = -0.625 + (((tickAnim - 40) / 220) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0.375 + (((tickAnim - 260) / 40) * (0-(0.375)));
            zz = -0.625 + (((tickAnim - 260) / 40) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = -4 + (((tickAnim - 40) / 220) * (-4-(-4)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 220) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = -4 + (((tickAnim - 260) / 40) * (0-(-4)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 220) * (0-(0)));
            zz = 0.25 + (((tickAnim - 40) / 220) * (0.25-(0.25)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0.25 + (((tickAnim - 260) / 40) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 10) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 5) / 5) * (15.5-(21)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 10) / 10) * (0-(15.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.1-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0.1 + (((tickAnim - 5) / 15) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16.25 + (((tickAnim - 5) / 5) * (0-(16.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 240;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 218) {
            xx = 6.75 + (((tickAnim - 40) / 178) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 40) / 178) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 178) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 6.75 + (((tickAnim - 218) / 22) * (0-(6.75)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 1.5 + (((tickAnim - 40) / 17) * (0.25-(1.5)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 86) {
            xx = 0.25 + (((tickAnim - 57) / 29) * (1.5-(0.25)));
            yy = 0 + (((tickAnim - 57) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 29) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 1.5 + (((tickAnim - 86) / 17) * (0.25-(1.5)));
            yy = 0 + (((tickAnim - 86) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0.25 + (((tickAnim - 103) / 31) * (1.5-(0.25)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = 1.5 + (((tickAnim - 134) / 46) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 134) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 46) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = 1.5 + (((tickAnim - 180) / 38) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 180) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 38) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 1.5 + (((tickAnim - 218) / 22) * (0-(1.5)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 6.25 + (((tickAnim - 40) / 17) * (8-(6.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 8 + (((tickAnim - 57) / 13) * (6.25-(8)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 6.25 + (((tickAnim - 70) / 16) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 6.25 + (((tickAnim - 86) / 17) * (8-(6.25)));
            yy = 0 + (((tickAnim - 86) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 8 + (((tickAnim - 103) / 13) * (6.25-(8)));
            yy = 0 + (((tickAnim - 103) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 13) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 134) {
            xx = 6.25 + (((tickAnim - 116) / 18) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 116) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 18) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = 6.25 + (((tickAnim - 134) / 46) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 134) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 46) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = 6.25 + (((tickAnim - 180) / 38) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 180) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 38) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 6.25 + (((tickAnim - 218) / 22) * (0-(6.25)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.80232-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.76728-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-9.00851-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 31.80232 + (((tickAnim - 40) / 17) * (31.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 40) / 17) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 40) / 17) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 31.80232 + (((tickAnim - 57) / 13) * (40.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 57) / 13) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 57) / 13) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 40.80232 + (((tickAnim - 70) / 16) * (31.80232-(40.80232)));
            yy = 8.76728 + (((tickAnim - 70) / 16) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 70) / 16) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 31.80232 + (((tickAnim - 86) / 17) * (31.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 86) / 17) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 86) / 17) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 31.80232 + (((tickAnim - 103) / 13) * (40.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 103) / 13) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 103) / 13) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 116 && tickAnim < 134) {
            xx = 40.80232 + (((tickAnim - 116) / 18) * (31.80232-(40.80232)));
            yy = 8.76728 + (((tickAnim - 116) / 18) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 116) / 18) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = 31.80232 + (((tickAnim - 134) / 46) * (31.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 134) / 46) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 134) / 46) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = 31.80232 + (((tickAnim - 180) / 38) * (31.80232-(31.80232)));
            yy = 8.76728 + (((tickAnim - 180) / 38) * (8.76728-(8.76728)));
            zz = -9.00851 + (((tickAnim - 180) / 38) * (-9.00851-(-9.00851)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 31.80232 + (((tickAnim - 218) / 22) * (0-(31.80232)));
            yy = 8.76728 + (((tickAnim - 218) / 22) * (0-(8.76728)));
            zz = -9.00851 + (((tickAnim - 218) / 22) * (0-(-9.00851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = -73.25 + (((tickAnim - 40) / 17) * (-68-(-73.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -68 + (((tickAnim - 57) / 13) * (-73.25-(-68)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -73.25 + (((tickAnim - 70) / 16) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = -73.25 + (((tickAnim - 86) / 17) * (-68-(-73.25)));
            yy = 0 + (((tickAnim - 86) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = -68 + (((tickAnim - 103) / 13) * (-73.25-(-68)));
            yy = 0 + (((tickAnim - 103) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 13) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 134) {
            xx = -73.25 + (((tickAnim - 116) / 18) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 116) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 18) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = -73.25 + (((tickAnim - 134) / 46) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 134) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 46) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = -73.25 + (((tickAnim - 180) / 38) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 180) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 38) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = -73.25 + (((tickAnim - 218) / 22) * (0-(-73.25)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.69217-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-1.23543-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (5.35987-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 218) {
            xx = 17.69217 + (((tickAnim - 40) / 178) * (17.69217-(17.69217)));
            yy = -1.23543 + (((tickAnim - 40) / 178) * (-1.23543-(-1.23543)));
            zz = 5.35987 + (((tickAnim - 40) / 178) * (5.35987-(5.35987)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 17.69217 + (((tickAnim - 218) / 22) * (0-(17.69217)));
            yy = -1.23543 + (((tickAnim - 218) / 22) * (0-(-1.23543)));
            zz = 5.35987 + (((tickAnim - 218) / 22) * (0-(5.35987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 40) / 178) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 178) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 40) / 178) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            yy = 0.275 + (((tickAnim - 218) / 22) * (0-(0.275)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.80232-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-8.76728-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (9.00851-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 31.80232 + (((tickAnim - 40) / 17) * (31.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 40) / 17) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 40) / 17) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 31.80232 + (((tickAnim - 57) / 13) * (40.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 57) / 13) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 57) / 13) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = 40.80232 + (((tickAnim - 70) / 16) * (31.80232-(40.80232)));
            yy = -8.76728 + (((tickAnim - 70) / 16) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 70) / 16) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 31.80232 + (((tickAnim - 86) / 17) * (31.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 86) / 17) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 86) / 17) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 31.80232 + (((tickAnim - 103) / 13) * (40.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 103) / 13) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 103) / 13) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 116 && tickAnim < 134) {
            xx = 40.80232 + (((tickAnim - 116) / 18) * (31.80232-(40.80232)));
            yy = -8.76728 + (((tickAnim - 116) / 18) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 116) / 18) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = 31.80232 + (((tickAnim - 134) / 46) * (31.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 134) / 46) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 134) / 46) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = 31.80232 + (((tickAnim - 180) / 38) * (31.80232-(31.80232)));
            yy = -8.76728 + (((tickAnim - 180) / 38) * (-8.76728-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 180) / 38) * (9.00851-(9.00851)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 31.80232 + (((tickAnim - 218) / 22) * (0-(31.80232)));
            yy = -8.76728 + (((tickAnim - 218) / 22) * (0-(-8.76728)));
            zz = 9.00851 + (((tickAnim - 218) / 22) * (0-(9.00851)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-73.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = -73.25 + (((tickAnim - 40) / 17) * (-68-(-73.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = -68 + (((tickAnim - 57) / 13) * (-73.25-(-68)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 13) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -73.25 + (((tickAnim - 70) / 16) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 70) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 16) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = -73.25 + (((tickAnim - 86) / 17) * (-68-(-73.25)));
            yy = 0 + (((tickAnim - 86) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = -68 + (((tickAnim - 103) / 13) * (-73.25-(-68)));
            yy = 0 + (((tickAnim - 103) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 13) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 134) {
            xx = -73.25 + (((tickAnim - 116) / 18) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 116) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 18) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 180) {
            xx = -73.25 + (((tickAnim - 134) / 46) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 134) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 46) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 218) {
            xx = -73.25 + (((tickAnim - 180) / 38) * (-73.25-(-73.25)));
            yy = 0 + (((tickAnim - 180) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 38) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = -73.25 + (((tickAnim - 218) / 22) * (0-(-73.25)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (17.69217-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.23543-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-5.35987-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 218) {
            xx = 17.69217 + (((tickAnim - 40) / 178) * (17.69217-(17.69217)));
            yy = 1.23543 + (((tickAnim - 40) / 178) * (1.23543-(1.23543)));
            zz = -5.35987 + (((tickAnim - 40) / 178) * (-5.35987-(-5.35987)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 17.69217 + (((tickAnim - 218) / 22) * (0-(17.69217)));
            yy = 1.23543 + (((tickAnim - 218) / 22) * (0-(1.23543)));
            zz = -5.35987 + (((tickAnim - 218) / 22) * (0-(-5.35987)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 40) / 178) * (0-(0)));
            yy = 0.275 + (((tickAnim - 40) / 178) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 40) / 178) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            yy = 0.275 + (((tickAnim - 218) / 22) * (0-(0.275)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 9.25 + (((tickAnim - 40) / 17) * (14.97696-(9.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (0.84074-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (-3.13948-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 14.97696 + (((tickAnim - 57) / 13) * (-4.27304-(14.97696)));
            yy = 0.84074 + (((tickAnim - 57) / 13) * (0.84074-(0.84074)));
            zz = -3.13948 + (((tickAnim - 57) / 13) * (-3.13948-(-3.13948)));
        }
        else if (tickAnim >= 70 && tickAnim < 86) {
            xx = -4.27304 + (((tickAnim - 70) / 16) * (9.25-(-4.27304)));
            yy = 0.84074 + (((tickAnim - 70) / 16) * (0-(0.84074)));
            zz = -3.13948 + (((tickAnim - 70) / 16) * (0-(-3.13948)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 9.25 + (((tickAnim - 86) / 17) * (14.97696-(9.25)));
            yy = 0 + (((tickAnim - 86) / 17) * (0.84074-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (-3.13948-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 14.97696 + (((tickAnim - 103) / 13) * (-4.27304-(14.97696)));
            yy = 0.84074 + (((tickAnim - 103) / 13) * (0.84074-(0.84074)));
            zz = -3.13948 + (((tickAnim - 103) / 13) * (-3.13948-(-3.13948)));
        }
        else if (tickAnim >= 116 && tickAnim < 143) {
            xx = -4.27304 + (((tickAnim - 116) / 27) * (12.25-(-4.27304)));
            yy = 0.84074 + (((tickAnim - 116) / 27) * (0-(0.84074)));
            zz = -3.13948 + (((tickAnim - 116) / 27) * (0-(-3.13948)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 12.25 + (((tickAnim - 143) / 6) * (10.75-(12.25)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = 10.75 + (((tickAnim - 149) / 4) * (12.25-(10.75)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 165) {
            xx = 12.25 + (((tickAnim - 153) / 12) * (1.5-(12.25)));
            yy = 0 + (((tickAnim - 153) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 12) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 173) {
            xx = 1.5 + (((tickAnim - 165) / 8) * (5.5-(1.5)));
            yy = 0 + (((tickAnim - 165) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 8) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 189) {
            xx = 5.5 + (((tickAnim - 173) / 16) * (12.25-(5.5)));
            yy = 0 + (((tickAnim - 173) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 16) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 12.25 + (((tickAnim - 189) / 6) * (10.75-(12.25)));
            yy = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 199) {
            xx = 10.75 + (((tickAnim - 195) / 4) * (12.25-(10.75)));
            yy = 0 + (((tickAnim - 195) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 4) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 211) {
            xx = 12.25 + (((tickAnim - 199) / 12) * (1.5-(12.25)));
            yy = 0 + (((tickAnim - 199) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 12) * (0-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 218) {
            xx = 1.5 + (((tickAnim - 211) / 7) * (5.5-(1.5)));
            yy = 0 + (((tickAnim - 211) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 211) / 7) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 5.5 + (((tickAnim - 218) / 22) * (0-(5.5)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 70 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 70) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 46) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = 16.25 + (((tickAnim - 40) / 17) * (25.06368-(16.25)));
            yy = 0 + (((tickAnim - 40) / 17) * (8.06754-(0)));
            zz = 0 + (((tickAnim - 40) / 17) * (-16.70394-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 25.06368 + (((tickAnim - 57) / 13) * (-0.56931-(25.06368)));
            yy = 8.06754 + (((tickAnim - 57) / 13) * (8.27574-(8.06754)));
            zz = -16.70394 + (((tickAnim - 57) / 13) * (-7.10857-(-16.70394)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -0.56931 + (((tickAnim - 70) / 3) * (1.92614-(-0.56931)));
            yy = 8.27574 + (((tickAnim - 70) / 3) * (6.53348-(8.27574)));
            zz = -7.10857 + (((tickAnim - 70) / 3) * (-5.61203-(-7.10857)));
        }
        else if (tickAnim >= 73 && tickAnim < 79) {
            xx = 1.92614 + (((tickAnim - 73) / 6) * (21.41819-(1.92614)));
            yy = 6.53348 + (((tickAnim - 73) / 6) * (3.48452-(6.53348)));
            zz = -5.61203 + (((tickAnim - 73) / 6) * (-2.99308-(-5.61203)));
        }
        else if (tickAnim >= 79 && tickAnim < 86) {
            xx = 21.41819 + (((tickAnim - 79) / 7) * (28.5-(21.41819)));
            yy = 3.48452 + (((tickAnim - 79) / 7) * (0-(3.48452)));
            zz = -2.99308 + (((tickAnim - 79) / 7) * (0-(-2.99308)));
        }
        else if (tickAnim >= 86 && tickAnim < 103) {
            xx = 28.5 + (((tickAnim - 86) / 17) * (29.81368-(28.5)));
            yy = 0 + (((tickAnim - 86) / 17) * (8.06754-(0)));
            zz = 0 + (((tickAnim - 86) / 17) * (-16.70394-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 29.81368 + (((tickAnim - 103) / 13) * (-0.56931-(29.81368)));
            yy = 8.06754 + (((tickAnim - 103) / 13) * (8.27574-(8.06754)));
            zz = -16.70394 + (((tickAnim - 103) / 13) * (-7.10857-(-16.70394)));
        }
        else if (tickAnim >= 116 && tickAnim < 122) {
            xx = -0.56931 + (((tickAnim - 116) / 6) * (1.92614-(-0.56931)));
            yy = 8.27574 + (((tickAnim - 116) / 6) * (6.53348-(8.27574)));
            zz = -7.10857 + (((tickAnim - 116) / 6) * (-5.61203-(-7.10857)));
        }
        else if (tickAnim >= 122 && tickAnim < 134) {
            xx = 1.92614 + (((tickAnim - 122) / 12) * (16.25-(1.92614)));
            yy = 6.53348 + (((tickAnim - 122) / 12) * (0-(6.53348)));
            zz = -5.61203 + (((tickAnim - 122) / 12) * (0-(-5.61203)));
        }
        else if (tickAnim >= 134 && tickAnim < 143) {
            xx = 16.25 + (((tickAnim - 134) / 9) * (11.75-(16.25)));
            yy = 0 + (((tickAnim - 134) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 9) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 11.75 + (((tickAnim - 143) / 6) * (12.75-(11.75)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = 12.75 + (((tickAnim - 149) / 4) * (11.75-(12.75)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 165) {
            xx = 11.75 + (((tickAnim - 153) / 12) * (24-(11.75)));
            yy = 0 + (((tickAnim - 153) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 12) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 24 + (((tickAnim - 165) / 3) * (31-(24)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = 31 + (((tickAnim - 168) / 5) * (24-(31)));
            yy = 0 + (((tickAnim - 168) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 5) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 180) {
            xx = 24 + (((tickAnim - 173) / 7) * (16.25-(24)));
            yy = 0 + (((tickAnim - 173) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 7) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 189) {
            xx = 16.25 + (((tickAnim - 180) / 9) * (11.75-(16.25)));
            yy = 0 + (((tickAnim - 180) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 9) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 11.75 + (((tickAnim - 189) / 6) * (12.75-(11.75)));
            yy = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 199) {
            xx = 12.75 + (((tickAnim - 195) / 4) * (11.75-(12.75)));
            yy = 0 + (((tickAnim - 195) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 4) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 211) {
            xx = 11.75 + (((tickAnim - 199) / 12) * (24-(11.75)));
            yy = 0 + (((tickAnim - 199) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 12) * (0-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 214) {
            xx = 24 + (((tickAnim - 211) / 3) * (31-(24)));
            yy = 0 + (((tickAnim - 211) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 211) / 3) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 218) {
            xx = 31 + (((tickAnim - 214) / 4) * (24-(31)));
            yy = 0 + (((tickAnim - 214) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 4) * (0-(0)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 24 + (((tickAnim - 218) / 22) * (0-(24)));
            yy = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 218) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 57) * (0.275-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 57) / 13) * (0-(0)));
            zz = 0.275 + (((tickAnim - 57) / 13) * (0-(0.275)));
        }
        else if (tickAnim >= 70 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 70) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 9) * (0.28-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 79) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 79) / 24) * (0-(0)));
            zz = 0.28 + (((tickAnim - 79) / 24) * (0.275-(0.28)));
        }
        else if (tickAnim >= 103 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 103) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 13) * (0-(0)));
            zz = 0.275 + (((tickAnim - 103) / 13) * (0-(0.275)));
        }
        else if (tickAnim >= 116 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 116) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 49) * (0.1-(0)));
            zz = 0 + (((tickAnim - 116) / 49) * (0.2-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 165) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 165) / 8) * (0.1-(0.1)));
            zz = 0.2 + (((tickAnim - 165) / 8) * (0.2-(0.2)));
        }
        else if (tickAnim >= 173 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            yy = 0.1 + (((tickAnim - 173) / 38) * (0.1-(0.1)));
            zz = 0.2 + (((tickAnim - 173) / 38) * (0.2-(0.2)));
        }
        else if (tickAnim >= 211 && tickAnim < 218) {
            xx = 0 + (((tickAnim - 211) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 211) / 7) * (0.1-(0.1)));
            zz = 0.2 + (((tickAnim - 211) / 7) * (0.2-(0.2)));
        }
        else if (tickAnim >= 218 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 218) / 22) * (0-(0)));
            yy = 0.1 + (((tickAnim - 218) / 22) * (0-(0.1)));
            zz = 0.2 + (((tickAnim - 218) / 22) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 134) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 134) / 4) * (9.5-(0)));
            yy = 0 + (((tickAnim - 134) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 4) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 9.5 + (((tickAnim - 138) / 5) * (0-(9.5)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 143) / 6) * (7.25-(0)));
            yy = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 153) {
            xx = 7.25 + (((tickAnim - 149) / 4) * (0-(7.25)));
            yy = 0 + (((tickAnim - 149) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 4) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 165) {
            xx = 0 + (((tickAnim - 153) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 12) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 165) / 3) * (11-(0)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = 11 + (((tickAnim - 168) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 168) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 5) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 173) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 173) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 7) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 180) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 180) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 3) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 9.5 + (((tickAnim - 183) / 6) * (0-(9.5)));
            yy = 0 + (((tickAnim - 183) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (7.25-(0)));
            yy = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 199) {
            xx = 7.25 + (((tickAnim - 195) / 4) * (0-(7.25)));
            yy = 0 + (((tickAnim - 195) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 4) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 199) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 12) * (0-(0)));
        }
        else if (tickAnim >= 211 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 211) / 3) * (11-(0)));
            yy = 0 + (((tickAnim - 211) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 211) / 3) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 218) {
            xx = 11 + (((tickAnim - 214) / 4) * (0-(11)));
            yy = 0 + (((tickAnim - 214) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120))), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-50))), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-100))), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120-150))), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Typothorax, Typothorax.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*1), Typothorax.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*1), Typothorax.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-3.5));
        this.Typothorax.rotationPointX = this.Typothorax.rotationPointX + (float)(0);
        this.Typothorax.rotationPointY = this.Typothorax.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-150))*0.3);
        this.Typothorax.rotationPointZ = this.Typothorax.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-50))*0.4);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 8.25 + (((tickAnim - 0) / 10) * (36.25-(8.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 36.25 + (((tickAnim - 10) / 14) * (-28.5-(36.25)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -28.5 + (((tickAnim - 24) / 4) * (-23.75-(-28.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -23.75 + (((tickAnim - 28) / 12) * (8.25-(-23.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 8.25 + (((tickAnim - 10) / 3) * (33.38-(8.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 33.38 + (((tickAnim - 13) / 6) * (33.38-(33.38)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 33.38 + (((tickAnim - 19) / 5) * (13.5-(33.38)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 13.5 + (((tickAnim - 24) / 4) * (-9.25-(13.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 28) / 12) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0.175 + (((tickAnim - 13) / 6) * (0.175-(0.175)));
            zz = -0.15 + (((tickAnim - 13) / 6) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 19) / 5) * (0-(0.175)));
            zz = -0.15 + (((tickAnim - 19) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0.15-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.6 + (((tickAnim - 28) / 5) * (-0.15-(-0.6)));
            zz = 0.15 + (((tickAnim - 28) / 5) * (0.15-(0.15)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 33) / 7) * (0-(-0.15)));
            zz = 0.15 + (((tickAnim - 33) / 7) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -9 + (((tickAnim - 0) / 10) * (26.5-(-9)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 26.5 + (((tickAnim - 10) / 3) * (55.36-(26.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 55.36 + (((tickAnim - 13) / 6) * (22.08-(55.36)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 22.08 + (((tickAnim - 19) / 5) * (31-(22.08)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 31 + (((tickAnim - 24) / 2) * (19.63-(31)));
            yy = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 2) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 19.63 + (((tickAnim - 26) / 2) * (33.25-(19.63)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 33.25 + (((tickAnim - 28) / 12) * (-9-(33.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 10) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-1.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0.675-(0)));
            zz = -1.1 + (((tickAnim - 13) / 4) * (-1.13-(-1.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 17) / 2) * (0.925-(0.675)));
            zz = -1.13 + (((tickAnim - 17) / 2) * (-1.13-(-1.13)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.925 + (((tickAnim - 19) / 5) * (0-(0.925)));
            zz = -1.13 + (((tickAnim - 19) / 5) * (0-(-1.13)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 4) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 28) / 5) * (-0.02-(-0.275)));
            zz = 0.125 + (((tickAnim - 28) / 5) * (-0.515-(0.125)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -0.02 + (((tickAnim - 33) / 7) * (-0.25-(-0.02)));
            zz = -0.515 + (((tickAnim - 33) / 7) * (0-(-0.515)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-2.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-170))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-250))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-170))*2.5));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -37.827 + (((tickAnim - 0) / 19) * (19.63746-(-37.827)));
            yy = 12.64167 + (((tickAnim - 0) / 19) * (-9.22731-(12.64167)));
            zz = -0.76811 + (((tickAnim - 0) / 19) * (11.99948-(-0.76811)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 19.63746 + (((tickAnim - 19) / 9) * (-16.65305-(19.63746)));
            yy = -9.22731 + (((tickAnim - 19) / 9) * (-2.46439-(-9.22731)));
            zz = 11.99948 + (((tickAnim - 19) / 9) * (-26.74316-(11.99948)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -16.65305 + (((tickAnim - 28) / 7) * (-50.70905-(-16.65305)));
            yy = -2.46439 + (((tickAnim - 28) / 7) * (22.33037-(-2.46439)));
            zz = -26.74316 + (((tickAnim - 28) / 7) * (-4.4966-(-26.74316)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -50.70905 + (((tickAnim - 35) / 5) * (-37.827-(-50.70905)));
            yy = 22.33037 + (((tickAnim - 35) / 5) * (12.64167-(22.33037)));
            zz = -4.4966 + (((tickAnim - 35) / 5) * (-0.76811-(-4.4966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 9.4489 + (((tickAnim - 0) / 19) * (20.93608-(9.4489)));
            yy = -2.8516 + (((tickAnim - 0) / 19) * (6.91596-(-2.8516)));
            zz = -5.79661 + (((tickAnim - 0) / 19) * (-17.47069-(-5.79661)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 20.93608 + (((tickAnim - 19) / 9) * (-7.34322-(20.93608)));
            yy = 6.91596 + (((tickAnim - 19) / 9) * (-11.13391-(6.91596)));
            zz = -17.47069 + (((tickAnim - 19) / 9) * (7.26035-(-17.47069)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = -7.34322 + (((tickAnim - 28) / 3) * (-9.03875-(-7.34322)));
            yy = -11.13391 + (((tickAnim - 28) / 3) * (-11.6456-(-11.13391)));
            zz = 7.26035 + (((tickAnim - 28) / 3) * (-4.20053-(7.26035)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -9.03875 + (((tickAnim - 31) / 4) * (14.26572-(-9.03875)));
            yy = -11.6456 + (((tickAnim - 31) / 4) * (-12.15729-(-11.6456)));
            zz = -4.20053 + (((tickAnim - 31) / 4) * (-15.66142-(-4.20053)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 14.26572 + (((tickAnim - 35) / 5) * (9.4489-(14.26572)));
            yy = -12.15729 + (((tickAnim - 35) / 5) * (-2.8516-(-12.15729)));
            zz = -15.66142 + (((tickAnim - 35) / 5) * (-5.79661-(-15.66142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 19) * (0-(0.225)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 16) * (0.225-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.225 + (((tickAnim - 35) / 5) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 25.17214 + (((tickAnim - 0) / 9) * (-5.07292-(25.17214)));
            yy = 1.4521 + (((tickAnim - 0) / 9) * (-0.40896-(1.4521)));
            zz = -0.8706 + (((tickAnim - 0) / 9) * (6.22003-(-0.8706)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = -5.07292 + (((tickAnim - 9) / 10) * (55.5-(-5.07292)));
            yy = -0.40896 + (((tickAnim - 9) / 10) * (0-(-0.40896)));
            zz = 6.22003 + (((tickAnim - 9) / 10) * (0-(6.22003)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 55.5 + (((tickAnim - 19) / 4) * (104.64018-(55.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (-0.08609-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0.11119-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 104.64018 + (((tickAnim - 23) / 5) * (103.87381-(104.64018)));
            yy = -0.08609 + (((tickAnim - 23) / 5) * (-0.22958-(-0.08609)));
            zz = 0.11119 + (((tickAnim - 23) / 5) * (0.29651-(0.11119)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 103.87381 + (((tickAnim - 28) / 7) * (37.58478-(103.87381)));
            yy = -0.22958 + (((tickAnim - 28) / 7) * (3.82161-(-0.22958)));
            zz = 0.29651 + (((tickAnim - 28) / 7) * (-4.94916-(0.29651)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 37.58478 + (((tickAnim - 35) / 5) * (25.17214-(37.58478)));
            yy = 3.82161 + (((tickAnim - 35) / 5) * (1.4521-(3.82161)));
            zz = -4.94916 + (((tickAnim - 35) / 5) * (-0.8706-(-4.94916)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 4) * (1.255-(1.15)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 1.255 + (((tickAnim - 4) / 5) * (0.34-(1.255)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0.34 + (((tickAnim - 9) / 10) * (0.75-(0.34)));
            zz = 0 + (((tickAnim - 9) / 10) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.75 + (((tickAnim - 19) / 4) * (2.14-(0.75)));
            zz = 0 + (((tickAnim - 19) / 4) * (-1.12-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 2.14 + (((tickAnim - 23) / 5) * (1.53-(2.14)));
            zz = -1.12 + (((tickAnim - 23) / 5) * (-1.125-(-1.12)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 1.53 + (((tickAnim - 28) / 7) * (0.3-(1.53)));
            zz = -1.125 + (((tickAnim - 28) / 7) * (0-(-1.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 5) * (1.15-(0.3)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-200))*1), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-350))*-3.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-250))*1), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-400))*4.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-60))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-120))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-180))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-100))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-220))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-80))*-1.5));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -28.5 + (((tickAnim - 0) / 3) * (-23.75-(-28.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 3) / 25) * (36.25-(-23.75)));
            yy = 0 + (((tickAnim - 3) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 25) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 36.25 + (((tickAnim - 28) / 12) * (-28.5-(36.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 13.5 + (((tickAnim - 0) / 3) * (-9.25-(13.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 28) {
            xx = -9.25 + (((tickAnim - 3) / 25) * (8.25-(-9.25)));
            yy = 0 + (((tickAnim - 3) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 25) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 8.25 + (((tickAnim - 28) / 3) * (33.38-(8.25)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 33.38 + (((tickAnim - 31) / 5) * (33.38-(33.38)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 33.38 + (((tickAnim - 36) / 4) * (13.5-(33.38)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 3) / 25) * (0-(0)));
            yy = -0.6 + (((tickAnim - 3) / 25) * (0-(-0.6)));
            zz = 0.15 + (((tickAnim - 3) / 25) * (0-(0.15)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0.175-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            yy = 0.175 + (((tickAnim - 31) / 5) * (0.175-(0.175)));
            zz = -0.15 + (((tickAnim - 31) / 5) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.175 + (((tickAnim - 36) / 4) * (0-(0.175)));
            zz = -0.15 + (((tickAnim - 36) / 4) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 31 + (((tickAnim - 0) / 2) * (19.63-(31)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 19.63 + (((tickAnim - 2) / 1) * (33.25-(19.63)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 33.25 + (((tickAnim - 3) / 9) * (7.3-(33.25)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.3 + (((tickAnim - 12) / 3) * (-3.2-(7.3)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = -3.2 + (((tickAnim - 15) / 13) * (26.5-(-3.2)));
            yy = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 26.5 + (((tickAnim - 28) / 3) * (55.36-(26.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 36) {
            xx = 55.36 + (((tickAnim - 31) / 5) * (22.08-(55.36)));
            yy = 0 + (((tickAnim - 31) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 5) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 22.08 + (((tickAnim - 36) / 4) * (31-(22.08)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 2) * (-0.05-(-0.275)));
            zz = 0.125 + (((tickAnim - 3) / 2) * (-0.295-(0.125)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = -0.05 + (((tickAnim - 5) / 4) * (0.19-(-0.05)));
            zz = -0.295 + (((tickAnim - 5) / 4) * (-0.46-(-0.295)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 9) / 3) * (0.515-(0.19)));
            zz = -0.46 + (((tickAnim - 9) / 3) * (-0.21-(-0.46)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.515 + (((tickAnim - 12) / 3) * (0.185-(0.515)));
            zz = -0.21 + (((tickAnim - 12) / 3) * (0.07-(-0.21)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = 0.185 + (((tickAnim - 15) / 13) * (0-(0.185)));
            zz = 0.07 + (((tickAnim - 15) / 13) * (0-(0.07)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (-1.1-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 2) * (0.675-(0)));
            zz = -1.1 + (((tickAnim - 31) / 2) * (-1.13-(-1.1)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0.675 + (((tickAnim - 33) / 3) * (0.925-(0.675)));
            zz = -1.13 + (((tickAnim - 33) / 3) * (-1.13-(-1.13)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 36) / 4) * (0-(0.925)));
            zz = -1.13 + (((tickAnim - 36) / 4) * (0-(-1.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 19.63746 + (((tickAnim - 0) / 9) * (-16.65305-(19.63746)));
            yy = 9.22731 + (((tickAnim - 0) / 9) * (2.46439-(9.22731)));
            zz = -11.99948 + (((tickAnim - 0) / 9) * (26.74316-(-11.99948)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -16.65305 + (((tickAnim - 9) / 7) * (-50.70905-(-16.65305)));
            yy = 2.46439 + (((tickAnim - 9) / 7) * (-22.33037-(2.46439)));
            zz = 26.74316 + (((tickAnim - 9) / 7) * (4.4966-(26.74316)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = -50.70905 + (((tickAnim - 16) / 24) * (19.63746-(-50.70905)));
            yy = -22.33037 + (((tickAnim - 16) / 24) * (9.22731-(-22.33037)));
            zz = 4.4966 + (((tickAnim - 16) / 24) * (-11.99948-(4.4966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 20.93608 + (((tickAnim - 0) / 9) * (-7.34322-(20.93608)));
            yy = -6.91596 + (((tickAnim - 0) / 9) * (11.13391-(-6.91596)));
            zz = 17.47069 + (((tickAnim - 0) / 9) * (-7.26035-(17.47069)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.34322 + (((tickAnim - 9) / 4) * (-9.03875-(-7.34322)));
            yy = 11.13391 + (((tickAnim - 9) / 4) * (11.6456-(11.13391)));
            zz = -7.26035 + (((tickAnim - 9) / 4) * (4.20053-(-7.26035)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.03875 + (((tickAnim - 13) / 3) * (14.26572-(-9.03875)));
            yy = 11.6456 + (((tickAnim - 13) / 3) * (12.15729-(11.6456)));
            zz = 4.20053 + (((tickAnim - 13) / 3) * (15.66142-(4.20053)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = 14.26572 + (((tickAnim - 16) / 24) * (20.93608-(14.26572)));
            yy = 12.15729 + (((tickAnim - 16) / 24) * (-6.91596-(12.15729)));
            zz = 15.66142 + (((tickAnim - 16) / 24) * (17.47069-(15.66142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.225-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 24) * (0-(0)));
            zz = 0.225 + (((tickAnim - 16) / 24) * (0-(0.225)));
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
            xx = 55.5 + (((tickAnim - 0) / 3) * (104.64018-(55.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.08609-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.11119-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 104.64018 + (((tickAnim - 3) / 6) * (103.87381-(104.64018)));
            yy = -0.08609 + (((tickAnim - 3) / 6) * (-0.22958-(-0.08609)));
            zz = 0.11119 + (((tickAnim - 3) / 6) * (0.29651-(0.11119)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 103.87381 + (((tickAnim - 9) / 7) * (37.74762-(103.87381)));
            yy = -0.22958 + (((tickAnim - 9) / 7) * (0.45915-(-0.22958)));
            zz = 0.29651 + (((tickAnim - 9) / 7) * (-0.59303-(0.29651)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 37.74762 + (((tickAnim - 16) / 12) * (0-(37.74762)));
            yy = 0.45915 + (((tickAnim - 16) / 12) * (0-(0.45915)));
            zz = -0.59303 + (((tickAnim - 16) / 12) * (-9.5-(-0.59303)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (55.5-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = -9.5 + (((tickAnim - 28) / 12) * (0-(-9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 3) * (2.09-(0.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.12-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 2.09 + (((tickAnim - 3) / 6) * (1.78-(2.09)));
            zz = -1.12 + (((tickAnim - 3) / 6) * (-1.125-(-1.12)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            yy = 1.78 + (((tickAnim - 9) / 7) * (0.65-(1.78)));
            zz = -1.125 + (((tickAnim - 9) / 7) * (0-(-1.125)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.65 + (((tickAnim - 16) / 7) * (1.44-(0.65)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.44 + (((tickAnim - 23) / 5) * (0.45-(1.44)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 6) * (0.825-(0.45)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.825 + (((tickAnim - 34) / 6) * (0.75-(0.825)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-170))*1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-200))*1.5));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTypothorax entity = (EntityPrehistoricFloraTypothorax) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Typothorax, Typothorax.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*2.5), Typothorax.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*1), Typothorax.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-4.5));
        this.Typothorax.rotationPointX = this.Typothorax.rotationPointX + (float)(0);
        this.Typothorax.rotationPointY = this.Typothorax.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*0.5);
        this.Typothorax.rotationPointZ = this.Typothorax.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.6);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.25 + (((tickAnim - 0) / 5) * (36.25-(8.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 36.25 + (((tickAnim - 5) / 7) * (-28.5-(36.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -28.5 + (((tickAnim - 12) / 1) * (-23.75-(-28.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -23.75 + (((tickAnim - 13) / 7) * (8.25-(-23.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 8.25 + (((tickAnim - 5) / 2) * (33.38-(8.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 33.38 + (((tickAnim - 7) / 2) * (33.38-(33.38)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 33.38 + (((tickAnim - 9) / 3) * (13.5-(33.38)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 13.5 + (((tickAnim - 12) / 1) * (-9.25-(13.5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -9.25 + (((tickAnim - 13) / 7) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 7) / 2) * (0.175-(0.175)));
            zz = -0.15 + (((tickAnim - 7) / 2) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 9) / 3) * (0-(0.175)));
            zz = -0.15 + (((tickAnim - 9) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.15-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 4) * (-0.15-(-0.6)));
            zz = 0.15 + (((tickAnim - 13) / 4) * (0.15-(0.15)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 17) / 3) * (0-(-0.15)));
            zz = 0.15 + (((tickAnim - 17) / 3) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9 + (((tickAnim - 0) / 5) * (26.5-(-9)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 26.5 + (((tickAnim - 5) / 2) * (55.36-(26.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 55.36 + (((tickAnim - 7) / 2) * (22.08-(55.36)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.08 + (((tickAnim - 9) / 3) * (31-(22.08)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 31 + (((tickAnim - 12) / 1) * (19.63-(31)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 19.63 + (((tickAnim - 13) / 0) * (33.25-(19.63)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 33.25 + (((tickAnim - 13) / 7) * (-9-(33.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 5) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-1.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0.675-(0)));
            zz = -1.1 + (((tickAnim - 7) / 1) * (-1.13-(-1.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 8) / 1) * (0.925-(0.675)));
            zz = -1.13 + (((tickAnim - 8) / 1) * (-1.13-(-1.13)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 9) / 3) * (0-(0.925)));
            zz = -1.13 + (((tickAnim - 9) / 3) * (0-(-1.13)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.125-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 4) * (-0.02-(-0.275)));
            zz = 0.125 + (((tickAnim - 13) / 4) * (-0.515-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.02 + (((tickAnim - 17) / 3) * (-0.25-(-0.02)));
            zz = -0.515 + (((tickAnim - 17) / 3) * (0-(-0.515)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-170))*2.5), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*4.5));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -37.827 + (((tickAnim - 0) / 9) * (19.63746-(-37.827)));
            yy = 12.64167 + (((tickAnim - 0) / 9) * (-9.22731-(12.64167)));
            zz = -0.76811 + (((tickAnim - 0) / 9) * (11.99948-(-0.76811)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 19.63746 + (((tickAnim - 9) / 4) * (-16.65305-(19.63746)));
            yy = -9.22731 + (((tickAnim - 9) / 4) * (-2.46439-(-9.22731)));
            zz = 11.99948 + (((tickAnim - 9) / 4) * (-26.74316-(11.99948)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -16.65305 + (((tickAnim - 13) / 5) * (-50.70905-(-16.65305)));
            yy = -2.46439 + (((tickAnim - 13) / 5) * (22.33037-(-2.46439)));
            zz = -26.74316 + (((tickAnim - 13) / 5) * (-4.4966-(-26.74316)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -50.70905 + (((tickAnim - 18) / 2) * (-37.827-(-50.70905)));
            yy = 22.33037 + (((tickAnim - 18) / 2) * (12.64167-(22.33037)));
            zz = -4.4966 + (((tickAnim - 18) / 2) * (-0.76811-(-4.4966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 9.4489 + (((tickAnim - 0) / 9) * (20.93608-(9.4489)));
            yy = -2.8516 + (((tickAnim - 0) / 9) * (6.91596-(-2.8516)));
            zz = -5.79661 + (((tickAnim - 0) / 9) * (-17.47069-(-5.79661)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 20.93608 + (((tickAnim - 9) / 4) * (-7.34322-(20.93608)));
            yy = 6.91596 + (((tickAnim - 9) / 4) * (-11.13391-(6.91596)));
            zz = -17.47069 + (((tickAnim - 9) / 4) * (7.26035-(-17.47069)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.34322 + (((tickAnim - 13) / 2) * (-9.03875-(-7.34322)));
            yy = -11.13391 + (((tickAnim - 13) / 2) * (-11.6456-(-11.13391)));
            zz = 7.26035 + (((tickAnim - 13) / 2) * (-4.20053-(7.26035)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.03875 + (((tickAnim - 15) / 3) * (14.26572-(-9.03875)));
            yy = -11.6456 + (((tickAnim - 15) / 3) * (-12.15729-(-11.6456)));
            zz = -4.20053 + (((tickAnim - 15) / 3) * (-15.66142-(-4.20053)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 14.26572 + (((tickAnim - 18) / 2) * (9.4489-(14.26572)));
            yy = -12.15729 + (((tickAnim - 18) / 2) * (-2.8516-(-12.15729)));
            zz = -15.66142 + (((tickAnim - 18) / 2) * (-5.79661-(-15.66142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 0) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0.225-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0.225 + (((tickAnim - 18) / 2) * (0.225-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.17214 + (((tickAnim - 0) / 4) * (-5.07292-(25.17214)));
            yy = 1.4521 + (((tickAnim - 0) / 4) * (-0.40896-(1.4521)));
            zz = -0.8706 + (((tickAnim - 0) / 4) * (6.22003-(-0.8706)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -5.07292 + (((tickAnim - 4) / 5) * (55.5-(-5.07292)));
            yy = -0.40896 + (((tickAnim - 4) / 5) * (0-(-0.40896)));
            zz = 6.22003 + (((tickAnim - 4) / 5) * (0-(6.22003)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 55.5 + (((tickAnim - 9) / 2) * (104.64018-(55.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (-0.08609-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0.11119-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 104.64018 + (((tickAnim - 11) / 3) * (103.87381-(104.64018)));
            yy = -0.08609 + (((tickAnim - 11) / 3) * (-0.22958-(-0.08609)));
            zz = 0.11119 + (((tickAnim - 11) / 3) * (0.29651-(0.11119)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 103.87381 + (((tickAnim - 14) / 4) * (37.58478-(103.87381)));
            yy = -0.22958 + (((tickAnim - 14) / 4) * (3.82161-(-0.22958)));
            zz = 0.29651 + (((tickAnim - 14) / 4) * (-4.94916-(0.29651)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 37.58478 + (((tickAnim - 18) / 2) * (25.17214-(37.58478)));
            yy = 3.82161 + (((tickAnim - 18) / 2) * (1.4521-(3.82161)));
            zz = -4.94916 + (((tickAnim - 18) / 2) * (-0.8706-(-4.94916)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 0) / 2) * (1.255-(1.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.255 + (((tickAnim - 2) / 2) * (0.34-(1.255)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0.34 + (((tickAnim - 4) / 5) * (0.75-(0.34)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 9) / 2) * (2.14-(0.75)));
            zz = 0 + (((tickAnim - 9) / 2) * (-1.12-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 2.14 + (((tickAnim - 11) / 3) * (1.53-(2.14)));
            zz = -1.12 + (((tickAnim - 11) / 3) * (-1.125-(-1.12)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.53 + (((tickAnim - 14) / 4) * (0.3-(1.53)));
            zz = -1.125 + (((tickAnim - 14) / 4) * (0-(-1.125)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 2) * (1.15-(0.3)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*3), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*-5.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*6.5));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-60))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-120))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-220))*4), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-16), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1.5));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -28.5 + (((tickAnim - 0) / 2) * (-23.75-(-28.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -23.75 + (((tickAnim - 2) / 11) * (36.25-(-23.75)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 36.25 + (((tickAnim - 13) / 7) * (-28.5-(36.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.5 + (((tickAnim - 0) / 2) * (-9.25-(13.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -9.25 + (((tickAnim - 2) / 11) * (8.25-(-9.25)));
            yy = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 11) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.25 + (((tickAnim - 13) / 2) * (33.38-(8.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 33.38 + (((tickAnim - 15) / 3) * (33.38-(33.38)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 33.38 + (((tickAnim - 18) / 2) * (13.5-(33.38)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.15-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 2) / 11) * (0-(0)));
            yy = -0.6 + (((tickAnim - 2) / 11) * (0-(-0.6)));
            zz = 0.15 + (((tickAnim - 2) / 11) * (0-(0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 15) / 3) * (0.175-(0.175)));
            zz = -0.15 + (((tickAnim - 15) / 3) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.175 + (((tickAnim - 18) / 2) * (0-(0.175)));
            zz = -0.15 + (((tickAnim - 18) / 2) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 31 + (((tickAnim - 0) / 1) * (19.63-(31)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 19.63 + (((tickAnim - 1) / 1) * (33.25-(19.63)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 33.25 + (((tickAnim - 2) / 4) * (7.3-(33.25)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 7.3 + (((tickAnim - 6) / 2) * (-3.2-(7.3)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -3.2 + (((tickAnim - 8) / 5) * (26.5-(-3.2)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 26.5 + (((tickAnim - 13) / 2) * (55.36-(26.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 55.36 + (((tickAnim - 15) / 3) * (22.08-(55.36)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.08 + (((tickAnim - 18) / 2) * (31-(22.08)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.275 + (((tickAnim - 2) / 1) * (-0.05-(-0.275)));
            zz = 0.125 + (((tickAnim - 2) / 1) * (-0.295-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.05 + (((tickAnim - 3) / 1) * (0.19-(-0.05)));
            zz = -0.295 + (((tickAnim - 3) / 1) * (-0.46-(-0.295)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 4) / 2) * (0.515-(0.19)));
            zz = -0.46 + (((tickAnim - 4) / 2) * (-0.21-(-0.46)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.515 + (((tickAnim - 6) / 2) * (0.185-(0.515)));
            zz = -0.21 + (((tickAnim - 6) / 2) * (0.07-(-0.21)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.185 + (((tickAnim - 8) / 5) * (0-(0.185)));
            zz = 0.07 + (((tickAnim - 8) / 5) * (0-(0.07)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (-1.1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0.675-(0)));
            zz = -1.1 + (((tickAnim - 15) / 2) * (-1.13-(-1.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 17) / 1) * (0.925-(0.675)));
            zz = -1.13 + (((tickAnim - 17) / 1) * (-1.13-(-1.13)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.925 + (((tickAnim - 18) / 2) * (0-(0.925)));
            zz = -1.13 + (((tickAnim - 18) / 2) * (0-(-1.13)));
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
            xx = 19.63746 + (((tickAnim - 0) / 4) * (-16.65305-(19.63746)));
            yy = 9.22731 + (((tickAnim - 0) / 4) * (2.46439-(9.22731)));
            zz = -11.99948 + (((tickAnim - 0) / 4) * (26.74316-(-11.99948)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16.65305 + (((tickAnim - 4) / 4) * (-50.70905-(-16.65305)));
            yy = 2.46439 + (((tickAnim - 4) / 4) * (-22.33037-(2.46439)));
            zz = 26.74316 + (((tickAnim - 4) / 4) * (4.4966-(26.74316)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -50.70905 + (((tickAnim - 8) / 12) * (19.63746-(-50.70905)));
            yy = -22.33037 + (((tickAnim - 8) / 12) * (9.22731-(-22.33037)));
            zz = 4.4966 + (((tickAnim - 8) / 12) * (-11.99948-(4.4966)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20.93608 + (((tickAnim - 0) / 4) * (-7.34322-(20.93608)));
            yy = -6.91596 + (((tickAnim - 0) / 4) * (11.13391-(-6.91596)));
            zz = 17.47069 + (((tickAnim - 0) / 4) * (-7.26035-(17.47069)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -7.34322 + (((tickAnim - 4) / 2) * (-9.03875-(-7.34322)));
            yy = 11.13391 + (((tickAnim - 4) / 2) * (11.6456-(11.13391)));
            zz = -7.26035 + (((tickAnim - 4) / 2) * (4.20053-(-7.26035)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.03875 + (((tickAnim - 6) / 2) * (14.26572-(-9.03875)));
            yy = 11.6456 + (((tickAnim - 6) / 2) * (12.15729-(11.6456)));
            zz = 4.20053 + (((tickAnim - 6) / 2) * (15.66142-(4.20053)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 14.26572 + (((tickAnim - 8) / 12) * (20.93608-(14.26572)));
            yy = 12.15729 + (((tickAnim - 8) / 12) * (-6.91596-(12.15729)));
            zz = 15.66142 + (((tickAnim - 8) / 12) * (17.47069-(15.66142)));
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
            zz = 0 + (((tickAnim - 0) / 8) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0.225 + (((tickAnim - 8) / 12) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 55.5 + (((tickAnim - 0) / 1) * (104.64018-(55.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.08609-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.11119-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 104.64018 + (((tickAnim - 1) / 3) * (103.87381-(104.64018)));
            yy = -0.08609 + (((tickAnim - 1) / 3) * (-0.22958-(-0.08609)));
            zz = 0.11119 + (((tickAnim - 1) / 3) * (0.29651-(0.11119)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 103.87381 + (((tickAnim - 4) / 4) * (37.74762-(103.87381)));
            yy = -0.22958 + (((tickAnim - 4) / 4) * (0.45915-(-0.22958)));
            zz = 0.29651 + (((tickAnim - 4) / 4) * (-0.59303-(0.29651)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 37.74762 + (((tickAnim - 8) / 6) * (0-(37.74762)));
            yy = 0.45915 + (((tickAnim - 8) / 6) * (0-(0.45915)));
            zz = -0.59303 + (((tickAnim - 8) / 6) * (-9.5-(-0.59303)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (55.5-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = -9.5 + (((tickAnim - 14) / 6) * (0-(-9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 0) / 1) * (2.09-(0.75)));
            zz = 0 + (((tickAnim - 0) / 1) * (-1.12-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 2.09 + (((tickAnim - 1) / 3) * (1.78-(2.09)));
            zz = -1.12 + (((tickAnim - 1) / 3) * (-1.125-(-1.12)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.78 + (((tickAnim - 4) / 4) * (0.65-(1.78)));
            zz = -1.125 + (((tickAnim - 4) / 4) * (0-(-1.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 8) / 3) * (1.44-(0.65)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 1.44 + (((tickAnim - 11) / 3) * (0.45-(1.44)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 14) / 3) * (0.825-(0.45)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 17) / 3) * (0.75-(0.825)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-170))*1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*3.5));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTypothorax e = (EntityPrehistoricFloraTypothorax) entity;
        animator.update(entity);


    }
}
