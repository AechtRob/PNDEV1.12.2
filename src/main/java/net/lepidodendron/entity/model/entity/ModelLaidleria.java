package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGerrothorax;
import net.lepidodendron.entity.EntityPrehistoricFloraLaidleria;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLaidleria extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Laidleria;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    private ModelAnimator animator;

    public ModelLaidleria() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.Laidleria = new AdvancedModelRenderer(this);
        this.Laidleria.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -1.0F, 8.8F);
        this.Laidleria.addChild(hips);
        this.hips.cubeList.add(new ModelBox(hips, 0, 27, -5.0F, -1.0008F, -1.1992F, 10, 2, 3, 0.004F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.4F, -1.62F, -0.4F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2007F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 0, -4.4F, -0.0382F, 0.0027F, 8, 1, 2, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.8F, 1.0F, 0.8F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.1745F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 51, 55, -0.4695F, -1.0F, -1.1939F, 2, 1, 2, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3484F, 0.0F, -0.7182F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.2618F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 51, 44, -0.2684F, -0.9996F, -0.3963F, 2, 1, 2, -0.002F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.6074F, 0.0F, 0.6342F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.1745F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 26, 57, -0.5441F, -1.0F, -1.1109F, 2, 1, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.8F, 1.0F, 0.8F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.1745F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 51, 55, -1.5305F, -1.0F, -1.1939F, 2, 1, 2, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3484F, 0.0F, -0.7182F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.2618F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 51, 44, -1.7316F, -0.9996F, -0.3963F, 2, 1, 2, -0.002F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.6074F, 0.0F, 0.6342F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, -0.1745F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 26, 57, -1.4559F, -1.0F, -1.1109F, 2, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.4F, -1.0F, -0.4F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.4F, -0.92F, -15.9F, 14, 3, 16, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.5F, -13.6F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 20, -5.4F, -0.5F, -5.98F, 10, 2, 4, 0.002F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-5.5F, -0.9F, -5.9F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0557F, -0.3486F, -0.019F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 49, 0.1F, -0.12F, -0.08F, 2, 2, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.7F, -0.9F, -5.9F);
        this.chest.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0557F, 0.3486F, 0.019F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 49, -2.1F, -0.12F, -0.08F, 2, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4F, -0.9F, -5.9F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0524F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 23, -5.0F, -0.3F, -0.08F, 10, 2, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-5.6F, 0.8F, -5.9F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 50, 0.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.8F, 0.8F, -5.9F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 50, -4.0F, 0.0F, 0.0F, 4, 0, 4, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(5.2F, 1.5F, -3.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0F, -0.5236F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 51, 40, -1.7606F, -0.9998F, -0.761F, 5, 1, 2, -0.001F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(3.1792F, 0.0F, 0.9049F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.0F, 0.3927F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 56, 8, 0.0862F, -0.9994F, -1.7482F, 2, 1, 2, -0.003F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(1.9945F, 0.0F, -0.6613F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.1745F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 40, 50, -0.2105F, -1.0F, -1.1039F, 2, 1, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-6.0F, 1.5F, -3.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0F, 0.5236F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 51, 40, -3.2394F, -0.9998F, -0.761F, 5, 1, 2, -0.001F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-3.1792F, 0.0F, 0.9049F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.0F, -0.3927F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 56, 8, -2.0862F, -0.9994F, -1.7482F, 2, 1, 2, -0.003F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(-1.9945F, 0.0F, -0.6613F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.1745F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 40, 50, -1.7895F, -1.0F, -1.1039F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.3F, -5.9F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 23, 42, -4.8992F, -0.8992F, -1.6008F, 9, 2, 2, -0.004F, false));
        this.neck.cubeList.add(new ModelBox(neck, 38, 30, -4.9F, -0.1992F, -1.6008F, 9, 2, 2, -0.006F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-5.6F, 1.2F, 0.0F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, 0.0F, -0.11F, -1.6F, 1, 0, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(4.8F, 1.2F, 0.0F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6109F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 4, -1.0F, -0.11F, -1.6F, 1, 0, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.4F, -0.4F, -1.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 38, -5.0F, -0.8F, -2.0F, 10, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.8F, 1.2F, -2.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.0036F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 45, 4, 0.0F, -1.0F, 0.0F, 8, 1, 2, 0.001F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 5, 4.8F, -0.28F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 3, 6.74F, -0.52F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 20, 0.8F, -0.84F, 0.16F, 7, 1, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.8F, -0.08F, -2.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2836F, 0.9998F, 0.1294F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 48, 35, -1.9941F, -0.563F, -3.1695F, 6, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.8F, -0.08F, -2.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2836F, -0.9998F, -0.1294F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 35, -4.0059F, -0.563F, -3.1695F, 6, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.8F, 1.2F, -2.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.0036F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 20, -7.8F, -0.84F, 0.16F, 7, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 3, -5.8F, -0.28F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 5, -7.74F, -0.52F, 0.48F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 4, -8.0F, -1.0F, 0.0F, 8, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.4F, -8.96F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 42, 55, -0.5F, -0.2F, -0.18F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.02F, -0.0369F, -5.1041F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0999F, -0.0314F, 0.3039F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 0, -0.4F, -0.52F, -0.8F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.02F, -0.0369F, -5.1041F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0999F, 0.0314F, -0.3039F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 0, -0.6F, -0.52F, -0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -6.8F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1047F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 48, -1.5F, -0.22F, 0.0F, 3, 1, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 0, -0.5F, 0.0F, -9.04F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 25, 38, -5.0006F, -0.0006F, -1.9994F, 10, 1, 2, 0.003F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 47, -1.3994F, 0.0006F, -6.8006F, 3, 1, 5, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.2F, -0.4F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 43, -4.499F, -1.999F, -1.441F, 9, 2, 2, -0.005F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.8F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.0036F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 20, 0.8F, -1.16F, 0.16F, 7, 1, 0, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 48, 0.8F, -1.0F, 1.6F, 3, 1, 2, 0.001F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 33, 0.0004F, -1.0004F, 0.0004F, 8, 1, 2, 0.001F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(4.8F, 1.0F, -2.0F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -1.0036F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 20, -7.8F, -1.16F, 0.16F, 7, 1, 0, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 48, -3.8F, -1.0F, 1.6F, 3, 1, 2, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 33, -8.0004F, -1.0004F, 0.0004F, 8, 1, 2, 0.002F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 1.4F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 50, 20, -1.0F, 0.0F, -0.4F, 2, 1, 5, -0.002F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.4F, -0.1F, -0.4F);
        this.tail1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0604F, 0.5228F, -0.0302F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 21, 30, -2.5F, -0.4F, -0.4699F, 5, 1, 6, -0.002F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.4F, -0.1F, -0.4F);
        this.tail1.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0604F, -0.5228F, 0.0302F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 21, 30, -2.5F, -0.4F, -0.4699F, 5, 1, 6, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.4F, 0.6F);
        this.tail1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1222F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 11, -2.5F, 0.3F, -0.8F, 5, 2, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 55, -1.5F, 0.3F, 1.2F, 3, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.6F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 45, 8, -1.0F, 0.0004F, -0.8004F, 2, 1, 6, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 40, 42, -1.0F, -0.5996F, -0.8004F, 2, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, 0.0F, -2.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.4F, -0.1F, -5.0F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0557F, 0.3486F, -0.019F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 54, -1.7099F, -0.4002F, 4.6987F, 2, 1, 4, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.4F, -0.1F, -5.0F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0557F, -0.3486F, 0.019F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 54, -0.2901F, -0.4002F, 4.6987F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Laidleria.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Laidleria.offsetZ = -0.6F;
        this.Laidleria.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = -0.50F; //72

        EntityPrehistoricFloraLaidleria Gerrothorax = (EntityPrehistoricFloraLaidleria) e;


        float speed = 0.185F;
        if (Gerrothorax.getIsFast()) {
            speed = speed * 1.52F;
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2};

        boolean isAtBottom = Gerrothorax.isAtBottom();
        float bottomModifierTail = 1F;
        boolean atBottom = false;
        if (Gerrothorax.isReallyInWater() && isAtBottom && !Gerrothorax.getIsFast()) {
            //System.err.println("Animation at bottom");
            speed = 0.12F;
            bottomModifierTail = 0.3F;
            atBottom = true;
        }

        if (!Gerrothorax.isReallyInWater()) {//on land

            if (f3 == 0.0F || !Gerrothorax.getIsMoving()) { //Not moving
                return;
            }

            this.flap(leftLeg1, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(leftLeg1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(leftLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(leftLeg3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(rightLeg1, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(rightLeg1, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(rightLeg2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(rightLeg3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(leftArm1, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(leftArm1, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(leftArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(leftArm3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(rightArm1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(rightArm1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(rightArm2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(rightArm3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

            //this.body.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, -1.5F, f2, 1);

        }
        else {//in water
            speed = speed * 2F;

            if (!atBottom) {

                this.setRotateAngle(leftArm1, 0, -(float) Math.toRadians(42.5), -(float) Math.toRadians(10));
                this.setRotateAngle(rightArm1, 0, -(float) Math.toRadians(-42.5),-(float) Math.toRadians(-10));
                this.setRotateAngle(leftArm2, 0, -(float) Math.toRadians(17.5), 0);
                this.setRotateAngle(rightArm2, 0, -(float) Math.toRadians(-17.5), 0);
                this.setRotateAngle(leftArm3, 0, -(float) Math.toRadians(12.5), -0);
                this.setRotateAngle(rightArm3, 0, -(float) Math.toRadians(-12.5), 0);

                this.setRotateAngle(leftLeg1, 0, -(float) Math.toRadians(32.5), -(float) Math.toRadians(17));
                this.setRotateAngle(rightLeg1, (0), -(float) Math.toRadians(-32.5), -(float) Math.toRadians(-17));
                this.setRotateAngle(leftLeg2, (float) Math.toRadians(0), -(float) Math.toRadians(75), (float) Math.toRadians(0));
                this.setRotateAngle(rightLeg2, (float) Math.toRadians(0), -(float) Math.toRadians(-75), (float) Math.toRadians(0));
                this.setRotateAngle(leftLeg3, (float) Math.toRadians(0), -(float) Math.toRadians(7.5), (float) Math.toRadians(-0));
                this.setRotateAngle(rightLeg3, (float) Math.toRadians(0), -(float) Math.toRadians(-7.5), (float) Math.toRadians(0));

                AdvancedModelRenderer[] BackL = {this.leftLeg1, this.leftLeg2};
                AdvancedModelRenderer[] BackR = {this.rightLeg1, this.rightLeg2};
                AdvancedModelRenderer[] FrontL = {this.leftArm1, this.leftArm2};
                AdvancedModelRenderer[] FrontR = {this.rightArm1, this.rightArm2};

                this.chainSwingExtended(FrontL, speed * 0.85F, -0.2F, 0, 1F, f2, 1);
                this.chainSwingExtended(FrontR, speed * 0.85F, -0.2F, -2, 4F, f2, 1);
                this.chainSwingExtended(BackL, speed * 0.85F, -0.13F, -2, 1F, f2, 1);
                this.chainSwingExtended(BackR, speed * 0.85F, -0.13F, -2, 4F, f2, 1);


            }
            else if (f3 != 0 && Gerrothorax.getIsMoving()) {
                this.flap(leftLeg1, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
                this.swing(leftLeg1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(leftLeg2, speed, -0.6F, true, 5, 0F, f2, 0.8F);
                this.walk(leftLeg3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.flap(rightLeg1, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
                this.swing(rightLeg1, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(rightLeg2, speed, -0.6F, true, 8, 0F, f2, 0.8F);
                this.walk(rightLeg3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(leftArm1, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
                this.swing(leftArm1, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
                this.walk(leftArm2, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
                this.walk(leftArm3, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

                this.flap(rightArm1, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
                this.swing(rightArm1, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
                this.walk(rightArm2, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
                this.walk(rightArm3, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
                //this.bob(Mastodonsaurus, speed*2, 0.3F, false, f2, 1F);

                this.Laidleria.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.5), false, 0, f2, 1);

            }

            this.chainSwing(Tail, speed * bottomModifierTail, 0.6F * bottomModifierTail, -0.4, f2, 0.5F * bottomModifierTail);
            if (!atBottom) {
                this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            }
            else {
                this.swing(neck, speed * bottomModifierTail * 0.33F, 0.1F, false, 0, -0.05F, f2, 0.5F);
                if (((EntityPrehistoricFloraLaidleria) e).getAnimation() == ((EntityPrehistoricFloraLaidleria) e).ROAR_ANIMATION) {
                    this.swing(Laidleria, speed * bottomModifierTail, -0.6F * bottomModifierTail, false, 0, 0, f2, 0.5F * bottomModifierTail);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck, -(float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
