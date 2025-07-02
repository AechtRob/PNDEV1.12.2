package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHypnovenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHypnovenator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer rightSickleClaw;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer leftSickleClaw;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightarm3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer rightfinger;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer leftfinger;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private ModelAnimator animator;

    public ModelHypnovenator() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 7.5F, -1.25F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.225F, 1.2F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 49, -2.0F, -2.0F, -1.0F, 4, 2, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 5.525F, 1.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0175F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 35, -2.0F, -1.0F, -1.0F, 4, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.525F, 1.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 38, -2.0F, -6.0F, -1.0F, 4, 6, 4, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-2.0F, 0.125F, 1.9F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.2182F, 0.0F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 34, 64, -1.0F, -0.7F, -1.15F, 2, 6, 3, 0.0F, true));
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 7, 74, -0.5F, -0.7F, 1.85F, 0, 6, 1, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 5.2F, 0.15F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.7418F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 28, 65, -0.475F, 1.1F, 0.2F, 0, 6, 2, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 20, 72, -0.75F, 2.4F, -0.55F, 1, 6, 1, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 73, 17, -0.25F, 2.4F, -0.55F, 1, 6, 1, -0.01F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, 3.6F, 0.625F);
        this.rightleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 64, 76, 0.0F, -4.6F, -1.15F, 1, 4, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 76, -0.5F, -4.6F, -1.15F, 1, 4, 1, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.25F, 3.6F, 0.425F);
        this.rightleg2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 16, 0.0F, -4.6F, -1.15F, 1, 4, 1, -0.02F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 77, -0.5F, -4.6F, -1.15F, 1, 4, 1, -0.01F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.5F, 8.35F, 0.35F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -1.1345F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 73, 62, 0.0F, -0.1F, -1.0F, 1, 5, 1, 0.0F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.5F, 4.9F, -0.5F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.9599F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 76, 47, -1.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, true));

        this.rightSickleClaw = new AdvancedModelRenderer(this);
        this.rightSickleClaw.setRotationPoint(0.75F, 0.25F, -0.5F);
        this.rightleg4.addChild(rightSickleClaw);
        this.setRotateAngle(rightSickleClaw, -0.4363F, 0.0F, 0.0F);
        this.rightSickleClaw.cubeList.add(new ModelBox(rightSickleClaw, 0, 79, 0.0F, -0.5F, -1.5F, 0, 2, 2, 0.0F, true));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rightleg4.addChild(rightleg5);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 76, 51, -1.0F, -0.5F, -0.5F, 2, 2, 1, -0.01F, true));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(2.0F, 0.125F, 1.9F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.2182F, 0.0F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 34, 64, -1.0F, -0.7F, -1.15F, 2, 6, 3, 0.0F, false));
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 7, 74, 0.5F, -0.7F, 1.85F, 0, 6, 1, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 5.2F, 0.15F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.7418F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 28, 65, 0.475F, 1.1F, 0.2F, 0, 6, 2, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 20, 72, -0.25F, 2.4F, -0.55F, 1, 6, 1, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 73, 17, -0.75F, 2.4F, -0.55F, 1, 6, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.25F, 3.6F, 0.625F);
        this.leftleg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 64, 76, -1.0F, -4.6F, -1.15F, 1, 4, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 76, -0.5F, -4.6F, -1.15F, 1, 4, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, 3.6F, 0.425F);
        this.leftleg2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 78, 16, -1.0F, -4.6F, -1.15F, 1, 4, 1, -0.02F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 77, -0.5F, -4.6F, -1.15F, 1, 4, 1, -0.01F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.5F, 8.35F, 0.35F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -1.1345F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 73, 62, -1.0F, -0.1F, -1.0F, 1, 5, 1, 0.0F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(-0.5F, 4.9F, -0.5F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.9599F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 76, 47, -1.0F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

        this.leftSickleClaw = new AdvancedModelRenderer(this);
        this.leftSickleClaw.setRotationPoint(-0.75F, 0.25F, -0.5F);
        this.leftleg4.addChild(leftSickleClaw);
        this.setRotateAngle(leftSickleClaw, -0.4363F, 0.0F, 0.0F);
        this.leftSickleClaw.cubeList.add(new ModelBox(leftSickleClaw, 0, 79, 0.0F, -0.5F, -1.5F, 0, 2, 2, 0.0F, false));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.leftleg4.addChild(leftleg5);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 76, 51, -1.0F, -0.5F, -0.5F, 2, 2, 1, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.475F, 4.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 60, 0, -1.5F, -0.75F, -0.75F, 3, 3, 4, 0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 61, 41, -1.5F, 2.25F, -0.75F, 3, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 51, -1.0F, -0.75F, -0.5F, 2, 2, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.25F, 0.5F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.6109F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 10, -0.5F, 0.0F, -1.0F, 2, 0, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.25F, 0.5F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.6109F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 57, -1.5F, 0.0F, -1.0F, 2, 0, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.05F, 5.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 40, -0.5F, -0.5F, -0.5F, 1, 1, 9, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.05F, 0.5F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.6109F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 0, -0.75F, 0.0F, -1.0F, 3, 0, 9, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.05F, 0.5F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.6109F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 28, -2.25F, 0.0F, -1.0F, 3, 0, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 28, -0.5F, -0.5F, -0.25F, 1, 1, 10, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.4F, 0.05F, 1.0F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.6109F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 14, -0.5F, 0.0F, -1.0F, 4, 0, 13, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.4F, 0.05F, 1.0F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.6109F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -3.5F, 0.0F, -1.0F, 4, 0, 13, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 23, 38, -2.5F, -0.5F, -3.5F, 5, 5, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.6F, -4.575F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1396F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 20, -2.5F, -0.8F, 1.0F, 5, 2, 5, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.7F, -4.575F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1134F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 48, 28, -2.5F, -1.0F, 1.0F, 5, 1, 5, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5F, -3.5F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0785F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 10, -2.5F, -2.0F, 0.0F, 5, 3, 6, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.3F, -3.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.05F, -2.8F);
        this.chest.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 59, -2.0F, 1.3F, 3.0F, 4, 0, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 57, -2.0F, -0.7F, -1.0F, 4, 2, 4, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.95F, -2.75F);
        this.chest.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 57, -2.0F, -3.0F, -1.0F, 4, 3, 4, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.275F, -2.6F);
        this.chest.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1134F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 49, -2.0F, -1.0F, -1.0F, 4, 2, 5, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.375F, -2.625F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0262F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 20, -2.0F, -2.0F, -1.0F, 4, 3, 4, 0.0F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-2.0F, 1.625F, -3.375F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.829F, -0.1745F, 0.0F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 39, 74, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.01F, true));
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 52, 70, -0.25F, 1.0F, -0.5F, 0, 5, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 0.2F, -0.5F);
        this.rightarm1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3142F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 79, 0.0F, 0.0F, 0.0F, 1, 3, 1, -0.01F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 3.5995F, -0.0096F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.5359F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 76, 41, -0.5F, -0.2F, -0.6F, 1, 4, 1, 0.0F, true));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 70, 71, -0.225F, -0.2F, 0.4F, 0, 4, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 3.8F, -0.6F);
        this.rightarm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 77, 0.0F, -4.0F, 0.0F, 1, 4, 1, -0.02F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(0.0F, 3.75F, 0.1F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.6981F, 0.0F, 0.0F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 78, 37, -0.5F, -0.6F, -0.5F, 1, 2, 1, -0.01F, true));
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 45, 70, -0.475F, 0.05F, 0.4F, 0, 6, 3, 0.0F, true));
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 78, 62, -0.5F, 1.35F, -0.5F, 1, 3, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.425F, 0.35F, 0.5F);
        this.rightarm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 79, 0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, true));

        this.rightfinger = new AdvancedModelRenderer(this);
        this.rightfinger.setRotationPoint(-0.45F, 0.35F, -0.5F);
        this.rightarm3.addChild(rightfinger);
        this.setRotateAngle(rightfinger, -0.3927F, 0.0F, 0.0F);
        this.rightfinger.cubeList.add(new ModelBox(rightfinger, 79, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(2.0F, 1.625F, -3.375F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.829F, 0.1745F, 0.0F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 39, 74, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.01F, false));
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 52, 70, 0.25F, 1.0F, -0.5F, 0, 5, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.2F, -0.5F);
        this.leftarm1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3142F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 79, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.01F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 3.5995F, -0.0096F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.5359F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 76, 41, -0.5F, -0.2F, -0.6F, 1, 4, 1, 0.0F, false));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 70, 71, 0.225F, -0.2F, 0.4F, 0, 4, 3, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 3.8F, -0.6F);
        this.leftarm2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 10, 77, -1.0F, -4.0F, 0.0F, 1, 4, 1, -0.02F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.0F, 3.75F, 0.1F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.6981F, 0.0F, 0.0F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 78, 37, -0.5F, -0.6F, -0.5F, 1, 2, 1, -0.01F, false));
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 45, 70, 0.475F, 0.05F, 0.4F, 0, 6, 3, 0.0F, false));
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 78, 62, -0.5F, 1.35F, -0.5F, 1, 3, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.425F, 0.35F, 0.5F);
        this.leftarm3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 79, -1.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, false));

        this.leftfinger = new AdvancedModelRenderer(this);
        this.leftfinger.setRotationPoint(0.45F, 0.35F, -0.5F);
        this.leftarm3.addChild(leftfinger);
        this.setRotateAngle(leftfinger, -0.3927F, 0.0F, 0.0F);
        this.leftfinger.cubeList.add(new ModelBox(leftfinger, 79, 55, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.2F, -3.65F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.4363F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 1.25F, -1.8F);
        this.neck4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0349F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 45, 64, -2.0F, -2.2F, -0.8F, 3, 1, 4, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 1.25F, -1.8F);
        this.neck4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3578F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 55, 51, -2.0F, 1.2F, 3.1F, 3, 0, 1, 0.0F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 60, 50, -2.0F, 0.2F, -0.9F, 3, 1, 4, 0.01F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 1.25F, -1.8F);
        this.neck4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2269F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 60, -2.0F, -2.0F, -1.0F, 3, 3, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.5739F, -2.2315F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.7418F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 68, -1.0F, -0.6F, -2.55F, 2, 2, 3, 0.01F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.2F, -1.25F);
        this.neck3.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.2094F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 69, 28, -1.0F, -2.0F, -1.0F, 2, 1, 3, 0.02F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.4F, -1.55F);
        this.neck3.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.2793F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 61, 47, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -2.4F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 68, 56, -1.0F, -0.6F, -2.75F, 2, 2, 3, -0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.3F, -1.75F);
        this.neck2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1222F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 59, 71, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.03F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.5F, 1.375F, -1.25F);
        this.neck2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.3054F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 61, 8, -1.0F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -2.85F);
        this.neck2.addChild(neck);
        this.setRotateAngle(neck, 0.48F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 74, -0.85F, -0.5F, -1.65F, 1, 2, 2, -0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 25, 74, -0.15F, -0.5F, -1.65F, 1, 2, 2, -0.015F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.85F, 0.5F, -1.45F);
        this.neck.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.3491F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 75, 8, -0.1F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.85F, 0.5F, -1.45F);
        this.neck.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3665F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 75, 4, -0.9F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.15F, -1.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 78, 22, -1.0F, -0.9F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.45F, 0.125F, -1.125F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.1614F, 0.288F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 78, 33, -0.5F, 0.0F, -1.7F, 1, 1, 2, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.275F, -0.625F, -1.4F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.384F, 0.2138F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 77, 77, -0.5F, 0.0F, -1.3F, 1, 1, 2, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.275F, -0.625F, -1.4F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.384F, -0.2138F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 77, 73, -0.5F, 0.0F, -1.3F, 1, 1, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -1.15F, -0.975F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.6109F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 75, 12, -0.5F, 0.0F, -1.3F, 1, 1, 2, 0.01F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -0.65F, -1.5F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.3491F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 77, 69, -0.5F, 0.0F, -1.3F, 1, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.45F, 0.125F, -1.125F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.1614F, -0.288F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 32, 78, -0.5F, 0.0F, -1.7F, 1, 1, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.8F, -5.225F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.3491F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 72, -0.5F, 0.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.1614F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 15, 65, -0.5F, 0.0F, -4.3F, 1, 1, 5, 0.01F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.35F, 0.3F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.3491F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 67, 8, 0.0F, -1.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 65, 17, -0.5F, -1.0F, -1.0F, 2, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.85F, -0.1F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 48, 35, -1.0F, 0.0F, -0.9F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 64, -0.5F, 0.0F, -5.0F, 1, 1, 5, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.275F, -0.8F, -0.525F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.288F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 20, 80, -0.5F, 0.0F, -1.7F, 0, 1, 2, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-1.275F, -0.8F, -0.525F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, -0.288F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 69, 79, 0.5F, 0.0F, -1.7F, 0, 1, 2, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.4F, 0.0F, -1.025F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, 0.288F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 75, 0, -0.5F, 0.0F, -1.7F, 1, 1, 2, -0.02F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.4F, 0.0F, -1.025F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.288F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 74, -0.5F, 0.0F, -1.7F, 1, 1, 2, -0.02F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.375F, 0.175F, -1.5F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.2182F, -0.2487F, 0.0F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 55, 35, -0.5F, -0.475F, -0.45F, 1, 1, 1, 0.0F, true));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.375F, 0.175F, -1.5F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.2182F, 0.2487F, 0.0F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 55, 35, -0.5F, -0.475F, -0.45F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.01F;
        this.body.offsetZ = -0.03F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = 0.295F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.1F;
        this.hips.offsetX = 0.55F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.575F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraHypnovenator EntityMegalosaurus = (EntityPrehistoricFloraHypnovenator) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm1, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm1, this.rightarm2, this.rightarm3};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.3F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.3F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.3F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.3F, 0f, f2, 1F);
                    this.walk(this.jaw, 0.1F, 0.05F, true, 3F, 0.05F, f2, 1F);

                    this.walk(this.leftarm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraHypnovenator ee = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 10) / 10) * (0-(12.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.75 + (((tickAnim - 10) / 10) * (0-(7.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26 + (((tickAnim - 10) / 10) * (0-(26)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38 + (((tickAnim - 10) / 10) * (0-(38)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 34.5 + (((tickAnim - 10) / 10) * (0-(34.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 23 + (((tickAnim - 5) / 5) * (-16.5-(23)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.5 + (((tickAnim - 10) / 10) * (0-(-16.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 27 + (((tickAnim - 5) / 5) * (0-(27)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 38.5 + (((tickAnim - 8) / 8) * (0-(38.5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 38.5 + (((tickAnim - 23) / 9) * (0-(38.5)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (38.5-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 38.5 + (((tickAnim - 39) / 11) * (0-(38.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 24 + (((tickAnim - 8) / 4) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -12.5 + (((tickAnim - 12) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24 + (((tickAnim - 23) / 5) * (-12.5-(24)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -12.5 + (((tickAnim - 28) / 4) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (24-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 39) / 11) * (0-(24)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -17 + (((tickAnim - 8) / 4) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -41.75 + (((tickAnim - 12) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 23) / 5) * (-41.75-(-17)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -41.75 + (((tickAnim - 28) / 4) * (0-(-41.75)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -17 + (((tickAnim - 39) / 6) * (-43.85-(-17)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -43.85 + (((tickAnim - 45) / 5) * (0-(-43.85)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.675-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 12) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0.45-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0.675-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 28) / 4) * (0-(0.45)));
            zz = 0.675 + (((tickAnim - 28) / 4) * (0-(0.675)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 7) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 6) * (0.525-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0.65-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 45) / 5) * (0-(0.525)));
            zz = 0.65 + (((tickAnim - 45) / 5) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 65.79 + (((tickAnim - 3) / 5) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 68.5 + (((tickAnim - 8) / 4) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 55.5 + (((tickAnim - 12) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 65.79 + (((tickAnim - 19) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 68.5 + (((tickAnim - 23) / 5) * (55.5-(68.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 55.5 + (((tickAnim - 28) / 4) * (0-(55.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (65.79-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 65.79 + (((tickAnim - 35) / 4) * (68.5-(65.79)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 68.5 + (((tickAnim - 39) / 11) * (0-(68.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 2) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 2) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.41 + (((tickAnim - 3) / 5) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 3) / 5) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 8) / 4) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 8) / 4) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 12) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 12) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.875-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (-0.28-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 18) / 1) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 18) / 1) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 19) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 19) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.975 + (((tickAnim - 23) / 5) * (1.19-(0.975)));
            zz = -0.375 + (((tickAnim - 23) / 5) * (-0.315-(-0.375)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.19 + (((tickAnim - 28) / 4) * (0-(1.19)));
            zz = -0.315 + (((tickAnim - 28) / 4) * (0-(-0.315)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.875-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (-0.28-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.875 + (((tickAnim - 33) / 2) * (0.41-(0.875)));
            zz = -0.28 + (((tickAnim - 33) / 2) * (-0.46-(-0.28)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 0.41 + (((tickAnim - 35) / 4) * (0.975-(0.41)));
            zz = -0.46 + (((tickAnim - 35) / 4) * (-0.375-(-0.46)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 0.975 + (((tickAnim - 39) / 11) * (0-(0.975)));
            zz = -0.375 + (((tickAnim - 39) / 11) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.25 + (((tickAnim - 15) / 20) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.25 + (((tickAnim - 35) / 15) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.275-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -4.1 + (((tickAnim - 15) / 20) * (-4.1-(-4.1)));
            zz = -0.275 + (((tickAnim - 15) / 20) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.1 + (((tickAnim - 35) / 15) * (0-(-4.1)));
            zz = -0.275 + (((tickAnim - 35) / 15) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20.5 + (((tickAnim - 15) / 20) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 35) / 15) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 63.25 + (((tickAnim - 15) / 20) * (63.25-(63.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 63.25 + (((tickAnim - 35) / 15) * (0-(63.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 15) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20.5 + (((tickAnim - 15) / 20) * (-20.5-(-20.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -20.5 + (((tickAnim - 35) / 15) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (63.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 63.25 + (((tickAnim - 15) / 20) * (63.25-(63.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 63.25 + (((tickAnim - 35) / 15) * (0-(63.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -23.25 + (((tickAnim - 15) / 20) * (-23.25-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 35) / 15) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 15) / 20) * (-5-(-5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 35) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 15) / 20) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 15) * (0-(0.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.5 + (((tickAnim - 7) / 8) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 40) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 15 + (((tickAnim - 15) / 20) * (15-(15)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 35) / 5) * (7.25-(15)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 7.25 + (((tickAnim - 40) / 4) * (-5.02-(7.25)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -5.02 + (((tickAnim - 44) / 6) * (0-(-5.02)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 35) / 15) * (0-(10.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 15) / 20) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 35) / 15) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 15) / 20) * (10-(10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (0-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.25 + (((tickAnim - 10) / 3) * (0.75-(2.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.75 + (((tickAnim - 13) / 5) * (7-(0.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 7 + (((tickAnim - 18) / 12) * (0-(7)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 5.5 + (((tickAnim - 10) / 3) * (3.5-(5.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.5 + (((tickAnim - 13) / 5) * (9.25-(3.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 9.25 + (((tickAnim - 18) / 12) * (0-(9.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.94835-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.13955-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (26.72577-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.94835 + (((tickAnim - 10) / 3) * (0-(1.94835)));
            yy = -7.13955 + (((tickAnim - 10) / 3) * (0-(-7.13955)));
            zz = 26.72577 + (((tickAnim - 10) / 3) * (0-(26.72577)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (1.94835-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (-7.13955-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (26.72577-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 1.94835 + (((tickAnim - 18) / 12) * (0-(1.94835)));
            yy = -7.13955 + (((tickAnim - 18) / 12) * (0-(-7.13955)));
            zz = 26.72577 + (((tickAnim - 18) / 12) * (0-(26.72577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.94835-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.13955-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-26.72577-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.94835 + (((tickAnim - 10) / 3) * (0-(1.94835)));
            yy = 7.13955 + (((tickAnim - 10) / 3) * (0-(7.13955)));
            zz = -26.72577 + (((tickAnim - 10) / 3) * (0-(-26.72577)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (1.94835-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (7.13955-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-26.72577-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 1.94835 + (((tickAnim - 18) / 12) * (0-(1.94835)));
            yy = 7.13955 + (((tickAnim - 18) / 12) * (0-(7.13955)));
            zz = -26.72577 + (((tickAnim - 18) / 12) * (0-(-26.72577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (3.5-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.5 + (((tickAnim - 13) / 5) * (7.75-(3.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 18) / 12) * (0-(7.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.25 + (((tickAnim - 10) / 3) * (-0.5-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -0.5 + (((tickAnim - 13) / 5) * (-16.25-(-0.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -16.25 + (((tickAnim - 18) / 12) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -26 + (((tickAnim - 10) / 8) * (-48.5-(-26)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -48.5 + (((tickAnim - 18) / 12) * (0-(-48.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.525-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 8) * (-0.475-(-0.25)));
            zz = 0.525 + (((tickAnim - 10) / 8) * (0.825-(0.525)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -0.475 + (((tickAnim - 18) / 12) * (0-(-0.475)));
            zz = 0.825 + (((tickAnim - 18) / 12) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.75 + (((tickAnim - 10) / 3) * (-4.5-(-18.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4.5 + (((tickAnim - 13) / 5) * (-1.75-(-4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 18) / 12) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 21 + (((tickAnim - 10) / 3) * (7.5-(21)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 13) / 5) * (21-(7.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 21 + (((tickAnim - 18) / 12) * (0-(21)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 30.75 + (((tickAnim - 10) / 3) * (0-(30.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (34-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 34 + (((tickAnim - 18) / 12) * (0-(34)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = -30.25 + (((tickAnim - 40) / 52) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -30.25 + (((tickAnim - 92) / 28) * (0-(-30.25)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            yy = 0.875 + (((tickAnim - 40) / 52) * (0.875-(0.875)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            yy = 0.875 + (((tickAnim - 92) / 28) * (0-(0.875)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 31.75 + (((tickAnim - 40) / 52) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 31.75 + (((tickAnim - 92) / 28) * (0-(31.75)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 31.75 + (((tickAnim - 40) / 52) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 31.75 + (((tickAnim - 92) / 28) * (0-(31.75)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 40) / 52) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 92) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50)) + (((tickAnim - 40) / 52) * (-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50)))));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50)) + (((tickAnim - 92) / 28) * (0-(-4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50)))));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100)) + (((tickAnim - 40) / 52) * (3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100)))));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100)) + (((tickAnim - 92) / 28) * (0-(3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100)))));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150)) + (((tickAnim - 40) / 52) * (12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))-(12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150)))));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150)) + (((tickAnim - 92) / 28) * (0-(12.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150)))));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 19 + (((tickAnim - 40) / 52) * (19-(19)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 19 + (((tickAnim - 92) / 28) * (0-(19)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = -22.75 + (((tickAnim - 40) / 52) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -22.75 + (((tickAnim - 92) / 28) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 22.25 + (((tickAnim - 40) / 52) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 22.25 + (((tickAnim - 92) / 28) * (0-(22.25)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(xx), rightarm3.rotateAngleY + (float) Math.toRadians(yy), rightarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 19 + (((tickAnim - 40) / 52) * (19-(19)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 19 + (((tickAnim - 92) / 28) * (0-(19)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = -22.75 + (((tickAnim - 40) / 52) * (-22.75-(-22.75)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -22.75 + (((tickAnim - 92) / 28) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 22.25 + (((tickAnim - 40) / 52) * (22.25-(22.25)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 22.25 + (((tickAnim - 92) / 28) * (0-(22.25)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(xx), leftarm3.rotateAngleY + (float) Math.toRadians(yy), leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = 16.25 + (((tickAnim - 40) / 52) * (16.25-(16.25)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = 16.25 + (((tickAnim - 92) / 28) * (0-(16.25)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -14.5 + (((tickAnim - 20) / 20) * (-8.75-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 92) {
            xx = -8.75 + (((tickAnim - 40) / 52) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 40) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 52) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -8.75 + (((tickAnim - 92) / 28) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            yy = -0.125 + (((tickAnim - 20) / 100) * (0-(-0.125)));
            zz = 0.25 + (((tickAnim - 20) / 100) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -9 + (((tickAnim - 20) / 20) * (8.25-(-9)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 8.25 + (((tickAnim - 40) / 14) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 8.25 + (((tickAnim - 54) / 4) * (7-(8.25)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 7 + (((tickAnim - 58) / 3) * (8.25-(7)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 92) {
            xx = 8.25 + (((tickAnim - 61) / 31) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 61) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 31) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = 8.25 + (((tickAnim - 92) / 14) * (-9.63-(8.25)));
            yy = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 14) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = -9.63 + (((tickAnim - 106) / 14) * (0-(-9.63)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 20) / 86) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 86) * (-0.05-(0)));
            zz = 0.25 + (((tickAnim - 20) / 86) * (0.265-(0.25)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            yy = -0.05 + (((tickAnim - 106) / 14) * (0-(-0.05)));
            zz = 0.265 + (((tickAnim - 106) / 14) * (0-(0.265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 28 + (((tickAnim - 20) / 20) * (15.25-(28)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 15.25 + (((tickAnim - 40) / 14) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 15.25 + (((tickAnim - 54) / 4) * (11.75-(15.25)));
            yy = 0 + (((tickAnim - 54) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 4) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 61) {
            xx = 11.75 + (((tickAnim - 58) / 3) * (15.25-(11.75)));
            yy = 0 + (((tickAnim - 58) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 3) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 92) {
            xx = 15.25 + (((tickAnim - 61) / 31) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 61) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 31) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = 15.25 + (((tickAnim - 92) / 14) * (27.37-(15.25)));
            yy = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 14) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 120) {
            xx = 27.37 + (((tickAnim - 106) / 14) * (0-(27.37)));
            yy = 0 + (((tickAnim - 106) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = -1.5 + (((tickAnim - 43) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 45) / 3) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = -1.5 + (((tickAnim - 48) / 2) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 54) / 7) * (-17-(0)));
            yy = 0 + (((tickAnim - 54) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 7) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -17 + (((tickAnim - 61) / 2) * (-18-(-17)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = -18 + (((tickAnim - 63) / 3) * (-17-(-18)));
            yy = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 68) {
            xx = -17 + (((tickAnim - 66) / 2) * (-18-(-17)));
            yy = 0 + (((tickAnim - 66) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 2) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = -18 + (((tickAnim - 68) / 3) * (-17-(-18)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 83) {
            xx = -17 + (((tickAnim - 71) / 12) * (-16-(-17)));
            yy = 0 + (((tickAnim - 71) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 12) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 92) {
            xx = -16 + (((tickAnim - 83) / 9) * (-17-(-16)));
            yy = 0 + (((tickAnim - 83) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 9) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 120) {
            xx = -17 + (((tickAnim - 92) / 28) * (0-(-17)));
            yy = 0 + (((tickAnim - 92) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 48 && tickAnim < 52) {
            xx = 1 + (((tickAnim - 48) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 4) * (0.035-(1)));
            zz = 1 + (((tickAnim - 48) / 4) * (1-(1)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 1 + (((tickAnim - 52) / 4) * (1-(1)));
            yy = 0.035 + (((tickAnim - 52) / 4) * (1-(0.035)));
            zz = 1 + (((tickAnim - 52) / 4) * (1-(1)));
        }
        else if (tickAnim >= 56 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 56) / 27) * (1-(1)));
            yy = 1 + (((tickAnim - 56) / 27) * (1-(1)));
            zz = 1 + (((tickAnim - 56) / 27) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 83) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 83) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 83) / 5) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 88) / 4) * (1-(1)));
            yy = 0.035 + (((tickAnim - 88) / 4) * (1-(0.035)));
            zz = 1 + (((tickAnim - 88) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 48 && tickAnim < 52) {
            xx = 1 + (((tickAnim - 48) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 4) * (0.035-(1)));
            zz = 1 + (((tickAnim - 48) / 4) * (1-(1)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 1 + (((tickAnim - 52) / 4) * (1-(1)));
            yy = 0.035 + (((tickAnim - 52) / 4) * (1-(0.035)));
            zz = 1 + (((tickAnim - 52) / 4) * (1-(1)));
        }
        else if (tickAnim >= 56 && tickAnim < 83) {
            xx = 1 + (((tickAnim - 56) / 27) * (1-(1)));
            yy = 1 + (((tickAnim - 56) / 27) * (1-(1)));
            zz = 1 + (((tickAnim - 56) / 27) * (1-(1)));
        }
        else if (tickAnim >= 83 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 83) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 83) / 5) * (0.035-(1)));
            zz = 1 + (((tickAnim - 83) / 5) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 92) {
            xx = 1 + (((tickAnim - 88) / 4) * (1-(1)));
            yy = 0.035 + (((tickAnim - 88) / 4) * (1-(0.035)));
            zz = 1 + (((tickAnim - 88) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 16 + (((tickAnim - 40) / 60) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 16 + (((tickAnim - 100) / 20) * (0-(16)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-6.15-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = -6.15 + (((tickAnim - 40) / 60) * (-6.15-(-6.15)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -6.15 + (((tickAnim - 100) / 20) * (0-(-6.15)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -33.75 + (((tickAnim - 40) / 60) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -33.75 + (((tickAnim - 100) / 20) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (55.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 55.5 + (((tickAnim - 40) / 60) * (55.5-(55.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 55.5 + (((tickAnim - 100) / 20) * (0-(55.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-59.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -59.5 + (((tickAnim - 40) / 60) * (-59.5-(-59.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -59.5 + (((tickAnim - 100) / 20) * (0-(-59.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = -0.6 + (((tickAnim - 40) / 60) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = -0.6 + (((tickAnim - 100) / 20) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 20.25 + (((tickAnim - 40) / 60) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 20.25 + (((tickAnim - 100) / 20) * (0-(20.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -33.75 + (((tickAnim - 40) / 60) * (-33.75-(-33.75)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -33.75 + (((tickAnim - 100) / 20) * (0-(-33.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (55.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 55.5 + (((tickAnim - 40) / 60) * (55.5-(55.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 55.5 + (((tickAnim - 100) / 20) * (0-(55.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-59.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -59.5 + (((tickAnim - 40) / 60) * (-59.5-(-59.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -59.5 + (((tickAnim - 100) / 20) * (0-(-59.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.6-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = -0.6 + (((tickAnim - 40) / 60) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = -0.6 + (((tickAnim - 100) / 20) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 20.25 + (((tickAnim - 40) / 60) * (20.25-(20.25)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 20.25 + (((tickAnim - 100) / 20) * (0-(20.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2 + (((tickAnim - 40) / 60) * (15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2 + (((tickAnim - 100) / 20) * (0-(15.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-16+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -16+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2 + (((tickAnim - 40) / 60) * (6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2-(-16+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2 + (((tickAnim - 100) / 20) * (0-(6.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-7.3645682835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (1.99852-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-1.49109-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -7.3645682835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2 + (((tickAnim - 40) / 60) * (17.6354+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2-(-7.3645682835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2)));
            yy = 1.99852 + (((tickAnim - 40) / 60) * (1.99852-(1.99852)));
            zz = -1.49109 + (((tickAnim - 40) / 60) * (-1.49109-(-1.49109)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 17.6354+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2 + (((tickAnim - 100) / 20) * (0-(17.6354+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2)));
            yy = 1.99852 + (((tickAnim - 100) / 20) * (0-(1.99852)));
            zz = -1.49109 + (((tickAnim - 100) / 20) * (0-(-1.49109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -12 + (((tickAnim - 40) / 60) * (-12-(-12)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 108) {
            xx = -12 + (((tickAnim - 100) / 8) * (23-(-12)));
            yy = 0 + (((tickAnim - 100) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 8) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 23 + (((tickAnim - 108) / 12) * (0-(23)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5 + (((tickAnim - 40) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5 + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900))*0.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5 + (((tickAnim - 40) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5 + (((tickAnim - 100) / 20) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-50))*0.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.39281-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-16.0119-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 6.39281 + (((tickAnim - 40) / 60) * (6.39281-(6.39281)));
            yy = -16.0119 + (((tickAnim - 40) / 60) * (-16.0119-(-16.0119)));
            zz = 49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3 + (((tickAnim - 40) / 60) * (49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3-(49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 6.39281 + (((tickAnim - 100) / 20) * (0-(6.39281)));
            yy = -16.0119 + (((tickAnim - 100) / 20) * (0-(-16.0119)));
            zz = 49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3 + (((tickAnim - 100) / 20) * (0-(49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (6.39281-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (16.0119-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 6.39281 + (((tickAnim - 40) / 60) * (6.39281-(6.39281)));
            yy = 16.0119 + (((tickAnim - 40) / 60) * (16.0119-(16.0119)));
            zz = -49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3 + (((tickAnim - 40) / 60) * (-49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3-(-49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 6.39281 + (((tickAnim - 100) / 20) * (0-(6.39281)));
            yy = 16.0119 + (((tickAnim - 100) / 20) * (0-(16.0119)));
            zz = -49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3 + (((tickAnim - 100) / 20) * (0-(-49.9639505446+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2 + (((tickAnim - 40) / 60) * (8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2 + (((tickAnim - 100) / 20) * (0-(8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-100))*2)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = -0.25 + (((tickAnim - 40) / 60) * (-0.25-(-0.25)));
            zz = 1 + (((tickAnim - 40) / 60) * (1-(1)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -0.25 + (((tickAnim - 100) / 20) * (0-(-0.25)));
            zz = 1 + (((tickAnim - 100) / 20) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = -19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2 + (((tickAnim - 40) / 60) * (9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2-(-19.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2 + (((tickAnim - 100) / 20) * (0-(9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-150))*2)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.325-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = -0.4 + (((tickAnim - 40) / 60) * (-0.4-(-0.4)));
            zz = 0.325 + (((tickAnim - 40) / 60) * (0.325-(0.325)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 100) / 20) * (0-(-0.4)));
            zz = 0.325 + (((tickAnim - 100) / 20) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (34.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 34.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2 + (((tickAnim - 40) / 60) * (13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2-(34.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2 + (((tickAnim - 100) / 20) * (0-(13.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-200))*2)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (38.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 38.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3 + (((tickAnim - 40) / 60) * (-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3-(38.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3 + (((tickAnim - 100) / 20) * (0-(-8.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-250))*3)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.225-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0.225 + (((tickAnim - 40) / 60) * (0.225-(0.225)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 100) / 20) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 100) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5 + (((tickAnim - 40) / 60) * (-23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5)));
            yy = 0 + (((tickAnim - 40) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 60) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5 + (((tickAnim - 100) / 20) * (0-(-23.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*900-300))*5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*-6), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+20))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+100))*1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 34.25 + (((tickAnim - 0) / 6) * (-35.5-(34.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -35.5 + (((tickAnim - 6) / 4) * (34.25-(-35.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 14.75 + (((tickAnim - 0) / 1) * (26.68-(14.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 6) {
            xx = 26.68 + (((tickAnim - 1) / 5) * (-1.5-(26.68)));
            yy = 0 + (((tickAnim - 1) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 5) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 6) / 4) * (14.75-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -0.525 + (((tickAnim - 6) / 4) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (-29.43-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -29.43 + (((tickAnim - 3) / 1) * (-29.43-(-29.43)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -29.43 + (((tickAnim - 4) / 2) * (24.75-(-29.43)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 24.75 + (((tickAnim - 6) / 4) * (27.5-(24.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -0.125 + (((tickAnim - 3) / 1) * (-0.125-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.75 + (((tickAnim - 0) / 3) * (53.89-(27.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 53.89 + (((tickAnim - 3) / 1) * (53.89-(53.89)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 53.89 + (((tickAnim - 4) / 2) * (22.25-(53.89)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 22.25 + (((tickAnim - 6) / 1) * (-5.75-(22.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 7) / 1) * (-24.75-(-5.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.75 + (((tickAnim - 8) / 2) * (27.75-(-24.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.475 + (((tickAnim - 0) / 3) * (0.95-(1.475)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 3) / 1) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 4) / 2) * (0-(0.95)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (1.95-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.95 + (((tickAnim - 7) / 1) * (0.525-(1.95)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 0) * (-0.295-(0.525)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.295 + (((tickAnim - 8) / 2) * (1.475-(-0.295)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 28.5 + (((tickAnim - 0) / 6) * (0-(28.5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (28.5-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 6) * (0-(-0.1)));
            zz = 0.15 + (((tickAnim - 0) / 6) * (0-(0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -35.5 + (((tickAnim - 0) / 4) * (34.25-(-35.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 34.25 + (((tickAnim - 4) / 6) * (-35.5-(34.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1.5 + (((tickAnim - 0) / 4) * (14.75-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 14.75 + (((tickAnim - 4) / 1) * (26.68-(14.75)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 26.68 + (((tickAnim - 5) / 5) * (-1.5-(26.68)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 4) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 24.75 + (((tickAnim - 0) / 1) * (11.55-(24.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 11.55 + (((tickAnim - 1) / 3) * (27.5-(11.55)));
            yy = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 4) / 3) * (-29.43-(27.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -29.43 + (((tickAnim - 7) / 1) * (-29.43-(-29.43)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -29.43 + (((tickAnim - 8) / 2) * (24.75-(-29.43)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.125-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = -0.125 + (((tickAnim - 7) / 1) * (-0.125-(-0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 22.25 + (((tickAnim - 0) / 1) * (12-(22.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 1) / 2) * (-12.87-(12)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -12.87 + (((tickAnim - 3) / 1) * (27.75-(-12.87)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 27.75 + (((tickAnim - 4) / 3) * (53.89-(27.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 53.89 + (((tickAnim - 7) / 1) * (53.89-(53.89)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 53.89 + (((tickAnim - 8) / 2) * (22.25-(53.89)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.45 + (((tickAnim - 1) / 1) * (1.575-(1.45)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.575 + (((tickAnim - 2) / 1) * (-0.35-(1.575)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 1) * (0.92-(-0.35)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.92 + (((tickAnim - 4) / 2) * (1.54-(0.92)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 1.54 + (((tickAnim - 6) / 1) * (0.95-(1.54)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 7) / 1) * (0.95-(0.95)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 8) / 2) * (0-(0.95)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (28.5-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 28.5 + (((tickAnim - 4) / 6) * (0-(28.5)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.15-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 4) / 6) * (0-(-0.1)));
            zz = 0.15 + (((tickAnim - 4) / 6) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+90))*6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-8), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+140))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*15), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+180))*2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*20), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+230))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*25), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+150))*4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+250))*-8), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+190))*8));


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(14.25811), rightarm1.rotateAngleY + (float) Math.toRadians(-11.77907), rightarm1.rotateAngleZ + (float) Math.toRadians(6.32279));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-18.25), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(41), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(14.25811), leftarm1.rotateAngleY + (float) Math.toRadians(11.77907), leftarm1.rotateAngleZ + (float) Math.toRadians(-6.32279));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(-18.25), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(41), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(14.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+300))*10), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(-0.2);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(19.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+350))*-13), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(8.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5+400))*15), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-24.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHypnovenator entity = (EntityPrehistoricFloraHypnovenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+90))*-5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+20))*0.7);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+120))*-1);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 26.25 + (((tickAnim - 0) / 10) * (-13.25-(26.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.25 + (((tickAnim - 10) / 10) * (26.25-(-13.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 32 + (((tickAnim - 0) / 2) * (31.25-(32)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 31.25 + (((tickAnim - 2) / 8) * (-12.25-(31.25)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.25 + (((tickAnim - 10) / 10) * (32-(-12.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.75 + (((tickAnim - 0) / 5) * (-49.62-(3.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -49.62 + (((tickAnim - 5) / 2) * (-49.62-(-49.62)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -49.62 + (((tickAnim - 7) / 3) * (12.5-(-49.62)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 10) / 10) * (3.75-(12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 2) * (-0.225-(-0.225)));
            zz = -0.425 + (((tickAnim - 5) / 2) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 3) * (-0.47-(-0.225)));
            zz = -0.425 + (((tickAnim - 7) / 3) * (-0.32-(-0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.47 + (((tickAnim - 10) / 10) * (0-(-0.47)));
            zz = -0.32 + (((tickAnim - 10) / 10) * (0-(-0.32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 44.25 + (((tickAnim - 0) / 5) * (63.63-(44.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 63.63 + (((tickAnim - 5) / 2) * (63.63-(63.63)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 63.63 + (((tickAnim - 7) / 3) * (18.75-(63.63)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 18.75 + (((tickAnim - 10) / 5) * (-19.12-(18.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -19.12 + (((tickAnim - 15) / 3) * (45.82-(-19.12)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 45.82 + (((tickAnim - 18) / 2) * (44.25-(45.82)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0.2 + (((tickAnim - 5) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0.325-(0)));
            zz = 0.2 + (((tickAnim - 7) / 3) * (0.225-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.325 + (((tickAnim - 10) / 3) * (0.99-(0.325)));
            zz = 0.225 + (((tickAnim - 10) / 3) * (0-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 13) / 2) * (-0.04-(0.99)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.04 + (((tickAnim - 15) / 5) * (0-(-0.04)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 58.5 + (((tickAnim - 0) / 10) * (0-(58.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (58.5-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSickleClaw, rightSickleClaw.rotateAngleX + (float) Math.toRadians(xx), rightSickleClaw.rotateAngleY + (float) Math.toRadians(yy), rightSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 21.75 + (((tickAnim - 0) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (-58.37-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -58.37 + (((tickAnim - 18) / 2) * (21.75-(-58.37)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg5, rightleg5.rotateAngleX + (float) Math.toRadians(xx), rightleg5.rotateAngleY + (float) Math.toRadians(yy), rightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 10) * (0-(-0.225)));
            zz = 0.15 + (((tickAnim - 0) / 10) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.185-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.185 + (((tickAnim - 18) / 2) * (-0.225-(-0.185)));
            zz = -0.12 + (((tickAnim - 18) / 2) * (0.15-(-0.12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg5.rotationPointX = this.rightleg5.rotationPointX + (float)(xx);
        this.rightleg5.rotationPointY = this.rightleg5.rotationPointY - (float)(yy);
        this.rightleg5.rotationPointZ = this.rightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 0) / 10) * (26.25-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 26.25 + (((tickAnim - 10) / 10) * (-13.25-(26.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.25 + (((tickAnim - 0) / 10) * (32-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 32 + (((tickAnim - 10) / 2) * (31.25-(32)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 31.25 + (((tickAnim - 12) / 8) * (-12.25-(31.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 0) / 10) * (3.75-(12.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 3.75 + (((tickAnim - 10) / 5) * (-49.62-(3.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -49.62 + (((tickAnim - 15) / 2) * (-49.62-(-49.62)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -49.62 + (((tickAnim - 17) / 3) * (12.5-(-49.62)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 10) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.425-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 15) / 2) * (-0.225-(-0.225)));
            zz = -0.425 + (((tickAnim - 15) / 2) * (-0.425-(-0.425)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 17) / 3) * (-0.275-(-0.225)));
            zz = -0.425 + (((tickAnim - 17) / 3) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20.25 + (((tickAnim - 0) / 5) * (-19.12-(20.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -19.12 + (((tickAnim - 5) / 3) * (45.82-(-19.12)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 45.82 + (((tickAnim - 8) / 2) * (44.25-(45.82)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 44.25 + (((tickAnim - 10) / 5) * (63.63-(44.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 63.63 + (((tickAnim - 15) / 2) * (63.63-(63.63)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 63.63 + (((tickAnim - 17) / 3) * (20.25-(63.63)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0.15 + (((tickAnim - 0) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (-0.04-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.04 + (((tickAnim - 5) / 5) * (0-(-0.04)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0.2 + (((tickAnim - 15) / 2) * (0.2-(0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0.2 + (((tickAnim - 17) / 3) * (0.15-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSickleClaw, leftSickleClaw.rotateAngleX + (float) Math.toRadians(xx), leftSickleClaw.rotateAngleY + (float) Math.toRadians(yy), leftSickleClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-58.37-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -58.37 + (((tickAnim - 8) / 2) * (21.75-(-58.37)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 21.75 + (((tickAnim - 10) / 10) * (0-(21.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg5, leftleg5.rotateAngleX + (float) Math.toRadians(xx), leftleg5.rotateAngleY + (float) Math.toRadians(yy), leftleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.185-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.185 + (((tickAnim - 8) / 2) * (-0.225-(-0.185)));
            zz = -0.12 + (((tickAnim - 8) / 2) * (0.15-(-0.12)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.225 + (((tickAnim - 10) / 10) * (0-(-0.225)));
            zz = 0.15 + (((tickAnim - 10) / 10) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg5.rotationPointX = this.leftleg5.rotationPointX + (float)(xx);
        this.leftleg5.rotationPointY = this.leftleg5.rotationPointY - (float)(yy);
        this.leftleg5.rotationPointZ = this.leftleg5.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-10), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*3));
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(0);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(0);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*0.3);


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*5), rightarm1.rotateAngleY + (float) Math.toRadians(0), rightarm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*-3));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*-7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm3, rightarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+280))*-10), rightarm3.rotateAngleY + (float) Math.toRadians(0), rightarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+200))*5), leftarm1.rotateAngleY + (float) Math.toRadians(0), leftarm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+300))*-3));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*-7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm3, leftarm3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+280))*-10), leftarm3.rotateAngleY + (float) Math.toRadians(0), leftarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*6), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(0);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(0);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(0);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+250))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+350))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+400))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHypnovenator e = (EntityPrehistoricFloraHypnovenator) entity;
        animator.update(entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}
