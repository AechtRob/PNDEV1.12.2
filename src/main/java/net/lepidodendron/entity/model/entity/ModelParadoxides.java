package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelParadoxides extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer CEPHALONSIDE1;
    private final AdvancedModelRenderer CEPHALONSIDE2;
    private final AdvancedModelRenderer CEPHALONSIDE3;
    private final AdvancedModelRenderer CEPHALONSIDE4;
    private final AdvancedModelRenderer CEPHALONSIDE5;
    private final AdvancedModelRenderer CEPHALONSIDE6;
    private final AdvancedModelRenderer LEFTSPINE;
    private final AdvancedModelRenderer RIGHTSPINE;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LEFTRIDGE1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer RIGHTRIDGE1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer LEFTRIDGE2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer RIGHTRIDGE2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer LEFTRIDGE3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer RIGHTRIDGE3;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer leftAntenna2;
    private final AdvancedModelRenderer rightAntenna2;

    public ModelParadoxides() {
        this.textureWidth = 36;
        this.textureHeight = 29;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 22.35F, -4.0F);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 21, -2.5F, -0.25F, -2.25F, 5, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 11, 15, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1658F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -1.5F, 0.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.CEPHALONSIDE1 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.head.addChild(CEPHALONSIDE1);
        this.setRotateAngle(CEPHALONSIDE1, 0.0F, 0.0F, 0.0873F);
        this.CEPHALONSIDE1.cubeList.add(new ModelBox(CEPHALONSIDE1, 16, 0, -0.5F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.CEPHALONSIDE2 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE2.setRotationPoint(0.5F, 1.0F, -4.0F);
        this.CEPHALONSIDE1.addChild(CEPHALONSIDE2);
        this.setRotateAngle(CEPHALONSIDE2, 0.0F, -0.4363F, 0.0F);
        this.CEPHALONSIDE2.cubeList.add(new ModelBox(CEPHALONSIDE2, 28, 5, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.CEPHALONSIDE3 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE3.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.CEPHALONSIDE2.addChild(CEPHALONSIDE3);
        this.setRotateAngle(CEPHALONSIDE3, 0.0F, -0.6283F, 0.0F);
        this.CEPHALONSIDE3.cubeList.add(new ModelBox(CEPHALONSIDE3, 9, 26, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.02F, false));
        this.CEPHALONSIDE3.cubeList.add(new ModelBox(CEPHALONSIDE3, 0, 0, 1.5F, -1.0F, 0.0F, 1, 1, 1, -0.03F, false));

        this.CEPHALONSIDE4 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE4.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.head.addChild(CEPHALONSIDE4);
        this.setRotateAngle(CEPHALONSIDE4, 0.0F, 0.0F, -0.0873F);
        this.CEPHALONSIDE4.cubeList.add(new ModelBox(CEPHALONSIDE4, 16, 0, -3.5F, 0.0F, -3.0F, 4, 1, 3, 0.0F, true));

        this.CEPHALONSIDE5 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE5.setRotationPoint(-0.5F, 1.0F, -4.0F);
        this.CEPHALONSIDE4.addChild(CEPHALONSIDE5);
        this.setRotateAngle(CEPHALONSIDE5, 0.0F, 0.4363F, 0.0F);
        this.CEPHALONSIDE5.cubeList.add(new ModelBox(CEPHALONSIDE5, 28, 5, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));

        this.CEPHALONSIDE6 = new AdvancedModelRenderer(this);
        this.CEPHALONSIDE6.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.CEPHALONSIDE5.addChild(CEPHALONSIDE6);
        this.setRotateAngle(CEPHALONSIDE6, 0.0F, 0.6283F, 0.0F);
        this.CEPHALONSIDE6.cubeList.add(new ModelBox(CEPHALONSIDE6, 9, 26, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.02F, true));
        this.CEPHALONSIDE6.cubeList.add(new ModelBox(CEPHALONSIDE6, 0, 0, -2.5F, -1.0F, 0.0F, 1, 1, 1, -0.03F, true));

        this.LEFTSPINE = new AdvancedModelRenderer(this);
        this.LEFTSPINE.setRotationPoint(4.5F, 0.75F, -1.0F);
        this.head.addChild(LEFTSPINE);
        this.setRotateAngle(LEFTSPINE, -0.0873F, 0.2182F, 0.0F);
        this.LEFTSPINE.cubeList.add(new ModelBox(LEFTSPINE, 11, 6, -2.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));

        this.RIGHTSPINE = new AdvancedModelRenderer(this);
        this.RIGHTSPINE.setRotationPoint(-4.5F, 0.75F, -1.0F);
        this.head.addChild(RIGHTSPINE);
        this.setRotateAngle(RIGHTSPINE, -0.0873F, -0.2182F, 0.0F);
        this.RIGHTSPINE.cubeList.add(new ModelBox(RIGHTSPINE, 11, 6, 0.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.75F, 1.0F, -2.5F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, -0.0512F, 0.8288F, -0.0112F);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 0, 0.0F, 0.1F, -1.0F, 5, 0, 5, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.75F, 1.0F, -2.5F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, -0.0512F, -0.8288F, 0.0112F);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 0, -5.0F, 0.1F, -1.0F, 5, 0, 5, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.head.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.2618F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 26, 10, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.head.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.2618F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 26, 10, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.3054F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 19, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.3054F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 19, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.15F, 0.0F);
        this.head.addChild(body1);
        this.setRotateAngle(body1, -0.1658F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 15, 21, -1.0F, -0.5F, -0.1F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 21, -1.0F, -1.1F, -0.1F, 2, 1, 3, -0.01F, false));

        this.LEFTRIDGE1 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE1.setRotationPoint(1.0F, 0.0F, 1.4F);
        this.body1.addChild(LEFTRIDGE1);
        this.setRotateAngle(LEFTRIDGE1, 0.0F, 0.0F, 0.3491F);
        this.LEFTRIDGE1.cubeList.add(new ModelBox(LEFTRIDGE1, 23, 18, -0.75F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.25F, 0.0F, -0.25F);
        this.LEFTRIDGE1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 21, 0.0F, 0.05F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.25F, 0.0F, -1.3F);
        this.LEFTRIDGE1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, 0.0F, 0.05F, -0.2F, 2, 0, 1, 0.0F, false));

        this.RIGHTRIDGE1 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE1.setRotationPoint(-1.0F, 0.0F, 1.4F);
        this.body1.addChild(RIGHTRIDGE1);
        this.setRotateAngle(RIGHTRIDGE1, 0.0F, 0.0F, -0.3491F);
        this.RIGHTRIDGE1.cubeList.add(new ModelBox(RIGHTRIDGE1, 23, 18, -1.25F, 0.0F, -1.5F, 2, 0, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.25F, 0.0F, -0.25F);
        this.RIGHTRIDGE1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 21, -1.0F, 0.05F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.25F, 0.0F, -1.3F);
        this.RIGHTRIDGE1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 0, -2.0F, 0.05F, -0.2F, 2, 0, 1, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 0.8F, 1.5F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0436F, 0.0F, 0.2443F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 19, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 0.8F, 1.5F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0436F, 0.0F, -0.2443F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 19, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0436F, 0.0F, 0.2182F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 0, 19, -0.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0436F, 0.0F, -0.2182F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 0, 19, -2.5F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.9F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 22, 12, -1.0F, -0.5F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -2.9F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 12, -1.0F, -1.1F, 2.9F, 2, 1, 3, 0.0F, false));

        this.LEFTRIDGE2 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE2.setRotationPoint(1.0F, 0.0F, 1.5F);
        this.body2.addChild(LEFTRIDGE2);
        this.setRotateAngle(LEFTRIDGE2, 0.0F, 0.0F, 0.3491F);
        this.LEFTRIDGE2.cubeList.add(new ModelBox(LEFTRIDGE2, 21, 5, 0.0F, 0.05F, -2.5F, 1, 0, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, 0.4F);
        this.LEFTRIDGE2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.4363F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 6, -0.2F, 0.1F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 0.0F, -0.85F);
        this.LEFTRIDGE2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.4363F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 8, 0.0F, 0.1F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.25F, 0.0F, -2.0F);
        this.LEFTRIDGE2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 12, -0.15F, 0.1F, 0.0F, 1, 0, 1, 0.0F, false));

        this.RIGHTRIDGE2 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE2.setRotationPoint(-1.0F, 0.0F, 1.5F);
        this.body2.addChild(RIGHTRIDGE2);
        this.setRotateAngle(RIGHTRIDGE2, 0.0F, 0.0F, -0.3491F);
        this.RIGHTRIDGE2.cubeList.add(new ModelBox(RIGHTRIDGE2, 21, 5, -1.0F, 0.05F, -2.5F, 1, 0, 4, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, 0.4F);
        this.RIGHTRIDGE2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 6, -0.8F, 0.1F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, -0.85F);
        this.RIGHTRIDGE2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.4363F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 8, -1.0F, 0.1F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.25F, 0.0F, -2.0F);
        this.RIGHTRIDGE2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4363F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 12, -0.85F, 0.1F, 0.0F, 1, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(0.0F, 0.7F, 1.6F);
        this.body2.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0436F, 0.0F, 0.2182F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 0, 19, -0.75F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(0.0F, 0.7F, 1.6F);
        this.body2.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0436F, 0.0F, -0.2182F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 0, 19, -2.25F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 23, 23, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, -5.9F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 23, -0.5F, -1.1F, 5.9F, 1, 1, 3, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 10, -0.5F, -0.05F, -0.5F, 1, 0, 1, 0.0F, false));

        this.LEFTRIDGE3 = new AdvancedModelRenderer(this);
        this.LEFTRIDGE3.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.body3.addChild(LEFTRIDGE3);
        this.setRotateAngle(LEFTRIDGE3, 0.0F, 0.0F, 0.3491F);
        this.LEFTRIDGE3.cubeList.add(new ModelBox(LEFTRIDGE3, 0, 25, -0.1F, -0.1F, -1.75F, 1, 0, 3, 0.0F, false));
        this.LEFTRIDGE3.cubeList.add(new ModelBox(LEFTRIDGE3, 0, 8, -0.5F, -0.08F, 1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.05F, -0.05F, 2.0F);
        this.LEFTRIDGE3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, -1.2217F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 13, -0.4F, 0.15F, -0.4F, 3, 0, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.45F, -0.05F, 1.25F);
        this.LEFTRIDGE3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.6981F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 3, 0.0F, 0.0F, -0.25F, 1, 0, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.9F, -0.05F, 0.25F);
        this.LEFTRIDGE3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.6109F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 6, -0.15F, 0.0F, -0.2F, 1, 0, 1, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.85F, -0.05F, -1.1F);
        this.LEFTRIDGE3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.5236F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 26, -0.8F, 0.0F, -0.1F, 2, 0, 1, 0.0F, false));

        this.RIGHTRIDGE3 = new AdvancedModelRenderer(this);
        this.RIGHTRIDGE3.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.body3.addChild(RIGHTRIDGE3);
        this.setRotateAngle(RIGHTRIDGE3, 0.0F, 0.0F, -0.3491F);
        this.RIGHTRIDGE3.cubeList.add(new ModelBox(RIGHTRIDGE3, 0, 25, -0.9F, -0.1F, -1.75F, 1, 0, 3, 0.0F, true));
        this.RIGHTRIDGE3.cubeList.add(new ModelBox(RIGHTRIDGE3, 0, 8, -0.5F, -0.08F, 1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.05F, -0.05F, 2.0F);
        this.RIGHTRIDGE3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3491F, 1.2217F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 13, -2.6F, 0.15F, -0.4F, 3, 0, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.45F, -0.05F, 1.25F);
        this.RIGHTRIDGE3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.6981F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 3, -1.0F, 0.0F, -0.25F, 1, 0, 1, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9F, -0.05F, 0.25F);
        this.RIGHTRIDGE3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.6109F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 6, -0.85F, 0.0F, -0.2F, 1, 0, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.85F, -0.05F, -1.1F);
        this.RIGHTRIDGE3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.5236F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 26, -1.2F, 0.0F, -0.1F, 2, 0, 1, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(0.0F, 0.6F, 0.1F);
        this.body3.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0436F, 0.0F, 0.2182F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 26, 10, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(0.0F, 0.6F, 0.1F);
        this.body3.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0436F, 0.0F, -0.2182F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 26, 10, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.0F, 0.55F, 1.6F);
        this.body3.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0436F, 0.0F, 0.2618F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 26, 10, -0.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(0.0F, 0.55F, 1.6F);
        this.body3.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0436F, 0.0F, -0.2618F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 26, 10, -1.5F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.leftAntenna2 = new AdvancedModelRenderer(this);
        this.leftAntenna2.setRotationPoint(0.5F, 0.45F, 2.0F);
        this.body3.addChild(leftAntenna2);
        this.setRotateAngle(leftAntenna2, 0.0F, 0.6109F, 0.0F);
        this.leftAntenna2.cubeList.add(new ModelBox(leftAntenna2, 0, 6, -1.0F, 0.05F, 0.0F, 2, 0, 6, 0.0F, false));

        this.rightAntenna2 = new AdvancedModelRenderer(this);
        this.rightAntenna2.setRotationPoint(-0.5F, 0.45F, 2.0F);
        this.body3.addChild(rightAntenna2);
        this.setRotateAngle(rightAntenna2, 0.0F, -0.6109F, 0.0F);
        this.rightAntenna2.cubeList.add(new ModelBox(rightAntenna2, 0, 6, -1.0F, 0.05F, 0.0F, 2, 0, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.head.offsetZ = -0.0F;
        this.head.offsetY = -0.11F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -0.45F;
        this.head.offsetX = 0.1F;
        this.head.rotateAngleX = (float)Math.toRadians(45);
        this.head.rotateAngleY = (float)Math.toRadians(220);
        this.head.rotateAngleZ = (float)Math.toRadians(-20);
        this.head.scaleChildren = true;
        float scaler = 1.13F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
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
        //this.head.offsetY = 0.95F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7};
        AdvancedModelRenderer[] bodyF = {this.body1,this.body2,this.body3};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.1F, 0.02F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.1F, 0.02f, -3, f2, 0F);
            this.bob(head, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.2F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.2F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.2F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.2F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.01F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.02f, -3, f2, 0.3F);
            this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(leftAntenna, 0.4F, -0.2F, true, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.4F, 0.2F, true, 0, 0.1F, f2, 0.8F);

        if (f3 != 0.0F) {
            this.swing(leftAntenna2, 0.6F, -0.4F, true, 0, 0.0F, f2, 0.6F);
            this.swing(rightAntenna2, 0.6F, 0.4F, true, 0, -0.0F, f2, 0.6F);
        }
    }
}
