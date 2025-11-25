package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTyrannomimus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTyrannomimus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer rightarm1;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightfinger;
    private final AdvancedModelRenderer leftarm1;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer leftfinger;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer throat;
    private ModelAnimator animator;

    public ModelTyrannomimus() {
        this.textureWidth = 93;
        this.textureHeight = 92;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 7.125F, 0.4F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 68, -1.0F, 1.0F, -1.0F, 2, 1, 7, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 59, -2.0F, 1.0F, -1.0F, 4, 1, 7, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 29, -2.5F, -7.0F, -1.0F, 5, 8, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -5.0F, 4.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 74, -4.0F, -2.0F, -1.0F, 5, 3, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, -5.25F, 0.0F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 44, -4.0F, -2.0F, -1.0F, 5, 3, 5, 0.02F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -4.85F, 6.3F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 24, 29, -2.0F, -1.55F, -0.3F, 4, 4, 8, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 54, 11, -1.5F, 2.45F, -0.3F, 3, 1, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 1.4F, 4.7F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 70, 20, -3.0F, -3.0F, -1.0F, 4, 3, 5, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 1.15F, 0.7F);
        this.tail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 67, -3.0F, -3.0F, -1.0F, 4, 3, 5, 0.02F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 7.75F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 23, -1.5F, -1.3F, -1.05F, 3, 3, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, 0.7F, 3.95F);
        this.tail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.2217F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 60, 0.0F, 0.0F, -5.0F, 3, 0, 8, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.7F, 3.95F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.2217F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 60, -3.0F, 0.0F, -5.0F, 3, 0, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 44, -1.0F, -1.05F, -1.05F, 2, 2, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.45F, 4.95F);
        this.tail3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.8727F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 0, 0.0F, 0.0F, -5.0F, 3, 0, 8, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.45F, 4.95F);
        this.tail3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.8727F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 0, -3.0F, 0.0F, -5.0F, 3, 0, 8, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 30, 11, -0.5F, -0.55F, -1.05F, 1, 1, 11, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -0.05F, 4.95F);
        this.tail4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 0, -0.6F, 0.0F, -5.0F, 4, 0, 11, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -0.05F, 4.95F);
        this.tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 0, -3.4F, 0.0F, -5.0F, 4, 0, 11, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-2.5F, -3.6F, 2.0F);
        this.hips.addChild(rightleg1);
        this.setRotateAngle(rightleg1, -0.2618F, 0.0F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 55, -1.25F, -1.5F, -2.1F, 3, 9, 5, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.25F, 7.5F, -1.0F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.8727F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 74, 74, -1.25F, -1.0F, -0.5F, 2, 10, 3, 0.0F, false));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 48, 75, 0.25F, -1.0F, -0.5F, 1, 10, 3, -0.01F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 9.0F, 1.0F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.7854F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 56, 81, -1.0F, -1.0F, -1.0F, 2, 7, 2, 0.0F, false));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.9F, -0.25F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.1745F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 80, 0, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 80, 4, -1.5F, -0.5F, -2.5F, 3, 1, 3, -0.01F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(2.5F, -3.6F, 2.0F);
        this.hips.addChild(leftleg1);
        this.setRotateAngle(leftleg1, -0.2618F, 0.0F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 0, 55, -1.75F, -1.5F, -2.1F, 3, 9, 5, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.25F, 7.5F, -1.0F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.8727F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 74, 74, -0.75F, -1.0F, -0.5F, 2, 10, 3, 0.0F, true));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 48, 75, -1.25F, -1.0F, -0.5F, 1, 10, 3, -0.01F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 9.0F, 1.0F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.7854F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 56, 81, -1.0F, -1.0F, -1.0F, 2, 7, 2, 0.0F, true));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.9F, -0.25F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.1745F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 80, 0, -1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F, true));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 80, 4, -1.5F, -0.5F, -2.5F, 3, 1, 3, -0.01F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -0.5F);
        this.hips.addChild(body);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 8.1F, -6.0F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 50, 0.0F, 0.0F, -1.0F, 3, 1, 8, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 41, -1.0F, 0.0F, -1.0F, 5, 1, 8, 0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.5F, -8.0F, -1.0F, 6, 8, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.025F, -6.2F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 16, -3.0F, -4.0F, -1.0F, 6, 4, 9, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.85F, -7.5F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 22, 50, -2.5F, -1.5F, -5.25F, 5, 4, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 2.5F, -5.15F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6283F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 75, 0.0F, 0.0F, 0.0F, 1, 1, 6, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 66, 52, -1.5F, 0.0F, 0.0F, 4, 1, 6, -0.01F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 34, -2.0F, -4.0F, 0.0F, 5, 4, 6, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.25F, 1.425F, -1.65F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 35, -2.75F, -3.0F, -1.0F, 5, 3, 4, 0.02F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.25F, 1.375F, -4.15F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 28, -2.75F, -3.0F, -1.0F, 5, 3, 4, 0.01F, false));

        this.rightarm1 = new AdvancedModelRenderer(this);
        this.rightarm1.setRotationPoint(-2.5F, 2.25F, -4.4F);
        this.chest.addChild(rightarm1);
        this.setRotateAngle(rightarm1, 0.7418F, -0.1745F, 0.0F);
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 64, 81, -0.75F, -0.25F, -1.0F, 1, 7, 2, 0.0F, false));
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 26, 76, -0.5F, 0.75F, 1.0F, 0, 7, 4, 0.0F, false));
        this.rightarm1.cubeList.add(new ModelBox(rightarm1, 0, 82, -0.15F, -0.25F, -1.0F, 1, 7, 2, -0.01F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.45F, 6.5F, -0.25F);
        this.rightarm1.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -1.0036F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 44, 23, -0.25F, -0.5F, -0.7F, 1, 5, 1, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 66, 59, 0.0F, -3.75F, -0.7F, 0, 9, 6, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 12, 69, -0.25F, -0.5F, -0.45F, 1, 5, 1, -0.01F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 42, 82, -0.05F, -0.5F, -0.45F, 1, 5, 1, -0.02F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 70, 81, -0.05F, -0.5F, -0.7F, 1, 5, 1, -0.01F, false));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.025F, 4.25F, -0.1F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.1309F, 0.0F, 0.0F);
        this.righthand.cubeList.add(new ModelBox(righthand, 56, 72, 0.0F, 0.15F, -0.575F, 1, 1, 1, 0.0F, false));
        this.righthand.cubeList.add(new ModelBox(righthand, 38, 60, 0.0F, 1.15F, -0.575F, 1, 6, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.0F, 0.025F);
        this.righthand.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 68, 0.004F, -0.45F, -0.5F, 1, 6, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.025F, 0.95F, -0.6F);
        this.righthand.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 69, -0.01F, 0.05F, 0.0F, 0, 7, 6, 0.0F, false));

        this.rightfinger = new AdvancedModelRenderer(this);
        this.rightfinger.setRotationPoint(0.0F, 0.4F, -0.25F);
        this.righthand.addChild(rightfinger);
        this.setRotateAngle(rightfinger, -0.3491F, 0.0F, 0.0F);
        this.rightfinger.cubeList.add(new ModelBox(rightfinger, 14, 83, 0.005F, 0.25F, -0.5F, 1, 5, 1, 0.0F, false));

        this.leftarm1 = new AdvancedModelRenderer(this);
        this.leftarm1.setRotationPoint(2.5F, 2.25F, -4.4F);
        this.chest.addChild(leftarm1);
        this.setRotateAngle(leftarm1, 0.7418F, 0.1745F, 0.0F);
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 64, 81, -0.25F, -0.25F, -1.0F, 1, 7, 2, 0.0F, true));
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 26, 76, 0.5F, 0.75F, 1.0F, 0, 7, 4, 0.0F, true));
        this.leftarm1.cubeList.add(new ModelBox(leftarm1, 0, 82, -0.85F, -0.25F, -1.0F, 1, 7, 2, -0.01F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.45F, 6.5F, -0.25F);
        this.leftarm1.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -1.0036F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 44, 23, -0.75F, -0.5F, -0.7F, 1, 5, 1, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 66, 59, 0.0F, -3.75F, -0.7F, 0, 9, 6, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 12, 69, -0.75F, -0.5F, -0.45F, 1, 5, 1, -0.01F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 42, 82, -0.95F, -0.5F, -0.45F, 1, 5, 1, -0.02F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 70, 81, -0.95F, -0.5F, -0.7F, 1, 5, 1, -0.01F, true));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.025F, 4.25F, -0.1F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.1309F, 0.0F, 0.0F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 56, 72, -1.0F, 0.15F, -0.575F, 1, 1, 1, 0.0F, true));
        this.lefthand.cubeList.add(new ModelBox(lefthand, 38, 60, -1.0F, 1.15F, -0.575F, 1, 6, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.0F, 0.025F);
        this.lefthand.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 68, -1.004F, -0.45F, -0.5F, 1, 6, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.025F, 0.95F, -0.6F);
        this.lefthand.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 69, 0.01F, 0.05F, 0.0F, 0, 7, 6, 0.0F, true));

        this.leftfinger = new AdvancedModelRenderer(this);
        this.leftfinger.setRotationPoint(0.0F, 0.4F, -0.25F);
        this.lefthand.addChild(leftfinger);
        this.setRotateAngle(leftfinger, -0.3491F, 0.0F, 0.0F);
        this.leftfinger.cubeList.add(new ModelBox(leftfinger, 14, 83, -1.005F, 0.25F, -0.5F, 1, 5, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.5F, -5.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5672F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 76, 8, -1.5F, -1.5F, -2.75F, 3, 3, 4, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 76, 15, -1.0F, 1.5F, -2.75F, 2, 1, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, 0.25F, -1.55F);
        this.neck1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 44, -2.0F, -2.0F, -1.0F, 3, 2, 4, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -2.75F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.4363F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 12, 76, -1.0F, -1.0F, -4.25F, 2, 2, 5, 0.01F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 30, 23, -1.0F, 0.5F, -4.25F, 2, 1, 5, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 78, 65, -0.5F, 1.5F, -4.25F, 1, 1, 5, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 78, 59, -1.0F, -1.0F, -3.25F, 2, 2, 4, -0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.0F, -3.25F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.5672F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 34, 82, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 37, 86, 1.01F, 0.4F, -1.7F, 0, 1, 1, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 37, 86, -1.01F, 0.4F, -1.7F, 0, 1, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.8F, -1.45F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 54, 20, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 62, 20, -1.0F, -0.45F, -2.0F, 2, 1, 2, 0.02F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.45F, -2.0F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 72, 42, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.5672F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 67, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, 1.3F, -0.95F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 16, 57, -1.0F, -2.0F, -1.0F, 2, 1, 1, 0.03F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.525F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 8, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 16, 55, -1.0F, -0.9F, -1.75F, 2, 1, 1, -0.02F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 72, 0.0F, 0.0F, -0.95F, 1, 1, 1, -0.02F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 83, 0.0F, 0.0F, -3.2F, 1, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.5236F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 66, 8, -1.0F, -1.0F, -0.1F, 2, 1, 2, -0.02F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(neck4, 0.7025F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.7025F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.neck1.offsetY = -0F;
        this.neck1.offsetX = -0F;
        this.neck1.offsetZ = -0.02F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(throat, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.096F, 0.0F);
        this.setRotateAngle(tail3, -0.0875F, -0.0782F, 0.0069F);
        this.setRotateAngle(tail2, 0.0F, -0.0916F, 0.0F);
        this.setRotateAngle(tail1, 0.0439F, 0.1003F, 0.0044F);
        this.setRotateAngle(righttoes, 0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, -0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg2, 1.1039F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg1, 0.1658F, 0.0F, 0.0F);
        this.setRotateAngle(righthand, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(rightfoot, 0.781F, 0.0F, 0.0F);
        this.setRotateAngle(rightfinger, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm2, -2.1991F, 0.0F, 0.0F);
        this.setRotateAngle(rightarm1, 0.9687F, -0.1745F, 0.0F);
        this.setRotateAngle(neck4, 0.7025F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.7025F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, -0.5323F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg2, 0.6728F, -0.004F, -0.0044F);
        this.setRotateAngle(leftleg1, -0.576F, 0.0F, 0.0F);
        this.setRotateAngle(lefthand, 0.6894F, 0.0F, 0.0F);
        this.setRotateAngle(leftfoot, 0.432F, 0.0F, 0.0F);
        this.setRotateAngle(leftfinger, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm2, -2.1991F, 0.0F, 0.0F);
        this.setRotateAngle(leftarm1, 0.9687F, 0.1745F, 0.0F);
        this.setRotateAngle(jaw, 0.0524F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.8727F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.8727F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -1.2217F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.2217F);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, 0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r22, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.6283F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.0436F, 0.0F, 0.0F);
        this.hips.offsetY = -0.08F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.35F;
        this.hips.offsetX = 0.15F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(-2);
        this.hips.rotateAngleZ = (float)Math.toRadians(2);
        this.hips.scaleChildren = true;
        float scaler = 0.8F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraTyrannomimus entityTyrannomimus = (EntityPrehistoricFloraTyrannomimus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, neck4);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm1, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightarm1, this.rightarm2, this.righthand};

        entityTyrannomimus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityTyrannomimus.getAnimation() == entityTyrannomimus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityTyrannomimus.isReallyInWater()) {

                if (f3 == 0.0F || !entityTyrannomimus.getIsMoving()) {
                    if (entityTyrannomimus.getAnimation() != entityTyrannomimus.EAT_ANIMATION
                        && entityTyrannomimus.getAnimation() != entityTyrannomimus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityTyrannomimus.getIsFast()) { //Running


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
        EntityPrehistoricFloraTyrannomimus ee = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;

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
            else {
                //moving in water
                //
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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_LEFT_ANIMATION) { //The noise anim
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.88257-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-2.24331-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.11958-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 8.88257 + (((tickAnim - 60) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 60) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 60) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 8.93179 + (((tickAnim - 70) / 10) * (8.88257-(8.93179)));
            yy = -2.26715 + (((tickAnim - 70) / 10) * (-2.24331-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 70) / 10) * (1.11958-(-0.13116)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 8.88257 + (((tickAnim - 80) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 80) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 80) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.93179 + (((tickAnim - 90) / 10) * (8.88257-(8.93179)));
            yy = -2.26715 + (((tickAnim - 90) / 10) * (-2.24331-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 90) / 10) * (1.11958-(-0.13116)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 8.88257 + (((tickAnim - 100) / 10) * (8.93179-(8.88257)));
            yy = -2.24331 + (((tickAnim - 100) / 10) * (-2.26715-(-2.24331)));
            zz = 1.11958 + (((tickAnim - 100) / 10) * (-0.13116-(1.11958)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 8.93179 + (((tickAnim - 110) / 30) * (0-(8.93179)));
            yy = -2.26715 + (((tickAnim - 110) / 30) * (0-(-2.26715)));
            zz = -0.13116 + (((tickAnim - 110) / 30) * (0-(-0.13116)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.85-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            yy = -0.25 + (((tickAnim - 60) / 50) * (-0.25-(-0.25)));
            zz = 0.85 + (((tickAnim - 60) / 50) * (0.85-(0.85)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = -0.25 + (((tickAnim - 110) / 30) * (0-(-0.25)));
            zz = 0.85 + (((tickAnim - 110) / 30) * (0-(0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -12 + (((tickAnim - 60) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -11.99791 + (((tickAnim - 70) / 10) * (-12-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 70) / 10) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 70) / 10) * (0-(-1.74461)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -12 + (((tickAnim - 80) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -11.99791 + (((tickAnim - 90) / 10) * (-12-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 90) / 10) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 90) / 10) * (0-(-1.74461)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -12 + (((tickAnim - 100) / 10) * (-11.99791-(-12)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.13728-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-1.74461-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -11.99791 + (((tickAnim - 110) / 30) * (0-(-11.99791)));
            yy = -0.13728 + (((tickAnim - 110) / 30) * (0-(-0.13728)));
            zz = -1.74461 + (((tickAnim - 110) / 30) * (0-(-1.74461)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9 + (((tickAnim - 60) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -8.99679 + (((tickAnim - 70) / 10) * (-9-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 70) / 10) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 70) / 10) * (0-(-3.74872)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -9 + (((tickAnim - 80) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -8.99679 + (((tickAnim - 90) / 10) * (-9-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 90) / 10) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 90) / 10) * (0-(-3.74872)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -9 + (((tickAnim - 100) / 10) * (-8.99679-(-9)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.09809-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-3.74872-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -8.99679 + (((tickAnim - 110) / 30) * (0-(-8.99679)));
            yy = -0.09809 + (((tickAnim - 110) / 30) * (0-(-0.09809)));
            zz = -3.74872 + (((tickAnim - 110) / 30) * (0-(-3.74872)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -14 + (((tickAnim - 60) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -13.98787 + (((tickAnim - 70) / 10) * (-14-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 70) / 10) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 70) / 10) * (0-(-2.96313)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -14 + (((tickAnim - 80) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -13.98787 + (((tickAnim - 90) / 10) * (-14-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 90) / 10) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 90) / 10) * (0-(-2.96313)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -14 + (((tickAnim - 100) / 10) * (-13.98787-(-14)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.46909-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-2.96313-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -13.98787 + (((tickAnim - 110) / 30) * (0-(-13.98787)));
            yy = -0.46909 + (((tickAnim - 110) / 30) * (0-(-0.46909)));
            zz = -2.96313 + (((tickAnim - 110) / 30) * (0-(-2.96313)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 70) / 10) * (0-(-3.75)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = -3.75 + (((tickAnim - 90) / 10) * (0-(-3.75)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-3.75-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = -3.75 + (((tickAnim - 110) / 30) * (0-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-47.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -47.25 + (((tickAnim - 60) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -53.5 + (((tickAnim - 70) / 10) * (-47.25-(-53.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -47.25 + (((tickAnim - 80) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -53.5 + (((tickAnim - 90) / 10) * (-47.25-(-53.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -47.25 + (((tickAnim - 100) / 10) * (-53.5-(-47.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -53.5 + (((tickAnim - 110) / 30) * (0-(-53.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8.51-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 8.51 + (((tickAnim - 23) / 37) * (-4.25-(8.51)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -4.25 + (((tickAnim - 60) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -1.25 + (((tickAnim - 70) / 10) * (-4.25-(-1.25)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -4.25 + (((tickAnim - 80) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -1.25 + (((tickAnim - 90) / 10) * (-4.25-(-1.25)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -4.25 + (((tickAnim - 100) / 10) * (-1.25-(-4.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -1.25 + (((tickAnim - 110) / 30) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.09-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 60) {
            xx = 17.09 + (((tickAnim - 15) / 45) * (-47.75-(17.09)));
            yy = 0 + (((tickAnim - 15) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 45) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -47.75 + (((tickAnim - 60) / 10) * (-39.5-(-47.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -39.5 + (((tickAnim - 70) / 10) * (-48.25-(-39.5)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -48.25 + (((tickAnim - 80) / 10) * (-39.5-(-48.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -39.5 + (((tickAnim - 90) / 10) * (-48.25-(-39.5)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -48.25 + (((tickAnim - 100) / 10) * (-39.5-(-48.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -39.5 + (((tickAnim - 110) / 30) * (0-(-39.5)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0.3 + (((tickAnim - 60) / 20) * (0.475-(0.3)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0.475 + (((tickAnim - 80) / 20) * (0.475-(0.475)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0.475 + (((tickAnim - 100) / 40) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-9.17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -9.17 + (((tickAnim - 15) / 8) * (50.25-(-9.17)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 50.25 + (((tickAnim - 23) / 37) * (93.75-(50.25)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 93.75 + (((tickAnim - 60) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 105 + (((tickAnim - 70) / 10) * (93.75-(105)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 93.75 + (((tickAnim - 80) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 105 + (((tickAnim - 90) / 10) * (93.75-(105)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 93.75 + (((tickAnim - 100) / 10) * (105-(93.75)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 105 + (((tickAnim - 110) / 30) * (0-(105)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (1.275-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0.23-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            yy = 1.275 + (((tickAnim - 23) / 13) * (2.165-(1.275)));
            zz = 0.23 + (((tickAnim - 23) / 13) * (0.05-(0.23)));
        }
        else if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 2.165 + (((tickAnim - 36) / 24) * (0-(2.165)));
            zz = 0.05 + (((tickAnim - 36) / 24) * (-0.575-(0.05)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = -0.575 + (((tickAnim - 60) / 20) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = -0.575 + (((tickAnim - 80) / 20) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = -0.575 + (((tickAnim - 100) / 40) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 36) {
            xx = -15.75 + (((tickAnim - 23) / 13) * (19.25-(-15.75)));
            yy = 0 + (((tickAnim - 23) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 13) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 36) / 14) * (16.52-(19.25)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 16.52 + (((tickAnim - 50) / 10) * (4.75-(16.52)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 4.75 + (((tickAnim - 60) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = -11 + (((tickAnim - 64) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 70) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 84) {
            xx = 4.75 + (((tickAnim - 80) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 80) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 4) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = -11 + (((tickAnim - 84) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 84) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 104) {
            xx = 4.75 + (((tickAnim - 100) / 4) * (-11-(4.75)));
            yy = 0 + (((tickAnim - 100) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 4) * (0-(0)));
        }
        else if (tickAnim >= 104 && tickAnim < 110) {
            xx = -11 + (((tickAnim - 104) / 6) * (0-(-11)));
            yy = 0 + (((tickAnim - 104) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 104) / 6) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 36 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 24) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -9.5 + (((tickAnim - 60) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -9.49571 + (((tickAnim - 70) / 10) * (-9.5-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 70) / 10) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 70) / 10) * (0-(1.17832)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -9.5 + (((tickAnim - 80) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -9.49571 + (((tickAnim - 90) / 10) * (-9.5-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 90) / 10) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 90) / 10) * (0-(1.17832)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -9.5 + (((tickAnim - 100) / 10) * (-9.49571-(-9.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (0.41723-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (1.17832-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -9.49571 + (((tickAnim - 110) / 30) * (0-(-9.49571)));
            yy = 0.41723 + (((tickAnim - 110) / 30) * (0-(0.41723)));
            zz = 1.17832 + (((tickAnim - 110) / 30) * (0-(1.17832)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = -3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-10 + (((tickAnim - 0) / 60) * (16.25-(-3.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-10)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 16.25 + (((tickAnim - 60) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 16.20491 + (((tickAnim - 70) / 10) * (16.25-(16.20491)));
            yy = -1.68266 + (((tickAnim - 70) / 10) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 70) / 10) * (0-(3.06943)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 16.25 + (((tickAnim - 80) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 16.20491 + (((tickAnim - 90) / 10) * (16.25-(16.20491)));
            yy = -1.68266 + (((tickAnim - 90) / 10) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 90) / 10) * (0-(3.06943)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 16.25 + (((tickAnim - 100) / 10) * (16.20491-(16.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (-1.68266-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (3.06943-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 16.20491 + (((tickAnim - 110) / 30) * (0-(16.20491)));
            yy = -1.68266 + (((tickAnim - 110) / 30) * (0-(-1.68266)));
            zz = 3.06943 + (((tickAnim - 110) / 30) * (0-(3.06943)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 9.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-15 + (((tickAnim - 0) / 60) * (32.25-(9.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100+40))*-15)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 32.25 + (((tickAnim - 60) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 60) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 32.24911 + (((tickAnim - 70) / 10) * (32.25-(32.24911)));
            yy = 0.22893 + (((tickAnim - 70) / 10) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 70) / 10) * (0-(-0.44451)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 32.25 + (((tickAnim - 80) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 32.24911 + (((tickAnim - 90) / 10) * (32.25-(32.24911)));
            yy = 0.22893 + (((tickAnim - 90) / 10) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 90) / 10) * (0-(-0.44451)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 32.25 + (((tickAnim - 100) / 10) * (32.24911-(32.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0.22893-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-0.44451-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 32.24911 + (((tickAnim - 110) / 30) * (0-(32.24911)));
            yy = 0.22893 + (((tickAnim - 110) / 30) * (0-(0.22893)));
            zz = -0.44451 + (((tickAnim - 110) / 30) * (0-(-0.44451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 60) / 20) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -0.525 + (((tickAnim - 80) / 20) * (-0.525-(-0.525)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = -0.525 + (((tickAnim - 100) / 40) * (0-(-0.525)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (38-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 38 + (((tickAnim - 60) / 80) * (0-(38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-16-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = -16 + (((tickAnim - 60) / 80) * (0-(-16)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 8.5 + (((tickAnim - 60) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 60) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 8.50076 + (((tickAnim - 70) / 10) * (8.5-(8.50076)));
            yy = -0.11732 + (((tickAnim - 70) / 10) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 70) / 10) * (0-(-0.74077)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 8.5 + (((tickAnim - 80) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 80) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.50076 + (((tickAnim - 90) / 10) * (8.5-(8.50076)));
            yy = -0.11732 + (((tickAnim - 90) / 10) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 90) / 10) * (0-(-0.74077)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 8.5 + (((tickAnim - 100) / 10) * (8.50076-(8.5)));
            yy = 0 + (((tickAnim - 100) / 10) * (-0.11732-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (-0.74077-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 8.50076 + (((tickAnim - 110) / 30) * (0-(8.50076)));
            yy = -0.11732 + (((tickAnim - 110) / 30) * (0-(-0.11732)));
            zz = -0.74077 + (((tickAnim - 110) / 30) * (0-(-0.74077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (31.54654-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (2.73956-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.89499-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 31.54654 + (((tickAnim - 60) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 60) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 60) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 31.43965 + (((tickAnim - 70) / 10) * (31.54654-(31.43965)));
            yy = 2.70002 + (((tickAnim - 70) / 10) * (2.73956-(2.70002)));
            zz = -3.14718 + (((tickAnim - 70) / 10) * (-0.89499-(-3.14718)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 31.54654 + (((tickAnim - 80) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 80) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 80) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 31.43965 + (((tickAnim - 90) / 10) * (31.54654-(31.43965)));
            yy = 2.70002 + (((tickAnim - 90) / 10) * (2.73956-(2.70002)));
            zz = -3.14718 + (((tickAnim - 90) / 10) * (-0.89499-(-3.14718)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 31.54654 + (((tickAnim - 100) / 10) * (31.43965-(31.54654)));
            yy = 2.73956 + (((tickAnim - 100) / 10) * (2.70002-(2.73956)));
            zz = -0.89499 + (((tickAnim - 100) / 10) * (-3.14718-(-0.89499)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = 31.43965 + (((tickAnim - 110) / 30) * (0-(31.43965)));
            yy = 2.70002 + (((tickAnim - 110) / 30) * (0-(2.70002)));
            zz = -3.14718 + (((tickAnim - 110) / 30) * (0-(-3.14718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-10.75-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = -13.25 + (((tickAnim - 60) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 60) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 60) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -12.23503 + (((tickAnim - 70) / 10) * (-13.25-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 70) / 10) * (-10.75-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 70) / 10) * (0-(-5.55826)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -13.25 + (((tickAnim - 80) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 80) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 80) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -12.23503 + (((tickAnim - 90) / 10) * (-13.25-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 90) / 10) * (-10.75-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 90) / 10) * (0-(-5.55826)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -13.25 + (((tickAnim - 100) / 10) * (-12.23503-(-13.25)));
            yy = -10.75 + (((tickAnim - 100) / 10) * (-6.70588-(-10.75)));
            zz = 0 + (((tickAnim - 100) / 10) * (-5.55826-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 140) {
            xx = -12.23503 + (((tickAnim - 110) / 30) * (0-(-12.23503)));
            yy = -6.70588 + (((tickAnim - 110) / 30) * (0-(-6.70588)));
            zz = -5.55826 + (((tickAnim - 110) / 30) * (0-(-5.55826)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0.675-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0.675 + (((tickAnim - 60) / 20) * (0.675-(0.675)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0.675 + (((tickAnim - 80) / 20) * (0.675-(0.675)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0.675 + (((tickAnim - 100) / 40) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -24.75 + (((tickAnim - 60) / 80) * (0-(-24.75)));
            yy = -12.5 + (((tickAnim - 60) / 80) * (0-(-12.5)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0.225 + (((tickAnim - 60) / 80) * (0-(0.225)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -5.5 + (((tickAnim - 60) / 80) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 16 + (((tickAnim - 40) / 135) * (16-(16)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 16 + (((tickAnim - 175) / 25) * (0-(16)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.875-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0.875 + (((tickAnim - 40) / 135) * (0.875-(0.875)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0.875 + (((tickAnim - 175) / 25) * (0-(0.875)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-50))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 40) / 135) * (-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2 + (((tickAnim - 175) / 25) * (0-(-10.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2 + (((tickAnim - 40) / 135) * (1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2-(1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2 + (((tickAnim - 175) / 25) * (0-(1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*2)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -19.25 + (((tickAnim - 188) / 12) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -13.5 + (((tickAnim - 40) / 135) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -13.5 + (((tickAnim - 175) / 13) * (12.45-(-13.5)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 12.45 + (((tickAnim - 188) / 12) * (0-(12.45)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (-53.25-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = -53.25 + (((tickAnim - 188) / 12) * (0-(-53.25)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -2 + (((tickAnim - 40) / 135) * (-2-(-2)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = -2 + (((tickAnim - 175) / 13) * (78.82-(-2)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 78.82 + (((tickAnim - 188) / 12) * (0-(78.82)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (1.6-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (-0.475-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            yy = 1.6 + (((tickAnim - 188) / 12) * (0-(1.6)));
            zz = -0.475 + (((tickAnim - 188) / 12) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 175 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 175) / 13) * (17.75-(0)));
            yy = 0 + (((tickAnim - 175) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 13) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 200) {
            xx = 17.75 + (((tickAnim - 188) / 12) * (0-(17.75)));
            yy = 0 + (((tickAnim - 188) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -10 + (((tickAnim - 40) / 135) * (-10-(-10)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -10 + (((tickAnim - 175) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -9.25 + (((tickAnim - 40) / 135) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -9.25 + (((tickAnim - 175) / 25) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 4 + (((tickAnim - 40) / 135) * (4-(4)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 4 + (((tickAnim - 175) / 25) * (0-(4)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*13 + (((tickAnim - 0) / 40) * (11.75-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*13)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 11.75 + (((tickAnim - 40) / 135) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 11.75 + (((tickAnim - 175) / 25) * (0-(11.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
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
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 15.75 + (((tickAnim - 40) / 20) * (11.5-(15.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 11.5 + (((tickAnim - 60) / 20) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 11.5 + (((tickAnim - 80) / 30) * (13-(11.5)));
            yy = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 30) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 13 + (((tickAnim - 110) / 20) * (19-(13)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 175) {
            xx = 19 + (((tickAnim - 130) / 45) * (19-(19)));
            yy = 0 + (((tickAnim - 130) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 45) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 19 + (((tickAnim - 175) / 25) * (0-(19)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.13872-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-4.33705-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (3.0273-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.13872 + (((tickAnim - 40) / 20) * (4.11128-(-2.13872)));
            yy = -4.33705 + (((tickAnim - 40) / 20) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 40) / 20) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 4.11128 + (((tickAnim - 60) / 20) * (4.11128-(4.11128)));
            yy = -4.33705 + (((tickAnim - 60) / 20) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 60) / 20) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 80 && tickAnim < 175) {
            xx = 4.11128 + (((tickAnim - 80) / 95) * (-2.13872-(4.11128)));
            yy = -4.33705 + (((tickAnim - 80) / 95) * (-4.33705-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 80) / 95) * (3.0273-(3.0273)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -2.13872 + (((tickAnim - 175) / 25) * (0-(-2.13872)));
            yy = -4.33705 + (((tickAnim - 175) / 25) * (0-(-4.33705)));
            zz = 3.0273 + (((tickAnim - 175) / 25) * (0-(3.0273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -60 + (((tickAnim - 40) / 135) * (-60-(-60)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -60 + (((tickAnim - 175) / 25) * (0-(-60)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(0), righthand.rotateAngleY + (float) Math.toRadians(0), righthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.13872-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (4.33705-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.0273-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -2.13872 + (((tickAnim - 40) / 20) * (4.11128-(-2.13872)));
            yy = 4.33705 + (((tickAnim - 40) / 20) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 40) / 20) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 4.11128 + (((tickAnim - 60) / 20) * (4.11128-(4.11128)));
            yy = 4.33705 + (((tickAnim - 60) / 20) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 60) / 20) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 80 && tickAnim < 175) {
            xx = 4.11128 + (((tickAnim - 80) / 95) * (-2.13872-(4.11128)));
            yy = 4.33705 + (((tickAnim - 80) / 95) * (4.33705-(4.33705)));
            zz = -3.0273 + (((tickAnim - 80) / 95) * (-3.0273-(-3.0273)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -2.13872 + (((tickAnim - 175) / 25) * (0-(-2.13872)));
            yy = 4.33705 + (((tickAnim - 175) / 25) * (0-(4.33705)));
            zz = -3.0273 + (((tickAnim - 175) / 25) * (0-(-3.0273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-60-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = -60 + (((tickAnim - 40) / 135) * (-60-(-60)));
            yy = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -60 + (((tickAnim - 175) / 25) * (0-(-60)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(0), lefthand.rotateAngleY + (float) Math.toRadians(0), lefthand.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 18.25 + (((tickAnim - 40) / 20) * (32.25-(18.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 32.25 + (((tickAnim - 60) / 7) * (28.5-(32.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 28.5 + (((tickAnim - 67) / 13) * (32.25-(28.5)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 32.25 + (((tickAnim - 80) / 7) * (28.5-(32.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 115) {
            xx = 28.5 + (((tickAnim - 87) / 28) * (12-(28.5)));
            yy = 0 + (((tickAnim - 87) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 28) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 12 + (((tickAnim - 115) / 15) * (5-(12)));
            yy = 0 + (((tickAnim - 115) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 15) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 5 + (((tickAnim - 130) / 25) * (23-(5)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 23 + (((tickAnim - 155) / 20) * (23-(23)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 23 + (((tickAnim - 175) / 25) * (0-(23)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 40) / 135) * (0-(0)));
            yy = -0.55 + (((tickAnim - 40) / 135) * (-0.55-(-0.55)));
            zz = 0 + (((tickAnim - 40) / 135) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = -0.55 + (((tickAnim - 175) / 25) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 8.25 + (((tickAnim - 40) / 20) * (35.75-(8.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 35.75 + (((tickAnim - 60) / 20) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 115) {
            xx = 35.75 + (((tickAnim - 80) / 35) * (25.98426-(35.75)));
            yy = 0 + (((tickAnim - 80) / 35) * (-3.97425-(0)));
            zz = 0 + (((tickAnim - 80) / 35) * (0.45354-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 130) {
            xx = 25.98426 + (((tickAnim - 115) / 15) * (22.23426-(25.98426)));
            yy = -3.97425 + (((tickAnim - 115) / 15) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 115) / 15) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 22.23426 + (((tickAnim - 130) / 25) * (42.23426-(22.23426)));
            yy = -3.97425 + (((tickAnim - 130) / 25) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 130) / 25) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 42.23426 + (((tickAnim - 155) / 7) * (39.23426-(42.23426)));
            yy = -3.97425 + (((tickAnim - 155) / 7) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 155) / 7) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 162 && tickAnim < 175) {
            xx = 39.23426 + (((tickAnim - 162) / 13) * (42.23426-(39.23426)));
            yy = -3.97425 + (((tickAnim - 162) / 13) * (-3.97425-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 162) / 13) * (0.45354-(0.45354)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 42.23426 + (((tickAnim - 175) / 25) * (0-(42.23426)));
            yy = -3.97425 + (((tickAnim - 175) / 25) * (0-(-3.97425)));
            zz = 0.45354 + (((tickAnim - 175) / 25) * (0-(0.45354)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -15.5 + (((tickAnim - 40) / 20) * (15.25-(-15.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 15.25 + (((tickAnim - 60) / 7) * (10.75-(15.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 10.75 + (((tickAnim - 67) / 13) * (15.25-(10.75)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 15.25 + (((tickAnim - 80) / 7) * (10.75-(15.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 130) {
            xx = 10.75 + (((tickAnim - 87) / 43) * (3.14579-(10.75)));
            yy = 0 + (((tickAnim - 87) / 43) * (-5.9171-(0)));
            zz = 0 + (((tickAnim - 87) / 43) * (2.01617-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 3.14579 + (((tickAnim - 130) / 15) * (7.79579-(3.14579)));
            yy = -5.9171 + (((tickAnim - 130) / 15) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 130) / 15) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 7.79579 + (((tickAnim - 145) / 10) * (-11.35421-(7.79579)));
            yy = -5.9171 + (((tickAnim - 145) / 10) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 145) / 10) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = -11.35421 + (((tickAnim - 155) / 7) * (-17.10421-(-11.35421)));
            yy = -5.9171 + (((tickAnim - 155) / 7) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 155) / 7) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -17.10421 + (((tickAnim - 162) / 6) * (-8.85421-(-17.10421)));
            yy = -5.9171 + (((tickAnim - 162) / 6) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 162) / 6) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -8.85421 + (((tickAnim - 168) / 7) * (-11.35421-(-8.85421)));
            yy = -5.9171 + (((tickAnim - 168) / 7) * (-5.9171-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 168) / 7) * (2.01617-(2.01617)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -11.35421 + (((tickAnim - 175) / 25) * (0-(-11.35421)));
            yy = -5.9171 + (((tickAnim - 175) / 25) * (0-(-5.9171)));
            zz = 2.01617 + (((tickAnim - 175) / 25) * (0-(2.01617)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.4-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.2 + (((tickAnim - 40) / 20) * (0-(-0.2)));
            zz = 0.4 + (((tickAnim - 40) / 20) * (0-(0.4)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 87) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 87) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 68) * (0.225-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 155) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0.225 + (((tickAnim - 175) / 25) * (0-(0.225)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 6.25 + (((tickAnim - 40) / 20) * (-24.25-(6.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -24.25 + (((tickAnim - 60) / 7) * (-17.25-(-24.25)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = -17.25 + (((tickAnim - 67) / 13) * (-24.25-(-17.25)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = -24.25 + (((tickAnim - 80) / 7) * (-17.25-(-24.25)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 110) {
            xx = -17.25 + (((tickAnim - 87) / 23) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 87) / 23) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 87) / 23) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = -12.75 + (((tickAnim - 110) / 20) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 130) / 25) * (-18.5-(0)));
            yy = -12.75 + (((tickAnim - 130) / 25) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 130) / 25) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = -18.5 + (((tickAnim - 155) / 7) * (-8.75-(-18.5)));
            yy = -12.75 + (((tickAnim - 155) / 7) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = -8.75 + (((tickAnim - 162) / 6) * (2-(-8.75)));
            yy = -12.75 + (((tickAnim - 162) / 6) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = 2 + (((tickAnim - 168) / 7) * (-18.5-(2)));
            yy = -12.75 + (((tickAnim - 168) / 7) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = -18.5 + (((tickAnim - 175) / 25) * (0-(-18.5)));
            yy = -12.75 + (((tickAnim - 175) / 25) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0.15 + (((tickAnim - 60) / 20) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 80) / 30) * (0-(0)));
            yy = 0.15 + (((tickAnim - 80) / 30) * (0-(0.15)));
            zz = 0 + (((tickAnim - 80) / 30) * (0.15-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0.15 + (((tickAnim - 110) / 20) * (0.15-(0.15)));
        }
        else if (tickAnim >= 130 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 130) / 25) * (0-(0)));
            zz = 0.15 + (((tickAnim - 130) / 25) * (0-(0.15)));
        }
        else if (tickAnim >= 155 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 20) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (-20.94-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -20.94 + (((tickAnim - 55) / 5) * (-14.27237-(-20.94)));
            yy = 0 + (((tickAnim - 55) / 5) * (0.6093-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (-4.20618-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -14.27237 + (((tickAnim - 60) / 7) * (-9.5-(-14.27237)));
            yy = 0.6093 + (((tickAnim - 60) / 7) * (0-(0.6093)));
            zz = -4.20618 + (((tickAnim - 60) / 7) * (0-(-4.20618)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = -9.5 + (((tickAnim - 67) / 8) * (-17.68314-(-9.5)));
            yy = 0 + (((tickAnim - 67) / 8) * (0.33643-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (-3.98585-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = -17.68314 + (((tickAnim - 75) / 3) * (-20.94654-(-17.68314)));
            yy = 0.33643 + (((tickAnim - 75) / 3) * (0.14273-(0.33643)));
            zz = -3.98585 + (((tickAnim - 75) / 3) * (-5.24807-(-3.98585)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = -20.94654 + (((tickAnim - 78) / 5) * (-14.25-(-20.94654)));
            yy = 0.14273 + (((tickAnim - 78) / 5) * (0-(0.14273)));
            zz = -5.24807 + (((tickAnim - 78) / 5) * (0-(-5.24807)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = -14.25 + (((tickAnim - 83) / 7) * (-9.5-(-14.25)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = -9.5 + (((tickAnim - 90) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 20) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (-18-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = -18 + (((tickAnim - 145) / 10) * (0.75-(-18)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 0.75 + (((tickAnim - 155) / 7) * (0-(0.75)));
            yy = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 162) / 6) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = -24.5 + (((tickAnim - 168) / 7) * (0.75-(-24.5)));
            yy = 0 + (((tickAnim - 168) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else if (tickAnim >= 175 && tickAnim < 200) {
            xx = 0.75 + (((tickAnim - 175) / 25) * (0-(0.75)));
            yy = 0 + (((tickAnim - 175) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 175) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (23.5-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 23.5 + (((tickAnim - 55) / 5) * (0-(23.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 67) / 8) * (23.5-(0)));
            yy = 0 + (((tickAnim - 67) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 23.5 + (((tickAnim - 75) / 5) * (0-(23.5)));
            yy = 0 + (((tickAnim - 75) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 130) {
            xx = 0 + (((tickAnim - 80) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 50) * (0-(0)));
        }
        else if (tickAnim >= 130 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 130) / 15) * (27.75-(0)));
            yy = 0 + (((tickAnim - 130) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 130) / 15) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 155) {
            xx = 27.75 + (((tickAnim - 145) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 145) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 10) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 7) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 162) / 6) * (16.75-(0)));
            yy = 0 + (((tickAnim - 162) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 6) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 175) {
            xx = 16.75 + (((tickAnim - 168) / 7) * (0-(16.75)));
            yy = 0 + (((tickAnim - 168) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (12.25-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 12.25 + (((tickAnim - 55) / 5) * (25.5-(12.25)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 25.5 + (((tickAnim - 60) / 7) * (19.75-(25.5)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 75) {
            xx = 19.75 + (((tickAnim - 67) / 8) * (8.5-(19.75)));
            yy = 0 + (((tickAnim - 67) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 8) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 78) {
            xx = 8.5 + (((tickAnim - 75) / 3) * (25.75-(8.5)));
            yy = 0 + (((tickAnim - 75) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 3) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 25.75 + (((tickAnim - 78) / 5) * (25.25-(25.75)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 90) {
            xx = 25.25 + (((tickAnim - 83) / 7) * (20.5-(25.25)));
            yy = 0 + (((tickAnim - 83) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 7) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 20.5 + (((tickAnim - 90) / 20) * (0-(20.5)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 110) / 35) * (12.25-(0)));
            yy = 0 + (((tickAnim - 110) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 35) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 12.25 + (((tickAnim - 145) / 5) * (25.5-(12.25)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 157) {
            xx = 25.5 + (((tickAnim - 150) / 7) * (19.75-(25.5)));
            yy = 0 + (((tickAnim - 150) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 7) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 165) {
            xx = 19.75 + (((tickAnim - 157) / 8) * (8.5-(19.75)));
            yy = 0 + (((tickAnim - 157) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 8) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 168) {
            xx = 8.5 + (((tickAnim - 165) / 3) * (25.75-(8.5)));
            yy = 0 + (((tickAnim - 165) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 165) / 3) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 173) {
            xx = 25.75 + (((tickAnim - 168) / 5) * (25.25-(25.75)));
            yy = 0 + (((tickAnim - 168) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 5) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 180) {
            xx = 25.25 + (((tickAnim - 173) / 7) * (20.5-(25.25)));
            yy = 0 + (((tickAnim - 173) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 7) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 200) {
            xx = 20.5 + (((tickAnim - 180) / 20) * (0-(20.5)));
            yy = 0 + (((tickAnim - 180) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
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
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -82.77 + (((tickAnim - 3) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (25.75-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 25.75 + (((tickAnim - 8) / 8) * (0-(25.75)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -82.77 + (((tickAnim - 19) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 25.75 + (((tickAnim - 23) / 9) * (0-(25.75)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (-82.77-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -82.77 + (((tickAnim - 35) / 2) * (0-(-82.77)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (25.75-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 39) / 11) * (0-(25.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0.225 + (((tickAnim - 8) / 8) * (0-(0.225)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 23) / 9) * (0-(0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 2) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 15) / 20) * (-17.5-(-17.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -17.5 + (((tickAnim - 35) / 15) * (0-(-17.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-9.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -9.35 + (((tickAnim - 15) / 20) * (-9.35-(-9.35)));
            zz = 5.15 + (((tickAnim - 15) / 20) * (5.15-(5.15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -9.35 + (((tickAnim - 35) / 15) * (0-(-9.35)));
            zz = 5.15 + (((tickAnim - 35) / 15) * (0-(5.15)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.75 + (((tickAnim - 15) / 20) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 35) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.5 + (((tickAnim - 15) / 20) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.5 + (((tickAnim - 35) / 15) * (0-(8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49 + (((tickAnim - 15) / 20) * (49-(49)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 15) / 20) * (-0.175-(-0.175)));
            zz = 0.025 + (((tickAnim - 15) / 20) * (0.025-(0.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
            zz = 0.025 + (((tickAnim - 35) / 15) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (89.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 89.5 + (((tickAnim - 15) / 20) * (89.5-(89.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 89.5 + (((tickAnim - 35) / 15) * (0-(89.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25 + (((tickAnim - 15) / 20) * (-25-(-25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25 + (((tickAnim - 35) / 15) * (0-(-25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (49-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 49 + (((tickAnim - 15) / 20) * (49-(49)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 49 + (((tickAnim - 35) / 15) * (0-(49)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-87.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -87.25 + (((tickAnim - 15) / 20) * (-87.25-(-87.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -87.25 + (((tickAnim - 35) / 15) * (0-(-87.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.025-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 15) / 20) * (-0.175-(-0.175)));
            zz = 0.025 + (((tickAnim - 15) / 20) * (0.025-(0.025)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.175 + (((tickAnim - 35) / 15) * (0-(-0.175)));
            zz = 0.025 + (((tickAnim - 35) / 15) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (88.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 88.25 + (((tickAnim - 15) / 20) * (88.25-(88.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 88.25 + (((tickAnim - 35) / 15) * (0-(88.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.625-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 8) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 7) / 8) * (0-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 43) / 7) * (0-(0.575)));
            zz = -0.625 + (((tickAnim - 43) / 7) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.75 + (((tickAnim - 15) / 20) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 35) / 15) * (0-(21.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(xx), rightarm1.rotateAngleY + (float) Math.toRadians(yy), rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-41.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41.5 + (((tickAnim - 15) / 20) * (-41.5-(-41.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41.5 + (((tickAnim - 35) / 15) * (0-(-41.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 21.75 + (((tickAnim - 15) / 20) * (21.75-(21.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 35) / 15) * (0-(21.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(xx), leftarm1.rotateAngleY + (float) Math.toRadians(yy), leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-41.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -41.5 + (((tickAnim - 15) / 20) * (-41.5-(-41.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -41.5 + (((tickAnim - 35) / 15) * (0-(-41.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.75 + (((tickAnim - 15) / 20) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 35) / 15) * (0-(18.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.225-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.225 + (((tickAnim - 15) / 20) * (0.225-(0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0.225 + (((tickAnim - 35) / 15) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.75 + (((tickAnim - 10) / 10) * (0-(10.75)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19 + (((tickAnim - 10) / 10) * (0-(19)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 33.25 + (((tickAnim - 10) / 10) * (0-(33.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.5 + (((tickAnim - 5) / 3) * (-32.92-(15.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -32.92 + (((tickAnim - 8) / 2) * (-21.5-(-32.92)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -21.5 + (((tickAnim - 10) / 4) * (18.21-(-21.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 18.21 + (((tickAnim - 14) / 6) * (0-(18.21)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0.225 + (((tickAnim - 5) / 9) * (0.315-(0.225)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0.315 + (((tickAnim - 14) / 6) * (0-(0.315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (35-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 8) / 2) * (0-(35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.87-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -12.87 + (((tickAnim - 5) / 5) * (16.25-(-12.87)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 16.25 + (((tickAnim - 10) / 4) * (-13.52-(16.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -13.52 + (((tickAnim - 14) / 6) * (0-(-13.52)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5 + (((tickAnim - 13) / 12) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*288+250))*5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 13) / 12) * (0-(-7)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -13.25 + (((tickAnim - 13) / 12) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.425 + (((tickAnim - 13) / 12) * (0-(-0.425)));
            zz = 0.5 + (((tickAnim - 13) / 12) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -24.25 + (((tickAnim - 13) / 12) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 12) * (0-(-0.175)));
            zz = -0.025 + (((tickAnim - 13) / 12) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 19.25 + (((tickAnim - 13) / 12) * (0-(19.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.05 + (((tickAnim - 13) / 12) * (0-(0.05)));
            zz = 0.025 + (((tickAnim - 13) / 12) * (0-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -16.75 + (((tickAnim - 13) / 12) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 29.5 + (((tickAnim - 13) / 12) * (0-(29.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*2.5), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-30))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-120))*1.2);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+130))*8));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+160))*12));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 0) / 13) * (14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(29.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (-1.45541-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-2.6236-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 13) / 0) * (-19.56588-(14.0584+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = -1.45541 + (((tickAnim - 13) / 0) * (-1.35838-(-1.45541)));
            zz = -2.6236 + (((tickAnim - 13) / 0) * (-2.44869-(-2.6236)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -19.56588 + (((tickAnim - 13) / 1) * (-20.06588-(-19.56588)));
            yy = -1.35838 + (((tickAnim - 13) / 1) * (-1.35838-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 13) / 1) * (-2.44869-(-2.44869)));
        }
        else if (tickAnim >= 14 && tickAnim < 25) {
            xx = -20.06588 + (((tickAnim - 14) / 11) * (29.75-(-20.06588)));
            yy = -1.35838 + (((tickAnim - 14) / 11) * (0-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 14) / 11) * (0-(-2.44869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 25.75 + (((tickAnim - 0) / 1) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 13) {
            xx = 28.28 + (((tickAnim - 1) / 12) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 1) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 12) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 13) / 12) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 13) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 0) / 13) * (0-(-0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.225 + (((tickAnim - 13) / 12) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.25 + (((tickAnim - 0) / 5) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.00571-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -54.79616 + (((tickAnim - 5) / 4) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 5) / 4) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 5) / 4) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -54.79616 + (((tickAnim - 9) / 4) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 9) / 4) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 9) / 4) * (-0.01427-(-0.00571)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 10.50959 + (((tickAnim - 13) / 12) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 13) / 12) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 13) / 12) * (0-(-0.01427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.68-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.68 + (((tickAnim - 5) / 4) * (0.63-(0.68)));
            zz = 0.275 + (((tickAnim - 5) / 4) * (0.325-(0.275)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.63 + (((tickAnim - 9) / 4) * (-0.175-(0.63)));
            zz = 0.325 + (((tickAnim - 9) / 4) * (0-(0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 12) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
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
            xx = 60.25 + (((tickAnim - 0) / 5) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 82.5 + (((tickAnim - 5) / 4) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 82.5 + (((tickAnim - 9) / 4) * (22.06396-(82.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (2.88403-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (10.27848-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 22.06396 + (((tickAnim - 13) / 0) * (16.13509-(22.06396)));
            yy = 2.88403 + (((tickAnim - 13) / 0) * (2.30722-(2.88403)));
            zz = 10.27848 + (((tickAnim - 13) / 0) * (8.22275-(10.27848)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 16.13509 + (((tickAnim - 13) / 1) * (13.6437-(16.13509)));
            yy = 2.30722 + (((tickAnim - 13) / 1) * (1.7304-(2.30722)));
            zz = 8.22275 + (((tickAnim - 13) / 1) * (6.16702-(8.22275)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 13.6437 + (((tickAnim - 14) / 3) * (-6.59685-(13.6437)));
            yy = 1.7304 + (((tickAnim - 14) / 3) * (-0.35152-(1.7304)));
            zz = 6.16702 + (((tickAnim - 14) / 3) * (5.48879-(6.16702)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -6.59685 + (((tickAnim - 17) / 2) * (54.25-(-6.59685)));
            yy = -0.35152 + (((tickAnim - 17) / 2) * (0-(-0.35152)));
            zz = 5.48879 + (((tickAnim - 17) / 2) * (0-(5.48879)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 54.25 + (((tickAnim - 19) / 1) * (67.75-(54.25)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 67.75 + (((tickAnim - 20) / 5) * (60.25-(67.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 5) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 0) / 5) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 4) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 5) / 4) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 9) / 4) * (-0.2-(1.15)));
            zz = -0.55 + (((tickAnim - 9) / 4) * (0-(-0.55)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 1) * (0.48-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 1) * (-0.03-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.48 + (((tickAnim - 14) / 2) * (1.06-(0.48)));
            zz = -0.03 + (((tickAnim - 14) / 2) * (-0.06-(-0.03)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 1.06 + (((tickAnim - 16) / 1) * (0.855-(1.06)));
            zz = -0.06 + (((tickAnim - 16) / 1) * (-0.07-(-0.06)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.855 + (((tickAnim - 17) / 1) * (0.99-(0.855)));
            zz = -0.07 + (((tickAnim - 17) / 1) * (-0.18-(-0.07)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 18) / 2) * (-0.25-(0.99)));
            zz = -0.18 + (((tickAnim - 18) / 2) * (-0.5-(-0.18)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.25 + (((tickAnim - 20) / 5) * (0.4-(-0.25)));
            zz = -0.5 + (((tickAnim - 20) / 5) * (-0.2-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 36 + (((tickAnim - 0) / 13) * (0-(36)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -73.14 + (((tickAnim - 19) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 1) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -91.85 + (((tickAnim - 20) / 3) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (36-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (-0.12-(0)));
            zz = 0.425 + (((tickAnim - 18) / 1) * (0.315-(0.425)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 19) / 1) * (0.05-(-0.12)));
            zz = 0.315 + (((tickAnim - 19) / 1) * (-0.55-(0.315)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 20) / 3) * (0-(0.05)));
            zz = -0.55 + (((tickAnim - 20) / 3) * (0-(-0.55)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18.47232 + (((tickAnim - 0) / 1) * (-19.0946-(-18.47232)));
            yy = 1.3118 + (((tickAnim - 0) / 1) * (1.22434-(1.3118)));
            zz = 2.41717 + (((tickAnim - 0) / 1) * (2.25602-(2.41717)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -19.0946 + (((tickAnim - 1) / 1) * (-19.0946-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 1) / 1) * (1.22434-(1.22434)));
            zz = 2.25602 + (((tickAnim - 1) / 1) * (2.25602-(2.25602)));
        }
        else if (tickAnim >= 2 && tickAnim < 13) {
            xx = -19.0946 + (((tickAnim - 2) / 11) * (-21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 2) / 11) * (0-(1.22434)));
            zz = 2.25602 + (((tickAnim - 2) / 11) * (0-(2.25602)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55 + (((tickAnim - 13) / 12) * (-18.47232-(-21.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*55)));
            yy = 0 + (((tickAnim - 13) / 12) * (1.3118-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (2.41717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 0) / 13) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 13) / 0) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 28.28 + (((tickAnim - 13) / 12) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 13) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0.575 + (((tickAnim - 13) / 12) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 13) / 12) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10.50959 + (((tickAnim - 0) / 13) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 0) / 13) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 0) / 13) * (0-(-0.01427)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.25 + (((tickAnim - 13) / 5) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-0.00571-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -54.79616 + (((tickAnim - 18) / 3) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 18) / 3) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 18) / 3) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -54.79616 + (((tickAnim - 21) / 4) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 21) / 4) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 21) / 4) * (-0.01427-(-0.00571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 13) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.655-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0.655 + (((tickAnim - 18) / 3) * (0.58-(0.655)));
            zz = 0.325 + (((tickAnim - 18) / 3) * (0.275-(0.325)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.58 + (((tickAnim - 21) / 4) * (-0.175-(0.58)));
            zz = 0.275 + (((tickAnim - 21) / 4) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 18.19714 + (((tickAnim - 0) / 4) * (-6.59172-(18.19714)));
            yy = -1.17746 + (((tickAnim - 0) / 4) * (0.28304-(-1.17746)));
            zz = -8.66565 + (((tickAnim - 0) / 4) * (-4.74158-(-8.66565)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.59172 + (((tickAnim - 4) / 4) * (76-(-6.59172)));
            yy = 0.28304 + (((tickAnim - 4) / 4) * (0-(0.28304)));
            zz = -4.74158 + (((tickAnim - 4) / 4) * (0-(-4.74158)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 76 + (((tickAnim - 8) / 5) * (60.25-(76)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 60.25 + (((tickAnim - 13) / 5) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 82.5 + (((tickAnim - 18) / 3) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 82.5 + (((tickAnim - 21) / 4) * (18.19714-(82.5)));
            yy = 0 + (((tickAnim - 21) / 4) * (-1.17746-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (-8.66565-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 3) * (1.055-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.05-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.055 + (((tickAnim - 3) / 1) * (0.93-(1.055)));
            zz = -0.05 + (((tickAnim - 3) / 1) * (-0.07-(-0.05)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.93 + (((tickAnim - 4) / 1) * (1.105-(0.93)));
            zz = -0.07 + (((tickAnim - 4) / 1) * (-0.11-(-0.07)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 1.105 + (((tickAnim - 5) / 1) * (0.62-(1.105)));
            zz = -0.11 + (((tickAnim - 5) / 1) * (-0.14-(-0.11)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.62 + (((tickAnim - 6) / 1) * (-0.07-(0.62)));
            zz = -0.14 + (((tickAnim - 6) / 1) * (-0.19-(-0.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.07 + (((tickAnim - 7) / 1) * (-0.62-(-0.07)));
            zz = -0.19 + (((tickAnim - 7) / 1) * (-0.245-(-0.19)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.62 + (((tickAnim - 8) / 5) * (0.4-(-0.62)));
            zz = -0.245 + (((tickAnim - 8) / 5) * (-0.2-(-0.245)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 5) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 13) / 5) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 1.15 + (((tickAnim - 18) / 3) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 18) / 3) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 1.15 + (((tickAnim - 21) / 4) * (-0.075-(1.15)));
            zz = -0.55 + (((tickAnim - 21) / 4) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -73.14 + (((tickAnim - 7) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -91.85 + (((tickAnim - 8) / 2) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (36-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 36 + (((tickAnim - 13) / 12) * (0-(36)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.425-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (-0.12-(0)));
            zz = 0.425 + (((tickAnim - 6) / 1) * (0.315-(0.425)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.12 + (((tickAnim - 7) / 1) * (0-(-0.12)));
            zz = 0.315 + (((tickAnim - 7) / 1) * (-0.55-(0.315)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -0.55 + (((tickAnim - 8) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 12) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-70))*-1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+90))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+150))*-5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-100))*2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*3.5));


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(14.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), rightarm1.rotateAngleY + (float) Math.toRadians(0), rightarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-31.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(14.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), leftarm1.rotateAngleY + (float) Math.toRadians(0), leftarm1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+250))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(-31.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-150))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-250))*-3), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*-3), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-200))*3), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTyrannomimus entity = (EntityPrehistoricFloraTyrannomimus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-20))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-30))*-1.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-120))*2.5);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-50))*3), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576))*6), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-50))*12), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+130))*8));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576-100))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+160))*12));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 37.75 + (((tickAnim - 0) / 7) * (5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(37.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1.45541-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.6236-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 7) / 1) * (-20.06588-(5.3084+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = -1.45541 + (((tickAnim - 7) / 1) * (-1.35838-(-1.45541)));
            zz = -2.6236 + (((tickAnim - 7) / 1) * (-2.44869-(-2.6236)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -20.06588 + (((tickAnim - 8) / 5) * (37.75-(-20.06588)));
            yy = -1.35838 + (((tickAnim - 8) / 5) * (0-(-1.35838)));
            zz = -2.44869 + (((tickAnim - 8) / 5) * (0-(-2.44869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 25.75 + (((tickAnim - 0) / 1) * (28.28-(25.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 28.28 + (((tickAnim - 1) / 6) * (-7.5-(28.28)));
            yy = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 6) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 7) / 6) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 0) / 7) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 0) / 7) * (0-(-0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 7) / 6) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 7) / 6) * (-0.2-(0)));
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
            xx = 1.25 + (((tickAnim - 0) / 3) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.00571-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -54.79616 + (((tickAnim - 3) / 2) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 3) / 2) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 3) / 2) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -54.79616 + (((tickAnim - 5) / 2) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 5) / 2) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 5) / 2) * (-0.01427-(-0.00571)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10.50959 + (((tickAnim - 7) / 6) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 7) / 6) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 7) / 6) * (0-(-0.01427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.075-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 3) / 2) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 3) / 2) * (1.075-(1.075)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 5) / 2) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 5) / 2) * (0-(1.075)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.175 + (((tickAnim - 7) / 6) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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
            xx = 60.25 + (((tickAnim - 0) / 3) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 82.5 + (((tickAnim - 3) / 2) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 82.5 + (((tickAnim - 5) / 2) * (19.54016-(82.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.27309-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (9.41466-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 19.54016 + (((tickAnim - 7) / 1) * (13.6437-(19.54016)));
            yy = 0.27309 + (((tickAnim - 7) / 1) * (1.7304-(0.27309)));
            zz = 9.41466 + (((tickAnim - 7) / 1) * (6.16702-(9.41466)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 13.6437 + (((tickAnim - 8) / 0) * (-1.59685-(13.6437)));
            yy = 1.7304 + (((tickAnim - 8) / 0) * (-0.35152-(1.7304)));
            zz = 6.16702 + (((tickAnim - 8) / 0) * (5.48879-(6.16702)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.59685 + (((tickAnim - 8) / 2) * (67.75-(-1.59685)));
            yy = -0.35152 + (((tickAnim - 8) / 2) * (0-(-0.35152)));
            zz = 5.48879 + (((tickAnim - 8) / 2) * (0-(5.48879)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.75 + (((tickAnim - 10) / 3) * (60.25-(67.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 3) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 2) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 3) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 5) / 2) * (0.175-(1.15)));
            zz = -0.55 + (((tickAnim - 5) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 7) / 1) * (1.08-(0.175)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.03-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.08 + (((tickAnim - 8) / 0) * (1.505-(1.08)));
            zz = -0.03 + (((tickAnim - 8) / 0) * (-0.07-(-0.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.505 + (((tickAnim - 8) / 1) * (1.215-(1.505)));
            zz = -0.07 + (((tickAnim - 8) / 1) * (-0.18-(-0.07)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.215 + (((tickAnim - 9) / 1) * (0.575-(1.215)));
            zz = -0.18 + (((tickAnim - 9) / 1) * (-0.5-(-0.18)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 3) * (0.4-(0.575)));
            zz = -0.5 + (((tickAnim - 10) / 3) * (-0.2-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 36 + (((tickAnim - 0) / 7) * (0-(36)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-91.85-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -91.85 + (((tickAnim - 10) / 2) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (36-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.425-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (-0.25-(0)));
            zz = 0.425 + (((tickAnim - 9) / 1) * (-0.55-(0.425)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 2) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 10) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -20.47232 + (((tickAnim - 0) / 1) * (-19.0946-(-20.47232)));
            yy = 1.3118 + (((tickAnim - 0) / 1) * (1.22434-(1.3118)));
            zz = 2.41717 + (((tickAnim - 0) / 1) * (2.25602-(2.41717)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = -19.0946 + (((tickAnim - 1) / 6) * (-30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75-(-19.0946)));
            yy = 1.22434 + (((tickAnim - 1) / 6) * (0-(1.22434)));
            zz = 2.25602 + (((tickAnim - 1) / 6) * (0-(2.25602)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75 + (((tickAnim - 7) / 6) * (-20.47232-(-30.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*75)));
            yy = 0 + (((tickAnim - 7) / 6) * (1.3118-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (2.41717-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -7.5 + (((tickAnim - 0) / 7) * (25.75-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 25.75 + (((tickAnim - 7) / 6) * (-7.5-(25.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 7) * (0.575-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.2-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.575 + (((tickAnim - 7) / 6) * (-0.225-(0.575)));
            zz = -0.2 + (((tickAnim - 7) / 6) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.50959 + (((tickAnim - 0) / 7) * (1.25-(10.50959)));
            yy = -0.25814 + (((tickAnim - 0) / 7) * (0-(-0.25814)));
            zz = -0.01427 + (((tickAnim - 0) / 7) * (0-(-0.01427)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.25 + (((tickAnim - 7) / 2) * (-54.79616-(1.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.10326-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.00571-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -54.79616 + (((tickAnim - 9) / 2) * (-54.79616-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 9) / 2) * (-0.10326-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 9) / 2) * (-0.00571-(-0.00571)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -54.79616 + (((tickAnim - 11) / 2) * (10.50959-(-54.79616)));
            yy = -0.10326 + (((tickAnim - 11) / 2) * (-0.25814-(-0.10326)));
            zz = -0.00571 + (((tickAnim - 11) / 2) * (-0.01427-(-0.00571)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 7) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1.075-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 9) / 2) * (-0.07-(-0.07)));
            zz = 1.075 + (((tickAnim - 9) / 2) * (1.075-(1.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.07 + (((tickAnim - 11) / 2) * (-0.175-(-0.07)));
            zz = 1.075 + (((tickAnim - 11) / 2) * (0-(1.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 27.44714 + (((tickAnim - 0) / 2) * (1.76238-(27.44714)));
            yy = -1.17746 + (((tickAnim - 0) / 2) * (-0.39249-(-1.17746)));
            zz = -8.66565 + (((tickAnim - 0) / 2) * (-2.88855-(-8.66565)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 1.76238 + (((tickAnim - 2) / 1) * (-7.58-(1.76238)));
            yy = -0.39249 + (((tickAnim - 2) / 1) * (0-(-0.39249)));
            zz = -2.88855 + (((tickAnim - 2) / 1) * (0-(-2.88855)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.58 + (((tickAnim - 3) / 1) * (76-(-7.58)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 76 + (((tickAnim - 4) / 3) * (60.25-(76)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 60.25 + (((tickAnim - 7) / 2) * (82.5-(60.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 82.5 + (((tickAnim - 9) / 2) * (82.5-(82.5)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 82.5 + (((tickAnim - 11) / 2) * (27.44714-(82.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (-1.17746-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-8.66565-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 2) * (2.03-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.03 + (((tickAnim - 2) / 1) * (1.255-(2.03)));
            zz = -0.05 + (((tickAnim - 2) / 1) * (-0.07-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.255 + (((tickAnim - 3) / 0) * (1.495-(1.255)));
            zz = -0.07 + (((tickAnim - 3) / 0) * (-0.14-(-0.07)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.495 + (((tickAnim - 3) / 1) * (0.955-(1.495)));
            zz = -0.14 + (((tickAnim - 3) / 1) * (-0.245-(-0.14)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.955 + (((tickAnim - 4) / 3) * (0.4-(0.955)));
            zz = -0.245 + (((tickAnim - 4) / 3) * (-0.2-(-0.245)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 7) / 2) * (1.15-(0.4)));
            zz = -0.2 + (((tickAnim - 7) / 2) * (-0.55-(-0.2)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 9) / 2) * (1.15-(1.15)));
            zz = -0.55 + (((tickAnim - 9) / 2) * (-0.55-(-0.55)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 11) / 2) * (-0.525-(1.15)));
            zz = -0.55 + (((tickAnim - 11) / 2) * (0-(-0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (-73.14-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -73.14 + (((tickAnim - 3) / 1) * (-91.85-(-73.14)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -91.85 + (((tickAnim - 4) / 1) * (0-(-91.85)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (36-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 36 + (((tickAnim - 7) / 6) * (0-(36)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0.425-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.25-(0)));
            zz = 0.425 + (((tickAnim - 3) / 1) * (-0.55-(0.425)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 4) / 1) * (0-(-0.25)));
            zz = -0.55 + (((tickAnim - 4) / 1) * (0-(-0.55)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-70))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+90))*-8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+150))*-8));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-100))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*5));


        this.setRotateAngle(rightarm1, rightarm1.rotateAngleX + (float) Math.toRadians(-1.3709+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*-10), rightarm1.rotateAngleY + (float) Math.toRadians(-7.72277), rightarm1.rotateAngleZ + (float) Math.toRadians(5.7039+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*10), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm1, leftarm1.rotateAngleX + (float) Math.toRadians(-1.3709+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*-10), leftarm1.rotateAngleY + (float) Math.toRadians(7.72277), leftarm1.rotateAngleZ + (float) Math.toRadians(-5.7039+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576+250))*4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*10), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-150))*4), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*6), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*8), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-250))*-5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*-5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*576/0.5-200))*5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTyrannomimus e = (EntityPrehistoricFloraTyrannomimus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.upperjaw, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

    }
}
