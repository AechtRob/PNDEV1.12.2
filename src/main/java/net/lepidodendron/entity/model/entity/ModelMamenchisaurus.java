package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMamenchisaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMamenchisaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer TailClub;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer ForeHead;
    private final AdvancedModelRenderer ForeHead2;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer Snout2;
    private final AdvancedModelRenderer Snout3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Nose;
    private final AdvancedModelRenderer Nose2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Jaw2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Jaw3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;

    private ModelAnimator animator;

    public ModelMamenchisaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -5.5F, 17.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 69, 30, -9.5F, -10.0F, -11.0F, 19, 25, 19, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -11.0F, 8.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 96, 74, -7.5F, 0.0F, -18.0F, 15, 4, 18, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-8.0F, 0.0F, -2.5F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1745F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 145, 24, -4.5F, -4.0F, -5.0F, 9, 20, 11, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 15.0F, -2.5F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4189F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 164, 168, -3.5F, 0.0F, -1.0F, 7, 15, 7, 0.0F, false));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 14.0F, 4.5F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.2356F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 67, 0, -4.5F, -1.0F, -6.0F, 9, 4, 8, 0.0F, false));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 0, 66, -4.5F, -4.0F, -3.0F, 9, 4, 3, -0.01F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(8.0F, 0.0F, -2.5F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1745F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 50, 156, -4.5F, -4.0F, -5.0F, 9, 20, 11, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 15.0F, -2.5F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4189F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 174, 134, -3.5F, 0.0F, -1.0F, 7, 15, 7, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 14.0F, 4.5F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2356F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 174, 22, -4.5F, -1.0F, -6.0F, 9, 4, 8, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 3.0F, -6.0F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 0, 130, -4.5F, -4.0F, -3.0F, 9, 4, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -5.9F, 8.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.0436F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 139, -6.5F, -5.0F, -2.0F, 13, 19, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.6F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 144, 59, -4.0F, -5.0F, -2.0F, 8, 12, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -1.4F, 13.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 162, 0, -2.5F, -3.0F, -2.0F, 5, 8, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.65F, 12.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 90, 167, -2.0F, -2.0F, -1.0F, 4, 6, 15, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.35F, 14.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 128, 168, -1.5F, -2.0F, -1.0F, 3, 4, 15, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.15F, 14.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0873F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 172, 42, -1.0F, -1.5F, -1.0F, 2, 3, 13, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.2182F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 129, 141, -0.5F, -1.0F, -1.0F, 1, 2, 11, 0.0F, false));

        this.TailClub = new AdvancedModelRenderer(this);
        this.TailClub.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.tail7.addChild(TailClub);
        this.TailClub.cubeList.add(new ModelBox(TailClub, 50, 63, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.2182F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -11.5F, -9.5F, -23.0F, 23, 28, 21, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -16.0F, -25.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 0, -9.5F, 0.75F, 4.0F, 19, 6, 18, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -2.0F, -20.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, -0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.0F, -17.0F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 87, 141, -7.0F, -12.75F, 2.0F, 14, 12, 14, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 40.0F, -13.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 106, 100, -9.5F, -47.5F, -5.35F, 19, 25, 16, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(8.75F, 13.65F, -8.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.48F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 176, 108, -3.5F, -3.5F, -3.5F, 7, 15, 7, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 12.0F, -1.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3491F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 95, -3.0F, -2.0F, -1.0F, 6, 12, 5, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.25F, 9.0F, 1.25F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.1309F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 144, 0, -3.75F, 0.0F, -2.0F, 7, 5, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.75F, 3.0F, -0.25F);
        this.leftHand.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -1.1781F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 73, -2.0F, -0.75F, -0.75F, 4, 1, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-8.75F, 13.65F, -8.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.48F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 170, -3.5F, -3.5F, -3.5F, 7, 15, 7, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 12.0F, -1.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3491F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 49, -3.0F, -2.0F, -1.0F, 6, 12, 5, 0.0F, false));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.25F, 9.0F, 1.25F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.1309F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 126, 24, -3.25F, 0.0F, -2.0F, 7, 5, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(3.75F, 3.0F, -0.25F);
        this.rightHand.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.1781F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 73, -2.0F, -0.75F, -0.75F, 4, 1, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -8.275F, -6.275F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3927F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 49, -6.0F, -7.0F, -26.0F, 12, 20, 26, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0F, -24.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0087F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 74, -5.0F, -5.0F, -26.0F, 10, 16, 26, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -24.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 41, 116, -4.5F, -5.0F, -21.0F, 9, 14, 21, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.9F, -19.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 0, 95, -4.0F, -4.0F, -23.0F, 8, 12, 23, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.1F, -21.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0785F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 143, 141, -3.5F, -4.0F, -17.0F, 7, 10, 17, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.9F, -16.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.0785F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 160, 86, -3.0F, -3.0F, -13.0F, 6, 8, 14, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, -0.9F, -12.0F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.0873F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 80, 116, -2.5F, -2.0F, -6.0F, 5, 7, 7, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, 0.25F, -6.0F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.0873F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 0, 0, -2.0F, -2.0F, -5.0F, 4, 5, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.5F, -0.15F, -4.0F);
        this.neck8.addChild(head);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 50, 56, -3.0F, -2.0F, -3.0F, 5, 4, 3, 0.0F, false));

        this.ForeHead = new AdvancedModelRenderer(this);
        this.ForeHead.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.head.addChild(ForeHead);
        this.setRotateAngle(ForeHead, -0.3054F, 0.0F, 0.0F);
        this.ForeHead.cubeList.add(new ModelBox(ForeHead, 50, 71, -2.5F, -1.0F, 0.0F, 4, 1, 3, 0.001F, false));

        this.ForeHead2 = new AdvancedModelRenderer(this);
        this.ForeHead2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.ForeHead.addChild(ForeHead2);
        this.setRotateAngle(ForeHead2, 0.3491F, 0.0F, 0.0F);
        this.ForeHead2.cubeList.add(new ModelBox(ForeHead2, 93, 0, -2.0F, -0.01F, -3.0F, 3, 3, 3, 0.0F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.head.addChild(Snout);
        this.setRotateAngle(Snout, 0.0873F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 50, 49, -2.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.Snout2 = new AdvancedModelRenderer(this);
        this.Snout2.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Snout.addChild(Snout2);
        this.setRotateAngle(Snout2, -0.2618F, 0.0F, 0.0F);
        this.Snout2.cubeList.add(new ModelBox(Snout2, 59, 63, -2.0F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Snout3 = new AdvancedModelRenderer(this);
        this.Snout3.setRotationPoint(0.0F, -0.15F, -1.5F);
        this.Snout2.addChild(Snout3);
        this.setRotateAngle(Snout3, 0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, 1.8F);
        this.Snout3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 95, -2.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.8F, 1.8F);
        this.Snout3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 0, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Nose = new AdvancedModelRenderer(this);
        this.Nose.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Snout2.addChild(Nose);
        this.setRotateAngle(Nose, -0.1309F, 0.0F, 0.0F);
        this.Nose.cubeList.add(new ModelBox(Nose, 67, 3, -1.5F, -1.0F, 0.0F, 2, 1, 2, 0.001F, false));

        this.Nose2 = new AdvancedModelRenderer(this);
        this.Nose2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Nose.addChild(Nose2);
        this.setRotateAngle(Nose2, 0.9861F, 0.0F, 0.0F);
        this.Nose2.cubeList.add(new ModelBox(Nose2, 11, 11, -1.5F, -0.01F, 0.0F, 2, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.8F, -1.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 88, 24, -3.0F, 0.1F, -1.99F, 5, 2, 3, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 67, 12, -2.5F, -0.94F, -3.7069F, 4, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 74, -2.5F, -1.25F, -0.4F, 4, 2, 1, -0.01F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 67, 17, -3.0F, -1.5F, 0.2F, 5, 2, 2, -0.01F, false));

        this.Jaw2 = new AdvancedModelRenderer(this);
        this.Jaw2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.jaw.addChild(Jaw2);
        this.setRotateAngle(Jaw2, 0.1309F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Jaw2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 49, -1.5F, -0.4869F, -0.3009F, 2, 1, 2, -0.001F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 80, -2.0F, -0.4869F, 1.6991F, 3, 1, 2, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 79, 13, -2.5F, -1.7091F, -3.8132F, 4, 1, 4, -0.001F, false));

        this.Jaw3 = new AdvancedModelRenderer(this);
        this.Jaw3.setRotationPoint(0.0F, 1.0F, -3.95F);
        this.Jaw2.addChild(Jaw3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, 3.95F);
        this.Jaw3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2269F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 39, 95, -2.0F, -0.7364F, -6.0416F, 3, 1, 3, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 51, 95, -2.0F, -0.9114F, -6.0416F, 3, 1, 3, -0.001F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.95F, -4.6F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3665F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 11, -2.0F, -4.5F, 2.55F, 3, 4, 5, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.75F, 5.6F);
        this.throat.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 96, 77, -2.0F, 0.7F, -4.25F, 3, 1, 2, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 91, 12, -2.0F, 1.7F, -5.25F, 3, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraMamenchisaurus diplo = (EntityPrehistoricFloraMamenchisaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = diplo.getJuvenile();

        if (isBaby) {
            this.neck5.scaleChildren = true;
            this.neck6.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.neck6.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1F, 1, 1F);
            this.neck6.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.neck7, this.neck8, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        diplo.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = diplo.getTravelSpeed()/2;

            if (!diplo.isInWater()) {

                if (f3 == 0.0F || !diplo.getIsMoving()) {
                    if (diplo.getAnimation() != diplo.EAT_ANIMATION
                        && diplo.getAnimation() != diplo.DRINK_ANIMATION
                        && diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMamenchisaurus ee = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LOOK_ANIMATION) { //The leaves grazing anim
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;
        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 6 + (((tickAnim - 24) / 3) * (6.00883-(6)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 6.00883 + (((tickAnim - 27) / 2) * (6.00098-(6.00883)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 6.00098 + (((tickAnim - 29) / 3) * (6-(6.00098)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 32) / 18) * (6-(6)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 6 + (((tickAnim - 50) / 3) * (6.00883-(6)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 6.00883 + (((tickAnim - 53) / 2) * (6.00393-(6.00883)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 6.00393 + (((tickAnim - 55) / 3) * (6-(6.00393)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 105) {
            xx = 6 + (((tickAnim - 58) / 47) * (6-(6)));
            yy = 0 + (((tickAnim - 58) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 47) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 6 + (((tickAnim - 105) / 13) * (4.72-(6)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 4.72 + (((tickAnim - 118) / 7) * (4.08-(4.72)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 142) {
            xx = 4.08 + (((tickAnim - 125) / 17) * (2.48-(4.08)));
            yy = 0 + (((tickAnim - 125) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 17) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 147) {
            xx = 2.48 + (((tickAnim - 142) / 5) * (2-(2.48)));
            yy = 0 + (((tickAnim - 142) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 5) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 168) {
            xx = 2 + (((tickAnim - 147) / 21) * (0-(2)));
            yy = 0 + (((tickAnim - 147) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (2.29-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 2.29 + (((tickAnim - 23) / 1) * (2.43-(2.29)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 2.43 + (((tickAnim - 24) / 3) * (2.85951-(2.43)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 2.85951 + (((tickAnim - 27) / 2) * (3.28952-(2.85951)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 3.28952 + (((tickAnim - 29) / 3) * (3.72-(3.28952)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 3.72 + (((tickAnim - 32) / 1) * (4-(3.72)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 33) / 17) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 4 + (((tickAnim - 50) / 3) * (3.99795-(4)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 3.99795 + (((tickAnim - 53) / 2) * (3.99909-(3.99795)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 3.99909 + (((tickAnim - 55) / 3) * (4-(3.99909)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 105) {
            xx = 4 + (((tickAnim - 58) / 47) * (4-(4)));
            yy = 0 + (((tickAnim - 58) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 47) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 4 + (((tickAnim - 105) / 13) * (2.55-(4)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 2.55 + (((tickAnim - 118) / 7) * (1.83-(2.55)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 141) {
            xx = 1.83 + (((tickAnim - 125) / 16) * (0.09-(1.83)));
            yy = 0 + (((tickAnim - 125) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 16) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 147) {
            xx = 0.09 + (((tickAnim - 141) / 6) * (0-(0.09)));
            yy = 0 + (((tickAnim - 141) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 6) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 147) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.6-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 7.6 + (((tickAnim - 14) / 14) * (2-(7.6)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 28) / 7) * (27.50966-(2)));
            yy = 0 + (((tickAnim - 28) / 7) * (5.88262-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-11.40519-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 27.50966 + (((tickAnim - 35) / 5) * (24.71739-(27.50966)));
            yy = 5.88262 + (((tickAnim - 35) / 5) * (10.58872-(5.88262)));
            zz = -11.40519 + (((tickAnim - 35) / 5) * (-20.52934-(-11.40519)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 24.71739 + (((tickAnim - 40) / 3) * (24.25438-(24.71739)));
            yy = 10.58872 + (((tickAnim - 40) / 3) * (10.77386-(10.58872)));
            zz = -20.52934 + (((tickAnim - 40) / 3) * (-21.41523-(-20.52934)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 24.25438 + (((tickAnim - 43) / 5) * (4.40617-(24.25438)));
            yy = 10.77386 + (((tickAnim - 43) / 5) * (11.03306-(10.77386)));
            zz = -21.41523 + (((tickAnim - 43) / 5) * (-22.65548-(-21.41523)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 4.40617 + (((tickAnim - 48) / 3) * (4.66337-(4.40617)));
            yy = 11.03306 + (((tickAnim - 48) / 3) * (12.93742-(11.03306)));
            zz = -22.65548 + (((tickAnim - 48) / 3) * (-21.43992-(-22.65548)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 4.66337 + (((tickAnim - 51) / 3) * (3.94005-(4.66337)));
            yy = 12.93742 + (((tickAnim - 51) / 3) * (5.92243-(12.93742)));
            zz = -21.43992 + (((tickAnim - 51) / 3) * (-25.84435-(-21.43992)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 3.94005 + (((tickAnim - 54) / 4) * (4.41-(3.94005)));
            yy = 5.92243 + (((tickAnim - 54) / 4) * (11.03-(5.92243)));
            zz = -25.84435 + (((tickAnim - 54) / 4) * (-22.66-(-25.84435)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = 4.41 + (((tickAnim - 58) / 37) * (4.41-(4.41)));
            yy = 11.03 + (((tickAnim - 58) / 37) * (11.03-(11.03)));
            zz = -22.66 + (((tickAnim - 58) / 37) * (-22.66-(-22.66)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 4.41 + (((tickAnim - 95) / 6) * (25.3075-(4.41)));
            yy = 11.03 + (((tickAnim - 95) / 6) * (8.2725-(11.03)));
            zz = -22.66 + (((tickAnim - 95) / 6) * (-16.995-(-22.66)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 25.3075 + (((tickAnim - 101) / 5) * (28.79617-(25.3075)));
            yy = 8.2725 + (((tickAnim - 101) / 5) * (-3.3873-(8.2725)));
            zz = -16.995 + (((tickAnim - 101) / 5) * (-5.73611-(-16.995)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 28.79617 + (((tickAnim - 106) / 5) * (32.91013-(28.79617)));
            yy = -3.3873 + (((tickAnim - 106) / 5) * (-2.57729-(-3.3873)));
            zz = -5.73611 + (((tickAnim - 106) / 5) * (-4.36443-(-5.73611)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 32.91013 + (((tickAnim - 111) / 4) * (11.02409-(32.91013)));
            yy = -2.57729 + (((tickAnim - 111) / 4) * (-1.76729-(-2.57729)));
            zz = -4.36443 + (((tickAnim - 111) / 4) * (-2.99276-(-4.36443)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 11.02409 + (((tickAnim - 115) / 3) * (8-(11.02409)));
            yy = -1.76729 + (((tickAnim - 115) / 3) * (0-(-1.76729)));
            zz = -2.99276 + (((tickAnim - 115) / 3) * (0-(-2.99276)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 8 + (((tickAnim - 118) / 2) * (8.95465-(8)));
            yy = 0 + (((tickAnim - 118) / 2) * (-5.64018-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (-4.1526-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 8.95465 + (((tickAnim - 120) / 2) * (9.56719-(8.95465)));
            yy = -5.64018 + (((tickAnim - 120) / 2) * (3.1936-(-5.64018)));
            zz = -4.1526 + (((tickAnim - 120) / 2) * (2.40976-(-4.1526)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = 9.56719 + (((tickAnim - 122) / 1) * (10.25-(9.56719)));
            yy = 3.1936 + (((tickAnim - 122) / 1) * (0-(3.1936)));
            zz = 2.40976 + (((tickAnim - 122) / 1) * (0-(2.40976)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = 10.25 + (((tickAnim - 123) / 9) * (14-(10.25)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = 14 + (((tickAnim - 132) / 44) * (0-(14)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-51.65-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -51.65 + (((tickAnim - 14) / 14) * (-66-(-51.65)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -66 + (((tickAnim - 28) / 7) * (-92.22675-(-66)));
            yy = 0 + (((tickAnim - 28) / 7) * (-7.79969-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (5.87916-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -92.22675 + (((tickAnim - 35) / 5) * (-80.84739-(-92.22675)));
            yy = -7.79969 + (((tickAnim - 35) / 5) * (-18.92089-(-7.79969)));
            zz = 5.87916 + (((tickAnim - 35) / 5) * (-0.40358-(5.87916)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -80.84739 + (((tickAnim - 40) / 3) * (-66.64321-(-80.84739)));
            yy = -18.92089 + (((tickAnim - 40) / 3) * (-19.08054-(-18.92089)));
            zz = -0.40358 + (((tickAnim - 40) / 3) * (-4.47337-(-0.40358)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -66.64321 + (((tickAnim - 43) / 5) * (-20.35736-(-66.64321)));
            yy = -19.08054 + (((tickAnim - 43) / 5) * (-19.30405-(-19.08054)));
            zz = -4.47337 + (((tickAnim - 43) / 5) * (-10.17108-(-4.47337)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -20.35736 + (((tickAnim - 48) / 3) * (-18.52776-(-20.35736)));
            yy = -19.30405 + (((tickAnim - 48) / 3) * (-22.89264-(-19.30405)));
            zz = -10.17108 + (((tickAnim - 48) / 3) * (-9.8496-(-10.17108)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = -18.52776 + (((tickAnim - 51) / 3) * (-20.66451-(-18.52776)));
            yy = -22.89264 + (((tickAnim - 51) / 3) * (-20.45318-(-22.89264)));
            zz = -9.8496 + (((tickAnim - 51) / 3) * (-3.36844-(-9.8496)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -20.66451 + (((tickAnim - 54) / 4) * (-20.36-(-20.66451)));
            yy = -20.45318 + (((tickAnim - 54) / 4) * (-19.3-(-20.45318)));
            zz = -3.36844 + (((tickAnim - 54) / 4) * (-10.17-(-3.36844)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = -20.36 + (((tickAnim - 58) / 37) * (-20.36-(-20.36)));
            yy = -19.3 + (((tickAnim - 58) / 37) * (-19.3-(-19.3)));
            zz = -10.17 + (((tickAnim - 58) / 37) * (-10.17-(-10.17)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = -20.36 + (((tickAnim - 95) / 6) * (-65.08991-(-20.36)));
            yy = -19.3 + (((tickAnim - 95) / 6) * (-4.48794-(-19.3)));
            zz = -10.17 + (((tickAnim - 95) / 6) * (15.959-(-10.17)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -65.08991 + (((tickAnim - 101) / 5) * (-64.29747-(-65.08991)));
            yy = -4.48794 + (((tickAnim - 101) / 5) * (-15.35512-(-4.48794)));
            zz = 15.959 + (((tickAnim - 101) / 5) * (5.87433-(15.959)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = -64.29747 + (((tickAnim - 106) / 5) * (-82.92198-(-64.29747)));
            yy = -15.35512 + (((tickAnim - 106) / 5) * (-11.68325-(-15.35512)));
            zz = 5.87433 + (((tickAnim - 106) / 5) * (4.4696-(5.87433)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = -82.92198 + (((tickAnim - 111) / 4) * (-77.5465-(-82.92198)));
            yy = -11.68325 + (((tickAnim - 111) / 4) * (-8.01137-(-11.68325)));
            zz = 4.4696 + (((tickAnim - 111) / 4) * (3.06487-(4.4696)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = -77.5465 + (((tickAnim - 115) / 3) * (-56-(-77.5465)));
            yy = -8.01137 + (((tickAnim - 115) / 3) * (0-(-8.01137)));
            zz = 3.06487 + (((tickAnim - 115) / 3) * (0-(3.06487)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = -56 + (((tickAnim - 118) / 2) * (-57.28117-(-56)));
            yy = 0 + (((tickAnim - 118) / 2) * (12.51594-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (-0.92109-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = -57.28117 + (((tickAnim - 120) / 2) * (-56.92756-(-57.28117)));
            yy = 12.51594 + (((tickAnim - 120) / 2) * (-5.89035-(12.51594)));
            zz = -0.92109 + (((tickAnim - 120) / 2) * (2.32819-(-0.92109)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = -56.92756 + (((tickAnim - 122) / 1) * (-57.25-(-56.92756)));
            yy = -5.89035 + (((tickAnim - 122) / 1) * (0-(-5.89035)));
            zz = 2.32819 + (((tickAnim - 122) / 1) * (0-(2.32819)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = -57.25 + (((tickAnim - 123) / 9) * (-46-(-57.25)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = -46 + (((tickAnim - 132) / 44) * (0-(-46)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (41.7-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 41.7 + (((tickAnim - 14) / 14) * (56-(41.7)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 56 + (((tickAnim - 28) / 7) * (81.75451-(56)));
            yy = 0 + (((tickAnim - 28) / 7) * (1.69151-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-3.37429-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 81.75451 + (((tickAnim - 35) / 5) * (87.46818-(81.75451)));
            yy = 1.69151 + (((tickAnim - 35) / 5) * (-0.90376-(1.69151)));
            zz = -3.37429 + (((tickAnim - 35) / 5) * (-1.97132-(-3.37429)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 87.46818 + (((tickAnim - 40) / 3) * (70.6958-(87.46818)));
            yy = -0.90376 + (((tickAnim - 40) / 3) * (-11.24119-(-0.90376)));
            zz = -1.97132 + (((tickAnim - 40) / 3) * (4.6385-(-1.97132)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 70.6958 + (((tickAnim - 43) / 5) * (12.06-(70.6958)));
            yy = -11.24119 + (((tickAnim - 43) / 5) * (-32.67-(-11.24119)));
            zz = 4.6385 + (((tickAnim - 43) / 5) * (31.7-(4.6385)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 12.06 + (((tickAnim - 48) / 3) * (9.56-(12.06)));
            yy = -32.67 + (((tickAnim - 48) / 3) * (-32.67-(-32.67)));
            zz = 31.7 + (((tickAnim - 48) / 3) * (31.7-(31.7)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 9.56 + (((tickAnim - 51) / 3) * (14.9532-(9.56)));
            yy = -32.67 + (((tickAnim - 51) / 3) * (-30.87606-(-32.67)));
            zz = 31.7 + (((tickAnim - 51) / 3) * (26.20914-(31.7)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 14.9532 + (((tickAnim - 54) / 4) * (12.06-(14.9532)));
            yy = -30.87606 + (((tickAnim - 54) / 4) * (-32.67-(-30.87606)));
            zz = 26.20914 + (((tickAnim - 54) / 4) * (31.7-(26.20914)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = 12.06 + (((tickAnim - 58) / 37) * (12.06-(12.06)));
            yy = -32.67 + (((tickAnim - 58) / 37) * (-32.67-(-32.67)));
            zz = 31.7 + (((tickAnim - 58) / 37) * (31.7-(31.7)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 12.06 + (((tickAnim - 95) / 6) * (48.04128-(12.06)));
            yy = -32.67 + (((tickAnim - 95) / 6) * (-9.93328-(-32.67)));
            zz = 31.7 + (((tickAnim - 95) / 6) * (-2.58917-(31.7)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 48.04128 + (((tickAnim - 101) / 5) * (77.12961-(48.04128)));
            yy = -9.93328 + (((tickAnim - 101) / 5) * (-12.12742-(-9.93328)));
            zz = -2.58917 + (((tickAnim - 101) / 5) * (6.6978-(-2.58917)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 77.12961 + (((tickAnim - 106) / 5) * (88.74081-(77.12961)));
            yy = -12.12742 + (((tickAnim - 106) / 5) * (-5.42697-(-12.12742)));
            zz = 6.6978 + (((tickAnim - 106) / 5) * (3.8463-(6.6978)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 88.74081 + (((tickAnim - 111) / 4) * (64.352-(88.74081)));
            yy = -5.42697 + (((tickAnim - 111) / 4) * (1.27349-(-5.42697)));
            zz = 3.8463 + (((tickAnim - 111) / 4) * (0.9948-(3.8463)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 64.352 + (((tickAnim - 115) / 3) * (44-(64.352)));
            yy = 1.27349 + (((tickAnim - 115) / 3) * (0-(1.27349)));
            zz = 0.9948 + (((tickAnim - 115) / 3) * (0-(0.9948)));
        }
        else if (tickAnim >= 118 && tickAnim < 132) {
            xx = 44 + (((tickAnim - 118) / 14) * (27-(44)));
            yy = 0 + (((tickAnim - 118) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 14) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = 27 + (((tickAnim - 132) / 44) * (0-(27)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 7 + (((tickAnim - 9) / 7) * (22.26761-(7)));
            yy = 0 + (((tickAnim - 9) / 7) * (-4.03424-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (6.13519-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 22.26761 + (((tickAnim - 16) / 3) * (35.15141-(22.26761)));
            yy = -4.03424 + (((tickAnim - 16) / 3) * (-6.05137-(-4.03424)));
            zz = 6.13519 + (((tickAnim - 16) / 3) * (9.20279-(6.13519)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 35.15141 + (((tickAnim - 19) / 4) * (30.03521-(35.15141)));
            yy = -6.05137 + (((tickAnim - 19) / 4) * (-8.06849-(-6.05137)));
            zz = 9.20279 + (((tickAnim - 19) / 4) * (12.27038-(9.20279)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 30.03521 + (((tickAnim - 23) / 1) * (28.69633-(30.03521)));
            yy = -8.06849 + (((tickAnim - 23) / 1) * (-6.63298-(-8.06849)));
            zz = 12.27038 + (((tickAnim - 23) / 1) * (11.82492-(12.27038)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 28.69633 + (((tickAnim - 24) / 4) * (15.49578-(28.69633)));
            yy = -6.63298 + (((tickAnim - 24) / 4) * (-10.48904-(-6.63298)));
            zz = 11.82492 + (((tickAnim - 24) / 4) * (15.95149-(11.82492)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 15.49578 + (((tickAnim - 28) / 1) * (14.87215-(15.49578)));
            yy = -10.48904 + (((tickAnim - 28) / 1) * (-5.70956-(-10.48904)));
            zz = 15.95149 + (((tickAnim - 28) / 1) * (20.40001-(15.95149)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 14.87215 + (((tickAnim - 29) / 2) * (16.1219-(14.87215)));
            yy = -5.70956 + (((tickAnim - 29) / 2) * (-13.58319-(-5.70956)));
            zz = 20.40001 + (((tickAnim - 29) / 2) * (12.96949-(20.40001)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 16.1219 + (((tickAnim - 31) / 2) * (15.5-(16.1219)));
            yy = -13.58319 + (((tickAnim - 31) / 2) * (-10.49-(-13.58319)));
            zz = 12.96949 + (((tickAnim - 31) / 2) * (15.95-(12.96949)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 15.5 + (((tickAnim - 33) / 68) * (15.5-(15.5)));
            yy = -10.49 + (((tickAnim - 33) / 68) * (-10.49-(-10.49)));
            zz = 15.95 + (((tickAnim - 33) / 68) * (15.95-(15.95)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = 15.5 + (((tickAnim - 101) / 17) * (11.88-(15.5)));
            yy = -10.49 + (((tickAnim - 101) / 17) * (-8.04-(-10.49)));
            zz = 15.95 + (((tickAnim - 101) / 17) * (12.23-(15.95)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 11.88 + (((tickAnim - 118) / 5) * (25.01913-(11.88)));
            yy = -8.04 + (((tickAnim - 118) / 5) * (-7.45739-(-8.04)));
            zz = 12.23 + (((tickAnim - 118) / 5) * (11.34377-(12.23)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 25.01913 + (((tickAnim - 123) / 5) * (26.83983-(25.01913)));
            yy = -7.45739 + (((tickAnim - 123) / 5) * (-10.71632-(-7.45739)));
            zz = 11.34377 + (((tickAnim - 123) / 5) * (13.03518-(11.34377)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 26.83983 + (((tickAnim - 128) / 9) * (14.13109-(26.83983)));
            yy = -10.71632 + (((tickAnim - 128) / 9) * (-8.83626-(-10.71632)));
            zz = 13.03518 + (((tickAnim - 128) / 9) * (10.7483-(13.03518)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 14.13109 + (((tickAnim - 137) / 5) * (13.04242-(14.13109)));
            yy = -8.83626 + (((tickAnim - 137) / 5) * (-1.88321-(-8.83626)));
            zz = 10.7483 + (((tickAnim - 137) / 5) * (1.2539-(10.7483)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 13.04242 + (((tickAnim - 142) / 1) * (12.61832-(13.04242)));
            yy = -1.88321 + (((tickAnim - 142) / 1) * (-5.62044-(-1.88321)));
            zz = 1.2539 + (((tickAnim - 142) / 1) * (-2.03102-(1.2539)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 12.61832 + (((tickAnim - 143) / 2) * (12.01087-(12.61832)));
            yy = -5.62044 + (((tickAnim - 143) / 2) * (6.03632-(-5.62044)));
            zz = -2.03102 + (((tickAnim - 143) / 2) * (7.47575-(-2.03102)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = 12.01087 + (((tickAnim - 145) / 2) * (11.13-(12.01087)));
            yy = 6.03632 + (((tickAnim - 145) / 2) * (-1.61-(6.03632)));
            zz = 7.47575 + (((tickAnim - 145) / 2) * (1.07-(7.47575)));
        }
        else if (tickAnim >= 147 && tickAnim < 176) {
            xx = 11.13 + (((tickAnim - 147) / 29) * (0-(11.13)));
            yy = -1.61 + (((tickAnim - 147) / 29) * (0-(-1.61)));
            zz = 1.07 + (((tickAnim - 147) / 29) * (0-(1.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 9) / 7) * (-63.96014-(-37)));
            yy = 0 + (((tickAnim - 9) / 7) * (6.73659-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (1.02959-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -63.96014 + (((tickAnim - 16) / 3) * (-79.24885-(-63.96014)));
            yy = 6.73659 + (((tickAnim - 16) / 3) * (9.50812-(6.73659)));
            zz = 1.02959 + (((tickAnim - 16) / 3) * (7.15352-(1.02959)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -79.24885 + (((tickAnim - 19) / 4) * (-62.53756-(-79.24885)));
            yy = 9.50812 + (((tickAnim - 19) / 4) * (12.27965-(9.50812)));
            zz = 7.15352 + (((tickAnim - 19) / 4) * (13.27745-(7.15352)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -62.53756 + (((tickAnim - 23) / 1) * (-57.67556-(-62.53756)));
            yy = 12.27965 + (((tickAnim - 23) / 1) * (14.2933-(12.27965)));
            zz = 13.27745 + (((tickAnim - 23) / 1) * (9.20033-(13.27745)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -57.67556 + (((tickAnim - 24) / 4) * (-36.89637-(-57.67556)));
            yy = 14.2933 + (((tickAnim - 24) / 4) * (17.51515-(14.2933)));
            zz = 9.20033 + (((tickAnim - 24) / 4) * (2.67695-(9.20033)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.89637 + (((tickAnim - 28) / 1) * (-37.51485-(-36.89637)));
            yy = 17.51515 + (((tickAnim - 28) / 1) * (14.157-(17.51515)));
            zz = 2.67695 + (((tickAnim - 28) / 1) * (0.42842-(2.67695)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -37.51485 + (((tickAnim - 29) / 2) * (-34.59342-(-37.51485)));
            yy = 14.157 + (((tickAnim - 29) / 2) * (19.89848-(14.157)));
            zz = 0.42842 + (((tickAnim - 29) / 2) * (8.8407-(0.42842)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -34.59342 + (((tickAnim - 31) / 2) * (-36.9-(-34.59342)));
            yy = 19.89848 + (((tickAnim - 31) / 2) * (17.52-(19.89848)));
            zz = 8.8407 + (((tickAnim - 31) / 2) * (2.68-(8.8407)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.9 + (((tickAnim - 33) / 68) * (-36.9-(-36.9)));
            yy = 17.52 + (((tickAnim - 33) / 68) * (17.52-(17.52)));
            zz = 2.68 + (((tickAnim - 33) / 68) * (2.68-(2.68)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = -36.9 + (((tickAnim - 101) / 17) * (-28.29-(-36.9)));
            yy = 17.52 + (((tickAnim - 101) / 17) * (13.43-(17.52)));
            zz = 2.68 + (((tickAnim - 101) / 17) * (2.05-(2.68)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -28.29 + (((tickAnim - 118) / 5) * (-70.24-(-28.29)));
            yy = 13.43 + (((tickAnim - 118) / 5) * (12.45681-(13.43)));
            zz = 2.05 + (((tickAnim - 118) / 5) * (1.90145-(2.05)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -70.24 + (((tickAnim - 123) / 5) * (-79.5575-(-70.24)));
            yy = 12.45681 + (((tickAnim - 123) / 5) * (11.09435-(12.45681)));
            zz = 1.90145 + (((tickAnim - 123) / 5) * (1.69348-(1.90145)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = -79.5575 + (((tickAnim - 128) / 9) * (-86.60004-(-79.5575)));
            yy = 11.09435 + (((tickAnim - 128) / 9) * (9.14797-(11.09435)));
            zz = 1.69348 + (((tickAnim - 128) / 9) * (1.39638-(1.69348)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = -86.60004 + (((tickAnim - 137) / 5) * (-40.79368-(-86.60004)));
            yy = 9.14797 + (((tickAnim - 137) / 5) * (3.62044-(9.14797)));
            zz = 1.39638 + (((tickAnim - 137) / 5) * (-1.24315-(1.39638)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = -40.79368 + (((tickAnim - 142) / 1) * (-39.3742-(-40.79368)));
            yy = 3.62044 + (((tickAnim - 142) / 1) * (14.07416-(3.62044)));
            zz = -1.24315 + (((tickAnim - 142) / 1) * (-5.33479-(-1.24315)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = -39.3742 + (((tickAnim - 143) / 2) * (-36.76627-(-39.3742)));
            yy = 14.07416 + (((tickAnim - 143) / 2) * (-4.2745-(14.07416)));
            zz = -5.33479 + (((tickAnim - 143) / 2) * (-6.04627-(-5.33479)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = -36.76627 + (((tickAnim - 145) / 2) * (-34.82-(-36.76627)));
            yy = -4.2745 + (((tickAnim - 145) / 2) * (3.08-(-4.2745)));
            zz = -6.04627 + (((tickAnim - 145) / 2) * (-1.06-(-6.04627)));
        }
        else if (tickAnim >= 147 && tickAnim < 176) {
            xx = -34.82 + (((tickAnim - 147) / 29) * (0-(-34.82)));
            yy = 3.08 + (((tickAnim - 147) / 29) * (0-(3.08)));
            zz = -1.06 + (((tickAnim - 147) / 29) * (0-(-1.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 32 + (((tickAnim - 9) / 7) * (40.80939-(32)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.60816-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.87123-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 40.80939 + (((tickAnim - 16) / 3) * (80.18627-(40.80939)));
            yy = 0.60816 + (((tickAnim - 16) / 3) * (1.77081-(0.60816)));
            zz = 0.87123 + (((tickAnim - 16) / 3) * (-5.49004-(0.87123)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 80.18627 + (((tickAnim - 19) / 4) * (55.56316-(80.18627)));
            yy = 1.77081 + (((tickAnim - 19) / 4) * (2.93347-(1.77081)));
            zz = -5.49004 + (((tickAnim - 19) / 4) * (-11.8513-(-5.49004)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 55.56316 + (((tickAnim - 23) / 1) * (47.1814-(55.56316)));
            yy = 2.93347 + (((tickAnim - 23) / 1) * (1.94086-(2.93347)));
            zz = -11.8513 + (((tickAnim - 23) / 1) * (-10.71327-(-11.8513)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 47.1814 + (((tickAnim - 24) / 4) * (13.52946-(47.1814)));
            yy = 1.94086 + (((tickAnim - 24) / 4) * (21.3977-(1.94086)));
            zz = -10.71327 + (((tickAnim - 24) / 4) * (-28.38224-(-10.71327)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 13.52946 + (((tickAnim - 28) / 1) * (15.58595-(13.52946)));
            yy = 21.3977 + (((tickAnim - 28) / 1) * (19.1446-(21.3977)));
            zz = -28.38224 + (((tickAnim - 28) / 1) * (-22.45204-(-28.38224)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 15.58595 + (((tickAnim - 29) / 2) * (14.24625-(15.58595)));
            yy = 19.1446 + (((tickAnim - 29) / 2) * (20.67055-(19.1446)));
            zz = -22.45204 + (((tickAnim - 29) / 2) * (-26.38478-(-22.45204)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 14.24625 + (((tickAnim - 31) / 2) * (14.93164-(14.24625)));
            yy = 20.67055 + (((tickAnim - 31) / 2) * (19.91838-(20.67055)));
            zz = -26.38478 + (((tickAnim - 31) / 2) * (-24.40892-(-26.38478)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 14.93164 + (((tickAnim - 33) / 68) * (14.93164-(14.93164)));
            yy = 19.91838 + (((tickAnim - 33) / 68) * (19.91838-(19.91838)));
            zz = -24.40892 + (((tickAnim - 33) / 68) * (-24.40892-(-24.40892)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = 14.93164 + (((tickAnim - 101) / 17) * (10.37-(14.93164)));
            yy = 19.91838 + (((tickAnim - 101) / 17) * (16.41-(19.91838)));
            zz = -24.40892 + (((tickAnim - 101) / 17) * (-21.76-(-24.40892)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 10.37 + (((tickAnim - 118) / 5) * (34.61855-(10.37)));
            yy = 16.41 + (((tickAnim - 118) / 5) * (15.22087-(16.41)));
            zz = -21.76 + (((tickAnim - 118) / 5) * (-20.18319-(-21.76)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 34.61855 + (((tickAnim - 123) / 5) * (71.79233-(34.61855)));
            yy = 15.22087 + (((tickAnim - 123) / 5) * (5.64798-(15.22087)));
            zz = -20.18319 + (((tickAnim - 123) / 5) * (-24.18868-(-20.18319)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 71.79233 + (((tickAnim - 128) / 5) * (82.38949-(71.79233)));
            yy = 5.64798 + (((tickAnim - 128) / 5) * (5.15255-(5.64798)));
            zz = -24.18868 + (((tickAnim - 128) / 5) * (-22.06686-(-24.18868)));
        }
        else if (tickAnim >= 133 && tickAnim < 137) {
            xx = 82.38949 + (((tickAnim - 133) / 4) * (56.98666-(82.38949)));
            yy = 5.15255 + (((tickAnim - 133) / 4) * (4.65711-(5.15255)));
            zz = -22.06686 + (((tickAnim - 133) / 4) * (-19.94505-(-22.06686)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 56.98666 + (((tickAnim - 137) / 5) * (29.52291-(56.98666)));
            yy = 4.65711 + (((tickAnim - 137) / 5) * (-0.07693-(4.65711)));
            zz = -19.94505 + (((tickAnim - 137) / 5) * (-1.77861-(-19.94505)));
        }
        else if (tickAnim >= 142 && tickAnim < 176) {
            xx = 29.52291 + (((tickAnim - 142) / 34) * (0-(29.52291)));
            yy = -0.07693 + (((tickAnim - 142) / 34) * (0-(-0.07693)));
            zz = -1.77861 + (((tickAnim - 142) / 34) * (0-(-1.77861)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.0287+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*0.5), tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*2), tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*1.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*2.5), tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*2), tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*5), tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*1), tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*5), tail7.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*1), tail7.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*1));


        this.setRotateAngle(TailClub, TailClub.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*5), TailClub.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*1), TailClub.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*1));



        if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 8) / 13) * (11.72-(0)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 11.72 + (((tickAnim - 21) / 3) * (13.62-(11.72)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 13.62 + (((tickAnim - 24) / 3) * (15.04702-(13.62)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 15.04702 + (((tickAnim - 27) / 2) * (16.47279-(15.04702)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 16.47279 + (((tickAnim - 29) / 3) * (17.89-(16.47279)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 17.89 + (((tickAnim - 32) / 1) * (18.84-(17.89)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 18.84 + (((tickAnim - 33) / 15) * (21.75-(18.84)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 21.75 + (((tickAnim - 48) / 2) * (21.94136-(21.75)));
            yy = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 21.94136 + (((tickAnim - 50) / 3) * (22.13141-(21.94136)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 22.13141 + (((tickAnim - 53) / 2) * (22.32-(22.13141)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = 22.32 + (((tickAnim - 55) / 9) * (23-(22.32)));
            yy = 0 + (((tickAnim - 55) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 9) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 105) {
            xx = 23 + (((tickAnim - 64) / 41) * (23-(23)));
            yy = 0 + (((tickAnim - 64) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 41) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 23 + (((tickAnim - 105) / 13) * (13.92-(23)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 13.92 + (((tickAnim - 118) / 2) * (12.82625-(13.92)));
            yy = 0 + (((tickAnim - 118) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = 12.82625 + (((tickAnim - 120) / 3) * (11.15088-(12.82625)));
            yy = 0 + (((tickAnim - 120) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 3) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = 11.15088 + (((tickAnim - 123) / 2) * (9.39-(11.15088)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 126) {
            xx = 9.39 + (((tickAnim - 125) / 1) * (8.82-(9.39)));
            yy = 0 + (((tickAnim - 125) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 1) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 138) {
            xx = 8.82 + (((tickAnim - 126) / 12) * (4-(8.82)));
            yy = 0 + (((tickAnim - 126) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 12) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 4 + (((tickAnim - 138) / 5) * (3.2-(4)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 3.2 + (((tickAnim - 143) / 2) * (2.93565-(3.2)));
            yy = 0 + (((tickAnim - 143) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 2) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 148) {
            xx = 2.93565 + (((tickAnim - 145) / 3) * (2.50136-(2.93565)));
            yy = 0 + (((tickAnim - 145) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 3) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 150) {
            xx = 2.50136 + (((tickAnim - 148) / 2) * (2-(2.50136)));
            yy = 0 + (((tickAnim - 148) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 2) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 2 + (((tickAnim - 150) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 0) / 64) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 64) * (2.075-(0)));
            zz = 0 + (((tickAnim - 0) / 64) * (-2.9-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 64) / 41) * (0-(0)));
            yy = 2.075 + (((tickAnim - 64) / 41) * (2.075-(2.075)));
            zz = -2.9 + (((tickAnim - 64) / 41) * (-2.9-(-2.9)));
        }
        else if (tickAnim >= 105 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 105) / 71) * (0-(0)));
            yy = 2.075 + (((tickAnim - 105) / 71) * (0-(2.075)));
            zz = -2.9 + (((tickAnim - 105) / 71) * (0-(-2.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (5.74-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 5.74 + (((tickAnim - 21) / 4) * (6.82-(5.74)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6.82 + (((tickAnim - 25) / 3) * (7.46678-(6.82)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 7.46678 + (((tickAnim - 28) / 2) * (8.10601-(7.46678)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 8.10601 + (((tickAnim - 30) / 3) * (8.78-(8.10601)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 8.78 + (((tickAnim - 33) / 1) * (9.21-(8.78)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 9.21 + (((tickAnim - 34) / 14) * (11.22-(9.21)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 11.22 + (((tickAnim - 48) / 3) * (11.51084-(11.22)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 11.51084 + (((tickAnim - 51) / 2) * (11.52435-(11.51084)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 56) {
            xx = 11.52435 + (((tickAnim - 53) / 3) * (11.69-(11.52435)));
            yy = 0 + (((tickAnim - 53) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 3) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = 11.69 + (((tickAnim - 56) / 12) * (12-(11.69)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 12 + (((tickAnim - 68) / 37) * (12-(12)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 119) {
            xx = 12 + (((tickAnim - 105) / 14) * (9.85-(12)));
            yy = 0 + (((tickAnim - 105) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 14) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 121) {
            xx = 9.85 + (((tickAnim - 119) / 2) * (9.5782-(9.85)));
            yy = 0 + (((tickAnim - 119) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 2) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 123) {
            xx = 9.5782 + (((tickAnim - 121) / 2) * (9.34867-(9.5782)));
            yy = 0 + (((tickAnim - 121) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 2) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 125) {
            xx = 9.34867 + (((tickAnim - 123) / 2) * (8.49-(9.34867)));
            yy = 0 + (((tickAnim - 123) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 2) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 142) {
            xx = 8.49 + (((tickAnim - 125) / 17) * (2.77-(8.49)));
            yy = 0 + (((tickAnim - 125) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 17) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 144) {
            xx = 2.77 + (((tickAnim - 142) / 2) * (1.89949-(2.77)));
            yy = 0 + (((tickAnim - 142) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 2) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 147) {
            xx = 1.89949 + (((tickAnim - 144) / 3) * (1.64842-(1.89949)));
            yy = 0 + (((tickAnim - 144) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 3) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 149) {
            xx = 1.64842 + (((tickAnim - 147) / 2) * (1.39-(1.64842)));
            yy = 0 + (((tickAnim - 147) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 2) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 1.39 + (((tickAnim - 149) / 14) * (0-(1.39)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 7) / 17) * (4.26-(0)));
            yy = 0 + (((tickAnim - 7) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 17) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 4.26 + (((tickAnim - 24) / 3) * (4.79716-(4.26)));
            yy = 0 + (((tickAnim - 24) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 3) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 4.79716 + (((tickAnim - 27) / 1) * (5.0206-(4.79716)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 5.0206 + (((tickAnim - 28) / 1) * (5.28676-(5.0206)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 5.28676 + (((tickAnim - 29) / 1) * (5.43254-(5.28676)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 5.43254 + (((tickAnim - 30) / 2) * (5.63496-(5.43254)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 5.63496 + (((tickAnim - 32) / 10) * (7.16-(5.63496)));
            yy = 0 + (((tickAnim - 32) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 10) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 7.16 + (((tickAnim - 42) / 6) * (7.71535-(7.16)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 7.71535 + (((tickAnim - 48) / 8) * (8.11489-(7.71535)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = 8.11489 + (((tickAnim - 56) / 12) * (9-(8.11489)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 9 + (((tickAnim - 68) / 37) * (9-(9)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 9 + (((tickAnim - 105) / 13) * (7.75-(9)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 7.75 + (((tickAnim - 118) / 7) * (6.33711-(7.75)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = 6.33711 + (((tickAnim - 125) / 12) * (2.66-(6.33711)));
            yy = 0 + (((tickAnim - 125) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 12) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 141) {
            xx = 2.66 + (((tickAnim - 137) / 4) * (1.9-(2.66)));
            yy = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 4) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 149) {
            xx = 1.9 + (((tickAnim - 141) / 8) * (0.37-(1.9)));
            yy = 0 + (((tickAnim - 141) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 8) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 0.37 + (((tickAnim - 149) / 14) * (0-(0.37)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 7) / 20) * (3.07-(0)));
            yy = 0 + (((tickAnim - 7) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 20) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 44) {
            xx = 3.07 + (((tickAnim - 27) / 17) * (5.76-(3.07)));
            yy = 0 + (((tickAnim - 27) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 17) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 5.76 + (((tickAnim - 44) / 11) * (7.79-(5.76)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 7.79 + (((tickAnim - 55) / 13) * (9-(7.79)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 9 + (((tickAnim - 68) / 37) * (9-(9)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 111) {
            xx = 9 + (((tickAnim - 105) / 6) * (6.35-(9)));
            yy = 0 + (((tickAnim - 105) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 6) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 121) {
            xx = 6.35 + (((tickAnim - 111) / 10) * (4.52-(6.35)));
            yy = 0 + (((tickAnim - 111) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 10) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 4.52 + (((tickAnim - 121) / 12) * (5.25-(4.52)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 146) {
            xx = 5.25 + (((tickAnim - 133) / 13) * (4.92-(5.25)));
            yy = 0 + (((tickAnim - 133) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 13) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 155) {
            xx = 4.92 + (((tickAnim - 146) / 9) * (2.21-(4.92)));
            yy = 0 + (((tickAnim - 146) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 9) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 163) {
            xx = 2.21 + (((tickAnim - 155) / 8) * (0-(2.21)));
            yy = 0 + (((tickAnim - 155) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (3.08-(0)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 3.08 + (((tickAnim - 34) / 14) * (4.03-(3.08)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 4.03 + (((tickAnim - 48) / 19) * (1.25-(4.03)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 105) {
            xx = 1.25 + (((tickAnim - 67) / 38) * (2-(1.25)));
            yy = 0 + (((tickAnim - 67) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 38) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = 2 + (((tickAnim - 105) / 7) * (2.01-(2)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 119) {
            xx = 2.01 + (((tickAnim - 112) / 7) * (0.77-(2.01)));
            yy = 0 + (((tickAnim - 112) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 7) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 129) {
            xx = 0.77 + (((tickAnim - 119) / 10) * (2.59-(0.77)));
            yy = 0 + (((tickAnim - 119) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 10) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 2.59 + (((tickAnim - 129) / 12) * (3.68-(2.59)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 3.68 + (((tickAnim - 141) / 10) * (2.98-(3.68)));
            yy = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 10) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 2.98 + (((tickAnim - 151) / 12) * (0-(2.98)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (2.95-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.95 + (((tickAnim - 30) / 10) * (4.89-(2.95)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 67) {
            xx = 4.89 + (((tickAnim - 40) / 27) * (6-(4.89)));
            yy = 0 + (((tickAnim - 40) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 27) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 91) {
            xx = 6 + (((tickAnim - 67) / 24) * (6-(6)));
            yy = 0 + (((tickAnim - 67) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 24) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 6 + (((tickAnim - 91) / 10) * (3.64-(6)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 3.64 + (((tickAnim - 101) / 7) * (1.61-(3.64)));
            yy = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 7) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 115) {
            xx = 1.61 + (((tickAnim - 108) / 7) * (9.96-(1.61)));
            yy = 0 + (((tickAnim - 108) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 7) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 126) {
            xx = 9.96 + (((tickAnim - 115) / 11) * (10.69-(9.96)));
            yy = 0 + (((tickAnim - 115) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 11) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 133) {
            xx = 10.69 + (((tickAnim - 126) / 7) * (4.25-(10.69)));
            yy = 0 + (((tickAnim - 126) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 7) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 4.25 + (((tickAnim - 133) / 6) * (2.8-(4.25)));
            yy = 0 + (((tickAnim - 133) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 146) {
            xx = 2.8 + (((tickAnim - 139) / 7) * (1-(2.8)));
            yy = 0 + (((tickAnim - 139) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 7) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 163) {
            xx = 1 + (((tickAnim - 146) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 146) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (5.43-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 5.43 + (((tickAnim - 33) / 10) * (9.24-(5.43)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 9.24 + (((tickAnim - 43) / 11) * (10.83-(9.24)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 67) {
            xx = 10.83 + (((tickAnim - 54) / 13) * (4.5-(10.83)));
            yy = 0 + (((tickAnim - 54) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 13) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 88) {
            xx = 4.5 + (((tickAnim - 67) / 21) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 67) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 21) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = 4.5 + (((tickAnim - 88) / 8) * (5.45-(4.5)));
            yy = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 8) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 109) {
            xx = 5.45 + (((tickAnim - 96) / 13) * (10.05-(5.45)));
            yy = 0 + (((tickAnim - 96) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 13) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 10.05 + (((tickAnim - 109) / 8) * (13.57-(10.05)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 13.57 + (((tickAnim - 117) / 12) * (13.87-(13.57)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 135) {
            xx = 13.87 + (((tickAnim - 129) / 6) * (16.44-(13.87)));
            yy = 0 + (((tickAnim - 129) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 6) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 16.44 + (((tickAnim - 135) / 7) * (15.45-(16.44)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 15.45 + (((tickAnim - 142) / 8) * (8.27-(15.45)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 8.27 + (((tickAnim - 150) / 13) * (0-(8.27)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (1.8-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 1.8 + (((tickAnim - 33) / 13) * (3.63-(1.8)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 67) {
            xx = 3.63 + (((tickAnim - 46) / 21) * (-6.25-(3.63)));
            yy = 0 + (((tickAnim - 46) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 21) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 93) {
            xx = -6.25 + (((tickAnim - 67) / 26) * (-6.25-(-6.25)));
            yy = 0 + (((tickAnim - 67) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 26) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = -6.25 + (((tickAnim - 93) / 9) * (0.51-(-6.25)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 111) {
            xx = 0.51 + (((tickAnim - 102) / 9) * (0.67-(0.51)));
            yy = 0 + (((tickAnim - 102) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 9) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 116) {
            xx = 0.67 + (((tickAnim - 111) / 5) * (5.39-(0.67)));
            yy = 0 + (((tickAnim - 111) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 5) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 127) {
            xx = 5.39 + (((tickAnim - 116) / 11) * (6.42-(5.39)));
            yy = 0 + (((tickAnim - 116) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 11) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 138) {
            xx = 6.42 + (((tickAnim - 127) / 11) * (5.01-(6.42)));
            yy = 0 + (((tickAnim - 127) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 11) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 151) {
            xx = 5.01 + (((tickAnim - 138) / 13) * (6.27-(5.01)));
            yy = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 13) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 161) {
            xx = 6.27 + (((tickAnim - 151) / 10) * (6.76-(6.27)));
            yy = 0 + (((tickAnim - 151) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 10) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 167) {
            xx = 6.76 + (((tickAnim - 161) / 6) * (3.13-(6.76)));
            yy = 0 + (((tickAnim - 161) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 6) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 3.13 + (((tickAnim - 167) / 9) * (0-(3.13)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 85 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 85) / 7) * (-1.33-(0)));
            yy = 0 + (((tickAnim - 85) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 7) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
            xx = -1.33 + (((tickAnim - 92) / 8) * (-3-(-1.33)));
            yy = 0 + (((tickAnim - 92) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 100) / 10) * (-20-(-3)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -20 + (((tickAnim - 110) / 15) * (-14-(-20)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -14 + (((tickAnim - 125) / 15) * (-2.4-(-14)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 163) {
            xx = -2.4 + (((tickAnim - 140) / 23) * (0-(-2.4)));
            yy = 0 + (((tickAnim - 140) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 14 + (((tickAnim - 78) / 5) * (0-(14)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 83) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 6) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 95) {
            xx = 14 + (((tickAnim - 89) / 6) * (0-(14)));
            yy = 0 + (((tickAnim - 89) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 6) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 95) / 7) * (18-(0)));
            yy = 0 + (((tickAnim - 95) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 7) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 111) {
            xx = 18 + (((tickAnim - 102) / 9) * (-2-(18)));
            yy = 0 + (((tickAnim - 102) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 6 + (((tickAnim - 24) / 8) * (6-(6)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 6 + (((tickAnim - 32) / 18) * (6-(6)));
            yy = 0 + (((tickAnim - 32) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 18) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 6 + (((tickAnim - 50) / 8) * (6-(6)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 105) {
            xx = 6 + (((tickAnim - 58) / 47) * (6-(6)));
            yy = 0 + (((tickAnim - 58) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 47) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 6 + (((tickAnim - 105) / 13) * (4.72-(6)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 4.72 + (((tickAnim - 118) / 7) * (4.08-(4.72)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 142) {
            xx = 4.08 + (((tickAnim - 125) / 17) * (2.48-(4.08)));
            yy = 0 + (((tickAnim - 125) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 17) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 2.48 + (((tickAnim - 142) / 3) * (2.16-(2.48)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = 2.16 + (((tickAnim - 145) / 2) * (2-(2.16)));
            yy = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 2) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 168) {
            xx = 2 + (((tickAnim - 147) / 21) * (0-(2)));
            yy = 0 + (((tickAnim - 147) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (2.29-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 2.29 + (((tickAnim - 23) / 1) * (2.43-(2.29)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 2.43 + (((tickAnim - 24) / 8) * (3.72-(2.43)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 3.72 + (((tickAnim - 32) / 1) * (4-(3.72)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 33) / 17) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 58) {
            xx = 4 + (((tickAnim - 50) / 8) * (4-(4)));
            yy = 0 + (((tickAnim - 50) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 8) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 105) {
            xx = 4 + (((tickAnim - 58) / 47) * (4-(4)));
            yy = 0 + (((tickAnim - 58) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 47) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 4 + (((tickAnim - 105) / 13) * (2.55-(4)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 2.55 + (((tickAnim - 118) / 7) * (1.83-(2.55)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 141) {
            xx = 1.83 + (((tickAnim - 125) / 16) * (0.09-(1.83)));
            yy = 0 + (((tickAnim - 125) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 16) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 142) {
            xx = 0.09 + (((tickAnim - 141) / 1) * (0-(0.09)));
            yy = 0 + (((tickAnim - 141) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 1) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 3) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 145) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 2) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 147) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 147) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.6-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 7.6 + (((tickAnim - 14) / 14) * (2-(7.6)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 28) / 7) * (27.50966-(2)));
            yy = 0 + (((tickAnim - 28) / 7) * (5.88262-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-11.40519-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 27.50966 + (((tickAnim - 35) / 5) * (24.71739-(27.50966)));
            yy = 5.88262 + (((tickAnim - 35) / 5) * (10.58872-(5.88262)));
            zz = -11.40519 + (((tickAnim - 35) / 5) * (-20.52934-(-11.40519)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 24.71739 + (((tickAnim - 40) / 3) * (24.25438-(24.71739)));
            yy = 10.58872 + (((tickAnim - 40) / 3) * (10.77386-(10.58872)));
            zz = -20.52934 + (((tickAnim - 40) / 3) * (-21.41523-(-20.52934)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 24.25438 + (((tickAnim - 43) / 5) * (4.40617-(24.25438)));
            yy = 10.77386 + (((tickAnim - 43) / 5) * (11.03306-(10.77386)));
            zz = -21.41523 + (((tickAnim - 43) / 5) * (-22.65548-(-21.41523)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 4.40617 + (((tickAnim - 48) / 3) * (4.75754-(4.40617)));
            yy = 11.03306 + (((tickAnim - 48) / 3) * (13.57199-(11.03306)));
            zz = -22.65548 + (((tickAnim - 48) / 3) * (-21.02921-(-22.65548)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 4.75754 + (((tickAnim - 51) / 3) * (3.94005-(4.75754)));
            yy = 13.57199 + (((tickAnim - 51) / 3) * (5.92243-(13.57199)));
            zz = -21.02921 + (((tickAnim - 51) / 3) * (-25.84435-(-21.02921)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 3.94005 + (((tickAnim - 54) / 4) * (4.41-(3.94005)));
            yy = 5.92243 + (((tickAnim - 54) / 4) * (11.03-(5.92243)));
            zz = -25.84435 + (((tickAnim - 54) / 4) * (-22.66-(-25.84435)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = 4.41 + (((tickAnim - 58) / 37) * (4.41-(4.41)));
            yy = 11.03 + (((tickAnim - 58) / 37) * (11.03-(11.03)));
            zz = -22.66 + (((tickAnim - 58) / 37) * (-22.66-(-22.66)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 4.41 + (((tickAnim - 95) / 6) * (25.3075-(4.41)));
            yy = 11.03 + (((tickAnim - 95) / 6) * (8.2725-(11.03)));
            zz = -22.66 + (((tickAnim - 95) / 6) * (-16.995-(-22.66)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 25.3075 + (((tickAnim - 101) / 5) * (28.79617-(25.3075)));
            yy = 8.2725 + (((tickAnim - 101) / 5) * (-3.3873-(8.2725)));
            zz = -16.995 + (((tickAnim - 101) / 5) * (-5.73611-(-16.995)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 28.79617 + (((tickAnim - 106) / 5) * (32.91013-(28.79617)));
            yy = -3.3873 + (((tickAnim - 106) / 5) * (-2.57729-(-3.3873)));
            zz = -5.73611 + (((tickAnim - 106) / 5) * (-4.36443-(-5.73611)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 32.91013 + (((tickAnim - 111) / 4) * (11.02409-(32.91013)));
            yy = -2.57729 + (((tickAnim - 111) / 4) * (-1.76729-(-2.57729)));
            zz = -4.36443 + (((tickAnim - 111) / 4) * (-2.99276-(-4.36443)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 11.02409 + (((tickAnim - 115) / 3) * (8-(11.02409)));
            yy = -1.76729 + (((tickAnim - 115) / 3) * (0-(-1.76729)));
            zz = -2.99276 + (((tickAnim - 115) / 3) * (0-(-2.99276)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = 8 + (((tickAnim - 118) / 2) * (8.95465-(8)));
            yy = 0 + (((tickAnim - 118) / 2) * (-5.64018-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (-4.1526-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = 8.95465 + (((tickAnim - 120) / 2) * (9.56719-(8.95465)));
            yy = -5.64018 + (((tickAnim - 120) / 2) * (3.1936-(-5.64018)));
            zz = -4.1526 + (((tickAnim - 120) / 2) * (2.40976-(-4.1526)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = 9.56719 + (((tickAnim - 122) / 1) * (10.25-(9.56719)));
            yy = 3.1936 + (((tickAnim - 122) / 1) * (0-(3.1936)));
            zz = 2.40976 + (((tickAnim - 122) / 1) * (0-(2.40976)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = 10.25 + (((tickAnim - 123) / 9) * (14-(10.25)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = 14 + (((tickAnim - 132) / 44) * (0-(14)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-51.65-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -51.65 + (((tickAnim - 14) / 14) * (-66-(-51.65)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -66 + (((tickAnim - 28) / 7) * (-92.22675-(-66)));
            yy = 0 + (((tickAnim - 28) / 7) * (-7.79969-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (5.87916-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -92.22675 + (((tickAnim - 35) / 5) * (-80.84739-(-92.22675)));
            yy = -7.79969 + (((tickAnim - 35) / 5) * (-18.92089-(-7.79969)));
            zz = 5.87916 + (((tickAnim - 35) / 5) * (-0.40358-(5.87916)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -80.84739 + (((tickAnim - 40) / 3) * (-66.64321-(-80.84739)));
            yy = -18.92089 + (((tickAnim - 40) / 3) * (-19.08054-(-18.92089)));
            zz = -0.40358 + (((tickAnim - 40) / 3) * (-4.47337-(-0.40358)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -66.64321 + (((tickAnim - 43) / 5) * (-20.35736-(-66.64321)));
            yy = -19.08054 + (((tickAnim - 43) / 5) * (-19.30405-(-19.08054)));
            zz = -4.47337 + (((tickAnim - 43) / 5) * (-10.17108-(-4.47337)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = -20.35736 + (((tickAnim - 48) / 3) * (-18.52776-(-20.35736)));
            yy = -19.30405 + (((tickAnim - 48) / 3) * (-22.89264-(-19.30405)));
            zz = -10.17108 + (((tickAnim - 48) / 3) * (-9.8496-(-10.17108)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = -18.52776 + (((tickAnim - 51) / 3) * (-20.66451-(-18.52776)));
            yy = -22.89264 + (((tickAnim - 51) / 3) * (-20.45318-(-22.89264)));
            zz = -9.8496 + (((tickAnim - 51) / 3) * (-3.36844-(-9.8496)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = -20.66451 + (((tickAnim - 54) / 4) * (-20.36-(-20.66451)));
            yy = -20.45318 + (((tickAnim - 54) / 4) * (-19.3-(-20.45318)));
            zz = -3.36844 + (((tickAnim - 54) / 4) * (-10.17-(-3.36844)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = -20.36 + (((tickAnim - 58) / 37) * (-20.36-(-20.36)));
            yy = -19.3 + (((tickAnim - 58) / 37) * (-19.3-(-19.3)));
            zz = -10.17 + (((tickAnim - 58) / 37) * (-10.17-(-10.17)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = -20.36 + (((tickAnim - 95) / 6) * (-65.08991-(-20.36)));
            yy = -19.3 + (((tickAnim - 95) / 6) * (-4.48794-(-19.3)));
            zz = -10.17 + (((tickAnim - 95) / 6) * (15.959-(-10.17)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -65.08991 + (((tickAnim - 101) / 5) * (-64.29747-(-65.08991)));
            yy = -4.48794 + (((tickAnim - 101) / 5) * (-15.35512-(-4.48794)));
            zz = 15.959 + (((tickAnim - 101) / 5) * (5.87433-(15.959)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = -64.29747 + (((tickAnim - 106) / 5) * (-82.92198-(-64.29747)));
            yy = -15.35512 + (((tickAnim - 106) / 5) * (-11.68325-(-15.35512)));
            zz = 5.87433 + (((tickAnim - 106) / 5) * (4.4696-(5.87433)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = -82.92198 + (((tickAnim - 111) / 4) * (-77.5465-(-82.92198)));
            yy = -11.68325 + (((tickAnim - 111) / 4) * (-8.01137-(-11.68325)));
            zz = 4.4696 + (((tickAnim - 111) / 4) * (3.06487-(4.4696)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = -77.5465 + (((tickAnim - 115) / 3) * (-56-(-77.5465)));
            yy = -8.01137 + (((tickAnim - 115) / 3) * (0-(-8.01137)));
            zz = 3.06487 + (((tickAnim - 115) / 3) * (0-(3.06487)));
        }
        else if (tickAnim >= 118 && tickAnim < 120) {
            xx = -56 + (((tickAnim - 118) / 2) * (-57.28117-(-56)));
            yy = 0 + (((tickAnim - 118) / 2) * (12.51594-(0)));
            zz = 0 + (((tickAnim - 118) / 2) * (-0.92109-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 122) {
            xx = -57.28117 + (((tickAnim - 120) / 2) * (-56.92756-(-57.28117)));
            yy = 12.51594 + (((tickAnim - 120) / 2) * (-5.89035-(12.51594)));
            zz = -0.92109 + (((tickAnim - 120) / 2) * (2.32819-(-0.92109)));
        }
        else if (tickAnim >= 122 && tickAnim < 123) {
            xx = -56.92756 + (((tickAnim - 122) / 1) * (-57.25-(-56.92756)));
            yy = -5.89035 + (((tickAnim - 122) / 1) * (0-(-5.89035)));
            zz = 2.32819 + (((tickAnim - 122) / 1) * (0-(2.32819)));
        }
        else if (tickAnim >= 123 && tickAnim < 132) {
            xx = -57.25 + (((tickAnim - 123) / 9) * (-46-(-57.25)));
            yy = 0 + (((tickAnim - 123) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 9) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = -46 + (((tickAnim - 132) / 44) * (0-(-46)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (41.7-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 41.7 + (((tickAnim - 14) / 14) * (56-(41.7)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 56 + (((tickAnim - 28) / 7) * (81.75451-(56)));
            yy = 0 + (((tickAnim - 28) / 7) * (1.69151-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (-3.37429-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 81.75451 + (((tickAnim - 35) / 5) * (87.46818-(81.75451)));
            yy = 1.69151 + (((tickAnim - 35) / 5) * (-0.90376-(1.69151)));
            zz = -3.37429 + (((tickAnim - 35) / 5) * (-1.97132-(-3.37429)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 87.46818 + (((tickAnim - 40) / 3) * (70.6958-(87.46818)));
            yy = -0.90376 + (((tickAnim - 40) / 3) * (-11.24119-(-0.90376)));
            zz = -1.97132 + (((tickAnim - 40) / 3) * (4.6385-(-1.97132)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 70.6958 + (((tickAnim - 43) / 5) * (12.06-(70.6958)));
            yy = -11.24119 + (((tickAnim - 43) / 5) * (-32.67-(-11.24119)));
            zz = 4.6385 + (((tickAnim - 43) / 5) * (31.7-(4.6385)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 12.06 + (((tickAnim - 48) / 3) * (9.56-(12.06)));
            yy = -32.67 + (((tickAnim - 48) / 3) * (-32.67-(-32.67)));
            zz = 31.7 + (((tickAnim - 48) / 3) * (31.7-(31.7)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 9.56 + (((tickAnim - 51) / 3) * (14.9532-(9.56)));
            yy = -32.67 + (((tickAnim - 51) / 3) * (-30.87606-(-32.67)));
            zz = 31.7 + (((tickAnim - 51) / 3) * (26.20914-(31.7)));
        }
        else if (tickAnim >= 54 && tickAnim < 58) {
            xx = 14.9532 + (((tickAnim - 54) / 4) * (12.06-(14.9532)));
            yy = -30.87606 + (((tickAnim - 54) / 4) * (-32.67-(-30.87606)));
            zz = 26.20914 + (((tickAnim - 54) / 4) * (31.7-(26.20914)));
        }
        else if (tickAnim >= 58 && tickAnim < 95) {
            xx = 12.06 + (((tickAnim - 58) / 37) * (12.06-(12.06)));
            yy = -32.67 + (((tickAnim - 58) / 37) * (-32.67-(-32.67)));
            zz = 31.7 + (((tickAnim - 58) / 37) * (31.7-(31.7)));
        }
        else if (tickAnim >= 95 && tickAnim < 101) {
            xx = 12.06 + (((tickAnim - 95) / 6) * (48.04128-(12.06)));
            yy = -32.67 + (((tickAnim - 95) / 6) * (-9.93328-(-32.67)));
            zz = 31.7 + (((tickAnim - 95) / 6) * (-2.58917-(31.7)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 48.04128 + (((tickAnim - 101) / 5) * (77.12961-(48.04128)));
            yy = -9.93328 + (((tickAnim - 101) / 5) * (-12.12742-(-9.93328)));
            zz = -2.58917 + (((tickAnim - 101) / 5) * (6.6978-(-2.58917)));
        }
        else if (tickAnim >= 106 && tickAnim < 111) {
            xx = 77.12961 + (((tickAnim - 106) / 5) * (88.74081-(77.12961)));
            yy = -12.12742 + (((tickAnim - 106) / 5) * (-5.42697-(-12.12742)));
            zz = 6.6978 + (((tickAnim - 106) / 5) * (3.8463-(6.6978)));
        }
        else if (tickAnim >= 111 && tickAnim < 115) {
            xx = 88.74081 + (((tickAnim - 111) / 4) * (64.352-(88.74081)));
            yy = -5.42697 + (((tickAnim - 111) / 4) * (1.27349-(-5.42697)));
            zz = 3.8463 + (((tickAnim - 111) / 4) * (0.9948-(3.8463)));
        }
        else if (tickAnim >= 115 && tickAnim < 118) {
            xx = 64.352 + (((tickAnim - 115) / 3) * (44-(64.352)));
            yy = 1.27349 + (((tickAnim - 115) / 3) * (0-(1.27349)));
            zz = 0.9948 + (((tickAnim - 115) / 3) * (0-(0.9948)));
        }
        else if (tickAnim >= 118 && tickAnim < 132) {
            xx = 44 + (((tickAnim - 118) / 14) * (27-(44)));
            yy = 0 + (((tickAnim - 118) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 14) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 176) {
            xx = 27 + (((tickAnim - 132) / 44) * (0-(27)));
            yy = 0 + (((tickAnim - 132) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 44) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 7 + (((tickAnim - 9) / 7) * (22.26761-(7)));
            yy = 0 + (((tickAnim - 9) / 7) * (-4.03424-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (6.13519-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 22.26761 + (((tickAnim - 16) / 3) * (35.15141-(22.26761)));
            yy = -4.03424 + (((tickAnim - 16) / 3) * (-6.05137-(-4.03424)));
            zz = 6.13519 + (((tickAnim - 16) / 3) * (9.20279-(6.13519)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 35.15141 + (((tickAnim - 19) / 4) * (30.03521-(35.15141)));
            yy = -6.05137 + (((tickAnim - 19) / 4) * (-8.06849-(-6.05137)));
            zz = 9.20279 + (((tickAnim - 19) / 4) * (12.27038-(9.20279)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 30.03521 + (((tickAnim - 23) / 1) * (28.69633-(30.03521)));
            yy = -8.06849 + (((tickAnim - 23) / 1) * (-6.63298-(-8.06849)));
            zz = 12.27038 + (((tickAnim - 23) / 1) * (11.82492-(12.27038)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 28.69633 + (((tickAnim - 24) / 4) * (15.49578-(28.69633)));
            yy = -6.63298 + (((tickAnim - 24) / 4) * (-10.48904-(-6.63298)));
            zz = 11.82492 + (((tickAnim - 24) / 4) * (15.95149-(11.82492)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 15.49578 + (((tickAnim - 28) / 1) * (14.78102-(15.49578)));
            yy = -10.48904 + (((tickAnim - 28) / 1) * (-4.60055-(-10.48904)));
            zz = 15.95149 + (((tickAnim - 28) / 1) * (21.41413-(15.95149)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 14.78102 + (((tickAnim - 29) / 2) * (16.42862-(14.78102)));
            yy = -4.60055 + (((tickAnim - 29) / 2) * (-14.84684-(-4.60055)));
            zz = 21.41413 + (((tickAnim - 29) / 2) * (11.72057-(21.41413)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 16.42862 + (((tickAnim - 31) / 2) * (15.5-(16.42862)));
            yy = -14.84684 + (((tickAnim - 31) / 2) * (-10.49-(-14.84684)));
            zz = 11.72057 + (((tickAnim - 31) / 2) * (15.95-(11.72057)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 15.5 + (((tickAnim - 33) / 68) * (15.5-(15.5)));
            yy = -10.49 + (((tickAnim - 33) / 68) * (-10.49-(-10.49)));
            zz = 15.95 + (((tickAnim - 33) / 68) * (15.95-(15.95)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = 15.5 + (((tickAnim - 101) / 17) * (11.88-(15.5)));
            yy = -10.49 + (((tickAnim - 101) / 17) * (-8.04-(-10.49)));
            zz = 15.95 + (((tickAnim - 101) / 17) * (12.23-(15.95)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 11.88 + (((tickAnim - 118) / 5) * (25.01913-(11.88)));
            yy = -8.04 + (((tickAnim - 118) / 5) * (-7.45739-(-8.04)));
            zz = 12.23 + (((tickAnim - 118) / 5) * (11.34377-(12.23)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 25.01913 + (((tickAnim - 123) / 5) * (26.83983-(25.01913)));
            yy = -7.45739 + (((tickAnim - 123) / 5) * (-10.71632-(-7.45739)));
            zz = 11.34377 + (((tickAnim - 123) / 5) * (13.03518-(11.34377)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 26.83983 + (((tickAnim - 128) / 9) * (14.13109-(26.83983)));
            yy = -10.71632 + (((tickAnim - 128) / 9) * (-8.83626-(-10.71632)));
            zz = 13.03518 + (((tickAnim - 128) / 9) * (10.7483-(13.03518)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 14.13109 + (((tickAnim - 137) / 5) * (13.04242-(14.13109)));
            yy = -8.83626 + (((tickAnim - 137) / 5) * (-1.88321-(-8.83626)));
            zz = 10.7483 + (((tickAnim - 137) / 5) * (1.2539-(10.7483)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = 13.04242 + (((tickAnim - 142) / 1) * (12.61832-(13.04242)));
            yy = -1.88321 + (((tickAnim - 142) / 1) * (-5.62044-(-1.88321)));
            zz = 1.2539 + (((tickAnim - 142) / 1) * (-2.03102-(1.2539)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = 12.61832 + (((tickAnim - 143) / 2) * (12.01087-(12.61832)));
            yy = -5.62044 + (((tickAnim - 143) / 2) * (6.03632-(-5.62044)));
            zz = -2.03102 + (((tickAnim - 143) / 2) * (7.47575-(-2.03102)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = 12.01087 + (((tickAnim - 145) / 2) * (11.13-(12.01087)));
            yy = 6.03632 + (((tickAnim - 145) / 2) * (-1.61-(6.03632)));
            zz = 7.47575 + (((tickAnim - 145) / 2) * (1.07-(7.47575)));
        }
        else if (tickAnim >= 147 && tickAnim < 176) {
            xx = 11.13 + (((tickAnim - 147) / 29) * (0-(11.13)));
            yy = -1.61 + (((tickAnim - 147) / 29) * (0-(-1.61)));
            zz = 1.07 + (((tickAnim - 147) / 29) * (0-(1.07)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -37 + (((tickAnim - 9) / 7) * (-63.96014-(-37)));
            yy = 0 + (((tickAnim - 9) / 7) * (6.73659-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (1.02959-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -63.96014 + (((tickAnim - 16) / 3) * (-79.24885-(-63.96014)));
            yy = 6.73659 + (((tickAnim - 16) / 3) * (9.50812-(6.73659)));
            zz = 1.02959 + (((tickAnim - 16) / 3) * (7.15352-(1.02959)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -79.24885 + (((tickAnim - 19) / 4) * (-62.53756-(-79.24885)));
            yy = 9.50812 + (((tickAnim - 19) / 4) * (12.27965-(9.50812)));
            zz = 7.15352 + (((tickAnim - 19) / 4) * (13.27745-(7.15352)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = -62.53756 + (((tickAnim - 23) / 1) * (-57.67556-(-62.53756)));
            yy = 12.27965 + (((tickAnim - 23) / 1) * (14.2933-(12.27965)));
            zz = 13.27745 + (((tickAnim - 23) / 1) * (9.20033-(13.27745)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -57.67556 + (((tickAnim - 24) / 4) * (-36.89637-(-57.67556)));
            yy = 14.2933 + (((tickAnim - 24) / 4) * (17.51515-(14.2933)));
            zz = 9.20033 + (((tickAnim - 24) / 4) * (2.67695-(9.20033)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.89637 + (((tickAnim - 28) / 1) * (-37.51485-(-36.89637)));
            yy = 17.51515 + (((tickAnim - 28) / 1) * (14.157-(17.51515)));
            zz = 2.67695 + (((tickAnim - 28) / 1) * (0.42842-(2.67695)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -37.51485 + (((tickAnim - 29) / 2) * (-35.19637-(-37.51485)));
            yy = 14.157 + (((tickAnim - 29) / 2) * (24.16016-(14.157)));
            zz = 0.42842 + (((tickAnim - 29) / 2) * (7.45824-(0.42842)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = -35.19637 + (((tickAnim - 31) / 2) * (-36.9-(-35.19637)));
            yy = 24.16016 + (((tickAnim - 31) / 2) * (17.52-(24.16016)));
            zz = 7.45824 + (((tickAnim - 31) / 2) * (2.68-(7.45824)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -36.9 + (((tickAnim - 33) / 68) * (-36.9-(-36.9)));
            yy = 17.52 + (((tickAnim - 33) / 68) * (17.52-(17.52)));
            zz = 2.68 + (((tickAnim - 33) / 68) * (2.68-(2.68)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = -36.9 + (((tickAnim - 101) / 17) * (-28.29-(-36.9)));
            yy = 17.52 + (((tickAnim - 101) / 17) * (13.43-(17.52)));
            zz = 2.68 + (((tickAnim - 101) / 17) * (2.05-(2.68)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -28.29 + (((tickAnim - 118) / 5) * (-70.24-(-28.29)));
            yy = 13.43 + (((tickAnim - 118) / 5) * (12.45681-(13.43)));
            zz = 2.05 + (((tickAnim - 118) / 5) * (1.90145-(2.05)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -70.24 + (((tickAnim - 123) / 5) * (-79.5575-(-70.24)));
            yy = 12.45681 + (((tickAnim - 123) / 5) * (11.09435-(12.45681)));
            zz = 1.90145 + (((tickAnim - 123) / 5) * (1.69348-(1.90145)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = -79.5575 + (((tickAnim - 128) / 9) * (-86.60004-(-79.5575)));
            yy = 11.09435 + (((tickAnim - 128) / 9) * (9.14797-(11.09435)));
            zz = 1.69348 + (((tickAnim - 128) / 9) * (1.39638-(1.69348)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = -86.60004 + (((tickAnim - 137) / 5) * (-40.79368-(-86.60004)));
            yy = 9.14797 + (((tickAnim - 137) / 5) * (3.62044-(9.14797)));
            zz = 1.39638 + (((tickAnim - 137) / 5) * (-1.24315-(1.39638)));
        }
        else if (tickAnim >= 142 && tickAnim < 143) {
            xx = -40.79368 + (((tickAnim - 142) / 1) * (-39.3742-(-40.79368)));
            yy = 3.62044 + (((tickAnim - 142) / 1) * (14.07416-(3.62044)));
            zz = -1.24315 + (((tickAnim - 142) / 1) * (-5.33479-(-1.24315)));
        }
        else if (tickAnim >= 143 && tickAnim < 145) {
            xx = -39.3742 + (((tickAnim - 143) / 2) * (-36.76627-(-39.3742)));
            yy = 14.07416 + (((tickAnim - 143) / 2) * (-4.2745-(14.07416)));
            zz = -5.33479 + (((tickAnim - 143) / 2) * (-6.04627-(-5.33479)));
        }
        else if (tickAnim >= 145 && tickAnim < 147) {
            xx = -36.76627 + (((tickAnim - 145) / 2) * (-34.82-(-36.76627)));
            yy = -4.2745 + (((tickAnim - 145) / 2) * (3.08-(-4.2745)));
            zz = -6.04627 + (((tickAnim - 145) / 2) * (-1.06-(-6.04627)));
        }
        else if (tickAnim >= 147 && tickAnim < 176) {
            xx = -34.82 + (((tickAnim - 147) / 29) * (0-(-34.82)));
            yy = 3.08 + (((tickAnim - 147) / 29) * (0-(3.08)));
            zz = -1.06 + (((tickAnim - 147) / 29) * (0-(-1.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = 32 + (((tickAnim - 9) / 7) * (40.80939-(32)));
            yy = 0 + (((tickAnim - 9) / 7) * (0.60816-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0.87123-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 40.80939 + (((tickAnim - 16) / 3) * (80.18627-(40.80939)));
            yy = 0.60816 + (((tickAnim - 16) / 3) * (1.77081-(0.60816)));
            zz = 0.87123 + (((tickAnim - 16) / 3) * (-5.49004-(0.87123)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 80.18627 + (((tickAnim - 19) / 4) * (55.56316-(80.18627)));
            yy = 1.77081 + (((tickAnim - 19) / 4) * (2.93347-(1.77081)));
            zz = -5.49004 + (((tickAnim - 19) / 4) * (-11.8513-(-5.49004)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 55.56316 + (((tickAnim - 23) / 1) * (47.1814-(55.56316)));
            yy = 2.93347 + (((tickAnim - 23) / 1) * (1.94086-(2.93347)));
            zz = -11.8513 + (((tickAnim - 23) / 1) * (-10.71327-(-11.8513)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 47.1814 + (((tickAnim - 24) / 4) * (13.52946-(47.1814)));
            yy = 1.94086 + (((tickAnim - 24) / 4) * (21.3977-(1.94086)));
            zz = -10.71327 + (((tickAnim - 24) / 4) * (-28.38224-(-10.71327)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 13.52946 + (((tickAnim - 28) / 1) * (15.58595-(13.52946)));
            yy = 21.3977 + (((tickAnim - 28) / 1) * (19.1446-(21.3977)));
            zz = -28.38224 + (((tickAnim - 28) / 1) * (-22.45204-(-28.38224)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 15.58595 + (((tickAnim - 29) / 2) * (14.24625-(15.58595)));
            yy = 19.1446 + (((tickAnim - 29) / 2) * (20.67055-(19.1446)));
            zz = -22.45204 + (((tickAnim - 29) / 2) * (-26.38478-(-22.45204)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 14.24625 + (((tickAnim - 31) / 2) * (14.93164-(14.24625)));
            yy = 20.67055 + (((tickAnim - 31) / 2) * (19.91838-(20.67055)));
            zz = -26.38478 + (((tickAnim - 31) / 2) * (-24.40892-(-26.38478)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 14.93164 + (((tickAnim - 33) / 68) * (14.93164-(14.93164)));
            yy = 19.91838 + (((tickAnim - 33) / 68) * (19.91838-(19.91838)));
            zz = -24.40892 + (((tickAnim - 33) / 68) * (-24.40892-(-24.40892)));
        }
        else if (tickAnim >= 101 && tickAnim < 118) {
            xx = 14.93164 + (((tickAnim - 101) / 17) * (10.37-(14.93164)));
            yy = 19.91838 + (((tickAnim - 101) / 17) * (16.41-(19.91838)));
            zz = -24.40892 + (((tickAnim - 101) / 17) * (-21.76-(-24.40892)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = 10.37 + (((tickAnim - 118) / 5) * (34.61855-(10.37)));
            yy = 16.41 + (((tickAnim - 118) / 5) * (15.22087-(16.41)));
            zz = -21.76 + (((tickAnim - 118) / 5) * (-20.18319-(-21.76)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 34.61855 + (((tickAnim - 123) / 5) * (71.79233-(34.61855)));
            yy = 15.22087 + (((tickAnim - 123) / 5) * (5.64798-(15.22087)));
            zz = -20.18319 + (((tickAnim - 123) / 5) * (-24.18868-(-20.18319)));
        }
        else if (tickAnim >= 128 && tickAnim < 133) {
            xx = 71.79233 + (((tickAnim - 128) / 5) * (82.38949-(71.79233)));
            yy = 5.64798 + (((tickAnim - 128) / 5) * (5.15255-(5.64798)));
            zz = -24.18868 + (((tickAnim - 128) / 5) * (-22.06686-(-24.18868)));
        }
        else if (tickAnim >= 133 && tickAnim < 137) {
            xx = 82.38949 + (((tickAnim - 133) / 4) * (56.98666-(82.38949)));
            yy = 5.15255 + (((tickAnim - 133) / 4) * (4.65711-(5.15255)));
            zz = -22.06686 + (((tickAnim - 133) / 4) * (-19.94505-(-22.06686)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 56.98666 + (((tickAnim - 137) / 5) * (29.52291-(56.98666)));
            yy = 4.65711 + (((tickAnim - 137) / 5) * (-0.07693-(4.65711)));
            zz = -19.94505 + (((tickAnim - 137) / 5) * (-1.77861-(-19.94505)));
        }
        else if (tickAnim >= 142 && tickAnim < 176) {
            xx = 29.52291 + (((tickAnim - 142) / 34) * (0-(29.52291)));
            yy = -0.07693 + (((tickAnim - 142) / 34) * (0-(-0.07693)));
            zz = -1.77861 + (((tickAnim - 142) / 34) * (0-(-1.77861)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*2), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917+50))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.0287+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*0.5), tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*2), tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*1.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-70))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*2.5), tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*2), tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-90))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*5), tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*1), tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-110))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*5), tail7.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*1), tail7.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-130))*1));


        this.setRotateAngle(TailClub, TailClub.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*5), TailClub.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*1), TailClub.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8.7917-150))*1));



        if (tickAnim >= 8 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 8) / 13) * (11.72-(0)));
            yy = 0 + (((tickAnim - 8) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 13) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 11.72 + (((tickAnim - 21) / 3) * (13.62-(11.72)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 13.62 + (((tickAnim - 24) / 8) * (17.89-(13.62)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 17.89 + (((tickAnim - 32) / 1) * (18.84-(17.89)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 18.84 + (((tickAnim - 33) / 15) * (21.75-(18.84)));
            yy = 0 + (((tickAnim - 33) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 15) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 21.75 + (((tickAnim - 48) / 7) * (22.32-(21.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 64) {
            xx = 22.32 + (((tickAnim - 55) / 9) * (23-(22.32)));
            yy = 0 + (((tickAnim - 55) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 9) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 105) {
            xx = 23 + (((tickAnim - 64) / 41) * (23-(23)));
            yy = 0 + (((tickAnim - 64) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 41) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 23 + (((tickAnim - 105) / 13) * (13.92-(23)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 13.92 + (((tickAnim - 118) / 7) * (9.39-(13.92)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 126) {
            xx = 9.39 + (((tickAnim - 125) / 1) * (8.82-(9.39)));
            yy = 0 + (((tickAnim - 125) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 1) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 138) {
            xx = 8.82 + (((tickAnim - 126) / 12) * (4-(8.82)));
            yy = 0 + (((tickAnim - 126) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 12) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = 4 + (((tickAnim - 138) / 5) * (3.2-(4)));
            yy = 0 + (((tickAnim - 138) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 5) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 150) {
            xx = 3.2 + (((tickAnim - 143) / 7) * (2-(3.2)));
            yy = 0 + (((tickAnim - 143) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 7) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 2 + (((tickAnim - 150) / 13) * (0-(2)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 8) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 47) * (2.05-(0)));
            zz = 0 + (((tickAnim - 8) / 47) * (-2.825-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 55) / 50) * (0-(0)));
            yy = 2.05 + (((tickAnim - 55) / 50) * (2.05-(2.05)));
            zz = -2.825 + (((tickAnim - 55) / 50) * (-2.825-(-2.825)));
        }
        else if (tickAnim >= 105 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 105) / 71) * (0-(0)));
            yy = 2.05 + (((tickAnim - 105) / 71) * (0-(2.05)));
            zz = -2.825 + (((tickAnim - 105) / 71) * (0-(-2.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (5.74-(0)));
            yy = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 5.74 + (((tickAnim - 21) / 4) * (6.82-(5.74)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 6.82 + (((tickAnim - 25) / 8) * (8.78-(6.82)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 8.78 + (((tickAnim - 33) / 1) * (9.21-(8.78)));
            yy = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 1) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 9.21 + (((tickAnim - 34) / 14) * (11.22-(9.21)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 11.22 + (((tickAnim - 48) / 8) * (11.69-(11.22)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 68) {
            xx = 11.69 + (((tickAnim - 56) / 12) * (12-(11.69)));
            yy = 0 + (((tickAnim - 56) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 12) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 12 + (((tickAnim - 68) / 37) * (12-(12)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 119) {
            xx = 12 + (((tickAnim - 105) / 14) * (9.85-(12)));
            yy = 0 + (((tickAnim - 105) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 14) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 125) {
            xx = 9.85 + (((tickAnim - 119) / 6) * (8.49-(9.85)));
            yy = 0 + (((tickAnim - 119) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 6) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 142) {
            xx = 8.49 + (((tickAnim - 125) / 17) * (2.77-(8.49)));
            yy = 0 + (((tickAnim - 125) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 17) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 149) {
            xx = 2.77 + (((tickAnim - 142) / 7) * (1.39-(2.77)));
            yy = 0 + (((tickAnim - 142) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 7) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 1.39 + (((tickAnim - 149) / 14) * (0-(1.39)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 7) / 17) * (4.26-(0)));
            yy = 0 + (((tickAnim - 7) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 17) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 4.26 + (((tickAnim - 24) / 8) * (5.63496-(4.26)));
            yy = 0 + (((tickAnim - 24) / 8) * (0.74992-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (1.31527-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 42) {
            xx = 5.63496 + (((tickAnim - 32) / 10) * (7.16-(5.63496)));
            yy = 0.74992 + (((tickAnim - 32) / 10) * (0-(0.74992)));
            zz = 1.31527 + (((tickAnim - 32) / 10) * (0-(1.31527)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 7.16 + (((tickAnim - 42) / 6) * (7.71535-(7.16)));
            yy = 0 + (((tickAnim - 42) / 6) * (0.26861-(0)));
            zz = 0 + (((tickAnim - 42) / 6) * (-1.98189-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 68) {
            xx = 7.71535 + (((tickAnim - 48) / 20) * (9-(7.71535)));
            yy = 0.26861 + (((tickAnim - 48) / 20) * (0-(0.26861)));
            zz = -1.98189 + (((tickAnim - 48) / 20) * (0-(-1.98189)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 9 + (((tickAnim - 68) / 37) * (9-(9)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 118) {
            xx = 9 + (((tickAnim - 105) / 13) * (7.75-(9)));
            yy = 0 + (((tickAnim - 105) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 13) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 7.75 + (((tickAnim - 118) / 7) * (6.33711-(7.75)));
            yy = 0 + (((tickAnim - 118) / 7) * (-0.56665-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (1.99413-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 137) {
            xx = 6.33711 + (((tickAnim - 125) / 12) * (2.66-(6.33711)));
            yy = -0.56665 + (((tickAnim - 125) / 12) * (0-(-0.56665)));
            zz = 1.99413 + (((tickAnim - 125) / 12) * (0-(1.99413)));
        }
        else if (tickAnim >= 137 && tickAnim < 141) {
            xx = 2.66 + (((tickAnim - 137) / 4) * (1.9-(2.66)));
            yy = 0 + (((tickAnim - 137) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 4) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 149) {
            xx = 1.9 + (((tickAnim - 141) / 8) * (0.37-(1.9)));
            yy = 0 + (((tickAnim - 141) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 8) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 0.37 + (((tickAnim - 149) / 14) * (0-(0.37)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 7) / 20) * (3.07-(0)));
            yy = 0 + (((tickAnim - 7) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 20) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 44) {
            xx = 3.07 + (((tickAnim - 27) / 17) * (5.76-(3.07)));
            yy = 0 + (((tickAnim - 27) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 17) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 5.76 + (((tickAnim - 44) / 11) * (7.79-(5.76)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 68) {
            xx = 7.79 + (((tickAnim - 55) / 13) * (4-(7.79)));
            yy = 0 + (((tickAnim - 55) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 13) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 4 + (((tickAnim - 68) / 37) * (-3.5-(4)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 111) {
            xx = -3.5 + (((tickAnim - 105) / 6) * (6.35-(-3.5)));
            yy = 0 + (((tickAnim - 105) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 6) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 121) {
            xx = 6.35 + (((tickAnim - 111) / 10) * (4.52-(6.35)));
            yy = 0 + (((tickAnim - 111) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 10) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 133) {
            xx = 4.52 + (((tickAnim - 121) / 12) * (5.25-(4.52)));
            yy = 0 + (((tickAnim - 121) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 12) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 146) {
            xx = 5.25 + (((tickAnim - 133) / 13) * (4.92-(5.25)));
            yy = 0 + (((tickAnim - 133) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 13) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 155) {
            xx = 4.92 + (((tickAnim - 146) / 9) * (2.21-(4.92)));
            yy = 0 + (((tickAnim - 146) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 9) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 163) {
            xx = 2.21 + (((tickAnim - 155) / 8) * (0-(2.21)));
            yy = 0 + (((tickAnim - 155) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (3.08-(0)));
            yy = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 3.08 + (((tickAnim - 34) / 14) * (4.03-(3.08)));
            yy = 0 + (((tickAnim - 34) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 14) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 4.03 + (((tickAnim - 48) / 19) * (3.25-(4.03)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 105) {
            xx = 3.25 + (((tickAnim - 67) / 38) * (-2.5-(3.25)));
            yy = 0 + (((tickAnim - 67) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 38) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 112) {
            xx = -2.5 + (((tickAnim - 105) / 7) * (2.01-(-2.5)));
            yy = 0 + (((tickAnim - 105) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 7) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 119) {
            xx = 2.01 + (((tickAnim - 112) / 7) * (0.77-(2.01)));
            yy = 0 + (((tickAnim - 112) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 7) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 129) {
            xx = 0.77 + (((tickAnim - 119) / 10) * (2.59-(0.77)));
            yy = 0 + (((tickAnim - 119) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 10) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 141) {
            xx = 2.59 + (((tickAnim - 129) / 12) * (3.68-(2.59)));
            yy = 0 + (((tickAnim - 129) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 12) * (0-(0)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 3.68 + (((tickAnim - 141) / 10) * (2.98-(3.68)));
            yy = 0 + (((tickAnim - 141) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 141) / 10) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 163) {
            xx = 2.98 + (((tickAnim - 151) / 12) * (0-(2.98)));
            yy = 0 + (((tickAnim - 151) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (2.95-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2.95 + (((tickAnim - 30) / 10) * (4.89-(2.95)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 67) {
            xx = 4.89 + (((tickAnim - 40) / 27) * (2.75-(4.89)));
            yy = 0 + (((tickAnim - 40) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 27) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 88) {
            xx = 2.75 + (((tickAnim - 67) / 21) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 67) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 21) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 2.75 + (((tickAnim - 88) / 3) * (1.5-(2.75)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 101) {
            xx = 1.5 + (((tickAnim - 91) / 10) * (3.64-(1.5)));
            yy = 0 + (((tickAnim - 91) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 10) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = 3.64 + (((tickAnim - 101) / 7) * (1.61-(3.64)));
            yy = 0 + (((tickAnim - 101) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 7) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 115) {
            xx = 1.61 + (((tickAnim - 108) / 7) * (9.96-(1.61)));
            yy = 0 + (((tickAnim - 108) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 7) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 126) {
            xx = 9.96 + (((tickAnim - 115) / 11) * (10.69-(9.96)));
            yy = 0 + (((tickAnim - 115) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 11) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 133) {
            xx = 10.69 + (((tickAnim - 126) / 7) * (4.25-(10.69)));
            yy = 0 + (((tickAnim - 126) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 7) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 139) {
            xx = 4.25 + (((tickAnim - 133) / 6) * (2.8-(4.25)));
            yy = 0 + (((tickAnim - 133) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 6) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 146) {
            xx = 2.8 + (((tickAnim - 139) / 7) * (1-(2.8)));
            yy = 0 + (((tickAnim - 139) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 139) / 7) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 163) {
            xx = 1 + (((tickAnim - 146) / 17) * (0-(1)));
            yy = 0 + (((tickAnim - 146) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));





        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (5.43-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 5.43 + (((tickAnim - 33) / 10) * (9.24-(5.43)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 9.24 + (((tickAnim - 43) / 11) * (10.83-(9.24)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 67) {
            xx = 10.83 + (((tickAnim - 54) / 13) * (8-(10.83)));
            yy = 0 + (((tickAnim - 54) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 13) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 88) {
            xx = 8 + (((tickAnim - 67) / 21) * (8-(8)));
            yy = 0 + (((tickAnim - 67) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 21) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = 8 + (((tickAnim - 88) / 8) * (5.45-(8)));
            yy = 0 + (((tickAnim - 88) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 8) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 109) {
            xx = 5.45 + (((tickAnim - 96) / 13) * (10.05-(5.45)));
            yy = 0 + (((tickAnim - 96) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 13) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 10.05 + (((tickAnim - 109) / 8) * (13.57-(10.05)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 129) {
            xx = 13.57 + (((tickAnim - 117) / 12) * (13.87-(13.57)));
            yy = 0 + (((tickAnim - 117) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 12) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 135) {
            xx = 13.87 + (((tickAnim - 129) / 6) * (16.44-(13.87)));
            yy = 0 + (((tickAnim - 129) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 6) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 142) {
            xx = 16.44 + (((tickAnim - 135) / 7) * (15.45-(16.44)));
            yy = 0 + (((tickAnim - 135) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 135) / 7) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 150) {
            xx = 15.45 + (((tickAnim - 142) / 8) * (8.27-(15.45)));
            yy = 0 + (((tickAnim - 142) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 8) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 163) {
            xx = 8.27 + (((tickAnim - 150) / 13) * (0-(8.27)));
            yy = 0 + (((tickAnim - 150) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (1.8-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 46) {
            xx = 1.8 + (((tickAnim - 33) / 13) * (3.63-(1.8)));
            yy = 0 + (((tickAnim - 33) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 13) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = 3.63 + (((tickAnim - 46) / 10) * (3.81-(3.63)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 67) {
            xx = 3.81 + (((tickAnim - 56) / 11) * (4-(3.81)));
            yy = 0 + (((tickAnim - 56) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 11) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 93) {
            xx = 4 + (((tickAnim - 67) / 26) * (4-(4)));
            yy = 0 + (((tickAnim - 67) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 26) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 93) / 9) * (0.51-(4)));
            yy = 0 + (((tickAnim - 93) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 9) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 111) {
            xx = 0.51 + (((tickAnim - 102) / 9) * (7.92-(0.51)));
            yy = 0 + (((tickAnim - 102) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 9) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 116) {
            xx = 7.92 + (((tickAnim - 111) / 5) * (5.39-(7.92)));
            yy = 0 + (((tickAnim - 111) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 5) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 127) {
            xx = 5.39 + (((tickAnim - 116) / 11) * (6.42-(5.39)));
            yy = 0 + (((tickAnim - 116) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 11) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 138) {
            xx = 6.42 + (((tickAnim - 127) / 11) * (5.01-(6.42)));
            yy = 0 + (((tickAnim - 127) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 11) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 151) {
            xx = 5.01 + (((tickAnim - 138) / 13) * (6.27-(5.01)));
            yy = 0 + (((tickAnim - 138) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 13) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 161) {
            xx = 6.27 + (((tickAnim - 151) / 10) * (6.76-(6.27)));
            yy = 0 + (((tickAnim - 151) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 151) / 10) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 167) {
            xx = 6.76 + (((tickAnim - 161) / 6) * (3.13-(6.76)));
            yy = 0 + (((tickAnim - 161) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 6) * (0-(0)));
        }
        else if (tickAnim >= 167 && tickAnim < 176) {
            xx = 3.13 + (((tickAnim - 167) / 9) * (0-(3.13)));
            yy = 0 + (((tickAnim - 167) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 167) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 85 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 85) / 7) * (-1.33-(0)));
            yy = 0 + (((tickAnim - 85) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 7) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 100) {
            xx = -1.33 + (((tickAnim - 92) / 8) * (-3-(-1.33)));
            yy = 0 + (((tickAnim - 92) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 8) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -3 + (((tickAnim - 100) / 10) * (-20-(-3)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 125) {
            xx = -20 + (((tickAnim - 110) / 15) * (-14-(-20)));
            yy = 0 + (((tickAnim - 110) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 15) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -14 + (((tickAnim - 125) / 15) * (-2.4-(-14)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 163) {
            xx = -2.4 + (((tickAnim - 140) / 23) * (0-(-2.4)));
            yy = 0 + (((tickAnim - 140) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 72 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 72) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 72) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 6) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 14 + (((tickAnim - 78) / 5) * (0-(14)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 83) / 6) * (14-(0)));
            yy = 0 + (((tickAnim - 83) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 6) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 95) {
            xx = 14 + (((tickAnim - 89) / 6) * (0-(14)));
            yy = 0 + (((tickAnim - 89) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 6) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 95) / 7) * (18-(0)));
            yy = 0 + (((tickAnim - 95) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 7) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 111) {
            xx = 18 + (((tickAnim - 102) / 9) * (-2-(18)));
            yy = 0 + (((tickAnim - 102) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 0) / 93) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 93) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 111) {
            xx = 0 + (((tickAnim - 93) / 18) * (6.75-(0)));
            yy = 0 + (((tickAnim - 93) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 18) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 176) {
            xx = 6.75 + (((tickAnim - 111) / 65) * (0-(6.75)));
            yy = 0 + (((tickAnim - 111) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-1-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = -1 + (((tickAnim - 9) / 4) * (0-(-1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (1-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 1 + (((tickAnim - 9) / 4) * (0-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12 + (((tickAnim - 3) / 4) * (10.33-(12)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 10.33 + (((tickAnim - 7) / 1) * (-4-(10.33)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4 + (((tickAnim - 8) / 5) * (-8-(-4)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8 + (((tickAnim - 13) / 5) * (-8.37671-(-8)));
            yy = 0 + (((tickAnim - 13) / 5) * (-0.06541-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (1.87386-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -8.37671 + (((tickAnim - 18) / 2) * (0-(-8.37671)));
            yy = -0.06541 + (((tickAnim - 18) / 2) * (0-(-0.06541)));
            zz = 1.87386 + (((tickAnim - 18) / 2) * (0-(1.87386)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -16 + (((tickAnim - 3) / 4) * (-27.5-(-16)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -27.5 + (((tickAnim - 7) / 2) * (-19-(-27.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -19 + (((tickAnim - 9) / 6) * (-11-(-19)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 15) / 3) * (5-(-11)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 20 + (((tickAnim - 3) / 4) * (28-(20)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 28 + (((tickAnim - 7) / 2) * (-1.27135-(28)));
            yy = 0 + (((tickAnim - 7) / 2) * (-20.63216-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-4.00153-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -1.27135 + (((tickAnim - 9) / 6) * (-10.9665-(-1.27135)));
            yy = -20.63216 + (((tickAnim - 9) / 6) * (-11.99583-(-20.63216)));
            zz = -4.00153 + (((tickAnim - 9) / 6) * (-0.3188-(-4.00153)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -10.9665 + (((tickAnim - 15) / 5) * (0-(-10.9665)));
            yy = -11.99583 + (((tickAnim - 15) / 5) * (0-(-11.99583)));
            zz = -0.3188 + (((tickAnim - 15) / 5) * (0-(-0.3188)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 9) / 11) * (0-(0.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 1.75 + (((tickAnim - 9) / 11) * (0-(1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 2.5 + (((tickAnim - 9) / 11) * (0-(2.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -6.25 + (((tickAnim - 9) / 11) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 9) / 11) * (0-(5.5)));
            yy = -4.5 + (((tickAnim - 9) / 11) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-5.75-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = -5.75 + (((tickAnim - 9) / 11) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(0), neck7.rotateAngleY + (float) Math.toRadians(0), neck7.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-5.75-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = -5.75 + (((tickAnim - 9) / 11) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 5) / 8) * (11-(4.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 13) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 200;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (3.52941-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 48) {
            xx = 10 + (((tickAnim - 17) / 31) * (0-(10)));
            yy = 3.52941 + (((tickAnim - 17) / 31) * (10-(3.52941)));
            zz = 0 + (((tickAnim - 17) / 31) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (2.5-(0)));
            yy = 10 + (((tickAnim - 48) / 10) * (10-(10)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 2.5 + (((tickAnim - 58) / 10) * (0.62579-(2.5)));
            yy = 10 + (((tickAnim - 58) / 10) * (8.10607-(10)));
            zz = 0 + (((tickAnim - 58) / 10) * (-4.68605-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 83) {
            xx = 0.62579 + (((tickAnim - 68) / 15) * (0-(0.62579)));
            yy = 8.10607 + (((tickAnim - 68) / 15) * (10-(8.10607)));
            zz = -4.68605 + (((tickAnim - 68) / 15) * (0-(-4.68605)));
        }
        else if (tickAnim >= 83 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 83) / 46) * (-0.37329-(0)));
            yy = 10 + (((tickAnim - 83) / 46) * (-8.17558-(10)));
            zz = 0 + (((tickAnim - 83) / 46) * (-3.016-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 173) {
            xx = -0.37329 + (((tickAnim - 129) / 44) * (-0.37329-(-0.37329)));
            yy = -8.17558 + (((tickAnim - 129) / 44) * (-8.17558-(-8.17558)));
            zz = -3.016 + (((tickAnim - 129) / 44) * (-3.016-(-3.016)));
        }
        else if (tickAnim >= 173 && tickAnim < 200) {
            xx = -0.37329 + (((tickAnim - 173) / 27) * (0-(-0.37329)));
            yy = -8.17558 + (((tickAnim - 173) / 27) * (0-(-8.17558)));
            zz = -3.016 + (((tickAnim - 173) / 27) * (0-(-3.016)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 9) / 22) * (2.06102-(0)));
            yy = -0.15 + (((tickAnim - 9) / 22) * (4.77248-(-0.15)));
            zz = 0 + (((tickAnim - 9) / 22) * (-4.98979-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 48) {
            xx = 2.06102 + (((tickAnim - 31) / 17) * (0-(2.06102)));
            yy = 4.77248 + (((tickAnim - 31) / 17) * (0-(4.77248)));
            zz = -4.98979 + (((tickAnim - 31) / 17) * (0-(-4.98979)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (-0.31716-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (7.12314-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (-2.4917-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -0.31716 + (((tickAnim - 60) / 23) * (0-(-0.31716)));
            yy = 7.12314 + (((tickAnim - 60) / 23) * (0-(7.12314)));
            zz = -2.4917 + (((tickAnim - 60) / 23) * (0-(-2.4917)));
        }
        else if (tickAnim >= 83 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 83) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 22) * (4.19-(0)));
            zz = 0 + (((tickAnim - 83) / 22) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 105) / 17) * (7.5-(0)));
            yy = 4.19 + (((tickAnim - 105) / 17) * (3.31739-(4.19)));
            zz = 0 + (((tickAnim - 105) / 17) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 153) {
            xx = 7.5 + (((tickAnim - 122) / 31) * (0-(7.5)));
            yy = 3.31739 + (((tickAnim - 122) / 31) * (-2.5-(3.31739)));
            zz = 0 + (((tickAnim - 122) / 31) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 153) / 25) * (0-(0)));
            yy = -2.5 + (((tickAnim - 153) / 25) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 153) / 25) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 178) / 22) * (0-(0)));
            yy = -2.5 + (((tickAnim - 178) / 22) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 178) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4.41-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 18) / 30) * (0-(0)));
            yy = -4.41 + (((tickAnim - 18) / 30) * (2.5-(-4.41)));
            zz = 0 + (((tickAnim - 18) / 30) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 48) / 35) * (0-(0)));
            yy = 2.5 + (((tickAnim - 48) / 35) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 48) / 35) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 83) / 34) * (0-(0)));
            yy = 2.5 + (((tickAnim - 83) / 34) * (3.75-(2.5)));
            zz = 0 + (((tickAnim - 83) / 34) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 117) / 17) * (5-(0)));
            yy = 3.75 + (((tickAnim - 117) / 17) * (-0.36765-(3.75)));
            zz = 0 + (((tickAnim - 117) / 17) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 153) {
            xx = 5 + (((tickAnim - 134) / 19) * (0-(5)));
            yy = -0.36765 + (((tickAnim - 134) / 19) * (-5-(-0.36765)));
            zz = 0 + (((tickAnim - 134) / 19) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 153) / 25) * (0-(0)));
            yy = -5 + (((tickAnim - 153) / 25) * (-5-(-5)));
            zz = 0 + (((tickAnim - 153) / 25) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 178) / 22) * (0-(0)));
            yy = -5 + (((tickAnim - 178) / 22) * (0-(-5)));
            zz = 0 + (((tickAnim - 178) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.21-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 25) / 23) * (0-(0)));
            yy = -2.21 + (((tickAnim - 25) / 23) * (2.5-(-2.21)));
            zz = 0 + (((tickAnim - 25) / 23) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 48) / 19) * (-7.5-(0)));
            yy = 2.5 + (((tickAnim - 48) / 19) * (6.91176-(2.5)));
            zz = 0 + (((tickAnim - 48) / 19) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 67) / 16) * (0-(-7.5)));
            yy = 6.91176 + (((tickAnim - 67) / 16) * (2.5-(6.91176)));
            zz = 0 + (((tickAnim - 67) / 16) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 83) / 42) * (0-(0)));
            yy = 2.5 + (((tickAnim - 83) / 42) * (5.96-(2.5)));
            zz = 0 + (((tickAnim - 83) / 42) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 125) / 10) * (-7.5-(0)));
            yy = 5.96 + (((tickAnim - 125) / 10) * (4.12615-(5.96)));
            zz = 0 + (((tickAnim - 125) / 10) * (0-(0)));
        }
        else if (tickAnim >= 135 && tickAnim < 153) {
            xx = -7.5 + (((tickAnim - 135) / 18) * (0-(-7.5)));
            yy = 4.12615 + (((tickAnim - 135) / 18) * (0-(4.12615)));
            zz = 0 + (((tickAnim - 135) / 18) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 153) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 153) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 25) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 178) / 11) * (2.5-(0)));
            yy = 0 + (((tickAnim - 178) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 11) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 200) {
            xx = 2.5 + (((tickAnim - 189) / 11) * (0-(2.5)));
            yy = 0 + (((tickAnim - 189) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0.01229-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (-2.4321-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (6.03878-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0.01229 + (((tickAnim - 31) / 3) * (0.08607-(0.01229)));
            yy = -2.4321 + (((tickAnim - 31) / 3) * (0.70628-(-2.4321)));
            zz = 6.03878 + (((tickAnim - 31) / 3) * (-1.53378-(6.03878)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0.08607 + (((tickAnim - 34) / 14) * (0-(0.08607)));
            yy = 0.70628 + (((tickAnim - 34) / 14) * (0-(0.70628)));
            zz = -1.53378 + (((tickAnim - 34) / 14) * (12.5-(-1.53378)));
        }
        else if (tickAnim >= 48 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 19) * (0-(0)));
            zz = 12.5 + (((tickAnim - 48) / 19) * (0-(12.5)));
        }
        else if (tickAnim >= 67 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 16) * (12.5-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 83) / 30) * (-12.48676-(0)));
            yy = 0 + (((tickAnim - 83) / 30) * (1.8455-(0)));
            zz = 12.5 + (((tickAnim - 83) / 30) * (4.11594-(12.5)));
        }
        else if (tickAnim >= 113 && tickAnim < 134) {
            xx = -12.48676 + (((tickAnim - 113) / 21) * (0.02206-(-12.48676)));
            yy = 1.8455 + (((tickAnim - 113) / 21) * (3.07583-(1.8455)));
            zz = 4.11594 + (((tickAnim - 113) / 21) * (-1.47343-(4.11594)));
        }
        else if (tickAnim >= 134 && tickAnim < 153) {
            xx = 0.02206 + (((tickAnim - 134) / 19) * (0.01229-(0.02206)));
            yy = 3.07583 + (((tickAnim - 134) / 19) * (-2.4321-(3.07583)));
            zz = -1.47343 + (((tickAnim - 134) / 19) * (-8.07887-(-1.47343)));
        }
        else if (tickAnim >= 153 && tickAnim < 165) {
            xx = 0.01229 + (((tickAnim - 153) / 12) * (-2.48283-(0.01229)));
            yy = -2.4321 + (((tickAnim - 153) / 12) * (0.32186-(-2.4321)));
            zz = -8.07887 + (((tickAnim - 153) / 12) * (-4.77615-(-8.07887)));
        }
        else if (tickAnim >= 165 && tickAnim < 178) {
            xx = -2.48283 + (((tickAnim - 165) / 13) * (0.02206-(-2.48283)));
            yy = 0.32186 + (((tickAnim - 165) / 13) * (3.07583-(0.32186)));
            zz = -4.77615 + (((tickAnim - 165) / 13) * (-1.47343-(-4.77615)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 0.02206 + (((tickAnim - 178) / 22) * (0-(0.02206)));
            yy = 3.07583 + (((tickAnim - 178) / 22) * (0-(3.07583)));
            zz = -1.47343 + (((tickAnim - 178) / 22) * (0-(-1.47343)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-4.74705-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (6.87296-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-10.62886-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = -4.74705 + (((tickAnim - 9) / 17) * (-10.32047-(-4.74705)));
            yy = 6.87296 + (((tickAnim - 9) / 17) * (9.69986-(6.87296)));
            zz = -10.62886 + (((tickAnim - 9) / 17) * (-3.2516-(-10.62886)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -10.32047 + (((tickAnim - 26) / 8) * (0.13475-(-10.32047)));
            yy = 9.69986 + (((tickAnim - 26) / 8) * (10.24604-(9.69986)));
            zz = -3.2516 + (((tickAnim - 26) / 8) * (5.05813-(-3.2516)));
        }
        else if (tickAnim >= 34 && tickAnim < 48) {
            xx = 0.13475 + (((tickAnim - 34) / 14) * (-15.09163-(0.13475)));
            yy = 10.24604 + (((tickAnim - 34) / 14) * (10.97427-(10.24604)));
            zz = 5.05813 + (((tickAnim - 34) / 14) * (16.13776-(5.05813)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = -15.09163 + (((tickAnim - 48) / 10) * (-20.09163-(-15.09163)));
            yy = 10.97427 + (((tickAnim - 48) / 10) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 48) / 10) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 58 && tickAnim < 74) {
            xx = -20.09163 + (((tickAnim - 58) / 16) * (-21.7583-(-20.09163)));
            yy = 10.97427 + (((tickAnim - 58) / 16) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 58) / 16) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = -21.7583 + (((tickAnim - 74) / 9) * (-15.09163-(-21.7583)));
            yy = 10.97427 + (((tickAnim - 74) / 9) * (10.97427-(10.97427)));
            zz = 16.13776 + (((tickAnim - 74) / 9) * (16.13776-(16.13776)));
        }
        else if (tickAnim >= 83 && tickAnim < 131) {
            xx = -15.09163 + (((tickAnim - 83) / 48) * (0.7579-(-15.09163)));
            yy = 10.97427 + (((tickAnim - 83) / 48) * (-6.85846-(10.97427)));
            zz = 16.13776 + (((tickAnim - 83) / 48) * (-3.25679-(16.13776)));
        }
        else if (tickAnim >= 131 && tickAnim < 153) {
            xx = 0.7579 + (((tickAnim - 131) / 22) * (8.09442-(0.7579)));
            yy = -6.85846 + (((tickAnim - 131) / 22) * (-1.19703-(-6.85846)));
            zz = -3.25679 + (((tickAnim - 131) / 22) * (-3.42315-(-3.25679)));
        }
        else if (tickAnim >= 153 && tickAnim < 164) {
            xx = 8.09442 + (((tickAnim - 153) / 11) * (-11.19105-(8.09442)));
            yy = -1.19703 + (((tickAnim - 153) / 11) * (12.14022-(-1.19703)));
            zz = -3.42315 + (((tickAnim - 153) / 11) * (-1.68796-(-3.42315)));
        }
        else if (tickAnim >= 164 && tickAnim < 178) {
            xx = -11.19105 + (((tickAnim - 164) / 14) * (8.09442-(-11.19105)));
            yy = 12.14022 + (((tickAnim - 164) / 14) * (-1.19703-(12.14022)));
            zz = -1.68796 + (((tickAnim - 164) / 14) * (-3.42315-(-1.68796)));
        }
        else if (tickAnim >= 178 && tickAnim < 200) {
            xx = 8.09442 + (((tickAnim - 178) / 22) * (0-(8.09442)));
            yy = -1.19703 + (((tickAnim - 178) / 22) * (0-(-1.19703)));
            zz = -3.42315 + (((tickAnim - 178) / 22) * (0-(-3.42315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 66) {
            xx = 17.5 + (((tickAnim - 58) / 8) * (0-(17.5)));
            yy = 0 + (((tickAnim - 58) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 8) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 66) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 66) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 8) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 83) {
            xx = 17.5 + (((tickAnim - 74) / 9) * (0-(17.5)));
            yy = 0 + (((tickAnim - 74) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 9) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 83) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 70) * (0-(0)));
        }
        else if (tickAnim >= 153 && tickAnim < 161) {
            xx = 0 + (((tickAnim - 153) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 153) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 153) / 8) * (0-(0)));
        }
        else if (tickAnim >= 161 && tickAnim < 169) {
            xx = 17.5 + (((tickAnim - 161) / 8) * (0-(17.5)));
            yy = 0 + (((tickAnim - 161) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 161) / 8) * (0-(0)));
        }
        else if (tickAnim >= 169 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 169) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 169) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 169) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animTail(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 20) / 15) * (2.5-(-5)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.5 + (((tickAnim - 35) / 15) * (5-(2.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 50) / 13) * (0-(0)));
            yy = 5 + (((tickAnim - 50) / 13) * (0.28-(5)));
            zz = 0 + (((tickAnim - 50) / 13) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 0.28 + (((tickAnim - 63) / 17) * (0-(0.28)));
            zz = 0 + (((tickAnim - 63) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = -7.5 + (((tickAnim - 20) / 18) * (3.75-(-7.5)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 3.75 + (((tickAnim - 38) / 12) * (7.5-(3.75)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            yy = 7.5 + (((tickAnim - 50) / 16) * (6.04-(7.5)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 6.04 + (((tickAnim - 66) / 14) * (0-(6.04)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 53) {
            xx = -2.5 + (((tickAnim - 22) / 31) * (2.5-(-2.5)));
            yy = -7.5 + (((tickAnim - 22) / 31) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 31) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 53) / 27) * (0-(2.5)));
            yy = 7.5 + (((tickAnim - 53) / 27) * (0-(7.5)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -5 + (((tickAnim - 22) / 33) * (5-(-5)));
            yy = -7.5 + (((tickAnim - 22) / 33) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 55) / 25) * (0-(5)));
            yy = 7.5 + (((tickAnim - 55) / 25) * (0-(7.5)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 57) {
            xx = -5 + (((tickAnim - 23) / 34) * (5-(-5)));
            yy = -7.5 + (((tickAnim - 23) / 34) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 23) / 34) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 57) / 23) * (0-(5)));
            yy = 7.5 + (((tickAnim - 57) / 23) * (0-(7.5)));
            zz = 0 + (((tickAnim - 57) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 59) {
            xx = -5 + (((tickAnim - 26) / 33) * (10-(-5)));
            yy = -7.5 + (((tickAnim - 26) / 33) * (7.5-(-7.5)));
            zz = 0 + (((tickAnim - 26) / 33) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 59) / 21) * (0-(10)));
            yy = 7.5 + (((tickAnim - 59) / 21) * (0-(7.5)));
            zz = 0 + (((tickAnim - 59) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 28) / 33) * (0-(0)));
            yy = -10 + (((tickAnim - 28) / 33) * (10-(-10)));
            zz = 0 + (((tickAnim - 28) / 33) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 61) / 19) * (0-(0)));
            yy = 10 + (((tickAnim - 61) / 19) * (0-(10)));
            zz = 0 + (((tickAnim - 61) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TailClub, TailClub.rotateAngleX + (float) Math.toRadians(xx), TailClub.rotateAngleY + (float) Math.toRadians(yy), TailClub.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 120) {
            xx = 12.5 + (((tickAnim - 40) / 80) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 40) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 80) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 12.5 + (((tickAnim - 120) / 40) * (0-(12.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 127) {
            xx = 10 + (((tickAnim - 47) / 80) * (10-(10)));
            yy = 0 + (((tickAnim - 47) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 80) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 160) {
            xx = 10 + (((tickAnim - 127) / 33) * (0-(10)));
            yy = 0 + (((tickAnim - 127) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 90) {
            xx = 10 + (((tickAnim - 51) / 39) * (7.5-(10)));
            yy = 0 + (((tickAnim - 51) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 39) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 131) {
            xx = 7.5 + (((tickAnim - 90) / 41) * (10-(7.5)));
            yy = 0 + (((tickAnim - 90) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 41) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 160) {
            xx = 10 + (((tickAnim - 131) / 29) * (0-(10)));
            yy = 0 + (((tickAnim - 131) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 103) {
            xx = 7.5 + (((tickAnim - 54) / 49) * (5-(7.5)));
            yy = 0 + (((tickAnim - 54) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 49) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 5 + (((tickAnim - 103) / 31) * (7.5-(5)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 160) {
            xx = 7.5 + (((tickAnim - 134) / 26) * (0-(7.5)));
            yy = 0 + (((tickAnim - 134) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 0) / 58) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 58) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 58) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 106) {
            xx = 5 + (((tickAnim - 58) / 48) * (0-(5)));
            yy = 0 + (((tickAnim - 58) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 48) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 138) {
            xx = 0 + (((tickAnim - 106) / 32) * (5-(0)));
            yy = 0 + (((tickAnim - 106) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 32) * (0-(0)));
        }
        else if (tickAnim >= 138 && tickAnim < 160) {
            xx = 5 + (((tickAnim - 138) / 22) * (0-(5)));
            yy = 0 + (((tickAnim - 138) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 138) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 0) / 62) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 62) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 109) {
            xx = 2.5 + (((tickAnim - 62) / 47) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 62) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 47) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 142) {
            xx = -5 + (((tickAnim - 109) / 33) * (2.5-(-5)));
            yy = 0 + (((tickAnim - 109) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 33) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 160) {
            xx = 2.5 + (((tickAnim - 142) / 18) * (0-(2.5)));
            yy = 0 + (((tickAnim - 142) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 0) / 65) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 65) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 118) {
            xx = 7.5 + (((tickAnim - 65) / 53) * (-2.5-(7.5)));
            yy = 0 + (((tickAnim - 65) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 53) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 145) {
            xx = -2.5 + (((tickAnim - 118) / 27) * (7.5-(-2.5)));
            yy = 0 + (((tickAnim - 118) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 27) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 160) {
            xx = 7.5 + (((tickAnim - 145) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 145) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(xx), neck7.rotateAngleY + (float) Math.toRadians(yy), neck7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 125) {
            xx = 5 + (((tickAnim - 68) / 57) * (-5-(5)));
            yy = 0 + (((tickAnim - 68) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 57) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 148) {
            xx = -5 + (((tickAnim - 125) / 23) * (5-(-5)));
            yy = 0 + (((tickAnim - 125) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 23) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 160) {
            xx = 5 + (((tickAnim - 148) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 148) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(xx), neck8.rotateAngleY + (float) Math.toRadians(yy), neck8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 0) / 72) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 72) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 133) {
            xx = 7.5 + (((tickAnim - 72) / 61) * (-15-(7.5)));
            yy = 0 + (((tickAnim - 72) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 61) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 152) {
            xx = -15 + (((tickAnim - 133) / 19) * (7.5-(-15)));
            yy = 0 + (((tickAnim - 133) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 19) * (0-(0)));
        }
        else if (tickAnim >= 152 && tickAnim < 160) {
            xx = 7.5 + (((tickAnim - 152) / 8) * (0-(7.5)));
            yy = 0 + (((tickAnim - 152) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 152) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 8) / 10) * (-10-(-4)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 16 + (((tickAnim - 8) / 4) * (28-(16)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 28 + (((tickAnim - 12) / 6) * (38-(28)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 38 + (((tickAnim - 18) / 15) * (38-(38)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 33) / 17) * (0-(38)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -9 + (((tickAnim - 8) / 4) * (-15-(-9)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -15 + (((tickAnim - 12) / 6) * (-19-(-15)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -19 + (((tickAnim - 18) / 15) * (-19-(-19)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 33) / 17) * (0-(-19)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -9 + (((tickAnim - 18) / 15) * (-9-(-9)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -9 + (((tickAnim - 33) / 17) * (0-(-9)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            zz = 2.5 + (((tickAnim - 33) / 17) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 10 + (((tickAnim - 18) / 15) * (10-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 33) / 17) * (0-(10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (17-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 33) / 17) * (0-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (17-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 33) / 17) * (0-(17)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 8) / 5) * (13-(13)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 13 + (((tickAnim - 13) / 20) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 20) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 33) / 8) * (0-(13)));
            yy = 0 + (((tickAnim - 33) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 8) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -17.5 + (((tickAnim - 7) / 4) * (3-(-17.5)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 11) / 22) * (3-(3)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3 + (((tickAnim - 33) / 4) * (-20-(3)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -20 + (((tickAnim - 37) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (37-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 37 + (((tickAnim - 7) / 4) * (-8-(37)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 33) {
            xx = -8 + (((tickAnim - 11) / 22) * (-8-(-8)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -8 + (((tickAnim - 33) / 4) * (45.33-(-8)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 45.33 + (((tickAnim - 37) / 4) * (0-(45.33)));
            yy = 0 + (((tickAnim - 37) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (13-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = 13 + (((tickAnim - 13) / 28) * (13-(13)));
            yy = 0 + (((tickAnim - 13) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 28) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 13 + (((tickAnim - 41) / 9) * (0-(13)));
            yy = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (-24-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -24 + (((tickAnim - 13) / 5) * (3-(-24)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = 3 + (((tickAnim - 18) / 23) * (3-(3)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 3 + (((tickAnim - 41) / 5) * (-20.33-(3)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -20.33 + (((tickAnim - 46) / 4) * (0-(-20.33)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 8) / 5) * (35-(14)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35 + (((tickAnim - 13) / 5) * (-8-(35)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 41) {
            xx = -8 + (((tickAnim - 18) / 23) * (-8-(-8)));
            yy = 0 + (((tickAnim - 18) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 23) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = -8 + (((tickAnim - 41) / 5) * (41.22-(-8)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 41.22 + (((tickAnim - 46) / 4) * (0-(41.22)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 31) {
            xx = 12.5 + (((tickAnim - 20) / 11) * (15-(12.5)));
            yy = 0 + (((tickAnim - 20) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 11) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 31) / 7) * (12.5-(15)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 38) / 12) * (0-(12.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (16.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 16.5 + (((tickAnim - 25) / 13) * (1.95-(16.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.95 + (((tickAnim - 38) / 12) * (0-(1.95)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 38) / 12) * (0-(22.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -0.25 + (((tickAnim - 25) / 13) * (0.7-(-0.25)));
            zz = 0 + (((tickAnim - 25) / 13) * (-0.375-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.7 + (((tickAnim - 38) / 12) * (0-(0.7)));
            zz = -0.375 + (((tickAnim - 38) / 12) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 6.25 + (((tickAnim - 25) / 13) * (9.17-(6.25)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 9.17 + (((tickAnim - 38) / 12) * (0-(9.17)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.925-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = -0.925 + (((tickAnim - 25) / 13) * (1.725-(-0.925)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.725 + (((tickAnim - 38) / 12) * (0-(1.725)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -22.75 + (((tickAnim - 25) / 13) * (0-(-22.75)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1 + (((tickAnim - 20) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            zz = 2.5 + (((tickAnim - 20) / 100) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3 + (((tickAnim - 20) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3)));
            yy = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 86) / 34) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 86) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 120) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8 + (((tickAnim - 33) / 87) * (0-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8)));
            yy = 0 + (((tickAnim - 33) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 87) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 5.25 + (((tickAnim - 30) / 23) * (20.95-(5.25)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 88) {
            xx = 20.95 + (((tickAnim - 53) / 35) * (0-(20.95)));
            yy = 0 + (((tickAnim - 53) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 35) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 88) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 26) {
            xx = -4 + (((tickAnim - 0) / 26) * (8.25-(-4)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 26) / 7) * (-3.5-(8.25)));
            yy = 0 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 33) / 5) * (-8-(-3.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 33) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 38) / 12) * (-4-(-8)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = -0.3 + (((tickAnim - 0) / 26) * (-3.15-(-0.3)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -3.15 + (((tickAnim - 26) / 7) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-3.15)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 33) / 5) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 4.75 + (((tickAnim - 0) / 26) * (17-(4.75)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 17 + (((tickAnim - 26) / 6) * (11.05-(17)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 11.05 + (((tickAnim - 32) / 6) * (1.25-(11.05)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 38) / 12) * (4.75-(1.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.88-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -13.88 + (((tickAnim - 18) / 8) * (-4.25-(-13.88)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -4.25 + (((tickAnim - 26) / 6) * (14.02-(-4.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 14.02 + (((tickAnim - 32) / 5) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -0.37 + (((tickAnim - 37) / 1) * (6.75-(-0.37)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 38) / 12) * (0-(6.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (1.53-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-0.1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 1.53 + (((tickAnim - 26) / 2) * (1.78-(1.53)));
            zz = -0.1 + (((tickAnim - 26) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.78 + (((tickAnim - 28) / 4) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 2.205 + (((tickAnim - 32) / 6) * (0-(2.205)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
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
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -19.5 + (((tickAnim - 26) / 6) * (4.36-(-19.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 4.36 + (((tickAnim - 32) / 2) * (2-(4.36)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 2 + (((tickAnim - 34) / 3) * (-8.25-(2)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -8.25 + (((tickAnim - 37) / 1) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
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
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0.425-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0.425 + (((tickAnim - 32) / 5) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 0) / 8) * (-3.5-(8.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 8) / 7) * (-8-(-3.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 8) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 15) / 35) * (8.25-(-8)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -2.15 + (((tickAnim - 0) / 8) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-2.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 8) / 7) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 15) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 13) * (-0.82-(0)));
            zz = 0 + (((tickAnim - 15) / 13) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 28) / 13) * (0-(0)));
            yy = -0.82 + (((tickAnim - 28) / 13) * (-2.59-(-0.82)));
            zz = 0 + (((tickAnim - 28) / 13) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 41) / 9) * (0-(0)));
            yy = -2.59 + (((tickAnim - 41) / 9) * (-2.15-(-2.59)));
            zz = 0 + (((tickAnim - 41) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 0) / 8) * (11.05-(17.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.05 + (((tickAnim - 8) / 7) * (1.25-(11.05)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 1.25 + (((tickAnim - 15) / 27) * (14.15-(1.25)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.15 + (((tickAnim - 42) / 8) * (17.5-(14.15)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.25 + (((tickAnim - 0) / 8) * (14.02-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.02 + (((tickAnim - 8) / 5) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.37 + (((tickAnim - 13) / 2) * (6.75-(-0.37)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 6.75 + (((tickAnim - 15) / 27) * (-19.27-(6.75)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -19.27 + (((tickAnim - 42) / 8) * (-0.25-(-19.27)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 5) * (1.78-(0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.78 + (((tickAnim - 5) / 3) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.205 + (((tickAnim - 8) / 7) * (0-(2.205)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 27) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -0.07 + (((tickAnim - 42) / 8) * (0.125-(-0.07)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -20.25 + (((tickAnim - 0) / 8) * (4.36-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 4.36 + (((tickAnim - 8) / 1) * (2-(4.36)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 9) / 3) * (-8.25-(2)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 12) / 3) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.425 + (((tickAnim - 8) / 4) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-150))*0.215), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), hips.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.259), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-120))*-1.8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*1.4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*5.8), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-4.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/1.5-30))*15), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*9), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5.85));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-150))*0.45), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5+115))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.8), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-1.9));



        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -17.25 + (((tickAnim - 0) / 34) * (21.7-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 21.7 + (((tickAnim - 34) / 9) * (3.08-(21.7)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.08 + (((tickAnim - 43) / 7) * (-17.25-(3.08)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = -2.15 + (((tickAnim - 0) / 34) * (-2.67-(-2.15)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = -2.67 + (((tickAnim - 34) / 9) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 43) / 7) * (-2.15-(0.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 10.25 + (((tickAnim - 0) / 43) * (-19.16-(10.25)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -19.16 + (((tickAnim - 43) / 7) * (10.25-(-19.16)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 7.25 + (((tickAnim - 0) / 27) * (-3.93-(7.25)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -3.93 + (((tickAnim - 27) / 7) * (-0.85-(-3.93)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -0.85 + (((tickAnim - 34) / 9) * (38.68-(-0.85)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 38.68 + (((tickAnim - 43) / 3) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -1.96 + (((tickAnim - 46) / 4) * (7.25-(-1.96)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0.35 + (((tickAnim - 34) / 9) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 43) / 3) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -0.215 + (((tickAnim - 46) / 4) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 0) / 13) * (21.7-(6.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 21.7 + (((tickAnim - 13) / 9) * (3.08-(21.7)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 3.08 + (((tickAnim - 22) / 6) * (-16.5-(3.08)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -16.5 + (((tickAnim - 28) / 22) * (6.75-(-16.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.725 + (((tickAnim - 0) / 13) * (-2.67-(-1.725)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -2.67 + (((tickAnim - 13) / 9) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 22) / 6) * (-2.175-(0.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -2.175 + (((tickAnim - 28) / 22) * (-1.725-(-2.175)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-19.16-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -19.16 + (((tickAnim - 22) / 6) * (10.75-(-19.16)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 28) / 22) * (0-(10.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 0) / 13) * (-0.85-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -0.85 + (((tickAnim - 13) / 8) * (38.68-(-0.85)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 38.68 + (((tickAnim - 21) / 4) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -1.96 + (((tickAnim - 25) / 3) * (7.25-(-1.96)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 28) / 22) * (-4.5-(7.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 13) * (0.35-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 8) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 21) / 4) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 25) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.2), neck.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-0.3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*0.6));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck5.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-1.4));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.259), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMamenchisaurus entity = (EntityPrehistoricFloraMamenchisaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 0) / 16) * (19-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19 + (((tickAnim - 16) / 3) * (-6.75-(19)));
            yy = 0 + (((tickAnim - 16) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -6.75 + (((tickAnim - 19) / 4) * (-21.25-(-6.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -21.25 + (((tickAnim - 23) / 7) * (-8.25-(-21.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 16) * (-3.125-(-0.125)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -3.125 + (((tickAnim - 16) / 3) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-3.125)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 19) / 11) * (-0.125-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 3.75 + (((tickAnim - 0) / 16) * (16.25-(3.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 16.25 + (((tickAnim - 16) / 3) * (11.05-(16.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 11.05 + (((tickAnim - 19) / 4) * (2.25-(11.05)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 23) / 7) * (3.75-(2.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 5.5 + (((tickAnim - 0) / 11) * (-18.63-(5.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -18.63 + (((tickAnim - 11) / 5) * (-4.25-(-18.63)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -4.25 + (((tickAnim - 16) / 3) * (14.02-(-4.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 14.02 + (((tickAnim - 19) / 4) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -0.37 + (((tickAnim - 23) / 0) * (18.5-(-0.37)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 23) / 7) * (5.5-(18.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (1.53-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 1.53 + (((tickAnim - 16) / 1) * (1.78-(1.53)));
            zz = -0.1 + (((tickAnim - 16) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 17) / 2) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 2.205 + (((tickAnim - 19) / 4) * (0-(2.205)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.25 + (((tickAnim - 18) / 3) * (4.36-(-10.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 4.36 + (((tickAnim - 21) / 2) * (-10-(4.36)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 23) / 0) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0.425 + (((tickAnim - 21) / 2) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 0) / 5) * (-11.75-(14)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -11.75 + (((tickAnim - 5) / 4) * (-22.25-(-11.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 5) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = -22.25 + (((tickAnim - 9) / 21) * (14-(-22.25)));
            yy = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -3.975 + (((tickAnim - 0) / 5) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-3.975)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 5) / 10) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 5) / 10) * (-0.5-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 5) / 10) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = -0.5 + (((tickAnim - 15) / 8) * (-2.3-(-0.5)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -2.3 + (((tickAnim - 23) / 7) * (-3.975-(-2.3)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.25 + (((tickAnim - 0) / 5) * (11.05-(29.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 11.05 + (((tickAnim - 5) / 4) * (3.5-(11.05)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 3.5 + (((tickAnim - 9) / 17) * (14.15-(3.5)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 14.15 + (((tickAnim - 26) / 4) * (29.25-(14.15)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (14.02-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.02 + (((tickAnim - 5) / 3) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.37 + (((tickAnim - 8) / 1) * (18.5-(-0.37)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 18.5 + (((tickAnim - 9) / 17) * (-19.27-(18.5)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -19.27 + (((tickAnim - 26) / 4) * (-0.25-(-19.27)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (1.78-(0.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 3) / 2) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 2.205 + (((tickAnim - 5) / 4) * (0-(2.205)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 17) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 26) / 4) * (0.125-(-0.07)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -20.25 + (((tickAnim - 0) / 6) * (9.36-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.36 + (((tickAnim - 6) / 2) * (-7.75-(9.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7.75 + (((tickAnim - 8) / 1) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 1.1 + (((tickAnim - 6) / 3) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*0.895), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.9), hips.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.369);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.8), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.6), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1.4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5.8), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-30))*15), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*9), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5.85));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+115))*1.3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.598), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.8));



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -22 + (((tickAnim - 0) / 21) * (24.95-(-22)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 24.95 + (((tickAnim - 21) / 4) * (3.08-(24.95)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.08 + (((tickAnim - 25) / 5) * (-22-(3.08)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -2.15 + (((tickAnim - 0) / 2) * (-2.595-(-2.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -2.595 + (((tickAnim - 2) / 1) * (-2.15-(-2.595)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -2.15 + (((tickAnim - 3) / 2) * (-1.595-(-2.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -1.595 + (((tickAnim - 5) / 2) * (-1.15-(-1.595)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = -1.15 + (((tickAnim - 7) / 14) * (-2.67-(-1.15)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -2.67 + (((tickAnim - 21) / 4) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 5) * (-2.15-(0.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 3.75 + (((tickAnim - 0) / 21) * (-10.76-(3.75)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -10.76 + (((tickAnim - 21) / 4) * (-28.66-(-10.76)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -28.66 + (((tickAnim - 25) / 5) * (3.75-(-28.66)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 18 + (((tickAnim - 0) / 17) * (-3.93-(18)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -3.93 + (((tickAnim - 17) / 4) * (1.15-(-3.93)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.15 + (((tickAnim - 21) / 4) * (38.68-(1.15)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 38.68 + (((tickAnim - 25) / 2) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -1.96 + (((tickAnim - 27) / 3) * (18-(-1.96)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 21) / 4) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 25) / 2) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 27) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 0) / 8) * (32.7-(5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 32.7 + (((tickAnim - 8) / 5) * (3.08-(32.7)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.08 + (((tickAnim - 13) / 5) * (-23.25-(3.08)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -23.25 + (((tickAnim - 18) / 12) * (5-(-23.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.725 + (((tickAnim - 0) / 8) * (-3.295-(-1.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -3.295 + (((tickAnim - 8) / 5) * (2-(-3.295)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 5) * (-2.15-(2)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -2.15 + (((tickAnim - 18) / 1) * (-2.595-(-2.15)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -2.595 + (((tickAnim - 19) / 2) * (-2.15-(-2.595)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -2.15 + (((tickAnim - 21) / 2) * (-1.595-(-2.15)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -1.595 + (((tickAnim - 23) / 1) * (-1.15-(-1.595)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -1.15 + (((tickAnim - 24) / 6) * (-1.725-(-1.15)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 0) / 8) * (-16.33-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -16.33 + (((tickAnim - 8) / 4) * (-26.16-(-16.33)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -26.16 + (((tickAnim - 12) / 6) * (10.25-(-26.16)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 18) / 12) * (-1.5-(10.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 0) / 8) * (-13.85-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -13.85 + (((tickAnim - 8) / 4) * (38.68-(-13.85)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 38.68 + (((tickAnim - 12) / 3) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.96 + (((tickAnim - 15) / 3) * (14-(-1.96)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 14 + (((tickAnim - 18) / 12) * (-4.5-(14)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 8) * (0.35-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 4) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 12) / 3) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 15) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.5), neck.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(1.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.6), neck2.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.4), neck3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.8));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.5), neck4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.285), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.8), neck5.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.4));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.285), neck6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.8), neck6.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.4));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (9.75-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 7) / 6) * (6.75-(9.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.75 + (((tickAnim - 13) / 5) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 6.75 + (((tickAnim - 18) / 6) * (12.25-(6.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 12.25 + (((tickAnim - 24) / 6) * (6.75-(12.25)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck7, neck7.rotateAngleX + (float) Math.toRadians(8.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.285), neck7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.8), neck7.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.4));


        this.setRotateAngle(neck8, neck8.rotateAngleX + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.285), neck8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.8), neck8.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.4));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMamenchisaurus e = (EntityPrehistoricFloraMamenchisaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
