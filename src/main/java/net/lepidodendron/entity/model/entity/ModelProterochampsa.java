package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProterochampsa;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProterochampsa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Base;
    private final AdvancedModelRenderer Hips;
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
    private final AdvancedModelRenderer Chest;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer notmove;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer notmove2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;

    private ModelAnimator animator;

    public ModelProterochampsa() {
        this.textureWidth = 76;
        this.textureHeight = 76;

        this.Base = new AdvancedModelRenderer(this);
        this.Base.setRotationPoint(0.0F, 24.0F, 3.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.Base.addChild(Hips);
        this.setRotateAngle(Hips, -0.0436F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 0, 17, -4.0F, -0.875F, -1.0F, 8, 6, 9, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-3.5F, 1.0F, 6.25F);
        this.Hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.733F, 0.2662F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 22, 43, -1.5F, -1.0F, -7.75F, 3, 3, 8, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 0.75F, -7.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.2323F, -0.0474F, 0.074F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 0, -1.5F, 0.0F, -0.75F, 3, 6, 2, -0.01F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.05F, 1.05F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -2.0115F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 36, -2.0F, 0.0F, -0.5F, 4, 3, 1, -0.01F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 32, -2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(3.5F, 1.0F, 6.25F);
        this.Hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.733F, -0.2662F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 22, 43, -1.5F, -1.0F, -7.75F, 3, 3, 8, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 0.75F, -7.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.2323F, 0.0474F, -0.074F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 0, -1.5F, 0.0F, -0.75F, 3, 6, 2, -0.01F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.05F, 1.05F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -2.0115F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 36, -2.0F, 0.0F, -0.5F, 4, 3, 1, -0.01F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 2.75F, 0.0F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 32, -2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 1.0F, 8.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1134F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 44, 44, -2.0F, -1.5F, -1.0F, 4, 4, 6, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1789F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 30, 54, -1.5F, -1.5F, -1.0F, 3, 3, 6, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0916F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 59, 61, -1.0F, -1.5F, -1.0F, 2, 2, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 12, 54, -0.5F, -0.5F, -1.0F, 1, 1, 8, 0.0F, false));

        this.Chest = new AdvancedModelRenderer(this);
        this.Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hips.addChild(Chest);
        this.setRotateAngle(Chest, 0.0873F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 0, -5.0F, -1.0F, -10.0F, 10, 7, 10, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Chest.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 44, 18, -4.0F, -1.675F, -4.75F, 8, 5, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Neck.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 28, 5, -1.5F, -1.0F, -17.0F, 3, 1, 12, 0.015F, false));
        this.Head.cubeList.add(new ModelBox(Head, 22, 54, -1.5F, -0.25F, -16.9F, 3, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.2618F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 54, -3.5F, -1.8F, -1.0F, 4, 2, 6, -0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.096F, 0.2967F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 35, -3.0F, -0.875F, 1.9F, 3, 1, 7, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.3403F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 34, -3.0F, -1.0F, 0.0F, 3, 1, 9, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3403F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 12, -0.15F, 0.0F, 0.5F, 0, 1, 6, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 19, 0.975F, -2.05F, 0.0F, 1, 1, 2, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 19, -1.975F, -2.05F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3403F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 12, 0.15F, 0.0F, 0.5F, 0, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.096F, -0.2967F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 35, 0.0F, -0.875F, 1.9F, 3, 1, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.0F, -14.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0175F, -0.3403F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 34, 0.0F, -1.0F, 0.0F, 3, 1, 9, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.2269F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 70, -1.1F, -1.0F, -2.4F, 1, 2, 4, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-4.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3491F, -0.2269F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 70, 0.1F, -1.0F, -2.4F, 1, 2, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-4.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, -0.2618F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 54, -0.5F, -1.8F, -1.0F, 4, 2, 6, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.0F, -4.25F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 0, -2.5F, -0.25F, -1.5F, 5, 2, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1265F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 0, -2.0F, -0.4F, -7.5F, 4, 1, 4, 0.01F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 44, 27, -1.5F, -0.4F, -11.0F, 3, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1134F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 21, -2.5F, 0.0F, -7.0F, 5, 1, 11, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.096F, 0.2749F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 60, 10, -1.8F, -0.2F, -2.0F, 2, 2, 6, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0349F, 0.2836F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 44, -1.8F, -0.45F, -5.0F, 2, 1, 9, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.096F, -0.2749F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 60, 10, -0.2F, -0.2F, -2.0F, 2, 2, 6, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0349F, 0.2269F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 65, -1.05F, -1.45F, -2.0F, 1, 1, 4, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0349F, -0.2269F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 65, 0.05F, -1.45F, -2.0F, 1, 1, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0349F, -0.2836F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 44, -0.2F, -0.45F, -5.0F, 2, 1, 9, 0.0F, false));

        this.notmove = new AdvancedModelRenderer(this);
        this.notmove.setRotationPoint(0.0F, 0.7F, -7.0F);
        this.jaw.addChild(notmove);
        this.setRotateAngle(notmove, -0.2269F, 0.0F, 0.0F);
        this.notmove.cubeList.add(new ModelBox(notmove, 46, 8, -1.5F, -1.0F, -7.0F, 3, 1, 7, -0.01F, false));
        this.notmove.cubeList.add(new ModelBox(notmove, 36, 44, -1.5F, -1.5F, -7.0F, 3, 1, 3, -0.02F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.notmove.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0611F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 51, 27, -1.5F, -1.0F, 0.0F, 3, 1, 7, -0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.5F, 0.0F, -4.0F);
        this.notmove.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.3403F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 44, -3.1F, -1.01F, 0.2F, 3, 1, 4, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 4, -0.25F, -1.5F, 0.2F, 0, 1, 4, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, 0.0F, -4.0F);
        this.notmove.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.3403F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 4, 0.25F, -1.5F, 0.2F, 0, 1, 4, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 44, 0.1F, -1.0F, 0.2F, 3, 1, 4, 0.0F, false));

        this.notmove2 = new AdvancedModelRenderer(this);
        this.notmove2.setRotationPoint(0.0F, 0.1F, -7.0F);
        this.jaw.addChild(notmove2);
        this.setRotateAngle(notmove2, -0.1745F, 0.0F, 0.0F);
        this.notmove2.cubeList.add(new ModelBox(notmove2, 1, 33, -2.0F, 0.0F, 0.0F, 4, 1, 10, 0.015F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(4.0F, 0.0F, 5.0F);
        this.notmove2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2749F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 33, -3.8F, 0.0F, -5.0F, 4, 1, 9, -0.01F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-4.0F, 0.0F, 5.0F);
        this.notmove2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.2749F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 33, -0.2F, 0.0F, -5.0F, 4, 1, 9, -0.01F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-5.0F, 4.5F, -8.0F);
        this.Chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.8289F, -0.1547F, 0.1666F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 43, 61, -1.0F, -1.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 0.25F, 3.75F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1178F, 0.2574F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 17, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, -0.9207F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 30, 5, -2.0F, -0.5F, -0.5F, 4, 4, 1, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(5.0F, 4.5F, -8.0F);
        this.Chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.8289F, 0.1547F, -0.1666F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 43, 61, -2.0F, -1.0F, -1.0F, 3, 3, 5, 0.0F, true));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 0.25F, 3.75F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1178F, -0.2574F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 17, -1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, -0.9207F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 30, 5, -2.0F, -0.5F, -0.5F, 4, 4, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Head, 0.15F, 0.1F, 0.05F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.Neck.offsetZ = 0.02F;
        this.Neck.offsetY = -0.01F;
        this.Neck.offsetX = -0.0F;
        this.Neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }


    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Base.offsetY = -0.20F;
        this.Base.offsetX = 0.075F;
        this.Base.offsetZ = 2.0F;
        this.Base.rotateAngleY = (float)Math.toRadians(212);
        this.Base.rotateAngleX = (float)Math.toRadians(22);
        this.Base.rotateAngleZ = (float)Math.toRadians(-12);
        this.Base.scaleChildren = true;
        float scaler = 0.4F;
        this.Base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Base.render(f);
        //Reset rotations, positions and sizing:
        this.Base.setScale(1.0F, 1.0F, 1.0F);
        this.Base.scaleChildren = false;
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
        this.Base.offsetY = 0.0F;

        EntityPrehistoricFloraProterochampsa proteros = (EntityPrehistoricFloraProterochampsa) e;

        this.faceTarget(f3, f4, 10, Neck);
        this.faceTarget(f3, f4, 10, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraProterochampsa ee = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (58.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 58.5 + (((tickAnim - 20) / 18) * (-11.25-(58.5)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 38) / 12) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 8 + (((tickAnim - 20) / 8) * (15.15-(8)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 15.15 + (((tickAnim - 28) / 5) * (-23.73-(15.15)));
            yy = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -23.73 + (((tickAnim - 33) / 5) * (-24.5-(-23.73)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -24.5 + (((tickAnim - 38) / 12) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.475-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.35-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 1.475 + (((tickAnim - 28) / 5) * (1.475-(1.475)));
            zz = 0.35 + (((tickAnim - 28) / 5) * (0.35-(0.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.475 + (((tickAnim - 33) / 5) * (0-(1.475)));
            zz = 0.35 + (((tickAnim - 33) / 5) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-29.15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -29.15 + (((tickAnim - 8) / 12) * (69.25-(-29.15)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 69.25 + (((tickAnim - 20) / 4) * (62.95-(69.25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 62.95 + (((tickAnim - 24) / 9) * (19.18-(62.95)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 19.18 + (((tickAnim - 33) / 5) * (35.75-(19.18)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 35.75 + (((tickAnim - 38) / 12) * (0-(35.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.625-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.21-(0)));
            zz = -0.625 + (((tickAnim - 8) / 5) * (0.14-(-0.625)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.21 + (((tickAnim - 13) / 7) * (0.5-(0.21)));
            zz = 0.14 + (((tickAnim - 13) / 7) * (0-(0.14)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 20) / 4) * (1.745-(0.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 1.745 + (((tickAnim - 24) / 9) * (0.375-(1.745)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 33) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-60.82-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -60.82 + (((tickAnim - 13) / 4) * (-65.91-(-60.82)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -65.91 + (((tickAnim - 17) / 3) * (25.5-(-65.91)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 25.5 + (((tickAnim - 20) / 4) * (48.02-(25.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 48.02 + (((tickAnim - 24) / 4) * (0-(48.02)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 17) / 3) * (0-(0.525)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 10) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.75 + (((tickAnim - 20) / 20) * (0-(2.75)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 20) / 20) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 12 + (((tickAnim - 20) / 6) * (14-(12)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 14 + (((tickAnim - 26) / 9) * (0-(14)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 0) / 24) * (-7-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 24) / 26) * (-5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-7-(-7)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8 + (((tickAnim - 0) / 24) * (-7.75-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*8)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 24) / 26) * (-5.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-70))*-7-(-7.75)));
            yy = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 32 + (((tickAnim - 18) / 10) * (33-(32)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 28) / 22) * (0-(33)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9 + (((tickAnim - 20) / 10) * (-9-(-9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 30) / 20) * (0-(-9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.275-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.275 + (((tickAnim - 20) / 10) * (-4.275-(-4.275)));
            zz = 1.175 + (((tickAnim - 20) / 10) * (1.175-(1.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.275 + (((tickAnim - 30) / 20) * (0-(-4.275)));
            zz = 1.175 + (((tickAnim - 30) / 20) * (0-(1.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.75 + (((tickAnim - 20) / 10) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 30) / 20) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (57.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 57.25 + (((tickAnim - 20) / 10) * (57.25-(57.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 57.25 + (((tickAnim - 30) / 20) * (0-(57.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.6 + (((tickAnim - 20) / 10) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.6 + (((tickAnim - 30) / 20) * (0-(-0.6)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.5 + (((tickAnim - 20) / 10) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 30) / 20) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.75 + (((tickAnim - 20) / 10) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 30) / 20) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (57.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 57.25 + (((tickAnim - 20) / 10) * (57.25-(57.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 57.25 + (((tickAnim - 30) / 20) * (0-(57.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.6 + (((tickAnim - 20) / 10) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.6 + (((tickAnim - 30) / 20) * (0-(-0.6)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -25.5 + (((tickAnim - 20) / 10) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 30) / 20) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.225-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.5 + (((tickAnim - 20) / 10) * (-0.5-(-0.5)));
            zz = -0.225 + (((tickAnim - 20) / 10) * (-0.225-(-0.225)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.5 + (((tickAnim - 30) / 20) * (0-(-0.5)));
            zz = -0.225 + (((tickAnim - 30) / 20) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.75 + (((tickAnim - 10) / 10) * (-9.31-(-8.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -9.31 + (((tickAnim - 20) / 10) * (-9.31-(-9.31)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -9.31 + (((tickAnim - 30) / 20) * (0-(-9.31)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.75 + (((tickAnim - 20) / 10) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 20.75 + (((tickAnim - 30) / 5) * (13.81-(20.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.81 + (((tickAnim - 35) / 15) * (0-(13.81)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 10) / 10) * (14.25-(6.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 14.25 + (((tickAnim - 20) / 10) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 14.25 + (((tickAnim - 30) / 9) * (3.43-(14.25)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 3.43 + (((tickAnim - 39) / 11) * (0-(3.43)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (4-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4 + (((tickAnim - 10) / 10) * (2-(4)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 20) / 10) * (2-(2)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 39) {
            xx = 2 + (((tickAnim - 30) / 9) * (2-(2)));
            yy = 0 + (((tickAnim - 30) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 9) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 2 + (((tickAnim - 39) / 4) * (-9-(2)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -9 + (((tickAnim - 43) / 4) * (-7.75-(-9)));
            yy = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 47) / 3) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(xx), Chest.rotateAngleY + (float) Math.toRadians(yy), Chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 20) / 10) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 30) / 20) * (0-(7.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.875-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.2 + (((tickAnim - 20) / 10) * (0.2-(0.2)));
            zz = -0.875 + (((tickAnim - 20) / 10) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.2 + (((tickAnim - 30) / 20) * (0-(0.2)));
            zz = -0.875 + (((tickAnim - 30) / 20) * (0-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(xx);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(yy);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 20) / 10) * (20-(20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -44.5 + (((tickAnim - 20) / 10) * (-44.5-(-44.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -44.5 + (((tickAnim - 30) / 20) * (0-(-44.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35.48454-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.38748-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.74178-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 35.48454 + (((tickAnim - 20) / 10) * (35.48454-(35.48454)));
            yy = 2.38748 + (((tickAnim - 20) / 10) * (2.38748-(2.38748)));
            zz = 0.74178 + (((tickAnim - 20) / 10) * (0.74178-(0.74178)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35.48454 + (((tickAnim - 30) / 20) * (0-(35.48454)));
            yy = 2.38748 + (((tickAnim - 30) / 20) * (0-(2.38748)));
            zz = 0.74178 + (((tickAnim - 30) / 20) * (0-(0.74178)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 20) / 10) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.175 + (((tickAnim - 30) / 20) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 20) / 10) * (20-(20)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 30) / 20) * (0-(20)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-44.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -44.5 + (((tickAnim - 20) / 10) * (-44.5-(-44.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -44.5 + (((tickAnim - 30) / 20) * (0-(-44.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (35.48454-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-2.38748-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.74178-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 35.48454 + (((tickAnim - 20) / 10) * (35.48454-(35.48454)));
            yy = -2.38748 + (((tickAnim - 20) / 10) * (-2.38748-(-2.38748)));
            zz = 0.74178 + (((tickAnim - 20) / 10) * (0.74178-(0.74178)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 35.48454 + (((tickAnim - 30) / 20) * (0-(35.48454)));
            yy = -2.38748 + (((tickAnim - 30) / 20) * (0-(-2.38748)));
            zz = 0.74178 + (((tickAnim - 30) / 20) * (0-(0.74178)));
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
            zz = 0 + (((tickAnim - 0) / 20) * (-0.175-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 20) / 10) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -0.175 + (((tickAnim - 30) / 20) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.5-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 8) / 2) * (6.25-(-0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 10) / 3) * (0-(6.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.75 + (((tickAnim - 3) / 5) * (-27.09589-(-7.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (-1.5989-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-5.46242-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -27.09589 + (((tickAnim - 8) / 5) * (0-(-27.09589)));
            yy = -1.5989 + (((tickAnim - 8) / 5) * (0-(-1.5989)));
            zz = -5.46242 + (((tickAnim - 8) / 5) * (0-(-5.46242)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 3) / 5) * (31-(3.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 31 + (((tickAnim - 8) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.43497-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.34921-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-7.4826-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 13.43497 + (((tickAnim - 10) / 7) * (-15.25-(13.43497)));
            yy = -3.34921 + (((tickAnim - 10) / 7) * (0-(-3.34921)));
            zz = -7.4826 + (((tickAnim - 10) / 7) * (0-(-7.4826)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.25 + (((tickAnim - 17) / 3) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.7931-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (7.16656-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8.02936-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 6.7931 + (((tickAnim - 5) / 4) * (5-(6.7931)));
            yy = 7.16656 + (((tickAnim - 5) / 4) * (13-(7.16656)));
            zz = -8.02936 + (((tickAnim - 5) / 4) * (0-(-8.02936)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 5 + (((tickAnim - 9) / 1) * (7.33333-(5)));
            yy = 13 + (((tickAnim - 9) / 1) * (11.91667-(13)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.33333 + (((tickAnim - 10) / 3) * (-25.5-(7.33333)));
            yy = 11.91667 + (((tickAnim - 10) / 3) * (0-(11.91667)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -25.5 + (((tickAnim - 13) / 4) * (13.75-(-25.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 17) / 3) * (0-(13.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 19.25 + (((tickAnim - 5) / 4) * (0-(19.25)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (30.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 30.5 + (((tickAnim - 13) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(4), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*6), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-0.3);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(115.5854961203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*5), rightLeg.rotateAngleY + (float) Math.toRadians(5.63683), rightLeg.rotateAngleZ + (float) Math.toRadians(66.01469));
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(-1.55);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-46.0905360139+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*10), rightLeg2.rotateAngleY + (float) Math.toRadians(6.39002), rightLeg2.rotateAngleZ + (float) Math.toRadians(-10.74922));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.825);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0.575);


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(72.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(1.1);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*20), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(115.5854961203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-5), leftLeg.rotateAngleY + (float) Math.toRadians(-5.63683), leftLeg.rotateAngleZ + (float) Math.toRadians(-66.01469));
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(0);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(-1.55);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-46.0905360139+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-10), leftLeg2.rotateAngleY + (float) Math.toRadians(-6.39002), leftLeg2.rotateAngleZ + (float) Math.toRadians(10.74922));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.825);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0.575);


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(72.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(1.1);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-20), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*6), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(10), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(4.75), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*6), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*8), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-3.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-6), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*6), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-290))*-3), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(49.82088), rightArm.rotateAngleY + (float) Math.toRadians(-5.3081184658+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1), rightArm.rotateAngleZ + (float) Math.toRadians(-32.30185));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(93.26285), rightArm2.rotateAngleY + (float) Math.toRadians(-0.24363), rightArm2.rotateAngleZ + (float) Math.toRadians(99.4682));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(75.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(49.82088), leftArm.rotateAngleY + (float) Math.toRadians(5.3081184658+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-2), leftArm.rotateAngleZ + (float) Math.toRadians(32.30185));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(93.26285), leftArm2.rotateAngleY + (float) Math.toRadians(0.24363), leftArm2.rotateAngleZ + (float) Math.toRadians(-99.4682));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(75.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 54.75 + (((tickAnim - 0) / 13) * (-24.65-(54.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -24.65 + (((tickAnim - 13) / 4) * (-13.25-(-24.65)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -13.25 + (((tickAnim - 17) / 18) * (54.75-(-13.25)));
            yy = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.75 + (((tickAnim - 0) / 5) * (103.55-(33.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 103.55 + (((tickAnim - 5) / 5) * (109.28-(103.55)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 109.28 + (((tickAnim - 10) / 3) * (48.52-(109.28)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 48.52 + (((tickAnim - 13) / 4) * (39.75-(48.52)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 39.75 + (((tickAnim - 17) / 3) * (23.38-(39.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23.38 + (((tickAnim - 20) / 3) * (4.5-(23.38)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4.5 + (((tickAnim - 23) / 5) * (-20.96-(4.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -20.96 + (((tickAnim - 28) / 7) * (33.75-(-20.96)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.95-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.95 + (((tickAnim - 5) / 5) * (2.95-(1.95)));
            zz = -0.3 + (((tickAnim - 5) / 5) * (-0.665-(-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 2.95 + (((tickAnim - 10) / 3) * (1.85-(2.95)));
            zz = -0.665 + (((tickAnim - 10) / 3) * (0-(-0.665)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.85 + (((tickAnim - 13) / 4) * (0.05-(1.85)));
            zz = 0 + (((tickAnim - 13) / 4) * (0.5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 17) / 3) * (0.26-(0.05)));
            zz = 0.5 + (((tickAnim - 17) / 3) * (0-(0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.26 + (((tickAnim - 20) / 3) * (0-(0.26)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0.215-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0.215 + (((tickAnim - 26) / 2) * (-0.125-(0.215)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 28) / 7) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -89.75115 + (((tickAnim - 0) / 5) * (-20.82581-(-89.75115)));
            yy = -0.02396 + (((tickAnim - 0) / 5) * (-0.01677-(-0.02396)));
            zz = 5.49995 + (((tickAnim - 0) / 5) * (3.84996-(5.49995)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -20.82581 + (((tickAnim - 5) / 6) * (25.4621-(-20.82581)));
            yy = -0.01677 + (((tickAnim - 5) / 6) * (-0.00839-(-0.01677)));
            zz = 3.84996 + (((tickAnim - 5) / 6) * (1.92498-(3.84996)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 25.4621 + (((tickAnim - 11) / 6) * (0-(25.4621)));
            yy = -0.00839 + (((tickAnim - 11) / 6) * (0-(-0.00839)));
            zz = 1.92498 + (((tickAnim - 11) / 6) * (0-(1.92498)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (-89.75115-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (-0.02396-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (5.49995-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 3) * (0.665-(-0.3)));
            zz = 0.425 + (((tickAnim - 0) / 3) * (0.21-(0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.665 + (((tickAnim - 3) / 2) * (0.375-(0.665)));
            zz = 0.21 + (((tickAnim - 3) / 2) * (0-(0.21)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 5) / 6) * (0-(0.375)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 4) * (0.975-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0.21-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 32) / 3) * (-0.3-(0.975)));
            zz = 0.21 + (((tickAnim - 32) / 3) * (0.425-(0.21)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -13.25 + (((tickAnim - 0) / 18) * (54.75-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 54.75 + (((tickAnim - 18) / 14) * (-24.65-(54.75)));
            yy = 0 + (((tickAnim - 18) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 14) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -24.65 + (((tickAnim - 32) / 3) * (-13.25-(-24.65)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -27.70386 + (((tickAnim - 0) / 18) * (0-(-27.70386)));
            yy = -0.13456 + (((tickAnim - 0) / 18) * (0-(-0.13456)));
            zz = -0.57882 + (((tickAnim - 0) / 18) * (0-(-0.57882)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (19.18884-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (-0.04037-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.17365-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 19.18884 + (((tickAnim - 23) / 4) * (22.24092-(19.18884)));
            yy = -0.04037 + (((tickAnim - 23) / 4) * (-0.06728-(-0.04037)));
            zz = -0.17365 + (((tickAnim - 23) / 4) * (-0.28941-(-0.17365)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 22.24092 + (((tickAnim - 27) / 5) * (2.44405-(22.24092)));
            yy = -0.06728 + (((tickAnim - 27) / 5) * (-0.10765-(-0.06728)));
            zz = -0.28941 + (((tickAnim - 27) / 5) * (-0.46306-(-0.28941)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 2.44405 + (((tickAnim - 32) / 3) * (-27.70386-(2.44405)));
            yy = -0.10765 + (((tickAnim - 32) / 3) * (-0.13456-(-0.10765)));
            zz = -0.46306 + (((tickAnim - 32) / 3) * (-0.57882-(-0.46306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 18) * (0-(-0.125)));
            zz = 0.3 + (((tickAnim - 0) / 18) * (0-(0.3)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.645-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0.645 + (((tickAnim - 23) / 7) * (1.36-(0.645)));
            zz = 0.35 + (((tickAnim - 23) / 7) * (0.15-(0.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 1.36 + (((tickAnim - 30) / 5) * (-0.125-(1.36)));
            zz = 0.15 + (((tickAnim - 30) / 5) * (0.3-(0.15)));
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
            xx = 39.75 + (((tickAnim - 0) / 5) * (14.11-(39.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.11 + (((tickAnim - 5) / 5) * (-12.77-(14.11)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -12.77 + (((tickAnim - 10) / 4) * (-9.4119-(-12.77)));
            yy = 0 + (((tickAnim - 10) / 4) * (-1.3408-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-2.40121-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -9.4119 + (((tickAnim - 14) / 4) * (33.75-(-9.4119)));
            yy = -1.3408 + (((tickAnim - 14) / 4) * (0-(-1.3408)));
            zz = -2.40121 + (((tickAnim - 14) / 4) * (0-(-2.40121)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 33.75 + (((tickAnim - 18) / 5) * (103.55-(33.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 103.55 + (((tickAnim - 23) / 5) * (109.28-(103.55)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 109.28 + (((tickAnim - 28) / 4) * (48.52-(109.28)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 48.52 + (((tickAnim - 32) / 3) * (39.75-(48.52)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 3) * (0.75-(-0.175)));
            zz = 0.5 + (((tickAnim - 0) / 3) * (0.43-(0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 2) * (1.17-(0.75)));
            zz = 0.43 + (((tickAnim - 3) / 2) * (0.36-(0.43)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.17 + (((tickAnim - 5) / 5) * (1.115-(1.17)));
            zz = 0.36 + (((tickAnim - 5) / 5) * (-0.055-(0.36)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.115 + (((tickAnim - 10) / 4) * (0-(1.115)));
            zz = -0.055 + (((tickAnim - 10) / 4) * (0.1-(-0.055)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0.1 + (((tickAnim - 14) / 4) * (0-(0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (1.95-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.95 + (((tickAnim - 23) / 5) * (2.95-(1.95)));
            zz = -0.3 + (((tickAnim - 23) / 5) * (-0.665-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 2.95 + (((tickAnim - 28) / 4) * (1.85-(2.95)));
            zz = -0.665 + (((tickAnim - 28) / 4) * (0-(-0.665)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 1.85 + (((tickAnim - 32) / 3) * (-0.175-(1.85)));
            zz = 0 + (((tickAnim - 32) / 3) * (0.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (-46.25-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = -46.25 + (((tickAnim - 4) / 21) * (30.75-(-46.25)));
            yy = 0 + (((tickAnim - 4) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 21) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30.75 + (((tickAnim - 25) / 10) * (-27.5-(30.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.64816 + (((tickAnim - 0) / 4) * (30.19358-(-5.64816)));
            yy = 3.8121 + (((tickAnim - 0) / 4) * (-5.54487-(3.8121)));
            zz = 1.78891 + (((tickAnim - 0) / 4) * (2.60205-(1.78891)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = 30.19358 + (((tickAnim - 4) / 21) * (35.5-(30.19358)));
            yy = -5.54487 + (((tickAnim - 4) / 21) * (0-(-5.54487)));
            zz = 2.60205 + (((tickAnim - 4) / 21) * (0-(2.60205)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 25) / 10) * (-5.64816-(35.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (3.8121-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (1.78891-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 0) / 4) * (0-(1.095)));
            zz = -0.75 + (((tickAnim - 0) / 4) * (0-(-0.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 4) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 21) * (0.125-(0)));
            zz = 0 + (((tickAnim - 4) / 21) * (-0.6-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 25) / 4) * (0.715-(0.125)));
            zz = -0.6 + (((tickAnim - 25) / 4) * (-0.985-(-0.6)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.715 + (((tickAnim - 29) / 6) * (1.095-(0.715)));
            zz = -0.985 + (((tickAnim - 29) / 6) * (-0.75-(-0.985)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 73.91662 + (((tickAnim - 0) / 4) * (15.75-(73.91662)));
            yy = 0.01635 + (((tickAnim - 0) / 4) * (0-(0.01635)));
            zz = 0.93736 + (((tickAnim - 0) / 4) * (0-(0.93736)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 15.75 + (((tickAnim - 4) / 9) * (-16.60644-(15.75)));
            yy = 0 + (((tickAnim - 4) / 9) * (0.54988-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (-0.20385-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -16.60644 + (((tickAnim - 13) / 12) * (20.50137-(-16.60644)));
            yy = 0.54988 + (((tickAnim - 13) / 12) * (0.05233-(0.54988)));
            zz = -0.20385 + (((tickAnim - 13) / 12) * (2.99954-(-0.20385)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 20.50137 + (((tickAnim - 25) / 4) * (64.51657-(20.50137)));
            yy = 0.05233 + (((tickAnim - 25) / 4) * (0.03598-(0.05233)));
            zz = 2.99954 + (((tickAnim - 25) / 4) * (2.06219-(2.99954)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 64.51657 + (((tickAnim - 29) / 6) * (73.91662-(64.51657)));
            yy = 0.03598 + (((tickAnim - 29) / 6) * (0.01635-(0.03598)));
            zz = 2.06219 + (((tickAnim - 29) / 6) * (0.93736-(2.06219)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 0) / 4) * (0.45-(0.9)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.45 + (((tickAnim - 4) / 4) * (1.55-(0.45)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.04-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.55 + (((tickAnim - 8) / 5) * (1.295-(1.55)));
            zz = 0.04 + (((tickAnim - 8) / 5) * (0.07-(0.04)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 1.295 + (((tickAnim - 13) / 12) * (1.675-(1.295)));
            zz = 0.07 + (((tickAnim - 13) / 12) * (0.175-(0.07)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 1.675 + (((tickAnim - 25) / 4) * (2.825-(1.675)));
            zz = 0.175 + (((tickAnim - 25) / 4) * (-0.33-(0.175)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 2.825 + (((tickAnim - 29) / 6) * (0.9-(2.825)));
            zz = -0.33 + (((tickAnim - 29) / 6) * (0-(-0.33)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9.25 + (((tickAnim - 0) / 8) * (30.75-(9.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 30.75 + (((tickAnim - 8) / 10) * (-27.5-(30.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -27.5 + (((tickAnim - 18) / 4) * (-46.25-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = -46.25 + (((tickAnim - 22) / 13) * (9.25-(-46.25)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.25 + (((tickAnim - 0) / 8) * (35.5-(17.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 35.5 + (((tickAnim - 8) / 10) * (-5.64816-(35.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (3.8121-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (1.78891-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -5.64816 + (((tickAnim - 18) / 4) * (30.19358-(-5.64816)));
            yy = 3.8121 + (((tickAnim - 18) / 4) * (5.54487-(3.8121)));
            zz = 1.78891 + (((tickAnim - 18) / 4) * (2.60205-(1.78891)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 30.19358 + (((tickAnim - 22) / 13) * (17.25-(30.19358)));
            yy = 5.54487 + (((tickAnim - 22) / 13) * (0-(5.54487)));
            zz = 2.60205 + (((tickAnim - 22) / 13) * (0-(2.60205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.125-(0)));
            zz = -0.6 + (((tickAnim - 0) / 8) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 8) / 5) * (0.715-(0.125)));
            zz = -0.6 + (((tickAnim - 8) / 5) * (-0.985-(-0.6)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.715 + (((tickAnim - 13) / 5) * (1.095-(0.715)));
            zz = -0.985 + (((tickAnim - 13) / 5) * (-0.75-(-0.985)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1.095 + (((tickAnim - 18) / 4) * (0-(1.095)));
            zz = -0.75 + (((tickAnim - 18) / 4) * (0-(-0.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (-0.6-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -23.49863 + (((tickAnim - 0) / 8) * (20.50137-(-23.49863)));
            yy = 0.05233 + (((tickAnim - 0) / 8) * (0.05233-(0.05233)));
            zz = 2.99954 + (((tickAnim - 0) / 8) * (2.99954-(2.99954)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20.50137 + (((tickAnim - 8) / 5) * (64.51657-(20.50137)));
            yy = 0.05233 + (((tickAnim - 8) / 5) * (0.03598-(0.05233)));
            zz = 2.99954 + (((tickAnim - 8) / 5) * (2.06219-(2.99954)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 64.51657 + (((tickAnim - 13) / 5) * (73.91662-(64.51657)));
            yy = 0.03598 + (((tickAnim - 13) / 5) * (0.01635-(0.03598)));
            zz = 2.06219 + (((tickAnim - 13) / 5) * (0.93736-(2.06219)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 73.91662 + (((tickAnim - 18) / 4) * (15.75-(73.91662)));
            yy = 0.01635 + (((tickAnim - 18) / 4) * (0-(0.01635)));
            zz = 0.93736 + (((tickAnim - 18) / 4) * (0-(0.93736)));
        }
        else if (tickAnim >= 22 && tickAnim < 35) {
            xx = 15.75 + (((tickAnim - 22) / 13) * (-23.49863-(15.75)));
            yy = 0 + (((tickAnim - 22) / 13) * (0.05233-(0)));
            zz = 0 + (((tickAnim - 22) / 13) * (2.99954-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 8) * (1.675-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.175-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.675 + (((tickAnim - 8) / 5) * (2.825-(1.675)));
            zz = 0.175 + (((tickAnim - 8) / 5) * (-0.33-(0.175)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 2.825 + (((tickAnim - 13) / 9) * (0.5-(2.825)));
            zz = -0.33 + (((tickAnim - 13) / 9) * (0-(-0.33)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 22) / 3) * (1.235-(0.5)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 1.235 + (((tickAnim - 25) / 4) * (0.7-(1.235)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 29) / 6) * (-0.15-(0.7)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-20))*1.8), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*3));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-30))*-0.3);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-80))*-0.2);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.18884-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.04037-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.17365-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 19.18884 + (((tickAnim - 5) / 3) * (22.24092-(19.18884)));
            yy = -0.04037 + (((tickAnim - 5) / 3) * (-0.06728-(-0.04037)));
            zz = -0.17365 + (((tickAnim - 5) / 3) * (-0.28941-(-0.17365)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 22.24092 + (((tickAnim - 8) / 5) * (2.44405-(22.24092)));
            yy = -0.06728 + (((tickAnim - 8) / 5) * (-0.10765-(-0.06728)));
            zz = -0.28941 + (((tickAnim - 8) / 5) * (-0.46306-(-0.28941)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 2.44405 + (((tickAnim - 13) / 4) * (-27.70386-(2.44405)));
            yy = -0.10765 + (((tickAnim - 13) / 4) * (-0.13456-(-0.10765)));
            zz = -0.46306 + (((tickAnim - 13) / 4) * (-0.57882-(-0.46306)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -27.70386 + (((tickAnim - 17) / 18) * (0-(-27.70386)));
            yy = -0.13456 + (((tickAnim - 17) / 18) * (0-(-0.13456)));
            zz = -0.57882 + (((tickAnim - 17) / 18) * (0-(-0.57882)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.645-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.35-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0.645 + (((tickAnim - 5) / 7) * (1.36-(0.645)));
            zz = 0.35 + (((tickAnim - 5) / 7) * (0.15-(0.35)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 1.36 + (((tickAnim - 12) / 5) * (-0.275-(1.36)));
            zz = 0.15 + (((tickAnim - 12) / 5) * (0.25-(0.15)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 17) / 6) * (1.305-(-0.275)));
            zz = 0.25 + (((tickAnim - 17) / 6) * (0.6-(0.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 1.305 + (((tickAnim - 23) / 12) * (0-(1.305)));
            zz = 0.6 + (((tickAnim - 23) / 12) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-26.12558-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.01198-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (2.74997-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -26.12558 + (((tickAnim - 14) / 4) * (-89.75115-(-26.12558)));
            yy = -0.01198 + (((tickAnim - 14) / 4) * (0.02396-(-0.01198)));
            zz = 2.74997 + (((tickAnim - 14) / 4) * (-5.49995-(2.74997)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -89.75115 + (((tickAnim - 18) / 5) * (-20.82581-(-89.75115)));
            yy = 0.02396 + (((tickAnim - 18) / 5) * (-0.01677-(0.02396)));
            zz = -5.49995 + (((tickAnim - 18) / 5) * (3.84996-(-5.49995)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -20.82581 + (((tickAnim - 23) / 6) * (25.4621-(-20.82581)));
            yy = -0.01677 + (((tickAnim - 23) / 6) * (-0.00839-(-0.01677)));
            zz = 3.84996 + (((tickAnim - 23) / 6) * (1.92498-(3.84996)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 25.4621 + (((tickAnim - 29) / 6) * (0-(25.4621)));
            yy = -0.00839 + (((tickAnim - 29) / 6) * (0-(-0.00839)));
            zz = 1.92498 + (((tickAnim - 29) / 6) * (0-(1.92498)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.565-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-0.145-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.565 + (((tickAnim - 14) / 3) * (0.6-(0.565)));
            zz = -0.145 + (((tickAnim - 14) / 3) * (0.2-(-0.145)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 17) / 1) * (-0.3-(0.6)));
            zz = 0.2 + (((tickAnim - 17) / 1) * (0.425-(0.2)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 18) / 3) * (0.665-(-0.3)));
            zz = 0.425 + (((tickAnim - 18) / 3) * (0.21-(0.425)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0.665 + (((tickAnim - 21) / 2) * (0.375-(0.665)));
            zz = 0.21 + (((tickAnim - 21) / 2) * (0-(0.21)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 23) / 6) * (0-(0.375)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-50))*2), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*2));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-100))*3), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*2));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-150))*4), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*2));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*5), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*2));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-130))*2), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-3));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-200))*1), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/0.5-230))*1.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(4), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*8), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-0.3);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(115.5854961203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5), rightLeg.rotateAngleY + (float) Math.toRadians(5.63683), rightLeg.rotateAngleZ + (float) Math.toRadians(66.01469));
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(-1.55);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-46.0905360139+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*10), rightLeg2.rotateAngleY + (float) Math.toRadians(6.39002), rightLeg2.rotateAngleZ + (float) Math.toRadians(-10.74922));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(0.825);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(0.575);


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(72.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*10), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(1.1);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*20), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(115.5854961203+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-5), leftLeg.rotateAngleY + (float) Math.toRadians(-5.63683), leftLeg.rotateAngleZ + (float) Math.toRadians(-66.01469));
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(0);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(-1.55);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(-1.5);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-46.0905360139+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-10), leftLeg2.rotateAngleY + (float) Math.toRadians(-6.39002), leftLeg2.rotateAngleZ + (float) Math.toRadians(10.74922));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(0.825);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(0.575);


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(72.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(0);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(1.1);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-20), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*10), Tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(10), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*12), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(4.75), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*15), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*18), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(-3.5), Chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-8), Chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*8), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-290))*-3), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(49.82088), rightArm.rotateAngleY + (float) Math.toRadians(-5.3081184658+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-1), rightArm.rotateAngleZ + (float) Math.toRadians(-32.30185));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(93.26285), rightArm2.rotateAngleY + (float) Math.toRadians(-0.24363), rightArm2.rotateAngleZ + (float) Math.toRadians(99.4682));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(75.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-4), rightArm3.rotateAngleY + (float) Math.toRadians(0), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(49.82088), leftArm.rotateAngleY + (float) Math.toRadians(5.3081184658+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-2), leftArm.rotateAngleZ + (float) Math.toRadians(32.30185));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(93.26285), leftArm2.rotateAngleY + (float) Math.toRadians(0.24363), leftArm2.rotateAngleZ + (float) Math.toRadians(-99.4682));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(75.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*4), leftArm3.rotateAngleY + (float) Math.toRadians(0), leftArm3.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProterochampsa entity = (EntityPrehistoricFloraProterochampsa) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+80))*3), Hips.rotateAngleY + (float) Math.toRadians(0), Hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*4));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 54.25 + (((tickAnim - 0) / 6) * (-25.68-(54.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -25.68 + (((tickAnim - 6) / 2) * (-8.5-(-25.68)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.5 + (((tickAnim - 8) / 7) * (54.25-(-8.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.25 + (((tickAnim - 0) / 6) * (32.5-(12.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 32.5 + (((tickAnim - 6) / 2) * (-0.25-(32.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.25 + (((tickAnim - 8) / 7) * (12.25-(-0.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 1.175 + (((tickAnim - 0) / 8) * (0-(1.175)));
            zz = 0.45 + (((tickAnim - 0) / 8) * (0-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (-0.11-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.17-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 10) / 1) * (-0.2-(-0.11)));
            zz = 0.17 + (((tickAnim - 10) / 1) * (0.22-(0.17)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 11) / 1) * (0.61-(-0.2)));
            zz = 0.22 + (((tickAnim - 11) / 1) * (0.28-(0.22)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.61 + (((tickAnim - 12) / 3) * (1.175-(0.61)));
            zz = 0.28 + (((tickAnim - 12) / 3) * (0.45-(0.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41 + (((tickAnim - 0) / 3) * (82.81-(41)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 82.81 + (((tickAnim - 3) / 3) * (56.9-(82.81)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 56.9 + (((tickAnim - 6) / 2) * (4.5-(56.9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 4.5 + (((tickAnim - 8) / 3) * (-18.38-(4.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -18.38 + (((tickAnim - 11) / 4) * (41-(-18.38)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.27-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 3.27 + (((tickAnim - 3) / 3) * (1.8-(3.27)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.8 + (((tickAnim - 6) / 2) * (-0.075-(1.8)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 8) / 2) * (-0.79-(-0.075)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.18-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -0.79 + (((tickAnim - 10) / 1) * (-0.85-(-0.79)));
            zz = -0.18 + (((tickAnim - 10) / 1) * (-0.275-(-0.18)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.85 + (((tickAnim - 11) / 2) * (-0.075-(-0.85)));
            zz = -0.275 + (((tickAnim - 11) / 2) * (0.14-(-0.275)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.075 + (((tickAnim - 13) / 2) * (0-(-0.075)));
            zz = 0.14 + (((tickAnim - 13) / 2) * (0-(0.14)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 33.25 + (((tickAnim - 0) / 6) * (0-(33.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-43.7-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -43.7 + (((tickAnim - 13) / 2) * (33.25-(-43.7)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.2-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 1.2 + (((tickAnim - 6) / 5) * (0-(1.2)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -14.23 + (((tickAnim - 0) / 1) * (-8.5-(-14.23)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -8.5 + (((tickAnim - 1) / 7) * (54.25-(-8.5)));
            yy = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 54.25 + (((tickAnim - 8) / 5) * (-25.68-(54.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -25.68 + (((tickAnim - 13) / 2) * (-14.23-(-25.68)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 10.67 + (((tickAnim - 0) / 1) * (-0.25-(10.67)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -0.25 + (((tickAnim - 1) / 7) * (12.25-(-0.25)));
            yy = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.25 + (((tickAnim - 8) / 5) * (32.5-(12.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 32.5 + (((tickAnim - 13) / 2) * (10.67-(32.5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.225 + (((tickAnim - 0) / 1) * (0.5-(1.225)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.5 + (((tickAnim - 1) / 2) * (-0.255-(0.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0.11-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.255 + (((tickAnim - 3) / 5) * (1.175-(-0.255)));
            zz = 0.11 + (((tickAnim - 3) / 5) * (0.45-(0.11)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.175 + (((tickAnim - 8) / 7) * (1.225-(1.175)));
            zz = 0.45 + (((tickAnim - 8) / 7) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 24.8 + (((tickAnim - 0) / 1) * (8-(24.8)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 8 + (((tickAnim - 1) / 2) * (-11-(8)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11 + (((tickAnim - 3) / 5) * (41-(-11)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 41 + (((tickAnim - 8) / 2) * (82.81-(41)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 82.81 + (((tickAnim - 10) / 3) * (56.9-(82.81)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 56.9 + (((tickAnim - 13) / 2) * (24.8-(56.9)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 1) * (-0.4-(0.45)));
            zz = 0.275 + (((tickAnim - 0) / 1) * (0-(0.275)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.4 + (((tickAnim - 1) / 2) * (-0.675-(-0.4)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.675 + (((tickAnim - 3) / 1) * (0.03-(-0.675)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.075-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.03 + (((tickAnim - 4) / 4) * (0-(0.03)));
            zz = 0.075 + (((tickAnim - 4) / 4) * (0-(0.075)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (3.27-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 3.27 + (((tickAnim - 10) / 3) * (1.8-(3.27)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.8 + (((tickAnim - 13) / 2) * (0.45-(1.8)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




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
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-36.17-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -36.17 + (((tickAnim - 4) / 4) * (33.25-(-36.17)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 33.25 + (((tickAnim - 8) / 5) * (0-(33.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 1) * (0-(0.775)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.625-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 4) / 4) * (0-(0.625)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (1.2-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.2 + (((tickAnim - 13) / 2) * (0.775-(1.2)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*3), Tail1.rotateAngleY + (float) Math.toRadians(0), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*4));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*6), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*4));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*9), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*4));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*12), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*4));


        this.setRotateAngle(Chest, Chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*3), Chest.rotateAngleY + (float) Math.toRadians(0), Chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*4));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*3), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*4));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-180))*4), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*-4));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -76.50997 + (((tickAnim - 0) / 8) * (38.25-(-76.50997)));
            yy = 1.37136 + (((tickAnim - 0) / 8) * (0-(1.37136)));
            zz = 20.92041 + (((tickAnim - 0) / 8) * (0-(20.92041)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 38.25 + (((tickAnim - 8) / 3) * (-40.15986-(38.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (-2.73314-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (43.92433-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -40.15986 + (((tickAnim - 11) / 4) * (-76.50997-(-40.15986)));
            yy = -2.73314 + (((tickAnim - 11) / 4) * (1.37136-(-2.73314)));
            zz = 43.92433 + (((tickAnim - 11) / 4) * (20.92041-(43.92433)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 65.74355 + (((tickAnim - 0) / 8) * (27.75-(65.74355)));
            yy = 14.48763 + (((tickAnim - 0) / 8) * (0-(14.48763)));
            zz = 3.83279 + (((tickAnim - 0) / 8) * (0-(3.83279)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.75 + (((tickAnim - 8) / 3) * (-11.10889-(27.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (41.84906-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-14.98212-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.10889 + (((tickAnim - 11) / 4) * (65.74355-(-11.10889)));
            yy = 41.84906 + (((tickAnim - 11) / 4) * (14.48763-(41.84906)));
            zz = -14.98212 + (((tickAnim - 11) / 4) * (3.83279-(-14.98212)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 8) / 7) * (0-(0.7)));
            zz = -0.925 + (((tickAnim - 8) / 7) * (0-(-0.925)));
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
            xx = 6.20395 + (((tickAnim - 0) / 3) * (-23-(6.20395)));
            yy = 2.23652 + (((tickAnim - 0) / 3) * (0-(2.23652)));
            zz = -2.35867 + (((tickAnim - 0) / 3) * (0-(-2.35867)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -23 + (((tickAnim - 3) / 5) * (37.75-(-23)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 37.75 + (((tickAnim - 8) / 0) * (81.51-(37.75)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 81.51 + (((tickAnim - 8) / 3) * (62.78-(81.51)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 62.78 + (((tickAnim - 11) / 4) * (6.20395-(62.78)));
            yy = 0 + (((tickAnim - 11) / 4) * (2.23652-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (-2.35867-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.075 + (((tickAnim - 0) / 2) * (0.925-(1.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.925 + (((tickAnim - 2) / 1) * (0-(0.925)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (2-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0.025-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 2 + (((tickAnim - 8) / 0) * (2.23-(2)));
            zz = 0.025 + (((tickAnim - 8) / 0) * (0.02-(0.025)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 2.23 + (((tickAnim - 8) / 1) * (2.945-(2.23)));
            zz = 0.02 + (((tickAnim - 8) / 1) * (-0.44-(0.02)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 2.945 + (((tickAnim - 9) / 2) * (1.225-(2.945)));
            zz = -0.44 + (((tickAnim - 9) / 2) * (0-(-0.44)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.225 + (((tickAnim - 11) / 4) * (1.075-(1.225)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 38.25 + (((tickAnim - 0) / 3) * (-40.15986-(38.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.73314-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-43.92433-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -40.15986 + (((tickAnim - 3) / 5) * (-76.50997-(-40.15986)));
            yy = 2.73314 + (((tickAnim - 3) / 5) * (-1.37136-(2.73314)));
            zz = -43.92433 + (((tickAnim - 3) / 5) * (-20.92041-(-43.92433)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -76.50997 + (((tickAnim - 8) / 7) * (38.25-(-76.50997)));
            yy = -1.37136 + (((tickAnim - 8) / 7) * (0-(-1.37136)));
            zz = -20.92041 + (((tickAnim - 8) / 7) * (0-(-20.92041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.75 + (((tickAnim - 0) / 3) * (-11.10889-(27.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (-41.84906-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (14.98212-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.10889 + (((tickAnim - 3) / 5) * (65.74355-(-11.10889)));
            yy = -41.84906 + (((tickAnim - 3) / 5) * (-14.48763-(-41.84906)));
            zz = 14.98212 + (((tickAnim - 3) / 5) * (-3.83279-(14.98212)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 65.74355 + (((tickAnim - 8) / 7) * (27.75-(65.74355)));
            yy = -14.48763 + (((tickAnim - 8) / 7) * (0-(-14.48763)));
            zz = -3.83279 + (((tickAnim - 8) / 7) * (0-(-3.83279)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 1) * (0.89-(0.55)));
            zz = -0.725 + (((tickAnim - 0) / 1) * (-1.015-(-0.725)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            yy = 0.89 + (((tickAnim - 1) / 7) * (0-(0.89)));
            zz = -1.015 + (((tickAnim - 1) / 7) * (0-(-1.015)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.55-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.725-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 37.75 + (((tickAnim - 0) / 1) * (81.51-(37.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 81.51 + (((tickAnim - 1) / 2) * (62.78-(81.51)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 62.78 + (((tickAnim - 3) / 5) * (3.181-(62.78)));
            yy = 0 + (((tickAnim - 3) / 5) * (-2.59657-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (3.04371-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.181 + (((tickAnim - 8) / 3) * (-23-(3.181)));
            yy = -2.59657 + (((tickAnim - 8) / 3) * (0-(-2.59657)));
            zz = 3.04371 + (((tickAnim - 8) / 3) * (0-(3.04371)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -23 + (((tickAnim - 11) / 4) * (37.75-(-23)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 1.9 + (((tickAnim - 0) / 1) * (2.205-(1.9)));
            zz = 0.025 + (((tickAnim - 0) / 1) * (-0.205-(0.025)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 2.205 + (((tickAnim - 1) / 1) * (2.945-(2.205)));
            zz = -0.205 + (((tickAnim - 1) / 1) * (-0.44-(-0.205)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 2.945 + (((tickAnim - 2) / 1) * (1.225-(2.945)));
            zz = -0.44 + (((tickAnim - 2) / 1) * (0-(-0.44)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.225 + (((tickAnim - 3) / 5) * (1-(1.225)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 1) * (0.83-(1)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.83 + (((tickAnim - 9) / 2) * (0-(0.83)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.41-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.01-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.41 + (((tickAnim - 13) / 2) * (1.9-(1.41)));
            zz = 0.01 + (((tickAnim - 13) / 2) * (0.025-(0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProterochampsa e = (EntityPrehistoricFloraProterochampsa) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
