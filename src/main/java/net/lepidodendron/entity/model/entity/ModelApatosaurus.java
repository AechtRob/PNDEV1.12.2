package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraApatosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelApatosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tail9;
    private final AdvancedModelRenderer tail10;
    private final AdvancedModelRenderer tail11;
    private final AdvancedModelRenderer tail12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;

    private ModelAnimator animator;

    public ModelApatosaurus() {
        this.textureWidth = 310;
        this.textureHeight = 310;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -27.0F, 10.0F);
        this.setRotateAngle(root, 1.5708F, 0.0F, 0.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 16.0F, 5.0F);
        this.root.addChild(hip);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -16.0F, -5.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -2.0508F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 196, 251, 0.0F, -33.25F, -0.75F, 0, 5, 20, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -16.0F, -5.0F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.3963F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 82, -18.0F, -7.0F, -2.0F, 34, 34, 31, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -16.0F, -5.0F);
        this.hip.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.9635F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 192, 95, -12.0F, -28.25F, -0.75F, 24, 15, 22, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-16.0F, -3.25F, -5.0F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0873F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 181, 153, -6.0F, -7.75F, -28.0F, 12, 19, 34, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, -2.25F, -28.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1745F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 224, 226, -4.5F, -2.5F, -23.0F, 9, 11, 25, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 3.0F, -20.5F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0873F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 113, 13, -5.5F, -5.75F, -3.25F, 11, 12, 5, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, -5.75F, -3.25F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 73, 163, -5.5F, -3.0F, 0.0F, 11, 3, 5, -0.01F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(16.0F, -3.25F, -5.0F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0873F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 181, 153, -6.0F, -7.75F, -28.0F, 12, 19, 34, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, -2.25F, -28.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1745F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 224, 226, -4.5F, -2.5F, -23.0F, 9, 11, 25, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 3.0F, -20.5F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0873F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 113, 13, -5.5F, -5.75F, -3.25F, 11, 12, 5, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, -5.75F, -3.25F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 73, 163, -5.5F, -3.0F, 0.0F, 11, 3, 5, -0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 12.0F, 1.3F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.48F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 148, -10.5F, -6.0F, -20.0F, 21, 27, 30, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 268, 213, 0.0F, -3.0F, 10.0F, 0, 24, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 21.0F, 3.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 79, 187, -8.5F, -3.0F, -18.0F, 17, 30, 24, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 162, 187, 0.0F, 0.0F, 6.0F, 0, 27, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 27.0F, -1.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 236, 32, -6.0F, -3.0F, -10.0F, 12, 30, 16, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 93, 273, 0.0F, 0.0F, 6.0F, 0, 27, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 27.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 248, -4.0F, -3.0F, -8.0F, 8, 30, 11, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 84, 273, 0.0F, 0.0F, 3.0F, 0, 27, 4, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 27.0F, 0.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 82, -3.5F, -2.0F, -6.0F, 7, 16, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 240, 0, 0.0F, 0.0F, 2.0F, 0, 14, 4, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 14.0F, -1.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 148, -3.0F, -2.0F, -3.5F, 6, 16, 6, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 72, 215, 0.0F, 0.0F, 2.5F, 0, 14, 3, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 14.0F, 0.25F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 152, 0, -2.5F, -2.0F, -3.25F, 5, 16, 5, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 141, 242, 0.0F, 0.0F, 1.75F, 0, 14, 3, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, 14.0F, -0.25F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.1309F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 138, 187, -2.0F, -2.0F, -2.5F, 4, 16, 4, 0.0F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 134, 242, 0.0F, 0.0F, 1.5F, 0, 14, 3, 0.0F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 14.0F, 0.5F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.1309F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 231, 62, 0.0F, 0.0F, 0.5F, 0, 13, 2, 0.0F, false));
        this.tail9.cubeList.add(new ModelBox(tail9, 227, 0, -1.5F, -1.0F, -2.5F, 3, 14, 3, 0.0F, false));

        this.tail10 = new AdvancedModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1309F, 0.0F, 0.0F);
        this.tail10.cubeList.add(new ModelBox(tail10, 125, 242, -1.0F, -1.0F, -1.0F, 2, 14, 2, 0.0F, false));
        this.tail10.cubeList.add(new ModelBox(tail10, 25, 148, 0.0F, 0.0F, 1.0F, 0, 13, 2, 0.0F, false));

        this.tail11 = new AdvancedModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.2182F, 0.0F, 0.0F);
        this.tail11.cubeList.add(new ModelBox(tail11, 208, 95, -0.5F, -1.0F, -0.5F, 1, 14, 1, 0.0F, false));
        this.tail11.cubeList.add(new ModelBox(tail11, 173, 187, 0.0F, 0.0F, 0.5F, 0, 13, 2, 0.0F, false));

        this.tail12 = new AdvancedModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.1745F, 0.0F, 0.0F);
        this.tail12.cubeList.add(new ModelBox(tail12, 33, 0, 0.0F, -0.25F, 0.5F, 0, 13, 1, 0.0F, false));
        this.tail12.cubeList.add(new ModelBox(tail12, 103, 172, -0.5F, -0.25F, -0.5F, 1, 13, 1, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.0F, -3.0F);
        this.hip.addChild(body);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.7017F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 216, 0.0F, -33.0F, -23.0F, 0, 5, 32, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 117, 50, -14.0F, -28.0F, -23.0F, 28, 12, 32, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -19.0F, -16.75F, -25.0F, 38, 45, 36, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -30.0F, 2.0F);
        this.body.addChild(chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 23.0F, -4.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.5272F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 254, 187, 0.0F, -35.5F, -38.0F, 0, 5, 20, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 162, 207, -10.5F, -30.5F, -38.0F, 21, 21, 22, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 25.6F, -14.2F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.2654F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 149, 0, -14.0F, -32.5F, -44.8F, 26, 22, 25, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, 25.6F, -14.2F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.0944F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 125, -16.0F, -12.0F, -38.0F, 30, 38, 23, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-15.0F, -10.25F, -17.5F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2182F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 84, 242, -4.5F, -5.3977F, -15.528F, 10, 10, 20, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.5F, -2.0F, -15.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3054F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 131, 95, -4.0F, -1.8858F, -15.6226F, 8, 7, 20, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 1.4889F, -14.9829F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 73, 148, -4.5F, -2.75F, -6.75F, 9, 6, 8, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.5F, -0.25F, -2.75F);
        this.rightArm3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 107, -0.983F, -0.4889F, -3.8877F, 1, 1, 4, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(15.0F, -10.25F, -17.5F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2182F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 84, 242, -5.5F, -5.3977F, -15.528F, 10, 10, 20, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.5F, -2.0F, -15.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3054F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 131, 95, -4.0F, -1.8858F, -15.6226F, 8, 7, 20, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 1.4889F, -14.9829F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 73, 148, -4.5F, -2.75F, -6.75F, 9, 6, 8, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.5F, -0.25F, -2.75F);
        this.leftArm3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 107, -0.017F, -0.4889F, -3.8877F, 1, 1, 4, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -15.0F, 15.95F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2182F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.0F, -5.6F);
        this.neck1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 252, 0, -7.0F, -15.9529F, 4.6456F, 14, 22, 9, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 197, 95, 0.0F, -15.9529F, 13.6456F, 0, 16, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.0F, -5.6F);
        this.neck1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 113, 0, -7.9F, -15.9379F, -12.312F, 2, 2, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 86, -7.9F, -10.4379F, -12.312F, 2, 2, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 86, 5.9F, -10.4379F, -12.312F, 2, 2, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 113, 0, 5.9F, -15.9379F, -12.312F, 2, 2, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 206, -9.5F, -16.9379F, -11.312F, 19, 25, 16, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -18.4106F, 1.9409F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.0F, -11.0F);
        this.neck2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 173, 202, 0.0F, -11.0408F, 15.5414F, 0, 18, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 254, -6.0F, -11.0408F, 6.1414F, 12, 21, 10, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.0F, -11.0F);
        this.neck2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 152, -6.5F, -11.3423F, -6.5346F, 2, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 86, -6.5F, -6.8423F, -6.5346F, 2, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 73, 148, -6.5F, -1.8423F, -6.5346F, 2, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 4, -6.5F, 2.9077F, -6.5346F, 2, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 144, 4, 4.5F, 2.9077F, -6.5346F, 2, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 73, 148, 4.5F, -1.8423F, -6.5346F, 2, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 86, 4.5F, -6.8423F, -6.5346F, 2, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 100, 152, 4.5F, -11.3423F, -6.5346F, 2, 2, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 240, 133, -8.0F, -12.0923F, -5.6346F, 16, 24, 13, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -17.1154F, 0.7029F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1309F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -8.0F, -7.0F);
        this.neck3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 100, 82, 0.0F, -8.7522F, 10.5987F, 0, 16, 4, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 237, 263, -4.5F, -8.7522F, 1.8987F, 9, 19, 9, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -8.0F, -7.0F);
        this.neck3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 109, -5.75F, -9.2552F, -8.6842F, 2, 2, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 113, 4, -5.75F, -5.0052F, -8.6842F, 2, 2, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 100, 148, -5.75F, -0.2552F, -8.6842F, 2, 2, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 73, 152, -5.75F, 4.2448F, -8.6842F, 2, 2, 1, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 73, 152, 3.75F, 4.2448F, -8.6842F, 2, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 100, 148, 3.75F, -0.2552F, -8.6842F, 2, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 113, 4, 3.75F, -5.0052F, -8.6842F, 2, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 109, 3.75F, -9.2552F, -8.6842F, 2, 2, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 145, 251, -7.0F, -9.5552F, -7.6842F, 14, 19, 11, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -15.6F, -1.45F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1309F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -7.8F, -3.35F);
        this.neck4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 155, 187, 0.0F, -10.1666F, 8.336F, 0, 18, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -4.0F, -10.1666F, 0.436F, 8, 19, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -7.8F, -3.35F);
        this.neck4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 0, -5.0F, -8.5652F, -7.3648F, 2, 2, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 82, -5.0F, -4.3152F, -7.3648F, 2, 2, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 4, -5.0F, 0.1848F, -7.3648F, 2, 2, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 4, 3.0F, 0.1848F, -7.3648F, 2, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 0, 3.0F, -8.5652F, -7.3648F, 2, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 82, 3.0F, -4.3152F, -7.3648F, 2, 2, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 263, 79, -5.5F, -11.5652F, -6.3648F, 11, 20, 8, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -16.3326F, 2.1521F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.1309F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -8.1F, -1.2F);
        this.neck5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 82, -3.0F, -1.5237F, -6.6688F, 2, 2, 1, -0.02F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 144, 0, -3.0F, 2.4763F, -6.9688F, 2, 2, 1, -0.02F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 144, 0, 1.0F, 2.4763F, -6.9688F, 2, 2, 1, -0.02F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 82, 1.0F, -1.5237F, -6.6688F, 2, 2, 1, -0.02F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 168, 95, -4.0F, -2.2737F, -6.2688F, 8, 10, 6, -0.02F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -8.1F, -1.2F);
        this.neck5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 109, 82, 0.0F, -0.9608F, 3.8674F, 0, 8, 3, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 206, 48, -3.5F, -0.9608F, -2.1326F, 7, 9, 6, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -8.25F, 0.25F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.1309F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 206, 64, -3.0F, -7.3803F, -3.9741F, 6, 8, 6, 0.0F, false));
        this.neck6.cubeList.add(new ModelBox(neck6, 146, 13, 0.0F, -6.3803F, 2.0259F, 0, 6, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -6.0F, -0.6F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, -5.5F, -2.5F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.48F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 32, -2.0F, -3.45F, 0.0F, 5, 1, 1, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 132, 31, -1.5F, -4.45F, 0.0F, 4, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, -5.5F, -2.5F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 28, -2.0F, -4.75F, -0.15F, 5, 1, 2, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 227, 216, -2.5F, -3.75F, -0.15F, 6, 7, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -5.5F, -2.5F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -1.0F, 0.7F, 4.65F, 2, 3, 1, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -5.5F, -2.5F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7418F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 139, 95, -1.0F, -3.5F, 2.5F, 2, 8, 1, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -5.6F, -2.45F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.5149F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 206, -2.0F, -4.1F, 0.7F, 5, 5, 2, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -5.6F, -2.45F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.8203F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 214, -2.0F, 0.2F, 0.3F, 5, 5, 2, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -5.5F, -2.5F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 221, 133, -3.0F, 1.75F, 0.4F, 7, 4, 5, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -0.65F, -2.05F);
        this.head.addChild(jaw);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, -4.8975F, 0.4751F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -1.4399F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 100, 109, -2.5F, 1.1758F, -3.6037F, 5, 1, 1, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 113, 109, -2.0F, 1.1758F, -4.5537F, 4, 1, 1, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, -4.8975F, 0.4751F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.2182F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 107, -3.0F, 1.0F, -1.3246F, 6, 2, 3, -0.03F, false));
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 113, 31, -3.5F, 2.0F, -0.2746F, 7, 2, 2, -0.03F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, -4.8975F, 0.4751F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -1.2654F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 131, 109, -2.5F, 1.0F, -4.99F, 5, 2, 2, -0.02F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 28, -3.5F, 1.0F, 1.6F, 7, 2, 4, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 215, 143, -3.0F, 1.0F, -3.97F, 6, 2, 6, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, -7.4975F, -3.3749F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-12.5F, -1.4848F, 6.1764F);
        this.throat.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -1.6144F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 227, 207, 10.5F, 2.3211F, 6.8346F, 4, 3, 5, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-12.5F, -1.4848F, 6.1764F);
        this.throat.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -1.4399F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 55, 206, 10.5F, 4.4409F, 0.5527F, 4, 2, 6, -0.01F, false));
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

        EntityPrehistoricFloraApatosaurus apato = (EntityPrehistoricFloraApatosaurus) e;

        this.faceTarget(f3, f4, 6, neck1);
        this.faceTarget(f3, f4, 6, neck2);
        this.faceTarget(f3, f4, 6, neck3);
        this.faceTarget(f3, f4, 4, neck4);
        this.faceTarget(f3, f4, 4, neck5);
        this.faceTarget(f3, f4, 4, neck6);
        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = apato.getJuvenile();

        if (isBaby) {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1.025F, 1.025F, 1.025F);
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck4.setScale(1F, 1, 1F);
            this.neck5.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        apato.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = apato.getTravelSpeed()/2;

            if (!apato.isInWater()) {

                if (f3 == 0.0F || !apato.getIsMoving()) {
                    if (apato.getAnimation() != apato.EAT_ANIMATION
                        && apato.getAnimation() != apato.DRINK_ANIMATION
                        && apato.getAnimation() != apato.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (apato.getAnimation() != apato.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }

                    return;
                }

                if (apato.getIsFast()) { //Running
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
        EntityPrehistoricFloraApatosaurus ee = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
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
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The leaves grazing anim
            animTailSwing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.38-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 29) {
            xx = 3.38 + (((tickAnim - 10) / 19) * (2.5-(3.38)));
            yy = 0 + (((tickAnim - 10) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 19) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 2.5 + (((tickAnim - 29) / 14) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 2.5 + (((tickAnim - 43) / 10) * (-3.18-(2.5)));
            yy = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 10) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = -3.18 + (((tickAnim - 53) / 27) * (0-(-3.18)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 20) / 15) * (5.55-(10)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 57) {
            xx = 5.55 + (((tickAnim - 35) / 22) * (5.24-(5.55)));
            yy = 0 + (((tickAnim - 35) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 22) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 5.24 + (((tickAnim - 57) / 23) * (0-(5.24)));
            yy = 0 + (((tickAnim - 57) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (11.045-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.10134-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4.70144-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 29) {
            xx = 11.045 + (((tickAnim - 13) / 16) * (7.53313-(11.045)));
            yy = 0.10134 + (((tickAnim - 13) / 16) * (0.21534-(0.10134)));
            zz = 4.70144 + (((tickAnim - 13) / 16) * (9.99055-(4.70144)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 7.53313 + (((tickAnim - 29) / 14) * (7.53313-(7.53313)));
            yy = 0.21534 + (((tickAnim - 29) / 14) * (0.21534-(0.21534)));
            zz = 9.99055 + (((tickAnim - 29) / 14) * (9.99055-(9.99055)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 7.53313 + (((tickAnim - 43) / 17) * (-0.89102-(7.53313)));
            yy = 0.21534 + (((tickAnim - 43) / 17) * (0.11746-(0.21534)));
            zz = 9.99055 + (((tickAnim - 43) / 17) * (5.44939-(9.99055)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -0.89102 + (((tickAnim - 60) / 20) * (0-(-0.89102)));
            yy = 0.11746 + (((tickAnim - 60) / 20) * (0-(0.11746)));
            zz = 5.44939 + (((tickAnim - 60) / 20) * (0-(5.44939)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-5.0095-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (-0.21782-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (4.99527-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = -5.0095 + (((tickAnim - 29) / 14) * (-5.0095-(-5.0095)));
            yy = -0.21782 + (((tickAnim - 29) / 14) * (-0.21782-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 29) / 14) * (4.99527-(4.99527)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -5.0095 + (((tickAnim - 43) / 17) * (4.76754-(-5.0095)));
            yy = -0.21782 + (((tickAnim - 43) / 17) * (-0.11881-(-0.21782)));
            zz = 4.99527 + (((tickAnim - 43) / 17) * (2.72469-(4.99527)));
        }
        else if (tickAnim >= 60 && tickAnim < 70) {
            xx = 4.76754 + (((tickAnim - 60) / 10) * (-2.61623-(4.76754)));
            yy = -0.11881 + (((tickAnim - 60) / 10) * (-0.05941-(-0.11881)));
            zz = 2.72469 + (((tickAnim - 60) / 10) * (1.36235-(2.72469)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -2.61623 + (((tickAnim - 70) / 10) * (0-(-2.61623)));
            yy = -0.05941 + (((tickAnim - 70) / 10) * (0-(-0.05941)));
            zz = 1.36235 + (((tickAnim - 70) / 10) * (0-(1.36235)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -5 + (((tickAnim - 29) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 39) / 4) * (-6-(0)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 70) {
            xx = -6 + (((tickAnim - 43) / 27) * (-8.86-(-6)));
            yy = 0 + (((tickAnim - 43) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 27) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -8.86 + (((tickAnim - 70) / 10) * (0-(-8.86)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = -5 + (((tickAnim - 33) / 14) * (-5-(-5)));
            yy = 0 + (((tickAnim - 33) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 14) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -5 + (((tickAnim - 47) / 6) * (0.5-(-5)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 70) {
            xx = 0.5 + (((tickAnim - 53) / 17) * (-7.31-(0.5)));
            yy = 0 + (((tickAnim - 53) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 17) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = -7.31 + (((tickAnim - 70) / 10) * (0-(-7.31)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -10 + (((tickAnim - 33) / 6) * (-20-(-10)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 47) {
            xx = -20 + (((tickAnim - 39) / 8) * (-10-(-20)));
            yy = 0 + (((tickAnim - 39) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 8) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = -10 + (((tickAnim - 47) / 6) * (6-(-10)));
            yy = 0 + (((tickAnim - 47) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 6) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 6 + (((tickAnim - 53) / 27) * (0-(6)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (13.33-(0)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 41) {
            xx = 13.33 + (((tickAnim - 38) / 3) * (25-(13.33)));
            yy = 0 + (((tickAnim - 38) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 3) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 46) {
            xx = 25 + (((tickAnim - 41) / 5) * (22.12-(25)));
            yy = 0 + (((tickAnim - 41) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 5) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 22.12 + (((tickAnim - 46) / 2) * (0-(22.12)));
            yy = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 3 + (((tickAnim - 33) / 68) * (3-(3)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 3 + (((tickAnim - 101) / 14) * (0-(3)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 0 + (((tickAnim - 115) / 13) * (-2-(0)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 160) {
            xx = -2 + (((tickAnim - 128) / 32) * (0-(-2)));
            yy = 0 + (((tickAnim - 128) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (2-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 2 + (((tickAnim - 117) / 11) * (2-(2)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (-1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (1-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-3-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -3 + (((tickAnim - 33) / 69) * (-3-(-3)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -3 + (((tickAnim - 102) / 15) * (-1-(-3)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (0-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (-2-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = -2 + (((tickAnim - 33) / 69) * (-2-(-2)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = -2 + (((tickAnim - 102) / 15) * (2-(-2)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 2 + (((tickAnim - 117) / 11) * (2-(2)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 2 + (((tickAnim - 128) / 25) * (0-(2)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 11) / 22) * (4-(0)));
            yy = 0 + (((tickAnim - 11) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 22) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 102) {
            xx = 4 + (((tickAnim - 33) / 69) * (4-(4)));
            yy = 0 + (((tickAnim - 33) / 69) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 69) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 117) {
            xx = 4 + (((tickAnim - 102) / 15) * (-1-(4)));
            yy = 0 + (((tickAnim - 102) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 15) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -1 + (((tickAnim - 117) / 11) * (1-(-1)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 1 + (((tickAnim - 128) / 25) * (0-(1)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 160) {
            xx = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2 + (((tickAnim - 0) / 160) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*3 + (((tickAnim - 0) / 160) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2 + (((tickAnim - 0) / 160) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/8+50))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*4), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/8-70))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(12.5), tail7.rotateAngleY + (float) Math.toRadians(0), tail7.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 7.5 + (((tickAnim - 0) / 46) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 160) {
            xx = 7.5 + (((tickAnim - 46) / 114) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 46) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 114) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 10 + (((tickAnim - 0) / 46) * (15-(10)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 46) / 114) * (10-(15)));
            yy = 0 + (((tickAnim - 46) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 114) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 7.5 + (((tickAnim - 0) / 46) * (5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 160) {
            xx = 5 + (((tickAnim - 46) / 114) * (7.5-(5)));
            yy = 0 + (((tickAnim - 46) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 114) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 15 + (((tickAnim - 0) / 46) * (15-(15)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 46) / 114) * (15-(15)));
            yy = 0 + (((tickAnim - 46) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 114) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 11.15823 + (((tickAnim - 0) / 46) * (15-(11.15823)));
            yy = -0.20682 + (((tickAnim - 0) / 46) * (0-(-0.20682)));
            zz = 7.6173 + (((tickAnim - 0) / 46) * (0-(7.6173)));
        }
        else if (tickAnim >= 46 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 46) / 114) * (11.15823-(15)));
            yy = 0 + (((tickAnim - 46) / 114) * (-0.20682-(0)));
            zz = 0 + (((tickAnim - 46) / 114) * (7.6173-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 101) {
            xx = 8 + (((tickAnim - 24) / 77) * (8-(8)));
            yy = 0 + (((tickAnim - 24) / 77) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 77) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 115) {
            xx = 8 + (((tickAnim - 101) / 14) * (11-(8)));
            yy = 0 + (((tickAnim - 101) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 14) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 128) {
            xx = 11 + (((tickAnim - 115) / 13) * (8-(11)));
            yy = 0 + (((tickAnim - 115) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 13) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 8 + (((tickAnim - 128) / 25) * (0-(8)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 1 + (((tickAnim - 6) / 5) * (0-(1)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (3.8533-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.22141-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (-1.98771-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.8533 + (((tickAnim - 18) / 5) * (6-(3.8533)));
            yy = 0.22141 + (((tickAnim - 18) / 5) * (0-(0.22141)));
            zz = -1.98771 + (((tickAnim - 18) / 5) * (0-(-1.98771)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 6 + (((tickAnim - 23) / 10) * (2.5-(6)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 2.5 + (((tickAnim - 33) / 68) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 33) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 68) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 2.5 + (((tickAnim - 101) / 8) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = 2.5 + (((tickAnim - 109) / 4) * (1.66098-(2.5)));
            yy = 0 + (((tickAnim - 109) / 4) * (0.21787-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (-0.99209-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 1.66098 + (((tickAnim - 113) / 4) * (-5-(1.66098)));
            yy = 0.21787 + (((tickAnim - 113) / 4) * (0-(0.21787)));
            zz = -0.99209 + (((tickAnim - 113) / 4) * (0-(-0.99209)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -5 + (((tickAnim - 117) / 11) * (-5-(-5)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -5 + (((tickAnim - 128) / 25) * (0-(-5)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.54777-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.72187-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.9817-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 9.54777 + (((tickAnim - 3) / 4) * (13.53998-(9.54777)));
            yy = -0.72187 + (((tickAnim - 3) / 4) * (-1.44374-(-0.72187)));
            zz = 2.9817 + (((tickAnim - 3) / 4) * (5.96341-(2.9817)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 13.53998 + (((tickAnim - 7) / 4) * (6.85189-(13.53998)));
            yy = -1.44374 + (((tickAnim - 7) / 4) * (19.75338-(-1.44374)));
            zz = 5.96341 + (((tickAnim - 7) / 4) * (9.26051-(5.96341)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 6.85189 + (((tickAnim - 11) / 7) * (-3.01808-(6.85189)));
            yy = 19.75338 + (((tickAnim - 11) / 7) * (22.1444-(19.75338)));
            zz = 9.26051 + (((tickAnim - 11) / 7) * (12.36935-(9.26051)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -3.01808 + (((tickAnim - 18) / 6) * (-12.87029-(-3.01808)));
            yy = 22.1444 + (((tickAnim - 18) / 6) * (24.59597-(22.1444)));
            zz = 12.36935 + (((tickAnim - 18) / 6) * (9.05791-(12.36935)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -12.87029 + (((tickAnim - 24) / 9) * (-15.87029-(-12.87029)));
            yy = 24.59597 + (((tickAnim - 24) / 9) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 24) / 9) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -15.87029 + (((tickAnim - 33) / 68) * (-15.87029-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 33) / 68) * (24.59597-(24.59597)));
            zz = 9.05791 + (((tickAnim - 33) / 68) * (9.05791-(9.05791)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -15.87029 + (((tickAnim - 101) / 5) * (-9.97519-(-15.87029)));
            yy = 24.59597 + (((tickAnim - 101) / 5) * (24.69403-(24.59597)));
            zz = 9.05791 + (((tickAnim - 101) / 5) * (14.55832-(9.05791)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -9.97519 + (((tickAnim - 106) / 3) * (-3.87029-(-9.97519)));
            yy = 24.69403 + (((tickAnim - 106) / 3) * (24.59597-(24.69403)));
            zz = 14.55832 + (((tickAnim - 106) / 3) * (9.05791-(14.55832)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -3.87029 + (((tickAnim - 109) / 3) * (4.06514-(-3.87029)));
            yy = 24.59597 + (((tickAnim - 109) / 3) * (17.07198-(24.59597)));
            zz = 9.05791 + (((tickAnim - 109) / 3) * (7.87966-(9.05791)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 4.06514 + (((tickAnim - 112) / 1) * (13.00057-(4.06514)));
            yy = 17.07198 + (((tickAnim - 112) / 1) * (9.54798-(17.07198)));
            zz = 7.87966 + (((tickAnim - 112) / 1) * (6.7014-(7.87966)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 13.00057 + (((tickAnim - 113) / 4) * (3.90373-(13.00057)));
            yy = 9.54798 + (((tickAnim - 113) / 4) * (-1.73801-(9.54798)));
            zz = 6.7014 + (((tickAnim - 113) / 4) * (4.93402-(6.7014)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 3.90373 + (((tickAnim - 117) / 6) * (5.84189-(3.90373)));
            yy = -1.73801 + (((tickAnim - 117) / 6) * (-5.63614-(-1.73801)));
            zz = 4.93402 + (((tickAnim - 117) / 6) * (4.03284-(4.93402)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 5.84189 + (((tickAnim - 123) / 5) * (7.04552-(5.84189)));
            yy = -5.63614 + (((tickAnim - 123) / 5) * (-8.55973-(-5.63614)));
            zz = 4.03284 + (((tickAnim - 123) / 5) * (3.35695-(4.03284)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 7.04552 + (((tickAnim - 128) / 25) * (0-(7.04552)));
            yy = -8.55973 + (((tickAnim - 128) / 25) * (0-(-8.55973)));
            zz = 3.35695 + (((tickAnim - 128) / 25) * (0-(3.35695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-32.72492-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.90604-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.89938-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -32.72492 + (((tickAnim - 3) / 4) * (-37.00539-(-32.72492)));
            yy = 3.90604 + (((tickAnim - 3) / 4) * (7.81208-(3.90604)));
            zz = -1.89938 + (((tickAnim - 3) / 4) * (-3.79876-(-1.89938)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -37.00539 + (((tickAnim - 7) / 4) * (-17.35597-(-37.00539)));
            yy = 7.81208 + (((tickAnim - 7) / 4) * (12.69463-(7.81208)));
            zz = -3.79876 + (((tickAnim - 7) / 4) * (-6.17298-(-3.79876)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -17.35597 + (((tickAnim - 11) / 7) * (-29.29392-(-17.35597)));
            yy = 12.69463 + (((tickAnim - 11) / 7) * (4.36081-(12.69463)));
            zz = -6.17298 + (((tickAnim - 11) / 7) * (-3.65573-(-6.17298)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -29.29392 + (((tickAnim - 18) / 6) * (-31.72102-(-29.29392)));
            yy = 4.36081 + (((tickAnim - 18) / 6) * (-5.39515-(4.36081)));
            zz = -3.65573 + (((tickAnim - 18) / 6) * (-5.91574-(-3.65573)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -31.72102 + (((tickAnim - 24) / 9) * (-44.22102-(-31.72102)));
            yy = -5.39515 + (((tickAnim - 24) / 9) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 24) / 9) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -44.22102 + (((tickAnim - 33) / 68) * (-44.22102-(-44.22102)));
            yy = -5.39515 + (((tickAnim - 33) / 68) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 33) / 68) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = -44.22102 + (((tickAnim - 101) / 5) * (-37.82447-(-44.22102)));
            yy = -5.39515 + (((tickAnim - 101) / 5) * (-3.85689-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 101) / 5) * (-4.63333-(-5.91574)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -37.82447 + (((tickAnim - 106) / 3) * (-48.72102-(-37.82447)));
            yy = -3.85689 + (((tickAnim - 106) / 3) * (-5.39515-(-3.85689)));
            zz = -4.63333 + (((tickAnim - 106) / 3) * (-5.91574-(-4.63333)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = -48.72102 + (((tickAnim - 109) / 3) * (-55.57817-(-48.72102)));
            yy = -5.39515 + (((tickAnim - 109) / 3) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 109) / 3) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = -55.57817 + (((tickAnim - 112) / 1) * (-63.23531-(-55.57817)));
            yy = -5.39515 + (((tickAnim - 112) / 1) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 112) / 1) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = -63.23531 + (((tickAnim - 113) / 4) * (-34.72102-(-63.23531)));
            yy = -5.39515 + (((tickAnim - 113) / 4) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 113) / 4) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = -34.72102 + (((tickAnim - 117) / 6) * (-27.00674-(-34.72102)));
            yy = -5.39515 + (((tickAnim - 117) / 6) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 117) / 6) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = -27.00674 + (((tickAnim - 123) / 5) * (-21.72102-(-27.00674)));
            yy = -5.39515 + (((tickAnim - 123) / 5) * (-5.39515-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 123) / 5) * (-5.91574-(-5.91574)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = -21.72102 + (((tickAnim - 128) / 25) * (0-(-21.72102)));
            yy = -5.39515 + (((tickAnim - 128) / 25) * (0-(-5.39515)));
            zz = -5.91574 + (((tickAnim - 128) / 25) * (0-(-5.91574)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (18.72111-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.14292-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.04603-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 18.72111 + (((tickAnim - 3) / 4) * (45.3311-(18.72111)));
            yy = -0.14292 + (((tickAnim - 3) / 4) * (-0.28584-(-0.14292)));
            zz = -0.04603 + (((tickAnim - 3) / 4) * (-0.09206-(-0.04603)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 45.3311 + (((tickAnim - 7) / 4) * (12.8436-(45.3311)));
            yy = -0.28584 + (((tickAnim - 7) / 4) * (-0.4645-(-0.28584)));
            zz = -0.09206 + (((tickAnim - 7) / 4) * (-0.1496-(-0.09206)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 12.8436 + (((tickAnim - 11) / 7) * (29.97238-(12.8436)));
            yy = -0.4645 + (((tickAnim - 11) / 7) * (1.09866-(-0.4645)));
            zz = -0.1496 + (((tickAnim - 11) / 7) * (-1.13942-(-0.1496)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 29.97238 + (((tickAnim - 18) / 6) * (37.96143-(29.97238)));
            yy = 1.09866 + (((tickAnim - 18) / 6) * (2.31445-(1.09866)));
            zz = -1.13942 + (((tickAnim - 18) / 6) * (-1.90927-(-1.13942)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 37.96143 + (((tickAnim - 24) / 9) * (37.84544-(37.96143)));
            yy = 2.31445 + (((tickAnim - 24) / 9) * (4.62632-(2.31445)));
            zz = -1.90927 + (((tickAnim - 24) / 9) * (-3.82479-(-1.90927)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 37.84544 + (((tickAnim - 33) / 68) * (37.84544-(37.84544)));
            yy = 4.62632 + (((tickAnim - 33) / 68) * (4.62632-(4.62632)));
            zz = -3.82479 + (((tickAnim - 33) / 68) * (-3.82479-(-3.82479)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 37.84544 + (((tickAnim - 101) / 5) * (37.78945-(37.84544)));
            yy = 4.62632 + (((tickAnim - 101) / 5) * (5.39592-(4.62632)));
            zz = -3.82479 + (((tickAnim - 101) / 5) * (-4.46577-(-3.82479)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 37.78945 + (((tickAnim - 106) / 3) * (37.84544-(37.78945)));
            yy = 5.39592 + (((tickAnim - 106) / 3) * (4.62632-(5.39592)));
            zz = -4.46577 + (((tickAnim - 106) / 3) * (-3.82479-(-4.46577)));
        }
        else if (tickAnim >= 109 && tickAnim < 112) {
            xx = 37.84544 + (((tickAnim - 109) / 3) * (16.74675-(37.84544)));
            yy = 4.62632 + (((tickAnim - 109) / 3) * (3.30451-(4.62632)));
            zz = -3.82479 + (((tickAnim - 109) / 3) * (-2.73199-(-3.82479)));
        }
        else if (tickAnim >= 112 && tickAnim < 113) {
            xx = 16.74675 + (((tickAnim - 112) / 1) * (44.84805-(16.74675)));
            yy = 3.30451 + (((tickAnim - 112) / 1) * (1.98271-(3.30451)));
            zz = -2.73199 + (((tickAnim - 112) / 1) * (-1.6392-(-2.73199)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 44.84805 + (((tickAnim - 113) / 4) * (27-(44.84805)));
            yy = 1.98271 + (((tickAnim - 113) / 4) * (0-(1.98271)));
            zz = -1.6392 + (((tickAnim - 113) / 4) * (0-(-1.6392)));
        }
        else if (tickAnim >= 117 && tickAnim < 123) {
            xx = 27 + (((tickAnim - 117) / 6) * (20.29-(27)));
            yy = 0 + (((tickAnim - 117) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 6) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 128) {
            xx = 20.29 + (((tickAnim - 123) / 5) * (13-(20.29)));
            yy = 0 + (((tickAnim - 123) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 5) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 153) {
            xx = 13 + (((tickAnim - 128) / 25) * (0-(13)));
            yy = 0 + (((tickAnim - 128) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.60252-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.60097-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-4.05978-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0.60252 + (((tickAnim - 6) / 5) * (1.14553-(0.60252)));
            yy = 0.60097 + (((tickAnim - 6) / 5) * (0.43216-(0.60097)));
            zz = -4.05978 + (((tickAnim - 6) / 5) * (-3.88871-(-4.05978)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 1.14553 + (((tickAnim - 11) / 4) * (-0.32406-(1.14553)));
            yy = 0.43216 + (((tickAnim - 11) / 4) * (-11.84141-(0.43216)));
            zz = -3.88871 + (((tickAnim - 11) / 4) * (-6.72711-(-3.88871)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -0.32406 + (((tickAnim - 15) / 4) * (1.90326-(-0.32406)));
            yy = -11.84141 + (((tickAnim - 15) / 4) * (-17.10152-(-11.84141)));
            zz = -6.72711 + (((tickAnim - 15) / 4) * (-7.94357-(-6.72711)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 1.90326 + (((tickAnim - 19) / 5) * (-13.64209-(1.90326)));
            yy = -17.10152 + (((tickAnim - 19) / 5) * (-27.62172-(-17.10152)));
            zz = -7.94357 + (((tickAnim - 19) / 5) * (-10.37649-(-7.94357)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -13.64209 + (((tickAnim - 24) / 9) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 24) / 9) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 24) / 9) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -13.64209 + (((tickAnim - 33) / 68) * (-13.64209-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 33) / 68) * (-27.62172-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 33) / 68) * (-10.37649-(-10.37649)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -13.64209 + (((tickAnim - 101) / 2) * (-5.02873-(-13.64209)));
            yy = -27.62172 + (((tickAnim - 101) / 2) * (-19.51372-(-27.62172)));
            zz = -10.37649 + (((tickAnim - 101) / 2) * (-9.35613-(-10.37649)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -5.02873 + (((tickAnim - 103) / 4) * (6.19131-(-5.02873)));
            yy = -19.51372 + (((tickAnim - 103) / 4) * (-7.35172-(-19.51372)));
            zz = -9.35613 + (((tickAnim - 103) / 4) * (-7.8256-(-9.35613)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 6.19131 + (((tickAnim - 107) / 2) * (-5.99533-(6.19131)));
            yy = -7.35172 + (((tickAnim - 107) / 2) * (0.75628-(-7.35172)));
            zz = -7.8256 + (((tickAnim - 107) / 2) * (-6.80525-(-7.8256)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = -5.99533 + (((tickAnim - 109) / 4) * (-1.19591-(-5.99533)));
            yy = 0.75628 + (((tickAnim - 109) / 4) * (-0.08461-(0.75628)));
            zz = -6.80525 + (((tickAnim - 109) / 4) * (-1.17794-(-6.80525)));
        }
        else if (tickAnim >= 113 && tickAnim < 116) {
            xx = -1.19591 + (((tickAnim - 113) / 3) * (2.84263-(-1.19591)));
            yy = -0.08461 + (((tickAnim - 113) / 3) * (0.6343-(-0.08461)));
            zz = -1.17794 + (((tickAnim - 113) / 3) * (-5.70763-(-1.17794)));
        }
        else if (tickAnim >= 116 && tickAnim < 125) {
            xx = 2.84263 + (((tickAnim - 116) / 9) * (7.69269-(2.84263)));
            yy = 0.6343 + (((tickAnim - 116) / 9) * (0.46353-(0.6343)));
            zz = -5.70763 + (((tickAnim - 116) / 9) * (-4.17096-(-5.70763)));
        }
        else if (tickAnim >= 125 && tickAnim < 153) {
            xx = 7.69269 + (((tickAnim - 125) / 28) * (0-(7.69269)));
            yy = 0.46353 + (((tickAnim - 125) / 28) * (0-(0.46353)));
            zz = -4.17096 + (((tickAnim - 125) / 28) * (0-(-4.17096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-23.06703-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.78822-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (4.92614-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -23.06703 + (((tickAnim - 11) / 4) * (-44.35657-(-23.06703)));
            yy = 4.78822 + (((tickAnim - 11) / 4) * (6.99957-(4.78822)));
            zz = 4.92614 + (((tickAnim - 11) / 4) * (5.93843-(4.92614)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -44.35657 + (((tickAnim - 15) / 4) * (-51.26637-(-44.35657)));
            yy = 6.99957 + (((tickAnim - 15) / 4) * (7.94729-(6.99957)));
            zz = 5.93843 + (((tickAnim - 15) / 4) * (6.37227-(5.93843)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -51.26637 + (((tickAnim - 19) / 5) * (-30.58598-(-51.26637)));
            yy = 7.94729 + (((tickAnim - 19) / 5) * (9.84273-(7.94729)));
            zz = 6.37227 + (((tickAnim - 19) / 5) * (7.23996-(6.37227)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -30.58598 + (((tickAnim - 24) / 9) * (-46.58598-(-30.58598)));
            yy = 9.84273 + (((tickAnim - 24) / 9) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 24) / 9) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = -46.58598 + (((tickAnim - 33) / 68) * (-46.58598-(-46.58598)));
            yy = 9.84273 + (((tickAnim - 33) / 68) * (9.84273-(9.84273)));
            zz = 7.23996 + (((tickAnim - 33) / 68) * (7.23996-(7.23996)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = -46.58598 + (((tickAnim - 101) / 2) * (-51.38064-(-46.58598)));
            yy = 9.84273 + (((tickAnim - 101) / 2) * (9.42463-(9.84273)));
            zz = 7.23996 + (((tickAnim - 101) / 2) * (7.63447-(7.23996)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = -51.38064 + (((tickAnim - 103) / 4) * (-57.17264-(-51.38064)));
            yy = 9.42463 + (((tickAnim - 103) / 4) * (8.79749-(9.42463)));
            zz = 7.63447 + (((tickAnim - 103) / 4) * (8.22623-(7.63447)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = -57.17264 + (((tickAnim - 107) / 2) * (-49.3673-(-57.17264)));
            yy = 8.79749 + (((tickAnim - 107) / 2) * (8.37939-(8.79749)));
            zz = 8.22623 + (((tickAnim - 107) / 2) * (8.62074-(8.22623)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = -49.3673 + (((tickAnim - 109) / 7) * (-34.53387-(-49.3673)));
            yy = 8.37939 + (((tickAnim - 109) / 7) * (7.02788-(8.37939)));
            zz = 8.62074 + (((tickAnim - 109) / 7) * (7.2303-(8.62074)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = -34.53387 + (((tickAnim - 116) / 7) * (-25.9312-(-34.53387)));
            yy = 7.02788 + (((tickAnim - 116) / 7) * (5.67636-(7.02788)));
            zz = 7.2303 + (((tickAnim - 116) / 7) * (5.83986-(7.2303)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = -25.9312 + (((tickAnim - 123) / 30) * (0-(-25.9312)));
            yy = 5.67636 + (((tickAnim - 123) / 30) * (0-(5.67636)));
            zz = 5.83986 + (((tickAnim - 123) / 30) * (0-(5.83986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (18.54915-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.13563-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-1.28444-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18.54915 + (((tickAnim - 11) / 4) * (31.83041-(18.54915)));
            yy = 1.13563 + (((tickAnim - 11) / 4) * (-1.66184-(1.13563)));
            zz = -1.28444 + (((tickAnim - 11) / 4) * (1.3125-(-1.28444)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 31.83041 + (((tickAnim - 15) / 4) * (43.64142-(31.83041)));
            yy = -1.66184 + (((tickAnim - 15) / 4) * (-2.86076-(-1.66184)));
            zz = 1.3125 + (((tickAnim - 15) / 4) * (2.42547-(1.3125)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 43.64142 + (((tickAnim - 19) / 5) * (39.76345-(43.64142)));
            yy = -2.86076 + (((tickAnim - 19) / 5) * (-5.25859-(-2.86076)));
            zz = 2.42547 + (((tickAnim - 19) / 5) * (4.65142-(2.42547)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 39.76345 + (((tickAnim - 24) / 9) * (47.26345-(39.76345)));
            yy = -5.25859 + (((tickAnim - 24) / 9) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 24) / 9) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 33 && tickAnim < 101) {
            xx = 47.26345 + (((tickAnim - 33) / 68) * (47.26345-(47.26345)));
            yy = -5.25859 + (((tickAnim - 33) / 68) * (-5.25859-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 33) / 68) * (4.65142-(4.65142)));
        }
        else if (tickAnim >= 101 && tickAnim < 103) {
            xx = 47.26345 + (((tickAnim - 101) / 2) * (47.53418-(47.26345)));
            yy = -5.25859 + (((tickAnim - 101) / 2) * (-3.18832-(-5.25859)));
            zz = 4.65142 + (((tickAnim - 101) / 2) * (2.68022-(4.65142)));
        }
        else if (tickAnim >= 103 && tickAnim < 107) {
            xx = 47.53418 + (((tickAnim - 103) / 4) * (46.59028-(47.53418)));
            yy = -3.18832 + (((tickAnim - 103) / 4) * (-0.08292-(-3.18832)));
            zz = 2.68022 + (((tickAnim - 103) / 4) * (-0.27657-(2.68022)));
        }
        else if (tickAnim >= 107 && tickAnim < 109) {
            xx = 46.59028 + (((tickAnim - 107) / 2) * (35.96101-(46.59028)));
            yy = -0.08292 + (((tickAnim - 107) / 2) * (1.98735-(-0.08292)));
            zz = -0.27657 + (((tickAnim - 107) / 2) * (-2.24777-(-0.27657)));
        }
        else if (tickAnim >= 109 && tickAnim < 116) {
            xx = 35.96101 + (((tickAnim - 109) / 7) * (27.64472-(35.96101)));
            yy = 1.98735 + (((tickAnim - 109) / 7) * (1.66681-(1.98735)));
            zz = -2.24777 + (((tickAnim - 109) / 7) * (-1.88523-(-2.24777)));
        }
        else if (tickAnim >= 116 && tickAnim < 123) {
            xx = 27.64472 + (((tickAnim - 116) / 7) * (18.63612-(27.64472)));
            yy = 1.66681 + (((tickAnim - 116) / 7) * (1.34627-(1.66681)));
            zz = -1.88523 + (((tickAnim - 116) / 7) * (-1.52268-(-1.88523)));
        }
        else if (tickAnim >= 123 && tickAnim < 153) {
            xx = 18.63612 + (((tickAnim - 123) / 30) * (0-(18.63612)));
            yy = 1.34627 + (((tickAnim - 123) / 30) * (0-(1.34627)));
            zz = -1.52268 + (((tickAnim - 123) / 30) * (0-(-1.52268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (14.69611-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0.68061-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (4.95358-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 48) {
            xx = 14.69611 + (((tickAnim - 18) / 30) * (26.5-(14.69611)));
            yy = 0.68061 + (((tickAnim - 18) / 30) * (0-(0.68061)));
            zz = 4.95358 + (((tickAnim - 18) / 30) * (0-(4.95358)));
        }
        else if (tickAnim >= 48 && tickAnim < 101) {
            xx = 26.5 + (((tickAnim - 48) / 53) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 48) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 53) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 26.5 + (((tickAnim - 101) / 8) * (33-(26.5)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 33 + (((tickAnim - 109) / 8) * (25-(33)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 25 + (((tickAnim - 117) / 20) * (-7-(25)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 160) {
            xx = -7 + (((tickAnim - 137) / 23) * (0-(-7)));
            yy = 0 + (((tickAnim - 137) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (8.90366-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0.42549-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (3.97734-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 8.90366 + (((tickAnim - 30) / 21) * (20-(8.90366)));
            yy = 0.42549 + (((tickAnim - 30) / 21) * (0-(0.42549)));
            zz = 3.97734 + (((tickAnim - 30) / 21) * (0-(3.97734)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 20 + (((tickAnim - 51) / 50) * (20-(20)));
            yy = 0 + (((tickAnim - 51) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 50) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 20 + (((tickAnim - 101) / 8) * (14-(20)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 14 + (((tickAnim - 109) / 8) * (9-(14)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 9 + (((tickAnim - 117) / 20) * (1-(9)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 146) {
            xx = 1 + (((tickAnim - 137) / 9) * (-3.58-(1)));
            yy = 0 + (((tickAnim - 137) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 9) * (0-(0)));
        }
        else if (tickAnim >= 146 && tickAnim < 158) {
            xx = -3.58 + (((tickAnim - 146) / 12) * (0-(-3.58)));
            yy = 0 + (((tickAnim - 146) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 146) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (14.97761-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (-0.28146-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (2.47851-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 56) {
            xx = 14.97761 + (((tickAnim - 33) / 23) * (8.93728-(14.97761)));
            yy = -0.28146 + (((tickAnim - 33) / 23) * (-0.90272-(-0.28146)));
            zz = 2.47851 + (((tickAnim - 33) / 23) * (7.94923-(2.47851)));
        }
        else if (tickAnim >= 56 && tickAnim < 101) {
            xx = 8.93728 + (((tickAnim - 56) / 45) * (9-(8.93728)));
            yy = -0.90272 + (((tickAnim - 56) / 45) * (0-(-0.90272)));
            zz = 7.94923 + (((tickAnim - 56) / 45) * (0-(7.94923)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 9 + (((tickAnim - 101) / 8) * (2-(9)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = 2 + (((tickAnim - 109) / 8) * (12-(2)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 137) {
            xx = 12 + (((tickAnim - 117) / 20) * (-5-(12)));
            yy = 0 + (((tickAnim - 117) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 20) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 158) {
            xx = -5 + (((tickAnim - 137) / 21) * (0-(-5)));
            yy = 0 + (((tickAnim - 137) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 25 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 25) / 26) * (0.92702-(0)));
            yy = 0 + (((tickAnim - 25) / 26) * (1.78986-(0)));
            zz = 0 + (((tickAnim - 25) / 26) * (-4.66942-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 101) {
            xx = 0.92702 + (((tickAnim - 51) / 50) * (1-(0.92702)));
            yy = 1.78986 + (((tickAnim - 51) / 50) * (0-(1.78986)));
            zz = -4.66942 + (((tickAnim - 51) / 50) * (0-(-4.66942)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = 1 + (((tickAnim - 101) / 8) * (-9-(1)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -9 + (((tickAnim - 109) / 8) * (-10-(-9)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -10 + (((tickAnim - 117) / 11) * (-4.38-(-10)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 142) {
            xx = -4.38 + (((tickAnim - 128) / 14) * (0-(-4.38)));
            yy = 0 + (((tickAnim - 128) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 14) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 142) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 31 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 31) / 27) * (-7-(0)));
            yy = 0 + (((tickAnim - 31) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 27) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 101) {
            xx = -7 + (((tickAnim - 58) / 43) * (-8-(-7)));
            yy = 0 + (((tickAnim - 58) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 43) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -8 + (((tickAnim - 101) / 8) * (-13-(-8)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 117) {
            xx = -13 + (((tickAnim - 109) / 8) * (-4-(-13)));
            yy = 0 + (((tickAnim - 109) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 8) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = -4 + (((tickAnim - 117) / 11) * (10-(-4)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 144) {
            xx = 10 + (((tickAnim - 128) / 16) * (4-(10)));
            yy = 0 + (((tickAnim - 128) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 16) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 159) {
            xx = 4 + (((tickAnim - 144) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 144) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 11) / 16) * (-17-(0)));
            yy = 0 + (((tickAnim - 11) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 16) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 101) {
            xx = -17 + (((tickAnim - 27) / 74) * (-17-(-17)));
            yy = 0 + (((tickAnim - 27) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 74) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 109) {
            xx = -17 + (((tickAnim - 101) / 8) * (-4.5-(-17)));
            yy = 0 + (((tickAnim - 101) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 8) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 124) {
            xx = -4.5 + (((tickAnim - 109) / 15) * (4.5-(-4.5)));
            yy = 0 + (((tickAnim - 109) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 15) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 128) {
            xx = 4.5 + (((tickAnim - 124) / 4) * (0.5-(4.5)));
            yy = 0 + (((tickAnim - 124) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 4) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 137) {
            xx = 0.5 + (((tickAnim - 128) / 9) * (7.5-(0.5)));
            yy = 0 + (((tickAnim - 128) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 9) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 142) {
            xx = 7.5 + (((tickAnim - 137) / 5) * (9.67-(7.5)));
            yy = 0 + (((tickAnim - 137) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 5) * (0-(0)));
        }
        else if (tickAnim >= 142 && tickAnim < 148) {
            xx = 9.67 + (((tickAnim - 142) / 6) * (0.83-(9.67)));
            yy = 0 + (((tickAnim - 142) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 6) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = 0.83 + (((tickAnim - 148) / 5) * (0-(0.83)));
            yy = 0 + (((tickAnim - 148) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 48) / 10) * (17.5-(0)));
            yy = 0 + (((tickAnim - 48) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 10) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 17.5 + (((tickAnim - 58) / 7) * (1.22-(17.5)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = 1.22 + (((tickAnim - 65) / 10) * (13.59-(1.22)));
            yy = 0 + (((tickAnim - 65) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 10) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 82) {
            xx = 13.59 + (((tickAnim - 75) / 7) * (2.52-(13.59)));
            yy = 0 + (((tickAnim - 75) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 7) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 89) {
            xx = 2.52 + (((tickAnim - 82) / 7) * (12.28-(2.52)));
            yy = 0 + (((tickAnim - 82) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 7) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 107) {
            xx = 12.28 + (((tickAnim - 89) / 18) * (1.75-(12.28)));
            yy = 0 + (((tickAnim - 89) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 18) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 160) {
            xx = 1.75 + (((tickAnim - 107) / 53) * (0-(1.75)));
            yy = 0 + (((tickAnim - 107) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }

    public void animTailSwing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (19.02874-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (-1.48794-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-9.8898-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 19.02874 + (((tickAnim - 28) / 21) * (18.38634-(19.02874)));
            yy = -1.48794 + (((tickAnim - 28) / 21) * (5.30217-(-1.48794)));
            zz = -9.8898 + (((tickAnim - 28) / 21) * (21.63955-(-9.8898)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = 18.38634 + (((tickAnim - 49) / 31) * (0-(18.38634)));
            yy = 5.30217 + (((tickAnim - 49) / 31) * (0-(5.30217)));
            zz = 21.63955 + (((tickAnim - 49) / 31) * (0-(21.63955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-5.24998-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (2.99318-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-9.54589-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = -5.24998 + (((tickAnim - 28) / 21) * (-6.86109-(-5.24998)));
            yy = 2.99318 + (((tickAnim - 28) / 21) * (2.32803-(2.99318)));
            zz = -9.54589 + (((tickAnim - 28) / 21) * (-7.42458-(-9.54589)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = -6.86109 + (((tickAnim - 49) / 31) * (0-(-6.86109)));
            yy = 2.32803 + (((tickAnim - 49) / 31) * (0-(2.32803)));
            zz = -7.42458 + (((tickAnim - 49) / 31) * (0-(-7.42458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-10-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 28) / 21) * (-5-(0)));
            yy = 0 + (((tickAnim - 28) / 21) * (0-(0)));
            zz = -10 + (((tickAnim - 28) / 21) * (8.06-(-10)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 49) / 31) * (0-(-5)));
            yy = 0 + (((tickAnim - 49) / 31) * (0-(0)));
            zz = 8.06 + (((tickAnim - 49) / 31) * (0-(8.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (2.78877-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.53023-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.6607-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 2.78877 + (((tickAnim - 14) / 14) * (4.96271-(2.78877)));
            yy = -0.53023 + (((tickAnim - 14) / 14) * (0.86717-(-0.53023)));
            zz = 4.6607 + (((tickAnim - 14) / 14) * (-4.92442-(4.6607)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 4.96271 + (((tickAnim - 28) / 21) * (2.05781-(4.96271)));
            yy = 0.86717 + (((tickAnim - 28) / 21) * (-0.51134-(0.86717)));
            zz = -4.92442 + (((tickAnim - 28) / 21) * (5.02093-(-4.92442)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = 2.05781 + (((tickAnim - 49) / 31) * (0-(2.05781)));
            yy = -0.51134 + (((tickAnim - 49) / 31) * (0-(-0.51134)));
            zz = 5.02093 + (((tickAnim - 49) / 31) * (0-(5.02093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (1.38372-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.46886-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.66483-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 1.38372 + (((tickAnim - 14) / 14) * (2.47178-(1.38372)));
            yy = -0.46886 + (((tickAnim - 14) / 14) * (0.65182-(-0.46886)));
            zz = 4.66483 + (((tickAnim - 14) / 14) * (-4.95744-(4.66483)));
        }
        else if (tickAnim >= 28 && tickAnim < 49) {
            xx = 2.47178 + (((tickAnim - 28) / 21) * (-1.32002-(2.47178)));
            yy = 0.65182 + (((tickAnim - 28) / 21) * (1.42991-(0.65182)));
            zz = -4.95744 + (((tickAnim - 28) / 21) * (7.50177-(-4.95744)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = -1.32002 + (((tickAnim - 49) / 31) * (0-(-1.32002)));
            yy = 1.42991 + (((tickAnim - 49) / 31) * (0-(1.42991)));
            zz = 7.50177 + (((tickAnim - 49) / 31) * (0-(7.50177)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (2.80984-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.12284-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.68915-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 2.80984 + (((tickAnim - 14) / 14) * (4.98107-(2.80984)));
            yy = -0.12284 + (((tickAnim - 14) / 14) * (0.43523-(-0.12284)));
            zz = 4.68915 + (((tickAnim - 14) / 14) * (-4.98107-(4.68915)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 4.98107 + (((tickAnim - 28) / 10) * (-2.7785-(4.98107)));
            yy = 0.43523 + (((tickAnim - 28) / 10) * (1.25375-(0.43523)));
            zz = -4.98107 + (((tickAnim - 28) / 10) * (-6.60557-(-4.98107)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = -2.7785 + (((tickAnim - 38) / 11) * (4.72466-(-2.7785)));
            yy = 1.25375 + (((tickAnim - 38) / 11) * (1.56908-(1.25375)));
            zz = -6.60557 + (((tickAnim - 38) / 11) * (7.45848-(-6.60557)));
        }
        else if (tickAnim >= 49 && tickAnim < 80) {
            xx = 4.72466 + (((tickAnim - 49) / 31) * (0-(4.72466)));
            yy = 1.56908 + (((tickAnim - 49) / 31) * (0-(1.56908)));
            zz = 7.45848 + (((tickAnim - 49) / 31) * (0-(7.45848)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (5.66617-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.22787-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (8.29652-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 5.66617 + (((tickAnim - 14) / 12) * (9.95744-(5.66617)));
            yy = 0.22787 + (((tickAnim - 14) / 12) * (0.65182-(0.22787)));
            zz = 8.29652 + (((tickAnim - 14) / 12) * (-7.47178-(8.29652)));
        }
        else if (tickAnim >= 26 && tickAnim < 41) {
            xx = 9.95744 + (((tickAnim - 26) / 15) * (10.32014-(9.95744)));
            yy = 0.65182 + (((tickAnim - 26) / 15) * (0.70112-(0.65182)));
            zz = -7.47178 + (((tickAnim - 26) / 15) * (-7.27776-(-7.47178)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 10.32014 + (((tickAnim - 41) / 9) * (9.10059-(10.32014)));
            yy = 0.70112 + (((tickAnim - 41) / 9) * (-0.62342-(0.70112)));
            zz = -7.27776 + (((tickAnim - 41) / 9) * (8.73095-(-7.27776)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 9.10059 + (((tickAnim - 50) / 30) * (0-(9.10059)));
            yy = -0.62342 + (((tickAnim - 50) / 30) * (0-(-0.62342)));
            zz = 8.73095 + (((tickAnim - 50) / 30) * (0-(8.73095)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (2.87411-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.75247-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (8.56218-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 2.87411 + (((tickAnim - 14) / 12) * (5.00238-(2.87411)));
            yy = 0.75247 + (((tickAnim - 14) / 12) * (-0.10901-(0.75247)));
            zz = 8.56218 + (((tickAnim - 14) / 12) * (-2.49762-(8.56218)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 5.00238 + (((tickAnim - 26) / 17) * (3.48277-(5.00238)));
            yy = -0.10901 + (((tickAnim - 26) / 17) * (0.06636-(-0.10901)));
            zz = -2.49762 + (((tickAnim - 26) / 17) * (-2.58058-(-2.49762)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 3.48277 + (((tickAnim - 43) / 12) * (11.55798-(3.48277)));
            yy = 0.06636 + (((tickAnim - 43) / 12) * (-0.8536-(0.06636)));
            zz = -2.58058 + (((tickAnim - 43) / 12) * (11.17268-(-2.58058)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 11.55798 + (((tickAnim - 55) / 25) * (0-(11.55798)));
            yy = -0.8536 + (((tickAnim - 55) / 25) * (0-(-0.8536)));
            zz = 11.17268 + (((tickAnim - 55) / 25) * (0-(11.17268)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (5.65172-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.48951-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (1.87639-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 26) {
            xx = 5.65172 + (((tickAnim - 14) / 12) * (9.96207-(5.65172)));
            yy = 0.48951 + (((tickAnim - 14) / 12) * (0.43399-(0.48951)));
            zz = 1.87639 + (((tickAnim - 14) / 12) * (-9.99067-(1.87639)));
        }
        else if (tickAnim >= 26 && tickAnim < 43) {
            xx = 9.96207 + (((tickAnim - 26) / 17) * (6.79334-(9.96207)));
            yy = 0.43399 + (((tickAnim - 26) / 17) * (0.60974-(0.43399)));
            zz = -9.99067 + (((tickAnim - 26) / 17) * (-15.07667-(-9.99067)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6.79334 + (((tickAnim - 43) / 7) * (10.92623-(6.79334)));
            yy = 0.60974 + (((tickAnim - 43) / 7) * (1.41745-(0.60974)));
            zz = -15.07667 + (((tickAnim - 43) / 7) * (7.10524-(-15.07667)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = 10.92623 + (((tickAnim - 50) / 30) * (0-(10.92623)));
            yy = 1.41745 + (((tickAnim - 50) / 30) * (0-(1.41745)));
            zz = 7.10524 + (((tickAnim - 50) / 30) * (0-(7.10524)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (2.88999-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.70919-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (5.43432-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 2.88999 + (((tickAnim - 14) / 14) * (5.05919-(2.88999)));
            yy = 0.70919 + (((tickAnim - 14) / 14) * (-0.54094-(0.70919)));
            zz = 5.43432 + (((tickAnim - 14) / 14) * (-12.48848-(5.43432)));
        }
        else if (tickAnim >= 28 && tickAnim < 41) {
            xx = 5.05919 + (((tickAnim - 28) / 13) * (3.59554-(5.05919)));
            yy = -0.54094 + (((tickAnim - 28) / 13) * (-0.41267-(-0.54094)));
            zz = -12.48848 + (((tickAnim - 28) / 13) * (-13.09348-(-12.48848)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 3.59554 + (((tickAnim - 41) / 9) * (3.76374-(3.59554)));
            yy = -0.41267 + (((tickAnim - 41) / 9) * (1.21071-(-0.41267)));
            zz = -13.09348 + (((tickAnim - 41) / 9) * (10.22889-(-13.09348)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 3.76374 + (((tickAnim - 50) / 16) * (12.03226-(3.76374)));
            yy = 1.21071 + (((tickAnim - 50) / 16) * (0.87362-(1.21071)));
            zz = 10.22889 + (((tickAnim - 50) / 16) * (17.71424-(10.22889)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 12.03226 + (((tickAnim - 66) / 14) * (0-(12.03226)));
            yy = 0.87362 + (((tickAnim - 66) / 14) * (0-(0.87362)));
            zz = 17.71424 + (((tickAnim - 66) / 14) * (0-(17.71424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (8.44014-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0.16423-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (4.69267-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 8.44014 + (((tickAnim - 14) / 14) * (15.02822-(8.44014)));
            yy = 0.16423 + (((tickAnim - 14) / 14) * (-0.65182-(0.16423)));
            zz = 4.69267 + (((tickAnim - 14) / 14) * (-4.95744-(4.69267)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 15.02822 + (((tickAnim - 28) / 22) * (10.46477-(15.02822)));
            yy = -0.65182 + (((tickAnim - 28) / 22) * (0.67273-(-0.65182)));
            zz = -4.95744 + (((tickAnim - 28) / 22) * (-6.73126-(-4.95744)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 10.46477 + (((tickAnim - 50) / 16) * (20.29091-(10.46477)));
            yy = 0.67273 + (((tickAnim - 50) / 16) * (0.71289-(0.67273)));
            zz = -6.73126 + (((tickAnim - 50) / 16) * (13.87414-(-6.73126)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 20.29091 + (((tickAnim - 66) / 14) * (0-(20.29091)));
            yy = 0.71289 + (((tickAnim - 66) / 14) * (0-(0.71289)));
            zz = 13.87414 + (((tickAnim - 66) / 14) * (0-(13.87414)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (7.2214-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.13161-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (11.85917-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 7.2214 + (((tickAnim - 14) / 14) * (12.46207-(7.2214)));
            yy = 1.13161 + (((tickAnim - 14) / 14) * (0.43399-(1.13161)));
            zz = 11.85917 + (((tickAnim - 14) / 14) * (-9.99067-(11.85917)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 12.46207 + (((tickAnim - 28) / 22) * (8.51498-(12.46207)));
            yy = 0.43399 + (((tickAnim - 28) / 22) * (0.72013-(0.43399)));
            zz = -9.99067 + (((tickAnim - 28) / 22) * (-14.65301-(-9.99067)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 8.51498 + (((tickAnim - 50) / 16) * (16.93255-(8.51498)));
            yy = 0.72013 + (((tickAnim - 50) / 16) * (0.17012-(0.72013)));
            zz = -14.65301 + (((tickAnim - 50) / 16) * (17.23056-(-14.65301)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 16.93255 + (((tickAnim - 66) / 14) * (0-(16.93255)));
            yy = 0.17012 + (((tickAnim - 66) / 14) * (0-(0.17012)));
            zz = 17.23056 + (((tickAnim - 66) / 14) * (0-(17.23056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5.56174-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.18341-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (3.50629-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 41) {
            xx = -5.56174 + (((tickAnim - 13) / 28) * (-10.56174-(-5.56174)));
            yy = 1.18341 + (((tickAnim - 13) / 28) * (1.18341-(1.18341)));
            zz = 3.50629 + (((tickAnim - 13) / 28) * (3.50629-(3.50629)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -10.56174 + (((tickAnim - 41) / 9) * (-5.56174-(-10.56174)));
            yy = 1.18341 + (((tickAnim - 41) / 9) * (1.18341-(1.18341)));
            zz = 3.50629 + (((tickAnim - 41) / 9) * (3.50629-(3.50629)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -5.56174 + (((tickAnim - 50) / 30) * (0-(-5.56174)));
            yy = 1.18341 + (((tickAnim - 50) / 30) * (0-(1.18341)));
            zz = 3.50629 + (((tickAnim - 50) / 30) * (0-(3.50629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.4595-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.33843-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-10.10737-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 57) {
            xx = 1.4595 + (((tickAnim - 20) / 37) * (1.4595-(1.4595)));
            yy = 1.33843 + (((tickAnim - 20) / 37) * (1.33843-(1.33843)));
            zz = -10.10737 + (((tickAnim - 20) / 37) * (-10.10737-(-10.10737)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 1.4595 + (((tickAnim - 57) / 23) * (0-(1.4595)));
            yy = 1.33843 + (((tickAnim - 57) / 23) * (0-(1.33843)));
            zz = -10.10737 + (((tickAnim - 57) / 23) * (0-(-10.10737)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (4.69102-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.13029-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-20.32451-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 4.69102 + (((tickAnim - 20) / 14) * (4.69102-(4.69102)));
            yy = 2.13029 + (((tickAnim - 20) / 14) * (2.13029-(2.13029)));
            zz = -20.32451 + (((tickAnim - 20) / 14) * (-20.32451-(-20.32451)));
        }
        else if (tickAnim >= 34 && tickAnim < 57) {
            xx = 4.69102 + (((tickAnim - 34) / 23) * (4.69102-(4.69102)));
            yy = 2.13029 + (((tickAnim - 34) / 23) * (2.13029-(2.13029)));
            zz = -20.32451 + (((tickAnim - 34) / 23) * (-20.32451-(-20.32451)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 4.69102 + (((tickAnim - 57) / 23) * (0-(4.69102)));
            yy = 2.13029 + (((tickAnim - 57) / 23) * (0-(2.13029)));
            zz = -20.32451 + (((tickAnim - 57) / 23) * (0-(-20.32451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.11435-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (9.91358-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-18.68155-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0.11435 + (((tickAnim - 23) / 17) * (-4.88565-(0.11435)));
            yy = 9.91358 + (((tickAnim - 23) / 17) * (9.91358-(9.91358)));
            zz = -18.68155 + (((tickAnim - 23) / 17) * (-18.68155-(-18.68155)));
        }
        else if (tickAnim >= 40 && tickAnim < 61) {
            xx = -4.88565 + (((tickAnim - 40) / 21) * (0.11435-(-4.88565)));
            yy = 9.91358 + (((tickAnim - 40) / 21) * (9.91358-(9.91358)));
            zz = -18.68155 + (((tickAnim - 40) / 21) * (-18.68155-(-18.68155)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 0.11435 + (((tickAnim - 61) / 19) * (0-(0.11435)));
            yy = 9.91358 + (((tickAnim - 61) / 19) * (0-(9.91358)));
            zz = -18.68155 + (((tickAnim - 61) / 19) * (0-(-18.68155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.02832-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-4.95712-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-18.15426-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0.02832 + (((tickAnim - 23) / 10) * (-4.97168-(0.02832)));
            yy = -4.95712 + (((tickAnim - 23) / 10) * (-4.95712-(-4.95712)));
            zz = -18.15426 + (((tickAnim - 23) / 10) * (-18.15426-(-18.15426)));
        }
        else if (tickAnim >= 33 && tickAnim < 61) {
            xx = -4.97168 + (((tickAnim - 33) / 28) * (0.02832-(-4.97168)));
            yy = -4.95712 + (((tickAnim - 33) / 28) * (-4.95712-(-4.95712)));
            zz = -18.15426 + (((tickAnim - 33) / 28) * (-18.15426-(-18.15426)));
        }
        else if (tickAnim >= 61 && tickAnim < 80) {
            xx = 0.02832 + (((tickAnim - 61) / 19) * (0-(0.02832)));
            yy = -4.95712 + (((tickAnim - 61) / 19) * (0-(-4.95712)));
            zz = -18.15426 + (((tickAnim - 61) / 19) * (0-(-18.15426)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-15-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = -15 + (((tickAnim - 27) / 16) * (-15-(-15)));
        }
        else if (tickAnim >= 43 && tickAnim < 63) {
            xx = -12.5 + (((tickAnim - 43) / 20) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 43) / 20) * (0-(0)));
            zz = -15 + (((tickAnim - 43) / 20) * (-15-(-15)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = -15 + (((tickAnim - 63) / 17) * (0-(-15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (-17.5-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 27) / 11) * (2.5-(-2.5)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = -17.5 + (((tickAnim - 27) / 11) * (-17.5-(-17.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 63) {
            xx = 2.5 + (((tickAnim - 38) / 25) * (-2.5-(2.5)));
            yy = 0 + (((tickAnim - 38) / 25) * (0-(0)));
            zz = -17.5 + (((tickAnim - 38) / 25) * (-17.5-(-17.5)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 63) / 17) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 63) / 17) * (0-(0)));
            zz = -17.5 + (((tickAnim - 63) / 17) * (0-(-17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (17.5-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 17.5 + (((tickAnim - 39) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 3 + (((tickAnim - 9) / 5) * (11.45-(3)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.45 + (((tickAnim - 14) / 5) * (17.87-(11.45)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17.87 + (((tickAnim - 19) / 9) * (3.14-(17.87)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 3.14 + (((tickAnim - 28) / 7) * (-0.62-(3.14)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -0.62 + (((tickAnim - 35) / 7) * (-11.21-(-0.62)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -11.21 + (((tickAnim - 42) / 8) * (0-(-11.21)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 11 + (((tickAnim - 9) / 5) * (16.98-(11)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 16.98 + (((tickAnim - 14) / 5) * (18.16-(16.98)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 18.16 + (((tickAnim - 19) / 9) * (35.73-(18.16)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 35.73 + (((tickAnim - 28) / 7) * (32.54-(35.73)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 32.54 + (((tickAnim - 35) / 7) * (-13.15-(32.54)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -13.15 + (((tickAnim - 42) / 8) * (0-(-13.15)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 4 + (((tickAnim - 9) / 5) * (11.27-(4)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 11.27 + (((tickAnim - 14) / 5) * (21.73-(11.27)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 21.73 + (((tickAnim - 19) / 4) * (28.54-(21.73)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 28.54 + (((tickAnim - 23) / 5) * (13.36-(28.54)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 13.36 + (((tickAnim - 28) / 7) * (-9.38-(13.36)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -9.38 + (((tickAnim - 35) / 7) * (-9.13-(-9.38)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -9.13 + (((tickAnim - 42) / 3) * (10.52-(-9.13)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 10.52 + (((tickAnim - 45) / 5) * (0-(10.52)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));
        
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -5 + (((tickAnim - 18) / 15) * (-5-(-5)));
            zz = -6.5 + (((tickAnim - 18) / 15) * (-6.5-(-6.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            zz = -6.5 + (((tickAnim - 33) / 17) * (0-(-6.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 7.5 + (((tickAnim - 18) / 15) * (7.5-(7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 33) / 17) * (0-(7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




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
            xx = -0.5 + (((tickAnim - 18) / 15) * (-0.5-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -0.5 + (((tickAnim - 33) / 17) * (0-(-0.5)));
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
            xx = -0.5 + (((tickAnim - 18) / 15) * (2-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (9.5-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 33) / 17) * (0-(9.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (7-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 33) / 17) * (0-(7)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (9.5-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 33) / 17) * (0-(9.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (4.5-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 33) / 17) * (0-(4.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -0.5 + (((tickAnim - 18) / 15) * (2-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 18) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 33) / 17) * (0-(2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-4)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*154/1.5))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.94178-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (4.50731-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 12.94178 + (((tickAnim - 18) / 14) * (12.94043-(12.94178)));
            yy = 4.50731 + (((tickAnim - 18) / 14) * (-0.49254-(4.50731)));
            zz = -6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.5483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.51+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 12.94043 + (((tickAnim - 32) / 18) * (0-(12.94043)));
            yy = -0.49254 + (((tickAnim - 32) / 18) * (0-(-0.49254)));
            zz = -6.5483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.5483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1.08916-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.83623-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 1.08916 + (((tickAnim - 18) / 14) * (1.08916-(1.08916)));
            yy = -0.83623 + (((tickAnim - 18) / 14) * (-0.83623-(-0.83623)));
            zz = -8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 1.08916 + (((tickAnim - 32) / 18) * (0-(1.08916)));
            yy = -0.83623 + (((tickAnim - 32) / 18) * (0-(-0.83623)));
            zz = -8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-8.1772+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.00254-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.48716-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.00254 + (((tickAnim - 18) / 14) * (-0.00254-(-0.00254)));
            yy = 1.48716 + (((tickAnim - 18) / 14) * (1.48716-(1.48716)));
            zz = -8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.00254 + (((tickAnim - 32) / 18) * (0-(-0.00254)));
            yy = 1.48716 + (((tickAnim - 32) / 18) * (0-(1.48716)));
            zz = -8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-8.4039+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-0.98579-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.92279-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = -0.98579 + (((tickAnim - 18) / 14) * (-0.98579-(-0.98579)));
            yy = 1.92279 + (((tickAnim - 18) / 14) * (1.92279-(1.92279)));
            zz = -3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = -0.98579 + (((tickAnim - 32) / 18) * (0-(-0.98579)));
            yy = 1.92279 + (((tickAnim - 32) / 18) * (0-(1.92279)));
            zz = -3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-3.7709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.67249-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.29303-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 32) {
            xx = 0.67249 + (((tickAnim - 18) / 14) * (0.67249-(0.67249)));
            yy = 1.29303 + (((tickAnim - 18) / 14) * (1.29303-(1.29303)));
            zz = -6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 18) / 14) * (-6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1-(-6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else if (tickAnim >= 32 && tickAnim < 50) {
            xx = 0.67249 + (((tickAnim - 32) / 18) * (0-(0.67249)));
            yy = 1.29303 + (((tickAnim - 32) / 18) * (0-(1.29303)));
            zz = -6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1 + (((tickAnim - 32) / 18) * (0-(-6.0433+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125/0.75-20))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 13) / 15) * (7.5-(5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 7.5 + (((tickAnim - 28) / 16) * (5-(7.5)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 44) / 16) * (0-(5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 7.5 + (((tickAnim - 29) / 31) * (0-(7.5)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 13) / 8) * (8.75-(5)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 21) / 7) * (2.5-(8.75)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 2.5 + (((tickAnim - 28) / 16) * (5-(2.5)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = 5 + (((tickAnim - 44) / 16) * (0-(5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 13) / 6) * (-10.69-(-5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 37) {
            xx = -10.69 + (((tickAnim - 19) / 18) * (-3.42-(-10.69)));
            yy = 0 + (((tickAnim - 19) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 18) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 60) {
            xx = -3.42 + (((tickAnim - 37) / 23) * (0-(-3.42)));
            yy = 0 + (((tickAnim - 37) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 13) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 28) / 16) * (-5-(0)));
            yy = 0 + (((tickAnim - 28) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 16) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 44) / 16) * (0-(-5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 13) / 13) * (-15-(-5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 44) {
            xx = -15 + (((tickAnim - 26) / 18) * (-5-(-15)));
            yy = 0 + (((tickAnim - 26) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 18) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 44) / 16) * (0-(-5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = -2.5 + (((tickAnim - 13) / 13) * (-12.5-(-2.5)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 44) {
            xx = -12.5 + (((tickAnim - 26) / 18) * (-2.5-(-12.5)));
            yy = 0 + (((tickAnim - 26) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 18) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -2.5 + (((tickAnim - 44) / 16) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 44) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 25 + (((tickAnim - 23) / 6) * (25-(25)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = 25 + (((tickAnim - 29) / 8) * (0-(25)));
            yy = 0 + (((tickAnim - 29) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 1.5 + (((tickAnim - 10) / 20) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 3 + (((tickAnim - 10) / 20) * (-3-(3)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 30) / 20) * (0-(1.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 2 + (((tickAnim - 10) / 20) * (2-(2)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 4 + (((tickAnim - 10) / 20) * (-4-(4)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 2 + (((tickAnim - 30) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -4 + (((tickAnim - 30) / 20) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (8.92365-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.57822-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-10.12234-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 8.92365 + (((tickAnim - 10) / 20) * (4.67158-(8.92365)));
            yy = 4.57822 + (((tickAnim - 10) / 20) * (-5.47988-(4.57822)));
            zz = -10.12234 + (((tickAnim - 10) / 20) * (3.23669-(-10.12234)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.67158 + (((tickAnim - 30) / 20) * (0-(4.67158)));
            yy = -5.47988 + (((tickAnim - 30) / 20) * (0-(-5.47988)));
            zz = 3.23669 + (((tickAnim - 30) / 20) * (0-(3.23669)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 10) / 20) * (-23.75-(-22.5)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 30) / 20) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.12353-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.24305-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.95155-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 10.12353 + (((tickAnim - 10) / 20) * (12.55995-(10.12353)));
            yy = -7.24305 + (((tickAnim - 10) / 20) * (3.52988-(-7.24305)));
            zz = -1.95155 + (((tickAnim - 10) / 20) * (1.28565-(-1.95155)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.55995 + (((tickAnim - 30) / 20) * (0-(12.55995)));
            yy = 3.52988 + (((tickAnim - 30) / 20) * (0-(3.52988)));
            zz = 1.28565 + (((tickAnim - 30) / 20) * (0-(1.28565)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.95512-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.70146-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.79933-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 1.95512 + (((tickAnim - 10) / 20) * (8.38183-(1.95512)));
            yy = 1.70146 + (((tickAnim - 10) / 20) * (-4.49215-(1.70146)));
            zz = -9.79933 + (((tickAnim - 10) / 20) * (6.67994-(-9.79933)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.38183 + (((tickAnim - 30) / 20) * (0-(8.38183)));
            yy = -4.49215 + (((tickAnim - 30) / 20) * (0-(-4.49215)));
            zz = 6.67994 + (((tickAnim - 30) / 20) * (0-(6.67994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -25 + (((tickAnim - 10) / 20) * (-22.5-(-25)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 30) / 20) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 10) / 20) * (15-(20)));
            yy = 0 + (((tickAnim - 10) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 20) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15 + (((tickAnim - 30) / 20) * (0-(15)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.0897-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.03435-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (10.28443-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.0897 + (((tickAnim - 7) / 6) * (22.5-(-1.0897)));
            yy = -0.03435 + (((tickAnim - 7) / 6) * (0-(-0.03435)));
            zz = 10.28443 + (((tickAnim - 7) / 6) * (15-(10.28443)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 22.5 + (((tickAnim - 13) / 10) * (34.19755-(22.5)));
            yy = 0 + (((tickAnim - 13) / 10) * (0.5176-(0)));
            zz = 15 + (((tickAnim - 13) / 10) * (-17.5444-(15)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 34.19755 + (((tickAnim - 23) / 27) * (0-(34.19755)));
            yy = 0.5176 + (((tickAnim - 23) / 27) * (0-(0.5176)));
            zz = -17.5444 + (((tickAnim - 23) / 27) * (0-(-17.5444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.28905-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.03034-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (8.85666-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 2.28905 + (((tickAnim - 8) / 6) * (15-(2.28905)));
            yy = -0.03034 + (((tickAnim - 8) / 6) * (0-(-0.03034)));
            zz = 8.85666 + (((tickAnim - 8) / 6) * (15-(8.85666)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 15 + (((tickAnim - 14) / 9) * (9.19755-(15)));
            yy = 0 + (((tickAnim - 14) / 9) * (0.5176-(0)));
            zz = 15 + (((tickAnim - 14) / 9) * (-17.5444-(15)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 9.19755 + (((tickAnim - 23) / 27) * (0-(9.19755)));
            yy = 0.5176 + (((tickAnim - 23) / 27) * (0-(0.5176)));
            zz = -17.5444 + (((tickAnim - 23) / 27) * (0-(-17.5444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.17852-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.02484-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.20213-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 1.17852 + (((tickAnim - 10) / 7) * (10-(1.17852)));
            yy = -0.02484 + (((tickAnim - 10) / 7) * (0-(-0.02484)));
            zz = 7.20213 + (((tickAnim - 10) / 7) * (15-(7.20213)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 17) / 8) * (11.69755-(10)));
            yy = 0 + (((tickAnim - 17) / 8) * (0.5176-(0)));
            zz = 15 + (((tickAnim - 17) / 8) * (-17.5444-(15)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 11.69755 + (((tickAnim - 25) / 25) * (0-(11.69755)));
            yy = 0.5176 + (((tickAnim - 25) / 25) * (0-(0.5176)));
            zz = -17.5444 + (((tickAnim - 25) / 25) * (0-(-17.5444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-2.54585-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.07204-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (5.63978-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.54585 + (((tickAnim - 13) / 7) * (0-(-2.54585)));
            yy = -0.07204 + (((tickAnim - 13) / 7) * (0-(-0.07204)));
            zz = 5.63978 + (((tickAnim - 13) / 7) * (15-(5.63978)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (1.23794-(0)));
            yy = 0 + (((tickAnim - 20) / 8) * (1.94507-(0)));
            zz = 15 + (((tickAnim - 20) / 8) * (-17.27409-(15)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 1.23794 + (((tickAnim - 28) / 22) * (0-(1.23794)));
            yy = 1.94507 + (((tickAnim - 28) / 22) * (0-(1.94507)));
            zz = -17.27409 + (((tickAnim - 28) / 22) * (0-(-17.27409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.82245-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.01426-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.36303-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -3.82245 + (((tickAnim - 15) / 9) * (5-(-3.82245)));
            yy = -0.01426 + (((tickAnim - 15) / 9) * (0-(-0.01426)));
            zz = 4.36303 + (((tickAnim - 15) / 9) * (15-(4.36303)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 24) / 9) * (4.19755-(5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0.5176-(0)));
            zz = 15 + (((tickAnim - 24) / 9) * (-17.5444-(15)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.19755 + (((tickAnim - 33) / 17) * (0-(4.19755)));
            yy = 0.5176 + (((tickAnim - 33) / 17) * (0-(0.5176)));
            zz = -17.5444 + (((tickAnim - 33) / 17) * (0-(-17.5444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-3.89523-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-0.01152-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (3.65127-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -3.89523 + (((tickAnim - 16) / 12) * (5-(-3.89523)));
            yy = -0.01152 + (((tickAnim - 16) / 12) * (0-(-0.01152)));
            zz = 3.65127 + (((tickAnim - 16) / 12) * (15-(3.65127)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 28) / 7) * (-0.80245-(5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0.5176-(0)));
            zz = 15 + (((tickAnim - 28) / 7) * (-17.5444-(15)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.80245 + (((tickAnim - 35) / 15) * (0-(-0.80245)));
            yy = 0.5176 + (((tickAnim - 35) / 15) * (0-(0.5176)));
            zz = -17.5444 + (((tickAnim - 35) / 15) * (0-(-17.5444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
        
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*0.1), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*0.5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2-115))*0.8));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1 + (((tickAnim - 0) / 4) * (-14-(-1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -14 + (((tickAnim - 4) / 5) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -18.75 + (((tickAnim - 9) / 7) * (-13-(-18.75)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -13 + (((tickAnim - 16) / 7) * (-7.37998-(-13)));
            yy = 0 + (((tickAnim - 16) / 7) * (-0.00532-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0.00312-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -7.37998 + (((tickAnim - 23) / 7) * (-1.99993-(-7.37998)));
            yy = -0.00532 + (((tickAnim - 23) / 7) * (-0.01-(-0.00532)));
            zz = 0.00312 + (((tickAnim - 23) / 7) * (0.00588-(0.00312)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.99993 + (((tickAnim - 30) / 5) * (7-(-1.99993)));
            yy = -0.01 + (((tickAnim - 30) / 5) * (0-(-0.01)));
            zz = 0.00588 + (((tickAnim - 30) / 5) * (0-(0.00588)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 35) / 5) * (-1-(7)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 4) * (-1-(-1)));
            zz = -0.75 + (((tickAnim - 0) / 4) * (0.09-(-0.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 4) / 12) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 12) * (-1-(-1)));
            zz = 0.09 + (((tickAnim - 4) / 12) * (-2.5-(0.09)));
        }
        else if (tickAnim >= 16 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 16) / 19) * (0-(0)));
            yy = -1 + (((tickAnim - 16) / 19) * (-1-(-1)));
            zz = -2.5 + (((tickAnim - 16) / 19) * (-1-(-2.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 35) / 5) * (-1-(-1)));
            zz = -1 + (((tickAnim - 35) / 5) * (-0.75-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17 + (((tickAnim - 0) / 4) * (9-(17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 9 + (((tickAnim - 4) / 5) * (-3.07-(9)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 16) {
            xx = -3.07 + (((tickAnim - 9) / 7) * (-9-(-3.07)));
            yy = 0 + (((tickAnim - 9) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 7) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -9 + (((tickAnim - 16) / 7) * (-0.92006-(-9)));
            yy = 0 + (((tickAnim - 16) / 7) * (0.01569-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (-0.00981-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -0.92006 + (((tickAnim - 23) / 7) * (4.99958-(-0.92006)));
            yy = 0.01569 + (((tickAnim - 23) / 7) * (0.05629-(0.01569)));
            zz = -0.00981 + (((tickAnim - 23) / 7) * (-0.04085-(-0.00981)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.99958 + (((tickAnim - 30) / 5) * (4.5-(4.99958)));
            yy = 0.05629 + (((tickAnim - 30) / 5) * (0-(0.05629)));
            zz = -0.04085 + (((tickAnim - 30) / 5) * (0-(-0.04085)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.5 + (((tickAnim - 35) / 5) * (17-(4.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 13.5 + (((tickAnim - 4) / 5) * (13.93-(13.5)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 13.93 + (((tickAnim - 9) / 4) * (8.53-(13.93)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 8.53 + (((tickAnim - 13) / 3) * (20-(8.53)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 16) / 7) * (7.85004-(20)));
            yy = 0 + (((tickAnim - 16) / 7) * (-0.00863-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0.00882-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 7.85004 + (((tickAnim - 23) / 7) * (-2.99956-(7.85004)));
            yy = -0.00863 + (((tickAnim - 23) / 7) * (-0.04482-(-0.00863)));
            zz = 0.00882 + (((tickAnim - 23) / 7) * (0.06762-(0.00882)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -2.99956 + (((tickAnim - 30) / 5) * (-9.44-(-2.99956)));
            yy = -0.04482 + (((tickAnim - 30) / 5) * (0-(-0.04482)));
            zz = 0.06762 + (((tickAnim - 30) / 5) * (0-(0.06762)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -9.44 + (((tickAnim - 35) / 5) * (-5-(-9.44)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 36) / 4) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5 + (((tickAnim - 0) / 6) * (9-(-5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 9 + (((tickAnim - 6) / 4) * (18-(9)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 18 + (((tickAnim - 10) / 4) * (19.00006-(18)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.0136-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-0.00817-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 19.00006 + (((tickAnim - 14) / 5) * (5-(19.00006)));
            yy = 0.0136 + (((tickAnim - 14) / 5) * (0-(0.0136)));
            zz = -0.00817 + (((tickAnim - 14) / 5) * (0-(-0.00817)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 19) / 4) * (-13-(5)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -13 + (((tickAnim - 23) / 3) * (-21.36-(-13)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -21.36 + (((tickAnim - 26) / 4) * (-15-(-21.36)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -15 + (((tickAnim - 30) / 3) * (-11-(-15)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -11 + (((tickAnim - 33) / 6) * (-5-(-11)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 14) * (-1.41-(-1)));
            zz = -0.5 + (((tickAnim - 0) / 14) * (-1.29-(-0.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -1.41 + (((tickAnim - 14) / 16) * (-2-(-1.41)));
            zz = -1.29 + (((tickAnim - 14) / 16) * (-1.75-(-1.29)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -2 + (((tickAnim - 30) / 10) * (-1-(-2)));
            zz = -1.75 + (((tickAnim - 30) / 10) * (-0.5-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3 + (((tickAnim - 0) / 6) * (1-(3)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 6) / 4) * (-6-(1)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -6 + (((tickAnim - 10) / 4) * (1.99977-(-6)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.02983-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0.04679-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 1.99977 + (((tickAnim - 14) / 5) * (25-(1.99977)));
            yy = -0.02983 + (((tickAnim - 14) / 5) * (0-(-0.02983)));
            zz = 0.04679 + (((tickAnim - 14) / 5) * (0-(0.04679)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 25 + (((tickAnim - 19) / 4) * (23-(25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 23) / 7) * (-10-(23)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 30) / 3) * (-13-(-10)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -13 + (((tickAnim - 33) / 6) * (3-(-13)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2 + (((tickAnim - 0) / 6) * (-10-(2)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 6) / 4) * (-11-(-10)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -11 + (((tickAnim - 10) / 4) * (-4.5-(-11)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -4.5 + (((tickAnim - 14) / 5) * (-3-(-4.5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -3 + (((tickAnim - 19) / 4) * (8-(-3)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 8 + (((tickAnim - 23) / 7) * (3-(8)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 3 + (((tickAnim - 30) / 5) * (24-(3)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 24 + (((tickAnim - 35) / 4) * (2-(24)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2))*0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+100))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*1));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 17 + (((tickAnim - 0) / 9) * (25-(17)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 9) / 4) * (32-(25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 32 + (((tickAnim - 13) / 3) * (21-(32)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 21 + (((tickAnim - 16) / 5) * (-4-(21)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -4 + (((tickAnim - 21) / 5) * (-7-(-4)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -7 + (((tickAnim - 26) / 7) * (6-(-7)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 6 + (((tickAnim - 33) / 7) * (17-(6)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = -2.25 + (((tickAnim - 0) / 9) * (-3.25-(-2.25)));
            zz = -2.5 + (((tickAnim - 0) / 9) * (-3.5-(-2.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -3.25 + (((tickAnim - 9) / 4) * (-4.5-(-3.25)));
            zz = -3.5 + (((tickAnim - 9) / 4) * (-4-(-3.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -4.5 + (((tickAnim - 13) / 3) * (-2.75-(-4.5)));
            zz = -4 + (((tickAnim - 13) / 3) * (0-(-4)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = -2.75 + (((tickAnim - 16) / 5) * (-1.4-(-2.75)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = -1.4 + (((tickAnim - 21) / 5) * (0.14-(-1.4)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0.14 + (((tickAnim - 26) / 7) * (-1-(0.14)));
            zz = 0 + (((tickAnim - 26) / 7) * (-1.25-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -1 + (((tickAnim - 33) / 7) * (-2.25-(-1)));
            zz = -1.25 + (((tickAnim - 33) / 7) * (-2.5-(-1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -4.00137 + (((tickAnim - 0) / 9) * (-10.00389-(-4.00137)));
            yy = 0.07119 + (((tickAnim - 0) / 9) * (-0.1703-(0.07119)));
            zz = 0.1562 + (((tickAnim - 0) / 9) * (0.1901-(0.1562)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10.00389 + (((tickAnim - 9) / 4) * (-27-(-10.00389)));
            yy = -0.1703 + (((tickAnim - 9) / 4) * (0-(-0.1703)));
            zz = 0.1901 + (((tickAnim - 9) / 4) * (0-(0.1901)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -27 + (((tickAnim - 13) / 3) * (-33-(-27)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -33 + (((tickAnim - 16) / 5) * (-8-(-33)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -8 + (((tickAnim - 21) / 5) * (9-(-8)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 9 + (((tickAnim - 26) / 7) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 26) / 7) * (0.1968-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (-0.00956-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.49756 + (((tickAnim - 33) / 7) * (-4.00137-(2.49756)));
            yy = 0.1968 + (((tickAnim - 33) / 7) * (0.07119-(0.1968)));
            zz = -0.00956 + (((tickAnim - 33) / 7) * (0.1562-(-0.00956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -9.99865 + (((tickAnim - 0) / 9) * (-16.5-(-9.99865)));
            yy = -0.02017 + (((tickAnim - 0) / 9) * (0-(-0.02017)));
            zz = -0.1532 + (((tickAnim - 0) / 9) * (0-(-0.1532)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -16.5 + (((tickAnim - 9) / 4) * (-1-(-16.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1 + (((tickAnim - 13) / 3) * (14-(-1)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 14 + (((tickAnim - 16) / 5) * (11-(14)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 11 + (((tickAnim - 21) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (-0.0973-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (-0.01579-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 33) / 7) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = -0.0973 + (((tickAnim - 33) / 7) * (-0.02017-(-0.0973)));
            zz = -0.01579 + (((tickAnim - 33) / 7) * (-0.1532-(-0.01579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -4 + (((tickAnim - 0) / 5) * (-7-(-4)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -7 + (((tickAnim - 5) / 7) * (6-(-7)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 6 + (((tickAnim - 12) / 7) * (17-(6)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 17 + (((tickAnim - 19) / 9) * (25-(17)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 25 + (((tickAnim - 28) / 4) * (32-(25)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 32 + (((tickAnim - 32) / 3) * (21-(32)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 21 + (((tickAnim - 35) / 4) * (0.17-(21)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 0) / 5) * (-0.14-(1.4)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -0.14 + (((tickAnim - 5) / 7) * (1-(-0.14)));
            zz = 0 + (((tickAnim - 5) / 7) * (1.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 12) / 7) * (2.25-(1)));
            zz = 1.25 + (((tickAnim - 12) / 7) * (2.5-(1.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            yy = 2.25 + (((tickAnim - 19) / 9) * (3.25-(2.25)));
            zz = 2.5 + (((tickAnim - 19) / 9) * (3.5-(2.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 3.25 + (((tickAnim - 28) / 4) * (4.5-(3.25)));
            zz = 3.5 + (((tickAnim - 28) / 4) * (4-(3.5)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 4.5 + (((tickAnim - 32) / 3) * (2.75-(4.5)));
            zz = 4 + (((tickAnim - 32) / 3) * (0-(4)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            yy = 2.75 + (((tickAnim - 35) / 4) * (1.62-(2.75)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -8 + (((tickAnim - 0) / 5) * (9-(-8)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 9 + (((tickAnim - 5) / 7) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 5) / 7) * (-0.1968-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0.0096-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 2.49756 + (((tickAnim - 12) / 7) * (-4.00137-(2.49756)));
            yy = -0.1968 + (((tickAnim - 12) / 7) * (-0.0712-(-0.1968)));
            zz = 0.0096 + (((tickAnim - 12) / 7) * (-0.1562-(0.0096)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -4.00137 + (((tickAnim - 19) / 9) * (-10.00389-(-4.00137)));
            yy = -0.0712 + (((tickAnim - 19) / 9) * (0.1703-(-0.0712)));
            zz = -0.1562 + (((tickAnim - 19) / 9) * (-0.1901-(-0.1562)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -10.00389 + (((tickAnim - 28) / 4) * (-27-(-10.00389)));
            yy = 0.1703 + (((tickAnim - 28) / 4) * (0-(0.1703)));
            zz = -0.1901 + (((tickAnim - 28) / 4) * (0-(-0.1901)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -27 + (((tickAnim - 32) / 3) * (-33-(-27)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = -33 + (((tickAnim - 35) / 4) * (-12.17-(-33)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11 + (((tickAnim - 0) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0.0973-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0.0158-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 12) / 7) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = 0.0973 + (((tickAnim - 12) / 7) * (0.0202-(0.0973)));
            zz = 0.0158 + (((tickAnim - 12) / 7) * (0.1532-(0.0158)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -9.99865 + (((tickAnim - 19) / 9) * (-16.5-(-9.99865)));
            yy = 0.0202 + (((tickAnim - 19) / 9) * (0-(0.0202)));
            zz = 0.1532 + (((tickAnim - 19) / 9) * (0-(0.1532)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -16.5 + (((tickAnim - 28) / 4) * (-1-(-16.5)));
            yy = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -1 + (((tickAnim - 32) / 3) * (14-(-1)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 39) {
            xx = 14 + (((tickAnim - 35) / 4) * (11.5-(14)));
            yy = 0 + (((tickAnim - 35) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*2), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*2), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-1), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*1), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0), neck6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-1), neck6.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraApatosaurus entity = (EntityPrehistoricFloraApatosaurus) entitylivingbaseIn;

        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75+50))*0.1), hip.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*0.5), hip.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75-115))*0.8));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -1 + (((tickAnim - 0) / 4) * (-14-(-1)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -14 + (((tickAnim - 4) / 4) * (-18.75-(-14)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -18.75 + (((tickAnim - 8) / 6) * (-13-(-18.75)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -13 + (((tickAnim - 14) / 6) * (-7.37998-(-13)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.00532-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0.00312-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -7.37998 + (((tickAnim - 20) / 6) * (-1.99993-(-7.37998)));
            yy = -0.00532 + (((tickAnim - 20) / 6) * (-0.01-(-0.00532)));
            zz = 0.00312 + (((tickAnim - 20) / 6) * (0.00588-(0.00312)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -1.99993 + (((tickAnim - 26) / 4) * (7-(-1.99993)));
            yy = -0.01 + (((tickAnim - 26) / 4) * (0-(-0.01)));
            zz = 0.00588 + (((tickAnim - 26) / 4) * (0-(0.00588)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 30) / 5) * (-1-(7)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 4) * (-1-(-1)));
            zz = -0.75 + (((tickAnim - 0) / 4) * (0.09-(-0.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            yy = -1 + (((tickAnim - 4) / 10) * (-1-(-1)));
            zz = 0.09 + (((tickAnim - 4) / 10) * (-2.5-(0.09)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -1 + (((tickAnim - 14) / 16) * (-1-(-1)));
            zz = -2.5 + (((tickAnim - 14) / 16) * (-1-(-2.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 30) / 5) * (-1-(-1)));
            zz = -1 + (((tickAnim - 30) / 5) * (-0.75-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 17 + (((tickAnim - 0) / 4) * (9-(17)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 4) / 4) * (-3.07-(9)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -3.07 + (((tickAnim - 8) / 6) * (-9-(-3.07)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -9 + (((tickAnim - 14) / 6) * (-0.92006-(-9)));
            yy = 0 + (((tickAnim - 14) / 6) * (0.01569-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (-0.00981-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = -0.92006 + (((tickAnim - 20) / 6) * (4.99958-(-0.92006)));
            yy = 0.01569 + (((tickAnim - 20) / 6) * (0.05629-(0.01569)));
            zz = -0.00981 + (((tickAnim - 20) / 6) * (-0.04085-(-0.00981)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 4.99958 + (((tickAnim - 26) / 4) * (4.5-(4.99958)));
            yy = 0.05629 + (((tickAnim - 26) / 4) * (0-(0.05629)));
            zz = -0.04085 + (((tickAnim - 26) / 4) * (0-(-0.04085)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 4.5 + (((tickAnim - 30) / 5) * (17-(4.5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5 + (((tickAnim - 0) / 4) * (13.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 13.5 + (((tickAnim - 4) / 4) * (13.93-(13.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 13.93 + (((tickAnim - 8) / 4) * (8.53-(13.93)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 8.53 + (((tickAnim - 12) / 2) * (20-(8.53)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 14) / 6) * (7.85004-(20)));
            yy = 0 + (((tickAnim - 14) / 6) * (-0.00863-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0.00882-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 7.85004 + (((tickAnim - 20) / 6) * (-2.99956-(7.85004)));
            yy = -0.00863 + (((tickAnim - 20) / 6) * (-0.04482-(-0.00863)));
            zz = 0.00882 + (((tickAnim - 20) / 6) * (0.06762-(0.00882)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2.99956 + (((tickAnim - 26) / 4) * (-9.44-(-2.99956)));
            yy = -0.04482 + (((tickAnim - 26) / 4) * (0-(-0.04482)));
            zz = 0.06762 + (((tickAnim - 26) / 4) * (0-(0.06762)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -9.44 + (((tickAnim - 30) / 5) * (-5-(-9.44)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 32) / 3) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -5 + (((tickAnim - 0) / 6) * (9-(-5)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9 + (((tickAnim - 6) / 2) * (18-(9)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 8) / 5) * (19.00006-(18)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.0136-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.00817-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19.00006 + (((tickAnim - 13) / 5) * (5-(19.00006)));
            yy = 0.0136 + (((tickAnim - 13) / 5) * (0-(0.0136)));
            zz = -0.00817 + (((tickAnim - 13) / 5) * (0-(-0.00817)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 18) / 2) * (-13-(5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -13 + (((tickAnim - 20) / 3) * (-21.36-(-13)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -21.36 + (((tickAnim - 23) / 3) * (-15-(-21.36)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -15 + (((tickAnim - 26) / 3) * (-11-(-15)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -11 + (((tickAnim - 29) / 6) * (-5-(-11)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 13) * (-1.41-(-1)));
            zz = -0.5 + (((tickAnim - 0) / 13) * (-1.29-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            yy = -1.41 + (((tickAnim - 13) / 13) * (-2-(-1.41)));
            zz = -1.29 + (((tickAnim - 13) / 13) * (-1.75-(-1.29)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -2 + (((tickAnim - 26) / 9) * (-1-(-2)));
            zz = -1.75 + (((tickAnim - 26) / 9) * (-0.5-(-1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 3 + (((tickAnim - 0) / 6) * (1-(3)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 6) / 2) * (-6-(1)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 8) / 5) * (1.99977-(-6)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.02983-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.04679-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1.99977 + (((tickAnim - 13) / 5) * (25-(1.99977)));
            yy = -0.02983 + (((tickAnim - 13) / 5) * (0-(-0.02983)));
            zz = 0.04679 + (((tickAnim - 13) / 5) * (0-(0.04679)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 18) / 2) * (23-(25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 23 + (((tickAnim - 20) / 6) * (-10-(23)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -10 + (((tickAnim - 26) / 3) * (-13-(-10)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -13 + (((tickAnim - 29) / 6) * (3-(-13)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2 + (((tickAnim - 0) / 6) * (-10-(2)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 6) / 2) * (-11-(-10)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -11 + (((tickAnim - 8) / 5) * (-4.5-(-11)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -4.5 + (((tickAnim - 13) / 5) * (-3-(-4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 18) / 2) * (8-(-3)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 8 + (((tickAnim - 20) / 6) * (3-(8)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 26) / 4) * (24-(3)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 24 + (((tickAnim - 30) / 5) * (2-(24)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.75))*0.5), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75+100))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/1.75))*0.9));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*1));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17 + (((tickAnim - 0) / 8) * (25-(17)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 25 + (((tickAnim - 8) / 4) * (32-(25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 32 + (((tickAnim - 12) / 2) * (21-(32)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 21 + (((tickAnim - 14) / 4) * (-4-(21)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4 + (((tickAnim - 18) / 5) * (-7-(-4)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -7 + (((tickAnim - 23) / 6) * (6-(-7)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 6 + (((tickAnim - 29) / 6) * (17-(6)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -2.25 + (((tickAnim - 0) / 8) * (-3.25-(-2.25)));
            zz = -2.5 + (((tickAnim - 0) / 8) * (-3.5-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = -3.25 + (((tickAnim - 8) / 4) * (-4.5-(-3.25)));
            zz = -3.5 + (((tickAnim - 8) / 4) * (-4-(-3.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = -4.5 + (((tickAnim - 12) / 2) * (-2.75-(-4.5)));
            zz = -4 + (((tickAnim - 12) / 2) * (0-(-4)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 14) / 4) * (-1.4-(-2.75)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.4 + (((tickAnim - 18) / 5) * (0.14-(-1.4)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            yy = 0.14 + (((tickAnim - 23) / 6) * (-1-(0.14)));
            zz = 0 + (((tickAnim - 23) / 6) * (-1.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 29) / 6) * (-2.25-(-1)));
            zz = -1.25 + (((tickAnim - 29) / 6) * (-2.5-(-1.25)));
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
            xx = -4.00137 + (((tickAnim - 0) / 8) * (-10.00389-(-4.00137)));
            yy = 0.07119 + (((tickAnim - 0) / 8) * (-0.1703-(0.07119)));
            zz = 0.1562 + (((tickAnim - 0) / 8) * (0.1901-(0.1562)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -10.00389 + (((tickAnim - 8) / 4) * (-27-(-10.00389)));
            yy = -0.1703 + (((tickAnim - 8) / 4) * (0-(-0.1703)));
            zz = 0.1901 + (((tickAnim - 8) / 4) * (0-(0.1901)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -27 + (((tickAnim - 12) / 2) * (-33-(-27)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -33 + (((tickAnim - 14) / 4) * (-8-(-33)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 18) / 5) * (9-(-8)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 9 + (((tickAnim - 23) / 6) * (2.49756-(9)));
            yy = 0 + (((tickAnim - 23) / 6) * (0.1968-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (-0.00956-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 2.49756 + (((tickAnim - 29) / 6) * (-4.00137-(2.49756)));
            yy = 0.1968 + (((tickAnim - 29) / 6) * (0.07119-(0.1968)));
            zz = -0.00956 + (((tickAnim - 29) / 6) * (0.1562-(-0.00956)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -9.99865 + (((tickAnim - 0) / 8) * (-16.5-(-9.99865)));
            yy = -0.02017 + (((tickAnim - 0) / 8) * (0-(-0.02017)));
            zz = -0.1532 + (((tickAnim - 0) / 8) * (0-(-0.1532)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -16.5 + (((tickAnim - 8) / 4) * (-1-(-16.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1 + (((tickAnim - 12) / 2) * (14-(-1)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 14 + (((tickAnim - 14) / 4) * (11-(14)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 11 + (((tickAnim - 18) / 5) * (0-(11)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 23) / 6) * (-3.9988+Math.sin((Math.PI/180)*(1)) -(0)));
            yy = 0 + (((tickAnim - 23) / 6) * (-0.0973-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (-0.01579-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -3.9988+Math.sin((Math.PI/180)*(1))  + (((tickAnim - 29) / 6) * (-9.99865-(-3.9988+Math.sin((Math.PI/180)*(1)) )));
            yy = -0.0973 + (((tickAnim - 29) / 6) * (-0.02017-(-0.0973)));
            zz = -0.01579 + (((tickAnim - 29) / 6) * (-0.1532-(-0.01579)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -13 + (((tickAnim - 0) / 4) * (-0.38-(-13)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.38 + (((tickAnim - 4) / 6) * (7.69-(-0.38)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.69 + (((tickAnim - 10) / 8) * (16.24-(7.69)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 16.24 + (((tickAnim - 18) / 2) * (23.41-(16.24)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 23.41 + (((tickAnim - 20) / 4) * (21-(23.41)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 21 + (((tickAnim - 24) / 4) * (17-(21)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 17 + (((tickAnim - 28) / 2) * (1.14-(17)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.14 + (((tickAnim - 30) / 5) * (-13-(1.14)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 10) / 8) * (-1.25-(-0.25)));
            zz = -1 + (((tickAnim - 10) / 8) * (-2.5-(-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 18) / 5) * (-2-(-1.25)));
            zz = -2.5 + (((tickAnim - 18) / 5) * (-3-(-2.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -2 + (((tickAnim - 23) / 1) * (-2.27-(-2)));
            zz = -3 + (((tickAnim - 23) / 1) * (-2.88-(-3)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 24) / 2) * (0-(0)));
            yy = -2.27 + (((tickAnim - 24) / 2) * (-2.5-(-2.27)));
            zz = -2.88 + (((tickAnim - 24) / 2) * (0-(-2.88)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = -2.5 + (((tickAnim - 26) / 9) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.65 + (((tickAnim - 0) / 4) * (-1.44-(7.65)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -1.44 + (((tickAnim - 4) / 6) * (-0.66232-(-1.44)));
            yy = 0 + (((tickAnim - 4) / 6) * (-0.17773-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0.02121-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -0.66232 + (((tickAnim - 10) / 8) * (-0.61082-(-0.66232)));
            yy = -0.17773 + (((tickAnim - 10) / 8) * (-0.03201-(-0.17773)));
            zz = 0.02121 + (((tickAnim - 10) / 8) * (-0.08595-(0.02121)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.61082 + (((tickAnim - 18) / 2) * (-7.2-(-0.61082)));
            yy = -0.03201 + (((tickAnim - 18) / 2) * (0-(-0.03201)));
            zz = -0.08595 + (((tickAnim - 18) / 2) * (0-(-0.08595)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -7.2 + (((tickAnim - 20) / 4) * (-17-(-7.2)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -17 + (((tickAnim - 24) / 5) * (-36.5-(-17)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -36.5 + (((tickAnim - 29) / 3) * (-16.29-(-36.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -16.29 + (((tickAnim - 32) / 3) * (7.65-(-16.29)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
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
            xx = 6 + (((tickAnim - 0) / 4) * (2.17-(6)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 2.17 + (((tickAnim - 4) / 6) * (-3.78835-(2.17)));
            yy = 0 + (((tickAnim - 4) / 6) * (0.12684-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0.01638-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.78835 + (((tickAnim - 10) / 8) * (-11.89949-(-3.78835)));
            yy = 0.12684 + (((tickAnim - 10) / 8) * (0.00606-(0.12684)));
            zz = 0.01638 + (((tickAnim - 10) / 8) * (0.05471-(0.01638)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -11.89949 + (((tickAnim - 18) / 2) * (-14.97-(-11.89949)));
            yy = 0.00606 + (((tickAnim - 18) / 2) * (0-(0.00606)));
            zz = 0.05471 + (((tickAnim - 18) / 2) * (0-(0.05471)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -14.97 + (((tickAnim - 20) / 4) * (14-(-14.97)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 14 + (((tickAnim - 24) / 4) * (22-(14)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 22 + (((tickAnim - 28) / 2) * (14.86-(22)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 14.86 + (((tickAnim - 30) / 5) * (6-(14.86)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*2), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*-2), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*2), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*-1), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*1), neck5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0), neck6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.75))*-1), neck6.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraApatosaurus e = (EntityPrehistoricFloraApatosaurus) entity;
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
