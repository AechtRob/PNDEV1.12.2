package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachiosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBrachiosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neck7;
    private final AdvancedModelRenderer neck8;
    private final AdvancedModelRenderer neck9;
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer moveableFlesh;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r42;

    private ModelAnimator animator;

    public ModelBrachiosaurus() {
        this.textureWidth = 368;
        this.textureHeight = 368;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(-0.5F, -47.05F, 37.0F);
        this.root.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 19.0F, 6.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 150, -16.5F, -35.9664F, -28.1857F, 34, 35, 19, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 222, 109, -14.5F, -20.25F, -9.0F, 30, 37, 12, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -14.0111F, -2.4302F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4712F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 91, 214, -12.5F, -9.3232F, -6.2257F, 26, 22, 20, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-15.0F, -8.25F, 0.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.3054F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 71, 257, -5.5F, -6.5855F, -7.7696F, 12, 37, 20, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 30.4145F, -2.7696F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5672F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 122, 306, -4.5F, -4.0F, -2.0F, 10, 29, 14, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 22.0F, 3.5F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.2618F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 212, 56, -6.0F, 0.0F, -7.0F, 13, 7, 16, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.rightFoot.addChild(rightToes);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -3.5F, -2.0F);
        this.rightToes.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 184, 127, -6.2F, -3.5F, -0.5F, 11, 7, 4, -0.003F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(16.0F, -8.25F, 0.0F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.3054F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 71, 257, -6.5F, -6.5855F, -7.7696F, 12, 37, 20, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 30.4145F, -2.7696F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5672F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 122, 306, -5.5F, -4.0F, -2.0F, 10, 29, 14, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 22.0F, 3.5F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.2618F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 212, 56, -7.0F, 0.0F, -7.0F, 13, 7, 16, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, 7.0F, -7.0F);
        this.leftFoot.addChild(leftToes);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -3.5F, -2.0F);
        this.leftToes.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3054F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 184, 127, -4.8F, -3.5F, -0.5F, 11, 7, 4, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.5F, -13.75F, 8.5F);
        this.hips.addChild(tail);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 25.0F, 6.0F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 261, 159, -10.5F, -26.15F, -13.025F, 23, 15, 18, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 25.0F, 6.0F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 125, 0, -9.0F, -14.75F, -12.75F, 20, 15, 23, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 4.95F, 12.075F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.3054F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 297, 0, -9.0F, -5.1495F, -1.4949F, 18, 20, 15, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2495F, 12.5051F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.3054F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 246, 258, -7.0F, -4.9668F, -0.5018F, 14, 16, 23, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.4668F, 20.4982F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 248, 298, -5.0F, -3.7836F, -0.0275F, 10, 12, 22, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.7836F, 19.8725F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 307, 36, -3.5F, -2.1353F, 0.0681F, 7, 7, 22, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.3647F, 20.2681F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.1309F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 298, 252, -2.0F, -1.7651F, -0.2154F, 4, 4, 22, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.0151F, 21.7846F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0436F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 94, 93, -1.0F, -1.0F, -2.0F, 2, 2, 16, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.0015F, 13.9578F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.0873F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 184, 109, -0.5F, -0.4985F, -0.9578F, 1, 1, 16, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -14.5F, -3.5F);
        this.hips.addChild(body);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -30.6897F, -28.0791F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 89, 112, -14.0F, -4.0957F, -2.6151F, 28, 16, 38, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 10.0F, -22.0F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -19.5F, -24.225F, -30.45F, 40, 44, 44, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -20.5F, -26.2F);
        this.body.addChild(chest);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -28.1F, -19.25F);
        this.chest.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 184, 232, -11.0F, -5.7158F, 5.0456F, 23, 29, 19, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 20.9F, -52.25F);
        this.chest.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 89, -14.5F, -34.2615F, -0.5308F, 30, 27, 33, 0.004F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 20.9F, -52.25F);
        this.chest.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.8508F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 107, 167, -13.5F, -22.6821F, -4.4375F, 28, 17, 29, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.5F, -14.2815F, -26.0953F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -1.0908F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 13.9733F, -30.6914F);
        this.neck.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0524F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 128, 48, -10.0F, -17.5F, -0.1F, 21, 19, 41, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 16.9733F, 14.2086F);
        this.neck.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 191, 183, -9.0F, -37.1F, -42.075F, 19, 17, 31, 0.003F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -1.0267F, -29.7914F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0436F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 205, -9.0F, -14.8198F, -22.0595F, 18, 31, 27, -0.005F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.2198F, -22.0595F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.2618F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 212, 0, -8.0F, -13.9003F, -20.9397F, 16, 29, 26, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.5997F, -20.9397F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, -0.1309F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 253, 56, -7.0F, -13.5F, -22.0F, 14, 26, 25, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -1.5F, -22.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.0436F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 136, 258, -6.0F, -11.1933F, -20.4282F, 12, 24, 23, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.3933F, -20.4282F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.2182F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 0, 264, -5.5F, -10.1895F, -19.341F, 11, 21, 22, 0.0F, false));

        this.neck7 = new AdvancedModelRenderer(this);
        this.neck7.setRotationPoint(0.0F, 0.8105F, -19.591F);
        this.neck6.addChild(neck7);
        this.setRotateAngle(neck7, 0.1745F, 0.0F, 0.0F);
        this.neck7.cubeList.add(new ModelBox(neck7, 270, 210, -5.0F, -10.1256F, -15.8465F, 10, 19, 22, 0.0F, false));

        this.neck8 = new AdvancedModelRenderer(this);
        this.neck8.setRotationPoint(0.0F, 0.2244F, -15.8965F);
        this.neck7.addChild(neck8);
        this.setRotateAngle(neck8, 0.3927F, 0.0F, 0.0F);
        this.neck8.cubeList.add(new ModelBox(neck8, 302, 279, -4.5F, -8.916F, -15.016F, 9, 15, 19, 0.0F, false));

        this.neck9 = new AdvancedModelRenderer(this);
        this.neck9.setRotationPoint(0.0F, -6.6F, -15.05F);
        this.neck8.addChild(neck9);
        this.setRotateAngle(neck9, 0.3927F, 0.0F, 0.0F);
        this.neck9.cubeList.add(new ModelBox(neck9, 0, 89, -3.5F, -2.0F, -8.2F, 7, 9, 9, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.09F, -6.7625F);
        this.neck9.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 8.1266F, -9.7153F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.1345F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 121, 167, -3.0F, -2.9174F, -0.5327F, 6, 3, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 8.1266F, -9.7153F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.2305F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 193, 173, -2.5F, 0.4146F, -1.5412F, 5, 3, 2, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.7346F, -0.601F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.8727F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 189, 10, -3.0F, 6.7323F, -2.1131F, 6, 5, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -0.7346F, -0.601F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 189, 0, -3.0F, 2.3044F, -4.534F, 6, 6, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 4.862F, -10.8076F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5498F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 94, 98, -2.0F, -2.6109F, -0.3166F, 4, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.7358F, -9.9845F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0785F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 94, 89, -2.0F, -0.1132F, 0.0209F, 4, 5, 3, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -0.1258F, -7.3915F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -1.0297F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 169, 39, -2.0F, -1.2F, -1.95F, 4, 3, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, -1.4196F, -5.8558F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -1.7366F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 184, 109, -2.0F, -1.35F, -0.7F, 4, 3, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, -1.9346F, -3.201F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1134F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 125, 15, -3.0F, -0.0485F, -1.7481F, 6, 2, 4, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.4346F, -0.201F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.925F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 0, -2.0F, 11.244F, -2.331F, 4, 4, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, 8.9427F, -13.1375F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -1.1694F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 155, 39, -3.0F, -2.8758F, -0.2285F, 6, 3, 1, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.4346F, -0.201F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -1.3439F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 193, 167, -3.0F, 11.8502F, 4.0418F, 6, 3, 2, 0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 8.1151F, -10.7613F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.2305F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 107, 179, -3.5F, -11.2582F, -0.4032F, 7, 11, 1, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -0.4346F, -0.201F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -1.2217F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 125, 0, -3.5F, 1.5914F, 1.569F, 7, 11, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 1.2053F, -1.9367F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.3788F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 108, -4.0F, -1.5261F, -3.279F, 8, 5, 8, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 5.8886F, -0.1831F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -1.4224F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 9.8102F, 3.2905F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.096F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 150, -3.5F, -9.6819F, -2.001F, 7, 10, 2, -0.01F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 4.7102F, 0.2905F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.3665F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 184, 139, -3.5F, -1.3919F, -1.2232F, 7, 7, 2, -0.02F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 4.7102F, 0.2905F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.2618F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 188, 39, -3.5F, -1.2958F, -1.1834F, 7, 7, 1, -0.04F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 9.438F, 0.6723F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2618F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 140, 39, -3.0F, -2.5848F, -0.4264F, 6, 3, 1, -0.03F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 9.438F, 0.6723F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.4363F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 184, 116, -2.5F, 0.3716F, -0.4868F, 5, 3, 2, -0.01F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 12.6575F, 2.6476F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.4276F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 125, 39, -3.0F, -2.8294F, -0.9305F, 6, 3, 1, -0.02F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 4.4602F, -0.3595F);
        this.jaw.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.5236F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 163, -3.0F, 5.7733F, -1.5971F, 6, 3, 2, -0.01F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 4.2547F, -0.1827F);
        this.jaw.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.3054F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 94, 112, -3.0F, -1.5499F, -2.6551F, 6, 3, 4, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.0547F, 0.9173F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.3054F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 34, -4.0F, -2.55F, -1.95F, 8, 5, 3, -0.01F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.0F, 8.8557F, 2.3581F);
        this.jaw.addChild(throat1);
        this.setRotateAngle(throat1, 0.2531F, 0.0F, 0.0F);


        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, -13.7322F, -4.3911F);
        this.throat1.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 1.1519F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 23, 34, -2.0F, 8.25F, -10.8F, 4, 2, 6, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, -13.7322F, -4.3911F);
        this.throat1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.7592F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 107, 167, -2.0F, 5.75F, -1.55F, 4, 6, 5, 0.01F, false));

        this.moveableFlesh = new AdvancedModelRenderer(this);
        this.moveableFlesh.setRotationPoint(-1.0F, -7.5489F, 25.025F);
        this.jaw.addChild(moveableFlesh);


        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(15.5F, 23.5F, -31.8F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1309F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 193, 292, -7.0F, -11.0F, -7.0F, 13, 39, 14, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, 28.0F, 3.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.4363F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -4.5F, -1.0F, -8.5F, 9, 22, 11, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(1.0F, 19.0F, -3.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.3054F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 64, 205, -6.0F, -1.0F, -5.0F, 10, 15, 9, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-8.0F, 8.0F, 1.0F);
        this.leftHand.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.0F, 0.48F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 0, 1.5F, -2.05F, -4.0F, 2, 7, 2, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-14.5F, 23.5F, -31.8F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.1309F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 193, 292, -6.0F, -11.0F, -7.0F, 13, 39, 14, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, 28.0F, 3.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.4363F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -4.5F, -1.0F, -8.5F, 9, 22, 11, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-1.0F, 19.0F, -3.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.3054F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 64, 205, -4.0F, -1.0F, -5.0F, 10, 15, 9, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(8.0F, 8.0F, 1.0F);
        this.rightHand.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, -0.48F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -3.5F, -2.05F, -4.0F, 2, 7, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {

        this.root.offsetY = -0.175F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.root.offsetY = -0.175F;
        this.root.render(0.01F);
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

        EntityPrehistoricFloraBrachiosaurus diplo = (EntityPrehistoricFloraBrachiosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = diplo.getJuvenile();

        if (isBaby) {
            this.neck8.scaleChildren = true;
            this.neck9.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1.025F, 1.025F, 1.025F);
            this.neck9.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck8.scaleChildren = true;
            this.neck9.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck8.setScale(1F, 1, 1F);
            this.neck9.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.neck7, this.neck8, this.neck9, this.head};
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

                    return;
                }

                if (diplo.getIsFast()) { //Running
                    float speed = masterSpeed / 2F;
                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

                } else { //Walking
                    float speed = masterSpeed / 1.50F;
                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
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
        EntityPrehistoricFloraBrachiosaurus ee = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The leaves grazing anim
            animLook(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animLook(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625))*1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.0287+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-50))*0.5), tail3.rotateAngleY + (float) Math.toRadians(-0.454+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-50))*2), tail3.rotateAngleZ + (float) Math.toRadians(-0.1963+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-50))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-70))*1.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-70))*2), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-70))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(8.8713+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-90))*2.5), tail5.rotateAngleY + (float) Math.toRadians(1.5519+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-90))*2), tail5.rotateAngleZ + (float) Math.toRadians(-0.8816+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-90))*1.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-110))*5), tail6.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-110))*1), tail6.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-110))));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(5.7606+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-130))*5), tail7.rotateAngleY + (float) Math.toRadians(1.9329+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-130))*1), tail7.rotateAngleZ + (float) Math.toRadians(-0.8144+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.625-130))*1));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 19 + (((tickAnim - 17) / 10) * (23.08-(19)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 23.08 + (((tickAnim - 27) / 5) * (3.08-(23.08)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 3.08 + (((tickAnim - 32) / 6) * (-8.92-(3.08)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.92 + (((tickAnim - 38) / 12) * (0-(-8.92)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 13 + (((tickAnim - 17) / 6) * (23-(13)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 23 + (((tickAnim - 23) / 9) * (44-(23)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 44 + (((tickAnim - 32) / 6) * (25-(44)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 38) / 12) * (0-(25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 22 + (((tickAnim - 17) / 8) * (38-(22)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 38 + (((tickAnim - 25) / 7) * (16-(38)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 16 + (((tickAnim - 32) / 6) * (-16-(16)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 38) / 12) * (0-(-16)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
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
            yy = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            zz = 2.5 + (((tickAnim - 18) / 15) * (2.5-(2.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
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

    }

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBrachiosaurus entity = (EntityPrehistoricFloraBrachiosaurus) entitylivingbaseIn;


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBrachiosaurus e = (EntityPrehistoricFloraBrachiosaurus) entity;
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
