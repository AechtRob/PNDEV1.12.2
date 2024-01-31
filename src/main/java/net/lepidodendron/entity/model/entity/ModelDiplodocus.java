package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplodocus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiplodocus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
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
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelDiplodocus() {
        this.textureWidth = 321;
        this.textureHeight = 295;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -27.05F, 1.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -2.0F, 25.0F);
        this.root.addChild(hip);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 51.0F, -2.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 46, -14.0F, -55.25F, -6.0F, 28, 27, 26, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -6.0F, -2.0F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 141, 9, 0.5F, -14.75F, -14.25F, 0, 5, 27, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 134, -11.0F, -9.75F, -17.25F, 23, 22, 30, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(13.5F, 3.75F, -1.75F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 234, -6.0F, -6.0F, -10.0F, 12, 33, 18, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 27.0F, -5.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1309F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 264, 202, -4.5F, -5.0F, -2.0F, 9, 25, 11, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0873F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 255, 0, -5.5F, -1.0F, -6.5F, 11, 5, 12, 0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 105, 16, -5.5F, -5.0F, -3.0F, 11, 5, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-13.5F, 3.75F, -1.75F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0436F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 234, -6.0F, -6.0F, -10.0F, 12, 33, 18, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 27.0F, -5.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1309F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 264, 202, -4.5F, -5.0F, -2.0F, 9, 25, 11, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0873F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 255, 0, -5.5F, -1.0F, -6.5F, 11, 5, 12, 0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 105, 16, -5.5F, -5.0F, -3.0F, 11, 5, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5F, 11.0F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 72, -9.0F, -10.0F, -3.0F, 18, 26, 35, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 247, 20, 0.0F, -15.0F, -1.0F, 0, 5, 32, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -5.0F, 32.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 65, 256, 0.0F, -9.0F, 1.0F, 0, 5, 29, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 107, 151, -7.0F, -4.0F, -3.0F, 14, 19, 35, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 32.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 171, 174, -5.0F, -3.0F, -3.0F, 10, 14, 35, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 96, 260, 0.0F, -7.0F, 1.0F, 0, 4, 31, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 32.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 187, -4.5F, -2.0F, -3.0F, 9, 11, 35, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 257, 87, 0.0F, -6.0F, 0.0F, 0, 4, 32, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 2.0F, 32.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 191, 224, -4.0F, -3.0F, -2.0F, 8, 9, 18, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 107, 151, 0.0F, -7.0F, 0.0F, 0, 4, 16, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 202, 266, -3.5F, -2.0F, -2.0F, 7, 7, 18, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 229, 188, 0.0F, -6.0F, 0.0F, 0, 4, 14, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.5F, 16.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0436F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 169, 0, -3.0F, -1.5F, -2.0F, 6, 5, 18, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 1, 189, 0.0F, -4.5F, 0.0F, 0, 3, 15, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(-1.0F, 0.5F, 16.0F);
        this.tail7.addChild(tail8);
        this.tail8.cubeList.add(new ModelBox(tail8, 54, 187, -1.0F, -1.5F, -2.0F, 4, 4, 18, -0.01F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 199, 53, 1.0F, -4.5F, 0.0F, 0, 3, 15, -0.01F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(1.0F, 0.25F, 15.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.0436F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 2, 74, 0.0F, -4.25F, 1.0F, 0, 3, 15, 0.0F, false));
        this.tail9.cubeList.add(new ModelBox(tail9, 159, 271, -1.5F, -1.25F, 0.0F, 3, 3, 17, 0.0F, false));

        this.tail10 = new AdvancedModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 0.25F, 17.0F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1745F, 0.0F, 0.0F);
        this.tail10.cubeList.add(new ModelBox(tail10, 164, 102, -1.0F, -1.0F, -1.0F, 2, 2, 17, 0.0F, false));
        this.tail10.cubeList.add(new ModelBox(tail10, 185, 277, 0.0F, -3.0F, 0.0F, 0, 2, 15, 0.0F, false));

        this.tail11 = new AdvancedModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.3927F, 0.0F, 0.0F);
        this.tail11.cubeList.add(new ModelBox(tail11, 43, 234, -0.5F, -0.5F, -1.0F, 1, 1, 14, 0.0F, false));
        this.tail11.cubeList.add(new ModelBox(tail11, 215, 53, 0.0F, -1.5F, 0.0F, 0, 1, 13, 0.0F, false));

        this.tail12 = new AdvancedModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.3927F, 0.0F, 0.0F);
        this.tail12.cubeList.add(new ModelBox(tail12, 136, 0, -0.5F, -0.5F, -0.25F, 1, 1, 14, -0.01F, false));
        this.tail12.cubeList.add(new ModelBox(tail12, 105, 1, 0.0F, -1.45F, 0.75F, 0, 1, 13, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -17.0F, -10.8F, -33.0F, 34, 35, 36, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -19.9F, -27.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 3, 1.0F, -9.0F, -1.0F, 0, 5, 27, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 104, -13.0F, -4.0F, -2.0F, 28, 16, 30, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, -0.2F, -31.35F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 20.0F, -12.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.0908F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 202, 78, -10.0F, -18.0F, -21.0F, 21, 18, 22, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.3F, 41.35F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 89, 206, -13.0F, 4.6F, -46.0F, 27, 33, 13, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -6.5F, 0.25F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 75, 0.0F, -21.5043F, -6.0653F, 0, 5, 8, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 247, 161, -9.5F, -16.5043F, -8.0653F, 19, 27, 13, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(12.0F, 17.25F, -5.75F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0873F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 253, 266, -4.0F, -3.0F, -4.0F, 10, 17, 9, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1745F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -3.0F, -3.0F, -2.0F, 8, 20, 7, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 93, -3.5F, -1.0F, -2.5F, 9, 6, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-4.5F, 2.0F, 0.0F);
        this.leftArm3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 7, 0.5122F, -1.5058F, -0.4294F, 1, 4, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-11.0F, 17.25F, -5.75F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0873F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 253, 266, -6.0F, -3.0F, -4.0F, 10, 17, 9, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1745F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -5.0F, -3.0F, -2.0F, 8, 20, 7, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 93, -5.5F, -1.0F, -2.5F, 9, 6, 6, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.5F, 2.0F, 0.0F);
        this.rightArm3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3491F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 7, -1.5122F, -1.5058F, -0.4294F, 1, 4, 1, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -17.0F, -8.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2182F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 198, 0, -7.5F, -5.0F, -21.0F, 16, 27, 24, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 228, 54, 0.5F, -10.0F, -19.0F, 0, 5, 18, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.5F, -21.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3491F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 171, 119, -5.5F, -6.0F, -26.0F, 12, 22, 32, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 232, 122, 0.5F, -11.0F, -25.0F, 0, 5, 23, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -2.5F, -26.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.3491F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 148, 231, -4.5F, -3.9774F, -17.1144F, 10, 17, 22, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 271, 136, 0.5F, -7.9774F, -16.1144F, 0, 4, 15, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.5226F, -17.1144F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0436F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 224, 228, -3.0F, -3.8682F, -22.9592F, 7, 12, 25, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 75, 77, 0.5F, -6.8682F, -22.9592F, 0, 3, 23, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.3682F, -22.9592F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2182F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 270, 61, -2.0F, -2.5671F, -9.0474F, 5, 9, 12, 0.0F, false));
        this.neck5.cubeList.add(new ModelBox(neck5, 4, 138, 0.5F, -5.5671F, -8.0474F, 0, 3, 9, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -0.5671F, -9.0474F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.48F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 25, 1, 0.5F, -3.9117F, -4.887F, 0, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.4617F, -0.887F);
        this.neck6.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 2, 0.5F, -2.45F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.7617F, -4.687F);
        this.neck6.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 137, 17, -1.5F, -0.0361F, -0.1012F, 4, 6, 6, -0.03F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0117F, -4.237F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.48F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 81, -1.0F, -1.4493F, -7.6463F, 3, 1, 4, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.0F, -1.8226F, -2.1937F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7418F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 72, 0.0F, -2.85F, -6.784F, 1, 1, 7, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 78, -1.0F, -2.5127F, -3.8066F, 3, 3, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 77, 151, -2.0F, -1.9151F, -1.7159F, 5, 5, 4, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 77, -1.0F, 2.0553F, -7.5067F, 3, 1, 1, -0.03F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 28, -1.0F, 0.5553F, -7.7567F, 3, 2, 1, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 28, -1.5F, 0.5553F, -6.7567F, 4, 2, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.3299F, 0.2316F);
        this.head.addChild(jaw);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.1417F, 0.6194F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 72, -1.5F, 1.3F, -4.45F, 4, 3, 2, -0.02F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 72, -2.0F, 1.1218F, -3.391F, 5, 2, 3, -0.02F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.1417F, 0.6194F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 151, -2.0F, 1.0F, -4.451F, 5, 2, 4, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 89, -1.5F, 1.0F, -8.7394F, 4, 2, 8, -0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 80, -1.0F, 0.5F, -9.5F, 3, 1, 1, -0.04F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 72, 72, -1.0F, 1.0F, -9.7394F, 3, 2, 2, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 2.7083F, -5.9806F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.throat.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2356F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 151, -1.5F, -3.7352F, 3.5922F, 3, 3, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.throat.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0175F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 28, -1.5F, -1.9354F, -0.166F, 3, 2, 5, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(neck1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, -0.05F, 0.05F);
        this.setRotateAngle(neck3, -0.1F, -0.05F, 0.05F);
        this.setRotateAngle(neck4, 0.2F, 0.0F, -0.05F);
        this.setRotateAngle(neck5, 0.3F, 0.0F, -0.05F);
        this.setRotateAngle(neck5, 0.3F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.3F, 0.0F, 0.2F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.neck1.offsetY = 0.1F;
        this.neck1.offsetX = 0.0F;
        this.neck1.offsetZ = 0.1F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.01F, -0.02F);
        this.setRotateAngle(neck2, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck3, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck4, 0.05F, -0.05F, -0.02F);
        this.setRotateAngle(neck5, 0.35F, -0.06F, -0.02F);
        this.setRotateAngle(neck6, 0.7F, -0.07F, -0.03F);
        this.setRotateAngle(head, 0.6F, -0.08F, -0.03F);
        this.setRotateAngle(tail1, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.15F, -0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail8, -0.01F, -0.15F, 0.0F);
        this.setRotateAngle(tail9, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail10, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail11, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail12, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(leftArm, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.38F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, 0.0F);
        this.hip.offsetY = -0.38F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.50F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(100);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.01F, -0.02F);
        this.setRotateAngle(neck2, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck3, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck4, 0.05F, -0.05F, -0.02F);
        this.setRotateAngle(neck5, 0.35F, -0.06F, -0.02F);
        this.setRotateAngle(neck6, 0.7F, -0.07F, -0.03F);
        this.setRotateAngle(head, 0.6F, -0.08F, -0.03F);
        this.setRotateAngle(tail1, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.15F, -0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail8, -0.01F, -0.15F, 0.0F);
        this.setRotateAngle(tail9, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail10, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail11, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail12, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(leftArm, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.38F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraDiplodocus diplo = (EntityPrehistoricFloraDiplodocus) e;

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

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11, this.tail12};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
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
        EntityPrehistoricFloraDiplodocus ee = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

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
//        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim... it doesn't have one
//            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE2_ANIMATION) {
            animIdle2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.IDLE1_ANIMATION) {
            animIdle1(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.25 + (((tickAnim - 60) / 20) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 112) {
            xx = -2.25 + (((tickAnim - 80) / 32) * (-1.11-(-2.25)));
            yy = 0 + (((tickAnim - 80) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 32) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*0.2-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = -1.11 + (((tickAnim - 112) / 28) * (0-(-1.11)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*0.2 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-2.1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -2.1 + (((tickAnim - 60) / 20) * (-2.1-(-2.1)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = -2.1 + (((tickAnim - 80) / 60) * (0-(-2.1)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 1.75 + (((tickAnim - 60) / 5) * (2.25-(1.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 2.25 + (((tickAnim - 65) / 47) * (0.775-(2.25)));
            yy = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.6-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 0.775 + (((tickAnim - 112) / 28) * (0-(0.775)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.6 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 3.5 + (((tickAnim - 60) / 5) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 3.5 + (((tickAnim - 65) / 47) * (1.27-(3.5)));
            yy = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400))*0.9-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 1.27 + (((tickAnim - 112) / 28) * (0-(1.27)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400))*0.9 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*400))*0.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7.25 + (((tickAnim - 60) / 5) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 7.25 + (((tickAnim - 65) / 47) * (2.64-(7.25)));
            yy = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460))*-1-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 2.64 + (((tickAnim - 112) / 28) * (0-(2.64)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460))*-1 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 7 + (((tickAnim - 60) / 5) * (7-(7)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 7 + (((tickAnim - 65) / 47) * (2.665-(7)));
            yy = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.2-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 2.665 + (((tickAnim - 112) / 28) * (0-(2.665)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.2 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*-1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 9 + (((tickAnim - 60) / 5) * (10-(9)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 112) {
            xx = 10 + (((tickAnim - 65) / 47) * (3.705-(10)));
            yy = 0 + (((tickAnim - 65) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 47) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.3-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = 3.705 + (((tickAnim - 112) / 28) * (0-(3.705)));
            yy = 0 + (((tickAnim - 112) / 28) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.3 + (((tickAnim - 112) / 28) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 6 + (((tickAnim - 60) / 5) * (7.5-(6)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 113) {
            xx = 7.5 + (((tickAnim - 65) / 48) * (2.58-(7.5)));
            yy = 0 + (((tickAnim - 65) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 48) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.5-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 140) {
            xx = 2.58 + (((tickAnim - 113) / 27) * (0-(2.58)));
            yy = 0 + (((tickAnim - 113) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.5 + (((tickAnim - 113) / 27) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 3.75 + (((tickAnim - 60) / 5) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 113) {
            xx = 3.75 + (((tickAnim - 65) / 48) * (1.345-(3.75)));
            yy = 0 + (((tickAnim - 65) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 48) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*-1.7-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 140) {
            xx = 1.345 + (((tickAnim - 113) / 27) * (0-(1.345)));
            yy = 0 + (((tickAnim - 113) / 27) * (0-(0)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*-1.7 + (((tickAnim - 113) / 27) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*-1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -5.5 + (((tickAnim - 60) / 5) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = -5.5 + (((tickAnim - 65) / 50) * (-2.08-(-5.5)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*-1.9-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 140) {
            xx = -2.08 + (((tickAnim - 115) / 25) * (0-(-2.08)));
            yy = 0 + (((tickAnim - 115) / 25) * (0-(0)));
            zz = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*-1.9 + (((tickAnim - 115) / 25) * (0-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*-1.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -6.75 + (((tickAnim - 60) / 5) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 115) {
            xx = -6.75 + (((tickAnim - 65) / 50) * (-2.55-(-6.75)));
            yy = 0 + (((tickAnim - 65) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 50) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*2-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 140) {
            xx = -2.55 + (((tickAnim - 115) / 25) * (0-(-2.55)));
            yy = 0 + (((tickAnim - 115) / 25) * (0-(0)));
            zz = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*2 + (((tickAnim - 115) / 25) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -8.75 + (((tickAnim - 60) / 5) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 119) {
            xx = -8.75 + (((tickAnim - 65) / 54) * (-3.31-(-8.75)));
            yy = 0 + (((tickAnim - 65) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 54) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2.2-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 140) {
            xx = -3.31 + (((tickAnim - 119) / 21) * (0-(-3.31)));
            yy = 0 + (((tickAnim - 119) / 21) * (0-(0)));
            zz = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2.2 + (((tickAnim - 119) / 21) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -10 + (((tickAnim - 60) / 5) * (-10-(-10)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 127) {
            xx = -10 + (((tickAnim - 65) / 62) * (-3.78-(-10)));
            yy = 0 + (((tickAnim - 65) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 62) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*2.3-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = -3.78 + (((tickAnim - 127) / 13) * (0-(-3.78)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*2.3 + (((tickAnim - 127) / 13) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*800))*2.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -20.25 + (((tickAnim - 60) / 5) * (-20.25-(-20.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 140) {
            xx = -20.25 + (((tickAnim - 65) / 75) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 65) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.2-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -0.25 + (((tickAnim - 105) / 35) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.2 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0.5 + (((tickAnim - 75) / 30) * (0-(0.5)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.4-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.4 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -3.25 + (((tickAnim - 60) / 20) * (-2.75-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -2.75 + (((tickAnim - 80) / 25) * (-1.6-(-2.75)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.6-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -1.6 + (((tickAnim - 105) / 35) * (0-(-1.6)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.6 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*500))*0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -7 + (((tickAnim - 60) / 20) * (-6.75-(-7)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -6.75 + (((tickAnim - 80) / 25) * (-3.94-(-6.75)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*1-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -3.94 + (((tickAnim - 105) / 35) * (0-(-3.94)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*1 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -9.75 + (((tickAnim - 60) / 20) * (-7.75-(-9.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -7.75 + (((tickAnim - 80) / 25) * (-4.52-(-7.75)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*1.3-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -4.52 + (((tickAnim - 105) / 35) * (0-(-4.52)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*1.3 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*600))*1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 1.525 + (((tickAnim - 60) / 20) * (1.525-(1.525)));
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
            xx = 0 + (((tickAnim - 0) / 60) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -4.75 + (((tickAnim - 60) / 20) * (-3.25-(-4.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 105) {
            xx = -3.25 + (((tickAnim - 80) / 25) * (-1.975-(-3.25)));
            yy = 0 + (((tickAnim - 80) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*1.5-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -1.975 + (((tickAnim - 105) / 35) * (0-(-1.975)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*1.5 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*660))*1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 105) {
            xx = 12.25 + (((tickAnim - 60) / 45) * (6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7-(12.25)));
            yy = 0 + (((tickAnim - 60) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 45) * (1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*1.7-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = 6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7 + (((tickAnim - 105) / 35) * (0-(6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*7)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*1.7 + (((tickAnim - 105) / 35) * (0-(1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*700))*1.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 8.75 + (((tickAnim - 60) / 16) * (6.5-(8.75)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 6.5 + (((tickAnim - 76) / 29) * (-3.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3-(6.5)));
            yy = 0 + (((tickAnim - 76) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 29) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -3.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3 + (((tickAnim - 105) / 35) * (0-(-3.215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*3)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2 + (((tickAnim - 105) / 35) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*760))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 13.25 + (((tickAnim - 60) / 8) * (8.5-(13.25)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 105) {
            xx = 8.5 + (((tickAnim - 68) / 37) * (-10.56-(8.5)));
            yy = 0 + (((tickAnim - 68) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 37) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 140) {
            xx = -10.56 + (((tickAnim - 105) / 35) * (0-(-10.56)));
            yy = 0 + (((tickAnim - 105) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 99) {
            xx = 19.75 + (((tickAnim - 60) / 39) * (0-(19.75)));
            yy = 0 + (((tickAnim - 60) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 39) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 99) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 99) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (21.0609-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-2.99757-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-0.36778-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 21.0609 + (((tickAnim - 60) / 20) * (24.8109-(21.0609)));
            yy = -2.99757 + (((tickAnim - 60) / 20) * (-2.99757-(-2.99757)));
            zz = -0.36778 + (((tickAnim - 60) / 20) * (-0.36778-(-0.36778)));
        }
        else if (tickAnim >= 80 && tickAnim < 106) {
            xx = 24.8109 + (((tickAnim - 80) / 26) * (0-(24.8109)));
            yy = -2.99757 + (((tickAnim - 80) / 26) * (0-(-2.99757)));
            zz = -0.36778 + (((tickAnim - 80) / 26) * (0-(-0.36778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 2.675 + (((tickAnim - 60) / 20) * (2.675-(2.675)));
            zz = 0 + (((tickAnim - 60) / 20) * (-0.85-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 80) / 12) * (0-(0)));
            yy = 2.675 + (((tickAnim - 80) / 12) * (4.5-(2.675)));
            zz = -0.85 + (((tickAnim - 80) / 12) * (0-(-0.85)));
        }
        else if (tickAnim >= 92 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 92) / 14) * (0-(0)));
            yy = 4.5 + (((tickAnim - 92) / 14) * (0-(4.5)));
            zz = 0 + (((tickAnim - 92) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 36.25 + (((tickAnim - 60) / 5) * (37.875-(36.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 106) {
            xx = 37.875 + (((tickAnim - 65) / 41) * (0-(37.875)));
            yy = 0 + (((tickAnim - 65) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 23.25 + (((tickAnim - 60) / 5) * (23.25-(23.25)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 106) {
            xx = 23.25 + (((tickAnim - 65) / 41) * (0-(23.25)));
            yy = 0 + (((tickAnim - 65) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 15.75 + (((tickAnim - 60) / 5) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 106) {
            xx = 15.75 + (((tickAnim - 65) / 41) * (0-(15.75)));
            yy = 0 + (((tickAnim - 65) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 41) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.525-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 60) / 5) * (0.25-(0.25)));
            zz = 1.525 + (((tickAnim - 60) / 5) * (1.525-(1.525)));
        }
        else if (tickAnim >= 65 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 65) / 41) * (0-(0)));
            yy = 0.25 + (((tickAnim - 65) / 41) * (0-(0.25)));
            zz = 1.525 + (((tickAnim - 65) / 41) * (0-(1.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 4.5 + (((tickAnim - 60) / 20) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 4.5 + (((tickAnim - 80) / 60) * (0-(4.5)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animIdle2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;
        int animCycle = 460;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -5 + (((tickAnim - 40) / 20) * (-9.52-(-5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -9.52 + (((tickAnim - 60) / 20) * (-13.52-(-9.52)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -13.52 + (((tickAnim - 80) / 40) * (-14.43-(-13.52)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -14.43 + (((tickAnim - 120) / 40) * (-15.01-(-14.43)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 260) {
            xx = -15.01 + (((tickAnim - 160) / 100) * (-18.55-(-15.01)));
            yy = 0 + (((tickAnim - 160) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 100) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 320) {
            xx = -18.55 + (((tickAnim - 260) / 60) * (-13.55-(-18.55)));
            yy = 0 + (((tickAnim - 260) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 60) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 340) {
            xx = -13.55 + (((tickAnim - 320) / 20) * (-8.55-(-13.55)));
            yy = 0 + (((tickAnim - 320) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 20) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 380) {
            xx = -8.55 + (((tickAnim - 340) / 40) * (4.9-(-8.55)));
            yy = 0 + (((tickAnim - 340) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 40) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = 4.9 + (((tickAnim - 380) / 20) * (4.9-(4.9)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 440) {
            xx = 4.9 + (((tickAnim - 400) / 40) * (0-(4.9)));
            yy = 0 + (((tickAnim - 400) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 40) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));

        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.90485-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.35815-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.83037-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -1.90485 + (((tickAnim - 40) / 40) * (3.22323-(-1.90485)));
            yy = 2.35815 + (((tickAnim - 40) / 40) * (4.45564-(2.35815)));
            zz = -0.83037 + (((tickAnim - 40) / 40) * (-1.67915-(-0.83037)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 3.22323 + (((tickAnim - 80) / 40) * (2.88394-(3.22323)));
            yy = 4.45564 + (((tickAnim - 80) / 40) * (3.98662-(4.45564)));
            zz = -1.67915 + (((tickAnim - 80) / 40) * (-1.5024-(-1.67915)));
        }
        else if (tickAnim >= 120 && tickAnim < 460) {
            xx = 2.88394 + (((tickAnim - 120) / 340) * (0-(2.88394)));
            yy = 3.98662 + (((tickAnim - 120) / 340) * (0-(3.98662)));
            zz = -1.5024 + (((tickAnim - 120) / 340) * (0-(-1.5024)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.65681-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.48221-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.29779-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -0.65681 + (((tickAnim - 40) / 40) * (-0.57258-(-0.65681)));
            yy = 2.48221 + (((tickAnim - 40) / 40) * (4.85108-(2.48221)));
            zz = 0.29779 + (((tickAnim - 40) / 40) * (0.47604-(0.29779)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -0.57258 + (((tickAnim - 80) / 40) * (-0.5549-(-0.57258)));
            yy = 4.85108 + (((tickAnim - 80) / 40) * (2.11232-(4.85108)));
            zz = 0.47604 + (((tickAnim - 80) / 40) * (0.25755-(0.47604)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -0.5549 + (((tickAnim - 120) / 40) * (1.97353-(-0.5549)));
            yy = 2.11232 + (((tickAnim - 120) / 40) * (-0.49796-(2.11232)));
            zz = 0.25755 + (((tickAnim - 120) / 40) * (0.04812-(0.25755)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 1.97353 + (((tickAnim - 160) / 40) * (4.51183-(1.97353)));
            yy = -0.49796 + (((tickAnim - 160) / 40) * (-2.95956-(-0.49796)));
            zz = 0.04812 + (((tickAnim - 160) / 40) * (-0.15145-(0.04812)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 4.51183 + (((tickAnim - 200) / 40) * (7.03469-(4.51183)));
            yy = -2.95956 + (((tickAnim - 200) / 40) * (-0.2965-(-2.95956)));
            zz = -0.15145 + (((tickAnim - 200) / 40) * (0.05512-(-0.15145)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 7.03469 + (((tickAnim - 240) / 40) * (7.07046-(7.03469)));
            yy = -0.2965 + (((tickAnim - 240) / 40) * (2.2162-(-0.2965)));
            zz = 0.05512 + (((tickAnim - 240) / 40) * (0.25044-(0.05512)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 7.07046 + (((tickAnim - 280) / 40) * (4.66671-(7.07046)));
            yy = 2.2162 + (((tickAnim - 280) / 40) * (-0.7806-(2.2162)));
            zz = 0.25044 + (((tickAnim - 280) / 40) * (-0.01006-(0.25044)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 4.66671 + (((tickAnim - 320) / 40) * (2.26762-(4.66671)));
            yy = -0.7806 + (((tickAnim - 320) / 40) * (-3.05095-(-0.7806)));
            zz = -0.01006 + (((tickAnim - 320) / 40) * (-0.21495-(-0.01006)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 2.26762 + (((tickAnim - 360) / 40) * (-0.14077-(2.26762)));
            yy = -3.05095 + (((tickAnim - 360) / 40) * (0.6707-(-3.05095)));
            zz = -0.21495 + (((tickAnim - 360) / 40) * (0.08356-(-0.21495)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -0.14077 + (((tickAnim - 400) / 60) * (0-(-0.14077)));
            yy = 0.6707 + (((tickAnim - 400) / 60) * (0-(0.6707)));
            zz = 0.08356 + (((tickAnim - 400) / 60) * (0-(0.08356)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (4.76936-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.8352-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.42444-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 4.76936 + (((tickAnim - 80) / 40) * (4.50296-(4.76936)));
            yy = 4.8352 + (((tickAnim - 80) / 40) * (2.12408-(4.8352)));
            zz = 0.42444 + (((tickAnim - 80) / 40) * (-0.01106-(0.42444)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 4.50296 + (((tickAnim - 120) / 40) * (4.24622-(4.50296)));
            yy = 2.12408 + (((tickAnim - 120) / 40) * (-0.46198-(2.12408)));
            zz = -0.01106 + (((tickAnim - 120) / 40) * (-0.41226-(-0.01106)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.24622 + (((tickAnim - 160) / 40) * (3.99613-(4.24622)));
            yy = -0.46198 + (((tickAnim - 160) / 40) * (-2.90283-(-0.46198)));
            zz = -0.41226 + (((tickAnim - 160) / 40) * (-0.77768-(-0.41226)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 3.99613 + (((tickAnim - 200) / 40) * (3.75541-(3.99613)));
            yy = -2.90283 + (((tickAnim - 200) / 40) * (-0.26437-(-2.90283)));
            zz = -0.77768 + (((tickAnim - 200) / 40) * (-0.35192-(-0.77768)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 3.75541 + (((tickAnim - 240) / 40) * (6.00028-(3.75541)));
            yy = -0.26437 + (((tickAnim - 240) / 40) * (2.22661-(-0.26437)));
            zz = -0.35192 + (((tickAnim - 240) / 40) * (0.04201-(-0.35192)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 6.00028 + (((tickAnim - 280) / 40) * (4.62922-(6.00028)));
            yy = 2.22661 + (((tickAnim - 280) / 40) * (-0.74562-(2.22661)));
            zz = 0.04201 + (((tickAnim - 280) / 40) * (-0.3858-(0.04201)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 4.62922 + (((tickAnim - 320) / 40) * (5.82973-(4.62922)));
            yy = -0.74562 + (((tickAnim - 320) / 40) * (-3.00818-(-0.74562)));
            zz = -0.3858 + (((tickAnim - 320) / 40) * (-0.63864-(-0.3858)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 5.82973 + (((tickAnim - 360) / 40) * (1.98371-(5.82973)));
            yy = -3.00818 + (((tickAnim - 360) / 40) * (0.68665-(-3.00818)));
            zz = -0.63864 + (((tickAnim - 360) / 40) * (-0.07702-(-0.63864)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 1.98371 + (((tickAnim - 400) / 60) * (0-(1.98371)));
            yy = 0.68665 + (((tickAnim - 400) / 60) * (0-(0.68665)));
            zz = -0.07702 + (((tickAnim - 400) / 60) * (0-(-0.07702)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.87-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (2.5-(0)));
            yy = 4.87 + (((tickAnim - 80) / 40) * (-0.38-(4.87)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 2.5 + (((tickAnim - 120) / 40) * (2.3664-(2.5)));
            yy = -0.38 + (((tickAnim - 120) / 40) * (-2.84979-(-0.38)));
            zz = 0 + (((tickAnim - 120) / 40) * (-0.21202-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 2.3664 + (((tickAnim - 160) / 40) * (2.23481-(2.3664)));
            yy = -2.84979 + (((tickAnim - 160) / 40) * (-5.16581-(-2.84979)));
            zz = -0.21202 + (((tickAnim - 160) / 40) * (-0.40548-(-0.21202)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 2.23481 + (((tickAnim - 200) / 40) * (2.09308-(2.23481)));
            yy = -5.16581 + (((tickAnim - 200) / 40) * (-2.37557-(-5.16581)));
            zz = -0.40548 + (((tickAnim - 200) / 40) * (-0.18121-(-0.40548)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 2.09308 + (((tickAnim - 240) / 40) * (4.4422-(2.09308)));
            yy = -2.37557 + (((tickAnim - 240) / 40) * (0.27152-(-2.37557)));
            zz = -0.18121 + (((tickAnim - 240) / 40) * (0.13371-(-0.18121)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 4.4422 + (((tickAnim - 280) / 40) * (3.43446-(4.4422)));
            yy = 0.27152 + (((tickAnim - 280) / 40) * (-2.27698-(0.27152)));
            zz = 0.13371 + (((tickAnim - 280) / 40) * (-0.15516-(0.13371)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 3.43446 + (((tickAnim - 320) / 40) * (4.97293-(3.43446)));
            yy = -2.27698 + (((tickAnim - 320) / 40) * (-4.1229-(-2.27698)));
            zz = -0.15516 + (((tickAnim - 320) / 40) * (-0.32796-(-0.15516)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 4.97293 + (((tickAnim - 360) / 40) * (1.47178-(4.97293)));
            yy = -4.1229 + (((tickAnim - 360) / 40) * (0.03411-(-4.1229)));
            zz = -0.32796 + (((tickAnim - 360) / 40) * (-0.02241-(-0.32796)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 1.47178 + (((tickAnim - 400) / 60) * (0-(1.47178)));
            yy = 0.03411 + (((tickAnim - 400) / 60) * (0-(0.03411)));
            zz = -0.02241 + (((tickAnim - 400) / 60) * (0-(-0.02241)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail6.rotationPointX = this.tail6.rotationPointX + (float)(xx);
        this.tail6.rotationPointY = this.tail6.rotationPointY - (float)(yy);
        this.tail6.rotationPointZ = this.tail6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 40) / 40) * (4.74888-(5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.86942-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.09815-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 4.74888 + (((tickAnim - 80) / 40) * (7.00261-(4.74888)));
            yy = 4.86942 + (((tickAnim - 80) / 40) * (2.12372-(4.86942)));
            zz = 0.09815 + (((tickAnim - 80) / 40) * (0.00555-(0.09815)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 7.00261 + (((tickAnim - 120) / 40) * (6.60939-(7.00261)));
            yy = 2.12372 + (((tickAnim - 120) / 40) * (-0.48839-(2.12372)));
            zz = 0.00555 + (((tickAnim - 120) / 40) * (-0.17397-(0.00555)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 6.60939 + (((tickAnim - 160) / 40) * (6.20722-(6.60939)));
            yy = -0.48839 + (((tickAnim - 160) / 40) * (-2.95309-(-0.48839)));
            zz = -0.17397 + (((tickAnim - 160) / 40) * (-0.32485-(-0.17397)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 6.20722 + (((tickAnim - 200) / 40) * (5.84489-(6.20722)));
            yy = -2.95309 + (((tickAnim - 200) / 40) * (-0.28683-(-2.95309)));
            zz = -0.32485 + (((tickAnim - 200) / 40) * (-0.1601-(-0.32485)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 5.84489 + (((tickAnim - 240) / 40) * (7.94006-(5.84489)));
            yy = -0.28683 + (((tickAnim - 240) / 40) * (2.22985-(-0.28683)));
            zz = -0.1601 + (((tickAnim - 240) / 40) * (-0.02076-(-0.1601)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 7.94006 + (((tickAnim - 280) / 40) * (6.09227-(7.94006)));
            yy = 2.22985 + (((tickAnim - 280) / 40) * (-0.78381-(2.22985)));
            zz = -0.02076 + (((tickAnim - 280) / 40) * (-0.1726-(-0.02076)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 6.09227 + (((tickAnim - 320) / 40) * (4.39644-(6.09227)));
            yy = -0.78381 + (((tickAnim - 320) / 40) * (-3.06392-(-0.78381)));
            zz = -0.1726 + (((tickAnim - 320) / 40) * (-0.20719-(-0.1726)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 4.39644 + (((tickAnim - 360) / 40) * (2.62303-(4.39644)));
            yy = -3.06392 + (((tickAnim - 360) / 40) * (0.67194-(-3.06392)));
            zz = -0.20719 + (((tickAnim - 360) / 40) * (-0.11825-(-0.20719)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 2.62303 + (((tickAnim - 400) / 60) * (0-(2.62303)));
            yy = 0.67194 + (((tickAnim - 400) / 60) * (0-(0.67194)));
            zz = -0.11825 + (((tickAnim - 400) / 60) * (0-(-0.11825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail7.rotationPointX = this.tail7.rotationPointX + (float)(xx);
        this.tail7.rotationPointY = this.tail7.rotationPointY - (float)(yy);
        this.tail7.rotationPointZ = this.tail7.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.37904-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.72444-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.00528-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 2.37904 + (((tickAnim - 80) / 40) * (4.75884-(2.37904)));
            yy = 4.72444 + (((tickAnim - 80) / 40) * (1.98459-(4.72444)));
            zz = -0.00528 + (((tickAnim - 80) / 40) * (0.00554-(-0.00528)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 4.75884 + (((tickAnim - 120) / 40) * (4.49228-(4.75884)));
            yy = 1.98459 + (((tickAnim - 120) / 40) * (-0.62467-(1.98459)));
            zz = 0.00554 + (((tickAnim - 120) / 40) * (-0.0817-(0.00554)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.49228 + (((tickAnim - 160) / 40) * (4.21807-(4.49228)));
            yy = -0.62467 + (((tickAnim - 160) / 40) * (-3.08508-(-0.62467)));
            zz = -0.0817 + (((tickAnim - 160) / 40) * (-0.1516-(-0.0817)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 4.21807 + (((tickAnim - 200) / 40) * (3.97264-(4.21807)));
            yy = -3.08508 + (((tickAnim - 200) / 40) * (-0.40776-(-3.08508)));
            zz = -0.1516 + (((tickAnim - 200) / 40) * (-0.07854-(-0.1516)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 3.97264 + (((tickAnim - 240) / 40) * (6.19679-(3.97264)));
            yy = -0.40776 + (((tickAnim - 240) / 40) * (2.12009-(-0.40776)));
            zz = -0.07854 + (((tickAnim - 240) / 40) * (-0.02087-(-0.07854)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 6.19679 + (((tickAnim - 280) / 40) * (12.25503-(6.19679)));
            yy = 2.12009 + (((tickAnim - 280) / 40) * (-0.87102-(2.12009)));
            zz = -0.02087 + (((tickAnim - 280) / 40) * (-0.11439-(-0.02087)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 12.25503 + (((tickAnim - 320) / 40) * (3.43071-(12.25503)));
            yy = -0.87102 + (((tickAnim - 320) / 40) * (-3.12786-(-0.87102)));
            zz = -0.11439 + (((tickAnim - 320) / 40) * (-0.1231-(-0.11439)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 3.43071 + (((tickAnim - 360) / 40) * (2.04711-(3.43071)));
            yy = -3.12786 + (((tickAnim - 360) / 40) * (0.63372-(-3.12786)));
            zz = -0.1231 + (((tickAnim - 360) / 40) * (-0.09321-(-0.1231)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 2.04711 + (((tickAnim - 400) / 60) * (0-(2.04711)));
            yy = 0.63372 + (((tickAnim - 400) / 60) * (0-(0.63372)));
            zz = -0.09321 + (((tickAnim - 400) / 60) * (0-(-0.09321)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail8.rotationPointX = this.tail8.rotationPointX + (float)(xx);
        this.tail8.rotationPointY = this.tail8.rotationPointY - (float)(yy);
        this.tail8.rotationPointZ = this.tail8.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.36842-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.75355-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.10965-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 2.36842 + (((tickAnim - 80) / 40) * (4.56229-(2.36842)));
            yy = 4.75355 + (((tickAnim - 80) / 40) * (-0.6055-(4.75355)));
            zz = -0.10965 + (((tickAnim - 80) / 40) * (-2.35186-(-0.10965)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 4.56229 + (((tickAnim - 120) / 40) * (4.30669-(4.56229)));
            yy = -0.6055 + (((tickAnim - 120) / 40) * (-3.07152-(-0.6055)));
            zz = -2.35186 + (((tickAnim - 120) / 40) * (-2.19035-(-2.35186)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.30669 + (((tickAnim - 160) / 40) * (4.0415-(4.30669)));
            yy = -3.07152 + (((tickAnim - 160) / 40) * (-2.88239-(-3.07152)));
            zz = -2.19035 + (((tickAnim - 160) / 40) * (-2.05548-(-2.19035)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 4.0415 + (((tickAnim - 200) / 40) * (3.80946-(4.0415)));
            yy = -2.88239 + (((tickAnim - 200) / 40) * (-0.21649-(-2.88239)));
            zz = -2.05548 + (((tickAnim - 200) / 40) * (-1.98877-(-2.05548)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 3.80946 + (((tickAnim - 240) / 40) * (6.04502-(3.80946)));
            yy = -0.21649 + (((tickAnim - 240) / 40) * (2.29817-(-0.21649)));
            zz = -1.98877 + (((tickAnim - 240) / 40) * (-1.8047-(-1.98877)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 6.04502 + (((tickAnim - 280) / 40) * (4.63934-(6.04502)));
            yy = 2.29817 + (((tickAnim - 280) / 40) * (-0.73624-(2.29817)));
            zz = -1.8047 + (((tickAnim - 280) / 40) * (-1.36926-(-1.8047)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 4.63934 + (((tickAnim - 320) / 40) * (3.3437-(4.63934)));
            yy = -0.73624 + (((tickAnim - 320) / 40) * (-3.02994-(-0.73624)));
            zz = -1.36926 + (((tickAnim - 320) / 40) * (-0.91529-(-1.36926)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 3.3437 + (((tickAnim - 360) / 40) * (1.99626-(3.3437)));
            yy = -3.02994 + (((tickAnim - 360) / 40) * (0.68878-(-3.02994)));
            zz = -0.91529 + (((tickAnim - 360) / 40) * (-0.67712-(-0.91529)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 1.99626 + (((tickAnim - 400) / 60) * (0-(1.99626)));
            yy = 0.68878 + (((tickAnim - 400) / 60) * (0-(0.68878)));
            zz = -0.67712 + (((tickAnim - 400) / 60) * (0-(-0.67712)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail9.rotationPointX = this.tail9.rotationPointX + (float)(xx);
        this.tail9.rotationPointY = this.tail9.rotationPointY - (float)(yy);
        this.tail9.rotationPointZ = this.tail9.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (2.35037-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.84916-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.33297-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 2.35037 + (((tickAnim - 80) / 40) * (9.36589-(2.35037)));
            yy = 4.84916 + (((tickAnim - 80) / 40) * (-3.51404-(4.84916)));
            zz = -0.33297 + (((tickAnim - 80) / 40) * (-4.22096-(-0.33297)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 9.36589 + (((tickAnim - 120) / 40) * (11.33911-(9.36589)));
            yy = -3.51404 + (((tickAnim - 120) / 40) * (-5.8174-(-3.51404)));
            zz = -4.22096 + (((tickAnim - 120) / 40) * (-3.93466-(-4.22096)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 11.33911 + (((tickAnim - 160) / 40) * (8.13132-(11.33911)));
            yy = -5.8174 + (((tickAnim - 160) / 40) * (-7.95786-(-5.8174)));
            zz = -3.93466 + (((tickAnim - 160) / 40) * (-3.61051-(-3.93466)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 8.13132 + (((tickAnim - 200) / 40) * (7.67959-(8.13132)));
            yy = -7.95786 + (((tickAnim - 200) / 40) * (-2.50248-(-7.95786)));
            zz = -3.61051 + (((tickAnim - 200) / 40) * (-3.60595-(-3.61051)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 7.67959 + (((tickAnim - 240) / 40) * (2.14509-(7.67959)));
            yy = -2.50248 + (((tickAnim - 240) / 40) * (0.17174-(-2.50248)));
            zz = -3.60595 + (((tickAnim - 240) / 40) * (-3.37034-(-3.60595)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 2.14509 + (((tickAnim - 280) / 40) * (9.89983-(2.14509)));
            yy = 0.17174 + (((tickAnim - 280) / 40) * (-2.36563-(0.17174)));
            zz = -3.37034 + (((tickAnim - 280) / 40) * (-2.47316-(-3.37034)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 9.89983 + (((tickAnim - 320) / 40) * (7.71684-(9.89983)));
            yy = -2.36563 + (((tickAnim - 320) / 40) * (-6.66016-(-2.36563)));
            zz = -2.47316 + (((tickAnim - 320) / 40) * (-1.33712-(-2.47316)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 7.71684 + (((tickAnim - 360) / 40) * (3.18032-(7.71684)));
            yy = -6.66016 + (((tickAnim - 360) / 40) * (-1.55936-(-6.66016)));
            zz = -1.33712 + (((tickAnim - 360) / 40) * (-1.10892-(-1.33712)));
        }
        else if (tickAnim >= 400 && tickAnim < 458) {
            xx = 3.18032 + (((tickAnim - 400) / 58) * (0-(3.18032)));
            yy = -1.55936 + (((tickAnim - 400) / 58) * (0-(-1.55936)));
            zz = -1.10892 + (((tickAnim - 400) / 58) * (0-(-1.10892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 0) / 458) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 458) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 458) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail10.rotationPointX = this.tail10.rotationPointX + (float)(xx);
        this.tail10.rotationPointY = this.tail10.rotationPointY - (float)(yy);
        this.tail10.rotationPointZ = this.tail10.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 5 + (((tickAnim - 40) / 40) * (2.02-(5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (14.73568-(0)));
            yy = 2.02 + (((tickAnim - 80) / 40) * (1.80643-(2.02)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 14.73568 + (((tickAnim - 120) / 40) * (12.99422-(14.73568)));
            yy = 1.80643 + (((tickAnim - 120) / 40) * (-3.40695-(1.80643)));
            zz = 0 + (((tickAnim - 120) / 40) * (-0.04309-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 12.99422 + (((tickAnim - 160) / 40) * (6.23261-(12.99422)));
            yy = -3.40695 + (((tickAnim - 160) / 40) * (-10.44835-(-3.40695)));
            zz = -0.04309 + (((tickAnim - 160) / 40) * (0.12832-(-0.04309)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 6.23261 + (((tickAnim - 200) / 40) * (9.52236-(6.23261)));
            yy = -10.44835 + (((tickAnim - 200) / 40) * (-3.83735-(-10.44835)));
            zz = 0.12832 + (((tickAnim - 200) / 40) * (-0.15406-(0.12832)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 9.52236 + (((tickAnim - 240) / 40) * (10.25109-(9.52236)));
            yy = -3.83735 + (((tickAnim - 240) / 40) * (6.83171-(-3.83735)));
            zz = -0.15406 + (((tickAnim - 240) / 40) * (-0.9508-(-0.15406)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 10.25109 + (((tickAnim - 280) / 40) * (10.87633-(10.25109)));
            yy = 6.83171 + (((tickAnim - 280) / 40) * (12.75047-(6.83171)));
            zz = -0.9508 + (((tickAnim - 280) / 40) * (-1.60391-(-0.9508)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 10.87633 + (((tickAnim - 320) / 40) * (9.26799-(10.87633)));
            yy = 12.75047 + (((tickAnim - 320) / 40) * (-3.30721-(12.75047)));
            zz = -1.60391 + (((tickAnim - 320) / 40) * (0.65823-(-1.60391)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = 9.26799 + (((tickAnim - 360) / 40) * (2.52429-(9.26799)));
            yy = -3.30721 + (((tickAnim - 360) / 40) * (2.96265-(-3.30721)));
            zz = 0.65823 + (((tickAnim - 360) / 40) * (-0.47512-(0.65823)));
        }
        else if (tickAnim >= 400 && tickAnim < 458) {
            xx = 2.52429 + (((tickAnim - 400) / 58) * (0-(2.52429)));
            yy = 2.96265 + (((tickAnim - 400) / 58) * (0-(2.96265)));
            zz = -0.47512 + (((tickAnim - 400) / 58) * (0-(-0.47512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 458) {
            xx = 0 + (((tickAnim - 0) / 458) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 458) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 458) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail11.rotationPointX = this.tail11.rotationPointX + (float)(xx);
        this.tail11.rotationPointY = this.tail11.rotationPointY - (float)(yy);
        this.tail11.rotationPointZ = this.tail11.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 5 + (((tickAnim - 40) / 40) * (-2.98-(5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (9.47368-(0)));
            yy = -2.98 + (((tickAnim - 80) / 40) * (-2.66632-(-2.98)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 9.47368 + (((tickAnim - 120) / 40) * (7.89869-(9.47368)));
            yy = -2.66632 + (((tickAnim - 120) / 40) * (-14.46454-(-2.66632)));
            zz = 0 + (((tickAnim - 120) / 40) * (3.1304-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 7.89869 + (((tickAnim - 160) / 40) * (-3.75195-(7.89869)));
            yy = -14.46454 + (((tickAnim - 160) / 40) * (-19.74796-(-14.46454)));
            zz = 3.1304 + (((tickAnim - 160) / 40) * (4.8576-(3.1304)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3.75195 + (((tickAnim - 200) / 40) * (5.79749-(-3.75195)));
            yy = -19.74796 + (((tickAnim - 200) / 40) * (-9.53497-(-19.74796)));
            zz = 4.8576 + (((tickAnim - 200) / 40) * (1.86558-(4.8576)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 5.79749 + (((tickAnim - 240) / 40) * (2.29583-(5.79749)));
            yy = -9.53497 + (((tickAnim - 240) / 40) * (6.49371-(-9.53497)));
            zz = 1.86558 + (((tickAnim - 240) / 40) * (-3.03016-(1.86558)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 2.29583 + (((tickAnim - 280) / 40) * (3.51941-(2.29583)));
            yy = 6.49371 + (((tickAnim - 280) / 40) * (9.78211-(6.49371)));
            zz = -3.03016 + (((tickAnim - 280) / 40) * (-3.98752-(-3.03016)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 3.51941 + (((tickAnim - 320) / 40) * (-0.11702-(3.51941)));
            yy = 9.78211 + (((tickAnim - 320) / 40) * (-9.46699-(9.78211)));
            zz = -3.98752 + (((tickAnim - 320) / 40) * (3.13275-(-3.98752)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -0.11702 + (((tickAnim - 360) / 40) * (1.49336-(-0.11702)));
            yy = -9.46699 + (((tickAnim - 360) / 40) * (3.65626-(-9.46699)));
            zz = 3.13275 + (((tickAnim - 360) / 40) * (-1.70688-(3.13275)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 1.49336 + (((tickAnim - 400) / 60) * (0-(1.49336)));
            yy = 3.65626 + (((tickAnim - 400) / 60) * (0-(3.65626)));
            zz = -1.70688 + (((tickAnim - 400) / 60) * (0-(-1.70688)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail12.rotationPointX = this.tail12.rotationPointX + (float)(xx);
        this.tail12.rotationPointY = this.tail12.rotationPointY - (float)(yy);
        this.tail12.rotationPointZ = this.tail12.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.175-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 39) {
            xx = 2.175 + (((tickAnim - 10) / 29) * (-2.5-(2.175)));
            yy = 0 + (((tickAnim - 10) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 29) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 79) {
            xx = -2.5 + (((tickAnim - 39) / 40) * (-5-(-2.5)));
            yy = 0 + (((tickAnim - 39) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 40) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 119) {
            xx = -5 + (((tickAnim - 79) / 40) * (-7.5-(-5)));
            yy = 0 + (((tickAnim - 79) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 40) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 460) {
            xx = -7.5 + (((tickAnim - 119) / 341) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 119) / 341) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 341) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 3.25 + (((tickAnim - 10) / 33) * (14.25-(3.25)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 14.25 + (((tickAnim - 43) / 17) * (17.87-(14.25)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 17.87 + (((tickAnim - 60) / 20) * (26.44-(17.87)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 26.44 + (((tickAnim - 80) / 40) * (31.71-(26.44)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 31.71 + (((tickAnim - 120) / 40) * (25.31-(31.71)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 25.31 + (((tickAnim - 160) / 40) * (31.41-(25.31)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 260) {
            xx = 31.41 + (((tickAnim - 200) / 60) * (22.49-(31.41)));
            yy = 0 + (((tickAnim - 200) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 60) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 22.49 + (((tickAnim - 260) / 20) * (16.66-(22.49)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 16.66 + (((tickAnim - 280) / 40) * (13-(16.66)));
            yy = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 40) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 380) {
            xx = 13 + (((tickAnim - 320) / 60) * (-5-(13)));
            yy = 0 + (((tickAnim - 320) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 60) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -5 + (((tickAnim - 380) / 40) * (0-(-5)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 33) * (0-(0.575)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 43) / 377) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 377) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 377) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -12 + (((tickAnim - 10) / 33) * (0-(-12)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (2.5-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 2.5 + (((tickAnim - 60) / 40) * (2.25-(2.5)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 2.25 + (((tickAnim - 100) / 40) * (-5.86-(2.25)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -5.86 + (((tickAnim - 140) / 40) * (-13.13-(-5.86)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = -13.13 + (((tickAnim - 180) / 40) * (-4.4-(-13.13)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 260) {
            xx = -4.4 + (((tickAnim - 220) / 40) * (1.83-(-4.4)));
            yy = 0 + (((tickAnim - 220) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 40) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 380) {
            xx = 1.83 + (((tickAnim - 260) / 120) * (-19.5-(1.83)));
            yy = 0 + (((tickAnim - 260) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 120) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = -19.5 + (((tickAnim - 380) / 80) * (0-(-19.5)));
            yy = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 10) / 370) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 370) * (0.7-(0)));
            zz = 0 + (((tickAnim - 10) / 370) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = 0.7 + (((tickAnim - 380) / 80) * (0-(0.7)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 5.75 + (((tickAnim - 10) / 33) * (21.5-(5.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 21.5 + (((tickAnim - 43) / 37) * (17.11-(21.5)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 17.11 + (((tickAnim - 80) / 40) * (14.48-(17.11)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 14.48 + (((tickAnim - 120) / 40) * (4.73-(14.48)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.73 + (((tickAnim - 160) / 40) * (14.3-(4.73)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 14.3 + (((tickAnim - 200) / 40) * (9.7-(14.3)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 9.7 + (((tickAnim - 240) / 40) * (6.53-(9.7)));
            yy = 0 + (((tickAnim - 240) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 40) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 380) {
            xx = 6.53 + (((tickAnim - 280) / 100) * (16.1-(6.53)));
            yy = 0 + (((tickAnim - 280) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 100) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 16.1 + (((tickAnim - 380) / 40) * (25.55-(16.1)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 25.55 + (((tickAnim - 420) / 40) * (0-(25.55)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 33) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 43) / 337) * (0-(0)));
            yy = 0.225 + (((tickAnim - 43) / 337) * (0.665-(0.225)));
            zz = 0 + (((tickAnim - 43) / 337) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = 0.665 + (((tickAnim - 380) / 80) * (0-(0.665)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 3.25 + (((tickAnim - 10) / 33) * (13.75-(3.25)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 13.75 + (((tickAnim - 43) / 17) * (15.7-(13.75)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 100) {
            xx = 15.7 + (((tickAnim - 60) / 40) * (7.2-(15.7)));
            yy = 0 + (((tickAnim - 60) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 40) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 7.2 + (((tickAnim - 100) / 40) * (9.42-(7.2)));
            yy = 0 + (((tickAnim - 100) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 40) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 9.42 + (((tickAnim - 140) / 40) * (0.81-(9.42)));
            yy = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 0.81 + (((tickAnim - 180) / 40) * (3.19-(0.81)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 260) {
            xx = 3.19 + (((tickAnim - 220) / 40) * (9.33-(3.19)));
            yy = 0 + (((tickAnim - 220) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 40) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 9.33 + (((tickAnim - 260) / 40) * (7.13-(9.33)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 380) {
            xx = 7.13 + (((tickAnim - 300) / 80) * (-12.27-(7.13)));
            yy = 0 + (((tickAnim - 300) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 80) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -12.27 + (((tickAnim - 380) / 40) * (0-(-12.27)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = 0.575 + (((tickAnim - 10) / 33) * (0-(0.575)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 43) / 417) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 417) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 417) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = -12 + (((tickAnim - 10) / 33) * (0-(-12)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 60) / 20) * (-4.87-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.87 + (((tickAnim - 80) / 40) * (2.11-(-4.87)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 2.11 + (((tickAnim - 120) / 40) * (1.87-(2.11)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 1.87 + (((tickAnim - 160) / 40) * (8.67-(1.87)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 8.67 + (((tickAnim - 200) / 40) * (10.74-(8.67)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 10.74 + (((tickAnim - 240) / 40) * (-2.7-(10.74)));
            yy = 0 + (((tickAnim - 240) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 40) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 380) {
            xx = -2.7 + (((tickAnim - 280) / 100) * (-12.97-(-2.7)));
            yy = 0 + (((tickAnim - 280) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 100) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = -12.97 + (((tickAnim - 380) / 80) * (0-(-12.97)));
            yy = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 10) / 370) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 370) * (0.7-(0)));
            zz = 0 + (((tickAnim - 10) / 370) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = 0.7 + (((tickAnim - 380) / 80) * (0-(0.7)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 5.75 + (((tickAnim - 10) / 33) * (21.5-(5.75)));
            yy = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 21.5 + (((tickAnim - 43) / 37) * (12.11-(21.5)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 380) {
            xx = 12.11 + (((tickAnim - 80) / 300) * (17.55-(12.11)));
            yy = 0 + (((tickAnim - 80) / 300) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 300) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = 17.55 + (((tickAnim - 380) / 40) * (25.55-(17.55)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 25.55 + (((tickAnim - 420) / 40) * (0-(25.55)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 10) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 33) * (0.225-(0)));
            zz = 0 + (((tickAnim - 10) / 33) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 43) / 337) * (0-(0)));
            yy = 0.225 + (((tickAnim - 43) / 337) * (0.665-(0.225)));
            zz = 0 + (((tickAnim - 43) / 337) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = 0.665 + (((tickAnim - 380) / 80) * (0-(0.665)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 10) / 30) * (4.83-(2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 4.83 + (((tickAnim - 40) / 40) * (14.83-(4.83)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 14.83 + (((tickAnim - 80) / 40) * (14.83-(14.83)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 14.83 + (((tickAnim - 120) / 40) * (14.83-(14.83)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 14.83 + (((tickAnim - 160) / 40) * (17.33-(14.83)));
            yy = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 17.33 + (((tickAnim - 200) / 40) * (17.58-(17.33)));
            yy = 0 + (((tickAnim - 200) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 17.58 + (((tickAnim - 240) / 40) * (17.33-(17.58)));
            yy = 0 + (((tickAnim - 240) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 40) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 17.33 + (((tickAnim - 280) / 40) * (13.48-(17.33)));
            yy = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 40) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 350) {
            xx = 13.48 + (((tickAnim - 320) / 30) * (4.97-(13.48)));
            yy = 0 + (((tickAnim - 320) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 30) * (0-(0)));
        }
        else if (tickAnim >= 350 && tickAnim < 380) {
            xx = 4.97 + (((tickAnim - 350) / 30) * (-6.04-(4.97)));
            yy = 0 + (((tickAnim - 350) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 350) / 30) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 420) {
            xx = -6.04 + (((tickAnim - 380) / 40) * (-0.22-(-6.04)));
            yy = 0 + (((tickAnim - 380) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 40) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -0.22 + (((tickAnim - 420) / 40) * (0-(-0.22)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 40) / 180) * (-0.14-(0)));
            yy = 0 + (((tickAnim - 40) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 180) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 380) {
            xx = -0.14 + (((tickAnim - 220) / 160) * (2.45-(-0.14)));
            yy = 0 + (((tickAnim - 220) / 160) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 160) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 2.45 + (((tickAnim - 380) / 80) * (0-(2.45)));
            yy = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 10) * (-1.05-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -1.05 + (((tickAnim - 10) / 30) * (-0.58-(-1.05)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = -0.58 + (((tickAnim - 40) / 40) * (-0.895-(-0.58)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            yy = -0.895 + (((tickAnim - 80) / 40) * (-0.895-(-0.895)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = -0.895 + (((tickAnim - 120) / 40) * (-1.015-(-0.895)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 160) / 40) * (0-(0)));
            yy = -1.015 + (((tickAnim - 160) / 40) * (-1.13-(-1.015)));
            zz = 0 + (((tickAnim - 160) / 40) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 200) / 100) * (0-(0)));
            yy = -1.13 + (((tickAnim - 200) / 100) * (-0.95-(-1.13)));
            zz = 0 + (((tickAnim - 200) / 100) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 300) / 80) * (0-(0)));
            yy = -0.95 + (((tickAnim - 300) / 80) * (-0.52-(-0.95)));
            zz = 0 + (((tickAnim - 300) / 80) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = -0.52 + (((tickAnim - 380) / 80) * (0-(-0.52)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -1.25 + (((tickAnim - 19) / 21) * (0.75-(-1.25)));
            yy = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0.75 + (((tickAnim - 40) / 20) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0.75 + (((tickAnim - 60) / 20) * (-0.79-(0.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -0.79 + (((tickAnim - 80) / 40) * (0.21-(-0.79)));
            yy = 0 + (((tickAnim - 80) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 40) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 180) {
            xx = 0.21 + (((tickAnim - 120) / 60) * (-0.83-(0.21)));
            yy = 0 + (((tickAnim - 120) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 60) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 460) {
            xx = -0.83 + (((tickAnim - 180) / 280) * (0-(-0.83)));
            yy = 0 + (((tickAnim - 180) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 280) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 19) / 21) * (0-(0)));
            yy = 0.425 + (((tickAnim - 19) / 21) * (0.1-(0.425)));
            zz = 0 + (((tickAnim - 19) / 21) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0.1 + (((tickAnim - 40) / 20) * (0.1-(0.1)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 60) / 120) * (0-(0)));
            yy = 0.1 + (((tickAnim - 60) / 120) * (0.195-(0.1)));
            zz = 0 + (((tickAnim - 60) / 120) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 180) / 280) * (0-(0)));
            yy = 0.195 + (((tickAnim - 180) / 280) * (0-(0.195)));
            zz = 0 + (((tickAnim - 180) / 280) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 10) / 30) * (-4.11-(2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -4.11 + (((tickAnim - 40) / 20) * (-4.11-(-4.11)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -4.11 + (((tickAnim - 60) / 20) * (-0.15-(-4.11)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.15 + (((tickAnim - 80) / 20) * (-0.14-(-0.15)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 180) {
            xx = -0.14 + (((tickAnim - 100) / 80) * (3.64-(-0.14)));
            yy = 0 + (((tickAnim - 100) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 80) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 220) {
            xx = 3.64 + (((tickAnim - 180) / 40) * (3.64-(3.64)));
            yy = 0 + (((tickAnim - 180) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 40) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 260) {
            xx = 3.64 + (((tickAnim - 220) / 40) * (3.64-(3.64)));
            yy = 0 + (((tickAnim - 220) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 40) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 320) {
            xx = 3.64 + (((tickAnim - 260) / 60) * (-1.93-(3.64)));
            yy = 0 + (((tickAnim - 260) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 60) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 380) {
            xx = -1.93 + (((tickAnim - 320) / 60) * (-7.5-(-1.93)));
            yy = 0 + (((tickAnim - 320) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 60) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 400) {
            xx = -7.5 + (((tickAnim - 380) / 20) * (-2.25-(-7.5)));
            yy = 0 + (((tickAnim - 380) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 20) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 420) {
            xx = -2.25 + (((tickAnim - 400) / 20) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 400) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 20) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 30) / 390) * (0-(0)));
            yy = 0.675 + (((tickAnim - 30) / 390) * (0-(0.675)));
            zz = 0 + (((tickAnim - 30) / 390) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.63-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0.63 + (((tickAnim - 20) / 40) * (12.26-(0.63)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 12.26 + (((tickAnim - 60) / 80) * (7.31-(12.26)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 260) {
            xx = 7.31 + (((tickAnim - 140) / 120) * (9.57-(7.31)));
            yy = 0 + (((tickAnim - 140) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 120) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 9.57 + (((tickAnim - 260) / 40) * (9.57-(9.57)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 340) {
            xx = 9.57 + (((tickAnim - 300) / 40) * (19.79-(9.57)));
            yy = 0 + (((tickAnim - 300) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 40) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 460) {
            xx = 19.79 + (((tickAnim - 340) / 120) * (0-(19.79)));
            yy = 0 + (((tickAnim - 340) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 120) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = -0.525 + (((tickAnim - 0) / 40) * (-0.835-(-0.525)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = -0.835 + (((tickAnim - 40) / 20) * (-3.06-(-0.835)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = -3.06 + (((tickAnim - 60) / 20) * (-3.16-(-3.06)));
            zz = 0 + (((tickAnim - 60) / 20) * (0.325-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -3.16 + (((tickAnim - 80) / 20) * (-3.16-(-3.16)));
            zz = 0.325 + (((tickAnim - 80) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = -3.16 + (((tickAnim - 100) / 20) * (-3.16-(-3.16)));
            zz = 0.325 + (((tickAnim - 100) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 120 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 120) / 140) * (0-(0)));
            yy = -3.16 + (((tickAnim - 120) / 140) * (-2.235-(-3.16)));
            zz = 0.325 + (((tickAnim - 120) / 140) * (0.19-(0.325)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = -2.235 + (((tickAnim - 260) / 40) * (-2.235-(-2.235)));
            zz = 0.19 + (((tickAnim - 260) / 40) * (0.19-(0.19)));
        }
        else if (tickAnim >= 300 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 300) / 80) * (0-(0)));
            yy = -2.235 + (((tickAnim - 300) / 80) * (-1.66-(-2.235)));
            zz = 0.19 + (((tickAnim - 300) / 80) * (0.08-(0.19)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = -1.66 + (((tickAnim - 380) / 80) * (0-(-1.66)));
            zz = 0.08 + (((tickAnim - 380) / 80) * (0-(0.08)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-0.12-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.12 + (((tickAnim - 20) / 20) * (5.76-(-0.12)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 5.76 + (((tickAnim - 40) / 20) * (1.64-(5.76)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1.64 + (((tickAnim - 60) / 20) * (2.56-(1.64)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 2.56 + (((tickAnim - 80) / 20) * (3.43-(2.56)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 3.43 + (((tickAnim - 100) / 20) * (4.99-(3.43)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 240) {
            xx = 4.99 + (((tickAnim - 120) / 120) * (4.38-(4.99)));
            yy = 0 + (((tickAnim - 120) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 120) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 260) {
            xx = 4.38 + (((tickAnim - 240) / 20) * (5.44-(4.38)));
            yy = 0 + (((tickAnim - 240) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 20) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 5.44 + (((tickAnim - 260) / 40) * (5.44-(5.44)));
            yy = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 380) {
            xx = 5.44 + (((tickAnim - 300) / 80) * (-11.14-(5.44)));
            yy = 0 + (((tickAnim - 300) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 80) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = -11.14 + (((tickAnim - 380) / 80) * (0-(-11.14)));
            yy = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 120) / 20) * (0.345-(-0.325)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0 + (((tickAnim - 140) / 40) * (0-(0)));
            yy = 0.345 + (((tickAnim - 140) / 40) * (0.19-(0.345)));
            zz = 0 + (((tickAnim - 140) / 40) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 180) / 60) * (0-(0)));
            yy = 0.19 + (((tickAnim - 180) / 60) * (-0.67-(0.19)));
            zz = 0 + (((tickAnim - 180) / 60) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 240) / 20) * (0-(0)));
            yy = -0.67 + (((tickAnim - 240) / 20) * (-0.69-(-0.67)));
            zz = 0 + (((tickAnim - 240) / 20) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 260) / 40) * (0-(0)));
            yy = -0.69 + (((tickAnim - 260) / 40) * (-0.69-(-0.69)));
            zz = 0 + (((tickAnim - 260) / 40) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 380) {
            xx = 0 + (((tickAnim - 300) / 80) * (0-(0)));
            yy = -0.69 + (((tickAnim - 300) / 80) * (-0.065-(-0.69)));
            zz = 0 + (((tickAnim - 300) / 80) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 380) / 80) * (0-(0)));
            yy = -0.065 + (((tickAnim - 380) / 80) * (0-(-0.065)));
            zz = 0 + (((tickAnim - 380) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-4.77345-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (2.41745-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.63731-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.77345 + (((tickAnim - 80) / 40) * (-4.30737-(-4.77345)));
            yy = 2.41745 + (((tickAnim - 80) / 40) * (4.58566-(2.41745)));
            zz = -0.63731 + (((tickAnim - 80) / 40) * (-1.18829-(-0.63731)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -4.30737 + (((tickAnim - 120) / 40) * (-3.77114-(-4.30737)));
            yy = 4.58566 + (((tickAnim - 120) / 40) * (1.61817-(4.58566)));
            zz = -1.18829 + (((tickAnim - 120) / 40) * (-0.45207-(-1.18829)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -3.77114 + (((tickAnim - 160) / 40) * (-3.26646-(-3.77114)));
            yy = 1.61817 + (((tickAnim - 160) / 40) * (-1.03088-(1.61817)));
            zz = -0.45207 + (((tickAnim - 160) / 40) * (0.18191-(-0.45207)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3.26646 + (((tickAnim - 200) / 40) * (-2.8386-(-3.26646)));
            yy = -1.03088 + (((tickAnim - 200) / 40) * (-5.75136-(-1.03088)));
            zz = 0.18191 + (((tickAnim - 200) / 40) * (1.26432-(0.18191)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = -2.8386 + (((tickAnim - 240) / 40) * (-2.37801-(-2.8386)));
            yy = -5.75136 + (((tickAnim - 240) / 40) * (-7.14782-(-5.75136)));
            zz = 1.26432 + (((tickAnim - 240) / 40) * (1.572-(1.26432)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -2.37801 + (((tickAnim - 280) / 40) * (-1.8107-(-2.37801)));
            yy = -7.14782 + (((tickAnim - 280) / 40) * (-3.1125-(-7.14782)));
            zz = 1.572 + (((tickAnim - 280) / 40) * (0.7087-(1.572)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = -1.8107 + (((tickAnim - 320) / 140) * (0-(-1.8107)));
            yy = -3.1125 + (((tickAnim - 320) / 140) * (0-(-3.1125)));
            zz = 0.7087 + (((tickAnim - 320) / 140) * (0-(0.7087)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-4.77547-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (2.38735-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.7422-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.77547 + (((tickAnim - 80) / 40) * (-4.31485-(-4.77547)));
            yy = 2.38735 + (((tickAnim - 80) / 40) * (4.52946-(2.38735)));
            zz = -0.7422 + (((tickAnim - 80) / 40) * (-1.38757-(-0.7422)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -4.31485 + (((tickAnim - 120) / 40) * (-3.77296-(-4.31485)));
            yy = 4.52946 + (((tickAnim - 120) / 40) * (1.59692-(4.52946)));
            zz = -1.38757 + (((tickAnim - 120) / 40) * (-0.52229-(-1.38757)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -3.77296 + (((tickAnim - 160) / 40) * (-3.26775-(-3.77296)));
            yy = 1.59692 + (((tickAnim - 160) / 40) * (-1.02195-(1.59692)));
            zz = -0.52229 + (((tickAnim - 160) / 40) * (0.2267-(-0.52229)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3.26775 + (((tickAnim - 200) / 40) * (-5.29242-(-3.26775)));
            yy = -1.02195 + (((tickAnim - 200) / 40) * (-3.24537-(-1.02195)));
            zz = 0.2267 + (((tickAnim - 200) / 40) * (0.95561-(0.2267)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = -5.29242 + (((tickAnim - 240) / 40) * (-4.37897-(-5.29242)));
            yy = -3.24537 + (((tickAnim - 240) / 40) * (-5.04794-(-3.24537)));
            zz = 0.95561 + (((tickAnim - 240) / 40) * (1.50831-(0.95561)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -4.37897 + (((tickAnim - 280) / 40) * (-0.87329-(-4.37897)));
            yy = -5.04794 + (((tickAnim - 280) / 40) * (-1.52167-(-5.04794)));
            zz = 1.50831 + (((tickAnim - 280) / 40) * (0.48795-(1.50831)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = -0.87329 + (((tickAnim - 320) / 140) * (0-(-0.87329)));
            yy = -1.52167 + (((tickAnim - 320) / 140) * (0-(-1.52167)));
            zz = 0.48795 + (((tickAnim - 320) / 140) * (0-(0.48795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-4.77345-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 40) * (2.41745-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (-0.63731-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -4.77345 + (((tickAnim - 80) / 40) * (-4.30737-(-4.77345)));
            yy = 2.41745 + (((tickAnim - 80) / 40) * (4.58566-(2.41745)));
            zz = -0.63731 + (((tickAnim - 80) / 40) * (-1.18829-(-0.63731)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -4.30737 + (((tickAnim - 120) / 40) * (-3.77114-(-4.30737)));
            yy = 4.58566 + (((tickAnim - 120) / 40) * (1.61817-(4.58566)));
            zz = -1.18829 + (((tickAnim - 120) / 40) * (-0.45207-(-1.18829)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = -3.77114 + (((tickAnim - 160) / 40) * (-3.26646-(-3.77114)));
            yy = 1.61817 + (((tickAnim - 160) / 40) * (-1.03088-(1.61817)));
            zz = -0.45207 + (((tickAnim - 160) / 40) * (0.18191-(-0.45207)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = -3.26646 + (((tickAnim - 200) / 40) * (-2.78412-(-3.26646)));
            yy = -1.03088 + (((tickAnim - 200) / 40) * (-3.31043-(-1.03088)));
            zz = 0.18191 + (((tickAnim - 200) / 40) * (0.70701-(0.18191)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = -2.78412 + (((tickAnim - 240) / 40) * (-2.3145-(-2.78412)));
            yy = -3.31043 + (((tickAnim - 240) / 40) * (-5.1512-(-3.31043)));
            zz = 0.70701 + (((tickAnim - 240) / 40) * (1.11209-(0.70701)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -2.3145 + (((tickAnim - 280) / 40) * (0.71939-(-2.3145)));
            yy = -5.1512 + (((tickAnim - 280) / 40) * (-1.53927-(-5.1512)));
            zz = 1.11209 + (((tickAnim - 280) / 40) * (0.46092-(1.11209)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = 0.71939 + (((tickAnim - 320) / 140) * (0-(0.71939)));
            yy = -1.53927 + (((tickAnim - 320) / 140) * (0-(-1.53927)));
            zz = 0.46092 + (((tickAnim - 320) / 140) * (0-(0.46092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 0) / 120) * (16.15798-(0)));
            yy = 0 + (((tickAnim - 0) / 120) * (-2.4026-(0)));
            zz = 0 + (((tickAnim - 0) / 120) * (4.38621-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 16.15798 + (((tickAnim - 120) / 20) * (15.96656-(16.15798)));
            yy = -2.4026 + (((tickAnim - 120) / 20) * (-6.39258-(-2.4026)));
            zz = 4.38621 + (((tickAnim - 120) / 20) * (6.47275-(4.38621)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 15.96656 + (((tickAnim - 140) / 20) * (16.57305-(15.96656)));
            yy = -6.39258 + (((tickAnim - 140) / 20) * (-5.58315-(-6.39258)));
            zz = 6.47275 + (((tickAnim - 140) / 20) * (-0.25054-(6.47275)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 16.57305 + (((tickAnim - 160) / 40) * (14.61025-(16.57305)));
            yy = -5.58315 + (((tickAnim - 160) / 40) * (0.04291-(-5.58315)));
            zz = -0.25054 + (((tickAnim - 160) / 40) * (-0.08107-(-0.25054)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 14.61025 + (((tickAnim - 200) / 40) * (17.52363-(14.61025)));
            yy = 0.04291 + (((tickAnim - 200) / 40) * (-2.16489-(0.04291)));
            zz = -0.08107 + (((tickAnim - 200) / 40) * (-1.2506-(-0.08107)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 17.52363 + (((tickAnim - 240) / 40) * (14.66267-(17.52363)));
            yy = -2.16489 + (((tickAnim - 240) / 40) * (-0.58938-(-2.16489)));
            zz = -1.2506 + (((tickAnim - 240) / 40) * (-8.83958-(-1.2506)));
        }
        else if (tickAnim >= 280 && tickAnim < 460) {
            xx = 14.66267 + (((tickAnim - 280) / 180) * (0-(14.66267)));
            yy = -0.58938 + (((tickAnim - 280) / 180) * (0-(-0.58938)));
            zz = -8.83958 + (((tickAnim - 280) / 180) * (0-(-8.83958)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (3.27609-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (-1.3626-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (4.81121-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 3.27609 + (((tickAnim - 80) / 40) * (4.85932-(3.27609)));
            yy = -1.3626 + (((tickAnim - 80) / 40) * (-2.24944-(-1.3626)));
            zz = 4.81121 + (((tickAnim - 80) / 40) * (7.15656-(4.81121)));
        }
        else if (tickAnim >= 120 && tickAnim < 200) {
            xx = 4.85932 + (((tickAnim - 120) / 80) * (15-(4.85932)));
            yy = -2.24944 + (((tickAnim - 120) / 80) * (0-(-2.24944)));
            zz = 7.15656 + (((tickAnim - 120) / 80) * (0-(7.15656)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 15 + (((tickAnim - 200) / 40) * (4.98436-(15)));
            yy = 0 + (((tickAnim - 200) / 40) * (0.75155-(0)));
            zz = 0 + (((tickAnim - 200) / 40) * (-2.38443-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 320) {
            xx = 4.98436 + (((tickAnim - 240) / 80) * (5-(4.98436)));
            yy = 0.75155 + (((tickAnim - 240) / 80) * (0-(0.75155)));
            zz = -2.38443 + (((tickAnim - 240) / 80) * (0-(-2.38443)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = 5 + (((tickAnim - 320) / 140) * (0-(5)));
            yy = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(xx);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(yy);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (-0.06635-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.85436-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.3128-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = -0.06635 + (((tickAnim - 80) / 40) * (2.41861-(-0.06635)));
            yy = 4.85436 + (((tickAnim - 80) / 40) * (2.12856-(4.85436)));
            zz = 0.3128 + (((tickAnim - 80) / 40) * (-0.0159-(0.3128)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 2.41861 + (((tickAnim - 120) / 40) * (4.91894-(2.41861)));
            yy = 2.12856 + (((tickAnim - 120) / 40) * (-0.47014-(2.12856)));
            zz = -0.0159 + (((tickAnim - 120) / 40) * (-0.3271-(-0.0159)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.91894 + (((tickAnim - 160) / 40) * (3.68308-(4.91894)));
            yy = -0.47014 + (((tickAnim - 160) / 40) * (-2.92175-(-0.47014)));
            zz = -0.3271 + (((tickAnim - 160) / 40) * (-0.61957-(-0.3271)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 3.68308 + (((tickAnim - 200) / 40) * (5.92866-(3.68308)));
            yy = -2.92175 + (((tickAnim - 200) / 40) * (-0.27353-(-2.92175)));
            zz = -0.61957 + (((tickAnim - 200) / 40) * (-0.27131-(-0.61957)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 5.92866 + (((tickAnim - 240) / 40) * (7.43898-(5.92866)));
            yy = -0.27353 + (((tickAnim - 240) / 40) * (2.22578-(-0.27353)));
            zz = -0.27131 + (((tickAnim - 240) / 40) * (0.06024-(-0.27131)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 7.43898 + (((tickAnim - 280) / 40) * (2.45012-(7.43898)));
            yy = 2.22578 + (((tickAnim - 280) / 40) * (-0.7571-(2.22578)));
            zz = 0.06024 + (((tickAnim - 280) / 40) * (-0.26675-(0.06024)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = 2.45012 + (((tickAnim - 320) / 40) * (-0.02613-(2.45012)));
            yy = -0.7571 + (((tickAnim - 320) / 40) * (-3.02548-(-0.7571)));
            zz = -0.26675 + (((tickAnim - 320) / 40) * (-0.5064-(-0.26675)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -0.02613 + (((tickAnim - 360) / 40) * (-0.01898-(-0.02613)));
            yy = -3.02548 + (((tickAnim - 360) / 40) * (0.65482-(-3.02548)));
            zz = -0.5064 + (((tickAnim - 360) / 40) * (0.00922-(-0.5064)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -0.01898 + (((tickAnim - 400) / 60) * (0-(-0.01898)));
            yy = 0.65482 + (((tickAnim - 400) / 60) * (0-(0.65482)));
            zz = 0.00922 + (((tickAnim - 400) / 60) * (0-(0.00922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 2.5 + (((tickAnim - 40) / 40) * (9.90556-(2.5)));
            yy = 2.5 + (((tickAnim - 40) / 40) * (4.81368-(2.5)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.53737-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 9.90556 + (((tickAnim - 80) / 40) * (12.24448-(9.90556)));
            yy = 4.81368 + (((tickAnim - 80) / 40) * (-0.31568-(4.81368)));
            zz = 0.53737 + (((tickAnim - 80) / 40) * (-0.5523-(0.53737)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 12.24448 + (((tickAnim - 120) / 40) * (4.63373-(12.24448)));
            yy = -0.31568 + (((tickAnim - 120) / 40) * (-2.74237-(-0.31568)));
            zz = -0.5523 + (((tickAnim - 120) / 40) * (-1.04695-(-0.5523)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 4.63373 + (((tickAnim - 160) / 40) * (5.28754-(4.63373)));
            yy = -2.74237 + (((tickAnim - 160) / 40) * (-5.01954-(-2.74237)));
            zz = -1.04695 + (((tickAnim - 160) / 40) * (-1.50455-(-1.04695)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 5.28754 + (((tickAnim - 200) / 40) * (3.63888-(5.28754)));
            yy = -5.01954 + (((tickAnim - 200) / 40) * (-2.28496-(-5.01954)));
            zz = -1.50455 + (((tickAnim - 200) / 40) * (-0.90149-(-1.50455)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 3.63888 + (((tickAnim - 240) / 40) * (-1.74635-(3.63888)));
            yy = -2.28496 + (((tickAnim - 240) / 40) * (0.26906-(-2.28496)));
            zz = -0.90149 + (((tickAnim - 240) / 40) * (-0.33659-(-0.90149)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = -1.74635 + (((tickAnim - 280) / 40) * (-0.57357-(-1.74635)));
            yy = 0.26906 + (((tickAnim - 280) / 40) * (-2.21786-(0.26906)));
            zz = -0.33659 + (((tickAnim - 280) / 40) * (-0.66462-(-0.33659)));
        }
        else if (tickAnim >= 320 && tickAnim < 360) {
            xx = -0.57357 + (((tickAnim - 320) / 40) * (-0.3925-(-0.57357)));
            yy = -2.21786 + (((tickAnim - 320) / 40) * (-4.06241-(-2.21786)));
            zz = -0.66462 + (((tickAnim - 320) / 40) * (-0.89597-(-0.66462)));
        }
        else if (tickAnim >= 360 && tickAnim < 400) {
            xx = -0.3925 + (((tickAnim - 360) / 40) * (-0.24582-(-0.3925)));
            yy = -4.06241 + (((tickAnim - 360) / 40) * (0.01296-(-4.06241)));
            zz = -0.89597 + (((tickAnim - 360) / 40) * (-0.11673-(-0.89597)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -0.24582 + (((tickAnim - 400) / 60) * (0-(-0.24582)));
            yy = 0.01296 + (((tickAnim - 400) / 60) * (0-(0.01296)));
            zz = -0.11673 + (((tickAnim - 400) / 60) * (0-(-0.11673)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-1.24523-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (2.49761-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.10933-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -1.24523 + (((tickAnim - 40) / 40) * (4.1291-(-1.24523)));
            yy = 2.49761 + (((tickAnim - 40) / 40) * (4.74308-(2.49761)));
            zz = 0.10933 + (((tickAnim - 40) / 40) * (0.38765-(0.10933)));
        }
        else if (tickAnim >= 80 && tickAnim < 120) {
            xx = 4.1291 + (((tickAnim - 80) / 40) * (3.98468-(4.1291)));
            yy = 4.74308 + (((tickAnim - 80) / 40) * (6.72789-(4.74308)));
            zz = 0.38765 + (((tickAnim - 80) / 40) * (0.62988-(0.38765)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 3.98468 + (((tickAnim - 120) / 40) * (3.78748-(3.98468)));
            yy = 6.72789 + (((tickAnim - 120) / 40) * (3.45146-(6.72789)));
            zz = 0.62988 + (((tickAnim - 120) / 40) * (0.28059-(0.62988)));
        }
        else if (tickAnim >= 160 && tickAnim < 200) {
            xx = 3.78748 + (((tickAnim - 160) / 40) * (3.60769-(3.78748)));
            yy = 3.45146 + (((tickAnim - 160) / 40) * (0.50547-(3.45146)));
            zz = 0.28059 + (((tickAnim - 160) / 40) * (-0.02309-(0.28059)));
        }
        else if (tickAnim >= 200 && tickAnim < 240) {
            xx = 3.60769 + (((tickAnim - 200) / 40) * (-1.56213-(3.60769)));
            yy = 0.50547 + (((tickAnim - 200) / 40) * (-2.07196-(0.50547)));
            zz = -0.02309 + (((tickAnim - 200) / 40) * (-0.06045-(-0.02309)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = -1.56213 + (((tickAnim - 240) / 40) * (-0.8198-(-1.56213)));
            yy = -2.07196 + (((tickAnim - 240) / 40) * (-4.19417-(-2.07196)));
            zz = -0.06045 + (((tickAnim - 240) / 40) * (-0.12277-(-0.06045)));
        }
        else if (tickAnim >= 280 && tickAnim < 460) {
            xx = -0.8198 + (((tickAnim - 280) / 180) * (0-(-0.8198)));
            yy = -4.19417 + (((tickAnim - 280) / 180) * (0-(-4.19417)));
            zz = -0.12277 + (((tickAnim - 280) / 180) * (0-(-0.12277)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0.02235-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (2.21738-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (-1.34505-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 140) {
            xx = 0.02235 + (((tickAnim - 100) / 40) * (0.36082-(0.02235)));
            yy = 2.21738 + (((tickAnim - 100) / 40) * (8.86042-(2.21738)));
            zz = -1.34505 + (((tickAnim - 100) / 40) * (2.15468-(-1.34505)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = 0.36082 + (((tickAnim - 140) / 40) * (0-(0.36082)));
            yy = 8.86042 + (((tickAnim - 140) / 40) * (0-(8.86042)));
            zz = 2.15468 + (((tickAnim - 140) / 40) * (0-(2.15468)));
        }
        else if (tickAnim >= 180 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 180) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 180) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 180) / 60) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 240) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 240) / 40) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 240) / 40) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            yy = -7.5 + (((tickAnim - 280) / 40) * (0-(-7.5)));
            zz = 0 + (((tickAnim - 280) / 40) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 460) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 460) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 100) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (20-(0)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 20 + (((tickAnim - 120) / 20) * (15-(20)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 160) {
            xx = 15 + (((tickAnim - 140) / 20) * (0-(15)));
            yy = 0 + (((tickAnim - 140) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 20) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 240) {
            xx = 0 + (((tickAnim - 160) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 160) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 80) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 240) / 20) * (2.5-(0)));
            yy = 0 + (((tickAnim - 240) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 20) * (0-(0)));
        }
        else if (tickAnim >= 260 && tickAnim < 280) {
            xx = 2.5 + (((tickAnim - 260) / 20) * (3.75-(2.5)));
            yy = 0 + (((tickAnim - 260) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 260) / 20) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 3.75 + (((tickAnim - 280) / 20) * (0-(3.75)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 459) {
            xx = 0 + (((tickAnim - 300) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 300) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 159) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(0), leftLeg4.rotateAngleY + (float) Math.toRadians(0), leftLeg4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(0), rightLeg4.rotateAngleY + (float) Math.toRadians(0), rightLeg4.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 274;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 189) {
            xx = 6.5 + (((tickAnim - 60) / 129) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 60) / 129) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 129) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 219) {
            xx = 6.5 + (((tickAnim - 189) / 30) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 189) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 30) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 270) {
            xx = 6.5 + (((tickAnim - 219) / 51) * (0-(6.5)));
            yy = 0 + (((tickAnim - 219) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 0) / 270) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 270) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 10.5 + (((tickAnim - 71) / 13) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 13) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 133) {
            xx = 10.5 + (((tickAnim - 84) / 49) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8-(10.5)));
            yy = 0 + (((tickAnim - 84) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 49) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8 + (((tickAnim - 133) / 43) * (10.5-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8)));
            yy = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 10.5 + (((tickAnim - 176) / 13) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 274) {
            xx = 10.5 + (((tickAnim - 189) / 85) * (0-(10.5)));
            yy = 0 + (((tickAnim - 189) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 85) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (2.45-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            zz = 2.45 + (((tickAnim - 71) / 13) * (2.45-(2.45)));
        }
        else if (tickAnim >= 84 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 84) / 92) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 92) * (0-(0)));
            zz = 2.45 + (((tickAnim - 84) / 92) * (2.45-(2.45)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 2.45 + (((tickAnim - 176) / 13) * (2.45-(2.45)));
        }
        else if (tickAnim >= 189 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 189) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 189) / 81) * (0-(0)));
            zz = 2.45 + (((tickAnim - 189) / 81) * (0-(2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (16.68-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 84) {
            xx = 16.68 + (((tickAnim - 74) / 10) * (18.39-(16.68)));
            yy = 0 + (((tickAnim - 74) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 10) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 121) {
            xx = 18.39 + (((tickAnim - 84) / 37) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5-(18.39)));
            yy = 0 + (((tickAnim - 84) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 37) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 176) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5 + (((tickAnim - 121) / 55) * (15.93-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5)));
            yy = 0 + (((tickAnim - 121) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 55) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 15.93 + (((tickAnim - 176) / 11) * (17.39-(15.93)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 274) {
            xx = 17.39 + (((tickAnim - 187) / 87) * (0-(17.39)));
            yy = 0 + (((tickAnim - 187) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 87) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 74) / 11) * (14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 124) {
            xx = 14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 85) / 39) * (7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 85) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 39) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 176) {
            xx = 7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 124) / 52) * (15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
            yy = 0 + (((tickAnim - 124) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 52) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 176) / 13) * (17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 201) {
            xx = 17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 189) / 12) * (13.25-(17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 189) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 12) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 274) {
            xx = 13.25 + (((tickAnim - 201) / 73) * (0-(13.25)));
            yy = 0 + (((tickAnim - 201) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 73) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 12 + (((tickAnim - 74) / 11) * (12.25-(12)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 128) {
            xx = 12.25 + (((tickAnim - 85) / 43) * (4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(12.25)));
            yy = 0 + (((tickAnim - 85) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 43) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 176) {
            xx = 4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 128) / 48) * (12-(4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = 0 + (((tickAnim - 128) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 48) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 12 + (((tickAnim - 176) / 11) * (12.25-(12)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 213) {
            xx = 12.25 + (((tickAnim - 187) / 26) * (3.32-(12.25)));
            yy = 0 + (((tickAnim - 187) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 26) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 274) {
            xx = 3.32 + (((tickAnim - 213) / 61) * (0-(3.32)));
            yy = 0 + (((tickAnim - 213) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 74) {
            xx = 5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 49) / 25) * (-4.5-(5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = 0 + (((tickAnim - 49) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 25) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = -4.5 + (((tickAnim - 74) / 11) * (-6.75-(-4.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = -6.75 + (((tickAnim - 85) / 22) * (-11.58-(-6.75)));
            yy = 0 + (((tickAnim - 85) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 22) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 148) {
            xx = -11.58 + (((tickAnim - 107) / 41) * (0.15-(-11.58)));
            yy = 0 + (((tickAnim - 107) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 41) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 163) {
            xx = 0.15 + (((tickAnim - 148) / 15) * (1.15-(0.15)));
            yy = 0 + (((tickAnim - 148) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 15) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 1.15 + (((tickAnim - 163) / 13) * (-3.5-(1.15)));
            yy = 0 + (((tickAnim - 163) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 13) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 186) {
            xx = -3.5 + (((tickAnim - 176) / 10) * (-5.75-(-3.5)));
            yy = 0 + (((tickAnim - 176) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 10) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 215) {
            xx = -5.75 + (((tickAnim - 186) / 29) * (-10.56-(-5.75)));
            yy = 0 + (((tickAnim - 186) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 29) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 274) {
            xx = -10.56 + (((tickAnim - 215) / 59) * (0-(-10.56)));
            yy = 0 + (((tickAnim - 215) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 74) {
            xx = 6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5 + (((tickAnim - 49) / 25) * (-7.5-(6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5)));
            yy = 0 + (((tickAnim - 49) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 25) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 84) {
            xx = -7.5 + (((tickAnim - 74) / 10) * (-12.25331-(-7.5)));
            yy = 0 + (((tickAnim - 74) / 10) * (-0.14124-(0)));
            zz = 0 + (((tickAnim - 74) / 10) * (-0.63325-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 100) {
            xx = -12.25331 + (((tickAnim - 84) / 16) * (-18.66072-(-12.25331)));
            yy = -0.14124 + (((tickAnim - 84) / 16) * (-0.02855-(-0.14124)));
            zz = -0.63325 + (((tickAnim - 84) / 16) * (-0.128-(-0.63325)));
        }
        else if (tickAnim >= 100 && tickAnim < 159) {
            xx = -18.66072 + (((tickAnim - 100) / 59) * (-1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3-(-18.66072)));
            yy = -0.02855 + (((tickAnim - 100) / 59) * (0-(-0.02855)));
            zz = -0.128 + (((tickAnim - 100) / 59) * (0-(-0.128)));
        }
        else if (tickAnim >= 159 && tickAnim < 186) {
            xx = -1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3 + (((tickAnim - 159) / 27) * (-12.25331-(-1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3)));
            yy = 0 + (((tickAnim - 159) / 27) * (-0.14124-(0)));
            zz = 0 + (((tickAnim - 159) / 27) * (-0.63325-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 204) {
            xx = -12.25331 + (((tickAnim - 186) / 18) * (-14.58583-(-12.25331)));
            yy = -0.14124 + (((tickAnim - 186) / 18) * (-0.0963-(-0.14124)));
            zz = -0.63325 + (((tickAnim - 186) / 18) * (-0.43175-(-0.63325)));
        }
        else if (tickAnim >= 204 && tickAnim < 274) {
            xx = -14.58583 + (((tickAnim - 204) / 70) * (0-(-14.58583)));
            yy = -0.0963 + (((tickAnim - 204) / 70) * (0-(-0.0963)));
            zz = -0.43175 + (((tickAnim - 204) / 70) * (0-(-0.43175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 67) {
            xx = 10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 54) / 13) * (3-(10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 54) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 13) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 102) {
            xx = 3 + (((tickAnim - 67) / 35) * (-7.93-(3)));
            yy = 0 + (((tickAnim - 67) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 35) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 157) {
            xx = -7.93 + (((tickAnim - 102) / 55) * (8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(-7.93)));
            yy = 0 + (((tickAnim - 102) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 55) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 177) {
            xx = 8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 157) / 20) * (-4-(8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 157) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 20) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 205) {
            xx = -4 + (((tickAnim - 177) / 28) * (-16.92-(-4)));
            yy = 0 + (((tickAnim - 177) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 28) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 270) {
            xx = -16.92 + (((tickAnim - 205) / 65) * (0-(-16.92)));
            yy = 0 + (((tickAnim - 205) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 106) {
            xx = -18 + (((tickAnim - 60) / 46) * (-19.25-(-18)));
            yy = 0 + (((tickAnim - 60) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 46) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 129) {
            xx = -19.25 + (((tickAnim - 106) / 23) * (-8.18-(-19.25)));
            yy = 0 + (((tickAnim - 106) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 23) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 168) {
            xx = -8.18 + (((tickAnim - 129) / 39) * (-18-(-8.18)));
            yy = 0 + (((tickAnim - 129) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 39) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 224) {
            xx = -18 + (((tickAnim - 168) / 56) * (-16.67-(-18)));
            yy = 0 + (((tickAnim - 168) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 56) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 274) {
            xx = -16.67 + (((tickAnim - 224) / 50) * (0-(-16.67)));
            yy = 0 + (((tickAnim - 224) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 49) / 34) * (14.75-(0)));
            yy = 0 + (((tickAnim - 49) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 34) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = 14.75 + (((tickAnim - 83) / 20) * (0-(14.75)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 20) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 103) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 60) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 163) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 163) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 15) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 15.75 + (((tickAnim - 178) / 20) * (0-(15.75)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 198) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -8.25 + (((tickAnim - 60) / 50) * (1.5-(-8.25)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 1.5 + (((tickAnim - 110) / 8) * (-1.19-(1.5)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -1.19 + (((tickAnim - 118) / 5) * (1.7-(-1.19)));
            yy = 0 + (((tickAnim - 118) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 5) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 149) {
            xx = 1.7 + (((tickAnim - 123) / 26) * (6.68-(1.7)));
            yy = 0 + (((tickAnim - 123) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 26) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 154) {
            xx = 6.68 + (((tickAnim - 149) / 5) * (8.25-(6.68)));
            yy = 0 + (((tickAnim - 149) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 5) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 166) {
            xx = 8.25 + (((tickAnim - 154) / 12) * (4.56-(8.25)));
            yy = 0 + (((tickAnim - 154) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 12) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 181) {
            xx = 4.56 + (((tickAnim - 166) / 15) * (-2.15-(4.56)));
            yy = 0 + (((tickAnim - 166) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 15) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 204) {
            xx = -2.15 + (((tickAnim - 181) / 23) * (0-(-2.15)));
            yy = 0 + (((tickAnim - 181) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 23) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 204) / 16) * (4.01-(0)));
            yy = 0 + (((tickAnim - 204) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 16) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 242) {
            xx = 4.01 + (((tickAnim - 220) / 22) * (0-(4.01)));
            yy = 0 + (((tickAnim - 220) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 22) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 242) / 7) * (-3.44-(0)));
            yy = 0 + (((tickAnim - 242) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 7) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 268) {
            xx = -3.44 + (((tickAnim - 249) / 19) * (0-(-3.44)));
            yy = 0 + (((tickAnim - 249) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.375-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0.625 + (((tickAnim - 60) / 16) * (0.1-(0.625)));
            zz = 1.375 + (((tickAnim - 60) / 16) * (0-(1.375)));
        }
        else if (tickAnim >= 76 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 76) / 34) * (0-(0)));
            yy = 0.1 + (((tickAnim - 76) / 34) * (0-(0.1)));
            zz = 0 + (((tickAnim - 76) / 34) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0.3-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0.875-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 118) / 36) * (0-(0)));
            yy = 0.3 + (((tickAnim - 118) / 36) * (0-(0.3)));
            zz = 0.875 + (((tickAnim - 118) / 36) * (0-(0.875)));
        }
        else if (tickAnim >= 154 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 154) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 154) / 50) * (0.625-(0)));
            zz = 0 + (((tickAnim - 154) / 50) * (1.375-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 204) / 16) * (0-(0)));
            yy = 0.625 + (((tickAnim - 204) / 16) * (0.1-(0.625)));
            zz = 1.375 + (((tickAnim - 204) / 16) * (0.325-(1.375)));
        }
        else if (tickAnim >= 220 && tickAnim < 234) {
            xx = 0 + (((tickAnim - 220) / 14) * (0-(0)));
            yy = 0.1 + (((tickAnim - 220) / 14) * (0.155-(0.1)));
            zz = 0.325 + (((tickAnim - 220) / 14) * (0-(0.325)));
        }
        else if (tickAnim >= 234 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 234) / 8) * (0-(0)));
            yy = 0.155 + (((tickAnim - 234) / 8) * (0-(0.155)));
            zz = 0 + (((tickAnim - 234) / 8) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 242) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 7) * (0.3-(0)));
            zz = 0 + (((tickAnim - 242) / 7) * (0.875-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 249) / 19) * (0-(0)));
            yy = 0.3 + (((tickAnim - 249) / 19) * (0-(0.3)));
            zz = 0.875 + (((tickAnim - 249) / 19) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 60 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 16) * (1-(1)));
        }
        else if (tickAnim >= 76 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 76) / 34) * (1-(1)));
            yy = 1 + (((tickAnim - 76) / 34) * (1-(1)));
            zz = 1 + (((tickAnim - 76) / 34) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 154) {
            xx = 1 + (((tickAnim - 110) / 44) * (1-(1)));
            yy = 1 + (((tickAnim - 110) / 44) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 44) * (1-(1)));
        }
        else if (tickAnim >= 154 && tickAnim < 204) {
            xx = 1 + (((tickAnim - 154) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 154) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 154) / 50) * (1-(1)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 1 + (((tickAnim - 204) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 204) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 204) / 16) * (1-(1)));
        }
        else if (tickAnim >= 220 && tickAnim < 242) {
            xx = 1 + (((tickAnim - 220) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 220) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 220) / 22) * (1-(1)));
        }
        else if (tickAnim >= 242 && tickAnim < 268) {
            xx = 1 + (((tickAnim - 242) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 242) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 242) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.95888-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.0067-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.95888 + (((tickAnim - 10) / 10) * (-7.98202-(-4.95888)));
            yy = 0.0067 + (((tickAnim - 10) / 10) * (1.03001-(0.0067)));
            zz = -12 + (((tickAnim - 10) / 10) * (-14.4995-(-12)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -7.98202 + (((tickAnim - 20) / 51) * (-30.23202-(-7.98202)));
            yy = 1.03001 + (((tickAnim - 20) / 51) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 20) / 51) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = -30.23202 + (((tickAnim - 71) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 13) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 71) / 13) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 84 && tickAnim < 118) {
            xx = -30.23202 + (((tickAnim - 84) / 34) * (-24.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 84) / 34) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 84) / 34) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = -24.23202 + (((tickAnim - 118) / 12) * (-24.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 118) / 12) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 118) / 12) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = -24.23202 + (((tickAnim - 130) / 46) * (-30.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 130) / 46) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 130) / 46) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = -30.23202 + (((tickAnim - 176) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 176) / 13) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 176) / 13) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = -30.23202 + (((tickAnim - 189) / 33) * (-16.2048-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 189) / 33) * (1.27693-(1.03001)));
            zz = -14.4995 + (((tickAnim - 189) / 33) * (-12.44603-(-14.4995)));
        }
        else if (tickAnim >= 222 && tickAnim < 247) {
            xx = -16.2048 + (((tickAnim - 222) / 25) * (-10.75-(-16.2048)));
            yy = 1.27693 + (((tickAnim - 222) / 25) * (0-(1.27693)));
            zz = -12.44603 + (((tickAnim - 222) / 25) * (0-(-12.44603)));
        }
        else if (tickAnim >= 247 && tickAnim < 274) {
            xx = -10.75 + (((tickAnim - 247) / 27) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 247) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.39-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.39 + (((tickAnim - 10) / 10) * (-0.2-(4.39)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 22) / 1) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.445 + (((tickAnim - 25) / 2) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            yy = -0.2 + (((tickAnim - 27) / 44) * (1.675-(-0.2)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 13) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 84) / 49) * (0-(0)));
            yy = 1.675 + (((tickAnim - 84) / 49) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 84) / 49) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            yy = 1.675 + (((tickAnim - 133) / 43) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 176) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            yy = 1.675 + (((tickAnim - 189) / 33) * (2.125-(1.675)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 2.125 + (((tickAnim - 222) / 13) * (5.77-(2.125)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 235) / 12) * (0-(0)));
            yy = 5.77 + (((tickAnim - 235) / 12) * (0.6-(5.77)));
            zz = 0 + (((tickAnim - 235) / 12) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 247) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 247) / 1) * (0.985-(0.6)));
            zz = 0 + (((tickAnim - 247) / 1) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 250) {
            xx = 0 + (((tickAnim - 248) / 2) * (0-(0)));
            yy = 0.985 + (((tickAnim - 248) / 2) * (1.175-(0.985)));
            zz = 0 + (((tickAnim - 248) / 2) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 250) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 250) / 2) * (0.985-(1.175)));
            zz = 0 + (((tickAnim - 250) / 2) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 252) / 1) * (0-(0)));
            yy = 0.985 + (((tickAnim - 252) / 1) * (1.175-(0.985)));
            zz = 0 + (((tickAnim - 252) / 1) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 253) / 17) * (0-(0)));
            yy = 1.175 + (((tickAnim - 253) / 17) * (0-(1.175)));
            zz = 0 + (((tickAnim - 253) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.7246-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3737-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.56938-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.7246 + (((tickAnim - 10) / 10) * (-9.25-(5.7246)));
            yy = 0.3737 + (((tickAnim - 10) / 10) * (0-(0.3737)));
            zz = 7.56938 + (((tickAnim - 10) / 10) * (15.5-(7.56938)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 20) / 51) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 15.5 + (((tickAnim - 20) / 51) * (15.5-(15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 222) {
            xx = -5.75 + (((tickAnim - 71) / 151) * (-10.95655-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 151) * (-1.31781-(0)));
            zz = 15.5 + (((tickAnim - 71) / 151) * (11.72298-(15.5)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = -10.95655 + (((tickAnim - 222) / 13) * (0-(-10.95655)));
            yy = -1.31781 + (((tickAnim - 222) / 13) * (0-(-1.31781)));
            zz = 11.72298 + (((tickAnim - 222) / 13) * (0-(11.72298)));
        }
        else if (tickAnim >= 235 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 235) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 71) / 151) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 151) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 151) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 235) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.46-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.46 + (((tickAnim - 10) / 6) * (0-(22.46)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 10.75 + (((tickAnim - 20) / 51) * (17.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 17.75 + (((tickAnim - 71) / 47) * (15.53-(17.75)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 133) {
            xx = 15.53 + (((tickAnim - 118) / 15) * (15.53-(15.53)));
            yy = 0 + (((tickAnim - 118) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 15) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 15.53 + (((tickAnim - 133) / 43) * (18.54-(15.53)));
            yy = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 18.54 + (((tickAnim - 176) / 13) * (18.54-(18.54)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 18.54 + (((tickAnim - 189) / 33) * (12.5-(18.54)));
            yy = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 12.5 + (((tickAnim - 222) / 13) * (29.28-(12.5)));
            yy = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 241) {
            xx = 29.28 + (((tickAnim - 235) / 6) * (0-(29.28)));
            yy = 0 + (((tickAnim - 235) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 6) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 241) / 6) * (6-(0)));
            yy = 0 + (((tickAnim - 241) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 6) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 274) {
            xx = 6 + (((tickAnim - 247) / 27) * (0-(6)));
            yy = 0 + (((tickAnim - 247) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 20) / 202) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 202) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 13) * (0.55-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 235) / 12) * (0-(0)));
            yy = 0.55 + (((tickAnim - 235) / 12) * (0-(0.55)));
            zz = 0 + (((tickAnim - 235) / 12) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 247) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 247) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.91667-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -9.91667 + (((tickAnim - 20) / 23) * (-14.5-(-9.91667)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 5.5 + (((tickAnim - 20) / 23) * (16.5-(5.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -14.5 + (((tickAnim - 43) / 28) * (-30.23202-(-14.5)));
            yy = 0 + (((tickAnim - 43) / 28) * (1.03001-(0)));
            zz = 16.5 + (((tickAnim - 43) / 28) * (14.4995-(16.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = -30.23202 + (((tickAnim - 71) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 13) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 71) / 13) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 84 && tickAnim < 118) {
            xx = -30.23202 + (((tickAnim - 84) / 34) * (-24.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 84) / 34) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 84) / 34) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = -24.23202 + (((tickAnim - 118) / 12) * (-24.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 118) / 12) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 118) / 12) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = -24.23202 + (((tickAnim - 130) / 46) * (-30.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 130) / 46) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 130) / 46) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = -30.23202 + (((tickAnim - 176) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 176) / 13) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 176) / 13) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = -30.23202 + (((tickAnim - 189) / 33) * (-15.7048-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 189) / 33) * (1.27693-(1.03001)));
            zz = 14.4995 + (((tickAnim - 189) / 33) * (12.446-(14.4995)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = -15.7048 + (((tickAnim - 222) / 21) * (-8.75-(-15.7048)));
            yy = 1.27693 + (((tickAnim - 222) / 21) * (0-(1.27693)));
            zz = 12.446 + (((tickAnim - 222) / 21) * (16.5-(12.446)));
        }
        else if (tickAnim >= 243 && tickAnim < 262) {
            xx = -8.75 + (((tickAnim - 243) / 19) * (-3.25-(-8.75)));
            yy = 0 + (((tickAnim - 243) / 19) * (0-(0)));
            zz = 16.5 + (((tickAnim - 243) / 19) * (0-(16.5)));
        }
        else if (tickAnim >= 262 && tickAnim < 274) {
            xx = -3.25 + (((tickAnim - 262) / 12) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 262) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 12) * (0-(0)));
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
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (7.375-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 7.375 + (((tickAnim - 32) / 11) * (0.475-(7.375)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 43) / 1) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            yy = 0.255 + (((tickAnim - 44) / 2) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 46) / 2) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 48) / 1) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            yy = 0.475 + (((tickAnim - 49) / 11) * (2.055-(0.475)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 2.055 + (((tickAnim - 60) / 11) * (1.675-(2.055)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 13) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 84) / 49) * (0-(0)));
            yy = 1.675 + (((tickAnim - 84) / 49) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 84) / 49) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            yy = 1.675 + (((tickAnim - 133) / 43) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 176) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            yy = 1.675 + (((tickAnim - 189) / 33) * (1.775-(1.675)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            yy = 1.775 + (((tickAnim - 222) / 21) * (-2.475-(1.775)));
            zz = 0 + (((tickAnim - 222) / 21) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            yy = -2.475 + (((tickAnim - 243) / 10) * (3.295-(-2.475)));
            zz = 0 + (((tickAnim - 243) / 10) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 253) / 9) * (0-(0)));
            yy = 3.295 + (((tickAnim - 253) / 9) * (0-(3.295)));
            zz = 0 + (((tickAnim - 253) / 9) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 263) {
            xx = 0 + (((tickAnim - 262) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 1) * (-0.575-(0)));
            zz = 0 + (((tickAnim - 262) / 1) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 263) / 2) * (0-(0)));
            yy = -0.575 + (((tickAnim - 263) / 2) * (-0.3-(-0.575)));
            zz = 0 + (((tickAnim - 263) / 2) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 265) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 265) / 2) * (-0.575-(-0.3)));
            zz = 0 + (((tickAnim - 265) / 2) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 267) / 1) * (0-(0)));
            yy = -0.575 + (((tickAnim - 267) / 1) * (-0.3-(-0.575)));
            zz = 0 + (((tickAnim - 267) / 1) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 268) / 2) * (0-(0)));
            yy = -0.3 + (((tickAnim - 268) / 2) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 268) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.08333-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.16667-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.08333 + (((tickAnim - 20) / 12) * (-2.13194-(-3.08333)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = -5.16667 + (((tickAnim - 20) / 12) * (-8.18056-(-5.16667)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -2.13194 + (((tickAnim - 32) / 11) * (-9.25-(-2.13194)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = -8.18056 + (((tickAnim - 32) / 11) * (-15.5-(-8.18056)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 43) / 28) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = -15.5 + (((tickAnim - 43) / 28) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 222) {
            xx = -5.75 + (((tickAnim - 71) / 151) * (-9.25-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 151) * (0-(0)));
            zz = -15.5 + (((tickAnim - 71) / 151) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = -9.25 + (((tickAnim - 222) / 21) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            zz = -15.5 + (((tickAnim - 222) / 21) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = -5.75 + (((tickAnim - 243) / 10) * (-3.66108-(-5.75)));
            yy = 0 + (((tickAnim - 243) / 10) * (-0.5908-(0)));
            zz = -15.5 + (((tickAnim - 243) / 10) * (-12.33201-(-15.5)));
        }
        else if (tickAnim >= 253 && tickAnim < 262) {
            xx = -3.66108 + (((tickAnim - 253) / 9) * (0-(-3.66108)));
            yy = -0.5908 + (((tickAnim - 253) / 9) * (0-(-0.5908)));
            zz = -12.33201 + (((tickAnim - 253) / 9) * (0-(-12.33201)));
        }
        else if (tickAnim >= 262 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 262) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 0) / 222) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 222) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 222) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 21) * (2.175-(0)));
            zz = 0 + (((tickAnim - 222) / 21) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 243) / 19) * (0-(0)));
            yy = 2.175 + (((tickAnim - 243) / 19) * (0-(2.175)));
            zz = 0 + (((tickAnim - 243) / 19) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 262) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 8) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (5.92-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 5.92 + (((tickAnim - 20) / 12) * (17.12-(5.92)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 17.12 + (((tickAnim - 32) / 11) * (9.75-(17.12)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = 9.75 + (((tickAnim - 43) / 28) * (17.75-(9.75)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 28) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 17.75 + (((tickAnim - 71) / 47) * (15.53-(17.75)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 133) {
            xx = 15.53 + (((tickAnim - 118) / 15) * (15.53-(15.53)));
            yy = 0 + (((tickAnim - 118) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 15) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 15.53 + (((tickAnim - 133) / 43) * (18.54-(15.53)));
            yy = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 18.54 + (((tickAnim - 176) / 13) * (18.54-(18.54)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 18.54 + (((tickAnim - 189) / 33) * (12.5-(18.54)));
            yy = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 243) {
            xx = 12.5 + (((tickAnim - 222) / 21) * (11-(12.5)));
            yy = 0 + (((tickAnim - 222) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 21) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 11 + (((tickAnim - 243) / 10) * (22.53-(11)));
            yy = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 10) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = 22.53 + (((tickAnim - 253) / 5) * (-4.5-(22.53)));
            yy = 0 + (((tickAnim - 253) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 5) * (0-(0)));
        }
        else if (tickAnim >= 258 && tickAnim < 262) {
            xx = -4.5 + (((tickAnim - 258) / 4) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 258) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 258) / 4) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 262) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 262) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 32) / 187) * (0-(0)));
            yy = 0.6 + (((tickAnim - 32) / 187) * (0-(0.6)));
            zz = 0 + (((tickAnim - 32) / 187) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 219) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 219) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 24) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 243) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 243) / 10) * (0.725-(0)));
            zz = 0 + (((tickAnim - 243) / 10) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 253) / 5) * (0-(0)));
            yy = 0.725 + (((tickAnim - 253) / 5) * (0-(0.725)));
            zz = 0 + (((tickAnim - 253) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1 + (((tickAnim - 60) / 214) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 60) / 214) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 60) / 214) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 60) / 214) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 60) / 214) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 60) / 214) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 214) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
       if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 6.5 + (((tickAnim - 71) / 14) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 6.5 + (((tickAnim - 85) / 55) * (0-(6.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 10.5 + (((tickAnim - 71) / 14) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 10.5 + (((tickAnim - 85) / 55) * (0-(10.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (2.45-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 2.45 + (((tickAnim - 71) / 14) * (2.45-(2.45)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 2.45 + (((tickAnim - 85) / 55) * (0-(2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (15.43-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 85) {
            xx = 15.43 + (((tickAnim - 67) / 18) * (15.43-(15.43)));
            yy = 0 + (((tickAnim - 67) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 18) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 15.43 + (((tickAnim - 85) / 55) * (0-(15.43)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 68) / 17) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 85) / 55) * (0-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 12 + (((tickAnim - 71) / 14) * (12-(12)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 12 + (((tickAnim - 85) / 55) * (0-(12)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 49) / 22) * (-4.5-(5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -4.5 + (((tickAnim - 71) / 14) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -4.5 + (((tickAnim - 85) / 55) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5 + (((tickAnim - 49) / 22) * (-7.5-(6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 76) {
            xx = -7.5 + (((tickAnim - 71) / 5) * (-7.53456-(-7.5)));
            yy = 0 + (((tickAnim - 71) / 5) * (0.56977-(0)));
            zz = 0 + (((tickAnim - 71) / 5) * (-6.52907-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 85) {
            xx = -7.53456 + (((tickAnim - 76) / 9) * (-7.5-(-7.53456)));
            yy = 0.56977 + (((tickAnim - 76) / 9) * (0-(0.56977)));
            zz = -6.52907 + (((tickAnim - 76) / 9) * (0-(-6.52907)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -7.5 + (((tickAnim - 85) / 55) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 71) {
            xx = 10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 54) / 17) * (3-(10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 54) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 17) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 3 + (((tickAnim - 71) / 7) * (-5.25-(3)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -5.25 + (((tickAnim - 78) / 7) * (3-(-5.25)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 3 + (((tickAnim - 85) / 55) * (0-(3)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -18 + (((tickAnim - 60) / 80) * (0-(-18)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 7.5 + (((tickAnim - 49) / 22) * (0-(7.5)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 71) / 7) * (21.33-(0)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 21.33 + (((tickAnim - 78) / 5) * (0-(21.33)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 83) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 6 + (((tickAnim - 71) / 7) * (5.5-(6)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 140) {
            xx = 5.5 + (((tickAnim - 78) / 62) * (0-(5.5)));
            yy = 0 + (((tickAnim - 78) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 62) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.95888-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.0067-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.95888 + (((tickAnim - 10) / 10) * (-7.98202-(-4.95888)));
            yy = 0.0067 + (((tickAnim - 10) / 10) * (1.03001-(0.0067)));
            zz = -12 + (((tickAnim - 10) / 10) * (-14.4995-(-12)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -7.98202 + (((tickAnim - 20) / 51) * (-30.23202-(-7.98202)));
            yy = 1.03001 + (((tickAnim - 20) / 51) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 20) / 51) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -30.23202 + (((tickAnim - 71) / 14) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 14) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 71) / 14) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -30.23202 + (((tickAnim - 85) / 55) * (0-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 85) / 55) * (0-(1.03001)));
            zz = -14.4995 + (((tickAnim - 85) / 55) * (0-(-14.4995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.39-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.39 + (((tickAnim - 10) / 10) * (-0.2-(4.39)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 22) / 1) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.445 + (((tickAnim - 25) / 2) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            yy = -0.2 + (((tickAnim - 27) / 44) * (1.675-(-0.2)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 14) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 55) * (0-(1.675)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.7246-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3737-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.56938-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.7246 + (((tickAnim - 10) / 10) * (-9.25-(5.7246)));
            yy = 0.3737 + (((tickAnim - 10) / 10) * (0-(0.3737)));
            zz = 7.56938 + (((tickAnim - 10) / 10) * (15.5-(7.56938)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 20) / 51) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 15.5 + (((tickAnim - 20) / 51) * (15.5-(15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 71) / 14) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 15.5 + (((tickAnim - 71) / 14) * (15.5-(15.5)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 85) / 55) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 15.5 + (((tickAnim - 85) / 55) * (0-(15.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.46-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.46 + (((tickAnim - 10) / 6) * (0-(22.46)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 10.75 + (((tickAnim - 20) / 51) * (17.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 71) / 14) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 17.75 + (((tickAnim - 85) / 55) * (0-(17.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.91667-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -9.91667 + (((tickAnim - 20) / 23) * (-14.5-(-9.91667)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 5.5 + (((tickAnim - 20) / 23) * (16.5-(5.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -14.5 + (((tickAnim - 43) / 28) * (-30.23202-(-14.5)));
            yy = 0 + (((tickAnim - 43) / 28) * (1.03001-(0)));
            zz = 16.5 + (((tickAnim - 43) / 28) * (14.4995-(16.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -30.23202 + (((tickAnim - 71) / 14) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 14) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 71) / 14) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -30.23202 + (((tickAnim - 85) / 55) * (0-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 85) / 55) * (0-(1.03001)));
            zz = 14.4995 + (((tickAnim - 85) / 55) * (0-(14.4995)));
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
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (7.375-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 7.375 + (((tickAnim - 32) / 11) * (0.475-(7.375)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 43) / 1) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            yy = 0.255 + (((tickAnim - 44) / 2) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 46) / 2) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 48) / 1) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            yy = 0.475 + (((tickAnim - 49) / 11) * (2.055-(0.475)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 2.055 + (((tickAnim - 60) / 11) * (1.675-(2.055)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 14) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 55) * (0-(1.675)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.08333-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.16667-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.08333 + (((tickAnim - 20) / 12) * (-2.13194-(-3.08333)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = -5.16667 + (((tickAnim - 20) / 12) * (-8.18056-(-5.16667)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -2.13194 + (((tickAnim - 32) / 11) * (-9.25-(-2.13194)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = -8.18056 + (((tickAnim - 32) / 11) * (-15.5-(-8.18056)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 43) / 28) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = -15.5 + (((tickAnim - 43) / 28) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 71) / 14) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = -15.5 + (((tickAnim - 71) / 14) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 85) / 55) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = -15.5 + (((tickAnim - 85) / 55) * (0-(-15.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.92-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 5.92 + (((tickAnim - 20) / 12) * (17.12-(5.92)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 17.12 + (((tickAnim - 32) / 11) * (9.75-(17.12)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = 9.75 + (((tickAnim - 43) / 28) * (17.75-(9.75)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 28) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 71) / 14) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 17.75 + (((tickAnim - 85) / 55) * (0-(17.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1 + (((tickAnim - 60) / 80) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 20) / 10) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 30) / 20) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.8 + (((tickAnim - 20) / 10) * (-4.8-(-4.8)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.8 + (((tickAnim - 30) / 20) * (0-(-4.8)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.9 + (((tickAnim - 20) / 10) * (2.9-(2.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.9 + (((tickAnim - 30) / 20) * (0-(2.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.9 + (((tickAnim - 20) / 10) * (2.9-(2.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.9 + (((tickAnim - 30) / 20) * (0-(2.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.11313-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.77132-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5122-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.11313 + (((tickAnim - 20) / 10) * (0.11313-(0.11313)));
            yy = -12.77132 + (((tickAnim - 20) / 10) * (-12.77132-(-12.77132)));
            zz = -0.5122 + (((tickAnim - 20) / 10) * (-0.5122-(-0.5122)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.11313 + (((tickAnim - 30) / 20) * (0-(0.11313)));
            yy = -12.77132 + (((tickAnim - 30) / 20) * (0-(-12.77132)));
            zz = -0.5122 + (((tickAnim - 30) / 20) * (0-(-0.5122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 20) / 10) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 30) / 20) * (0-(24.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 10) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 20) * (0-(0.625)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.11313-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.7713-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5122-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.11313 + (((tickAnim - 20) / 10) * (0.11313-(0.11313)));
            yy = 12.7713 + (((tickAnim - 20) / 10) * (12.7713-(12.7713)));
            zz = -0.5122 + (((tickAnim - 20) / 10) * (-0.5122-(-0.5122)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.11313 + (((tickAnim - 30) / 20) * (0-(0.11313)));
            yy = 12.7713 + (((tickAnim - 30) / 20) * (0-(12.7713)));
            zz = -0.5122 + (((tickAnim - 30) / 20) * (0-(-0.5122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 20) / 10) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 30) / 20) * (0-(24.25)));
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
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
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
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 10) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 20) * (0-(0.625)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 25) / 8) * (0-(12)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 40) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (1.6-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 1.6 + (((tickAnim - 33) / 7) * (0-(1.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 25) / 8) * (2.13-(8.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.13 + (((tickAnim - 33) / 7) * (-5-(2.13)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 40) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (2.325-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 2.325 + (((tickAnim - 33) / 7) * (0-(2.325)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 25) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 14.25 + (((tickAnim - 25) / 8) * (17.5-(14.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 33) / 7) * (11.25-(17.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 40) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -25.75 + (((tickAnim - 25) / 8) * (7-(-25.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 33) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.925-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0.925 + (((tickAnim - 33) / 7) * (0-(0.925)));
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

    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5 + (((tickAnim - 22) / 33) * (-4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3 + (((tickAnim - 55) / 81) * (-4.5-(-4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -4.5 + (((tickAnim - 136) / 39) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (1.25-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.25 + (((tickAnim - 55) / 81) * (0-(1.25)));
            yy = -0.725 + (((tickAnim - 55) / 81) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            yy = -0.725 + (((tickAnim - 136) / 39) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -6.75 + (((tickAnim - 55) / 81) * (-6.75-(-6.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 55) / 81) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -6.75 + (((tickAnim - 136) / 39) * (0-(-6.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 136) / 39) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -3.25 + (((tickAnim - 55) / 81) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -3.25 + (((tickAnim - 136) / 39) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (4.5-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 4.5 + (((tickAnim - 55) / 81) * (3-(4.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 3 + (((tickAnim - 136) / 39) * (0-(3)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (5.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 5.75 + (((tickAnim - 55) / 81) * (14-(5.75)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 14 + (((tickAnim - 136) / 13) * (3.23-(14)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = 3.23 + (((tickAnim - 149) / 26) * (0-(3.23)));
            yy = 0 + (((tickAnim - 149) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 136) / 13) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = -3.5 + (((tickAnim - 149) / 26) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 149) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-1-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -1 + (((tickAnim - 55) / 81) * (-4.5-(-1)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -4.5 + (((tickAnim - 136) / 39) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (4-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 4 + (((tickAnim - 55) / 81) * (4-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 55) / 81) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 4 + (((tickAnim - 136) / 13) * (6.6383-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 136) / 13) * (0.27875-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = 6.6383 + (((tickAnim - 149) / 26) * (0-(6.6383)));
            yy = 0.27875 + (((tickAnim - 149) / 26) * (0-(0.27875)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (3-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 3 + (((tickAnim - 55) / 81) * (-0.5-(3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 55) / 81) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = -0.5 + (((tickAnim - 136) / 13) * (2.81752-(-0.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 136) / 13) * (0.55997-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = 2.81752 + (((tickAnim - 149) / 26) * (0-(2.81752)));
            yy = 0.55997 + (((tickAnim - 149) / 26) * (0-(0.55997)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (2.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 2.75 + (((tickAnim - 55) / 81) * (-1.25-(2.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2 + (((tickAnim - 55) / 81) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = -1.25 + (((tickAnim - 136) / 13) * (0.76613-(-1.25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2 + (((tickAnim - 136) / 13) * (-0.14223-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = 0.76613 + (((tickAnim - 149) / 26) * (0-(0.76613)));
            yy = -0.14223 + (((tickAnim - 149) / 26) * (0-(-0.14223)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (10.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 10.75 + (((tickAnim - 55) / 81) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 10.75 + (((tickAnim - 136) / 13) * (11.64-(10.75)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 11.64 + (((tickAnim - 149) / 7) * (7.14-(11.64)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 7.14 + (((tickAnim - 156) / 19) * (0-(7.14)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (8.77-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 8.77 + (((tickAnim - 43) / 12) * (12.5-(8.77)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 12.5 + (((tickAnim - 55) / 81) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 12.5 + (((tickAnim - 136) / 13) * (18.55-(12.5)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 18.55 + (((tickAnim - 149) / 7) * (10.76-(18.55)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 10.76 + (((tickAnim - 156) / 19) * (0-(10.76)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (14.62-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 14.62 + (((tickAnim - 43) / 12) * (23-(14.62)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 23 + (((tickAnim - 55) / 81) * (21.25-(23)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 21.25 + (((tickAnim - 136) / 13) * (28.36-(21.25)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 28.36 + (((tickAnim - 149) / 7) * (30.29-(28.36)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 30.29 + (((tickAnim - 156) / 19) * (0-(30.29)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.925-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.925 + (((tickAnim - 22) / 33) * (-4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3-(0.925)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3 + (((tickAnim - 55) / 81) * (-5-(-4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -5 + (((tickAnim - 136) / 39) * (0-(-5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.525 + (((tickAnim - 22) / 33) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3-(0.525)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3 + (((tickAnim - 55) / 81) * (0.25-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0.25 + (((tickAnim - 136) / 39) * (0-(0.25)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.38885-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-3.72472-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2 + (((tickAnim - 22) / 33) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2)));
            yy = -0.38885 + (((tickAnim - 22) / 33) * (0-(-0.38885)));
            zz = -3.72472 + (((tickAnim - 22) / 33) * (-0.75-(-3.72472)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 55) / 20) * (-1.75-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 55) / 20) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = -1.75 + (((tickAnim - 75) / 24) * (-3-(-1.75)));
            yy = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            zz = -0.75 + (((tickAnim - 75) / 24) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -3 + (((tickAnim - 99) / 14) * (-5-(-3)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = -0.75 + (((tickAnim - 99) / 14) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 159) {
            xx = -5 + (((tickAnim - 113) / 46) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3-(-5)));
            yy = 0 + (((tickAnim - 113) / 46) * (0-(0)));
            zz = -0.75 + (((tickAnim - 113) / 46) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 159 && tickAnim < 175) {
            xx = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3 + (((tickAnim - 159) / 16) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3)));
            yy = 0 + (((tickAnim - 159) / 16) * (0-(0)));
            zz = -0.75 + (((tickAnim - 159) / 16) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0.95);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.48805-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.56221-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-2.436-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 65) {
            xx = -0.48805 + (((tickAnim - 22) / 43) * (-1.49892-(-0.48805)));
            yy = -0.56221 + (((tickAnim - 22) / 43) * (-0.16871-(-0.56221)));
            zz = -2.436 + (((tickAnim - 22) / 43) * (-0.73078-(-2.436)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -1.49892 + (((tickAnim - 65) / 10) * (-0.69892-(-1.49892)));
            yy = -0.16871 + (((tickAnim - 65) / 10) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 65) / 10) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -0.69892 + (((tickAnim - 75) / 30) * (-2.99892-(-0.69892)));
            yy = -0.16871 + (((tickAnim - 75) / 30) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 75) / 30) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 105 && tickAnim < 133) {
            xx = -2.99892 + (((tickAnim - 105) / 28) * (-1.49892-(-2.99892)));
            yy = -0.16871 + (((tickAnim - 105) / 28) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 105) / 28) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 133 && tickAnim < 175) {
            xx = -1.49892 + (((tickAnim - 133) / 42) * (0-(-1.49892)));
            yy = -0.16871 + (((tickAnim - 133) / 42) * (0-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 133) / 42) * (0-(-0.73078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.71394-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.88501-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-4.66701-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = -0.71394 + (((tickAnim - 22) / 29) * (-3.2491-(-0.71394)));
            yy = -0.88501 + (((tickAnim - 22) / 29) * (-0.13989-(-0.88501)));
            zz = -4.66701 + (((tickAnim - 22) / 29) * (-0.73684-(-4.66701)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -3.2491 + (((tickAnim - 51) / 32) * (-4.4991-(-3.2491)));
            yy = -0.13989 + (((tickAnim - 51) / 32) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 51) / 32) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = -4.4991 + (((tickAnim - 83) / 20) * (-5.7491-(-4.4991)));
            yy = -0.13989 + (((tickAnim - 83) / 20) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 83) / 20) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 103 && tickAnim < 118) {
            xx = -5.7491 + (((tickAnim - 103) / 15) * (-3.2491-(-5.7491)));
            yy = -0.13989 + (((tickAnim - 103) / 15) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 103) / 15) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 118 && tickAnim < 146) {
            xx = -3.2491 + (((tickAnim - 118) / 28) * (-4.4991-(-3.2491)));
            yy = -0.13989 + (((tickAnim - 118) / 28) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 118) / 28) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 146 && tickAnim < 175) {
            xx = -4.4991 + (((tickAnim - 146) / 29) * (0-(-4.4991)));
            yy = -0.13989 + (((tickAnim - 146) / 29) * (0-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 146) / 29) * (0-(-0.73684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-1.01673-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.36571-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-5.23728-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 42) {
            xx = -1.01673 + (((tickAnim - 22) / 20) * (-8.25-(-1.01673)));
            yy = 0.36571 + (((tickAnim - 22) / 20) * (0-(0.36571)));
            zz = -5.23728 + (((tickAnim - 22) / 20) * (0-(-5.23728)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -8.25 + (((tickAnim - 42) / 9) * (-7.5-(-8.25)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 51) / 32) * (-6.5-(-7.5)));
            yy = 0 + (((tickAnim - 51) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 32) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 107) {
            xx = -6.5 + (((tickAnim - 83) / 24) * (-8.25-(-6.5)));
            yy = 0 + (((tickAnim - 83) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 24) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -8.25 + (((tickAnim - 107) / 6) * (-8.5-(-8.25)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 148) {
            xx = -8.5 + (((tickAnim - 113) / 35) * (-6.5-(-8.5)));
            yy = 0 + (((tickAnim - 113) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 35) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 175) {
            xx = -6.5 + (((tickAnim - 148) / 27) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 148) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-7-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 22) / 29) * (-14.77-(0)));
            yy = 0 + (((tickAnim - 22) / 29) * (0-(0)));
            zz = -7 + (((tickAnim - 22) / 29) * (0-(-7)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -14.77 + (((tickAnim - 51) / 32) * (5-(-14.77)));
            yy = 0 + (((tickAnim - 51) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 32) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 107) {
            xx = 5 + (((tickAnim - 83) / 24) * (-11.25-(5)));
            yy = 0 + (((tickAnim - 83) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 24) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -11.25 + (((tickAnim - 107) / 6) * (-14.77-(-11.25)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -14.77 + (((tickAnim - 113) / 7) * (-9.54-(-14.77)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 127) {
            xx = -9.54 + (((tickAnim - 120) / 7) * (-3-(-9.54)));
            yy = 0 + (((tickAnim - 120) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 7) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 147) {
            xx = -3 + (((tickAnim - 127) / 20) * (5-(-3)));
            yy = 0 + (((tickAnim - 127) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 20) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 175) {
            xx = 5 + (((tickAnim - 147) / 28) * (0-(5)));
            yy = 0 + (((tickAnim - 147) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = -7.5 + (((tickAnim - 22) / 29) * (-13.77793-(-7.5)));
            yy = 0 + (((tickAnim - 22) / 29) * (0.15585-(0)));
            zz = 0 + (((tickAnim - 22) / 29) * (-2.74558-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 84) {
            xx = -13.77793 + (((tickAnim - 51) / 33) * (5.45877-(-13.77793)));
            yy = 0.15585 + (((tickAnim - 51) / 33) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 51) / 33) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 84 && tickAnim < 107) {
            xx = 5.45877 + (((tickAnim - 84) / 23) * (-9.25373-(5.45877)));
            yy = 0.15585 + (((tickAnim - 84) / 23) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 84) / 23) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -9.25373 + (((tickAnim - 107) / 6) * (-13.77793-(-9.25373)));
            yy = 0.15585 + (((tickAnim - 107) / 6) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 107) / 6) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 113 && tickAnim < 154) {
            xx = -13.77793 + (((tickAnim - 113) / 41) * (5.45877-(-13.77793)));
            yy = 0.15585 + (((tickAnim - 113) / 41) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 113) / 41) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 154 && tickAnim < 175) {
            xx = 5.45877 + (((tickAnim - 154) / 21) * (0-(5.45877)));
            yy = 0.15585 + (((tickAnim - 154) / 21) * (0-(0.15585)));
            zz = -2.74558 + (((tickAnim - 154) / 21) * (0-(-2.74558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 39) {
            xx = -11.75 + (((tickAnim - 22) / 17) * (-14.28-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 17) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -14.28 + (((tickAnim - 39) / 19) * (-14.28-(-14.28)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 89) {
            xx = -14.28 + (((tickAnim - 58) / 31) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3-(-14.28)));
            yy = 0 + (((tickAnim - 58) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 31) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 112) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3 + (((tickAnim - 89) / 23) * (-15.28-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3)));
            yy = 0 + (((tickAnim - 89) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 23) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 175) {
            xx = -15.28 + (((tickAnim - 112) / 63) * (0-(-15.28)));
            yy = 0 + (((tickAnim - 112) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 38) / 13) * (13.5-(0)));
            yy = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 13) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 63) {
            xx = 13.5 + (((tickAnim - 51) / 12) * (0-(13.5)));
            yy = 0 + (((tickAnim - 51) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 12) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 63) / 37) * (-1-(0)));
            yy = 0 + (((tickAnim - 63) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 37) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -1 + (((tickAnim - 100) / 13) * (12.5-(-1)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 12.5 + (((tickAnim - 113) / 11) * (-1-(12.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 58) {
            xx = 4.75 + (((tickAnim - 22) / 36) * (9.25-(4.75)));
            yy = 0 + (((tickAnim - 22) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 36) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 126) {
            xx = 9.25 + (((tickAnim - 58) / 68) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 68) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 175) {
            xx = 9.25 + (((tickAnim - 126) / 49) * (0-(9.25)));
            yy = 0 + (((tickAnim - 126) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 58 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            zz = 0.425 + (((tickAnim - 58) / 68) * (0.425-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 3.25 + (((tickAnim - 22) / 33) * (14.25-(3.25)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 14.25 + (((tickAnim - 55) / 81) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 14.25 + (((tickAnim - 136) / 22) * (11.38-(14.25)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 11.38 + (((tickAnim - 158) / 17) * (0-(11.38)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0.575 + (((tickAnim - 22) / 33) * (0-(0.575)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (-4.025-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            yy = -4.025 + (((tickAnim - 158) / 17) * (0-(-4.025)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -12 + (((tickAnim - 22) / 33) * (0-(-12)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = -11.5 + (((tickAnim - 158) / 17) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 22) / 153) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 153) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 153) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 5.75 + (((tickAnim - 22) / 33) * (21.5-(5.75)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 21.5 + (((tickAnim - 55) / 81) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 21.5 + (((tickAnim - 136) / 39) * (0-(21.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0.225-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0.225 + (((tickAnim - 55) / 81) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            yy = 0.225 + (((tickAnim - 136) / 39) * (0-(0.225)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 3.25 + (((tickAnim - 22) / 33) * (13.75-(3.25)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 13.75 + (((tickAnim - 55) / 81) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 13.75 + (((tickAnim - 136) / 22) * (12.11-(13.75)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 12.11 + (((tickAnim - 158) / 17) * (0-(12.11)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0.575 + (((tickAnim - 22) / 33) * (0-(0.575)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (-3.05-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            yy = -3.05 + (((tickAnim - 158) / 17) * (0-(-3.05)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 22) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -12 + (((tickAnim - 22) / 33) * (0-(-12)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = -11.75 + (((tickAnim - 158) / 17) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 5.75 + (((tickAnim - 22) / 33) * (21.5-(5.75)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 21.5 + (((tickAnim - 55) / 81) * (21.5-(21.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 21.5 + (((tickAnim - 136) / 39) * (0-(21.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0.225-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0.225 + (((tickAnim - 55) / 81) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            yy = 0.225 + (((tickAnim - 136) / 39) * (0-(0.225)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -2.25 + (((tickAnim - 22) / 33) * (4-(-2.25)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 4 + (((tickAnim - 55) / 18) * (4.125-(4)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 136) {
            xx = 4.125 + (((tickAnim - 73) / 63) * (4-(4.125)));
            yy = 0 + (((tickAnim - 73) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 63) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 4 + (((tickAnim - 136) / 39) * (0-(4)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 22) / 153) * (0-(0)));
            yy = -0.7 + (((tickAnim - 22) / 153) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 22) / 153) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -2.25 + (((tickAnim - 22) / 33) * (4-(-2.25)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 4 + (((tickAnim - 55) / 18) * (4.125-(4)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 136) {
            xx = 4.125 + (((tickAnim - 73) / 63) * (4-(4.125)));
            yy = 0 + (((tickAnim - 73) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 63) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 4 + (((tickAnim - 136) / 39) * (0-(4)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 22) / 153) * (0-(0)));
            yy = -0.7 + (((tickAnim - 22) / 153) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 22) / 153) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

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
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 10) * (-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(0.025)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 10) / 10) * (0-(1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 10) / 10) * (0.025-(-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));

        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 5) * (3-(1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 10) / 10) * (0-(3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 5) / 5) * (-3.5-(-1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 5) * (-4.25-(-2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -4.25 + (((tickAnim - 10) / 10) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 5) / 5) * (-3-(-1.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.25 + (((tickAnim - 5) / 5) * (0-(2.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.67 + (((tickAnim - 14) / 6) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 7) * (-2.75-(2)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 10) / 4) * (-3.1-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.1 + (((tickAnim - 14) / 6) * (0-(-3.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 3.25 + (((tickAnim - 3) / 7) * (-2.5-(3.25)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 10) / 4) * (-3.75-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.75 + (((tickAnim - 14) / 6) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 7) * (-1-(0.75)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 4) * (-1.75-(-1)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -1.75 + (((tickAnim - 14) / 6) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



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
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



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




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.50107-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.0412-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 13.50107 + (((tickAnim - 5) / 8) * (-36.77887-(13.50107)));
            yy = -0.0412 + (((tickAnim - 5) / 8) * (-12.54388-(-0.0412)));
            zz = -27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3 + (((tickAnim - 5) / 8) * (2.18366-(-27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -36.77887 + (((tickAnim - 13) / 7) * (0-(-36.77887)));
            yy = -12.54388 + (((tickAnim - 13) / 7) * (0-(-12.54388)));
            zz = 2.18366 + (((tickAnim - 13) / 7) * (0-(2.18366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.675 + (((tickAnim - 8) / 5) * (2.675-(2.675)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2.675 + (((tickAnim - 13) / 7) * (0-(2.675)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-18.21853-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.77546-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.93468-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -18.21853 + (((tickAnim - 5) / 8) * (-22.03309-(-18.21853)));
            yy = -19.77546 + (((tickAnim - 5) / 8) * (-7.65226-(-19.77546)));
            zz = 9.93468 + (((tickAnim - 5) / 8) * (23.89096-(9.93468)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -22.03309 + (((tickAnim - 13) / 7) * (0-(-22.03309)));
            yy = -7.65226 + (((tickAnim - 13) / 7) * (0-(-7.65226)));
            zz = 23.89096 + (((tickAnim - 13) / 7) * (0-(23.89096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-5.10417-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 4) / 4) * (35.56426-(26.75)));
            yy = -5.10417 + (((tickAnim - 4) / 4) * (-12.76035-(-5.10417)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.69638-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.56426 + (((tickAnim - 8) / 5) * (-1.48451-(35.56426)));
            yy = -12.76035 + (((tickAnim - 8) / 5) * (-16.81566-(-12.76035)));
            zz = 0.69638 + (((tickAnim - 8) / 5) * (10.34377-(0.69638)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.48451 + (((tickAnim - 13) / 7) * (0-(-1.48451)));
            yy = -16.81566 + (((tickAnim - 13) / 7) * (0-(-16.81566)));
            zz = 10.34377 + (((tickAnim - 13) / 7) * (0-(10.34377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.825-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 12) * (0-(0.825)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.74271-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.33702-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.02281-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.74271 + (((tickAnim - 10) / 10) * (0-(2.74271)));
            yy = -0.33702 + (((tickAnim - 10) / 10) * (0-(-0.33702)));
            zz = -1.02281 + (((tickAnim - 10) / 10) * (0-(-1.02281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




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

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -13.25 + (((tickAnim - 0) / 34) * (21.7-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 21.7 + (((tickAnim - 34) / 9) * (3.08-(21.7)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.08 + (((tickAnim - 43) / 7) * (-13.25-(3.08)));
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
            yy = -1.15 + (((tickAnim - 0) / 34) * (-2.67-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = -2.67 + (((tickAnim - 34) / 9) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 43) / 7) * (-1.15-(0.5)));
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
            xx = 3.75 + (((tickAnim - 0) / 43) * (-19.16-(3.75)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -19.16 + (((tickAnim - 43) / 7) * (3.75-(-19.16)));
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
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -1.3 + (((tickAnim - 0) / 27) * (0.505-(-1.3)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.15-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            yy = 0.505 + (((tickAnim - 27) / 16) * (0.255-(0.505)));
            zz = 0.15 + (((tickAnim - 27) / 16) * (0-(0.15)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.255 + (((tickAnim - 43) / 7) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




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
            xx = 3.08 + (((tickAnim - 22) / 6) * (-13.25-(3.08)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 28) / 22) * (6.75-(-13.25)));
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
            yy = 0.5 + (((tickAnim - 22) / 6) * (-1.175-(0.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.175 + (((tickAnim - 28) / 22) * (-1.725-(-1.175)));
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
            xx = -19.16 + (((tickAnim - 22) / 6) * (3.75-(-19.16)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 28) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 1.025 + (((tickAnim - 0) / 22) * (0.255-(1.025)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.255 + (((tickAnim - 22) / 6) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 22) * (1.025-(-1.3)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




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
            yy = 0 + (((tickAnim - 0) / 26) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 26) / 7) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-0.15)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 33) / 5) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -1.425 + (((tickAnim - 0) / 18) * (-2.575-(-1.425)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -2.575 + (((tickAnim - 18) / 8) * (-3.475-(-2.575)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -3.475 + (((tickAnim - 26) / 6) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-3.475)));
            zz = 0 + (((tickAnim - 26) / 6) * (-1.025-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 32) / 6) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 32) / 6) * (0-(-1.025)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -1.55 + (((tickAnim - 38) / 12) * (-1.425-(-1.55)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




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
            yy = -0.15 + (((tickAnim - 0) / 8) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 8) / 7) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -2 + (((tickAnim - 0) / 8) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-2)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.025-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 8) / 7) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 8) / 7) * (0-(-1.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = -1.55 + (((tickAnim - 15) / 27) * (-2.78-(-1.55)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.78 + (((tickAnim - 42) / 8) * (-2-(-2.78)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-150))*0.215), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), hip.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(-0.225);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-150))*0.45), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5+115))*1.3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.78), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-1.7));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.385), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.259), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-120))*-1.8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.95-15))*-1.9), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.95-15))*1.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.4), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*1.3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*1.4), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.85));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*3.5), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.85));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*5.8), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-4.85));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*7.8), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*7), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-4.85));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/1.5-30))*15), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*9), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5.85));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.1), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.2), neck1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-0.3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*0.6));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck5.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-1.4));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -19.5 + (((tickAnim - 0) / 21) * (24.95-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 24.95 + (((tickAnim - 21) / 4) * (3.08-(24.95)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.08 + (((tickAnim - 25) / 5) * (-19.5-(3.08)));
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
            yy = -1.15 + (((tickAnim - 0) / 2) * (-1.595-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.595 + (((tickAnim - 2) / 1) * (-1.15-(-1.595)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.15 + (((tickAnim - 3) / 2) * (-1.595-(-1.15)));
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
            yy = 0.5 + (((tickAnim - 25) / 5) * (-1.15-(0.5)));
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
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -1.3 + (((tickAnim - 0) / 17) * (0.505-(-1.3)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.15-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.505 + (((tickAnim - 17) / 8) * (0.255-(0.505)));
            zz = 0.15 + (((tickAnim - 17) / 8) * (0-(0.15)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.255 + (((tickAnim - 25) / 5) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 13.75 + (((tickAnim - 0) / 17) * (-3.93-(13.75)));
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
            xx = -1.96 + (((tickAnim - 27) / 3) * (13.75-(-1.96)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




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
            xx = 3.08 + (((tickAnim - 13) / 5) * (-21.75-(3.08)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -21.75 + (((tickAnim - 18) / 12) * (5-(-21.75)));
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
            yy = 2 + (((tickAnim - 13) / 5) * (-1.175-(2)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -1.175 + (((tickAnim - 18) / 1) * (-1.625-(-1.175)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -1.625 + (((tickAnim - 19) / 2) * (-1.175-(-1.625)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -1.175 + (((tickAnim - 21) / 2) * (-1.625-(-1.175)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -1.625 + (((tickAnim - 23) / 1) * (-1.175-(-1.625)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -1.175 + (((tickAnim - 24) / 6) * (-1.725-(-1.175)));
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


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 0) / 12) * (0.255-(1.025)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.255 + (((tickAnim - 12) / 6) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -1.3 + (((tickAnim - 18) / 12) * (1.025-(-1.3)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




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


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 2) * (-0.37-(-1.125)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.37 + (((tickAnim - 2) / 1) * (0-(-0.37)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 13) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -1.275 + (((tickAnim - 16) / 3) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-1.275)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 19) / 4) * (-2.85-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -2.85 + (((tickAnim - 23) / 2) * (-2.48-(-2.85)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -2.48 + (((tickAnim - 25) / 2) * (-1.15-(-2.48)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -1.15 + (((tickAnim - 27) / 1) * (-1.255-(-1.15)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -1.255 + (((tickAnim - 28) / 2) * (-1.125-(-1.255)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.55 + (((tickAnim - 0) / 11) * (-2.575-(-1.55)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = -2.575 + (((tickAnim - 11) / 5) * (-3.475-(-2.575)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -3.475 + (((tickAnim - 16) / 3) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-3.475)));
            zz = 0 + (((tickAnim - 16) / 3) * (-1.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 19) / 4) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 19) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -1.55 + (((tickAnim - 23) / 7) * (-1.55-(-1.55)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




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
            yy = -2.975 + (((tickAnim - 0) / 5) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-2.975)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 5) / 4) * (-2.6-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -2.6 + (((tickAnim - 9) / 2) * (-2.44-(-2.6)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -2.44 + (((tickAnim - 11) / 2) * (-0.925-(-2.44)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 13) / 1) * (-1.115-(-0.925)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -1.115 + (((tickAnim - 14) / 2) * (-0.15-(-1.115)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 16) / 7) * (-0.3-(-0.15)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 23) / 7) * (-2.975-(-0.3)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 0) / 5) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-2)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 5) / 4) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 5) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = -1.55 + (((tickAnim - 9) / 17) * (-2.78-(-1.55)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -2.78 + (((tickAnim - 26) / 4) * (-2-(-2.78)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
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
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


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
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*0.895), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.9), hip.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.2);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.369);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+115))*1.3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.598), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.8));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.8), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.95-15))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-15))*2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.2), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1.3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.4), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1.4), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.85));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*3.5), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.8), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.85));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5.8), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4.85));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*7.8), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*7), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4.85));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-30))*15), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*9), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5.85));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.5), neck1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.6), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.4), neck3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.8));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.5), neck4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.285), neck5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.8), neck5.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.4));



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



        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-6.75), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiplodocus e = (EntityPrehistoricFloraDiplodocus) entity;
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
