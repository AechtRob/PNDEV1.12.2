package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMarshosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMarshosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToes;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToes;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer throat1;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private ModelAnimator animator;

    public ModelMarshosaurus() {
        this.textureWidth = 70;
        this.textureHeight = 67;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 7.0F, 2.5F);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 16, -2.0F, -2.75F, -3.0F, 4, 9, 7, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(2.0F, 0.25F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.0436F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 40, 39, -1.5F, -2.0F, -2.0F, 3, 9, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 6.5F, -0.75F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.5236F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 52, -1.0F, -0.5F, -1.0F, 2, 7, 3, 0.01F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 6.5F, 0.25F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6109F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 20, 57, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.leftLeg3.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.3054F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 50, 8, -1.5F, -0.75F, -2.0F, 3, 1, 3, 0.01F, false));

        this.leftToes = new AdvancedModelRenderer(this);
        this.leftToes.setRotationPoint(0.5F, -0.25F, -1.75F);
        this.leftFoot.addChild(leftToes);
        this.leftToes.cubeList.add(new ModelBox(leftToes, 59, 52, -2.0F, -0.5F, -2.275F, 3, 1, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-2.0F, 0.25F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.0436F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 40, 39, -1.5F, -2.0F, -2.0F, 3, 9, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 6.5F, -0.75F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.5236F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 52, -1.0F, -0.5F, -1.0F, 2, 7, 3, 0.01F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 6.5F, 0.25F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6109F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 20, 57, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rightLeg3.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.3054F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 50, 8, -1.5F, -0.75F, -2.0F, 3, 1, 3, 0.01F, true));

        this.rightToes = new AdvancedModelRenderer(this);
        this.rightToes.setRotationPoint(-0.5F, -0.25F, -1.75F);
        this.rightFoot.addChild(rightToes);
        this.rightToes.cubeList.add(new ModelBox(rightToes, 59, 52, -1.0F, -0.5F, -2.275F, 3, 1, 2, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.0F, 3.75F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 22, 16, -1.5F, -1.5F, -0.75F, 3, 5, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.35F, 8.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 0, -1.0F, -1.0F, -0.75F, 2, 3, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2F, 8.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 32, -0.5F, -0.75F, -0.25F, 1, 2, 9, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2F, 8.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 43, -0.5F, -0.5F, -0.25F, 1, 1, 8, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 46, 12, -0.5F, 0.0F, -0.25F, 1, 1, 8, -0.02F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3491F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 46, 29, -0.5F, -0.5F, -0.25F, 1, 1, 7, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, -2.5F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2618F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -2.0F, -7.5F, 6, 8, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 5.75F, -7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 30, -2.0F, -2.0F, 0.0F, 5, 2, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.25F, -7.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 20, 39, -2.5F, -1.75F, -5.0F, 5, 5, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.25F, -5.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 21, -2.0F, -3.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(2.0F, 2.75F, -4.0F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.7854F, 0.2618F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 16, 62, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.01F, false));
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 50, 63, -0.5F, 0.0F, -1.0F, 1, 3, 1, -0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-1.5F, 2.75F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.0908F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 58, 63, 1.0F, -0.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(2.0F, 1.75F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, 0.0F, 0.48F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 62, 29, -1.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-2.0F, 2.75F, -4.0F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.7854F, -0.2618F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 16, 62, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.01F, true));
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 50, 63, -0.5F, 0.0F, -1.0F, 1, 3, 1, -0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(1.5F, 2.75F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.0908F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 58, 63, -2.0F, -0.25F, -0.5F, 1, 2, 1, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-2.0F, 1.75F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.0F, -0.48F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 62, 29, 0.0F, 0.0F, -1.0F, 1, 3, 2, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.25F, -3.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.5236F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 18, 49, -2.0F, -1.75F, -3.5F, 4, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 50, 0, -1.5F, -1.25F, -3.5F, 3, 4, 4, 0.01F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.6109F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 34, 53, -1.0F, -1.25F, -3.5F, 2, 3, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -1.25F, 0.5F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 62, -1.5F, 0.0F, -2.0F, 2, 1, 2, -0.02F, false));

        this.throat1 = new AdvancedModelRenderer(this);
        this.throat1.setRotationPoint(0.5F, 1.25F, -2.0F);
        this.neck3.addChild(throat1);
        this.setRotateAngle(throat1, -0.2182F, 0.0F, 0.0F);
        this.throat1.cubeList.add(new ModelBox(throat1, 10, 52, -1.5F, 0.0F, -1.0F, 2, 2, 2, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.throat1.addChild(throat2);
        this.setRotateAngle(throat2, 0.1745F, 0.0F, 0.0F);
        this.throat2.cubeList.add(new ModelBox(throat2, 10, 57, -1.5F, 0.0F, -0.5F, 2, 2, 3, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck3.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 56, 37, -1.5F, -0.75F, -2.5F, 3, 2, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 2.0248F, -5.4742F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 53, -1.5F, -2.0F, 0.0F, 2, 2, 4, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -1.3229F, -2.4775F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2705F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 58, 55, -1.5F, 0.0F, -3.0F, 2, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.2706F, -0.9784F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3142F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 8, -1.5F, 0.0F, -0.25F, 2, 1, 2, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.3142F, -2.2276F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 12, -2.0F, 0.0F, -0.25F, 3, 1, 3, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 2.1773F, -7.2175F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.219F, -0.0852F, -0.0189F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 49, 0.0F, -0.5F, 1.0F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.2011F, -0.6495F, -5.2438F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.6238F, 0.0812F, -0.3062F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 57, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 0.4368F, -6.911F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2311F, 0.0812F, -0.3062F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 34, 0.0F, -0.684F, 1.8794F, 1, 1, 2, -0.01F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.4368F, -6.911F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7984F, 0.0812F, -0.3062F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 63, 0.0F, 1.1045F, 3.0068F, 1, 2, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.4368F, -6.911F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7984F, -0.0812F, 0.3062F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 63, -1.0F, 1.1045F, 3.0068F, 1, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 0.4368F, -6.911F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2311F, -0.0812F, 0.3062F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 34, -1.0F, -0.684F, 1.8794F, 1, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.2011F, -0.6495F, -5.2438F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6238F, -0.0812F, 0.3062F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 57, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.4368F, -6.911F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.5323F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 63, -1.0F, 0.5F, 0.0F, 2, 1, 1, -0.02F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 62, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.2029F, -7.5538F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.8727F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 63, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 2.1773F, -7.2175F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 32, -1.0F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 2.1773F, -7.2175F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.219F, 0.0852F, 0.0189F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 49, 0.0F, -0.5F, 1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.0683F, -5.9723F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 60, -1.0F, -1.0F, -1.5F, 2, 1, 2, 0.01F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.5F, -0.25F, -2.0F);
        this.head.addChild(eyes);
        this.eyes.cubeList.add(new ModelBox(eyes, 46, 37, -2.0F, -0.5F, -0.55F, 3, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 42, -2.0F, 0.0F, -2.5F, 3, 2, 3, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 59, -1.5F, 0.9657F, -4.9771F, 2, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 1.1569F, -7.206F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1752F, -0.0859F, -0.0152F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 40, 12, 0.0F, -0.25F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.1569F, -7.206F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1752F, 0.0859F, 0.0152F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 12, 0.0F, -0.25F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 1.9657F, -4.9771F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 60, -2.0F, -1.0F, -2.4F, 2, 1, 3, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.5F, 0.342F, -3.4397F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.0472F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 47, -2.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, 0.0F, -2.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3491F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 46, 59, -2.0F, 0.0F, -3.0F, 2, 1, 3, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.11F;
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
        this.hips.offsetY = 0.6F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.45F;
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

        EntityPrehistoricFloraMarshosaurus EntityMegalosaurus = (EntityPrehistoricFloraMarshosaurus) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm1, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm1, this.rightArm2, this.rightArm3};

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

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);

                    this.walk(this.leftArm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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
        EntityPrehistoricFloraMarshosaurus ee = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        else if (ee.getAnimation() == ee.RELAX_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(4.3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10 + (((tickAnim - 0) / 5) * (9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10-(9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10 + (((tickAnim - 5) / 5) * (9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10-(9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10 + (((tickAnim - 10) / 5) * (9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10-(9.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-90))*10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10 + (((tickAnim - 10) / 5) * (0-(1.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*480-50))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-11.825+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-15), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.17-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.86-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = -0.17 + (((tickAnim - 6) / 5) * (0-(-0.17)));
            zz = 0.86 + (((tickAnim - 6) / 5) * (0-(0.86)));
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
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*20), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0.2-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0.15 + (((tickAnim - 4) / 6) * (0-(0.15)));
            zz = 0.2 + (((tickAnim - 4) / 6) * (0-(0.2)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 14.25 + (((tickAnim - 10) / 5) * (0-(14.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (38.25-(0)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 38.25 + (((tickAnim - 9) / 4) * (0-(38.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
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
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9.5 + (((tickAnim - 10) / 10) * (0-(9.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10.25 + (((tickAnim - 10) / 10) * (0-(10.25)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (27.26632-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.29927-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-6.24286-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.26632 + (((tickAnim - 10) / 10) * (0-(27.26632)));
            yy = -0.29927 + (((tickAnim - 10) / 10) * (0-(-0.29927)));
            zz = -6.24286 + (((tickAnim - 10) / 10) * (0-(-6.24286)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 27.38 + (((tickAnim - 5) / 5) * (11.75-(27.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 10) / 3) * (32.83-(11.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 32.83 + (((tickAnim - 13) / 7) * (0-(32.83)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 16 + (((tickAnim - 5) / 5) * (12.5-(16)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (21.25-(12.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 21.25 + (((tickAnim - 13) / 7) * (0-(21.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.2 + (((tickAnim - 5) / 5) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -6.25 + (((tickAnim - 10) / 10) * (0-(-6.25)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
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
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (34.75-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 34.75 + (((tickAnim - 10) / 3) * (0-(34.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (30.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 30.25 + (((tickAnim - 23) / 15) * (-18.75-(30.25)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -18.75 + (((tickAnim - 38) / 12) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 19.75 + (((tickAnim - 23) / 7) * (8.5-(19.75)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 8.5 + (((tickAnim - 30) / 8) * (-3.25-(8.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 38) / 12) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (0.4-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.4 + (((tickAnim - 30) / 20) * (0-(0.4)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-41.4-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -41.4 + (((tickAnim - 30) / 8) * (17-(-41.4)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17 + (((tickAnim - 38) / 12) * (0-(17)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 21) * (-0.095-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.095 + (((tickAnim - 30) / 8) * (-0.775-(-0.095)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -0.775 + (((tickAnim - 38) / 12) * (0-(-0.775)));
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




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (53.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 53.5 + (((tickAnim - 9) / 14) * (72-(53.5)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 72 + (((tickAnim - 23) / 7) * (77.5-(72)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 77.5 + (((tickAnim - 30) / 8) * (17.47201-(77.5)));
            yy = 0 + (((tickAnim - 30) / 8) * (0.53563-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0.10827-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.47201 + (((tickAnim - 38) / 12) * (0-(17.47201)));
            yy = 0.53563 + (((tickAnim - 38) / 12) * (0-(0.53563)));
            zz = 0.10827 + (((tickAnim - 38) / 12) * (0-(0.10827)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = 1.075 + (((tickAnim - 9) / 14) * (0-(1.075)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (2.175-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 2.175 + (((tickAnim - 30) / 8) * (0.675-(2.175)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 38) / 12) * (0-(0.675)));
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




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-62.81-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -62.81 + (((tickAnim - 9) / 14) * (31.75-(-62.81)));
            yy = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 14) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 31.75 + (((tickAnim - 23) / 15) * (0-(31.75)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 9) / 14) * (0-(0)));
            yy = -0.6 + (((tickAnim - 9) / 14) * (0.225-(-0.6)));
            zz = 0 + (((tickAnim - 9) / 14) * (0.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0.225 + (((tickAnim - 23) / 15) * (0-(0.225)));
            zz = 0.25 + (((tickAnim - 23) / 15) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -13.75 + (((tickAnim - 18) / 10) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -13.75 + (((tickAnim - 28) / 12) * (7.89-(-13.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 7.89 + (((tickAnim - 40) / 10) * (0-(7.89)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.125-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (3.425-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = -8.125 + (((tickAnim - 18) / 10) * (-8.125-(-8.125)));
            zz = 3.425 + (((tickAnim - 18) / 10) * (3.425-(3.425)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -8.125 + (((tickAnim - 28) / 22) * (0-(-8.125)));
            zz = 3.425 + (((tickAnim - 28) / 22) * (0-(3.425)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -27.5 + (((tickAnim - 18) / 10) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -27.5 + (((tickAnim - 28) / 12) * (-25.22-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -25.22 + (((tickAnim - 40) / 10) * (0-(-25.22)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (61-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 61 + (((tickAnim - 18) / 10) * (61-(61)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 61 + (((tickAnim - 28) / 22) * (0-(61)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-92.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -92.75 + (((tickAnim - 18) / 10) * (-92.75-(-92.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -92.75 + (((tickAnim - 28) / 22) * (0-(-92.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 74 + (((tickAnim - 18) / 10) * (74-(74)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 74 + (((tickAnim - 28) / 22) * (0-(74)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.195-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.8 + (((tickAnim - 9) / 9) * (0-(0.8)));
            zz = -0.195 + (((tickAnim - 9) / 9) * (0.35-(-0.195)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 18) / 10) * (0.35-(0.35)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0.8-(0)));
            zz = 0.35 + (((tickAnim - 28) / 12) * (-0.195-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 40) / 10) * (0-(0.8)));
            zz = -0.195 + (((tickAnim - 40) / 10) * (0-(-0.195)));
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
            xx = 0 + (((tickAnim - 0) / 18) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -27.5 + (((tickAnim - 18) / 10) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -27.5 + (((tickAnim - 28) / 12) * (-25.22-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -25.22 + (((tickAnim - 40) / 10) * (0-(-25.22)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (61-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 61 + (((tickAnim - 18) / 10) * (61-(61)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 61 + (((tickAnim - 28) / 22) * (0-(61)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-92.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -92.75 + (((tickAnim - 18) / 10) * (-92.75-(-92.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -92.75 + (((tickAnim - 28) / 22) * (0-(-92.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (74-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 74 + (((tickAnim - 18) / 10) * (74-(74)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 74 + (((tickAnim - 28) / 22) * (0-(74)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.195-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0.8 + (((tickAnim - 9) / 9) * (0-(0.8)));
            zz = -0.195 + (((tickAnim - 9) / 9) * (0.35-(-0.195)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 18) / 10) * (0.35-(0.35)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0.8-(0)));
            zz = 0.35 + (((tickAnim - 28) / 12) * (-0.195-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.8 + (((tickAnim - 40) / 10) * (0-(0.8)));
            zz = -0.195 + (((tickAnim - 40) / 10) * (0-(-0.195)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -5.75 + (((tickAnim - 18) / 10) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -5.75 + (((tickAnim - 28) / 12) * (-6.5-(-5.75)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.5 + (((tickAnim - 40) / 10) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (-6.18023-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0.70997-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0.56623-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -6.18023 + (((tickAnim - 18) / 10) * (-6.18023-(-6.18023)));
            yy = 0.70997 + (((tickAnim - 18) / 10) * (0.70997-(0.70997)));
            zz = 0.56623 + (((tickAnim - 18) / 10) * (0.56623-(0.56623)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -6.18023 + (((tickAnim - 28) / 12) * (-11.75-(-6.18023)));
            yy = 0.70997 + (((tickAnim - 28) / 12) * (0-(0.70997)));
            zz = 0.56623 + (((tickAnim - 28) / 12) * (0-(0.56623)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 40) / 10) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
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
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (20-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 20 + (((tickAnim - 18) / 10) * (20-(20)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 28) / 12) * (0-(20)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
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
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (18.5-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 18.5 + (((tickAnim - 18) / 10) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 28) / 12) * (0-(18.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
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
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (21.25-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 21.25 + (((tickAnim - 18) / 10) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 21.25 + (((tickAnim - 28) / 12) * (0-(21.25)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
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
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 9.25 + (((tickAnim - 18) / 10) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 28) / 22) * (0-(9.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 8.75 + (((tickAnim - 18) / 10) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 28) / 22) * (0-(8.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = -3.5 + (((tickAnim - 18) / 10) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -3.5 + (((tickAnim - 28) / 22) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 28) / 12) * (-15.75-(0)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -15.75 + (((tickAnim - 40) / 10) * (0-(-15.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 18) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 18) / 5) * (0.1-(1)));
            zz = 1 + (((tickAnim - 18) / 5) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 1 + (((tickAnim - 23) / 5) * (1-(1)));
            yy = 0.1 + (((tickAnim - 23) / 5) * (1-(0.1)));
            zz = 1 + (((tickAnim - 23) / 5) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)) + (((tickAnim - 0) / 30) * (-7.21215-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)))));
            yy = 0 + (((tickAnim - 0) / 30) * (1.81536-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.38881-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.21215 + (((tickAnim - 30) / 15) * (0-(-7.21215)));
            yy = 1.81536 + (((tickAnim - 30) / 15) * (0-(1.81536)));
            zz = 2.38881 + (((tickAnim - 30) / 15) * (0-(2.38881)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5-150)) + (((tickAnim - 0) / 30) * (-7.25-(0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5-150)))));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = -7.25 + (((tickAnim - 30) / 15) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)) + (((tickAnim - 0) / 30) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)))));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)) + (((tickAnim - 30) / 15) * (0-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350/0.5)))));
            yy = 0 + (((tickAnim - 30) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 260;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = 2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5 + (((tickAnim - 40) / 190) * (2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5-(2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5)));
            yy = 0 + (((tickAnim - 40) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 190) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = 2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5 + (((tickAnim - 230) / 30) * (0-(2.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-90))*0.5)));
            yy = 0 + (((tickAnim - 230) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = -0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5 + (((tickAnim - 40) / 190) * (-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5-(-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5)));
            yy = 0 + (((tickAnim - 40) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 190) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = -0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5 + (((tickAnim - 230) / 30) * (0-(-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-150))*0.5)));
            yy = 0 + (((tickAnim - 230) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5 + (((tickAnim - 40) / 190) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5)));
            yy = 0 + (((tickAnim - 40) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 190) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5 + (((tickAnim - 230) / 30) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3-250))*0.5)));
            yy = 0 + (((tickAnim - 230) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = -2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2 + (((tickAnim - 40) / 190) * (-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2-(-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2)));
            yy = 0 + (((tickAnim - 40) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 190) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = -2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2 + (((tickAnim - 230) / 30) * (0-(-2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-2)));
            yy = 0 + (((tickAnim - 230) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 0) / 40) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05-(1)));
            yy = 1 + (((tickAnim - 0) / 40) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08-(1)));
            zz = 1 + (((tickAnim - 0) / 40) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05 + (((tickAnim - 40) / 190) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08 + (((tickAnim - 40) / 190) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08)));
            zz = 1 + (((tickAnim - 40) / 190) * (1-(1)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05 + (((tickAnim - 230) / 30) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.05)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08 + (((tickAnim - 230) / 30) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*-0.08)));
            zz = 1 + (((tickAnim - 230) / 30) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat1.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 0) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 260) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 260) {
            xx = 0 + (((tickAnim - 0) / 260) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 260) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 260) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 140 && tickAnim < 160) {
            xx = 1 + (((tickAnim - 140) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 140) / 20) * (0.03-(1)));
            zz = 1 + (((tickAnim - 140) / 20) * (1-(1)));
        }
        else if (tickAnim >= 160 && tickAnim < 180) {
            xx = 1 + (((tickAnim - 160) / 20) * (1-(1)));
            yy = 0.03 + (((tickAnim - 160) / 20) * (1-(0.03)));
            zz = 1 + (((tickAnim - 160) / 20) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 230) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3 + (((tickAnim - 40) / 190) * (8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3)));
            yy = 0 + (((tickAnim - 40) / 190) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 190) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 260) {
            xx = 8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3 + (((tickAnim - 230) / 30) * (0-(8.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*3)));
            yy = 0 + (((tickAnim - 230) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (17.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 65) {
            xx = 17.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20 + (((tickAnim - 23) / 42) * (0-(17.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-20)));
            yy = 0 + (((tickAnim - 23) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 51) {
            xx = -7 + (((tickAnim - 23) / 28) * (-11.25-(-7)));
            yy = 0 + (((tickAnim - 23) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 28) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = -11.25 + (((tickAnim - 51) / 14) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 51) * (0.175-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            zz = 0.175 + (((tickAnim - 51) / 14) * (0-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 51) {
            xx = 15.25 + (((tickAnim - 23) / 28) * (7.75-(15.25)));
            yy = 0 + (((tickAnim - 23) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 28) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 63) {
            xx = 7.75 + (((tickAnim - 51) / 12) * (0-(7.75)));
            yy = 0 + (((tickAnim - 51) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-18.84-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 51) {
            xx = -18.84 + (((tickAnim - 23) / 28) * (-9.25-(-18.84)));
            yy = 0 + (((tickAnim - 23) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 28) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = -9.25 + (((tickAnim - 51) / 14) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 51) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(xx), throat1.rotateAngleY + (float) Math.toRadians(yy), throat1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 0) / 23) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 23) * (0-(1)));
            zz = 1 + (((tickAnim - 0) / 23) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 51) {
            xx = 1 + (((tickAnim - 23) / 28) * (1-(1)));
            yy = 0 + (((tickAnim - 23) / 28) * (0-(0)));
            zz = 1 + (((tickAnim - 23) / 28) * (1-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 51) / 14) * (1-(1)));
            yy = 0 + (((tickAnim - 51) / 14) * (1-(0)));
            zz = 1 + (((tickAnim - 51) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 51) {
            xx = 20.25 + (((tickAnim - 23) / 28) * (34.75-(20.25)));
            yy = 0 + (((tickAnim - 23) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 28) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 63) {
            xx = 34.75 + (((tickAnim - 51) / 12) * (0-(34.75)));
            yy = 0 + (((tickAnim - 51) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 13;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -29.08024 + (((tickAnim - 0) / 7) * (30.5-(-29.08024)));
            yy = -7.67994 + (((tickAnim - 0) / 7) * (0-(-7.67994)));
            zz = 1.73708 + (((tickAnim - 0) / 7) * (0-(1.73708)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 30.5 + (((tickAnim - 7) / 3) * (120.2518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250-(30.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (-3.21282-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (1.95681-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 120.2518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250 + (((tickAnim - 10) / 3) * (-29.08024-(120.2518+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-250)));
            yy = -3.21282 + (((tickAnim - 10) / 3) * (-7.67994-(-3.21282)));
            zz = 1.95681 + (((tickAnim - 10) / 3) * (1.73708-(1.95681)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 10.22036 + (((tickAnim - 0) / 7) * (33.25-(10.22036)));
            yy = 0.34802 + (((tickAnim - 0) / 7) * (0-(0.34802)));
            zz = -0.10029 + (((tickAnim - 0) / 7) * (0-(-0.10029)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 33.25 + (((tickAnim - 7) / 2) * (153.5176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-290-(33.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.087-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.02507-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 153.5176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-290 + (((tickAnim - 9) / 4) * (10.22036-(153.5176+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-290)));
            yy = 0.087 + (((tickAnim - 9) / 4) * (0.34802-(0.087)));
            zz = -0.02507 + (((tickAnim - 9) / 4) * (-0.10029-(-0.02507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 7) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.325-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.175-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 9) / 4) * (-0.4-(0.325)));
            zz = -0.175 + (((tickAnim - 9) / 4) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 14.5 + (((tickAnim - 0) / 7) * (-8.5-(14.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -8.5 + (((tickAnim - 7) / 2) * (-45.27-(-8.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -45.27 + (((tickAnim - 9) / 3) * (-186.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290-(-45.27)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -186.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290 + (((tickAnim - 12) / 1) * (14.5-(-186.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 3) * (-0.415-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = -0.415 + (((tickAnim - 3) / 4) * (0-(-0.415)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.85-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 9) / 3) * (0.85-(0.85)));
            zz = 0.475 + (((tickAnim - 9) / 3) * (0.475-(0.475)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.85 + (((tickAnim - 12) / 1) * (-0.625-(0.85)));
            zz = 0.475 + (((tickAnim - 12) / 1) * (0-(0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.35061 + (((tickAnim - 0) / 3) * (-18.89112-(4.35061)));
            yy = 7.07795 + (((tickAnim - 0) / 3) * (4.42545-(7.07795)));
            zz = -2.2587 + (((tickAnim - 0) / 3) * (-5.67439-(-2.2587)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.89112 + (((tickAnim - 3) / 2) * (35.49355-(-18.89112)));
            yy = 4.42545 + (((tickAnim - 3) / 2) * (1.77018-(4.42545)));
            zz = -5.67439 + (((tickAnim - 3) / 2) * (-2.26976-(-5.67439)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 35.49355 + (((tickAnim - 5) / 2) * (35.5-(35.49355)));
            yy = 1.77018 + (((tickAnim - 5) / 2) * (0-(1.77018)));
            zz = -2.26976 + (((tickAnim - 5) / 2) * (0-(-2.26976)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 35.5 + (((tickAnim - 7) / 2) * (73.05031-(35.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (3.53898-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-1.12935-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 73.05031 + (((tickAnim - 9) / 3) * (73.05031-(73.05031)));
            yy = 3.53898 + (((tickAnim - 9) / 3) * (3.53898-(3.53898)));
            zz = -1.12935 + (((tickAnim - 9) / 3) * (-1.12935-(-1.12935)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 73.05031 + (((tickAnim - 12) / 1) * (4.35061-(73.05031)));
            yy = 3.53898 + (((tickAnim - 12) / 1) * (7.07795-(3.53898)));
            zz = -1.12935 + (((tickAnim - 12) / 1) * (-2.2587-(-1.12935)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (1.055-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 1.055 + (((tickAnim - 1) / 2) * (-0.225-(1.055)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 6) * (1.305-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 6) * (0.3-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.305 + (((tickAnim - 9) / 3) * (1.305-(1.305)));
            zz = 0.3 + (((tickAnim - 9) / 3) * (0.3-(0.3)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 1.305 + (((tickAnim - 12) / 1) * (0-(1.305)));
            zz = 0.3 + (((tickAnim - 12) / 1) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.5 + (((tickAnim - 0) / 3) * (40.4768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(30.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.21282-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.95681-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 40.4768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 3) / 4) * (-29.08024-(40.4768+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 3.21282 + (((tickAnim - 3) / 4) * (7.67994-(3.21282)));
            zz = -1.95681 + (((tickAnim - 3) / 4) * (-1.73708-(-1.95681)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -29.08024 + (((tickAnim - 7) / 6) * (30.5-(-29.08024)));
            yy = 7.67994 + (((tickAnim - 7) / 6) * (0-(7.67994)));
            zz = -1.73708 + (((tickAnim - 7) / 6) * (0-(-1.73708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.25 + (((tickAnim - 0) / 3) * (-20.5324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-230-(33.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.087-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.02507-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -20.5324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-230 + (((tickAnim - 3) / 4) * (10.22036-(-20.5324+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*-230)));
            yy = -0.087 + (((tickAnim - 3) / 4) * (-0.34802-(-0.087)));
            zz = 0.02507 + (((tickAnim - 3) / 4) * (0.10029-(0.02507)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10.22036 + (((tickAnim - 7) / 6) * (33.25-(10.22036)));
            yy = -0.34802 + (((tickAnim - 7) / 6) * (0-(-0.34802)));
            zz = 0.10029 + (((tickAnim - 7) / 6) * (0-(0.10029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 7) / 6) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
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
            xx = -8.5 + (((tickAnim - 0) / 3) * (-45.27-(-8.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -45.27 + (((tickAnim - 3) / 2) * (-108.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290-(-45.27)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -108.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290 + (((tickAnim - 5) / 2) * (14.5-(-108.145+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*290)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 14.5 + (((tickAnim - 7) / 6) * (-8.5-(14.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.475-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 2) * (0.85-(0.85)));
            zz = 0.475 + (((tickAnim - 3) / 2) * (0.475-(0.475)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.85 + (((tickAnim - 5) / 2) * (-0.625-(0.85)));
            zz = 0.475 + (((tickAnim - 5) / 2) * (0-(0.475)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.625 + (((tickAnim - 7) / 6) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.5 + (((tickAnim - 0) / 3) * (73.05031-(35.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-3.53898-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (1.12935-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 73.05031 + (((tickAnim - 3) / 2) * (73.05031-(73.05031)));
            yy = -3.53898 + (((tickAnim - 3) / 2) * (-3.53898-(-3.53898)));
            zz = 1.12935 + (((tickAnim - 3) / 2) * (1.12935-(1.12935)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 73.05031 + (((tickAnim - 5) / 2) * (4.35061-(73.05031)));
            yy = -3.53898 + (((tickAnim - 5) / 2) * (-7.07795-(-3.53898)));
            zz = 1.12935 + (((tickAnim - 5) / 2) * (2.2587-(1.12935)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 4.35061 + (((tickAnim - 7) / 2) * (-19.81248-(4.35061)));
            yy = -7.07795 + (((tickAnim - 7) / 2) * (-4.38472-(-7.07795)));
            zz = 2.2587 + (((tickAnim - 7) / 2) * (4.67108-(2.2587)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -19.81248 + (((tickAnim - 9) / 3) * (40.81251-(-19.81248)));
            yy = -4.38472 + (((tickAnim - 9) / 3) * (-2.63083-(-4.38472)));
            zz = 4.67108 + (((tickAnim - 9) / 3) * (2.80265-(4.67108)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 40.81251 + (((tickAnim - 12) / 1) * (35.5-(40.81251)));
            yy = -2.63083 + (((tickAnim - 12) / 1) * (0-(-2.63083)));
            zz = 2.80265 + (((tickAnim - 12) / 1) * (0-(2.80265)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
            yy = 1.305 + (((tickAnim - 0) / 3) * (1.305-(1.305)));
            zz = 0.3 + (((tickAnim - 0) / 3) * (0.3-(0.3)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.1 + (((tickAnim - 3) / 2) * (-0.075-(-0.1)));
            yy = 1.305 + (((tickAnim - 3) / 2) * (1.305-(1.305)));
            zz = 0.3 + (((tickAnim - 3) / 2) * (0.3-(0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -0.075 + (((tickAnim - 5) / 2) * (0-(-0.075)));
            yy = 1.305 + (((tickAnim - 5) / 2) * (0-(1.305)));
            zz = 0.3 + (((tickAnim - 5) / 2) * (0-(0.3)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.055-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.055 + (((tickAnim - 8) / 0) * (0.875-(1.055)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.875 + (((tickAnim - 8) / 1) * (-0.15-(0.875)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.15 + (((tickAnim - 9) / 4) * (1.305-(-0.15)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.79007 + (((tickAnim - 0) / 3) * (30.64503-(11.79007)));
            yy = -2.01904 + (((tickAnim - 0) / 3) * (-1.00952-(-2.01904)));
            zz = 0.78095 + (((tickAnim - 0) / 3) * (0.39048-(0.78095)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 30.64503 + (((tickAnim - 3) / 2) * (30.64503-(30.64503)));
            yy = -1.00952 + (((tickAnim - 3) / 2) * (-1.00952-(-1.00952)));
            zz = 0.39048 + (((tickAnim - 3) / 2) * (0.39048-(0.39048)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 30.64503 + (((tickAnim - 5) / 2) * (0-(30.64503)));
            yy = -1.00952 + (((tickAnim - 5) / 2) * (0-(-1.00952)));
            zz = 0.39048 + (((tickAnim - 5) / 2) * (0-(0.39048)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (11.79007-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-2.01904-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.78095-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 3) * (0.145-(0.05)));
            zz = 0.15 + (((tickAnim - 0) / 3) * (0.22-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.145 + (((tickAnim - 3) / 2) * (0.145-(0.145)));
            zz = 0.22 + (((tickAnim - 3) / 2) * (0.22-(0.22)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.145 + (((tickAnim - 5) / 2) * (0-(0.145)));
            zz = 0.22 + (((tickAnim - 5) / 2) * (0-(0.22)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*2), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-130))*0.95);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-50))*1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-15-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -15 + (((tickAnim - 4) / 3) * (11.79007-(-15)));
            yy = 0 + (((tickAnim - 4) / 3) * (-2.01904-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0.78095-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 11.79007 + (((tickAnim - 7) / 2) * (30.64503-(11.79007)));
            yy = -2.01904 + (((tickAnim - 7) / 2) * (-1.00952-(-2.01904)));
            zz = 0.78095 + (((tickAnim - 7) / 2) * (0.39048-(0.78095)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 30.64503 + (((tickAnim - 9) / 3) * (30.64503-(30.64503)));
            yy = -1.00952 + (((tickAnim - 9) / 3) * (-1.00952-(-1.00952)));
            zz = 0.39048 + (((tickAnim - 9) / 3) * (0.39048-(0.39048)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 30.64503 + (((tickAnim - 12) / 1) * (0-(30.64503)));
            yy = -1.00952 + (((tickAnim - 12) / 1) * (0-(-1.00952)));
            zz = 0.39048 + (((tickAnim - 12) / 1) * (0-(0.39048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.15-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 2) * (0.145-(0.05)));
            zz = 0.15 + (((tickAnim - 7) / 2) * (0.22-(0.15)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.145 + (((tickAnim - 9) / 3) * (0.145-(0.145)));
            zz = 0.22 + (((tickAnim - 9) / 3) * (0.22-(0.22)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.145 + (((tickAnim - 12) / 1) * (0-(0.145)));
            zz = 0.22 + (((tickAnim - 12) / 1) * (0-(0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToes.rotationPointX = this.leftToes.rotationPointX + (float)(xx);
        this.leftToes.rotationPointY = this.leftToes.rotationPointY - (float)(yy);
        this.leftToes.rotationPointZ = this.leftToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-120))*-7), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*3), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-230))*-5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-100))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-280))*-6), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-150))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-350))*-8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-450))*5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-250))*15), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540))*3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-48))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+50))*-7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+90))*12), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+240))*18), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+90))*12), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540-50))*-4));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5+240))*18), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(11+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5))*10), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-3.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*12), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0.4);


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-230))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(15.25), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*540/0.5-150))*-8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMarshosaurus entity = (EntityPrehistoricFloraMarshosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*-3), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-10))*0.5);



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -17.25587 + (((tickAnim - 0) / 16) * (24.25-(-17.25587)));
            yy = -3.07144 + (((tickAnim - 0) / 16) * (0-(-3.07144)));
            zz = 4.02404 + (((tickAnim - 0) / 16) * (0-(4.02404)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 24.25 + (((tickAnim - 16) / 8) * (107.5635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140-(24.25)));
            yy = 0 + (((tickAnim - 16) / 8) * (-1.6381-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (2.14615-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 107.5635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140 + (((tickAnim - 24) / 6) * (-17.25587-(107.5635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140)));
            yy = -1.6381 + (((tickAnim - 24) / 6) * (-3.07144-(-1.6381)));
            zz = 2.14615 + (((tickAnim - 24) / 6) * (4.02404-(2.14615)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 3 + (((tickAnim - 0) / 16) * (14.75-(3)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.75 + (((tickAnim - 16) / 4) * (136.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140-(14.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 136.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140 + (((tickAnim - 20) / 10) * (3-(136.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-140)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 16) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.6-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-0.275-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 20) / 10) * (-0.2-(0.6)));
            zz = -0.275 + (((tickAnim - 20) / 10) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 11 + (((tickAnim - 0) / 16) * (0-(11)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (-208.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -208.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 24) / 6) * (11-(-208.63+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = -0.425 + (((tickAnim - 0) / 16) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 8) * (1.12-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0.4-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 1.12 + (((tickAnim - 24) / 6) * (-0.425-(1.12)));
            zz = 0.4 + (((tickAnim - 24) / 6) * (0-(0.4)));
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
            xx = 3.68887 + (((tickAnim - 0) / 8) * (-17.55792-(3.68887)));
            yy = 4.46014 + (((tickAnim - 0) / 8) * (2.90214-(4.46014)));
            zz = -2.72542 + (((tickAnim - 0) / 8) * (-2.10897-(-2.72542)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -17.55792 + (((tickAnim - 8) / 8) * (20.25-(-17.55792)));
            yy = 2.90214 + (((tickAnim - 8) / 8) * (0-(2.90214)));
            zz = -2.10897 + (((tickAnim - 8) / 8) * (0-(-2.10897)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 20.25 + (((tickAnim - 16) / 4) * (71.62202-(20.25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0.36483-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (-2.07405-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 71.62202 + (((tickAnim - 20) / 4) * (71.96553-(71.62202)));
            yy = 0.36483 + (((tickAnim - 20) / 4) * (0.84119-(0.36483)));
            zz = -2.07405 + (((tickAnim - 20) / 4) * (0.10033-(-2.07405)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 71.96553 + (((tickAnim - 24) / 6) * (3.68887-(71.96553)));
            yy = 0.84119 + (((tickAnim - 24) / 6) * (4.46014-(0.84119)));
            zz = 0.10033 + (((tickAnim - 24) / 6) * (-2.72542-(0.10033)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.8 + (((tickAnim - 0) / 5) * (0.025-(0.8)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 5) / 3) * (-0.25-(0.025)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 8) * (0.675-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.675 + (((tickAnim - 16) / 4) * (1.7-(0.675)));
            zz = 0 + (((tickAnim - 16) / 4) * (0.15-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 1.7 + (((tickAnim - 20) / 4) * (1.7-(1.7)));
            zz = 0.15 + (((tickAnim - 20) / 4) * (0.15-(0.15)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 1.7 + (((tickAnim - 24) / 6) * (0.8-(1.7)));
            zz = 0.15 + (((tickAnim - 24) / 6) * (0-(0.15)));
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
            xx = 24.25 + (((tickAnim - 0) / 8) * (23.9635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(24.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.0119-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.15385-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 23.9635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 8) / 6) * (-17.25587-(23.9635+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = -2.0119 + (((tickAnim - 8) / 6) * (3.07144-(-2.0119)));
            zz = -2.15385 + (((tickAnim - 8) / 6) * (-4.02404-(-2.15385)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -17.25587 + (((tickAnim - 14) / 16) * (24.25-(-17.25587)));
            yy = 3.07144 + (((tickAnim - 14) / 16) * (0-(3.07144)));
            zz = -4.02404 + (((tickAnim - 14) / 16) * (0-(-4.02404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 14.75 + (((tickAnim - 0) / 4) * (43.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80-(14.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 43.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80 + (((tickAnim - 4) / 10) * (3-(43.17+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-80)));
            yy = 0 + (((tickAnim - 4) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 10) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 3 + (((tickAnim - 14) / 16) * (14.75-(3)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0.375 + (((tickAnim - 8) / 15) * (0-(0.375)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
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
            xx = 20.25 + (((tickAnim - 0) / 4) * (71.66298-(20.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.45096-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (3.67546-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 71.66298 + (((tickAnim - 4) / 4) * (71.94009-(71.66298)));
            yy = 0.45096 + (((tickAnim - 4) / 4) * (0.82448-(0.45096)));
            zz = 3.67546 + (((tickAnim - 4) / 4) * (-1.64978-(3.67546)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 71.94009 + (((tickAnim - 8) / 6) * (3.68887-(71.94009)));
            yy = 0.82448 + (((tickAnim - 8) / 6) * (-4.46014-(0.82448)));
            zz = -1.64978 + (((tickAnim - 8) / 6) * (2.72542-(-1.64978)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 3.68887 + (((tickAnim - 14) / 9) * (-17.55792-(3.68887)));
            yy = -4.46014 + (((tickAnim - 14) / 9) * (-2.90214-(-4.46014)));
            zz = 2.72542 + (((tickAnim - 14) / 9) * (2.10897-(2.72542)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -17.55792 + (((tickAnim - 23) / 7) * (20.25-(-17.55792)));
            yy = -2.90214 + (((tickAnim - 23) / 7) * (0-(-2.90214)));
            zz = 2.10897 + (((tickAnim - 23) / 7) * (0-(2.10897)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 1.025 + (((tickAnim - 0) / 8) * (1.5-(1.025)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 1.5 + (((tickAnim - 8) / 6) * (0.85-(1.5)));
            zz = 0.3 + (((tickAnim - 8) / 6) * (0-(0.3)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0.85 + (((tickAnim - 14) / 5) * (0.325-(0.85)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.325 + (((tickAnim - 19) / 4) * (-0.225-(0.325)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.225 + (((tickAnim - 23) / 7) * (1.025-(-0.225)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
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
            xx = -21.75 + (((tickAnim - 0) / 4) * (33-(-21.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 33 + (((tickAnim - 4) / 8) * (-3.5-(33)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -3.5 + (((tickAnim - 12) / 2) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToes, rightToes.rotateAngleX + (float) Math.toRadians(xx), rightToes.rotateAngleY + (float) Math.toRadians(yy), rightToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 8) * (0.075-(-0.075)));
            zz = 0.2 + (((tickAnim - 0) / 8) * (0.275-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 4) * (0-(0.075)));
            zz = 0.275 + (((tickAnim - 8) / 4) * (0-(0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToes.rotationPointX = this.rightToes.rotationPointX + (float)(xx);
        this.rightToes.rotationPointY = this.rightToes.rotationPointY - (float)(yy);
        this.rightToes.rotationPointZ = this.rightToes.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*-3.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-40))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-60))*-2.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-300))*-3.5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*-3.5), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-3), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-20))*-1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*-2.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*1.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-220))*-2), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-1.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*-2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*-2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-380))*-2.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -21.75 + (((tickAnim - 16) / 4) * (33-(-21.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 33 + (((tickAnim - 20) / 8) * (-3.5-(33)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.5 + (((tickAnim - 28) / 2) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToes, leftToes.rotateAngleX + (float) Math.toRadians(xx), leftToes.rotateAngleY + (float) Math.toRadians(yy), leftToes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.2-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = -0.075 + (((tickAnim - 16) / 8) * (0.075-(-0.075)));
            zz = 0.2 + (((tickAnim - 16) / 8) * (0.275-(0.2)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 24) / 4) * (0-(0.075)));
            zz = 0.275 + (((tickAnim - 24) / 4) * (0-(0.275)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 8) * (-116.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -116.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 8) / 6) * (11-(-116.38+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 11 + (((tickAnim - 14) / 16) * (0-(11)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.895-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.895 + (((tickAnim - 8) / 6) * (-0.575-(0.895)));
            zz = 0.4 + (((tickAnim - 8) / 6) * (0-(0.4)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = -0.575 + (((tickAnim - 14) / 9) * (-0.445-(-0.575)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.445 + (((tickAnim - 23) / 7) * (0-(-0.445)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-220))*-2), leftArm1.rotateAngleY + (float) Math.toRadians(0), leftArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-1.5));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-220))*-2), rightArm1.rotateAngleY + (float) Math.toRadians(0), rightArm1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-90))*-1.5));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat1, throat1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-380))*-2.5), throat1.rotateAngleY + (float) Math.toRadians(0), throat1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*2), throat2.rotateAngleY + (float) Math.toRadians(0), throat2.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMarshosaurus e = (EntityPrehistoricFloraMarshosaurus) entity;
        animator.update(entity);

    }
}
