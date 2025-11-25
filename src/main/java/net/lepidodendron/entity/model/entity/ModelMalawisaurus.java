package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMalawisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMalawisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Malawisaurus;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer jaws;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer cube_r57;

    private ModelAnimator animator;

    public ModelMalawisaurus() {
        this.textureWidth = 144;
        this.textureHeight = 144;

        this.Malawisaurus = new AdvancedModelRenderer(this);
        this.Malawisaurus.setRotationPoint(0.0F, 1.75F, 8.75F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Malawisaurus.addChild(hips);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-7.6648F, -4.9125F, 7.5597F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0404F, 0.6068F, 0.4805F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 8, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.01F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-7.6648F, -4.9125F, 7.5597F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0542F, 0.9119F, 0.4607F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 82, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.0F, -3.9125F, 1.8626F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 85, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.0F, -3.9125F, 1.8626F);
        this.hips.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 85, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(7.6648F, -4.9125F, 7.5597F);
        this.hips.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0542F, -0.9119F, -0.4607F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 82, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(7.6648F, -4.9125F, 7.5597F);
        this.hips.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0404F, -0.6068F, -0.4805F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 8, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 3.25F, 3.25F);
        this.hips.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 0, -6.0F, -8.0F, -10.0F, 13, 9, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 6.25F, 4.25F);
        this.hips.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 61, -7.0F, -9.0F, -11.0F, 15, 9, 12, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 84, 61, -4.5F, -4.0F, -3.0F, 9, 10, 12, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-6.9148F, -5.4125F, 7.0597F);
        this.tail1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0015F, 0.3253F, 0.49F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 5, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 3.25F, 0.0F, -0.75F, 1, 2, 1, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-6.9148F, -5.4125F, 7.0597F);
        this.tail1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0018F, 0.6307F, 0.4906F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 70, 0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(6.9148F, -5.4125F, 7.0597F);
        this.tail1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0018F, -0.6307F, -0.4906F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 70, -5.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(6.9148F, -5.4125F, 7.0597F);
        this.tail1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0015F, -0.3253F, -0.49F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -4.25F, 0.0F, -0.75F, 1, 2, 1, -0.01F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 5, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.75F, 8.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 97, -3.5F, -3.0F, -2.0F, 7, 7, 12, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-6.6648F, -5.1625F, 5.8097F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.031F, 0.299F, 0.5722F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 80, 53, 0.0F, 0.0F, 0.0F, 6, 2, 1, 0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 80, 45, 3.75F, 0.0F, -0.75F, 2, 2, 1, -0.01F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-6.6648F, -5.1625F, 5.8097F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, 0.5607F, 0.5627F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 78, 30, 0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(6.6648F, -5.1625F, 5.8097F);
        this.tail2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0349F, -0.5607F, -0.5627F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 78, 30, -6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(6.6648F, -5.1625F, 5.8097F);
        this.tail2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.031F, -0.299F, -0.5722F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 53, -6.0F, 0.0F, 0.0F, 6, 2, 1, 0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 45, -5.75F, 0.0F, -0.75F, 2, 2, 1, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.75F, 9.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3054F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 96, 45, -2.5F, -2.0F, -2.0F, 5, 5, 11, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-6.5648F, -5.4125F, 4.8097F);
        this.tail3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.006F, 0.3354F, 0.6711F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 36, 0.0F, 0.0F, 0.0F, 8, 2, 1, 0.01F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 94, 53, 4.5F, 0.0F, -0.7F, 3, 2, 1, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-6.5648F, -5.4125F, 4.8097F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0066F, 0.5536F, 0.6696F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, 0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(6.5648F, -5.4125F, 4.8097F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0066F, -0.5536F, -0.6696F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 17, -8.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(6.5648F, -5.4125F, 4.8097F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.006F, -0.3354F, -0.6711F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 36, -8.0F, 0.0F, 0.0F, 8, 2, 1, 0.01F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 94, 53, -7.5F, 0.0F, -0.7F, 3, 2, 1, -0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 8.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 106, 0, -2.0F, -1.5F, -2.0F, 4, 4, 11, 0.01F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.25F, 9.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 96, 107, -1.5F, -1.0F, -1.0F, 3, 3, 11, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.25F, 10.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, -0.3054F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 114, 61, -1.0F, -1.0F, -1.0F, 2, 2, 10, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.3054F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 113, 110, -0.5F, -1.0F, -1.0F, 1, 1, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.25F, -3.5F);
        this.hips.addChild(body);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-7.25F, -2.4125F, 1.3626F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 85, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-7.25F, -3.9125F, -2.8874F);
        this.body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 89, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-7.25F, -5.6625F, -6.3874F);
        this.body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 89, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-7.25F, -7.4125F, -10.1374F);
        this.body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(7.25F, -2.4125F, 1.3626F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 33, 85, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(7.25F, -3.9125F, -2.8874F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 89, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(7.25F, -5.6625F, -6.3874F);
        this.body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 33, 89, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(7.25F, -7.4125F, -10.1374F);
        this.body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 58, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 6.0F, -8.5F);
        this.body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.4625F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 36, -7.5F, -14.0F, -9.0F, 15, 7, 16, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 14.25F, -6.75F);
        this.body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.3491F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -9.5F, -16.0F, -14.0F, 19, 16, 20, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -4.0F, -13.0F);
        this.body.addChild(chest);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-5.25F, -5.4125F, -1.8874F);
        this.chest.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.6199F, 0.8432F, 0.0439F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 66, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-5.0F, -6.9125F, -5.6374F);
        this.chest.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.6515F, 0.8751F, -0.1284F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 74, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(5.25F, -5.4125F, -1.8874F);
        this.chest.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.6199F, -0.8432F, -0.0439F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 66, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(5.0F, -6.9125F, -5.6374F);
        this.chest.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.6515F, -0.8751F, 0.1284F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 74, 97, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.chest.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 82, -5.5F, -8.0F, -9.0F, 11, 11, 11, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 9.5F, -11.5F);
        this.chest.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -1.2654F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 85, 88, -6.5F, -10.0F, -9.0F, 13, 10, 9, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 12.5F, -6.25F);
        this.chest.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.5236F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 73, -7.5F, -14.0F, -6.0F, 15, 14, 10, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(7.5F, 8.5F, -7.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.1745F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 0, 0, -2.5F, -2.0F, -2.5F, 5, 12, 5, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3927F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 36, -2.0F, -1.0F, -2.0F, 4, 10, 4, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 46, 36, -2.5F, -1.5F, -1.5F, 5, 5, 3, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-7.5F, 8.5F, -7.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1745F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 0, 0, -2.5F, -2.0F, -2.5F, 5, 12, 5, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3927F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 36, -2.0F, -1.0F, -2.0F, 4, 10, 4, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 46, 36, -2.5F, -1.5F, -1.5F, 5, 5, 3, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.75F, -9.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.7418F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 46, 43, -4.5F, -8.5F, -12.0F, 9, 14, 16, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -11.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2443F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 80, 20, -3.5F, -7.5F, -13.0F, 7, 11, 14, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -3.5F, -13.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 104, -3.0F, -3.75F, -9.0F, 6, 8, 10, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.25F, -9.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0916F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 108, 15, -2.5F, -3.25F, -7.0F, 5, 6, 8, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -0.75F, -7.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.3054F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 95, 0, -2.0F, -2.25F, -5.0F, 4, 5, 6, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.4494F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 46, 44, -1.5F, -2.0F, -4.0F, 3, 3, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, 2.4531F, -3.9743F);
        this.head.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.4996F, -0.27F, -0.1446F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 1, 0.0F, -1.008F, -0.0103F, 0, 1, 2, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.5F, 2.4531F, -3.9743F);
        this.head.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.4996F, 0.27F, 0.1446F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 1, 0.0F, -1.008F, -0.0103F, 0, 1, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 1.0806F, -2.0958F);
        this.head.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.48F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 15, 0, 0.0F, -0.658F, -2.3103F, 1, 1, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, 1.1677F, -2.092F);
        this.head.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.48F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 18, 59, -0.5F, -1.0F, -2.5F, 2, 1, 1, 0.01F, false));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 65, -1.0F, -2.0F, -1.55F, 3, 2, 3, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.5F, -2.123F, -1.0173F);
        this.head.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -1.6581F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 10, 50, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5F, -1.9487F, -3.0097F);
        this.head.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -1.4835F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 80, 48, -0.5F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.5F, -0.5345F, -4.4239F);
        this.head.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.7854F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 98, 45, -0.5F, -2.0F, 0.0F, 2, 2, 2, 0.01F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.5F, 1.4351F, -4.7712F);
        this.head.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.1745F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 95, 0, -0.5F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.5F, 5.0F, 0.0F);
        this.head.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0873F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 78, 20, -1.5F, -7.0F, -1.75F, 4, 3, 3, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.0F, -1.2F, -1.35F);
        this.head.addChild(eyes);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 6.2F, 1.35F);
        this.eyes.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0873F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 8, 59, -1.5F, -6.75F, -1.25F, 4, 1, 1, 0.01F, false));

        this.jaws = new AdvancedModelRenderer(this);
        this.jaws.setRotationPoint(0.0F, 0.85F, 0.75F);
        this.head.addChild(jaws);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, 1.0293F, -4.9839F);
        this.jaws.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.4548F, -0.276F, -0.1325F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 2, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.5F, 1.0293F, -4.9839F);
        this.jaws.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.4548F, 0.276F, 0.1325F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 2, 0.0F, 0.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.5F, 1.3139F, -2.7548F);
        this.jaws.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.4363F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 3, 0, 0.0F, -1.2F, -1.9F, 1, 1, 0, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 59, -0.5F, -0.95F, -2.15F, 2, 1, 1, 0.0F, false));
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 33, 82, -1.0F, -0.95F, -1.2F, 3, 1, 2, -0.01F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-0.5F, 0.3177F, -2.842F);
        this.jaws.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.3927F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 50, -1.5F, -0.05F, 1.842F, 4, 1, 1, -0.03F, false));
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 80, 56, -1.5F, -0.05F, -0.008F, 4, 1, 2, -0.02F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-0.5F, 0.3177F, -2.842F);
        this.jaws.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.2654F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 94, 83, -1.5F, -0.05F, -0.008F, 4, 2, 2, -0.04F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.5F, 4.15F, -0.75F);
        this.jaws.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0873F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 78, 26, -1.5F, -4.0F, -1.75F, 4, 1, 3, -0.01F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.0F, 1.2921F, -2.5058F);
        this.jaws.addChild(throat);
        this.setRotateAngle(throat, 0.0873F, 0.0F, 0.0F);


        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.throat.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.2618F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 58, 0, -0.5F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-0.5F, 0.3473F, 1.9696F);
        this.throat.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.4363F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 59, -0.5F, -2.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(7.5F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.2618F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 70, 107, -3.0F, -2.0F, -3.0F, 6, 15, 7, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 13.0F, -0.75F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.4363F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 32, 116, -2.5F, -1.0F, -1.5F, 5, 11, 5, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 8.5F, 0.5F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1745F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 80, 45, -3.0F, -0.25F, -2.5F, 6, 2, 6, 0.0F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.0F, -0.25F, -2.5F);
        this.leftFoot.addChild(leftToes);


        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToes.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.1745F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 62, 39, -2.5F, 0.0F, -1.5F, 5, 2, 2, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-7.5F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.2618F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 70, 107, -3.0F, -2.0F, -3.0F, 6, 15, 7, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 13.0F, -0.75F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.4363F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 32, 116, -2.5F, -1.0F, -1.5F, 5, 11, 5, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 8.5F, 0.5F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1745F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 80, 45, -3.0F, -0.25F, -2.5F, 6, 2, 6, 0.0F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(0.0F, -0.25F, -2.5F);
        this.rightFoot.addChild(rightToes);


        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToes.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.1745F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 62, 39, -2.5F, 0.0F, -1.5F, 5, 2, 2, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Malawisaurus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Malawisaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Malawisaurus.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Malawisaurus.offsetY = 0.6F;
        this.Malawisaurus.offsetX = 0.F;
        this.Malawisaurus.rotateAngleY = (float)Math.toRadians(225);
        this.Malawisaurus.rotateAngleX = (float)Math.toRadians(0);
        this.Malawisaurus.rotateAngleZ = (float)Math.toRadians(0);
        this.Malawisaurus.scaleChildren = true;
        float scaler = 0.48F;
        this.Malawisaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Malawisaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Malawisaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Malawisaurus.scaleChildren = false;
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

        EntityPrehistoricFloraMalawisaurus Malawisaurus = (EntityPrehistoricFloraMalawisaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Malawisaurus.getJuvenile();

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

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Malawisaurus.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Malawisaurus.getTravelSpeed()/2;

        if (!Malawisaurus.isInWater()) {

            if (f3 == 0.0F || !Malawisaurus.getIsMoving()) {
                if (Malawisaurus.getAnimation() != Malawisaurus.EAT_ANIMATION
                        && Malawisaurus.getAnimation() != Malawisaurus.DRINK_ANIMATION
                        && Malawisaurus.getAnimation() != Malawisaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Malawisaurus.getAnimation() != Malawisaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Malawisaurus.getAnimation() != Malawisaurus.EAT_ANIMATION
                    && Malawisaurus.getAnimation() != Malawisaurus.DRINK_ANIMATION
                    && Malawisaurus.getAnimation() != Malawisaurus.ATTACK_ANIMATION
                    && Malawisaurus.getAnimation() != Malawisaurus.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Malawisaurus.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
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
        EntityPrehistoricFloraMalawisaurus ee = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;

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
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 95;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 44) {
            xx = 7.25 + (((tickAnim - 29) / 15) * (-7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*13-(7.25)));
            yy = 0 + (((tickAnim - 29) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 15) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*13 + (((tickAnim - 44) / 4) * (-12.95-(-7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*13)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -12.95 + (((tickAnim - 48) / 8) * (-12.95-(-12.95)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -12.95 + (((tickAnim - 56) / 17) * (12.5-(-12.95)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 12.5 + (((tickAnim - 73) / 4) * (14.25-(12.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 14.25 + (((tickAnim - 77) / 18) * (0-(14.25)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (2.775-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            zz = 2.775 + (((tickAnim - 29) / 17) * (3.275-(2.775)));
        }
        else if (tickAnim >= 46 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 46) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 31) * (0-(0)));
            zz = 3.275 + (((tickAnim - 46) / 31) * (3.28-(3.275)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 3.28 + (((tickAnim - 77) / 18) * (0-(3.28)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 3.25 + (((tickAnim - 29) / 9) * (-13.93-(3.25)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -13.93 + (((tickAnim - 38) / 8) * (-4.5-(-13.93)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -4.5 + (((tickAnim - 46) / 10) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -4.5 + (((tickAnim - 56) / 17) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (1.5-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 1.5 + (((tickAnim - 77) / 18) * (0-(1.5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 2.25 + (((tickAnim - 29) / 9) * (-14.73-(2.25)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -14.73 + (((tickAnim - 38) / 7) * (-15.25-(-14.73)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = -15.25 + (((tickAnim - 45) / 6) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -15.25 + (((tickAnim - 51) / 5) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -15.25 + (((tickAnim - 56) / 17) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (2-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 2 + (((tickAnim - 77) / 18) * (0-(2)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 29) / 9) * (-19.41987-(1)));
            yy = 0 + (((tickAnim - 29) / 9) * (-0.37956-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (-0.34523-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -19.41987 + (((tickAnim - 38) / 7) * (-7.42-(-19.41987)));
            yy = -0.37956 + (((tickAnim - 38) / 7) * (-0.62972-(-0.37956)));
            zz = -0.34523 + (((tickAnim - 38) / 7) * (-0.57276-(-0.34523)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -7.42 + (((tickAnim - 45) / 2) * (-4.34857-(-7.42)));
            yy = -0.62972 + (((tickAnim - 45) / 2) * (-0.62972-(-0.62972)));
            zz = -0.57276 + (((tickAnim - 45) / 2) * (-0.57276-(-0.57276)));
        }
        else if (tickAnim >= 47 && tickAnim < 51) {
            xx = -4.34857 + (((tickAnim - 47) / 4) * (-3.67-(-4.34857)));
            yy = -0.62972 + (((tickAnim - 47) / 4) * (-0.62972-(-0.62972)));
            zz = -0.57276 + (((tickAnim - 47) / 4) * (-0.57276-(-0.57276)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -3.67 + (((tickAnim - 51) / 5) * (-3.67-(-3.67)));
            yy = -0.62972 + (((tickAnim - 51) / 5) * (-0.62972-(-0.62972)));
            zz = -0.57276 + (((tickAnim - 51) / 5) * (-0.57276-(-0.57276)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = -3.67 + (((tickAnim - 56) / 2) * (-5.8466-(-3.67)));
            yy = -0.62972 + (((tickAnim - 56) / 2) * (-0.49118-(-0.62972)));
            zz = -0.57276 + (((tickAnim - 56) / 2) * (-0.44675-(-0.57276)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = -5.8466 + (((tickAnim - 58) / 15) * (0-(-5.8466)));
            yy = -0.49118 + (((tickAnim - 58) / 15) * (0-(-0.49118)));
            zz = -0.44675 + (((tickAnim - 58) / 15) * (0-(-0.44675)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (1.75-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 1.75 + (((tickAnim - 77) / 18) * (0-(1.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 1.5 + (((tickAnim - 29) / 9) * (7.17-(1.5)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 7.17 + (((tickAnim - 38) / 7) * (2.25-(7.17)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 2.25 + (((tickAnim - 45) / 3) * (0.36-(2.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 51) {
            xx = 0.36 + (((tickAnim - 48) / 3) * (0.75-(0.36)));
            yy = 0 + (((tickAnim - 48) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 3) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 0.75 + (((tickAnim - 51) / 5) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 0.75 + (((tickAnim - 56) / 2) * (-7.2-(0.75)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = -7.2 + (((tickAnim - 58) / 15) * (0-(-7.2)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -2.75 + (((tickAnim - 77) / 18) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 6.75 + (((tickAnim - 29) / 9) * (21.06242-(6.75)));
            yy = 0 + (((tickAnim - 29) / 9) * (0.38452-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0.70629-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 21.06242 + (((tickAnim - 38) / 0) * (31.71245-(21.06242)));
            yy = 0.38452 + (((tickAnim - 38) / 0) * (0.33183-(0.38452)));
            zz = 0.70629 + (((tickAnim - 38) / 0) * (0.60951-(0.70629)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 31.71245 + (((tickAnim - 38) / 1) * (36.82624-(31.71245)));
            yy = 0.33183 + (((tickAnim - 38) / 1) * (0.21659-(0.33183)));
            zz = 0.60951 + (((tickAnim - 38) / 1) * (0.39783-(0.60951)));
        }
        else if (tickAnim >= 39 && tickAnim < 41) {
            xx = 36.82624 + (((tickAnim - 39) / 2) * (35.33035-(36.82624)));
            yy = 0.21659 + (((tickAnim - 39) / 2) * (0.19939-(0.21659)));
            zz = 0.39783 + (((tickAnim - 39) / 2) * (0.36623-(0.39783)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 35.33035 + (((tickAnim - 41) / 4) * (33.5-(35.33035)));
            yy = 0.19939 + (((tickAnim - 41) / 4) * (0-(0.19939)));
            zz = 0.36623 + (((tickAnim - 41) / 4) * (0-(0.36623)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 33.5 + (((tickAnim - 45) / 11) * (33.5-(33.5)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 33.5 + (((tickAnim - 56) / 2) * (26.85-(33.5)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 26.85 + (((tickAnim - 58) / 5) * (5.2-(26.85)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 5.2 + (((tickAnim - 63) / 4) * (0.28-(5.2)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 0.28 + (((tickAnim - 67) / 6) * (8.75-(0.28)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 8.75 + (((tickAnim - 73) / 4) * (11.75-(8.75)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 11.75 + (((tickAnim - 77) / 18) * (0-(11.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (-0.6-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 38) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 57) * (0-(0)));
            zz = -0.6 + (((tickAnim - 38) / 57) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (35.98-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 35.98 + (((tickAnim - 38) / 0) * (29.07-(35.98)));
            yy = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 0) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 29.07 + (((tickAnim - 38) / 1) * (16.23-(29.07)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 16.23 + (((tickAnim - 39) / 1) * (20.5-(16.23)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 20.5 + (((tickAnim - 40) / 1) * (21.63-(20.5)));
            yy = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 21.63 + (((tickAnim - 41) / 4) * (27.25-(21.63)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 27.25 + (((tickAnim - 45) / 6) * (21.25-(27.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 21.25 + (((tickAnim - 51) / 5) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 21.25 + (((tickAnim - 56) / 2) * (28.89-(21.25)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 28.89 + (((tickAnim - 58) / 5) * (11.2-(28.89)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 11.2 + (((tickAnim - 63) / 4) * (-8.72-(11.2)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -8.72 + (((tickAnim - 67) / 6) * (4.5-(-8.72)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 4.5 + (((tickAnim - 73) / 4) * (10.5-(4.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 10.5 + (((tickAnim - 77) / 18) * (0-(10.5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (32.89-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = 32.89 + (((tickAnim - 38) / 1) * (13.89-(32.89)));
            yy = 0 + (((tickAnim - 38) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 1) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 40) {
            xx = 13.89 + (((tickAnim - 39) / 1) * (14.14-(13.89)));
            yy = 0 + (((tickAnim - 39) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 1) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 14.14 + (((tickAnim - 40) / 5) * (16-(14.14)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 16 + (((tickAnim - 45) / 2) * (14-(16)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 56) {
            xx = 14 + (((tickAnim - 47) / 9) * (14-(14)));
            yy = 0 + (((tickAnim - 47) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 9) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 58) {
            xx = 14 + (((tickAnim - 56) / 2) * (21.39-(14)));
            yy = 0 + (((tickAnim - 56) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 2) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 21.39 + (((tickAnim - 58) / 5) * (28.99-(21.39)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 67) {
            xx = 28.99 + (((tickAnim - 63) / 4) * (-9.34-(28.99)));
            yy = 0 + (((tickAnim - 63) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 4) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -9.34 + (((tickAnim - 67) / 6) * (0-(-9.34)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (13.75-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 13.75 + (((tickAnim - 77) / 18) * (0-(13.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (2.525-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = 2.525 + (((tickAnim - 29) / 17) * (-18.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(2.525)));
            yy = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 17) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -18.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 46) / 10) * (-12.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*9-(-18.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -12.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*9 + (((tickAnim - 56) / 17) * (-0.5-(-12.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*9)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -0.5 + (((tickAnim - 73) / 4) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -0.5 + (((tickAnim - 77) / 18) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 45) {
            xx = 5.25 + (((tickAnim - 29) / 16) * (-5.25-(5.25)));
            yy = 0 + (((tickAnim - 29) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 16) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = -5.25 + (((tickAnim - 45) / 11) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -5.25 + (((tickAnim - 56) / 17) * (5.5-(-5.25)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 5.5 + (((tickAnim - 73) / 4) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 5.5 + (((tickAnim - 77) / 18) * (0-(5.5)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-27.8744-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (2.15825-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (6.66055-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -27.8744 + (((tickAnim - 29) / 19) * (27.69158-(-27.8744)));
            yy = 2.15825 + (((tickAnim - 29) / 19) * (0.60701-(2.15825)));
            zz = 6.66055 + (((tickAnim - 29) / 19) * (1.87328-(6.66055)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 27.69158 + (((tickAnim - 48) / 8) * (27.69158-(27.69158)));
            yy = 0.60701 + (((tickAnim - 48) / 8) * (0.60701-(0.60701)));
            zz = 1.87328 + (((tickAnim - 48) / 8) * (1.87328-(1.87328)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 27.69158 + (((tickAnim - 56) / 17) * (-45-(27.69158)));
            yy = 0.60701 + (((tickAnim - 56) / 17) * (0-(0.60701)));
            zz = 1.87328 + (((tickAnim - 56) / 17) * (0-(1.87328)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -45 + (((tickAnim - 73) / 4) * (-49-(-45)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -49 + (((tickAnim - 77) / 18) * (0-(-49)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-6.75-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -34.5 + (((tickAnim - 29) / 10) * (17.5-(-34.5)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = -6.75 + (((tickAnim - 29) / 10) * (0-(-6.75)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 17.5 + (((tickAnim - 39) / 9) * (-2.25-(17.5)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -2.25 + (((tickAnim - 48) / 8) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -2.25 + (((tickAnim - 56) / 5) * (12.48-(-2.25)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = 12.48 + (((tickAnim - 61) / 2) * (14.15-(12.48)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 14.15 + (((tickAnim - 63) / 7) * (-18.97-(14.15)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -18.97 + (((tickAnim - 70) / 3) * (-23-(-18.97)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -23 + (((tickAnim - 73) / 4) * (-23-(-23)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -23 + (((tickAnim - 77) / 18) * (0-(-23)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 50.5 + (((tickAnim - 29) / 10) * (-4.25-(50.5)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -4.25 + (((tickAnim - 39) / 9) * (33.75-(-4.25)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 33.75 + (((tickAnim - 48) / 8) * (33.75-(33.75)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 33.75 + (((tickAnim - 56) / 7) * (0-(33.75)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (44.9-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 44.9 + (((tickAnim - 70) / 3) * (52.25-(44.9)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 52.25 + (((tickAnim - 73) / 4) * (52.25-(52.25)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 52.25 + (((tickAnim - 77) / 18) * (0-(52.25)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 29) / 10) * (-1.05-(0.5)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            yy = -1.05 + (((tickAnim - 39) / 9) * (0-(-1.05)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 7) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = -0.825 + (((tickAnim - 63) / 7) * (0.3-(-0.825)));
            zz = 0 + (((tickAnim - 63) / 7) * (0.2-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 70) / 3) * (0.725-(0.3)));
            zz = 0.2 + (((tickAnim - 70) / 3) * (0-(0.2)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 73) / 4) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0.725 + (((tickAnim - 77) / 18) * (0-(0.725)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-27.8744-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (2.15825-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (6.66055-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = -27.8744 + (((tickAnim - 29) / 19) * (35.75-(-27.8744)));
            yy = 2.15825 + (((tickAnim - 29) / 19) * (0-(2.15825)));
            zz = 6.66055 + (((tickAnim - 29) / 19) * (0-(6.66055)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 35.75 + (((tickAnim - 48) / 8) * (35.75-(35.75)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 35.75 + (((tickAnim - 56) / 17) * (-45-(35.75)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -45 + (((tickAnim - 73) / 4) * (-49-(-45)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -49 + (((tickAnim - 77) / 18) * (0-(-49)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (-6.75-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = -34.5 + (((tickAnim - 29) / 10) * (18.3125-(-34.5)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = -6.75 + (((tickAnim - 29) / 10) * (-4.78125-(-6.75)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 18.3125 + (((tickAnim - 39) / 9) * (-27.25-(18.3125)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = -4.78125 + (((tickAnim - 39) / 9) * (0-(-4.78125)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = -27.25 + (((tickAnim - 48) / 8) * (-27.25-(-27.25)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 61) {
            xx = -27.25 + (((tickAnim - 56) / 5) * (-5.95-(-27.25)));
            yy = 0 + (((tickAnim - 56) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 5) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 63) {
            xx = -5.95 + (((tickAnim - 61) / 2) * (9.68-(-5.95)));
            yy = 0 + (((tickAnim - 61) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 2) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 9.68 + (((tickAnim - 63) / 7) * (-20.14-(9.68)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = -20.14 + (((tickAnim - 70) / 3) * (-23-(-20.14)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -23 + (((tickAnim - 73) / 4) * (-23-(-23)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -23 + (((tickAnim - 77) / 18) * (0-(-23)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (50.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 50.5 + (((tickAnim - 29) / 10) * (-4.25-(50.5)));
            yy = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -4.25 + (((tickAnim - 39) / 9) * (36-(-4.25)));
            yy = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 36 + (((tickAnim - 48) / 8) * (36-(36)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 36 + (((tickAnim - 56) / 7) * (0-(36)));
            yy = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (45-(0)));
            yy = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 45 + (((tickAnim - 70) / 3) * (52.25-(45)));
            yy = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 52.25 + (((tickAnim - 73) / 4) * (52.25-(52.25)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 52.25 + (((tickAnim - 77) / 18) * (0-(52.25)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (0-(0)));
            yy = 0.5 + (((tickAnim - 29) / 10) * (-1-(0.5)));
            zz = 0 + (((tickAnim - 29) / 10) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 39) / 9) * (0-(0)));
            yy = -1 + (((tickAnim - 39) / 9) * (0-(-1)));
            zz = 0 + (((tickAnim - 39) / 9) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 8) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 56) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 7) * (-1.3-(0)));
            zz = 0 + (((tickAnim - 56) / 7) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 63) / 7) * (0-(0)));
            yy = -1.3 + (((tickAnim - 63) / 7) * (0.4-(-1.3)));
            zz = 0 + (((tickAnim - 63) / 7) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 70) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 70) / 3) * (0.725-(0.4)));
            zz = 0 + (((tickAnim - 70) / 3) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = 0.725 + (((tickAnim - 73) / 4) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = 0.725 + (((tickAnim - 77) / 18) * (0-(0.725)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = -1.5 + (((tickAnim - 29) / 17) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 17) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 46) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 2.5 + (((tickAnim - 56) / 17) * (3.97245-(2.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (-2.77644-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (1.13684-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 3.97245 + (((tickAnim - 73) / 4) * (4.47245-(3.97245)));
            yy = -2.77644 + (((tickAnim - 73) / 4) * (-2.77644-(-2.77644)));
            zz = 1.13684 + (((tickAnim - 73) / 4) * (1.13684-(1.13684)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 4.47245 + (((tickAnim - 77) / 18) * (0-(4.47245)));
            yy = -2.77644 + (((tickAnim - 77) / 18) * (0-(-2.77644)));
            zz = 1.13684 + (((tickAnim - 77) / 18) * (0-(1.13684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0.20949-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (-0.66526-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (1.45868-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = 0.20949 + (((tickAnim - 29) / 17) * (8-(0.20949)));
            yy = -0.66526 + (((tickAnim - 29) / 17) * (0-(-0.66526)));
            zz = 1.45868 + (((tickAnim - 29) / 17) * (0-(1.45868)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 8 + (((tickAnim - 46) / 5) * (6.525-(8)));
            yy = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 6.525 + (((tickAnim - 51) / 5) * (4.5-(6.525)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 77) {
            xx = 4.5 + (((tickAnim - 56) / 21) * (-9.99579-(4.5)));
            yy = 0 + (((tickAnim - 56) / 21) * (-5.2492-(0)));
            zz = 0 + (((tickAnim - 56) / 21) * (-0.09188-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -9.99579 + (((tickAnim - 77) / 18) * (0-(-9.99579)));
            yy = -5.2492 + (((tickAnim - 77) / 18) * (0-(-5.2492)));
            zz = -0.09188 + (((tickAnim - 77) / 18) * (0-(-0.09188)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = -4 + (((tickAnim - 29) / 17) * (8.5-(-4)));
            yy = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 17) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = 8.5 + (((tickAnim - 46) / 10) * (3.5-(8.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 77) {
            xx = 3.5 + (((tickAnim - 56) / 21) * (-0.6922-(3.5)));
            yy = 0 + (((tickAnim - 56) / 21) * (-7.19173-(0)));
            zz = 0 + (((tickAnim - 56) / 21) * (-0.91978-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -0.6922 + (((tickAnim - 77) / 18) * (0-(-0.6922)));
            yy = -7.19173 + (((tickAnim - 77) / 18) * (0-(-7.19173)));
            zz = -0.91978 + (((tickAnim - 77) / 18) * (0-(-0.91978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 56) {
            xx = -15.75 + (((tickAnim - 29) / 27) * (-4.91353-(-15.75)));
            yy = 0 + (((tickAnim - 29) / 27) * (-0.12291-(0)));
            zz = 0 + (((tickAnim - 29) / 27) * (0.70763-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -4.91353 + (((tickAnim - 56) / 17) * (-8.59902-(-4.91353)));
            yy = -0.12291 + (((tickAnim - 56) / 17) * (-7.30483-(-0.12291)));
            zz = 0.70763 + (((tickAnim - 56) / 17) * (-0.28636-(0.70763)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -8.59902 + (((tickAnim - 73) / 4) * (-2.84902-(-8.59902)));
            yy = -7.30483 + (((tickAnim - 73) / 4) * (-7.30483-(-7.30483)));
            zz = -0.28636 + (((tickAnim - 73) / 4) * (-0.28636-(-0.28636)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -2.84902 + (((tickAnim - 77) / 18) * (0-(-2.84902)));
            yy = -7.30483 + (((tickAnim - 77) / 18) * (0-(-7.30483)));
            zz = -0.28636 + (((tickAnim - 77) / 18) * (0-(-0.28636)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 54) {
            xx = -17.75 + (((tickAnim - 29) / 25) * (-11.25-(-17.75)));
            yy = 0 + (((tickAnim - 29) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 25) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 56) {
            xx = -11.25 + (((tickAnim - 54) / 2) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 54) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 2) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -11.25 + (((tickAnim - 56) / 17) * (2.26464-(-11.25)));
            yy = 0 + (((tickAnim - 56) / 17) * (-3.20769-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (-0.52296-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 2.26464 + (((tickAnim - 73) / 4) * (2.26464-(2.26464)));
            yy = -3.20769 + (((tickAnim - 73) / 4) * (-3.20769-(-3.20769)));
            zz = -0.52296 + (((tickAnim - 73) / 4) * (-0.52296-(-0.52296)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 2.26464 + (((tickAnim - 77) / 18) * (0-(2.26464)));
            yy = -3.20769 + (((tickAnim - 77) / 18) * (0-(-3.20769)));
            zz = -0.52296 + (((tickAnim - 77) / 18) * (0-(-0.52296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 51) {
            xx = -18.25 + (((tickAnim - 29) / 22) * (-13-(-18.25)));
            yy = 0 + (((tickAnim - 29) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 22) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -13 + (((tickAnim - 51) / 5) * (-13-(-13)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -13 + (((tickAnim - 56) / 17) * (-1.25-(-13)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -1.25 + (((tickAnim - 73) / 4) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -1.25 + (((tickAnim - 77) / 18) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 46) {
            xx = -4 + (((tickAnim - 29) / 17) * (2.75-(-4)));
            yy = 0 + (((tickAnim - 29) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 17) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 2.75 + (((tickAnim - 46) / 5) * (-18.5-(2.75)));
            yy = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -18.5 + (((tickAnim - 51) / 5) * (-8.25-(-18.5)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -8.25 + (((tickAnim - 56) / 17) * (16.75-(-8.25)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 16.75 + (((tickAnim - 73) / 4) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 16.75 + (((tickAnim - 77) / 18) * (0-(16.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 12 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 12) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 12) / 2) * (0.1175-(1)));
            zz = 1 + (((tickAnim - 12) / 2) * (1-(1)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 14) / 3) * (1-(1)));
            yy = 0.1175 + (((tickAnim - 14) / 3) * (1-(0.1175)));
            zz = 1 + (((tickAnim - 14) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 46) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 46) / 5) * (26.75-(0)));
            yy = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 26.75 + (((tickAnim - 51) / 5) * (0-(26.75)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 0) / 56) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 56) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 3.5 + (((tickAnim - 56) / 17) * (-4-(3.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -4 + (((tickAnim - 73) / 4) * (-4-(-4)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -4 + (((tickAnim - 77) / 18) * (0-(-4)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15.25 + (((tickAnim - 33) / 7) * (-9.33-(-15.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -9.33 + (((tickAnim - 40) / 6) * (-0.5-(-9.33)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 56) {
            xx = -0.5 + (((tickAnim - 46) / 10) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 46) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 10) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -0.5 + (((tickAnim - 56) / 17) * (-24.65903-(-0.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (1.96935-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0.66804-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -24.65903 + (((tickAnim - 73) / 4) * (-27.15903-(-24.65903)));
            yy = 1.96935 + (((tickAnim - 73) / 4) * (1.96935-(1.96935)));
            zz = 0.66804 + (((tickAnim - 73) / 4) * (0.66804-(0.66804)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -27.15903 + (((tickAnim - 77) / 18) * (0-(-27.15903)));
            yy = 1.96935 + (((tickAnim - 77) / 18) * (0-(1.96935)));
            zz = 0.66804 + (((tickAnim - 77) / 18) * (0-(0.66804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -12.5 + (((tickAnim - 29) / 4) * (-5.63-(-12.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.63 + (((tickAnim - 33) / 5) * (-5.87-(-5.63)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -5.87 + (((tickAnim - 38) / 7) * (3.75-(-5.87)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 3.75 + (((tickAnim - 45) / 11) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 3.75 + (((tickAnim - 56) / 17) * (-3.5-(3.75)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -3.5 + (((tickAnim - 73) / 4) * (0.75-(-3.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0.75 + (((tickAnim - 77) / 18) * (0-(0.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = -0.45 + (((tickAnim - 45) / 11) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = -0.45 + (((tickAnim - 56) / 17) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 73) / 4) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.45 + (((tickAnim - 77) / 18) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 45) {
            xx = 17.5 + (((tickAnim - 29) / 16) * (9.75-(17.5)));
            yy = 0 + (((tickAnim - 29) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 16) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 9.75 + (((tickAnim - 45) / 11) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 9.75 + (((tickAnim - 56) / 17) * (15.5-(9.75)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 15.5 + (((tickAnim - 73) / 4) * (12-(15.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 12 + (((tickAnim - 77) / 18) * (0-(12)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (-0.43-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -0.43 + (((tickAnim - 38) / 4) * (-0.42-(-0.43)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = -0.42 + (((tickAnim - 42) / 3) * (-0.975-(-0.42)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 45) / 11) * (0-(0)));
            yy = -0.975 + (((tickAnim - 45) / 11) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 45) / 11) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = -0.975 + (((tickAnim - 56) / 17) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -0.975 + (((tickAnim - 73) / 4) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.975 + (((tickAnim - 77) / 18) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15.25 + (((tickAnim - 33) / 7) * (-9.33-(-15.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = -9.33 + (((tickAnim - 40) / 6) * (-0.5-(-9.33)));
            yy = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 51) {
            xx = -0.5 + (((tickAnim - 46) / 5) * (-7.75-(-0.5)));
            yy = 0 + (((tickAnim - 46) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 5) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -7.75 + (((tickAnim - 51) / 5) * (-12.5-(-7.75)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = -12.5 + (((tickAnim - 56) / 17) * (-24.65903-(-12.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (1.96935-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0.66804-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -24.65903 + (((tickAnim - 73) / 4) * (-27.15903-(-24.65903)));
            yy = 1.96935 + (((tickAnim - 73) / 4) * (1.96935-(1.96935)));
            zz = 0.66804 + (((tickAnim - 73) / 4) * (0.66804-(0.66804)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = -27.15903 + (((tickAnim - 77) / 18) * (0-(-27.15903)));
            yy = 1.96935 + (((tickAnim - 77) / 18) * (0-(1.96935)));
            zz = 0.66804 + (((tickAnim - 77) / 18) * (0-(0.66804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -12.5 + (((tickAnim - 29) / 4) * (-5.63-(-12.5)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -5.63 + (((tickAnim - 33) / 5) * (-5.87-(-5.63)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -5.87 + (((tickAnim - 38) / 7) * (3.75-(-5.87)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 3.75 + (((tickAnim - 45) / 6) * (-7.83-(3.75)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = -7.83 + (((tickAnim - 51) / 5) * (7.5-(-7.83)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 7.5 + (((tickAnim - 56) / 17) * (-3.5-(7.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -3.5 + (((tickAnim - 73) / 4) * (0.75-(-3.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0.75 + (((tickAnim - 77) / 18) * (0-(0.75)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = -0.45 + (((tickAnim - 45) / 6) * (1.055-(-0.45)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            yy = 1.055 + (((tickAnim - 51) / 5) * (-1.325-(1.055)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = -1.325 + (((tickAnim - 56) / 17) * (-0.45-(-1.325)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -0.45 + (((tickAnim - 73) / 4) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.45 + (((tickAnim - 77) / 18) * (0-(-0.45)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 45) {
            xx = 17.5 + (((tickAnim - 29) / 16) * (9.75-(17.5)));
            yy = 0 + (((tickAnim - 29) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 16) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 9.75 + (((tickAnim - 45) / 6) * (30-(9.75)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 30 + (((tickAnim - 51) / 5) * (16.5-(30)));
            yy = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 16.5 + (((tickAnim - 56) / 17) * (15.5-(16.5)));
            yy = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 15.5 + (((tickAnim - 73) / 4) * (12-(15.5)));
            yy = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 12 + (((tickAnim - 77) / 18) * (0-(12)));
            yy = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 29 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 29) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 9) * (-0.28-(0)));
            zz = 0 + (((tickAnim - 29) / 9) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            yy = -0.28 + (((tickAnim - 38) / 4) * (-0.42-(-0.28)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            yy = -0.42 + (((tickAnim - 42) / 3) * (-0.975-(-0.42)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            yy = -0.975 + (((tickAnim - 45) / 6) * (-1.005-(-0.975)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 56) {
            xx = 0 + (((tickAnim - 51) / 5) * (0-(0)));
            yy = -1.005 + (((tickAnim - 51) / 5) * (-1.875-(-1.005)));
            zz = 0 + (((tickAnim - 51) / 5) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 56) / 17) * (0-(0)));
            yy = -1.875 + (((tickAnim - 56) / 17) * (-0.975-(-1.875)));
            zz = 0 + (((tickAnim - 56) / 17) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 73) / 4) * (0-(0)));
            yy = -0.975 + (((tickAnim - 73) / 4) * (-0.975-(-0.975)));
            zz = 0 + (((tickAnim - 73) / 4) * (0-(0)));
        }
        else if (tickAnim >= 77 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 77) / 18) * (0-(0)));
            yy = -0.975 + (((tickAnim - 77) / 18) * (0-(-0.975)));
            zz = 0 + (((tickAnim - 77) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.25 + (((tickAnim - 15) / 20) * (20-(-15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 35) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.02-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.02 + (((tickAnim - 8) / 7) * (-7-(-8.02)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (10.5-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 10.5 + (((tickAnim - 35) / 8) * (-1.26097-(10.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.21009-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0.07576-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.26097 + (((tickAnim - 43) / 7) * (0-(-1.26097)));
            yy = 0.21009 + (((tickAnim - 43) / 7) * (0-(0.21009)));
            zz = 0.07576 + (((tickAnim - 43) / 7) * (0-(0.07576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.775 + (((tickAnim - 8) / 7) * (-0.4-(1.775)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 15) / 20) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (2.825-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2.825 + (((tickAnim - 43) / 7) * (0-(2.825)));
            zz = -0.425 + (((tickAnim - 43) / 7) * (0-(-0.425)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (26.55-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 26.55 + (((tickAnim - 8) / 7) * (21.5-(26.55)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 21.5 + (((tickAnim - 15) / 10) * (0-(21.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 13.25 + (((tickAnim - 35) / 8) * (14.25-(13.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 43) / 7) * (0-(14.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -1.1 + (((tickAnim - 15) / 10) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 35) / 15) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-48.5-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -48.5 + (((tickAnim - 35) / 8) * (0-(-48.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -15.5 + (((tickAnim - 15) / 18) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 33) / 17) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = -5 + (((tickAnim - 15) / 18) * (-5-(-5)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -5 + (((tickAnim - 33) / 17) * (0-(-5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 15) / 18) * (-3-(-3)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 15) / 18) * (-3-(-3)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 33 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 33) / 6) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -11.5 + (((tickAnim - 39) / 11) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 8 + (((tickAnim - 15) / 18) * (8-(8)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 8 + (((tickAnim - 33) / 6) * (-12.5-(8)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 39) / 11) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 10.75 + (((tickAnim - 15) / 18) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 10.75 + (((tickAnim - 33) / 6) * (29.5-(10.75)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 29.5 + (((tickAnim - 39) / 4) * (8.75-(29.5)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 43) / 7) * (0-(8.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 20.5 + (((tickAnim - 15) / 18) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 20.5 + (((tickAnim - 33) / 6) * (24.75-(20.5)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 39) / 11) * (0-(24.75)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 15.25 + (((tickAnim - 15) / 18) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 15.25 + (((tickAnim - 33) / 6) * (18-(15.25)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 18 + (((tickAnim - 39) / 4) * (16.25-(18)));
            yy = 0 + (((tickAnim - 39) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 4) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 16.25 + (((tickAnim - 43) / 7) * (0-(16.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0.25 + (((tickAnim - 15) / 18) * (0.25-(0.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0.25 + (((tickAnim - 33) / 17) * (0-(0.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 9.75 + (((tickAnim - 15) / 18) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 33) / 17) * (0-(9.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 11.25 + (((tickAnim - 15) / 18) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 33) / 17) * (0-(11.25)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -4 + (((tickAnim - 15) / 18) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -4 + (((tickAnim - 33) / 17) * (0-(-4)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 15) / 18) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
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
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 15) / 18) * (5-(5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 4.5 + (((tickAnim - 15) / 18) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 33) / 17) * (0-(4.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -18.75 + (((tickAnim - 15) / 18) * (-18.75-(-18.75)));
            yy = -10.25 + (((tickAnim - 15) / 18) * (-10.25-(-10.25)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 33) / 17) * (0-(-18.75)));
            yy = -10.25 + (((tickAnim - 33) / 17) * (0-(-10.25)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 53.5 + (((tickAnim - 15) / 18) * (53.5-(53.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.5 + (((tickAnim - 33) / 17) * (0-(53.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0.6 + (((tickAnim - 15) / 18) * (0.6-(0.6)));
            zz = 0.65 + (((tickAnim - 15) / 18) * (0.65-(0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.6 + (((tickAnim - 33) / 17) * (0-(0.6)));
            zz = 0.65 + (((tickAnim - 33) / 17) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -16.75 + (((tickAnim - 15) / 18) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 33) / 17) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = -0.625 + (((tickAnim - 15) / 18) * (-0.625-(-0.625)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.625 + (((tickAnim - 33) / 17) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -18.75 + (((tickAnim - 15) / 18) * (-18.75-(-18.75)));
            yy = 10.25 + (((tickAnim - 15) / 18) * (10.25-(10.25)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 33) / 17) * (0-(-18.75)));
            yy = 10.25 + (((tickAnim - 33) / 17) * (0-(10.25)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 53.5 + (((tickAnim - 15) / 18) * (53.5-(53.5)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 53.5 + (((tickAnim - 33) / 17) * (0-(53.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = 0.6 + (((tickAnim - 15) / 18) * (0.6-(0.6)));
            zz = 0.65 + (((tickAnim - 15) / 18) * (0.65-(0.65)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.6 + (((tickAnim - 33) / 17) * (0-(0.6)));
            zz = 0.65 + (((tickAnim - 33) / 17) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -16.75 + (((tickAnim - 15) / 18) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 33) / 17) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            yy = -0.625 + (((tickAnim - 15) / 18) * (-0.625-(-0.625)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.625 + (((tickAnim - 33) / 17) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 27;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 10.75 + (((tickAnim - 13) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 10.25 + (((tickAnim - 13) / 15) * (0-(10.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -40.25 + (((tickAnim - 13) / 15) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 13) / 15) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 42.5 + (((tickAnim - 13) / 15) * (0-(42.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -40.25 + (((tickAnim - 13) / 15) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 13) / 15) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (42.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 42.5 + (((tickAnim - 13) / 15) * (0-(42.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 26.5 + (((tickAnim - 13) / 15) * (0-(26.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 30 + (((tickAnim - 13) / 15) * (0-(30)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 17.25 + (((tickAnim - 13) / 15) * (0-(17.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 13) / 15) * (0-(5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 7.25 + (((tickAnim - 13) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = -17 + (((tickAnim - 13) / 15) * (0-(-17)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (21.75-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 21.75 + (((tickAnim - 13) / 3) * (0-(21.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (12.75-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = 12.75 + (((tickAnim - 17) / 11) * (0-(12.75)));
            yy = 0 + (((tickAnim - 17) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.68198-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.73139-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -0.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 10) / 9) * (0.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-3-(-0.6206+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = -0.68198 + (((tickAnim - 10) / 9) * (-0.68198-(-0.68198)));
            zz = -0.73139 + (((tickAnim - 10) / 9) * (-0.73139-(-0.73139)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 0.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-3 + (((tickAnim - 19) / 11) * (0-(0.5544+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-3)));
            yy = -0.68198 + (((tickAnim - 19) / 11) * (0-(-0.68198)));
            zz = -0.73139 + (((tickAnim - 19) / 11) * (0-(-0.73139)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.49494-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.40082-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.44547-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -1.49494 + (((tickAnim - 10) / 9) * (-2.74494-(-1.49494)));
            yy = -0.40082 + (((tickAnim - 10) / 9) * (-0.40082-(-0.40082)));
            zz = -1.44547 + (((tickAnim - 10) / 9) * (-1.44547-(-1.44547)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -2.74494 + (((tickAnim - 19) / 11) * (0-(-2.74494)));
            yy = -0.40082 + (((tickAnim - 19) / 11) * (0-(-0.40082)));
            zz = -1.44547 + (((tickAnim - 19) / 11) * (0-(-1.44547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 10) / 9) * (2.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 2.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 19) / 11) * (0-(2.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 10) / 9) * (6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8.3-(4.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8.3 + (((tickAnim - 19) / 11) * (0-(6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8.3)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 4.5 + (((tickAnim - 10) / 9) * (3.25-(4.5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 3.25 + (((tickAnim - 19) / 11) * (0-(3.25)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 5.75 + (((tickAnim - 10) / 9) * (-0.75-(5.75)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -0.75 + (((tickAnim - 19) / 11) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 3.25 + (((tickAnim - 10) / 9) * (15.75-(3.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 15.75 + (((tickAnim - 19) / 11) * (0-(15.75)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 19 + (((tickAnim - 10) / 9) * (24.5-(19)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 24.5 + (((tickAnim - 19) / 11) * (0-(24.5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -21 + (((tickAnim - 19) / 11) * (0-(-21)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1.4673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.30716-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.37287-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 1.4673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 18) / 15) * (1.16423-(1.4673+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 3.30716 + (((tickAnim - 18) / 15) * (1.21263-(3.30716)));
            zz = 2.37287 + (((tickAnim - 18) / 15) * (0.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-20))*2-(2.37287)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 1.16423 + (((tickAnim - 33) / 10) * (0-(1.16423)));
            yy = 1.21263 + (((tickAnim - 33) / 10) * (0-(1.21263)));
            zz = 0.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-20))*2 + (((tickAnim - 33) / 10) * (0-(0.8701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.2-20))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.4502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.98954-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (2.26389-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 2.4502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3 + (((tickAnim - 18) / 15) * (0.39841-(2.4502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3)));
            yy = 2.98954 + (((tickAnim - 18) / 15) * (1.09616-(2.98954)));
            zz = 2.26389 + (((tickAnim - 18) / 15) * (0.8301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.1-70))*2-(2.26389)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0.39841 + (((tickAnim - 33) / 10) * (0-(0.39841)));
            yy = 1.09616 + (((tickAnim - 33) / 10) * (0-(1.09616)));
            zz = 0.8301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.1-70))*2 + (((tickAnim - 33) / 10) * (0-(0.8301+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.1-70))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-1.0305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (2.74159-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.61495-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -1.0305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-3 + (((tickAnim - 18) / 15) * (-1.90203-(-1.0305+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-90))*-3)));
            yy = 2.74159 + (((tickAnim - 18) / 15) * (1.00525-(2.74159)));
            zz = 1.61495 + (((tickAnim - 18) / 15) * (0.5921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-140))*2-(1.61495)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -1.90203 + (((tickAnim - 33) / 10) * (0-(-1.90203)));
            yy = 1.00525 + (((tickAnim - 33) / 10) * (0-(1.00525)));
            zz = 0.5921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-140))*2 + (((tickAnim - 33) / 10) * (0-(0.5921+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-140))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-3 + (((tickAnim - 18) / 15) * (-2.43-(-2.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*-3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.9-200))*2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -2.43 + (((tickAnim - 33) / 10) * (0-(-2.43)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.9-200))*2.5 + (((tickAnim - 33) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.9-200))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 3 + (((tickAnim - 18) / 15) * (-5.65-(3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.8-250))*3-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -5.65 + (((tickAnim - 33) / 10) * (0-(-5.65)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.8-250))*3 + (((tickAnim - 33) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.8-250))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 6.25 + (((tickAnim - 18) / 15) * (-5.21-(6.25)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.7-300))*3.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -5.21 + (((tickAnim - 33) / 10) * (0-(-5.21)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.7-300))*3.5 + (((tickAnim - 33) / 10) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.7-300))*3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5.5 + (((tickAnim - 18) / 15) * (-1.48-(5.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = -1.48 + (((tickAnim - 33) / 10) * (0-(-1.48)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 16) / 2) * (1-(1)));
            yy = 1 + (((tickAnim - 16) / 2) * (0.0675-(1)));
            zz = 1 + (((tickAnim - 16) / 2) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1 + (((tickAnim - 18) / 3) * (1-(1)));
            yy = 0.0675 + (((tickAnim - 18) / 3) * (1-(0.0675)));
            zz = 1 + (((tickAnim - 18) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 18 + (((tickAnim - 18) / 15) * (0-(18)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaws, jaws.rotateAngleX + (float) Math.toRadians(xx), jaws.rotateAngleY + (float) Math.toRadians(yy), jaws.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = -8.75 + (((tickAnim - 18) / 25) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -34.5 + (((tickAnim - 0) / 9) * (9.25-(-34.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 9.25 + (((tickAnim - 9) / 4) * (-14.58411-(9.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.52172-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-6.47912-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -14.58411 + (((tickAnim - 13) / 5) * (-34.5-(-14.58411)));
            yy = -0.52172 + (((tickAnim - 13) / 5) * (0-(-0.52172)));
            zz = -6.47912 + (((tickAnim - 13) / 5) * (0-(-6.47912)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 26.25 + (((tickAnim - 0) / 9) * (16.75-(26.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 9) / 4) * (-17.56453-(16.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.06432-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (6.49968-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -17.56453 + (((tickAnim - 13) / 5) * (26.25-(-17.56453)));
            yy = 0.06432 + (((tickAnim - 13) / 5) * (0-(0.06432)));
            zz = 6.49968 + (((tickAnim - 13) / 5) * (0-(6.49968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.425 + (((tickAnim - 0) / 2) * (-1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1-(-1.425)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1 + (((tickAnim - 2) / 1) * (-1.01-(-1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -1.01 + (((tickAnim - 3) / 6) * (0-(-1.01)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (-0.18-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.18 + (((tickAnim - 13) / 5) * (-1.425-(-0.18)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
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
            xx = 12.25 + (((tickAnim - 0) / 4) * (-8.75-(12.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -8.75 + (((tickAnim - 4) / 5) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (52-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 52 + (((tickAnim - 13) / 3) * (0-(52)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (12.25-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 13) / 3) * (0-(0.65)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 9.25 + (((tickAnim - 0) / 4) * (-15.01807-(9.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.61533-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (6.97304-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -15.01807 + (((tickAnim - 4) / 4) * (-34.5-(-15.01807)));
            yy = 0.61533 + (((tickAnim - 4) / 4) * (0-(0.61533)));
            zz = 6.97304 + (((tickAnim - 4) / 4) * (0-(6.97304)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -34.5 + (((tickAnim - 8) / 10) * (9.25-(-34.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 16.75 + (((tickAnim - 0) / 4) * (-16.4627-(16.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (-4.89133-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-6.01876-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -16.4627 + (((tickAnim - 4) / 4) * (26.25-(-16.4627)));
            yy = -4.89133 + (((tickAnim - 4) / 4) * (0-(-4.89133)));
            zz = -6.01876 + (((tickAnim - 4) / 4) * (0-(-6.01876)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 26.25 + (((tickAnim - 8) / 10) * (16.75-(26.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.425-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -1.425 + (((tickAnim - 8) / 1) * (-1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1-(-1.425)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1 + (((tickAnim - 9) / 2) * (-1.01-(-1.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -1.01 + (((tickAnim - 11) / 2) * (0-(-1.01)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 4) * (46.06-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 46.06 + (((tickAnim - 4) / 2) * (0-(46.06)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (12.25-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.25 + (((tickAnim - 8) / 5) * (-12.75-(12.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -12.75 + (((tickAnim - 13) / 5) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.125-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 4) / 2) * (0-(0.475)));
            zz = 0.125 + (((tickAnim - 4) / 2) * (0-(0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 24.75 + (((tickAnim - 0) / 5) * (-0.36499-(24.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-10.85762-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.96308-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -0.36499 + (((tickAnim - 5) / 3) * (-12.5-(-0.36499)));
            yy = -10.85762 + (((tickAnim - 5) / 3) * (0-(-10.85762)));
            zz = 2.96308 + (((tickAnim - 5) / 3) * (0-(2.96308)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 8) / 10) * (24.75-(-12.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.75 + (((tickAnim - 0) / 2) * (24.33-(2.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 24.33 + (((tickAnim - 2) / 3) * (-16.97-(24.33)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.97 + (((tickAnim - 5) / 3) * (-16-(-16.97)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -16 + (((tickAnim - 8) / 10) * (2.75-(-16)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 0) / 2) * (0.59-(0.1)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.475-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.59 + (((tickAnim - 2) / 3) * (2.575-(0.59)));
            zz = -0.475 + (((tickAnim - 2) / 3) * (0-(-0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.575 + (((tickAnim - 5) / 3) * (0.075-(2.575)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 1) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1-(0.075)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1 + (((tickAnim - 9) / 2) * (0.075-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0.075 + (((tickAnim - 11) / 7) * (0.1-(0.075)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -6 + (((tickAnim - 0) / 2) * (26.17-(-6)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 26.17 + (((tickAnim - 2) / 3) * (0-(26.17)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (28.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 8) / 5) * (0-(28.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-6-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.825 + (((tickAnim - 0) / 5) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (-1.325-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -1.325 + (((tickAnim - 8) / 5) * (0.3-(-1.325)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 13) / 5) * (-0.825-(0.3)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -23 + (((tickAnim - 0) / 8) * (0-(-23)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-23-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 0) / 8) * (24.75-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 24.75 + (((tickAnim - 8) / 7) * (-9.71325-(24.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (6.68035-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-2.0959-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -9.71325 + (((tickAnim - 15) / 3) * (-12.5-(-9.71325)));
            yy = 6.68035 + (((tickAnim - 15) / 3) * (0-(6.68035)));
            zz = -2.0959 + (((tickAnim - 15) / 3) * (0-(-2.0959)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -16 + (((tickAnim - 0) / 8) * (2.75-(-16)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.75 + (((tickAnim - 8) / 3) * (28.64-(2.75)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 28.64 + (((tickAnim - 11) / 4) * (-5.51-(28.64)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -5.51 + (((tickAnim - 15) / 3) * (-16-(-5.51)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1 + (((tickAnim - 2) / 1) * (0.075-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.3))*0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 3) / 5) * (0.1-(0.075)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.1 + (((tickAnim - 8) / 3) * (0.74-(0.1)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.625-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.74 + (((tickAnim - 11) / 4) * (2.595-(0.74)));
            zz = -0.625 + (((tickAnim - 11) / 4) * (-0.23-(-0.625)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 2.595 + (((tickAnim - 15) / 3) * (0.075-(2.595)));
            zz = -0.23 + (((tickAnim - 15) / 3) * (0-(-0.23)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 28.5 + (((tickAnim - 0) / 4) * (0-(28.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-6-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6 + (((tickAnim - 8) / 3) * (33.66-(-6)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 33.66 + (((tickAnim - 11) / 4) * (0-(33.66)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (28.5-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.325 + (((tickAnim - 0) / 4) * (0-(-1.325)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.825 + (((tickAnim - 8) / 10) * (-1.325-(-0.825)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-23-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -23 + (((tickAnim - 8) / 3) * (0-(-23)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437))*1.3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439))*1.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-40))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-30))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-60))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-70))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-90))*2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-120))*5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-120))*4), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-150))*7), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-140))*6), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-190))*9), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*2));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-170))*8), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-220))*12), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-20))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437+35))*-3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-80))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-125))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-270))*2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-145))*3), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-300))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-185))*1), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-330))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-235))*0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-390))*3));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-285))*1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-420))*3));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-325))*1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-470))*3));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437-385))*1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.439-580))*3));


        this.throat.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.437))*0.2),(float)1);

       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMalawisaurus entity = (EntityPrehistoricFloraMalawisaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -5.5 + (((tickAnim - 0) / 11) * (6.75-(-5.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 6.75 + (((tickAnim - 11) / 6) * (-8.25536-(6.75)));
            yy = 0 + (((tickAnim - 11) / 6) * (-3.90582-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (1.67673-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -8.25536 + (((tickAnim - 17) / 3) * (-16.74-(-8.25536)));
            yy = -3.90582 + (((tickAnim - 17) / 3) * (0-(-3.90582)));
            zz = 1.67673 + (((tickAnim - 17) / 3) * (0-(1.67673)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.74 + (((tickAnim - 20) / 10) * (-5.5-(-16.74)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -0.5 + (((tickAnim - 0) / 11) * (6-(-0.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 11) / 2) * (12.54-(6)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 12.54 + (((tickAnim - 13) / 4) * (-13.12-(12.54)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -13.12 + (((tickAnim - 17) / 3) * (-11.08-(-13.12)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -11.08 + (((tickAnim - 20) / 10) * (-0.5-(-11.08)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 11) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.045-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (-0.21-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.045 + (((tickAnim - 13) / 4) * (2.37-(1.045)));
            zz = -0.21 + (((tickAnim - 13) / 4) * (-0.5-(-0.21)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 2.37 + (((tickAnim - 17) / 3) * (-0.76-(2.37)));
            zz = -0.5 + (((tickAnim - 17) / 3) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -0.76 + (((tickAnim - 20) / 10) * (-0.025-(-0.76)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
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
            xx = 6.5 + (((tickAnim - 0) / 11) * (0-(6.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (21.8-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 21.8 + (((tickAnim - 13) / 4) * (34.3-(21.8)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 34.3 + (((tickAnim - 17) / 3) * (27.58-(34.3)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27.58 + (((tickAnim - 20) / 10) * (6.5-(27.58)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 11) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.125 + (((tickAnim - 20) / 10) * (-0.2-(-1.125)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -3.03146 + (((tickAnim - 0) / 4) * (-16.74-(-3.03146)));
            yy = 3.3285 + (((tickAnim - 0) / 4) * (0-(3.3285)));
            zz = -1.08278 + (((tickAnim - 0) / 4) * (0-(-1.08278)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = -16.74 + (((tickAnim - 4) / 21) * (6.75-(-16.74)));
            yy = 0 + (((tickAnim - 4) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 21) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.75 + (((tickAnim - 25) / 5) * (-3.03146-(6.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (3.3285-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-1.08278-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -21.00224 + (((tickAnim - 0) / 4) * (-11.08-(-21.00224)));
            yy = -1.3552 + (((tickAnim - 0) / 4) * (0-(-1.3552)));
            zz = 4.35915 + (((tickAnim - 0) / 4) * (0-(4.35915)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = -11.08 + (((tickAnim - 4) / 21) * (6-(-11.08)));
            yy = 0 + (((tickAnim - 4) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 21) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 6 + (((tickAnim - 25) / 3) * (2.67761-(6)));
            yy = 0 + (((tickAnim - 25) / 3) * (-0.5808-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (1.86821-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 2.67761 + (((tickAnim - 28) / 2) * (-21.00224-(2.67761)));
            yy = -0.5808 + (((tickAnim - 28) / 2) * (-1.3552-(-0.5808)));
            zz = 1.86821 + (((tickAnim - 28) / 2) * (4.35915-(1.86821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 2.77 + (((tickAnim - 0) / 4) * (-0.76-(2.77)));
            zz = -0.21 + (((tickAnim - 0) / 4) * (0-(-0.21)));
        }
        else if (tickAnim >= 4 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 4) / 21) * (0-(0)));
            yy = -0.76 + (((tickAnim - 4) / 21) * (0-(-0.76)));
            zz = 0 + (((tickAnim - 4) / 21) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (2.77-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.21-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -26.75 + (((tickAnim - 0) / 19) * (3.5-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 19) / 6) * (-16.90552-(3.5)));
            yy = 0 + (((tickAnim - 19) / 6) * (-0.09094-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (-1.49908-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -16.90552 + (((tickAnim - 25) / 5) * (-26.75-(-16.90552)));
            yy = -0.09094 + (((tickAnim - 25) / 5) * (0-(-0.09094)));
            zz = -1.49908 + (((tickAnim - 25) / 5) * (0-(-1.49908)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 13.75 + (((tickAnim - 0) / 19) * (21.75392-(13.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.1399-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-3.27152-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 21.75392 + (((tickAnim - 19) / 6) * (-11.47952-(21.75392)));
            yy = 0.1399 + (((tickAnim - 19) / 6) * (1.25796-(0.1399)));
            zz = -3.27152 + (((tickAnim - 19) / 6) * (1.86563-(-3.27152)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -11.47952 + (((tickAnim - 25) / 3) * (6.5-(-11.47952)));
            yy = 1.25796 + (((tickAnim - 25) / 3) * (0-(1.25796)));
            zz = 1.86563 + (((tickAnim - 25) / 3) * (0-(1.86563)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 28) / 2) * (13.75-(6.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.65 + (((tickAnim - 0) / 8) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.945-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.945 + (((tickAnim - 25) / 5) * (-0.65-(0.945)));
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




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 10.25 + (((tickAnim - 0) / 8) * (-4.36-(10.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -4.36 + (((tickAnim - 8) / 11) * (0-(-4.36)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (41.39-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 41.39 + (((tickAnim - 25) / 3) * (-5.75-(41.39)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -5.75 + (((tickAnim - 28) / 2) * (10.25-(-5.75)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 8) * (-0.625-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            yy = -0.625 + (((tickAnim - 8) / 11) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0.425-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0.125-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 25) / 3) * (0-(0.425)));
            zz = 0.125 + (((tickAnim - 25) / 3) * (0-(0.125)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.75 + (((tickAnim - 0) / 4) * (12-(7.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 12 + (((tickAnim - 4) / 5) * (-14.09529-(12)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.19654-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (2.74297-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -14.09529 + (((tickAnim - 9) / 5) * (-31.5-(-14.09529)));
            yy = 0.19654 + (((tickAnim - 9) / 5) * (0-(0.19654)));
            zz = 2.74297 + (((tickAnim - 9) / 5) * (0-(2.74297)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -31.5 + (((tickAnim - 14) / 16) * (7.75-(-31.5)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5.5 + (((tickAnim - 0) / 4) * (12.75-(5.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 12.75 + (((tickAnim - 4) / 5) * (-19.1532-(12.75)));
            yy = 0 + (((tickAnim - 4) / 5) * (-2.59146-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (-4.27748-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -19.1532 + (((tickAnim - 9) / 3) * (5.6734-(-19.1532)));
            yy = -2.59146 + (((tickAnim - 9) / 3) * (-1.29573-(-2.59146)));
            zz = -4.27748 + (((tickAnim - 9) / 3) * (-2.13874-(-4.27748)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 5.6734 + (((tickAnim - 12) / 2) * (21.5-(5.6734)));
            yy = -1.29573 + (((tickAnim - 12) / 2) * (0-(-1.29573)));
            zz = -2.13874 + (((tickAnim - 12) / 2) * (0-(-2.13874)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 21.5 + (((tickAnim - 14) / 16) * (5.5-(21.5)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 8) * (0.09-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 12) / 2) * (-1.35-(0.09)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -1.35 + (((tickAnim - 14) / 8) * (0-(-1.35)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*1), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501))*0.2), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501))*0.2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501))*0.2), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+90))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501-30))*1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+120))*-2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501-70))*3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+180))*5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501-100))*5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+200))*6), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.501-130))*7), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+200))*6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-30))*-1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*-0.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-210))*2));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -11.25 + (((tickAnim - 0) / 4) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (43.15-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 43.15 + (((tickAnim - 9) / 3) * (-4.55-(43.15)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -4.55 + (((tickAnim - 12) / 2) * (10.25-(-4.55)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 14) / 16) * (-11.25-(10.25)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0.385-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0.15-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.385 + (((tickAnim - 9) / 3) * (0-(0.385)));
            zz = 0.15 + (((tickAnim - 9) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.425 + (((tickAnim - 14) / 8) * (0-(0.425)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*0.5), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-310))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-390))*2));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-190))*-1), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-430))*2));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-260))*-1), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-490))*2));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-320))*-1), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-530))*2));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-370))*-1), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-590))*2));


        this.throat.setScale((float)1,(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*262/0.5))*0.1),(float)1);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -12.75 + (((tickAnim - 13) / 0) * (-26.91-(-12.75)));
            yy = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -26.91 + (((tickAnim - 13) / 5) * (7.11-(-26.91)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 7.11 + (((tickAnim - 18) / 4) * (0-(7.11)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.345-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.18-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.345 + (((tickAnim - 13) / 0) * (-0.05-(0.345)));
            zz = 0.18 + (((tickAnim - 13) / 0) * (0.15-(0.18)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 5) * (0-(-0.05)));
            zz = 0.15 + (((tickAnim - 13) / 5) * (0-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 34.05 + (((tickAnim - 0) / 4) * (27.58-(34.05)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 27.58 + (((tickAnim - 4) / 9) * (13.79-(27.58)));
            yy = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 13.79 + (((tickAnim - 13) / 12) * (0-(13.79)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (23.59-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 23.59 + (((tickAnim - 28) / 2) * (34.05-(23.59)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.975 + (((tickAnim - 0) / 4) * (-1.125-(-0.975)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = -1.125 + (((tickAnim - 4) / 9) * (-0.325-(-1.125)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = -0.325 + (((tickAnim - 13) / 12) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (-0.975-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMalawisaurus e = (EntityPrehistoricFloraMalawisaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
//        animator.startKeyframe(8);
//        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaws, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(12);
//        animator.resetKeyframe(10);

    }
}
