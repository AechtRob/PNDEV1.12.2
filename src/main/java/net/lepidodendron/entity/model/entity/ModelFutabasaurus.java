package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraFutabasaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelFutabasaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer armRight;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer armRight4;
    private final AdvancedModelRenderer armLeft;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer armLeft4;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Neck4;
    private final AdvancedModelRenderer Neck5;
    private final AdvancedModelRenderer Neck6;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelFutabasaurus() {
        this.textureWidth = 112;
        this.textureHeight = 96;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 11.2669F, 19.465F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 6.7331F, 8.535F);
        this.Hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 27, -5.0F, -4.0F, -11.0F, 10, 4, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 6.7331F, 8.535F);
        this.Hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 27, -5.5F, -6.0F, -11.0F, 11, 6, 11, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-5.25F, 6.5831F, 3.785F);
        this.Hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.1745F, 0.48F, -0.2618F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 82, 42, -5.0F, -1.5F, -2.7F, 7, 3, 5, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1309F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 82, 50, -5.0F, -1.0F, -2.5F, 6, 2, 6, 0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-5.0F, 0.0F, 0.35F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.1309F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 86, 23, -5.0F, -1.0F, -2.5F, 6, 2, 5, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-4.75F, 0.0F, 0.25F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.1309F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 86, 38, -6.0F, -0.5F, -2.1F, 7, 1, 3, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(5.25F, 6.5831F, 3.785F);
        this.Hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.1745F, -0.48F, 0.2618F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 82, 42, -2.0F, -1.5F, -2.7F, 7, 3, 5, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.1309F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 82, 50, -1.0F, -1.0F, -2.5F, 6, 2, 6, 0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(5.0F, 0.0F, 0.35F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.1309F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 86, 23, -1.0F, -1.0F, -2.5F, 6, 2, 5, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(4.75F, 0.0F, 0.25F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, -0.1309F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 86, 38, -1.0F, -0.5F, -2.1F, 7, 1, 3, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 3.4831F, 8.535F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1309F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 62, 59, -3.0F, -2.5F, -1.0F, 6, 5, 7, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 75, -2.0F, -2.25F, -1.0F, 4, 4, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, -0.5F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 88, 5, -1.5F, -1.25F, -1.0F, 3, 3, 5, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 42, 84, -1.0F, -0.25F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.45F, 1.475F);
        this.Tail4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 67, 1.0F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 0.1F, 2.0F);
        this.Tail4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 63, 1.0F, 1.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 2.7331F, -2.215F);
        this.Hips.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -7.0F, -3.0F, -14.0F, 14, 11, 16, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, -13.0F);
        this.Body.addChild(Chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.3F, -11.7F);
        this.Chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3316F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 80, -3.5F, -5.651F, -0.0076F, 7, 6, 4, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 42, 44, -5.5F, -5.651F, 3.9924F, 11, 6, 9, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.Chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 74, -4.0F, -3.0F, -12.0F, 8, 6, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 44, -6.0F, -3.0F, -8.0F, 12, 6, 9, 0.0F, false));

        this.armRight = new AdvancedModelRenderer(this);
        this.armRight.setRotationPoint(-5.5F, 4.85F, -4.0F);
        this.Chest.addChild(armRight);
        this.setRotateAngle(armRight, -0.1745F, 0.0F, -0.1745F);
        this.armRight.cubeList.add(new ModelBox(armRight, 0, 86, -5.0F, -1.5F, -2.5F, 6, 3, 5, 0.0F, false));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, 0.0F, 0.1309F, 0.0F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 62, 71, -6.0F, -1.0F, -2.5F, 7, 2, 7, 0.01F, false));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-6.0F, 0.0F, 0.1F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 0.0F, 0.1309F, 0.0F);
        this.armRight3.cubeList.add(new ModelBox(armRight3, 78, 80, -5.0F, -1.0F, -2.5F, 6, 2, 6, 0.0F, false));

        this.armRight4 = new AdvancedModelRenderer(this);
        this.armRight4.setRotationPoint(-5.0F, 0.0F, 0.25F);
        this.armRight3.addChild(armRight4);
        this.setRotateAngle(armRight4, 0.0F, 0.1309F, 0.0F);
        this.armRight4.cubeList.add(new ModelBox(armRight4, 88, 0, -6.25F, -0.5F, -2.25F, 7, 1, 4, 0.0F, false));

        this.armLeft = new AdvancedModelRenderer(this);
        this.armLeft.setRotationPoint(5.5F, 4.85F, -4.0F);
        this.Chest.addChild(armLeft);
        this.setRotateAngle(armLeft, -0.1745F, 0.0F, 0.1745F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 0, 86, -1.0F, -1.5F, -2.5F, 6, 3, 5, 0.0F, true));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, 0.0F, -0.1309F, 0.0F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 62, 71, -1.0F, -1.0F, -2.5F, 7, 2, 7, 0.01F, true));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(6.0F, 0.0F, 0.1F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 0.0F, -0.1309F, 0.0F);
        this.armLeft3.cubeList.add(new ModelBox(armLeft3, 78, 80, -1.0F, -1.0F, -2.5F, 6, 2, 6, 0.0F, true));

        this.armLeft4 = new AdvancedModelRenderer(this);
        this.armLeft4.setRotationPoint(5.0F, 0.0F, 0.25F);
        this.armLeft3.addChild(armLeft4);
        this.setRotateAngle(armLeft4, 0.0F, -0.1309F, 0.0F);
        this.armLeft4.cubeList.add(new ModelBox(armLeft4, 88, 0, -0.75F, -0.5F, -2.25F, 7, 1, 4, 0.0F, true));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.6F, -12.0F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 59, -2.5F, -2.75F, -10.0F, 5, 5, 11, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck.addChild(Neck2);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 32, 59, -2.0F, -2.25F, -10.0F, 4, 4, 11, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, 0.0349F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 60, 0, -1.5F, -1.75F, -10.0F, 3, 3, 11, 0.01F, false));

        this.Neck4 = new AdvancedModelRenderer(this);
        this.Neck4.setRotationPoint(0.0F, 0.0F, -10.0F);
        this.Neck3.addChild(Neck4);
        this.setRotateAngle(Neck4, -0.0218F, 0.0F, 0.0F);
        this.Neck4.cubeList.add(new ModelBox(Neck4, 60, 14, -1.5F, -1.75F, -9.5F, 3, 3, 10, 0.0F, false));

        this.Neck5 = new AdvancedModelRenderer(this);
        this.Neck5.setRotationPoint(0.0F, 0.0F, -9.5F);
        this.Neck4.addChild(Neck5);
        this.setRotateAngle(Neck5, -0.0175F, 0.0F, 0.0F);
        this.Neck5.cubeList.add(new ModelBox(Neck5, 22, 84, -1.5F, -1.75F, -6.5F, 3, 3, 7, -0.01F, false));

        this.Neck6 = new AdvancedModelRenderer(this);
        this.Neck6.setRotationPoint(0.0F, -0.25F, -6.5F);
        this.Neck5.addChild(Neck6);
        this.Neck6.cubeList.add(new ModelBox(Neck6, 86, 14, -1.5F, -0.75F, -6.5F, 3, 2, 7, -0.02F, false));
        this.Neck6.cubeList.add(new ModelBox(Neck6, 86, 30, -1.5F, -1.4F, -6.5F, 3, 1, 7, -0.03F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.5F, -6.5F);
        this.Neck6.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 22, 79, -1.5F, 0.275F, -3.875F, 3, 1, 2, -0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 64, 90, -1.0F, 0.275F, -5.375F, 2, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 56, 74, -0.5F, 0.275F, -6.575F, 1, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.1F, -4.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3316F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 90, -0.5F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.275F, -5.375F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 90, 71, -0.5F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 1.65F, -6.075F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3491F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 56, 43, -1.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.5F, 1.45F, -4.85F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 42, -1.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 1.275F, -3.35F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 42, -0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.225F, 1.15F, -2.2F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2923F, 0.1789F, -0.5236F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 42, 0.5F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.225F, 1.15F, -2.2F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2923F, -0.1789F, 0.5236F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 42, -1.5F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, 1.65F, -6.075F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 43, 0.75F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.5F, 1.45F, -4.85F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 42, 0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5F, 1.275F, -3.35F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.3491F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 42, -0.25F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.925F, -0.925F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 88, -1.5F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.075F, -0.7F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 22, 75, -1.5F, -2.0F, -1.0F, 3, 2, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.825F, 0.3F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 88, 58, -1.5F, 0.0F, -4.0F, 3, 1, 4, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 78, 88, -1.0F, -1.55F, -2.0F, 2, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 90, 74, -1.0F, 0.0F, -5.675F, 2, 1, 2, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.0F, -5.675F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 42, -0.5F, -1.0F, -0.95F, 1, 1, 1, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 42, -0.5F, -1.0F, -1.2F, 1, 1, 1, -0.02F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Hips.offsetY = -0.2F;
        this.Hips.offsetX = -0.3F;
        this.Hips.offsetZ = 1.0F;
        this.Hips.rotateAngleY = (float)Math.toRadians(120);
        this.Hips.rotateAngleX = (float)Math.toRadians(1);
        this.Hips.rotateAngleZ = (float)Math.toRadians(0);
        this.Hips.scaleChildren = true;
        float scaler = 0.35F;
        this.Hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Hips, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.Hips.render(f);
        //Reset rotations, positions and sizing:
        this.Hips.setScale(1.0F, 1.0F, 1.0F);
        this.Hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {

        this.Hips.offsetY = -0.35F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {

        this.Hips.offsetY = -0.08F;
        this.Hips.render(0.01F);
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
        EntityPrehistoricFloraFutabasaurus ee = (EntityPrehistoricFloraFutabasaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraFutabasaurus entity = (EntityPrehistoricFloraFutabasaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.75 + (((tickAnim - 7) / 7) * (1.5-(0.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 1.5 + (((tickAnim - 14) / 6) * (0-(1.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -2.75 + (((tickAnim - 7) / 7) * (2-(-2.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 14) / 6) * (0-(2)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(xx), Neck4.rotateAngleY + (float) Math.toRadians(yy), Neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -7.25 + (((tickAnim - 7) / 7) * (6.25-(-7.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 6.25 + (((tickAnim - 14) / 6) * (0-(6.25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(xx), Neck5.rotateAngleY + (float) Math.toRadians(yy), Neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -4.25 + (((tickAnim - 7) / 7) * (7.5-(-4.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 14) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(xx), Neck6.rotateAngleY + (float) Math.toRadians(yy), Neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 3) / 4) * (8-(-10)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 8 + (((tickAnim - 7) / 7) * (16-(8)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 16 + (((tickAnim - 14) / 6) * (0-(16)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 22.75 + (((tickAnim - 7) / 3) * (31.39-(22.75)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 31.39 + (((tickAnim - 10) / 4) * (0-(31.39)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFutabasaurus entity = (EntityPrehistoricFloraFutabasaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(-9), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(-2.75);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(-6), rightLeg.rotateAngleY + (float) Math.toRadians(-9), rightLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(7.5));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(6.5));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(-11.5), leftLeg.rotateAngleY + (float) Math.toRadians(0), leftLeg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(-11));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(-4.25));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(-12.5), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(12), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(5.62011), Tail3.rotateAngleY + (float) Math.toRadians(-1.46313), Tail3.rotateAngleZ + (float) Math.toRadians(10.14614));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(27.75));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(8.25), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.015),(float)1,(float)1);


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(15.75), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));
        this.Chest.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.015),(float)1,(float)1);


        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0), armRight.rotateAngleY + (float) Math.toRadians(-21.25), armRight.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0), armRight2.rotateAngleY + (float) Math.toRadians(0), armRight2.rotateAngleZ + (float) Math.toRadians(11.75));


        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0), armLeft2.rotateAngleY + (float) Math.toRadians(0), armLeft2.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(-3.74712), Neck.rotateAngleY + (float) Math.toRadians(-0.14712), Neck.rotateAngleZ + (float) Math.toRadians(-2.24519));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(-8.57794), Neck2.rotateAngleY + (float) Math.toRadians(5.71298), Neck2.rotateAngleZ + (float) Math.toRadians(-5.88382));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(-7.58401), Neck3.rotateAngleY + (float) Math.toRadians(7.6526), Neck3.rotateAngleZ + (float) Math.toRadians(-4.42368));


        this.setRotateAngle(Neck4, Neck4.rotateAngleX + (float) Math.toRadians(-0.55757), Neck4.rotateAngleY + (float) Math.toRadians(11.42662), Neck4.rotateAngleZ + (float) Math.toRadians(-2.80499));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(1.439576969+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+250))*-0.5), Neck5.rotateAngleY + (float) Math.toRadians(11.53455), Neck5.rotateAngleZ + (float) Math.toRadians(-2.8063));


        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(-4.2494006915+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*0.5), Neck6.rotateAngleY + (float) Math.toRadians(-0.0458), Neck6.rotateAngleZ + (float) Math.toRadians(-1.4993));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*2), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFutabasaurus entity = (EntityPrehistoricFloraFutabasaurus) entitylivingbaseIn;
        int animCycle = 75;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-30))*-5), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-70))*1.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*20), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-25));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*20), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-10));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-10))*-10));


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-10), leftLeg4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-600))*10), leftLeg4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*-10));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-100))*-4), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-150))*-5.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-200))*-6), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-6.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-5), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-420))*5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*-15));


        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*20));


        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*-20));


        this.setRotateAngle(armLeft4, armLeft4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-20), armLeft4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*10), armLeft4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-100))*-20));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*2.5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*1.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(0), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-4.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-20), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*25));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-20), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*10));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-10))*10));


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-10), rightLeg4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-600))*-10), rightLeg4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*10));


        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*15));


        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*-20));


        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*20));


        this.setRotateAngle(armRight4, armRight4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-20), armRight4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-10), armRight4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-100))*20));



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraFutabasaurus entity = (EntityPrehistoricFloraFutabasaurus) entitylivingbaseIn;
        int animCycle = 43;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-30))*-5), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*-2));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*1.5);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*25), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-25));


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*20), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-10));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-10))*-10));


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-10), leftLeg4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-600))*10), leftLeg4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*-10));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-100))*-4), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-150))*-5.5), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-200))*-6), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-6.5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-5), Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-420))*5), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*-15));


        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*20));


        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*-20));


        this.setRotateAngle(armLeft4, armLeft4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armLeft4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*10), armLeft4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-100))*-20));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-270))*2.5), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*1.5), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*1.5), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck5, Neck5.rotateAngleX + (float) Math.toRadians(0), Neck5.rotateAngleY + (float) Math.toRadians(0), Neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck6, Neck6.rotateAngleX + (float) Math.toRadians(0), Neck6.rotateAngleY + (float) Math.toRadians(0), Neck6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-4.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-25), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*25));


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-20), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*10));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-10))*10));


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-10), rightLeg4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-600))*-10), rightLeg4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*10));


        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*15));


        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*-20));


        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*20));


        this.setRotateAngle(armRight4, armRight4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armRight4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-10), armRight4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-100))*20));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Neck2);
        this.faceTarget(f3, f4, 5, Neck3);
        this.faceTarget(f3, f4, 5, Neck4);
        this.faceTarget(f3, f4, 5, Head);

        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};

        EntityPrehistoricFloraFutabasaurus ee = (EntityPrehistoricFloraFutabasaurus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

